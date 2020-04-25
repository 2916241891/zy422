package com.bw.zy422.dao;

import com.bw.zy422.model.UBVo;
import com.bw.zy422.model.Vo;

import java.util.List;

public interface UBVoMapper {
    List<UBVo> queryBookBorrowingList(String bookId);
}
