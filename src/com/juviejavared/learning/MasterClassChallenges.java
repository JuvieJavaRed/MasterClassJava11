package com.juviejavared.learning;

import java.util.ArrayList;
import java.util.Arrays;

public class MasterClassChallenges {

    public static void main (String [] args){

        //isLeapYear(1924);\
        areEqualByThreeDecimailPlaces(-3.175, -3.1756);
    }

    //methods challenge
    public static void displayHighScore(String playerName, int positionInTable){
        System.out.println(playerName+" managed to obtain position number "+positionInTable+ " on the high score table");
    }

    public static int calculateHighScore(int score){
        int returnVariable = 4;
        if(score>1000){
            returnVariable = 1;
        }else if(score>500 && score < 1000){
            returnVariable = 2;
        }else if(score>100 && score <500){
            returnVariable = 3;
        }
        return returnVariable;
    }

    //speed converter challenge
    // write your code here
    public static long toMilesPerHour(double kilometerPerHour){
        if(kilometerPerHour<0){
            return -1;
        }
        return Math.round(kilometerPerHour/1.609);
    }

    //speed converter challenge
    public static void printConversion(double kilometerPerHour){
        if(kilometerPerHour<0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kilometerPerHour+ " km/h = " +toMilesPerHour(kilometerPerHour)+ " mi/h");
        }

    }

    //MegaBytes converter challenge
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{

            System.out.println(kiloBytes+" KB = "+(Math.round(kiloBytes/1024))+ " MB and " +(kiloBytes%1024)+ " KB");
        }
    }

    //barking dog challenge...
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean rangeZerotoSeven = (hourOfDay >= 0 && hourOfDay<8 ) ? true : false;

        if((barking && rangeZerotoSeven)|| (barking && hourOfDay == 23)){
            return true;
        }
        return false;
    }

    //leap year challenge
    public static boolean isLeapYear(int year){
        boolean isInRange = (year >= 1 && year <= 9999) ? true : false;
        if(isInRange){
            boolean isDivisibleByFour = (year % 4 == 0) ? true : false;
            boolean isDivisibleByHundred = (year % 100 == 0) ? true : false;
            boolean isDivisibleByFourHundred = (year % 400 == 0) ? true : false;
            if(isDivisibleByFour){
                if(isDivisibleByHundred){
                    if(isDivisibleByFourHundred){
                        return true;
                    }
                }else{
                    if(isDivisibleByFourHundred){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean areEqualByThreeDecimailPlaces(double firstNumber, double secondNumber){
        String convertedFirstNumber = String.valueOf(firstNumber);
        String convertedSecondNumber = String.valueOf(secondNumber);
        int lengthConvertedFirstNumber = convertedFirstNumber.length();
        int lengthConvertedSecondNumber = convertedSecondNumber.length();
        int charactersToRemove = 0;
        String updatedString = "";
        if(lengthConvertedFirstNumber == lengthConvertedSecondNumber){
            return convertedFirstNumber.equals(convertedSecondNumber);
        }else if(lengthConvertedFirstNumber>lengthConvertedSecondNumber){
            charactersToRemove = lengthConvertedFirstNumber - lengthConvertedSecondNumber;
            updatedString = convertedFirstNumber.substring(0, convertedFirstNumber.length() - charactersToRemove);
            return updatedString.equals(convertedSecondNumber);
        }else if(lengthConvertedSecondNumber>lengthConvertedFirstNumber){
            charactersToRemove = lengthConvertedSecondNumber - lengthConvertedFirstNumber;
            updatedString = convertedSecondNumber.substring(0, convertedSecondNumber.length() - charactersToRemove);
            return updatedString.equals(convertedFirstNumber);
        }
        return false;
    }

    //equals check
        public static boolean hasEqualSum(int number1, int number2, int number3){
            boolean checker = ((number1 + number2) == number3) ? true : false;
            if(checker){
                return true;
            }
            return false;
        }


    //has teen checker
    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber){
        boolean firstNumberBoolean = (firstNumber>=13 && firstNumber <= 19) ? true : false;
        boolean secondNumberBoolean = (secondNumber>=13 && secondNumber <= 19) ? true : false;
        boolean thirdNumberBoolean = (thirdNumber>=13 && thirdNumber <= 19) ? true : false;

        if(firstNumberBoolean || secondNumberBoolean || thirdNumberBoolean){
            return true;
        }
        String firstNumberBinary = Integer.toBinaryString(10);
        System.out.println(Integer.toBinaryString(1300223));
        String stringToConvert = Integer.toBinaryString(1300223);
        String [] splitString = stringToConvert.split("");
        ArrayList<String> convertedArrayList = new ArrayList<>(Arrays.asList(splitString));
        for(int i = 0; i < convertedArrayList.size(); i ++){

        }
        return false;

    }

    //method overloading challenge



}
