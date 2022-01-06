package cn.kang.rsmsp.system.admin.pojo.vo;

import cn.kang.rsmsp.base.pojo.vo.BaseVO;
import cn.kang.rsmsp.system.dictionary.pojo.vo.EducationVO;
import cn.kang.rsmsp.system.dictionary.pojo.vo.IdentityVO;
import cn.kang.rsmsp.system.hospitial.pojo.vo.DepartmentVO;
import cn.kang.rsmsp.system.position.vo.PositionVO;
import cn.kang.rsmsp.system.professional.pojo.vo.ProRankVO;
import cn.kang.rsmsp.system.professional.pojo.vo.ProTitleVO;
import lombok.Data;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统用户实体信息</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  9:43
 * @since 1.0.0
 */
@Data
public class AdminVO extends BaseVO {
	private static final long serialVersionUID = 4573027278428240298L;
	private String id;                                  //主键
	private Long no;                                  //工号
	private String name;                              //姓名
	private String cellphone;                          //手机号码
	private String password;                          //登录密码
	private RoleVO role;                                //角色
	private IdentityVO identity;                        //身份
	private DepartmentVO department;                    //部门
	private ProTitleVO proTitle;                        //服务者专业技术职务（职称）
	private EducationVO education;                      //学历
	private ProRankVO proRank;                          //服务者专业技术职务等级（职级）
	private List<PositionVO> positionList;              //人员职务信息列表
}
