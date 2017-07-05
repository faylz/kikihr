package com.openhr.pm.service;

import com.github.pagehelper.PageInfo;
import com.openhr.pm.entity.PmUser;

public interface UserService {
	PmUser selectUserById(String id); 
	PageInfo<PmUser> queryByPage(String userName,Integer pageNo,Integer pageSize);
}
