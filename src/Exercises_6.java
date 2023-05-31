public class Exercises_6 {
    public static void main(String[] args) {

        // a
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j <= i; j++) {
//                 if(i >= j)
//                    System.out.print("*");
//
//            }
//            System.out.println();
//        }

        // b
        int n = 3;

        for (int i = n; i > 0; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
        }

        // d
//        int n = 3;

        for (int i = n; i > 0; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print("");             //ferq burdadi;
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        for (int i = 0; i < 3; i++) {             //d- nin 2-ci methodu
//            for (int j = 0; j < 3; j++) {
//                if(i <= j)
//                    System.out.print("*");
//
//            }
//            System.out.println();
//        }

        System.out.println("--------");

        // c
        for (int i= 0; i<= n; i++)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("----------");

        // e
        for (int i= 0; i<= n-1 ; i++)
        {
            for ( int j=0; j<i; j++)
            {
                System.out.print(" ");
            }
            for ( int k=i; k<=n-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }

        System.out.println("----------");
        // e
        for (int i= 0; i < n; i++)
        {
            for (int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            for (int k=0; k<= i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }

        System.out.println("-------------");

        // f
    
        // h
        int a = 1;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//
//                    System.out.print(a++);
//
//
//            }
//            System.out.println();
//        }
        System.out.println("---------");

        // g

//        for (int i = 0; i < n; i++) {          islemir
//            for (int j = 0; j <= i; j++) {
//                int sum =  a++;
//                System.out.print(sum + " ");
//
//
//            }
//            System.out.println();
//        }



    }
}
