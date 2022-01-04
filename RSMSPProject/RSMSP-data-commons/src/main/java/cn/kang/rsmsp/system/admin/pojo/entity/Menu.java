package cn.kang.rsmsp.system.admin.pojo.entity;

import cn.kang.rsmsp.base.pojo.entity.BaseEntity;
import lombok.Data;

import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统菜单功能实体信息 </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  9:43
 * @since 1.0.0
 */
@Data
public class Menu extends BaseEntity {
	private static final long serialVersionUID = 5552299042069532542L;
	private Long id;                            //主键
	private String code;                        //角色编码
	private Menu parent;                        //上级菜单
	private String text;                        //菜单文本
	private String url;                         //链接地址
	private String icon;                        //图标样式
	private Long sort;                          //排序
	private String name;                        //角色名称
	private List<Menu> childrenList;            //下级菜单列表
	private List<Role> roleList;                //菜单对应角色列表
}
