package com.bw.zy422.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class UBVo {
    private String id;
    private String bookId;
    private String userId;

    private String bookName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date borrowingTime;

    private String loginName;

    @Override
    public String toString() {
        return "UBVo{" +
                "id='" + id + '\'' +
                ", bookId='" + bookId + '\'' +
                ", userId='" + userId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", borrowingTime=" + borrowingTime +
                ", loginName='" + loginName + '\'' +
                '}';
    }
}
