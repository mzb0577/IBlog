package com.mzb.myblog.apiController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mzb.myblog.domain.User;
import com.mzb.myblog.pojo.ResponseJson;
import com.mzb.myblog.service.UserService;

@Controller
@ResponseBody
@SuppressWarnings("all")
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ResponseJson getList(){
		List<User> list = userService.selectAll();
		
		return new ResponseJson(0,"success",list);
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseJson addUser(User user){
		int ret = userService.insert(user);
		if(ret == 0){
			return new ResponseJson(1,"failed",null);
		}
		return new ResponseJson(0,"success",null);
	}
}
