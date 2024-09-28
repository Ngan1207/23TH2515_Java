package Ngan;
import java.util.Scanner;
public class Lab1Bai2 {
	public static void main(String[] args) {
		String RED = "\u001B[32m";
		String RESET = "\u001B[32m";
		// Khởi tạo Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng của hình chữ nhật
        System.out.print(RED + "Nhập chiều dài (dai): " + RESET);
        double dai = scanner.nextDouble();

        System.out.print(RED + "Nhập chiều rộng (rong): " + RESET);
        double rong = scanner.nextDouble();

        // Tính chu vi, diện tích và cạnh nhỏ nhất
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);

        // Xuất kết quả ra màn hình
        System.out.printf("Chu vi: %.0f\n", chuVi);
        System.out.printf("Diện tích: %.0f\n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.0f\n", canhNhoNhat);

        // Đóng Scanner
        scanner.close();

	}
}
