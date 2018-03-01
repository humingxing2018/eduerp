package cn.pojo;

import java.io.Serializable;

/**
 * 机房信息表
 * @author 曾晨豪
 * 2018年2月3日11:37:20
 * */
public class ClassRoom extends PageSupport implements Serializable{
private static final long serialVersionUID = 1L;
private Integer id;//机房id
private String className;//机房名称
private Integer seats;//座位数
private Integer typeId;//机房类型

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getClassName() {
	return className;
}
public void setClassName(String className) {
	this.className = className;
}
public Integer getSeats() {
	return seats;
}
public void setSeats(Integer seats) {
	this.seats = seats;
}
public Integer getTypeId() {
	return typeId;
}
public void setTypeId(Integer typeId) {
	this.typeId = typeId;
}

}
