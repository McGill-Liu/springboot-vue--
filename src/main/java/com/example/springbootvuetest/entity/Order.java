package com.example.springbootvuetest.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Date;

@Data
public class Order {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Date orderTime;
    private int total;
    private int uid;
}
