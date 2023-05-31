import java.util.Scanner;

public class exercises2 {
    public static void main(String[] args) {
        // 2.	N sətir və m sütundan ibarət iki ölçülü massiv yaradın.
        // Bunları console’dan doldurun və daha sonra hər bir sətirin cəmini ayrı-ayrılığda çap edin.

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

        for(int i = 0; i < row; i++){
            int sum = 0;
            for(int j = 0; j < colum; j++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }

    }
}
