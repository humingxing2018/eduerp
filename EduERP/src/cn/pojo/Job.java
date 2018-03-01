package cn.pojo;
/**
 * 作业表
 * 尤瑞发
 */
public class Job {

	private Integer id; //ID
	private Integer jid; //作业类型
	private String chaNumber;  //章节序号
	private String jname; //作业名称
	public Integer getJid() {
		return jid;
	}
	public void setJid(Integer jid) {
		this.jid = jid;
	}
	public String getChaNumber() {
		return chaNumber;
	}
	public void setChaNumber(String chaNumber) {
		this.chaNumber = chaNumber;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
