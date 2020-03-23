package com.anurag.service;

import java.util.HashMap;

import com.anurag.bean.Admin;
import com.anurag.dao.AdminDao;

public class AdminService implements AdminServiceimpl {
	AdminDao dao=new AdminDao();

	public boolean addTest(Admin tid) {
		// TODO Auto-generated method stub
		return dao.addTest(tid);
	}

	public Admin deleteTest(int tid1) {
		// TODO Auto-generated method stub
		return dao.deleteTest(tid1);
	}


	
}


	
	

	
