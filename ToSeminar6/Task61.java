import java.util.Arrays;
import java.util.HashSet;

public class Task61 {
    public static void main(String[] args){
        Laptop l1 = new Laptop ("MacBook Pro 15", "IntelCore i7", 32, "Glossy", 2f, "iLife", "15.4*", 17, 12900);
        Laptop l2 = new Laptop ("Huawei Matebook x pro", "IntelCore i7", 16, "Glossy", 1.26f, "Windows 11", "14.2*", 16, 108000);
        Laptop l3 = new Laptop ("ASUS ROG Zephyrus", "AMD", 64, "Glossy", 2f, "Windows 11", "16*", 12, 216000);
        Laptop l4 = new Laptop ("Lenovo ThinkPad X1", "IntelCore i7", 32, "Glossy", 1.2f, "Windows 11", "14*", 20, 242000);
        Laptop l5 = new Laptop ("MSI Creator 17", "IntelCore i9", 64, "Glossy", 2f, "Windows 11", "17*", 24, 421000);
        
        HashSet<Laptop> laptopss = new HashSet<>(Arrays.asList(l1, l2, l3, l4, l5));
        for (var element: laptopss){
            element.Print();
        }
    
    
    }
}
