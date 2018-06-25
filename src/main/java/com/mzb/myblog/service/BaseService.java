package com.mzb.myblog.service;

import java.util.List;

public interface BaseService<T,Pt> {
	int delete(Pt id);

    int insert(T t);
    
    int insertSelective(T t);

    List<T> selectAll();

    T selectById(Pt id);
   
    int updateSelective(T t);

    int update(T t);
}
