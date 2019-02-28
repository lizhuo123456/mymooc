package com.mymooc.common.pojo;

import java.io.Serializable;

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
public class Course implements Serializable{
	@TableId(type=IdType.AUTO)
	private Integer id;
	private String name;
	private String intro;
	private String simpintro;
	private Integer teacherId;
	private Integer categoryId;
	private Integer parentCatId;
	private Integer difficulty;
	private String img;
	private Integer price;
	
}
