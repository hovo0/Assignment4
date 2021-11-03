public class c2 {
    public static void main(String[] args) {
        int i, j, chap = 4;

        for (i=0; i<chap; i++)
        {
            for (j=chap-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}