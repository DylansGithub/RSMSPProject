package cn.kang.rsmsp.base.freemarker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>智慧医疗信息平台 - </b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/6  0:34
 * @since 1.0.0
 */
public class FreemarkerEntity {
	public static void main(String[] args) {
		//1.获得数据库连接对象
		Connection connection = ConnectionUtil.getConnection();
		//2.设定需要执行的sql
		String sql = "select column_name,data_type,column_comment from information_schema.columns where table_schema='rsmsp_db' and table_name 'sys_role' order by ordinal_position asc;";
		try {
			//创建preparedStatement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//执行
			ResultSet resultSet = preparedStatement.executeQuery(sql);
			//循环结果集，创建Property类型的集合
			List<Property> propertyList = new ArrayList<Property>();
			while (resultSet.next()){
				//提取ResultSet中的数据
				String type = resultSet.getString("data_type");
				String name = resultSet.getString("column_name");
				String comment = resultSet.getString("column_comment");
				//将数据库中的数据类型转换为Java中的数据类型
				if("int".equalsIgnoreCase(type) ){
					 type = "Long";
				}else if("varchar".equalsIgnoreCase(type)){
					 type = "String";
				}else if("timestamp".equalsIgnoreCase(type)){
					type = "Date";
				}
				//创建property对象
				Property property = new Property();
				property.setType(type);
				property.setName(name);
				property.setComment(comment);
				//装入集合
				propertyList.add(property);
			}

			Entity entity = new Entity();
			entity.setPackageName("cn.kang.rsmsp.system.admin.pojo.entity");
			entity.setClassName("Role");
			entity.setPropertyList(propertyList);

			if(FreemarkerUtil.createEntity(entity)){
				System.out.println("目标文件生成成功");
			}else{
				System.out.println("目标文件生成失败");
			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
