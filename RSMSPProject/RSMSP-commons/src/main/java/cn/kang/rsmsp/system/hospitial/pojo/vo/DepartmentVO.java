package cn.kang.rsmsp.system.hospitial.pojo.vo;

import cn.kang.rsmsp.base.pojo.vo.BaseVO;
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
public class DepartmentVO extends BaseVO {
	private static final long serialVersionUID = -282767014081131691L;
	private Long id;                                      //主键
	private HospitialVO hospitial;                          //所在医院
	private DepartmentVO department;                        //上级部门
	private String code;                                  //部门编码
	private String name;                                  //部门名称
}
