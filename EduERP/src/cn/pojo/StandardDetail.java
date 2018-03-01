package cn.pojo;
/**
 * 标准课程详情表
 * @author CHX
 *2018/1/15
 */
public class StandardDetail {
	private Integer sddId;// 标准课程详情ID
	private Integer chpId;// 章节编号
	private Integer stdId;// 标准课程编号

	public Integer getSddId() {
		return sddId;
	}

	public void setSddId(Integer sddId) {
		this.sddId = sddId;
	}

	public Integer getChpId() {
		return chpId;
	}

	public void setChpId(Integer chpId) {
		this.chpId = chpId;
	}

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	// 无参构造函数
	public StandardDetail() {
	}

	// 有参构造函数
	public StandardDetail(Integer sddId, Integer chpId, Integer stdId) {
		this.sddId = sddId;
		this.chpId = chpId;
		this.stdId = stdId;
	}
}
