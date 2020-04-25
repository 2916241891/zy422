package com.bw.zy422.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Vo extends TBook{
    private Date borrowingNewTime ;

    private String flag;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm") //用于接收参数使用
    private Date startTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm") //用于接收参数使用
    private Date endTime;
}
