import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Task2 {
    public static void main(String[] args){
       // Реализуйте очередь с помощью LinkedList со следующими методами: 
       //enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
       //first() - возвращает первый элемент из очереди, не удаляя. 
        Deque<Integer> que = new LinkedList<>();
        que.add(7);
        que.add(19);
        que.add(11);
        que.add(8);
        System.out.println(que);
        enQueue(que, 88);//помещает заданный элемент(которого нет в очереди) в конец очереди(т.е. удаляет последний элемент и на его место ставит заданный элемент)
        System.out.println(que);
        enQueue2(que, 19);//помещает заданный элемент(который есть в очереди) в конец очереди (т.е. меняет местами последний элемент очереди и заданный элемент)
        Dequeue(que);
        First(que);

}
    public static void enQueue(Deque<Integer> arr, int element){
        int size = arr.size();
        if (size == 0){
            System.out.println("Очередь пустая, невозможно вставить в пустую очередь последний элемент");
            
        }
        else {  
            arr.pollLast();
            arr.addLast(element);
            }
        }

    public static Integer Dequeue(Deque<Integer> arr){
        int size = arr.size();
        if (size == 0){
            System.out.println("Очередь пустая, невозможно наити и удалить элемент");
            return -1;
    }
        else{
            int first_element = arr.pollFirst();
            System.out.println("Первый элемент "+first_element);
            System.out.println(arr);
            return first_element;
        }
        
    }

    public static Integer First(Deque<Integer> arr){
        int size = arr.size();
        if (size == 0){
            System.out.println("Очередь пустая, нет первого элемента");
            return -1;
    }
        else{
            int first_element = arr.peekFirst();
            System.out.println("Первый элемент "+first_element);
            System.out.println(arr);
            return first_element;
        }
        
    }
    public static void enQueue2(Deque<Integer> arr, int element){
        int size = arr.size();
        
        if (size == 0){
            System.out.println("Очередь пустая, невозможно вставить в пустую очередь последний элемент");
            
        }
        else if (!(arr.contains(element))){
            System.out.println("Элемент не найден в очереди, невозможно его переставить в конец");
    
        }
        else {  
            
            int index = 0;
            Deque<Integer> new_que = new LinkedList<>();
            List<Integer> integers = new ArrayList<>(arr);
            for (int i = 0, max = integers.size(); i < max; i++) {
                if(integers.get(i) == element){
                    index = i;
                }
            }
            integers.remove(index);
            integers.add(element);
            for (int i = 0; i < integers.size(); i++){
                new_que.add(integers.get(i));
            }
            System.out.println(new_que);
    }
            }
        
            }

