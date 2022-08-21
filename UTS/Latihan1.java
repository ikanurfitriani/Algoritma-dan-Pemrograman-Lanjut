import java.util.Scanner;
public class Latihan1
{
	public static void main(String args[])
	{
		Scanner masuk = new Scanner(System.in);
		String ipk, jenjang, matkul, sks, total;
		System.out.print("Masukkan ipk = ");
		ipk=masuk.next();
		System.out.print("Masukkan jenjang (D3/S1) : ");
		jenjang=masuk.next();
		if (jenjang.equals("D3")) {
			for (int i=1; i<=3; i++) {
				System.out.print("Masukkan mata kuliah : ");
				matkul=masuk.next();
				System.out.print("Masukkan sks : ");
				sks=masuk.next();
				total += sks;
			}
		}
		else {
			for (int i=1; i<=5; i++) {
				System.out.print("Masukkan mata kuliah : ");
				matkul=masuk.next();
				System.out.print("Masukkan sks : ");
				sks=masuk.next();
				total += sks;
			}
		}
		System.out.println("Total : "+total);
	}
}