package com.mzb.myblog.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzb.myblog.domain.Blog;
import com.mzb.myblog.mapper.BlogMapper;
import com.mzb.myblog.service.BlogService;

@Service("blogService")
public class BlogServiceImpl extends BaseServiceImpl<Blog, Integer> implements BlogService {

	@Autowired
	private BlogMapper blogMapper;
	
	@Override
	protected void initMapper() {
		mapper = this.blogMapper;
	}

}
