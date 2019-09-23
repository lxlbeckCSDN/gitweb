package com.lxl.entity;

/**
 * @ClassName: Student
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author lxl
 * @date 2019年9月23日
 *
 */
public class Student {
	private int stuIdl;
	private String name;
	
	public static void main(String[] args) {
		
	}
	
	public void say(){
		System.out.println("呵呵");
	}
	
	public int getStuIdl() {
		return stuIdl;
	}
	public void setStuIdl(int stuIdl) {
		this.stuIdl = stuIdl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
