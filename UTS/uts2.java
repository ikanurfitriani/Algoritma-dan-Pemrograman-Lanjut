import java.util.Scanner;
public class uts2{
	public static void main (String arg[]){
		Scanner in=new Scanner(System.in);
		int nilai, i;
		System.out.print("Masukkan nilai (0 100) = ");
		nilai=in.nextInt();
		if (nilai>50){
			for (i=1; i<=4; i++) {
				System.out.println("Pintar...! ");
			}
		}
		else if (nilai <= 50){
			for (i=1; i<=4; i++) {
				System.out.println("Usaha Lagi ya...");
			}
		}
	}
}