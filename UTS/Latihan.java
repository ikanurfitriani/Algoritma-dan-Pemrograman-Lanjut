import java.util.Scanner;
public class Latihan {
	public static void main(String args[]) {
		Scanner masuk = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		int sks[] = new int[10];
		int total=0, i=0;
		float ipk;
		String matkul[] = new String[10];
		String jenjang;
		System.out.print("Masukkan ipk = ");
		ipk=masuk.nextFloat();
		System.out.print("Masukkan jenjang (D3/S1) : ");
		jenjang=masuk.next();
		if (jenjang.equals("D3")) {
			while (i<=2) {
				System.out.print("Masukkan mata kuliah : ");
				matkul[i]=input.nextLine();
				System.out.print("Masukkan sks : ");
				sks[i]=masuk.nextInt();
				total += sks[i];
				i++;
			}
		}
		else if (jenjang.equals("S1")) {
			while (i<=4) {
				System.out.print("Masukkan mata kuliah : ");
				matkul[i]=input.nextLine();
				System.out.print("Masukkan sks : ");
				sks[i]=masuk.nextInt();
				total += sks[i];
				i++;
			}
		}
		System.out.println("Total : "+total);
	}
}