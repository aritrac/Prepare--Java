/**
 * 
 * Question: Does JVM create object of class which contains main method?
 * Answer: The answer is no. JVM does not create the instance of the class in which we have defined the main method.
 * The example below will demonstrate this fact.
 * We are defining the main method in an abstract class which does not get instantiated but still the code within
 * main method will run. So this proves that the class was not instantiated.
 */
public abstract class Solution1 {
	public static void main(String[] args) {
		System.out.println("Aritra");
	}
}
