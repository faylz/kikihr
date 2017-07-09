package com.openhr.pm.service;

import com.github.pagehelper.PageInfo;
import com.openhr.pm.entity.User;

public interface UserService {
	User selectUserById(String id); 
	PageInfo<User> queryByPage(String userName,Integer pageNo,Integer pageSize);
}
