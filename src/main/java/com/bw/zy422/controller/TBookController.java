package com.bw.zy422.controller;

import com.bw.zy422.filter.WebMvc;
import com.bw.zy422.model.TBook;
import com.bw.zy422.model.TUser;
import com.bw.zy422.model.Vo;
import com.bw.zy422.service.TBookService;
import com.bw.zy422.service.VoService;
import com.bw.zy422.utils.StaticFlag;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TBookController {
    @Autowired
    TBookService service;
    @Autowired
    VoService voService;

    /**
     * 书籍列表
     * @param model
     * @param request
     * @param ym
     * @return
     */
    @RequestMapping("list")
    public String list(Model model,Vo vo, HttpServletRequest request, @RequestParam(defaultValue =  "1")int ym){
        PageHelper.startPage(ym,3);
        List<Vo> list = voService.list(vo);
        PageInfo page = new PageInfo(list);

        TUser tu = (TUser) request.getSession().getAttribute("tu");

        model.addAttribute("page",page);
        model.addAttribute("list",list);
        model.addAttribute("tu",tu);
        return "list";
    }

    /**
     * 状态
     * @param id
     * @param borrowingFlag
     * @param userId
     * @return
     */
    @RequestMapping("flag")
    public String flag(String id,String borrowingFlag,String userId){
        System.out.println(id+"  "+borrowingFlag+" "+userId);
        int i = voService.flag(id,borrowingFlag,userId);
        return "redirect:/list";
    }

    @RequestMapping("tosave")
    public String tosave(){
        return "save";
    }

    @Value("${file.upload.path}")
    private String filePath;
    @RequestMapping("/save")
    public String save(@RequestParam("file") MultipartFile file, TBook tBook, Model model){
        if (file.getSize()>0){ //对图片 进行上传并且赋值
            String picUrl = StaticFlag.uploadUtils(file, filePath);
            System.out.println(picUrl);
            tBook.setPicUrl(picUrl);
        }

        int flag = service.save(tBook);
        if (flag>0){
            return "redirect:/list";
        }else{
            model.addAttribute("msg","添加失败");
            return "save";
        }
    }


    @Autowired
    RedisTemplate redisTemplate;
    /**
     * 点赞功能
     * @return
     */
    @RequestMapping("/updown")
    @ResponseBody
    public String updown(String id,HttpServletRequest request){
        TUser user = (TUser) request.getSession().getAttribute("tu");
        if(user!=null){
            Boolean aBoolean = redisTemplate.hasKey(user.getId() + "updown_" + id);
            System.out.println(user.getId() + "updown_" + id);
            if(!aBoolean){
                redisTemplate.opsForValue().increment(user.getId()+"updown_"+id,1);
                return "yes";//点赞成功
            }
            return "no";// 图片已经点赞，不能重复点击！
        }
        return "noLogin"; //没有登录，不能点赞
    }

    /**
     * 去统计点击量
     * @param bookId
     * @param model
     * @return
     */
    @RequestMapping("/toQueryBookInfo")
    public String toQueryBookInfo(String bookId,Model model){
        model.addAttribute("bookId",bookId) ;
        //统计点击量
        redisTemplate.opsForValue().increment(bookId,1); //完成点击量的加1
        return "book_info";
    }

    /**
     * 统计点击量
     * @param id
     * @return
     */
    @RequestMapping("/queryBookInfo")
    @ResponseBody
    public TBook queryBookInfo(String id){
        TBook tBook =  service.queryBookInfo(id);
        Boolean aBoolean = redisTemplate.hasKey(id);
        if(aBoolean){ //如果id存在redis中，则去获取他的点击量
            Integer  count = (Integer) redisTemplate.opsForValue().get(id);
            tBook.setTraffic(count); //赋值
        }else{ //如果不存在，则设置当前的点击量量为0
            tBook.setTraffic(0);
        }
        return tBook;
    }


}
