package com.norman.primetown.business;

import java.util.Calendar;
import java.util.stream.IntStream;

public class HouseBusiness {

    public HouseBusiness() {
    }

    public boolean checkYearOfConstruction(int year){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if(year >= 1800 && year <= currentYear){
            return true;
        } else{
            return false;
        }
    }

    //https://www.baeldung.com/java-prime-numbers
    public boolean checkPrimenumber(int number){
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }
}
