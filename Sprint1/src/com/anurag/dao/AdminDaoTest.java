package com.anurag.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdminDaoTest {
AdminDao dao=new AdminDao();
	
		AdminDao admindao = new AdminDao();
		@Test
		public void addTest() throws Exception {
			boolean result = admindao.addTest("xyz");
			if (result) {
				assertTrue(result);
			}
		}

		@Test
		public void removeTest() throws Exception {
			boolean result = admindao.removeTest("abcd");
			System.out.println(result);
			if (result) {
				assertFalse(result);
			}
	
	}
	void test() {
		fail("Not yet implemented");
		
	}

}
