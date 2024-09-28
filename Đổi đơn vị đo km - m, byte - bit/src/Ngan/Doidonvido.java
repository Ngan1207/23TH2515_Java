package Ngan;
import java.util.Scanner;

public class Doidonvido {

	    // 1 km = 1000 meters
	    public static final int METERS_PER_KM = 1000;
	  //1 byte = 8 bits
        public static final int BITS_PER_BYTE = 8;

	    // Chuyển đổi từ km sang m
	    public static int kilometersToMeters(double kilometers) {
	        return (int) (kilometers * METERS_PER_KM);
	    }
	    // Chuyển đổi từ byte sang bit
        public static int bytesToBits(int bytes) {
            return bytes * BITS_PER_BYTE;
        }
        
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Nhập số lượng km: ");
	        double kilometers = scanner.nextDouble();
	        
	        System.out.println("Nhập số lượng byte: ");
            int bytes = scanner.nextInt();
	        
	        int meters = kilometersToMeters(kilometers);
	        System.out.println(kilometers + " km = " + meters + " m");
	        
	        int bits = bytesToBits(bytes);
            System.out.println(bytes + " byte(s) = " + bits + " bit(s)");
	        
	        scanner.close();
	    }
	}
