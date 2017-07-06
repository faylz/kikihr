package com.openhr.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
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
    @Test
    public void gen(){
    	
    	Map hashmap1 = new HashMap();
    	List list = new ArrayList();
    	hashmap1.put("class", "go.TreeModel");
    	hashmap1.put("nodeDataArray",list);
    	list.add(new Node(1,1+"","p"+1));
    	for(int i =2;i<1000;i++){
    		Node d = new Node(i,i+"","p"+i,1);
    		list.add(d);
    	}
    	
    	String a= JSON.toJSONString(hashmap1);
    	System.out.println(a);
    }
    
    class  Node{
    	int key;
		public Node(int key, String name, String position,int parent) {
			super();
			this.key = key;
			this.name = name;
			this.position = position;
			this.parent = parent;
		}
		public Node(int key, String name, String position) {
			super();
			this.key = key;
			this.name = name;
			this.position = position;
		}
		String name;
    	String position;
    	String childCont;
    	int parent;
    	Node(){
    		
    	}
    	public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public String getChildCont() {
			return childCont;
		}
		public void setChildCont(String childCont) {
			this.childCont = childCont;
		}
		public int getParent() {
			return parent;
		}
		public void setParent(int parent) {
			this.parent = parent;
		}
    }
    
}
