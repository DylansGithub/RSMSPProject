package cn.kang.rsmsp.system.admin.pojo.vo;

import cn.kang.rsmsp.base.pojo.vo.BaseVO;
import lombok.Data;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统用户角色实体信息 </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  12:16
 * @since 1.0.0
 */
@Data
public class RoleVO extends BaseVO {
	private static final long serialVersionUID = 3839376024328616297L;
	private Long id;                            //主键
	private String code;                        //角色编码
	private String name;                        //角色名称
	private List<MenuVO> menuList;                //角色所对应的功能菜单
}
