package com.springframework.dependencyon;

/* Dependency-on :
   If one bean has a dependency on another bean called as depends-on concepts.
       Why?
If class A is depends on B, class B depends on class c then we should go for dependency on concepts. */

public class A {

	// Constructor

	public A() {

		System.out.println("Object-A");

	}

}
