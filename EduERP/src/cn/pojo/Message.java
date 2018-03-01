package cn.pojo;

import java.util.Date;

/**
 * 新闻通知公告实体类
 * @author cml、clq
 * 2018/1/17
 */
public class Message {
	private Integer Id;			// ID
	private Integer allType;	//总类别
	private Integer childType;	//子类别
	private String mainTitle;	//主标题
	private String viceTitle;	//副标题
	private String provenance;	//出处
	private String newAuthor;	//原作者
	private Date releaseTime;	//发布时间
	private Integer releaseMan;	//发布人
	private Date modifyTime;	//修改时间
	private Integer modifyMan;	//修改人
	private String auditState;	//引用字典，审核状态1：已审核2：未审核
	private Integer auditMan;	//审核人ID
	private Date auditTime;		//审核时间

	//封装
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getAllType() {
		return allType;
	}
	public void setAllType(Integer allType) {
		this.allType = allType;
	}
	public Integer getChildType() {
		return childType;
	}
	public void setChildType(Integer childType) {
		this.childType = childType;
	}
	public String getMainTitle() {
		return mainTitle;
	}
	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}
	public String getViceTitle() {
		return viceTitle;
	}
	public void setViceTitle(String viceTitle) {
		this.viceTitle = viceTitle;
	}
	public String getProvenance() {
		return provenance;
	}
	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}
	public String getNewAuthor() {
		return newAuthor;
	}
	public void setNewAuthor(String newAuthor) {
		this.newAuthor = newAuthor;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public Integer getReleaseMan() {
		return releaseMan;
	}
	public void setReleaseMan(Integer releaseMan) {
		this.releaseMan = releaseMan;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Integer getModifyMan() {
		return modifyMan;
	}
	public void setModifyMan(Integer modifyMan) {
		this.modifyMan = modifyMan;
	}
	public String getAuditState() {
		return auditState;
	}
	public void setAuditState(String auditState) {
		this.auditState = auditState;
	}
	public Integer getAuditMan() {
		return auditMan;
	}
	public void setAuditMan(Integer auditMan) {
		this.auditMan = auditMan;
	}
	public Date getAuditTime() {
		return auditTime;
	}
	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}
	
}
