package tasks;

import java.math.BigInteger;

public class Task4 {

    public static boolean isPrime(int number){
        return number > 1 && BigInteger.valueOf(number).isProbablePrime(16);
    }
}
