import java.util.SortedMap;

public class checkPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrimeOpt(7));
    }

    public static boolean isPrime(int num) {
        boolean flag = true;
        if (num <= 2) {
            return flag;
        }

        int current = 2;
        while (current < num) {
            if (num % current == 0) {
                flag = false;
                break;
            }
            current++;
        }
        return flag;
    }


    //optimized square-root
    public static boolean isPrimeOpt(int num) {
        boolean flag = true;
        if (num <= 2) {
            return flag;
        }

        int current = 2;
        while ((current*current) < num) {
            if (num % current == 0) {
                flag = false;
                break;
            }
            current++;
        }
        return flag;
    }

}