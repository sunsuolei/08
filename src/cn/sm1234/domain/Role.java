package cn.sm1234.domain;

import org.springframework.stereotype.Component;

@Component
public class Role {

	private Integer roleId;
	private String rname;
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", rname=" + rname + "]";
	}
	
}
