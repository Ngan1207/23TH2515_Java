package Ngan;
import java.util.Scanner;
import java.text.DecimalFormat;
public class doingoaite {
		    // Tỷ giá 1 USD = 24000,00 VND
		    public static final double USD_TO_VND_RATE = 24000.00;
		 // Tỷ giá 1 JPY = 170,00 VND
		    public static final double JPY_TO_VND_RATE = 170.00;
		    // Chuyển đổi từ USD sang VND
		    public static double usdToVnd(double usd) {
		        return usd * USD_TO_VND_RATE;
		    }
		 // Chuyển đổi từ JPY sang VND
		    public static double jpyToVnd(double jpy) {
		        return jpy * JPY_TO_VND_RATE;
		    }
		    // Chuyển đổi từ VND sang USD
		    public static double vndToUsd(double vnd) {
		        return vnd / USD_TO_VND_RATE;
		    }
		 // Chuyển đổi từ VND sang JPY
		    public static double vndTojpy(double vnd) {
		        return vnd / JPY_TO_VND_RATE;
		    }
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println(" Nhập 1: USD -> VND ");
		        System.out.println(" Nhập 2: VND -> USD ");
		        System.out.println(" Nhập 3: JPY -> VND ");
		        System.out.println(" Nhập 4: VND -> JPY ");
		        System.out.print(" Chọn loại chuyển đổi: "); 
		        int choice = scanner.nextInt();

		        if (choice == 1) {
		            System.out.println(" Nhập số tiền USD: ");
		            double usd = scanner.nextDouble();
		            double vnd = usdToVnd(usd);
		         // Định dạng VND và USD không có dạng khoa học
		            DecimalFormat dfVND = new DecimalFormat("#,###");
		            DecimalFormat dfUSD = new DecimalFormat("#,###.00");
		         // Sử dụng DecimalFormat để làm tròn và định dạng
		            String formattedUSD = dfUSD.format(usd);
		            String formattedVND = dfVND.format(vnd);
		            System.out.println(formattedUSD + " USD = " + formattedVND + " VND ");}
		        
		        else if (choice == 3) {
		        	System.out.println(" Nhập số tiền JPY: ");
		            double jpy = scanner.nextDouble();
		            double vnd = jpyToVnd(jpy);
		         // Định dạng VND và JPY không có dạng khoa học
		            DecimalFormat dfVND = new DecimalFormat("#,###");
		            DecimalFormat dfJPY = new DecimalFormat("#,###.00");
		         // Sử dụng DecimalFormat để làm tròn và định dạng
		            String formattedJPY = dfJPY.format(jpy);
		            String formattedVND = dfVND.format(vnd);
		            System.out.println(formattedJPY + " JPY = " + formattedVND + " VND ");}
		            
		        else if (choice == 2) {
		            System.out.println(" Nhập số tiền VND: ");
		            double vnd = scanner.nextDouble();
		            double usd = vndToUsd(vnd);
		         // Định dạng VND và USD không có dạng khoa học
		            DecimalFormat dfVND = new DecimalFormat("#,###");
		            DecimalFormat dfUSD = new DecimalFormat("#,###.00");
		         // Sử dụng DecimalFormat để làm tròn và định dạng
		            String formattedVND = dfVND.format(vnd);
		            String formattedUSD = dfUSD.format(usd);
		            System.out.println(formattedVND + " VND = " + formattedUSD + " USD");}
		        
		        else if (choice == 4) {
		            System.out.println(" Nhập số tiền VND: ");
		            double vnd = scanner.nextDouble();
		            double jpy = vndTojpy(vnd);
		         // Định dạng VND và JPY không có dạng khoa học
		            DecimalFormat dfVND = new DecimalFormat("#,###");
		            DecimalFormat dfJPY = new DecimalFormat("#,###.00");
		         // Sử dụng DecimalFormat để làm tròn và định dạng
		            String formattedVND = dfVND.format(vnd);
		            String formattedJPY = dfJPY.format(jpy);
		            System.out.println(formattedVND + " VND = " + formattedJPY + " JPY ");}
		        else {
		            System.out.println(" Lựa chọn không hợp lệ. ");}

		        scanner.close();
		    }
}

