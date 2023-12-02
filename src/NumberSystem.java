public class NumberSystem {
    public static void main(String[] args) {
        System.out.println(deci2bin1(12));
        System.out.println(deci2bin2(12));
        System.out.println(deci2any(12,2));
        System.out.println(bin2deci(1100));
        System.out.println(any2deci(1100,2));
    }

    public static int deci2bin1(int num){
        int place = 0;
        int result = 0;
        while (num > 0) {
            int rem = num %2;
            result = result + (int)(Math.pow(10,place)*rem);
            num = num/2;
            place = place +1;
        }
        return  result;
    }

    //optimized method
    public static int deci2bin2(int num){
        int place =1;
        int result = 0;
        while (num>0) {
            int rem = num %2;
            result = result + (place*rem);
            num = num/2;
            place = place *10;
        }
        return  result;
    }

    //decimal to any base
    public static int deci2any(int num,int base){
        int place = 1;
        int result = 0;
        while (num>0){
            int rem = num % base;
            result = result +(place * rem);
            num = num/base;
            place = place * 10;
        }
        return  result;
    }
    // Binary to decimal
    public static int bin2deci(int bin){
        int place = 1;
        int result = 0;
        while (bin>0){
            int rem = bin%10;
            result = result + (place * rem);
            bin = bin/10;
            place = place * 2;
        }
        return  result;
    }

    // Any to decimal
    public static int any2deci(int bin,int base){
        int place = 1;
        int result = 0;
        while (bin>0){
            int rem = bin%10;
            result = result + (place * rem);
            bin = bin/10;
            place = place * base;
        }
        return result;
    }

}
