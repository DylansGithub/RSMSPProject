package ${packageName};

import cn.kang.rsmsp.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>智慧医疗信息平台 - 系统人员实体信息</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at DATE+CURRENTTIME
 * @since 1.0.0
 */
@Data
public class ${className} extends BaseEntity{
	<#list propertyList as property>
		private ${property.type} ${property.name}                           //${property.comment}
	</#list>
}