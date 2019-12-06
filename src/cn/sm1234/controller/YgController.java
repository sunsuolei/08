package cn.sm1234.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sm1234.domain.Fenye;
import cn.sm1234.domain.Role;
import cn.sm1234.service.YgService;

@Controller
public class YgController {

	@Autowired
	private YgService ygService; 
	
	@RequestMapping("/getYg")
	@ResponseBody
	public Fenye getYg(Integer page,Integer rows,String min_ruzhi,String max_ruzhi,Role role) {
		Fenye fenye =new Fenye();
		fenye.setPage((page-1)*rows);
		fenye.setPageSize(rows);
		fenye.setMin_ruzhi(min_ruzhi);
		fenye.setMax_ruzhi(max_ruzhi);
		fenye.setRole(role);
		fenye.setRows(ygService.selectYg(fenye));
		fenye.setTotal(ygService.selectYgCount(fenye));
		return fenye;
	}
}
