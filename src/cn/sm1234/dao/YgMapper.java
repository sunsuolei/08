package cn.sm1234.dao;

import java.util.List;

import cn.sm1234.domain.Fenye;
import cn.sm1234.domain.Yg;

public interface YgMapper {

	/**
	 * 多条件分页查询
	 * @param yg
	 * @return
	 */
	List<Yg> selectYg(Fenye fenye);
	/**
	 * 查询总条数
	 * @param yg
	 * @return
	 */
	Integer selectYgCount(Fenye fenye);
}
