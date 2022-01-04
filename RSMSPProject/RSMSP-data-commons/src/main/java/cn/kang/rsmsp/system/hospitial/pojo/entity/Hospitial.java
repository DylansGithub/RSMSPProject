package cn.kang.rsmsp.system.hospitial.pojo.entity;

import cn.kang.rsmsp.base.pojo.entity.BaseEntity;
import cn.kang.rsmsp.system.dictionary.pojo.entity.DataCode;
import cn.kang.rsmsp.system.dictionary.pojo.entity.Division;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 医院实体信息</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/4  9:45
 * @since 1.0.0
 */
@Data
public class Hospitial extends BaseEntity {
	private static final long serialVersionUID = -7691785032935078003L;
	private Long id;                            //主键
	private String name;                        //姓名
	private String authority;                   //上级主管机构名称
	private String orgcode;                     //组织机构代码
	private String charge;                      //机构负责人
	private DataCode dataCode;                  //表示地址类别的代码
	private Division provence;                  //所在省份
	private Division city;                      //所在城市
	private Division country;                   //所在区县
	private String town;                        //地址-乡（镇、街道办事处）
	private String village;                     //地址-村（街、路等）
	private String doorNot;                     //地址-门牌号码
	private Division zipCode;                   //邮政编码
	private Division divisionCode;              //行政区划代码
	private DataCode telephoneCat;              //联系电话-类别
	private String telephone;                   //联系电话-号码
	private String email;                       //电子邮件地址
}
