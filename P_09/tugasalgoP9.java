import java.util.Scanner;
public class tugasalgoP9{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Nilai Pertama : ");
		int n1 = input.nextInt();
		System.out.print("Masukkan Nilai Kedua : ");
		int n2 = input.nextInt();
		System.out.println();
      	System.out.println("Sebelum Swapping, n1 = " +
                          	n1 + " dan n2 = " + n2);
      	swapFunction(n1, n2);
      	System.out.println("\n**Sekarang, Sebelum dan Setelah Swapping Nilai Akan SAMA**:");
      	System.out.println("  Setelah swapping, n1 = " +
                         	n1 + " dan n2 = " + n2);
       	System.out.println();
	}
   	public static void swapFunction(int n1, int n2) {
      	// Swap n1 with n2
      	int n3 = n1;
      	n1 = n2;
      	n2 = n3;
      	System.out.println("Setelah Swapping, n1 = " + n1
                           	+ " dan n2 = " + n2);
   }
}