package com.openhr.pm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.openhr.pm.entity.User;
import com.openhr.pm.entity.UserExample;
import com.openhr.pm.entity.UserExample.Criteria;
import com.openhr.pm.mapper.UserMapper;
import com.openhr.pm.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper userMapper;
	
	@Override
	public PageInfo<User> queryByPage(String userName, Integer pageNo,Integer pageSize) {
	    pageNo = pageNo == null?1:pageNo;
	    pageSize = pageSize == null?10:pageSize;
	    PageHelper.startPage(pageNo, pageSize);
	    UserExample excExample = new UserExample();
	    Criteria criteria = excExample.createCriteria();
//	    criteria.andFnameEqualTo(userName);
	    List<User> list = userMapper.selectByExample(excExample);
	    //用PageInfo对结果进行包装
	    PageInfo<User> page = new PageInfo<User>(list);
	    //测试PageInfo全部属性
	    System.out.println(page.getPageNum());
	    System.out.println(page.getPageSize());
	    System.out.println(page.getStartRow());
	    System.out.println(page.getEndRow());
	    System.out.println(page.getTotal());
	    System.out.println(page.getPages());
	    System.out.println(page.getFirstPage());
	    System.out.println(page.getLastPage());
	    System.out.println(page.isHasPreviousPage());
	    System.out.println(page.isHasNextPage());
	    return page;
	}

	@Override
	public User selectUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}  

}
