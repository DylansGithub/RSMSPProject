package cn.kang.rsmsp.base.freemarker;

import java.io.Serializable;
import java.util.List;

/**
 * <b>智慧医疗信息平台 - </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/5  23:49
 * @since 1.0.0
 */
public class Entity implements Serializable {
	private static final long serialVersionUID = -8501506858426043659L;
	private String packageName;                         //实体类对应包名
	private String className;                           //实体类类名
	private List<Property> propertyList;                //实体类对应属性列表

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Property> getPropertyList() {
		return propertyList;
	}

	public void setPropertyList(List<Property> propertyList) {
		this.propertyList = propertyList;
	}
}
