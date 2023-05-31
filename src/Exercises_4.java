import java.util.Scanner;

public class Exercises_4 {
    public static void main(String[] args) {
        //4. N sətir və n sütundan ibarət iki ölçülü kvadrat massiv yaradın.
        // Bunları console’dan doldurun və daha sonra sol diaqonalı tərsinə çevirərək çap edin (aşağıdakı qayda da).

        Scanner sc = new Scanner(System.in);

        int row =sc.nextInt();
        int column = sc.nextInt();
        int arr[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Left diagonal");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j){
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

        System.out.println("Left diagonal Reverse");

        int start = 0;
        int end = column - 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                if (i == j){

                    System.out.println(arr[i][j]);
                }
            }
        }

        System.out.println("leng");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                System.out.println(arr[i][j]);
            }
        }







    }
}
