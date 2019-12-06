package cn.sm1234.domain;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Fenye {

	private Integer page;
	private Integer pageSize;
	private Integer total;
	private List<Yg> rows;
	
	private Role role;
	
	//多条件
	private String min_ruzhi;
	private String max_ruzhi;
	
	
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	
	
	public String getMin_ruzhi() {
		return min_ruzhi;
	}
	public void setMin_ruzhi(String min_ruzhi) {
		this.min_ruzhi = min_ruzhi;
	}
	public String getMax_ruzhi() {
		return max_ruzhi;
	}
	public void setMax_ruzhi(String max_ruzhi) {
		this.max_ruzhi = max_ruzhi;
	}
	public List<Yg> getRows() {
		return rows;
	}
	public void setRows(List<Yg> rows) {
		this.rows = rows;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Fenye [page=" + page + ", pageSize=" + pageSize + ", total=" + total + ", rows=" + rows + ", role="
				+ role + ", min_ruzhi=" + min_ruzhi + ", max_ruzhi=" + max_ruzhi + "]";
	}
	
	
}
