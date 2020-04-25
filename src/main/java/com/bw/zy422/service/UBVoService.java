package com.bw.zy422.service;

import com.bw.zy422.dao.UBVoMapper;
import com.bw.zy422.model.UBVo;
import com.bw.zy422.model.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UBVoService {
    @Autowired
    UBVoMapper mapper;

    public List<UBVo> queryBookBorrowingList(String bookId) {
        List<UBVo> list = mapper.queryBookBorrowingList(bookId);
        return list;
    }
}
