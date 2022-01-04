package cn.kang.rsmsp.system.dictionary.pojo.entity;

import cn.kang.rsmsp.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 学历实体信息</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2021/1/4  9:48
 * @since 1.0.0
 */
@Data
public class Education extends BaseEntity {
	private static final long serialVersionUID = 6750720712000189924L;
	private Long id;                            //主键
	private String code;                        //编码
	private String name;                        //名称
}
