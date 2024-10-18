public class Main {
    public static void main(String[] args) {
        double a = 5;
        double b = 6;
        double k = 2;

        double result = (a * b) / (k * k);

        double D = result - (int)result;

        D *= 10;
        int i;

        if(D < 5){
            i = 0;
        }
        else{
            i = 1;
        }
        System.out.println((int)result + i);
    }
}