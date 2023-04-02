public class parseIntandtoString {
    public static void main(String[] args) {
        //parseInt method coverts a string into an integer
        String str="123";
        int number=Integer.parseInt(str);
        System.out.println(number);

        //toString method converts a number into a string
        int num=123;
        String str1=Integer.toString(num);
        System.out.println(str1);
    }
}
