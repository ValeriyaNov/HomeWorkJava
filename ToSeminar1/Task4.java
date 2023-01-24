import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите выражение, например, 1х + х2 = 54. Обратите внимание на наличие пробелов, как в примере   ");
        String lst = iScanner.nextLine();
        iScanner.close();
        String[] str = lst.split(" "); // [8x, +, x2, =, 54 ]
        String a = str[0];
        String a1 = a.replaceAll("[^0-9]+", "");
        int aa = Integer.parseInt(a1); 
        String b = str[2];
        String b1 = b.replaceAll("[^0-9]+", "");
        int bb = Integer.parseInt(b1);
        String c = str[4];
        String c1 = c.replaceAll("[^0-9]+", "");
        int cc = Integer.parseInt(c1);
        int count = 0;
        for (int i = 1; i<10;i++ ){
            if ((aa*10+i) + (i*10+bb) == cc){
                count ++;
                System.out.printf("при n = "+i+" Выражение верно "+aa+""+i+" + "+i+bb+" = "+cc);
            }
            
            }
        if (count == 0){
            System.out.println("Нет решения для данного уравнения");  
        }
        }



}
