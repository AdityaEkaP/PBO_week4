package pertemuan4_pbo;

import java.util.Scanner;

public class latihan2 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        char ulang;

	        do {
	            System.out.println("Masukkan nilai a: ");
	            double a = input.nextDouble();

	            System.out.println("Masukkan nilai b: ");
	            double b = input.nextDouble();

	            System.out.println("Masukkan nilai c: ");
	            double c = input.nextDouble();

	            double d = (b * b) - (4 * a * c);
	            double x1, x2;

	            if (d > 0) {
	                x1 = (-b + Math.sqrt(d)) / (2 * a);
	                x2 = (-b - Math.sqrt(d)) / (2 * a);
	                System.out.println("Akar-akar persamaan: x1 = " + x1 + " dan x2 = " + x2);
	            } else if (d == 0) {
	                x1 = -b / (2 * a);
	                System.out.println("Akar-akar persamaan: x1 = x2 = " + x1);
	            } else {
	                System.out.println("Akar-akar persamaan imaginer.");
	            }

	            System.out.println("Apakah anda ingin mengulang program? [Y/T]");
	            ulang = input.next().charAt(0);
	        } while (ulang == 'Y' || ulang == 'y');

	        System.out.println("Program selesai.");

	}

}
