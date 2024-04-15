import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Video 1 hello world
        System.out.println("Hello Juan!!");
        System.out.println("========");
        //Video 2 Variables
     int lebron = 21;
     double money = 1.00;
     char grade = 'A';
     float aFloat = 300.0f;
     long superLong = 10000;
     short small = 1;
     boolean codingCanBeFun = true;
     byte bite = 10;

        System.out.println("Lebron scored " + lebron + " points in his last game!");
        System.out.println("You owe me " + "$" + money + " dollar.");
        System.out.println("Your grade is an: " + grade);
        System.out.println("You owe me " + aFloat+ " dollars!");
        System.out.println("My football parlay hit for " + superLong + " dollars!!");
        System.out.println("I have " + small + " dog!");
        System.out.println("Coding can be fun: " + codingCanBeFun);
        System.out.println("I need " + bite + " beers!");
        System.out.println("========");
        //Video3 Strings
        int myInt = 21;
        double myDouble = 15.55;
        String text = "Good afternoon";
        String blank = " ";
        String name = "Eminem!";
        String greeting = text + blank + name;
        System.out.println(greeting);
        System.out.println("Hello" + " " + "Juan!!");
        System.out.println("Your age is: " + myInt + "!");
        System.out.println("Your total is: " + myDouble + "!");
        System.out.println("========");
        //Video 4 while loop
        int sodas = 10;
        while(sodas > 0){
            System.out.println("Soda " + sodas);
            sodas = sodas - 1;
        }
        System.out.println("========");
        //Video 5 for loop
        for(int x = 5;x > 1; x--){
            System.out.println("Juan "+ x);
        }
        System.out.println("========");
        //Video 6 if statement
        int age = 16;
        if(age >= 21){
            System.out.println("What drink would you like?");
        }else if(age >= 18){
            System.out.println("I have juice and water for you!");
        }else {
            System.out.println("Security get them out!!");
        }
        System.out.println("========");
        int loop = 5;
        while(loop > 0){
            System.out.println("Countdown: " + loop);
            loop--;
            if(loop == 5){
                break;
            }
            System.out.println("walking");
        }
        System.out.println("========");
        //Video 7 Getting User Input and Video 8 Do while loop!
        Scanner scanner = new Scanner(System.in);
        int age2 = 0;


        do{
            System.out.println("What is legal drinking age?");
            age2 = scanner.nextInt();
        }
        while(age2 != 21);
        System.out.println("That is correct!");

        scanner.close();
        System.out.println("========");



    }
}