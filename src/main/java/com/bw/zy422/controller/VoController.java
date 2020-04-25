package com.bw.zy422.controller;

import com.bw.zy422.model.UBVo;
import com.bw.zy422.model.Vo;
import com.bw.zy422.service.UBVoService;
import com.bw.zy422.service.VoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 张磊
 * 2020年4月24日21:39:33
 */
@Controller
public class VoController {
    @Autowired
    UBVoService service;

    /**
     * 模态框
     * @param bookId
     * @return
     */
    @RequestMapping("/modal")
    @ResponseBody
    public List<UBVo> modal(String bookId){
        List<UBVo> list =  service.queryBookBorrowingList(bookId);
        return list;
    }
}
