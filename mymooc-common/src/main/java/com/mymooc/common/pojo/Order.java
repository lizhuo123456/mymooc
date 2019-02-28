package com.mymooc.common.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
@ToString
@TableName
public class Order implements Serializable{
	@TableId(type=IdType.AUTO)
	private Integer id;
	private String orderCode;
	private Date createdTime;
	private Date payTime;
	private Integer state;
	private Integer userId;
	private Integer price;
}
