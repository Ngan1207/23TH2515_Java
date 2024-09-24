package Ngan;
import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		
		System.out.println("-------NHAP XUAT-------");
		
		
		String hoTen;
		int tuoi;
		double chieuCao;
		double canNang;
		
		Scanner banPhim; 
		banPhim = new Scanner(System.in);
		
		
		
		System.out.print("Họ tên? ");
		hoTen= banPhim.nextLine(); 
		System.out.print("Tuổi? ");
		tuoi = banPhim.nextInt();
		System.out.print("Chiều cao (m)? ");
		chieuCao = banPhim.nextDouble();
		System.out.print("Cân nặng (kg)? ");
		canNang = banPhim.nextDouble();
		
		
		System.out.println("===========================");
		System.out.println("Họ tên:" + hoTen);
		System.out.println("Tuổi: " + tuoi);
		System.out.println("Cân Nặng: " + canNang);
		System.out.println("Chiều Cao: " + chieuCao);
		System.out.println("===========================");
	}

}
