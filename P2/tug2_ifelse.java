import java.util.Scanner;
public class tug2_ifelse {
	public static void main (String arg[]){
		Scanner in=new Scanner(System.in);
		int pil;
		String buku, jenis;
		System.out.println("	Jual/Beli Buku Paket Bekas	");
		System.out.println("Pilih 1 untuk pembelian");
		System.out.println("Pilih 2 untuk penjualan");
		System.out.print("Masukkan pilihan Anda : ");
		pil=in.nextInt();
		System.out.print("Masukkan pilihan buku : ");
		buku=in.next();
		System.out.print("Masukkan jenis buku : ");
		jenis=in.next();
		System.out.println("---------------------------------------------------");
		if (pil == 1)
		{
			if (buku.equals("SMA")) {
				if (jenis.equals("Wajib"))
				System.out.println("Harga Buku Paket SMA "+jenis+" : Rp. 65.000");
				else if (jenis.equals("Peminatan"))
				System.out.println("Harga Buku Paket SMA "+jenis+" : Rp. 70.000");
				else if (jenis.equals("Lama"))
				System.out.println("Harga Buku Paket SMA "+jenis+" : Rp. 55.000");
				else
				System.out.println("Salah masukkan jenis buku");
			} else if (buku.equals("SMP")) {
				if (jenis.equals("Terbaru"))
				System.out.println("Harga Buku Paket SMP "+jenis+" : Rp. 60.000");
				else if (jenis.equals("Lama"))
				System.out.println("Harga Buku Paket SMP "+jenis+" : Rp. 50.000");
				else
				System.out.println("Salah masukkan jenis buku");
			} else {
				System.out.println("Salah masukkan pilihan buku");
			}
		} else if (pil == 2) {
			if (buku.equals("SMA")) {
				if (jenis.equals("Wajib"))
				System.out.println("Harga Jual Buku Paket SMA "+jenis+" : Rp. 25.000");
				else if (jenis.equals("Peminatan"))
				System.out.println("Harga Jual Buku Paket SMA "+jenis+" : Rp. 30.000");
				else
				System.out.println("Jenis buku lain sedang tidak dibutuhkan");
			} else if (buku.equals("SMP")) {
				if (jenis.equals("Terbaru"))
				System.out.println("Harga Jual Buku Paket SMP "+jenis+" : Rp. 20.000");
				else if (jenis.equals("Lama"))
				System.out.println("Harga Jual Buku Paket SMP "+jenis+" : Rp. 15.000");
				else
				System.out.println("Jenis buku lain sedang tidak dibutuhkan");
			} else {
				System.out.println("Salah masukkan pilihan buku");
			}
		} else {
			System.out.println("Salah masukkan pilihan");
		}
	}
}
