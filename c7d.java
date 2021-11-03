public class c7d {
    public static void main(String[] args) {
        int[][] arr = {{12, 334, 345, 543, 76,},
                {12, 45, 76, 33, 1},
                {12, 65, 90, 765, 4},
                {1, 6, 77, 5, 88},
                {134, 567, 44, 23, 63}};
        int kenttver = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                if (i <= k && arr[i][k] % 2 != 0) {
                    kenttver += arr[i][k];
                }


            }

        }
        System.out.println(kenttver);


    }
}

