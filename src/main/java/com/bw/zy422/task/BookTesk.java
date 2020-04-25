package com.bw.zy422.task;

import com.bw.zy422.dao.TBookMapper;
import com.bw.zy422.model.TBook;
import com.bw.zy422.model.TBookExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 张磊
 * 2020年4月25日18:56:44
 */
@Component
public class BookTesk {
    @Autowired
    TBookMapper tBookMapper;
    @Autowired
    private RedisTemplate redisTemplate;

    @Scheduled(cron = "0/10 * * * * ?") //每隔10秒，更新一下数据库中的点击量的数据
    public void updateRedisTraffic() {
        System.out.println("=============我去执行updateRedisTraffic================================");
        //得到当前库中所有的书籍
        List<TBook> books = tBookMapper.selectByExample(new TBookExample());
        //再循环，拿到书籍的id去redis查询点击量，并且同步更新到数据库中
        if(books!=null && books.size()>0){
            for (TBook book : books) {
                String id = book.getId();
                //判断id在redis是否存在
                Boolean aBoolean = redisTemplate.hasKey(id);
                if(aBoolean) { //如果当前key在redis是存在的，则去同步数据库
                    Integer count = (Integer) redisTemplate.opsForValue().get(id);
                    book.setTraffic(count);
                    //更新数据库
                    tBookMapper.updateByPrimaryKeySelective(book);
                }
            }
        }


    }

}

