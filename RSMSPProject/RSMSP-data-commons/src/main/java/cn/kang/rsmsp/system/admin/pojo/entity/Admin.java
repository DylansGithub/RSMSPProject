package cn.kang.rsmsp.system.admin.pojo.entity;

import cn.kang.rsmsp.base.pojo.entity.BaseEntity;
import cn.kang.rsmsp.system.dictionary.pojo.entity.Education;
import cn.kang.rsmsp.system.dictionary.pojo.entity.Identity;
import cn.kang.rsmsp.system.hospitial.pojo.entity.Department;
import cn.kang.rsmsp.system.position.pojo.entity.Position;
import cn.kang.rsmsp.system.professional.pojo.entity.ProRank;
import cn.kang.rsmsp.system.professional.pojo.entity.ProTitle;
import lombok.Data;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统人员实体信息</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  9:43
 * @since 1.0.0
 */
@Data
public class Admin extends BaseEntity {
	private static final long serialVersionUID = 6273240690479493243L;
	private Long id;                                  //主键
	private Long no;                                  //工号
	private String name;                              //姓名
	private String cellphone;                          //手机号码
	private String password;                          //登录密码
	private Role role;                                //角色
	private Identity identity;                        //身份
	private Department department;                    //部门
	private ProTitle proTitle;                        //服务者专业技术职务（职称）
	private Education education;                      //学历
	private ProRank proRank;                          //服务者专业技术职务等级（职级）
	private List<Position> positionList;              //人员职务信息列表
}
