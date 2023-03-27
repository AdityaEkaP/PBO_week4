package pertemuan4_pbo;
import java.util.Scanner;

public class latihan3 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        int detik, menit, jam, hari, sisa1, sisa2, sisa3;
	        String ulang;

	        do {
	            System.out.print("Masukkan jumlah detik: ");
	            detik = input.nextInt();

	            hari = detik / 86400;
	            sisa1 = detik % 86400;

	            jam = sisa1 / 3600;
	            sisa2 = sisa1 % 3600;

	            menit = sisa2 / 60;
	            sisa3 = sisa2 % 60;

	            System.out.println("detik : " + detik + "\n" + "hari : " +  hari + "\n" +  "jam : " +  jam + "\n" + "menit : "  +  menit + "\n" + "detik : " + sisa3);

	            System.out.print("Input data lagi [Y/T]? ");
	            ulang = input.next();
	        } while (ulang.equalsIgnoreCase("Y"));

	        input.close();

	}

}
