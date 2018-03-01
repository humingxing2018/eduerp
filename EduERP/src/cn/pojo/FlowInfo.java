package cn.pojo;
/**
 * 流程主表
 * @author 吴乾煌 陈珍福
 * 2018-1-13 12:45:00
 */
public class FlowInfo {
	private Integer fliId; // 流程主表ID
	private String lname; // 流程主表名称
	private String dictCode;// 流程环节状态

	public Integer getFliId() {
		return fliId;
	}

	public void setFliId(Integer fliId) {
		this.fliId = fliId;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDictCode() {
		return dictCode;
	}

	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}
	/**
	 * 无参构造函数
	 */
	public FlowInfo(){
		
	}
	/**
	 * 有参构造函数
	 */
	public FlowInfo(Integer fliId,String lname,String dictCode){
		this.fliId=fliId;
		this.lname=lname;
		this.dictCode=dictCode;
	}
}
