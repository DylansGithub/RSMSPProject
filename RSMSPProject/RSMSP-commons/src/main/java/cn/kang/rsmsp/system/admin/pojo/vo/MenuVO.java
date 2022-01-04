package cn.kang.rsmsp.system.admin.pojo.vo;

import cn.kang.rsmsp.base.pojo.vo.BaseVO;
import lombok.Data;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  9:43
 * @since 1.0.0
 */
@Data
public class MenuVO extends BaseVO {
	private static final long serialVersionUID = 2018904382867746022L;
	private Long id;                            //主键
	private String code;                        //角色编码
	private MenuVO parent;                        //上级菜单
	private String text;                        //菜单文本
	private String url;                         //链接地址
	private String icon;                        //图标样式
	private Long sort;                          //排序
	private String name;                        //角色名称
	private List<MenuVO> childrenList;            //下级菜单列表
	private List<RoleVO> roleList;                //菜单对应角色列表
}
