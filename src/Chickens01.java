public class Chickens01 {
    public static void main(String[] args) {
           //contagem de ovos 
        
        int eggsPerChicken = 5;
        int chickenCount = 3;
        
        int totalEggs;        
        totalEggs = eggsPerChicken * chickenCount;
        
         System.out.println(totalEggs);
         
        chickenCount ++; 
        
        
        totalEggs += eggsPerChicken * chickenCount;
        
        System.out.println(totalEggs);
        
        chickenCount /= 2;
        
        totalEggs += eggsPerChicken * chickenCount;
        
        System.out.println(totalEggs);
        
    }
        
    }   

