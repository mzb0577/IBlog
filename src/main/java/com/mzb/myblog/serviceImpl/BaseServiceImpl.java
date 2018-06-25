package com.mzb.myblog.serviceImpl;

import java.util.List;

import javax.annotation.PostConstruct;

import com.mzb.myblog.mapper.BaseMapper;
import com.mzb.myblog.service.BaseService;

public abstract class BaseServiceImpl<T,Pt> implements BaseService<T, Pt> {
	
	protected BaseMapper<T,Pt> mapper;
	
	@PostConstruct
	protected abstract void initMapper();

	public int delete(Pt id) {
		return mapper.delete(id);
	}

	public int insert(T t) {
		return mapper.insert(t);
	}

	public int insertSelective(T t) {
		return mapper.insertSelective(t);
	}

	public List<T> selectAll() {
		return mapper.selectAll();
	}

	public T selectById(Pt id) {
		return mapper.selectById(id);
	}

	public int updateSelective(T t) {
		return mapper.updateSelective(t);
	}

	public int update(T t) {
		return mapper.update(t);
	}

}
