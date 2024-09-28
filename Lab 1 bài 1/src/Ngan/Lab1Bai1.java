package Ngan;
import java.util.Scanner;
public class Lab1Bai1 {
	public static void main(String[] args) {
		

		
		        // Khởi tạo Scanner để đọc dữ liệu từ bàn phím
		        Scanner scanner = new Scanner(System.in);

		        // Nhập họ và tên
		        System.out.print(" Họ và tên: ");
		        String hoTen = scanner.nextLine();

		        // Nhập điểm trung bình
		        System.out.print(" Điểm TB: ");
		        double diemTB = scanner.nextDouble();

		        // Xuất thông tin ra màn hình
		        System.out.println("===== Thông Tin Sinh Viên =====");
		        System.out.print(" Họ và tên: " + hoTen + "\n");
		        System.out.printf(" %s %.0f điểm", hoTen, diemTB);
		        // Kết thúc Scanner
		        scanner.close();
		        
		}
}
