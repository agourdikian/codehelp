  import java.util.Scanner;
  class Assignment_5 {
    public static String [] list = {};
    public static void main (String[]args) {
    
      Scanner scan = new Scanner (System.in);
      
     
      int pivotIndex;
      
      
      
      
      System.out.println("Enter the first string: ");
      String original = scan.nextLine();
      System.out.println(original);
      int originalLength = original.length();
      
      System.out.println("Enter the pivot string: ");
      String pivot = scan.nextLine();
      System.out.println(pivot);
      int pivotLength = pivot.length();
      
      pivotIndex = original.indexOf(pivot);
      
      for (pivotIndex|= 0){
        System.out.print(original.substring(pivotIndex+pivotLength) + " ");
        System.out.print(pivot + " ");
        System.out.print(original.substring(0, pivotIndex));
        
        
      }
    }
  }
