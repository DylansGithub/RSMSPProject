package cn.kang.rsmsp.system.dictionary.pojo.vo;

import cn.kang.rsmsp.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 人员身份实体信息 </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  12:22
 * @since 1.0.0
 */
@Data
public class IdentityVO extends BaseVO {
	private static final long serialVersionUID = -1535531853967912970L;
	private Long id;                        //主键
	private String code;                    //编码
	private String name;                    //名称
}
