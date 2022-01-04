package cn.kang.rsmsp.base.pojo.vo;


import java.io.Serializable;
import java.util.Date;

/**
 * <b>智慧医疗信息平台 - 基础视图信息</b>
 *<p>
 *     基础视图信息设定了如下属性：
 *     1.status：系统状态<br/>
 *     2.createdBy：创建人<br/>
 *     3.createTime:创建时间<br/>
 *     4.modifiedBy:修改人<br/>
 *     5.modifiedTime：修改时间<br/>
 *     本项目所有功能视图信息<b>都必须继承于本基础视图信息</b>
 *</p>
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2021/12/30  21:44
 * @since 1.0.0
 */
public class BaseVO implements Serializable {
	private static final long serialVersionUID = -4940186004294514251L;
	private String status;                  //系统状态：0-禁用，1-启用
	private String createdBy;               //创建人
	private Date createTime;                //创建时间
	private String modifiedBy;             // 修改人
	private Date modifiedTime;             // 修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
