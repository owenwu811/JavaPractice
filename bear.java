public class bear {
    int x;
    String n;
    //int y;
    float myFloatnum = 5.66666666f;
    char myLetter = 'D'; // char seems to be able to accept single quotes in java but not string
    boolean mybool = true; // true is lowercase in java
    String mytext = "Hello";
    public bear(int y, String name) {
        x = y;
        n = name;
    }
    public static void main(String[] args) {
        bear b = new bear(5, "G");
        System.out.println(b.x);
        System.out.println(b.n);
        String cars[] = {"a", "b", "c"}; // java only uses double quotes and not single quoteas
        System.out.println(cars[2]); // java dosen't have -1, so -1 instead of 2 wouldn't work
        cars[2] = "d";
        System.out.println(cars[2]);
        System.out.println(cars.length);
        switchdemo();

    }
    public static void switchdemo() {
        int day = 1;
        switch(day) {
            default: // even if this was on top, if day = 1, it would print "Monday"
                System.out.println("No matches");

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            
        }
        //int mood = "happy"; - switch statement does not accept strings
        //switch(mood) {
         //   case "happy":
        //        System.out.println("Happy");
        //        break;
        //}
    }
}

