package com.java.practise.self;

abstract class Test {

	abstract void m1();

	void m2() {
		System.out.println("m2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test() {
			void m1() {
				System.out.println("m1");
			}
		};
		
		t.m1();

	}

}
