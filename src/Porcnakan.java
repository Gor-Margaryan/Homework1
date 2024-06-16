//Yst nvazman kargi
public class Porcnakan {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        if (a > b &&  b > c) {
            System.out.println(a + "" + b + "" + c);
        } else if (b > c  && c > a) {
            System.out.println(b + "" + c + "" + a);
        } else if (c > b && b > a) {
            System.out.println(c + "" + b + "" + a);
        } else if (a > c && c > b) {
            System.out.println(a + "" + c + "" + b);
        } else if (c > a && a > b) {
            System.out.println(c + "" + a + "" + b);
        } else {
            System.out.println(b + "" + a + "" + c);
        }
    }
}