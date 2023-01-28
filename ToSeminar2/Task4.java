//Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *). 
//int a ; int b; String op (op!=”Stop”); (char != ’b’)
package HomeWork.ToSeminar2;
import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class Task4 {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(Logger.class.getName());
        FileHandler fh = new FileHandler("logcalc.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        
        int ff = 0;
        int ans = 0;
        Scanner iScanner = new Scanner(System.in);

        do {
            
            System.out.print("Введите выражение. Обратите внимание, что числа и знак оперции необходимо отделить запятой без пробелов (пример, 88,+,6) ");
            String lst = iScanner.next();
        
            String[] strr = lst.split(",");
       
            float a = Float.parseFloat(strr[0]); 
            String oper = strr[1];
            float b = Float.parseFloat(strr[2]);
        
            float result;
            switch (oper) {
                case "+":
                result = a + b;
                break;
                case "-":
                result = a - b;
                break;
                case "/":
                result = a / b;
                break;
                case "*":
                result = a * b;
                break;
                default:
                result = 0;
            }
            System.out.printf(strr[0]+strr[1]+strr[2]+" = "+ result);
            String msg = "Первое число: "+strr[0]+" Второе число: "+strr[2]+" Операция: "+strr[1]+" Результат "+result;
            logger.setLevel(Level.ALL);
            logger.log(Level.ALL, msg);
        
        
            System.out.print(" Продолжаем? Если да, то нажимаем '0', если нет - любое число от 1 до 9");
            int anss = iScanner.nextInt();
            ans = anss;
            
            
            } while (ans == ff);

            System.out.println(" Конец ");
            
            iScanner.close();
    }
    }

    
        
    
    