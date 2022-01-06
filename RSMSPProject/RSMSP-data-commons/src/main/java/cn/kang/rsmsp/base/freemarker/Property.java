package cn.kang.rsmsp.base.freemarker;

/**
 * <b>智慧医疗信息平台 - </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/5  23:51
 * @since 1.0.0
 */
public class Property {
	private String type;                    //属性值
	private String name;                    //属性名
	private String comment;                 //数据注释

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
