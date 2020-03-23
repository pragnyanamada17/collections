package com.anurag.bean;

public class Admin {
    private int Testid;
    private String Testname;
	public int getTestid() {
		return Testid;
	}
	public void setTestid(int testid) {
		Testid = testid;
	}
	public String getTestname() {
		return Testname;
	}
	public void setTestname(String testname) {
		Testname = testname;
	}
	public Admin(int testid, String testname) {
		super();
		Testid = testid;
		Testname = testname;
	}
	@Override
	public String toString() {
		return "Admin [Testid=" + Testid + ", Testname=" + Testname + "]";
	}
}