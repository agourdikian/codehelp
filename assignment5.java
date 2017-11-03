  import java.util.Scanner;
  public class Assignment_5 {
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
      
      if(!pivot.isEmpty() || original.contains(pivot)) {
        int pivotLength = pivot.length();
      
        pivotIndex = original.indexOf(pivot);
        System.out.print(original.substring(pivotIndex+pivotLength));
        System.out.print(pivot);
        System.out.print(original.substring(0, pivotIndex));
      }
      else
        System.out.println("Error: Invalid Input");
        
        
      }
    }
