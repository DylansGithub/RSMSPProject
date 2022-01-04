package cn.kang.rsmsp.system.position.pojo.entity;

import cn.kang.rsmsp.base.pojo.entity.BaseEntity;
import cn.kang.rsmsp.system.admin.pojo.entity.Admin;
import lombok.Data;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - 职务实体信息表</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  12:21
 * @since 1.0.0
 */
@Data
public class Position extends BaseEntity {
	private static final long serialVersionUID = -5026575483866277803L;
	private Long id;                                        //主键
	private String code;                                   //编码
	private String name;                                   //名称
	private List<Admin> adminList;                        //该职务所对应的人员列表
}
