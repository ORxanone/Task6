import java.util.Scanner;

public class exercises_3 {
    public static void main(String[] args) {

        //3.	N sətir və n sütundan ibarət iki ölçülü kvadrat massiv yaradın.
        // Bunları console’dan doldurun və sadəcə sağ və sol diaqonalı çap edin.

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int arr[][] = new int[row][column];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }


        System.out.println("Right Diagonal");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if (i + j == 2){
                    System.out.println(arr[i][j]);
                }
            }
        }

//        Left Diagonal :
        System.out.println("Left Diagonal");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if (i == j){
                    System.out.println(arr[i][j]);
                }
            }
        }



    }
}
