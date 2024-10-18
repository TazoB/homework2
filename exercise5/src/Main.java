public class Main {
    public static void main(String[] args) {
        double number = 49.38973;
        double D = number - (int)number;

        D *= 10;
        int a;

        if(D < 5){
            a = 0;
        }
        else{
            a = 1;
        }
        System.out.println((int)number + a);
    }
}