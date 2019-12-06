package cn.sm1234.domain;

import org.springframework.stereotype.Component;

@Component
public class Yg {

	private Integer yid;
	private String yname;
	private String ruzhi;
	private Role role;
	public Integer getYid() {
		return yid;
	}
	public void setYid(Integer yid) {
		this.yid = yid;
	}
	public String getYname() {
		return yname;
	}
	public void setYname(String yname) {
		this.yname = yname;
	}
	
	public String getRuzhi() {
		return ruzhi;
	}
	public void setRuzhi(String ruzhi) {
		this.ruzhi = ruzhi;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Yg [yid=" + yid + ", yname=" + yname + ", ruzhi=" + ruzhi + ", role=" + role + "]";
	}
	
	
	
}
