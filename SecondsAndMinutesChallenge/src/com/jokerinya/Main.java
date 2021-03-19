package com.jokerinya;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
	// write your code here
        getDurationString(-3661);
    }
    public static String getDurationString(int minutes, int seconds){
        if((minutes<0) || (seconds<0 || seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }
        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(minutes + " min " + seconds + " sec = "
                + hour + "h "+ remainingMinutes + "m " + seconds + "s");
        return (hour + "h "+ remainingMinutes + "m " + seconds + "s");
    };
    public static String getDurationString(int seconds){
        if(seconds<0){
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.print(seconds + "sec => ");
        return getDurationString(minutes, remainingSeconds);
    }
}

/*
* Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.

You should validate that the first parameter minutes is >= 0.

You should validate that the 2nd parameter seconds is >= 0 and <= 59.

The method should return gInvalid valueh in the method if either of the above are not true.

If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format gXXh YYm ZZsh where XX represents a number of hours, YY the minutes and ZZ the seconds.

Create a 2nd method of the same name but with only one parameter seconds.

Validate that it is >= 0, and return gInvalid valueh if it is not true.

If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.

Call both methods to print values to the console.

Tips:
	Use int or long for your number data types is probably a good idea.
	1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
	Methods should be static as we have used previously.

Bonus:
	For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
	Create a new console project and call it SecondsAndMinutesChallenge

*
*
*
*
* */
