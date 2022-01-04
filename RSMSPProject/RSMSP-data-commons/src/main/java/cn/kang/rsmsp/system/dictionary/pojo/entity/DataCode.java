package cn.kang.rsmsp.system.dictionary.pojo.entity;

import cn.kang.rsmsp.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 数据元值域代码实体信息 </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  9:46
 * @since 1.0.0
 */
@Data
public class DataCode extends BaseEntity {
	private static final long serialVersionUID = -6643347928470596466L;
	private Long idCode;                        //主键
	private DataCode dataCode;                  //上级数据元
	private String code;                        //编码
	private String name;                        //名称
}
