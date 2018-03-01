package cn.pojo;

/**
 * 流程审核表
 * @author 吴乾煌 陈珍福
 *	2018-1-13 12:19:00
 */
public class Author {
	private Integer id; // 流程审核表
	private String aname; // 审核角色名称
	private Integer fldId; // 流程环节编号
	private Integer userId; // 审核用户ID
	private Integer roleId; // 审核角色ID

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Integer getFldId() {
		return fldId;
	}

	public void setFldId(Integer fldId) {
		this.fldId = fldId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	/**
	 * 无参构造函数
	 */
	public Author(){
		
	}
	/**
	 * 有参构造函数
	 */
	public Author(Integer id,String aname,Integer fldId,Integer userId,Integer roleId){
		this.id=id;
		this.aname=aname;
		this.fldId=fldId;
		this.userId=userId;
		this.roleId=roleId;
	}

}
