package com.mzb.myblog.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service; 

import com.mzb.myblog.domain.User;
import com.mzb.myblog.mapper.UserMapper;
import com.mzb.myblog.service.UserService;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User,Integer> implements UserService {
	
	@Autowired
	private UserMapper userMapper;	
	
	@Override	
	protected void initMapper() {
		mapper = this.userMapper;
	}

	@Override
	public int delete(Integer id) {
		//数据软删除
		User user = new User();
		user.setId(id);
		user.setIs_del(true);
		return userMapper.updateSelective(user);
	}
}
