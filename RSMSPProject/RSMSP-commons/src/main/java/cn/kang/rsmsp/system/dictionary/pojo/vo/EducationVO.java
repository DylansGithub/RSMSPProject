package cn.kang.rsmsp.system.dictionary.pojo.vo;

import cn.kang.rsmsp.base.pojo.vo.BaseVO;
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
public class EducationVO extends BaseVO {
	private static final long serialVersionUID = -3990525593129468317L;
	private Long id;                            //主键
	private String code;                        //编码
	private String name;                        //名称
}
