package java101.Arrays;

public class SeriesRepeatingEvenNumbers {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] serie = {3, 7, 3, 3, 2, 9, 10, 10, 21, 1, 2, 2, 33, 4, 4};
        int[] duplicate = new int[serie.length];
        int startIndex = 0;

        for (int i = 0; i < serie.length; i++) {
            for (int j  = 0; j < serie.length; j++) {
                if ((i != j) && (serie[i] == serie[j]) && (serie[i] % 2 == 0)) {
                    if (!isFind(duplicate, serie[i])) {
                        duplicate[startIndex++] = serie[i];
                    }
                    break;

                }

            }
        }
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}
