public class c7 {
    public static void main(String[] args) {
        int[][] arr = {{12, 334, 345, 543, 76,},
                {12, 45, 76, 33, 1},
                {12, 65, 90, 765, 4},
                {1, 6, 77, 5, 88},
                {134, 567, 44, 23, 63}};
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] >9 && arr[i][j] < 100)
                    s++;
                if (arr[i][j] > -100 && arr[i][j] < -9)
                    s++;
            }
        }
        System.out.println(s);


    }

}
