import java.io.*;
import java.lang.*;
import java.util.*;
class Student {
 
    int rollno;
    String name, address;
 
    public Student(int rollno, String name, String address)
    {
 
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    public String toString()
    {
 
        return this.rollno + " " + this.name + " "
            + this.address;
    }
}

class Sortbyroll implements Comparator<Student> {
 
    public int compare(Student a, Student b)
    {
 
        return a.rollno - b.rollno;
    }
}
class Sortbyname implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
 
        return a.name.compareTo(b.name);
    }
}

public class GFG {
    public static void main(String[] args)
    {

        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "Mayank", "london"));
        ar.add(new Student(131, "Anshul", "nyc"));
        ar.add(new Student(121, "Solanki", "jaipur"));
        ar.add(new Student(101, "Aggarwal", "Hongkong"));
 
        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        Collections.sort(ar, new Sortbyroll());
 
        System.out.println("\nSorted by rollno");
 
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        Collections.sort(ar, new Sortbyname());
 
        System.out.println("\nSorted by name");
 
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}


// output: 
// Unsorted
// 111 Mayank london
// 131 Anshul nyc
// 121 Solanki jaipur
// 101 Aggarwal Hongkong

// Sorted by rollno
// 101 Aggarwal Hongkong
// 111 Mayank london
// 121 Solanki jaipur
// 131 Anshul nyc

// Sorted by name
// 101 Aggarwal Hongkong
// 131 Anshul nyc
// 111 Mayank london
// 121 Solanki jaipur





class Person {
  private String name;
  public Person(String theName) {
    this.name = theName;
  }
}

public class Student extends Person {
  private int id;
  public static int nextId = 1;
  public Student(String theName) {
    super(theName);
    id = nextId++;
  }

  public static void main(String[] args) {
    Person e1 = new Student("Alice");
    Person e2 = new Student("Bob");
    Person e3 = new Student("Carol");
    Person arrayOfPeople[] = {e1, e2, e3};
  }
}

// output: nothing


public class UseEmployee {
    public static void main(String[] args)
    {
        Employee E = new Employee("GFG1", 56);
        Employee F = new Employee("GFG2", 45);
        Employee G = new Employee("GFG3", 25);
        E.show();
        F.show();
        G.show();
        E.showNextId();
        F.showNextId();
        G.showNextId();

        { 
            Employee X = new Employee("GFG4", 23);
            Employee Y = new Employee("GFG5", 21);
            X.show();
            Y.show();
            X.showNextId();
            Y.showNextId();
        }
           
        E.showNextId(); 
    }
}

class Employee {
   
    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;
   
    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }
    public void show()
    {
        System.out.println("Id=" + ID + "\nName=" + name
                           + "\nAge=" + age);
    }
    public void showNextId()
    {
        System.out.println("Next employee id will be="
                           + nextId);
    }
}

//output:
//Id=1
//Name=GFG1
//Age=56
//Id=2
//Name=GFG2
//Age=45
//Id=3
//Name=GFG3
//Age=25
//Next employee id will be=4
//Next employee id will be=4
//Next employee id will be=4
//Id=4
//Name=GFG4
//Age=23
//Id=5
//Name=GFG5
//Age=21
//Next employee id will be=6
//Next employee id will be=6
//Next employee id will be=6


//Note: in above output, be careful with pre vs post increment!!!!!!!
