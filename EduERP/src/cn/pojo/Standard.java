package cn.pojo;

import java.sql.Date;

/**
 * 标准课程表
 * @author CHX
 *2018/1/15
 */
public class Standard {
	private Integer stdId;;// 标准课程编号
	private String stdName;// 标准课程名称
	private String typeId;// 标准课程类型
	private Date stdTime;// 标准课程创建时间
	private Date activeTime;// 标准课程生效时间

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	
     public Date getStdTime() {
		return stdTime;
	}

	public void setStdTime(Date stdTime) {
		this.stdTime = stdTime;
	}

	public Date getActiveTime() {
		return activeTime;
	}

	public void setActiveTime(Date activeTime) {
		this.activeTime = activeTime;
	}

	//无参构造函数
	public Standard(){}
	 //有参构造函数

	public Standard(Integer stdId, String stdName, String typeId,
			Date stdTime, Date activeTime) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.typeId = typeId;
		this.stdTime = stdTime;
		this.activeTime = activeTime;
	}
	
}

