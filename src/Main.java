import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colum = sc.nextInt();
        int arr[][] = new int[row][colum];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < colum; j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }



    }
}