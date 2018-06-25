package com.mzb.myblog.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzb.myblog.domain.Category;
import com.mzb.myblog.mapper.CategoryMapper;
import com.mzb.myblog.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category, Integer> implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	protected void initMapper() {
		mapper = this.categoryMapper;
	}

}
