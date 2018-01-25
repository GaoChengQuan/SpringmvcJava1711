package com.situ.ssm.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.situ.ssm.entity.Banji;
import com.situ.ssm.mapper.BanjiMapper;
import com.situ.ssm.service.IBanjiService;
import com.situ.ssm.util.MyBatisUtil;

public class BanjiServiceImpl implements IBanjiService {
	private BanjiMapper banjiMapper;
	
	public BanjiServiceImpl() {
		SqlSession session = MyBatisUtil.getSqlSession();
		banjiMapper = session.getMapper(BanjiMapper.class);
	}

	@Override
	public List<Banji> findAll() {
		return banjiMapper.findAll();
	}

}
