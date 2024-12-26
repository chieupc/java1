package OOP;

public class Buoi9 {
    public static void main(String[] args){
        /*
        huong doi tuong co hai cai
        object : doi tuong
        + tinh chat: Scanner sc = new Scanner();

        + co cac thuoc tinh => String ten=" pham van chieu, int tuoi= " 20,
        + co cac phuong thuc(mothod) => cac function(ham)
        +pham vi truy cap: public, protected, private,default
        class: cung bao quanh doi tuong nhung no co tinh dong goi

         +pham vi truy cap: public, protected, private,default

        vd don gian: nhu la con nguoi gom:
        + tay
        + chan
        + mat
        + mui
        vd2:
        sinh vien gom:
        +ten
        +tuoi:
        +que quan:
        +diem
        * */

//        int a = 5;
//        SinhVien sv1 = new SinhVien();
//        sv1.tuoi =5;
//    SinhVien sv1 = new SinhVien();
//    sv1.tuoi = 18;
//    sv1.hoTen = " pham van chieu";
//        System.out.println(sv1.hoTen);
//        System.out.println(sv1.tuoi);

//        SinhVien sv1 = new SinhVien();
//        sv1.nhap();
//        sv1.xuat();


//        SinhVien sv1 = new SinhVien();
//        sv1.nhap("pham van chieu", 20);
//        sv1.xuat();


//        SinhVien sv1 = new SinhVien();
//        sv1.setHoTen("pham van chieu ");
//        sv1.setTuoi(20);
//
//        System.out.println("ten: "+sv1.getHoTen());
//        System.out.println("tuoi: "+sv1.getTuoi());

//        SinhVien sv1 = new SinhVien();
//        sv1.truyenGTTen("pham van chieu");
//        sv1.truyenGTTuoi(21);
//        System.out.println(sv1.layHoTen());
//        System.out.println(sv1.layTuoi());

        SinhVien sv1 = new SinhVien("pham van chieu", 20);
        System.out.println(sv1.getHoTen());
        System.out.println(sv1.getTuoi());
        System.out.println(sv1.getQueQuan());

        SinhVien sv2 = new SinhVien("pham van chieu", 19, "tu son");
        System.out.println(sv2.getHoTen());
        System.out.println(sv2.getTuoi());
        System.out.println(sv2.getQueQuan());
        // nguoi ta goi day la chu ky ham nghia la minh co hai ham cung ten nhau nhung ma tham so truyen vao khac nhau van oki con goi la ovo lot

        // ham tao nay khac nhau minh truyen tham so nao vao thi no se tu hieu
        SinhVien sv3 = new SinhVien(20);
    }
}
