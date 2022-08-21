import java.util.Scanner;
public class BubbleSort2{
    public static void main(String[] args){
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data : ");
        int jumlah_data = masuk.nextInt();
        int[] data = new int[jumlah_data];
        System.out.println();
        for(int a = 0; a < jumlah_data; a++)
        {
            System.out.print("Nilai Data ke-"+(a+1)+" : ");
            data[a] = masuk.nextInt();
        }
        System.out.println("\nData Sebelum di Sorting");
        for(int a = 0; a < jumlah_data; a++)
            System.out.print(data[a]+" ");

        System.out.println("\nProses Bubble Sort");
        for(int a = 0; a < jumlah_data; a++)
        {
            System.out.println("Iterasi ke-"+(a+1)+" :");
            for(int b = 0; b < jumlah_data; b++)
                System.out.print(data[b]+"  ");

            System.out.println("   Bandingkan "+data[0]+" dengan "+data[1]);
            for(int b = 0; b < jumlah_data-1; b++)
            {
                String pesan = "   Tidak ada pertukaran";
                if(data[b] > data[b+1])
                {
                    pesan = "   Data "+data[b]+" ditukar dengan "+data[b+1];
                    int temp = data[b];
                    data[b] = data[b+1];
                    data[b+1] = temp;
                }
                if(b < jumlah_data-(a+1))
                {
                    for(int c = 0; c < jumlah_data; c++)
                        System.out.print(data[c]+"  ");
                        System.out.println(pesan);;
                }
            }
            System.out.println("\n");
        }
        System.out.print("Data Setelah di Sorting : ");
        for(int a = 0; a < jumlah_data; a++)
            System.out.print(data[a]+"  ");
    }
}