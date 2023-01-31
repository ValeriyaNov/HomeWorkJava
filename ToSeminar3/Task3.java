//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф из этого списка

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args){
        ArrayList<Integer> lst = new ArrayList<>(9);
        for (int i=0; i < 9; i++){
            lst.add(i, (int)(Math.random()*31)-2);
        }
        Integer dimension = lst.size();
        System.out.println(lst.toString());
        int min = lst.get(0);
        int max = lst.get(0);
        Integer sum = 0;
        for (int i = 0; i<dimension; i++){
            if (lst.get(i)>max){
                max = lst.get(i);
            }
            if (lst.get(i)<min){
                min = lst.get(i);
            }
            sum = sum + lst.get(i);
        }
        float average = sum.floatValue()/dimension.floatValue();
        
        System.out.printf("Наибольшее значение массива = " + max + "\n"+ "Наименьшее значение массива = " + min +"\n"+ "Среднее значение масссива = " + average);
}

}    

