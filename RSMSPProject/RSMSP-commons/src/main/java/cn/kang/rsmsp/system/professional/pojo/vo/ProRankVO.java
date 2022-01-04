package cn.kang.rsmsp.system.professional.pojo.vo;

import cn.kang.rsmsp.base.pojo.vo.BaseVO;
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
public class ProRankVO extends BaseVO {
	private static final long serialVersionUID = 6012018306759488910L;
	private Long id;                        //主键
	private String code;                    //编码
	private String name;                    //名称
}
