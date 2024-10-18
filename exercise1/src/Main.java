public class Main {
    public static void main(String[] args) {
        //  მესამე ცვლადის გამოყენებით:
        int a = 8;
        int b = 17;
        int k = a;
        a = b;
        b = k;
        System.out.println(a + " " + b);


        //მესამე ცვლადის გამოყენების გარეშე:
        int x = 7;
        int y = 26;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x + " " + y);
    }
}