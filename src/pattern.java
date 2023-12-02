public class pattern {
    public static void main(String[] args) {

        System.out.println("*");
        System.out.println("*");
        System.out.println(" ");

        System.out.print("*");
        System.out.print("*");
        System.out.println(" ");

        printTenStars();

        printStars(10);

        printnxnStars(5);

        printUpTriangle(10);

        printDownTriangle(10);

    }

    public static void printTenStars() {
        int count = 0;
        while (count < 10) {
            System.out.print("*");
            count++;
        }
    }

    public static void printStars(int n) {
        int count = 0;
        while (count < n) {
            System.out.print("*");
            count++;
        }
    }

    public static void printnxnStars(int n) {
        int row = 0;
        while (row < n) {
            int col = 0;
            while (col < n) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void printUpTriangle(int n) {
        int row = 0;
        while (row <= n) {
            int col = 0;
            while (col < row) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
        }
    }


    public static void printDownTriangle(int n) {
        int row = n;
        while(row > 0){
            int col = 0;
            while (col<row){
                System.out.print("*");
                col++;
            }
            System.out.println();
            row--;
        }

    }
}