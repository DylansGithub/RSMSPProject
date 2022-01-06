package cn.kang.rsmsp.util;

import cn.kang.rsmsp.system.admin.pojo.entity.Admin;
import cn.kang.rsmsp.system.admin.pojo.vo.AdminVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * <b>智慧医疗信息平台 - </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/6  15:43
 * @since 1.0.0
 */
@Mapper(componentModel = "spring")
public interface PojoMapper {
	PojoMapper INSTANCE = Mappers.getMapper(PojoMapper.class);

	/**
	 * <b>将实体对象转换为视图对象</b>
	 * @param entity
	 * @return
	 */
	AdminVO entityParseToVO (Admin entity);

}
