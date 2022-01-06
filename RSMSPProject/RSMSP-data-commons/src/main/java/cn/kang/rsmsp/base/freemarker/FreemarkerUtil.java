package cn.kang.rsmsp.base.freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;
import org.springframework.util.ResourceUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


/**
 * <b>智慧医疗信息平台 - 根据时给定实体类信息，生成实体类文件</b>
 *
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2022/1/5  23:03
 * @since 1.0.0
 */
public class FreemarkerUtil {
	public static  boolean createEntity(Entity entity){
		//1.创建Freemarker 的configuration对象
		Configuration configuration = new Configuration(Configuration.VERSION_2_3_31);
		try {
			//2.获得位于Resources路径下的freemarker文件
			String freemarkerpath = ResourceUtils.getURL("classpath:").getPath()+"freemarker";
			//3.设置所使用的Freemarker的模板所在的路径位置
			configuration.setDirectoryForTemplateLoading(new File(freemarkerpath));
			//生成目标文件的编码格式
			configuration.setDefaultEncoding("UTF-8");
			//4.设定所需要生成目标文件的Freemarker是哪个
			Template template = configuration.getTemplate("entity.ftl");
			//5.设定文件的目标生成路径
			//①获得位于resources 路径下的Freemarker文件
			String targetPath = ResourceUtils.getURL("classpath:").getPath();
			//②将获得的路径切换到src下
			targetPath = targetPath.substring(0,targetPath.indexOf("targer/classes/"));
			//③形成目标文件所在文件夹路径
			targetPath = targetPath + "src/main/java/";
			//④将对应的的包结构变为文件夹结构，连接到目标文件夹路径下
			targetPath = targetPath + entity.getPackageName().replace(".", "/")+"/";
			//6.根据路径和生成文件创建对应的File对象
			File targetFile = new File(targetPath+entity.getClassName() + ".java");
			//7.根据File创建BufferedWriter对象
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile));
			//8.使用Freemarker生成文件
			template.process(entity, bufferedWriter);
			//9.关闭字符输出流
			bufferedWriter.close();
			return true;
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}
}
