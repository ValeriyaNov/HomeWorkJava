import java.util.LinkedList;

public class  Task1 {
    public static void main(String[] args){
        //Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        LinkedList<String> lst = new LinkedList<>();
        lst.add("фазан");
        lst.add("сидит");
        lst.add("где");
        lst.add("знать");
        lst.add("желает");
        lst.add("охотник");
        lst.add("каждый");
        
        System.out.println(lst);
        System.out.print(Reverse(lst));


}
public static LinkedList<String> Reverse (LinkedList<String> arr){
    for(int i = 0; i < (arr.size() / 2); i++){
        String temp = arr.get(i);
        arr.set(i, arr.get(arr.size() - i - 1));
        arr.set(arr.size() - i - 1, temp);
    }
    
    return arr;

}
}