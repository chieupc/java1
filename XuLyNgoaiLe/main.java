package XuLyNgoaiLe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
////        NhanVien nv = new NhanVien();
////        nv.hello();
//////        nv.thongTin();
//        // xulyngoaile la
////        System.out.println();
//        System.out.println("hehe");
////        int a = 5/0;
////        try {
////            int a = 5/0;
////        }
////        catch (Exception ArithmeticException ){// cu phap goi loi cua no
////            //luu y exception cung nhu la 1 cai bien con dong tiep theo chinh la ten bien goi ra
////            System.out.println("cai nay dang loi nay: ");
////        }
////        System.out.println("hihi");
//        try{
//            int a = 5/0;
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        // bai tap la nhap vao thong tin cua khach hang
        // vd nhap sdt 025a252525=> fail
        // 012345678 => ok

    // cach viet bang try catch
//        String numberPhone;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap sdt: ");
//        numberPhone = sc.nextLine();
//        try{
//            Integer.parseInt(numberPhone);
//            System.out.println("thong tin sdt:"+numberPhone
//            );
//        }
//        catch (NumberFormatException e){
//            System.out.println("dinh dang so dt khong dung");
//        }
        // cach viet bang if else
        String numberPhone;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap sdt: ");
        numberPhone = sc.nextLine();
        char c[] = {'!','@','?'};
        // pham van chieu
        boolean check = true;
        for (int i=0;i<numberPhone.length();i++){

                for (int j = 0;j<c.length;j++){
                    if(numberPhone.charAt(i) == c[j]){
                        System.out.println("ten khong hop le");
                        check = false;
                        break;
                    }
                }

        }
        if (check==true){
            System.out.println("dr");
        }
    }
}
