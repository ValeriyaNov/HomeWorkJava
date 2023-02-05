package HomeWork.ToSeminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//import java.util.Map.Entry;

public class Task51 {
    public static void main(String[] args){
        //1) Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
        //что 1 человек может иметь несколько телефонов.
        Map <String, Long> TellBook = new HashMap<>();
        Scanner sk = new Scanner(System.in);

        String ans = "";
        do
        {
        
        System.out.println("Введите имя и номер контакта");
        String contact = sk.next();
        String[] strr = contact.split(",");
       
        String name = strr[0]; 
        long number = Long.parseLong(strr[1]);
        if (TellBook.containsKey(name)){
            System.out.println("Такое имя уже существует, предлагаем дополнить имя описанием контакта, например, после указания имени в скобках ввети описание (например 'Ben(job)'или 'Ben(second number)')");
        
        }
        else{
        TellBook.put(name, number);
        }
        System.out.println("Хотите продолжить?");
        String answer = sk.next();
        ans = answer;
        } while (ans.equals("yes"));

    System.out.println(" Справочник готов ");
    //System.out.println(TellBook);
    PrintTellBook(TellBook);
    do{
    System.out.println("Хотите посмотреть контакт?");
    String answerr = sk.next();
    if (answerr.equals("yes")){
        System.out.println("Введите имя");
        String namee = sk.next();
        int count = 0;
        for (Map.Entry<String, Long> prin : TellBook.entrySet()){
            String key = prin.getKey();
            Long value = prin.getValue();
            if(key.contains(namee)){
                System.out.println("Имя: "+key+" Номер: "+value);
                count++;
            }
            
        }
        if(count == 0){
            System.out.println("Контакт не найден");
        }
        else{
            count = 0;
        }
    }
    System.out.println("Хотите продолжить?");
    String answer = sk.next();
    ans = answer;
    } while (ans.equals("yes"));

    sk.close();
    }
    static public void PrintTellBook(Map<String, Long> arr){

        for (Map.Entry<String, Long> prin : arr.entrySet()){
            String key = prin.getKey();
            Long value = prin.getValue();
            System.out.println("Имя: "+key+" Номер: "+value);
        }
    }
}