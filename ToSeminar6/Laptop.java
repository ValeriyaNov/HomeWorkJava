public class Laptop {
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
        weight+" кг,"+" Операционая система: "+preloadedoperationsystem+","+" Габариты: "+dimentions+"мм,"+" Батарея: "+battery+
        ","+"Цена: "+price+"руб.");
        
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
    }


}
