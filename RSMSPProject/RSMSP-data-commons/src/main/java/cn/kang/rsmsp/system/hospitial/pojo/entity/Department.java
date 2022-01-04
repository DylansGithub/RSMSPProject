package cn.kang.rsmsp.system.hospitial.pojo.entity;

import cn.kang.rsmsp.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 医院部门实体信息 </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  9:45
 * @since 1.0.0
 */
@Data
public class Department extends BaseEntity {
	private static final long serialVersionUID = -7326285385278712449L;
	private Long id;                                      //主键
	private String hospitial;                          //所在医院
	private String department;                        //上级部门
	private String code;                                  //部门编码
	private String name;                                  //部门名称
}
