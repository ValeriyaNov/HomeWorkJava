package HomeWork.ToSeminar5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task52 {
    public static void main(String[] args){
        //2) Пусть дан список сотрудников:Иван Иванов и т.д.
        //Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
        //Отсортировать по убыванию популярности.
        ArrayList<String> lstpip = new ArrayList<>();
        lstpip.add("Лермонтов Михаил Юрьевич");
        lstpip.add("Чехов Антон Павлович");
        lstpip.add("Пришвин Михаил Михайлович");
        lstpip.add("Гумилев Николай Степанович");
        lstpip.add("Салтыков-Щедрин Михаил Евграфович");
        lstpip.add("Ершов Петр Павлович");
        lstpip.add("Чаадаев Петр Яковлевич");
        lstpip.add("Лосенко Антон Павлович");
        lstpip.add("Чайковский Петр Ильич");
        lstpip.add("Капица Петр Леонидович");
        lstpip.add("Бунин Иван Алексеевич");
        lstpip.add("Айвазовский Иван Константинович");
        lstpip.add("Венецианов Алексей Гаврилович");
        lstpip.add("Булгаков Михаил Афанасьевич");
        lstpip.add("Жаров Михаил Иванович");
        lstpip.add("Толстой Алексей Николаевич");
        
        ArrayList<String> lst = new ArrayList<>();
        for (int i = 0; i < lstpip.size(); i++){
            String a = lstpip.get(i);
            lst.add((a.split(" "))[1]);
        }
        
        
        var s = lst;
        var map = s.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
    
        map.values().removeIf(value -> (value == 1));
        
        
        for (Map.Entry<String, Long> prin : map.entrySet()){
            String key = prin.getKey();
            Long value = prin.getValue();
            System.out.println("Имя " + key+ " поторяется "+value + " раз " );
            }
         System.out.println("Отсортированный вывод");
            Stream<Map.Entry<String,Long>> sorted =
            map.entrySet().stream()
               .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
    
    sorted.forEach(sf -> System.out.println("Имя "+sf.getKey()+" Количество повторений "+ sf.getValue()));
    
}
    
}