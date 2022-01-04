package cn.kang.rsmsp.system.dictionary.pojo.vo;

import cn.kang.rsmsp.base.pojo.vo.BaseVO;
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
public class DataCodeVO extends BaseVO {
	private static final long serialVersionUID = -4289085164340854827L;
	private Long idCode;                        //主键
	private DataCodeVO dataCode;                  //上级数据元
	private String code;                        //编码
	private String name;                        //名称
}
