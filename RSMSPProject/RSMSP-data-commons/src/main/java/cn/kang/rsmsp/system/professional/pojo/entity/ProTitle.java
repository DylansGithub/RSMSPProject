package cn.kang.rsmsp.system.professional.pojo.entity;

import cn.kang.rsmsp.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 专业职务实体信息</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  12:28
 * @since 1.0.0
 */
@Data
public class ProTitle extends BaseEntity {
	private static final long serialVersionUID = 7358521586526480077L;
	private Long id;                        //主键
	private Procategory category;           //所属类别
	private ProRank rank;                   //所属等级
	private String code;                    //编码
	private String name;                    //名称
}
