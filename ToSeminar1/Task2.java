
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] primenumber = new int [168];
        primenumber[0] = 2;
        primenumber[1] = 3;
        int index = 2;

        for (int i = 4; i < 1000; i++){
            boolean flag = Check(i);
            if (flag == true){
                primenumber[index] = i;
                index = index + 1;
            }
        }
        
        System.out.print(Arrays.toString(primenumber));
    }

        static boolean Check (int n){
            double sqrt = Math.sqrt(n);
            boolean flag = true;
            for (int i = 2; i <= sqrt; i++){

                if (n%i == 0){
                    flag = false;
                }
            }

            return flag;

        }

    }
