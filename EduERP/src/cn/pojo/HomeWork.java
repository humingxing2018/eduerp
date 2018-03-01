package cn.pojo;

public class HomeWork {
	//作业情况表
	private int id;	//作业ID
	private int chpId;		//章节ID
	private String claId;		//班级ID
	private String type;		//作业类型
	private String completion;		//完成情况
	private int userId;		//用户ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getChpId() {
		return chpId;
	}
	public void setChpId(int chpId) {
		this.chpId = chpId;
	}
	public String getClaId() {
		return claId;
	}
	public void setClaId(String claId) {
		this.claId = claId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompletion() {
		return completion;
	}
	public void setCompletion(String completion) {
		this.completion = completion;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
