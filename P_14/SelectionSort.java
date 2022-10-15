import java.util.Scanner;
public class SelectionSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan Jumlah Bilangan : ");
		int jumlah = scan.nextInt();
		int[] array = new int[jumlah];
		for(int x=0; x<jumlah; x++) {
			System.out.print("Bilangan Ke-" + (x+1)+" = ");
			array[x]=scan.nextInt();
		}
		System.out.print("Bilangan Sebelum Diurutkan : ");
		for(int x=0; x<jumlah; x++) {
			System.out.print(array[x] +" ");
		}
		for(int x=0; x<(jumlah-1); x++) {
			for(int y=0; y<jumlah; y++) {
				boolean swap = false;
				int index = 0;
				int min = array[x];;
				for(int y = x+1; y<jumlah; y++) {
					if(min > array[y]){
						swap = true;
						index = y;
						min = array[y];
					}
				}
				if(swap == true) {
					int temp = array[x];
					array[x] = array[index];
					array[index] = temp;
				}
				for(int y=0; y<jumlah; y++);
			}
			System.out.print("\nBilangan Setelah Diurutkan : ");
			for(int x=0; x<jumlah; x++)
			System.out.print(array[x] +" ");
			System.out.println("");
		}
	}
}