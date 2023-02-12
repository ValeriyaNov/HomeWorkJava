public class Laptop 
//implements Comparable<Laptop>
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
    }


    @Override
    public String toString()
    {
        //return "{" + "='" + name + '\'' +", age=" + age + '}';
        return model+","+CPU+","+RAM+","+weight+","+screen+","+battery+","+preloadedoperationsystem+","+dimentions+","+price+",";
    }


    //@Override
    //public int compareTo(Laptop o)
    //{
        //if (this.model != o.model) {
            //return this.model - o.model;
        //}
        //return this.model.compareTo(o.model);
    //}
}
