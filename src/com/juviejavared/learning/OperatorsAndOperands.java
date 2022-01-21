package com.juviejavared.learning;

public class OperatorsAndOperands {
    //follow through the logic and see how answers come about..............
    public static void main(String [] args){
        //addition using "+"
        int resultAddition = 1 + 2;

        //answer should be 3
        System.out.println(resultAddition);

        //minus operator "-"
        int resultSubtraction = resultAddition - 1; //should be 2
        System.out.println(resultSubtraction);

        //multiplication operator "*"
        int resultMultiplication = resultSubtraction * 10; //answer should be 20
        System.out.println(resultMultiplication);

        //division operator "/"
        int resultDivision = resultMultiplication / 5;
        System.out.println(resultDivision);

        //modulus or remainder operator "%"
        int resultModulus = resultDivision % 3; //answer should be 1
        System.out.println(resultModulus);


        // abbreating operators ...........................................
        resultModulus++; //adds 1 to current result
        System.out.println(resultModulus);

        resultModulus--; //will subtract 1 from the current result
        System.out.println(resultModulus);

        resultModulus += 2; //this is the same as resultModulus = resultModulus + 2
        System.out.println(resultModulus);

        resultModulus *= 10;// this will multiply current resultModulus by 10
        System.out.println(resultModulus);

        resultModulus /= 3; //this is the same as resultModulus / 3 which is 10
        System.out.println(resultModulus);

        resultModulus -= 2; //this is the same as resultModulus - 2 which is 8
        System.out.println(resultModulus);

        //conditional logic
        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("This is not an alien"); // if not in code block only one line will work

        //code block cause of parenthesis
        if(isAlien == false){
            //multiple lines
            System.out.println("Line 1");
            System.out.println("Line 2");
        }

        //expression for is not equal to
        int topScore = 101;
        if(topScore != 100){
            System.out.println("This is top score");
        }

        //greater than
        if(topScore > 100){
            System.out.println("This is top score");
        }

        //greater than or equal to 100
        if(topScore >= 100){
            System.out.println("This is top score cause greater than or equal to");
        }

        //less than operator
        if(topScore < 100){
            System.out.println("This is top score cause less than sign");
        }

        //less than operator or equal to
        if(topScore <= 100){
            System.out.println("This is top score cause less than sign or equal to");
        }

        //check if a score is with in a range
        int secondScore = 60;
        if(topScore > secondScore && topScore < 100){ //logical AND conditions
            System.out.println("This condition passes");
        }

        //logical OR operator...............
        if((topScore > secondScore) || (topScore < 100)){ //logical AND conditions
            System.out.println("Logical OR condition has passed");
        }

        //Tenary operators....
        boolean isCar = false;
        boolean  wasCar = isCar ? true:false;//shortcut of if-then-else statement
        if(wasCar){
            System.out.println("wasCar is true "+wasCar);
        }

        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myFirstResult = (myFirstDouble + mySecondDouble) * 100;
        System.out.println(myFirstResult);
        double mySecondResult = myFirstResult % 40.00d;
        System.out.println(mySecondResult);
        double remainder = mySecondResult;
        boolean myRemainderVaue = (myFirstResult % 40 == 0) ? true : false;
        System.out.println("The remainder value evaluation is "+myRemainderVaue);
        if(!myRemainderVaue){
            System.out.println("Got some remainder");
        }


    }
}
