import java.util.Scanner;
public class tujuh {
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int[] array = new int[5];
      int sum = 0;
      System.out.println("jumlah bilangan :5");
      System.out.println("masukkan bilangan array:");
      for (int i=0; i<5; i++)
      {
      array[i] = scanner.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Jumlah Dari Semua Elemen Array Adalah :"+sum);
   }
 }