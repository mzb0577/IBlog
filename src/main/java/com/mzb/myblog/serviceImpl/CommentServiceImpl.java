package com.mzb.myblog.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mzb.myblog.domain.Comment;
import com.mzb.myblog.mapper.CommentMapper;
import com.mzb.myblog.service.CommentService;

@Service("commentService")
public class CommentServiceImpl extends BaseServiceImpl<Comment, Integer> implements CommentService {

	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	protected void initMapper() {
		mapper = this.commentMapper;
	}

}
