package MD3_BT;

import java.util.Scanner;

public class BT1_XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 89, 43, 4, 34, 34};
        Scanner input = new Scanner(System.in);
        System.out.print("NHập phần tử muốn xóa: ");
        int X = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (X == array[i]) {
                array[i] = 0;
                System.out.print(array[i] + ",");
            } else {
                System.out.print(array[i] + ",");
            }
        }
    }
}
