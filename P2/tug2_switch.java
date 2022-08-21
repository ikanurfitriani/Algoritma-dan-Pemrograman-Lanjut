import java.util.Scanner;
public class tug2_switch {
	public static void main (String arg[]){
		Scanner in=new Scanner(System.in);
		int pil;
		String buku, jenis;
		System.out.println("	Jual/Beli Buku Bekas	");
		System.out.println("Pilih 1 untuk pembelian buku paket bekas");
		System.out.println("Pilih 2 untuk penjualan buku paket bekas");
		System.out.print("Masukkan pilihan Anda : ");
		pil=in.nextInt();
		System.out.print("Masukkan pilihan buku : ");
		buku=in.next();
		System.out.print("Masukkan jenis/tahun buku : ");
		jenis=in.next();
		System.out.println("---------------------------------------------------");
		switch(pil)
		{
			case 1:
			switch(buku)
			{
				case "SMA": case "MA": case "SMK":
				switch(jenis)
				{
					case "Terbaru":
						System.out.println("Harga Buku Paket Edisi Revisi "+jenis+" : Rp. 65.000/satuan buku");
						break;
					case "2016":
						System.out.println("Harga Buku Paket Edisi Revisi "+jenis+" : Rp. 60.000/satuan buku");
						break;
					case "2013":
						System.out.println("Harga Buku Paket Edisi Revisi "+jenis+" : Rp. 50.000/satuan buku");
						break;
					default:
						System.out.println("Salah masukkan jenis buku");
				}
				break;
				case "SMP": case "MTs": case "SD": case "MI":
				switch(jenis)
				{
					case "Terbaru":
						System.out.println("Harga Buku Paket Edisi Revisi "+jenis+" : Rp. 50.000/satuan buku");
						break;
					case "2016":
						System.out.println("Harga Buku Paket Edisi Revisi "+jenis+" : Rp. 45.000/satuan buku");
						break;
					case "2013":
						System.out.println("Harga Buku Paket Edisi Revisi "+jenis+" : Rp. 55.000/satuan buku");
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
				case "SMA": case "MA": case "SMK":
				switch(jenis)
				{
					case "Terbaru":
						System.out.println("Harga Jual Buku Paket Edisi Revisi "+jenis+" : Rp. 32.000/satuan buku");
						break;
					case "2016":
						System.out.println("Harga Jual Buku Paket Edisi Revisi "+jenis+" : Rp. 24.000/satuan buku");
						break;
					default:
						System.out.println("Salah masukkan jenis buku");
				}
				break;
				case "SMP": case "MTs": case "SD": case "MI":
				switch(jenis)
				{
					case "Terbaru":
						System.out.println("Harga Jual Buku Paket Edisi Revisi "+jenis+" : Rp. 20.000/satuan buku");
						break;
					case "2016":
						System.out.println("Harga Jual Buku Paket Edisi Revisi "+jenis+" : Rp. 15.000/satuan buku");
						break;
					default:
						System.out.println("Jenis buku lain sedang tidak dibutuhkan");
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
