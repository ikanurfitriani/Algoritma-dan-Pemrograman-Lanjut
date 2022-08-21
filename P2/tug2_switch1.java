import java.util.Scanner;
public class tug2_switch1 {
	public static void main (String arg[]){
		Scanner in=new Scanner(System.in);
		int pil;
		String buku, jenis;
		System.out.println("	Jual/Beli Buku Bekas	");
		System.out.println("Pilih 1 untuk pembelian buku bekas");
		System.out.println("Pilih 2 untuk penjualan buku bekas");
		System.out.print("Masukkan pilihan Anda : ");
		pil=in.nextInt();
		System.out.print("Masukkan pilihan buku : ");
		buku=in.next();
		System.out.print("Masukkan jenis buku : ");
		jenis=in.next();
		System.out.println("---------------------------------------------------");
		switch(pil)
		{
			case 1:
			switch(buku)
			{
				case "Sekolah":
				switch(jenis)
				{
					case "Wajib":
						System.out.println("Harga Buku Sekolah "+jenis+" : Rp. 55.000/satuan buku");
						break;
					case "Peminatan":
						System.out.println("Harga Buku Sekolah "+jenis+" : Rp. 60.000/satuan buku");
						break;
					case "Kumpulan soal UN":
						System.out.println("Harga Buku Sekolah "+jenis+" : Rp. 75.000/satuan buku");
						break;
					default:
						System.out.println("Salah masukkan jenis buku");
				}
				break;
				case "Non Akademik":
				switch(jenis)
				{
					case "Novel":
						System.out.println("Harga Buku Non Akademik "+jenis+" : Rp. 50.000/novel");
						break;
					case "Komik":
						System.out.println("Harga Buku Non Akademik "+jenis+" : Rp. 40.000/komik");
						break;
					case "Biografi Tokoh":
						System.out.println("Harga Buku Non Akademik "+jenis+" : Rp. 55.000/biografi tokoh");
						break;
					default:
						System.out.println("Jenis buku lain sedang tidak tersedia");
				}
				break;
				default:
					System.out.println("Salah masukkan pilihan buku");
			}
			break;
			case 2:
			switch(buku)
			{
				case "Sekolah":
				switch(jenis)
				{
					case "Wajib":
						System.out.println("Harga Jual Buku Sekolah "+jenis+" : Rp. 18.000/satuan buku");
						break;
					case "Peminatan":
						System.out.println("Harga Jual Buku Sekolah "+jenis+" : Rp. 20.000/satuan buku");
						break;
					default:
						System.out.println("Salah masukkan jenis buku");
				}
				break;
				case "Non Akademik":
				switch(jenis)
				{
					case "Novel":
						System.out.println("Harga Jual Buku Non Akademik "+jenis+" : Rp. 10.000/novel");
						break;
					case "Biografi Tokoh":
						System.out.println("Harga Jual Buku Non Akademik "+jenis+" : Rp. 15.000/biografi tokoh");
						break;
					default:
						System.out.println("Jenis buku lain sedang tidak tersedia");
				}
				break;
				default:
					System.out.println("Salah masukkan pilihan buku");
			}
			break;
			default:
				System.out.println("Salah masukkan pilihan awal");
		}
	}
}
