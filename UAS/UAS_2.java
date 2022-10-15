import java.util.Scanner;
public class UAS_2 {
	public int jumlah() {
		Scanner input = new Scanner(System.in);
		int A, B;
		System.out.println("Persamaan X=3A+4B-A");
		System.out.print("Masukkan Nilai A : ");
		A = input.nextInt();
		System.out.print("Masukkan Nilai B : ");
		B = input.nextInt();
		return(3*A + 4*B - A);
	}
	public static void main(String[] args) {
		UAS_2 data = new UAS_2();
		System.out.println("X = " + data.jumlah());
	}
}