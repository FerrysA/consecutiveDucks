
import java.util.Scanner;// библ для ввода с клавиатуры
public class Main {

        public static boolean consecutiveDucks(int n) {
            // your code here
            long A=n;

            for(int k=1;k<=2*A ;k++) {
                if(2*A%(k+1)==0&&(-k+2*A/(k+1))%2==0)
                {
                    System.out.println(k);
                    System.out.println((-k+2*A/(k+1))/2);

                    return true;

                }
            }

            return false;
        }


    private static Scanner inn = new Scanner(System.in);// метод для ввода с клавиатуры

    public static <string> void main(String[] args) {

        System.out.println(consecutiveDucks( 1447393722));

    }
}
