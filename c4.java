public class c4 {
    public static void main(String[] args) {
        String text = "BRABUS ROCKET 900 ONE OF TEN  will be built in the high-end BRABUS Manufaktur in Bottrop based on the GT 63 S 4MATIC+";
        String [] a = text.split(" ");
        int max = 0;
        for(int i =0;i<a.length;i++){
            if (a[i].length() > max) {
                max = a[i].length();
            }
        }
        for(int i =0;i<a.length;i++){
            if(a[i].length()==max){
                System.out.println(a[i]);
            }
        }
    }
}

