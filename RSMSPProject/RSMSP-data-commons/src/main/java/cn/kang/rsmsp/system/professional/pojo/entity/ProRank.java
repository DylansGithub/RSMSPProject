package cn.kang.rsmsp.system.professional.pojo.entity;

import cn.kang.rsmsp.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 专业职务等级信息表</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  12:27
 * @since 1.0.0
 */
@Data
public class ProRank extends BaseEntity {
	private static final long serialVersionUID = -4784851550219738722L;
	private Long id;                        //主键
	private String code;                    //编码
	private String name;                    //名称
}
