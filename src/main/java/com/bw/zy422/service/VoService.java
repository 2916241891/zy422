package com.bw.zy422.service;

import cn.hutool.core.util.RandomUtil;
import com.bw.zy422.dao.TBookMapper;
import com.bw.zy422.dao.TBorrowingBookMapper;
import com.bw.zy422.dao.VoMapper;
import com.bw.zy422.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VoService {
    @Autowired
    VoMapper voMapper;
    @Autowired
    TBookMapper mapper;
    @Autowired
    TBorrowingBookMapper tbbMapper;

    public List<Vo> list(Vo vo){
        List<Vo> list = voMapper.list(vo);
        return list;
    }

    public int flag(String id, String borrowingFlag,String userId) {
        TBook tBook = new TBook();
        tBook.setId(id);
        tBook.setBorrowingFlag(borrowingFlag);
        if(borrowingFlag.equals("借出")){
            TBook tb = mapper.selectByPrimaryKey(id);
            System.out.println(tb.getBorrowingCount());
            tBook.setBorrowingCount(tb.getBorrowingCount()+1);
        }
        int i = mapper.updateByPrimaryKeySelective(tBook);


        TBorrowingBook tbb = new TBorrowingBook();
        tbb.setId(RandomUtil.randomUUID().replace("-",""));
        tbb.setBorrowingTime(new Date());
        tbb.setBookId(id);
        tbb.setUserId(userId);
        int j = tbbMapper.save(tbb);
        return j;
    }
}
