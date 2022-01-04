package cn.kang.rsmsp.system.professional.pojo.entity;

import cn.kang.rsmsp.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 专业职务类别实体信息</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  12:25
 * @since 1.0.0
 */
@Data
public class Procategory extends BaseEntity {
	private static final long serialVersionUID = -2760328092167462897L;
	private Long id;                        //主键
	private String code;                    //编码
	private String name;                    //名称
}
