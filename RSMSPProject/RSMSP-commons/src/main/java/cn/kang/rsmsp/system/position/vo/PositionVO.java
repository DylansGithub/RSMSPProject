package cn.kang.rsmsp.system.position.vo;

import cn.kang.rsmsp.base.pojo.vo.BaseVO;
import cn.kang.rsmsp.system.admin.pojo.vo.AdminVO;
import lombok.Data;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - 人员职务实体信息表</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  12:21
 * @since 1.0.0
 */
@Data
public class PositionVO extends BaseVO {
	private static final long serialVersionUID = -2579966333854357583L;
	private Long id;                                        //主键
	private String code;                                   //编码
	private String name;                                   //名称
	private List<AdminVO> adminList;                        //该职务所对应的人员列表
}
