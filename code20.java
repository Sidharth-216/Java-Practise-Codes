/*Create a class Animal with a method sound(). 
  Create a class Dog that extends Animal and overrides sound() to print "Woof". 
  Create a class Cat that also extends Animal and prints "Meow".
  Write a main() method to test it.*/
  
 class Animal
 {
 	void sound()
 	{
 		System.out.println("different animal sounds:");
 	}
 
 class Dog extends Animal
 {
 	void sound()
 	{
 	
 		System.out.println("dog sounds:Woof");
 	}
 }
 class Cat extends Animal
 {
 	void sound()
 	{
 		System.out.println("cat sounds: Meow");	
 	}
 }
 public static void main (String []args)
 {
 	Animal am=new Animal();
 	am.sound();
 }
 }
 
