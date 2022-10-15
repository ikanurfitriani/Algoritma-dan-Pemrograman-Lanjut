import java.util.Scanner;
public class tugasalgo_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Nilai Pertama : ");
		int n1 = input.nextInt();
		System.out.print("Masukkan Nilai Kedua : ");
		int n2 = input.nextInt();
		System.out.println();
		System.out.println("Sebelum di Swap : ");
		System.out.println(" Nilai Pertama : " + n1);
		System.out.println(" Nilai Kedua : " + n2);
		System.out.println();
     	// Swap n1 with n2
      	n1 = n1 + n2;
      	n2 = n1 - n2;
      	n1 = n1 - n2;
      	System.out.println("Setelah di Swap : ");
      	System.out.println(" Nilai Pertama : " + n1);
		System.out.println(" Nilai Kedua : " + n2);
	}
}