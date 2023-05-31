public class exercises_7 {
    public static void main(String[] args) {

        //7.	Aşağıda verilmiş sətirin içərisindəki ədədlərin kvadratları cəmini tapın.

        String str = "9, ae 2, ae 0, ab 3, ab 2, ab 6";

        String[] arr = str.split(", ae ");
        String str2 = "";

        for (int i = 0; i < arr.length; i++) {
            str2 = arr[i];

            System.out.println(str2);
        }

        String[] arr2 = str2.split(", ab ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
