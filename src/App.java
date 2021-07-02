import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        // Tìm chữ e trong dãy chữ Hello every one
    System.out.println("Tìm chữ e trong dãy chữ Hello every one");
        String h = "Hello every one";
        int e = 0;
        String viTri = "";
        for (int i = 0; i < h.length(); i++) {
            if (h.charAt(i) == 'e') {
                viTri += i + " ";
                e++;
            }
        }
        System.out.println("Số lần xuất hiện chữ e: " +e);
        System.out.println("Vị trí chữ e: " + viTri);
        
        // chuỗi Panlyndrome
    System.out.println("-------------------------------------------------------------------------");
    System.out.println("Xác dịnh chuỗi nhập có phải chuổi Panlyndrome hay không");
    
    String chuoi;
    char kyTu;
    Scanner scanner = new Scanner(System.in);
         
    System.out.println("Nhập vào chuỗi bất kỳ: ");
    chuoi = scanner.nextLine();
         
    for (int i = 0; i < chuoi.length(); i++) {
        kyTu = chuoi.charAt(chuoi.length() - i - 1);
             
        // kiểm tra ký tự tại vị trí i 
        // có giống với ký tự tại vị trí (chuoi.length() - i - 1) hay không
        if (chuoi.charAt(i) == kyTu) {
            System.out.println("Chuỗi này là chuỗi Panlyndrome.");
            break;
        } else {
            System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
            break;
        }
    }

        
    }
}
