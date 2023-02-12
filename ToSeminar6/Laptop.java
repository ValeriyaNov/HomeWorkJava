import java.util.Comparator;

public class Laptop 
//implements Comparator<Laptop>
{
    String model;
    String CPU;
    Integer RAM;
    String screen;
    Float weight;
    String preloadedoperationsystem;
    String dimentions;
    Integer battery;
    Long price;

    void Print(){
        System.out.println("Модель: "+model+","+" Процессор: "+CPU+","+" ОЗУ: "+RAM+","+" Экран: "+screen+","+" Масса: "+
        weight+" кг,"+" Операционая система: "+preloadedoperationsystem+","+" Габариты: "+dimentions+" мм,"+" Батарея: "+battery+
        " ч"+","+" Цена: "+price+" руб.");
        
    }

    Laptop(String mod, String proc, Integer memor, String scr, Float i, String os, String dim, Integer bat, long j){
        
        this.model = mod;
        this.CPU = proc;
        this.RAM = memor;
        this.screen = scr;
        this.weight = i;
        this.preloadedoperationsystem = os;
        this.dimentions = dim;
        this.battery = bat;
        this.price = j;
    };
    
    

    public static Comparator<Laptop> ModelComparator = new Comparator<Laptop>() {
    @Override
    public int compare(Laptop o1, Laptop o2) {
        
        return o1.model.compareTo(o2.model);
    }
    };
    
    public static Comparator<Laptop> PriceComparator = new Comparator<Laptop>() {
    @Override
    public int compare(Laptop o1, Laptop o2) {
        
        return (int)(o2.price - o1.price);
    }
};
}


    
    




    
    