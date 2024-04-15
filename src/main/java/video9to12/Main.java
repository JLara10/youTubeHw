package video9to12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of pet do you have?");
        String pet = scanner.nextLine();
        switch (pet.toLowerCase()) {
            case "dog":
                System.out.println("Dogs are the best!");
                break;
            case "cat":
                System.out.println("Cats are fluffy!");
                break;
            default:
                System.out.println("Please enter a cat or dog!");
        }
        scanner.close();
        System.out.println("===========");
        //Video 10 arrays
        int[] coins;
        coins = new int[4];
        coins[0] = 1;
        coins[1] = 2;
        coins[2] = 3;
        coins[3] = 4;
        System.out.println(coins[0]);
        System.out.println(coins[1]);
        System.out.println(coins[2]);
        System.out.println(coins[3]);
       for(int i = 0; i < coins.length; i++){
           System.out.println(coins[i]);
       }
       int[] dollars = {1, 5, 10, 20};

       for(int x = 0; x < dollars.length; x++){
           System.out.println(dollars[x]);
       }
        //Video 11 String arrays
        System.out.println("===========");
        String[] words = new String[3];//the 3 tells java it's an array with 3 elements
        //assigning words to each index of array
       words[0] = "What's";
       words[1] = "up";
       words[2] = "bro!";
        System.out.println(words[2]);//print element 2 bro
       String[] veggies = {"Spinach", "Carrot", "broccoli"};//another way to do an array

       for(String greens : veggies) {//a for each loop being used here storing veggies into greens then printing greens
           System.out.println(greens);
       }
        System.out.println("===========");
       //Video 12 multi-dimensional arrays
        int[] values = {10, 9, 8};
        System.out.println(values[1]);

        int[][] numbers = {
                {1, 2, 3, 4},
                {11, 12, 13,14},
                {21, 22, }
        };
        System.out.println(numbers[0][3]);
        System.out.println(numbers[1][2]);
        System.out.println(numbers[2][1]);

        String[][] text = new String[1][2];
        text[0][1] = "Bye fool";
        System.out.println(text[0][1]);

        for(int i = 0; i < numbers.length; i++){
            for(int x = 0; x < numbers[i].length; x++){
                System.out.print(numbers[i][x] + "\t");
            }
            System.out.println();
        }
        String[][] more = new String[3][3];
        more[1][1] = "End of 12!";
        System.out.println(more[1][1]);
    }
}