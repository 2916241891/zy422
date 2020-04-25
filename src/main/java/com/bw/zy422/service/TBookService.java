package com.bw.zy422.service;

import cn.hutool.core.util.RandomUtil;
import com.bw.zy422.dao.TBookMapper;
import com.bw.zy422.model.TBook;
import com.bw.zy422.model.TBookExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class TBookService {
    @Autowired
    TBookMapper mapper;

    public List<TBook> list(){
        TBookExample tbe = new TBookExample();
        List<TBook> list = mapper.selectByExample(tbe);
        return list;
    }

    @Transactional
    public int save(TBook tBook) {
        tBook.setId(RandomUtil.randomUUID().replace("-",""));
        tBook.setCreateTime(new Date());
        tBook.setBorrowingFlag("归还");//未借出
        tBook.setBorrowingCount(0);
        tBook.setTraffic(0);
        return mapper.insert(tBook);
    }

    public TBook queryBookInfo(String id) {
        TBook tBook = mapper.selectByPrimaryKey(id);
        return tBook;
    }
}
