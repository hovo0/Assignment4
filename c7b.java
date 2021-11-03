public class c7b {
    public static void main(String[] args) {
        int[][] array1 = {{12, 334, 345, 543, 76,},
                {12, 45, 76, 33, 1},
                {12, 65, 90, 765, 4},
                {1, 6, 77, 5, 88},
                {134, 567, 44, 23, 63}};
        int[] array2 = array1[0];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] > array1[j][i]) {
                    array2[i] = array1[j][i];
                }

            }

        }
        int max = array2[0];
        for (int i = 1; i < array2.length; i++) {
            if (max < array2[i])
                max = array2[i];
        }
        System.out.println(max);
        System.out.println();

    }
}
