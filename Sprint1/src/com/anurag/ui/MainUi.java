package com.anurag.ui;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.anurag.bean.Admin;
import com.anurag.service.AdminService;
import com.anurag.service.AdminServiceimpl;

public class MainUi {

static AdminService service=new AdminService();
public static void main(String[] args){
	String loginId = "";
	String pwd = "";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Login Id");
	
	loginId = sc.next();
	System.out.println("Enter pwd");
	pwd = sc.next();
	int a = 0;
	int b = 0;
	if ((loginId.equals("pragnya") && pwd.equals("pragnya123"))
			|| (loginId.equals("harini") && pwd.equals("harini123"))
			|| (loginId.equals("madhuri") && pwd.equals("madhuri123"))) {
	while(true){
		System.out.println("1.Add Test");
		System.out.println("2.Delete test");
		System.out.println("3.exit");
		
		int ch=sc.nextInt();
	switch(ch){
	case 1:{
		System.out.println("enter test id");
		try {
		int tid=sc.nextInt();
		System.out.println("enter test name");
		String tname=sc.next();
		
		Admin emp=new Admin(tid,tname);
		boolean res=service.addTest(emp);
		if(res==true){
			System.out.println("your Test is added..!");
		}else{
			System.out.println("not added");
		}}catch (InputMismatchException e) {
			System.out.println("Enter only integer");
		}
	}
	break;
	case 2:{
		System.out.println("enter test id");
		try {
		int tid1=sc.nextInt();
		Admin resl=service.deleteTest(tid1);
		if(resl==null){
			System.out.println("deleted");
		}else
		{
			System.out.println(resl);
		}}
		
		catch (InputMismatchException e) {
			System.out.println("Enter only integer");
		
	}}
	
	break;
	case 3:
		System.out.println("thankyou");
		System.exit(0);
		}}}}}
	
	
	
	