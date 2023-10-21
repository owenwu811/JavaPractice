// primitive vs. references datatypes:
// primitive datatypes: boolean, int, double, char (single character vs. string!!!)
// reference datatypes: string

//illustrate char vs. String datatype

char studentFirstInitiail = 'K';
String studentName = "Kayla Hammon"; 

//charAt:

String studentFirstName = "Kayla";
char studentFirstInitial = studentFirstName.charAt(0);
System.out.println(studentFirstInitial);

output: K

//string concatenation example:

String studentFirstName = "Kayla";
String studentLastName = "Hammon";
System.out.println(studentFirstName + " " + studentLastName); // without the " ", the two names wouldn't have a space in between in the console output

//How to get input and output from the user in Java:

import java.util.Scanner; // this goes at top of file
Scanner input = new Scanner(System.in); // Scanner is a datatype and tool in java that lets us get user input

//In Java, every class has a constructor - it is used to differentiate between attributes of one object vs. another?

//You have created an Animal class with an Animal instance named favorite Animal. You want to access its species instance variable. How do you accomplish this?
//anwser: favorite Animal.species;

//What does a constructor return?
//anwser: an instance of its class

//Zanya wants her circle objects to have a certain fill color as soon as they are instantiated. How can she do this in her code?
// create a circle constructor that accepts a fill color as a parameter

//How are individual instances created from the constructor related to one another?
// they are not related

//A constructor in java is a special method inside each class that creates and intialized instance objects
// we will use a constructor in the triangle class to construct and initialize triangle instances 
// a constructor may or may not take inputs
// a constructor always returns an instance of the class its in - for example, a constructor in the Triangle class returns a triangle

//examples:

public Triangle() {

}

public Triangle (double base, double height) {
    this.base = base
    this.height = height
}
Triangle triangle A = new Triangle(15,8);
Triangle triangle B = new Triangle(3, 2.58);

//pow is a class method, not an object/instance level method
// instance methods are non static meaning you need an object created to use it on
// class methods are static methods meaning you don't need to create an object or instance variable of the class to use that method on 


