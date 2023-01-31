//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;

import java.util.Iterator;

public class Task2 {
    public static void main(String[] args){
        ArrayList<Integer> lst = new ArrayList<>(17);
        for (int i=0; i < 18; i++){
            lst.add(i, (int)(Math.random()*31)-2);
        }
        System.out.println(lst.toString());
        RemoveEvenFromArray(lst);
        jjj(lst);
    
}
    public static void RemoveEvenFromArray (ArrayList<Integer> arr){
        ArrayList<Integer> newlst = new ArrayList<>();
        for (int i=0; i<arr.size(); i++){
            if ((arr.get(i)%2) != 0){
                newlst.add(arr.get(i));
            }
        }

        System.out.println(newlst.toString());
    }  

    public static void jjj (ArrayList<Integer> array){
        Iterator<Integer> ar = array.iterator();
        while(ar.hasNext()){
            Integer nextarray = ar.next();
        
        
        
        if ((nextarray % 2) == 0){
                ar.remove();
            }
        
        }
            System.out.println(array.toString());;
        
    }
}

