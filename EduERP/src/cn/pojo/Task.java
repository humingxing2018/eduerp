package cn.pojo;
/**
 * 任务实体类
 * @author cml、clq
 * 2018/1/17
 */
public class Task {
	private Integer id;		//任务id
	private String title;	//标题
	private String path;	//路径
	private Integer sortIdex;//优先级,显示的顺序

	//封装
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Integer getSortIdex() {
		return sortIdex;
	}
	public void setSortIdex(Integer sortIdex) {
		this.sortIdex = sortIdex;
	}
	
}
