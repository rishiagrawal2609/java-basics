package Lecture1;

public class Count5 {
    public static void main(String[] args) {
        System.out.println(count5(535));
    }
    public static int count5(int num){
        int result = 0;
        while (num>0){
            int rem = num%10;
            if (rem == 5){
                result = result+1;
            }
            num = num/10;
        }
        return  result;
    }
}
