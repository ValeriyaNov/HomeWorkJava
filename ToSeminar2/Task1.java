package HomeWork.ToSeminar2;

import java.util.ArrayList;

public class Task1 {
    // Дана строка sql-запроса "select * from students where ".
    // Сформируйте часть WHERE этого запроса, используя StringBuilder.
    // Данные для фильтрации приведены ниже в виде json строки.
    //Если значение null, то параметр не должен попадать в запрос.
    //Параметры для фильтрации:
    // String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
    //Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …

    public static void main(String[] args) {
        String str = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}"
                .replace("{", "").replace("}", "")
                .replace("'", "").replace(":", " = ");

        String[] parts = str.split(",");
        ArrayList<String> newparts = new ArrayList<String>();
        for (int i=0; i < parts.length; i++){
            if (! parts[i].substring(parts[i].length()-4).equals("null")){
             newparts.add(parts[i]);
            }
        }
        for (int i = 0; i < newparts.size() - 1; i++){
            System.out.printf(newparts.get(i) + " and ");
        }
        System.out.print(newparts.get(newparts.size()-1));
        
    }

}
