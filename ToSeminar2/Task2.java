package HomeWork.ToSeminar2;


import java.util.Arrays;
import java.io.IOException;
import java.util.logging.*;


public class Task2 {
    
        public static void main(String[] args) throws SecurityException, IOException {
        int[] array = {9, 5, 8, 1, 2, 1};
        
        Logger logger = Logger.getLogger(Logger.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        
        
       
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                   
                } 
                logger.setLevel(Level.ALL);
                logger.log(Level.ALL, Arrays.toString(array));
        } 
    } 
        System.out.println(Arrays.toString(array));
    }

    
        
}

        
    

