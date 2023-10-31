class Main {
    String fname;
    int age, x, y;
public static void main(String[] args) {
    System.out.println("Hello world");
    mymethod("owen", 5);
    mymethod("sam", 3);
    mymethod("emma", 6);
    myetho(5, 5);
    

}
static void mymethod(String fname, int age) {
    System.out.println("This is my method!");
    
}
static void myetho(int x, int y) {
    //x = 5;
    //y = 3;
    System.out.println(x + y);
    
}

}


  // Outputs 8 (5 + 3)
