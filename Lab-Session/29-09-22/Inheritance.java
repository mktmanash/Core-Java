

/*
 @author:MANASH KUMAR
 @date: 29 Sept 2022
 Ques1:create a class parent with default constructor and void sing method.print something inside the constructor and method
Create child class which will inherit the property of parent and has methods void speak and void dance.print something inside the two methods.
Create another class inheritance and object of class and call all the methods.also mention the type of inheritance on the top of the program.
 */
package manas;
class Parent {

	public void sing() {
		System.out.println("Singing");

	}

}
//create a child class which will inherits the property of parent class
class Child extends Parent{
	public void speak() {
		System.out.println("Speaking");
		
	}
	public void dance() {
		System.out.println("dancing");
		
	}
}

//Creating inheritance class and call all the methods 
public class Inheritance {
	public static void main(String[] args) {
		Child obj=new Child();
		obj.speak();
		obj.dance();
		obj.sing();
	}
}

