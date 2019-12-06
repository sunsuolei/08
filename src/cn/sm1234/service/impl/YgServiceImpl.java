package cn.sm1234.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.sm1234.dao.YgMapper;
import cn.sm1234.domain.Fenye;
import cn.sm1234.domain.Yg;
import cn.sm1234.service.YgService;

@Service
public class YgServiceImpl implements YgService{

	@Resource
	private YgMapper ygMapper;

	public List<Yg> selectYg(Fenye fenye) {
		return ygMapper.selectYg(fenye);
	}

	public Integer selectYgCount(Fenye fenye) {
		return ygMapper.selectYgCount(fenye);
	}
}
