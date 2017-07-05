package com.openhr.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageInfo;
import com.openhr.pm.entity.PmUser;
import com.openhr.pm.service.UserService;

public class UserServiceTest extends SpringTestCase {

    @Autowired  
    private UserService userService; 

   
    @Test  
    public void queryByPageTest(){  
        PageInfo<PmUser> page =  userService.queryByPage(null, 1, 1);
        System.out.println(page);
    }
}