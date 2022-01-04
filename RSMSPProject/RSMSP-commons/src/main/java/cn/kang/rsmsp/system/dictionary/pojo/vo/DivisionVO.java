package cn.kang.rsmsp.system.dictionary.pojo.vo;

import cn.kang.rsmsp.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 数据元行政区划实体信息</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  9:47
 * @since 1.0.0
 */
@Data
public class DivisionVO extends BaseVO {
	private static final long serialVersionUID = -1903296988290544254L;
	private Long id;                            //主键
	private DivisionVO division;                  //上级区划
	private String code;                        //编码
	private String name;                        //名称
}
