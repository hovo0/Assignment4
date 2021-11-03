public class c3 {
    public static void main(String[] args) {

        int[] arr = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sized = 0;
        int sizeb = 0;

        System.out.println("Current array");
        for (int element : arr) {
            System.out.print(element+ " ");
            if (element > 0) {
                sized++;
            } else sizeb++;

        }

        System.out.println();

        int[] bArray = new int[sized];
        int[] cArray = new int[sizeb];

        for (int i = 0, j = 0, k = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                bArray[j] = arr[i];
                j++;
            } else {
                cArray[k] = arr[i];
                k++;
            }
        }
        System.out.println("Drakan");
        for (int element : bArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Bacasakan");
        for (int element : cArray) {
            System.out.print(element + " ");
        }


    }
}