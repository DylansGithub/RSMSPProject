package cn.kang.rsmsp.base.pojo.vo;
import java.io.Serializable;
import java.util.List;

/**
 * <b>智慧医疗信息平台 - 系统分页视图信息  </b>
 *<p>
 *     系统分页视图信息设置了如下属性：
 *     1.pageNum：当前页码
 *     2.pageSize:每页显示数量
 *     3.list:分页列表
 *     4.totalCount:总数量
 *     5.totalPage:总页数
 *     本项目所有功能分页信息都<b>必须以本系统分页视图信息进行封装</b>
 *</p>
 * @author Alex-Dylan
 * @version 1.0.0
 * @date created at 2021/12/30  22:55
 * @since 1.0.0
 */
public class PageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = -368543308183702727L;
	private Integer pageNum;                    //当前页码
	private Integer pageSize;                   //每页显示数量
	private List<E> list;                       //分页列表
	private Long totalCount;                    //总条数
	private Integer totalPage;                  //总页数

	public PageVO() {}

	public PageVO(Integer pageNum, Integer pageSize) {
		if(pageNum!=null && pageNum > 0){
			this.pageNum = pageNum;
		}else {
			this.pageNum = 1;
		}
		if(pageSize != null && pageSize > 0 ){
			this.pageSize = pageSize;
		}else {
			this.pageSize = 10;
		}
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}
