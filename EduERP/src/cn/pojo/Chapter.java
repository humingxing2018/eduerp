package cn.pojo;
/**
 * 章节表
 * 尤瑞发
 */
public class Chapter {

	private Integer id; //ID
	private String chaId; //章节编码
	private String chaName; //章节名称
	private String chaNumber; //章节序号
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getChaId() {
		return chaId;
	}
	public void setChaId(String chaId) {
		this.chaId = chaId;
	}
	public String getChaName() {
		return chaName;
	}
	public void setChaName(String chaName) {
		this.chaName = chaName;
	}
	public String getChaNumber() {
		return chaNumber;
	}
	public void setChaNumber(String chaNumber) {
		this.chaNumber = chaNumber;
	}
}
