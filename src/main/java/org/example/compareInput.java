package org.example;

public class compareInput {
    public void getLargest(int one, int two, int three){
        int largest = 0;
        int secondLargest = 0;
        int thirdLargest = 0;
        if(one > two && one > three){
            largest = one;
            System.out.println("The largest number is " + largest);
        }
        else if(two > one && two > three){
            largest = two;
            System.out.println("The largest number is " + largest);
        }
        else if(three > one && three > two){
            largest = three;
            System.out.println("The largest number is " + largest);
        }
        else{
            System.out.println("Neither number is the largest");
        }
    }
}
