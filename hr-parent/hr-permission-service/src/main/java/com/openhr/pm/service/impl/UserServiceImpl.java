package com.openhr.pm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.openhr.pm.entity.PmUser;
import com.openhr.pm.entity.PmUserExample;
import com.openhr.pm.entity.PmUserExample.Criteria;
import com.openhr.pm.mapper.PmUserMapper;
import com.openhr.pm.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	PmUserMapper userMapper;
	
	@Override
	public PageInfo<PmUser> queryByPage(String userName, Integer pageNo,Integer pageSize) {
	    pageNo = pageNo == null?1:pageNo;
	    pageSize = pageSize == null?10:pageSize;
	    PageHelper.startPage(pageNo, pageSize);
	    PmUserExample excExample = new PmUserExample();
	    Criteria criteria = excExample.createCriteria();
//	    criteria.andFnameEqualTo(userName);
	    List<PmUser> list = userMapper.selectByExample(excExample);
	    //用PageInfo对结果进行包装
	    PageInfo<PmUser> page = new PageInfo<PmUser>(list);
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
	public PmUser selectUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}  

}
