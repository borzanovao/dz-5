
public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 2;
        int sum1 = a+b;
        int sum2 = c+d;
        System.out.println(sum1 > sum2);

         ++sum1;
         sum2 -= 2;

        System.out.println(sum1 > sum2);

        System.out.println(((sum1 %2) ==0) || ((sum2 %2) ==0));
        }
    }
