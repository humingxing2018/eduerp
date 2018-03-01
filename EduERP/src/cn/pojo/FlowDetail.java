package cn.pojo;
/**
 * 流程详情表
 * @author 吴乾煌 陈珍福
 * 2018-1-13 12:30:00
 */
public class FlowDetail {
	private Integer fldId; // 流程详情表ID
	private Integer fliId; // 流程主表ID
	private String fldName; // 流程环节名称
	private String dictCode; // 流程环节状态
	private Integer userId; // 审核人ID

	public Integer getFldId() {
		return fldId;
	}

	public void setFldId(Integer fldId) {
		this.fldId = fldId;
	}

	public Integer getFliId() {
		return fliId;
	}

	public void setFliId(Integer fliId) {
		this.fliId = fliId;
	}

	public String getFldName() {
		return fldName;
	}

	public void setFldName(String fldName) {
		this.fldName = fldName;
	}

	public String getDictCode() {
		return dictCode;
	}

	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 无参构造函数
	 */
	public FlowDetail(){
		
	}
	/**
	 * 有参构造函数
	 */

	public FlowDetail(Integer fldId, Integer fliId, String fldName,
			String dictCode, Integer userId) {
		this.fldId = fldId;
		this.fliId = fliId;
		this.fldName = fldName;
		this.dictCode = dictCode;
		this.userId = userId;
	}
	
}
