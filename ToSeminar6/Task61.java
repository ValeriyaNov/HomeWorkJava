
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
//import java.util.Collections;
//import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Task61 {
    
    
    public static void main(String[] args){
        
        Laptop l1 = new Laptop ("MacBook Pro 15       ", "IntelCore i7", 32, "Glossy", 2f,    "iLife     ", "12*14", 17, 12900);
        Laptop l2 = new Laptop ("Huawei Matebook x pro", "IntelCore i7", 16, "Glossy", 1.26f, "Windows 11", "10*11", 16, 108000);
        Laptop l3 = new Laptop ("ASUS ROG Zephyrus    ", "AMD         ", 64, "Glossy", 2f,    "Windows 11", "10*16", 12, 216000);
        Laptop l4 = new Laptop ("Lenovo ThinkPad X1   ", "IntelCore i7", 32, "Glossy", 1.2f,  "Windows 11", "10*12", 20, 242000);
        Laptop l5 = new Laptop ("MSI Creator 17       ", "IntelCore i9", 64, "Glossy", 2f,    "Windows 11", "12*19", 24, 421000);
        
        HashSet<Laptop> laptopss = new HashSet<>(Arrays.asList(l1, l2, l3, l4, l5));
        //for (var element: laptopss){
            //element.Print();
        //}
        Scanner tttt = new Scanner(System.in);
        //System.out.println("Введите номер критерия фильтрации: 1-Процессор, 2-ОЗУ, 3-Экран, 4-Масса, 5-Операционная система, 6-Габариты, 7-Батарея, 8-Цена");
        int criterion = tttt.nextInt();
        Map<Integer,String> criterionMap = new HashMap<>();
        int[] keys = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] vals = {"Процессор", "ОЗУ", "Экран", "Масса", "Операционная система", "Габариты", "Батарея", "Цена"};
        for (int i = 0; i < keys.length; i++) {
            criterionMap.put(keys[i], vals[i]);
        }
        Map<String,String> filterMap = filter(criterion, laptopss);
        //printMap(filterMap, criterion, criterionMap);
        filterModell(laptopss);
    

        //filterModell(laptopss);

        tttt.close();
    }
    public static Map<String, String> filter(int criterion, HashSet<Laptop> laptopes){
        
        Map<String, String> sample = new HashMap<>();

        switch (criterion) {
            case 1:
            for (Laptop item: laptopes) {
                sample.put(item.model, item.CPU);
            }
            break;
            case 2:
            for (Laptop item: laptopes) {
                sample.put(item.model, (item.RAM).toString());
            }
            break;
            case 3:
            for (Laptop item: laptopes) {
                sample.put(item.model, item.screen);
            }
            break;
            case 4:
            for (Laptop item: laptopes) {
                sample.put(item.model, (item.weight).toString());
            }
            break;
            case 5:
            for (Laptop item: laptopes) {
                sample.put(item.model, item.preloadedoperationsystem);
            }
            break;
            case 6:
            for (Laptop item: laptopes) {
                sample.put(item.model, item.dimentions);
            }
            break;
            case 7:
            for (Laptop item: laptopes) {
                sample.put(item.model, (item.battery).toString());
            }
            break;
            case 8:
            for (Laptop item: laptopes) {
                sample.put(item.model, (item.price).toString());
            }
            break;
        }
        return sample;
    }

    public static void printMap(Map<String,String> anyMap, int criterion, Map<Integer, String> criterionMap){
        for (Map.Entry<Integer, String> prin : criterionMap.entrySet()){
            //Integer key = prin.getKey();
            //String value = prin.getValue();
            if(prin.getKey() == criterion){
                if(criterion == 2){
                    System.out.println("|         Модель        | "+prin.getValue()+", Гб   |");
                }
                else if(criterion == 4){
                    System.out.println("|         Модель        | "+prin.getValue()+", кг   |");
                }
                else if(criterion == 6){
                    System.out.println("|          Модель       | "+prin.getValue()+", мм   |");
                }
                else if(criterion == 7){
                    System.out.println("|          Модель       | "+prin.getValue()+", ч   |");
                }
                else if(criterion == 8){
                    System.out.println("|          Модель       | "+prin.getValue()+", руб |");
                }
                else{
                System.out.println("|         Модель        | "+prin.getValue()+"      |");
                }
            }
        }
        System.out.println("|_______________________|___________________|");
        for (Map.Entry<String, String> prin : anyMap.entrySet()){
            String key = prin.getKey();
            String value = prin.getValue();
            System.out.println("| "+key+" |         "+value+"|");
                
            }
    }
    
    public static void filterModell(HashSet<Laptop> anyMapp){
        //List<String> sorted = new List<String>(anyMap);

        ArrayList<Laptop> sorted = new ArrayList<>(anyMapp);
        //Comparator<Laptop> gg = new Comparator<>();
        
        Collections.sort(sorted);
        //Laptop[] sorted = new Laptop[] (anyMapp);
        //ArrayList.sort(sorted);
        //Arrays.sort(sorted, new Comparator<Laptop>());
         //{
            //@Override
            //public int compare (Laptop first, Laptop second)
            //{
                //if (first.getAge() != second.getAge()) {
                    //return first.getAge() - second.getAge();
                //}
                //return first.model.compareTo(second.model);
            //}
        //});

        //Collections.sort(sorted);
        printArrays(sorted);
        //System.out.println(sorted.toString());
    }

    public static void printArrays(ArrayList<Laptop> arr){
        System.out.println("|        Модель       |  Процессор |ОЗУ, Гб |Вес, кг  | Экран |Батарея, ч|   ОС     |Габариты, мм|  Цена, руб  |");
        System.out.println("|_____________________|____________|________|_________|_______|__________|__________|____________|_____________|");
        for (int i = 0; i<arr.size(); i++){
            Laptop item = arr.get(i); 
            System.out.println("|"+item.model+"|"+item.CPU+"|   "+item.RAM+"   |   "+item.weight+"   |"+item.screen+"|     "+item.battery+"    |"+item.preloadedoperationsystem+"|    "+item.dimentions+"    |   "+item.price+"   |");
        }
    }

}
