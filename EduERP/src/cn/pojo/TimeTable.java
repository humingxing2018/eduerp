package cn.pojo;

import java.sql.Date;

/**
 * 课表
 * @author CHX
 *2018/1/15
 */
public class TimeTable {
	private Integer titId;// 课程ID
	private String titName;// 课程名称
	private Integer userId;// 用户ID
	private Integer claId;// 班级ID
	private Integer subId;// 科目ID
	private Integer chpId;// 章节ID
	private Integer compId;// 机房ID
	private Date titTime;// 上课时间
	private Date creatTime;// 创建时间
	private String state;// 状态

	public Integer getTitId() {
		return titId;
	}

	public void setTitId(Integer titId) {
		this.titId = titId;
	}

	public String getTitName() {
		return titName;
	}

	public void setTitName(String titName) {
		this.titName = titName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getClaId() {
		return claId;
	}

	public void setClaId(Integer claId) {
		this.claId = claId;
	}

	public Integer getSubId() {
		return subId;
	}

	public void setSubId(Integer subId) {
		this.subId = subId;
	}

	public Integer getChpId() {
		return chpId;
	}

	public void setChpId(Integer chpId) {
		this.chpId = chpId;
	}

	public Integer getCompId() {
		return compId;
	}

	public void setCompId(Integer compId) {
		this.compId = compId;
	}

	public Date getTitTime() {
		return titTime;
	}

	public void setTitTime(Date titTime) {
		this.titTime = titTime;
	}

	public Date getCreatTime() {
		return creatTime;
	}

	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	// 无参构造函数
	public TimeTable() {
	}

	// 有参构造函数
	public TimeTable(Integer titId, String titName, Integer userId,
			Integer claId, Integer subId, Integer chpId, Integer compId,
			Date titTime, Date creatTime, String state) {
		this.titId = titId;
		this.titName = titName;
		this.userId = userId;
		this.claId = claId;
		this.subId = subId;
		this.chpId = chpId;
		this.compId = compId;
		this.titTime = titTime;
		this.creatTime = creatTime;
		this.state = state;
	}
}
