package com.anurag.dao;

import java.util.HashMap;

import com.anurag.bean.Admin;

public class AdminDao implements AdminDaoInt {
HashMap<Integer,Admin> hm=new HashMap();

public boolean addTest(Admin ad) {

	hm.put(ad.getTestid() ,ad);
	Admin e1=hm.get(ad.getTestid());
	if(e1==null) {
		return false;
		
	}else {
		return true;
	}
	// TODO Auto-generated method stub

}


public Admin deleteTest(int tid1) {
	return hm.remove(tid1);
}


public boolean addTest(String string) {
	// TODO Auto-generated method stub
	return false;
}


public boolean removeTest(String string) {
	// TODO Auto-generated method stub
	return false;
}}




	
 
	
	
	