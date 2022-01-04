package cn.kang.rsmsp.system.professional.pojo.vo;

import cn.kang.rsmsp.base.pojo.vo.BaseVO;
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
public class ProTitleVO extends BaseVO {
	private static final long serialVersionUID = 5709446648348171518L;
	private Long id;                        //主键
	private ProcategoryVO category;           //所属类别
	private ProRankVO rank;                   //所属等级
	private String code;                    //编码
	private String name;                    //名称
}
