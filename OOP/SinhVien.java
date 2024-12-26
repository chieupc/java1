package OOP;

//public class SinhVien {
////////    public int tuoi;
////////    String hoTen;
////////    int tuoi;
//////    // trong huong doi tuong minh co rat nhieu cach de set gia tri cho no
//////    // private : chi cung class moi duoc truy cap toi no
//////    // con public : thi class nao cung co the co quyen duoc truy cap toi no
////////    private String hoTen;
////////    private int tuoi;
////////    private Scanner sc = new Scanner(System.in);
////////    public void nhap(){
////////        System.out.println("nhap ten: ");
////////        hoTen = sc.nextLine();
////////        System.out.println(" nhap tuoi: ");
////////        tuoi = sc.nextInt();
////////    }
////////    public void  xuat(){
////////        System.out.println("ho ten: "+ hoTen);
////////        System.out.println("tuoi: "+ tuoi);
////////    }
//////    private String hoTen;
//////    private int tuoi;
//////    private Scanner sc = new Scanner(System.in);
//////    // neu truyen tham so
//////    public void nhap(String hoTen, int age){
//////
//////        // luu y this chinh la con tro this no tro chinh doi tuong nay
//////        this.hoTen= hoTen;
//////        this.tuoi =age;
//////    }
//////    public void xuat(){
//////        System.out.println("ho ten: "+ this.hoTen);
//////        System.out.println("tuoi: "+ this.tuoi);
//////    }
////    // neu set 1 gia tri cho no thi o tren
////    // con phan nay la phan set hai gia tri
////
////    private String hoTen;
////    private int tuoi;
////    // minh goi ham hoTen o class sinh vien se bang ben trong ham setHoTen
////    public void setHoTen(String hoTen){
////        this.hoTen = hoTen;
////    }
////    public void setTuoi(int tuoi){
////        this.tuoi = tuoi;
////    }
////    public String getHoTen(){// get la lay
////        return this.hoTen;
////    }
////    public int getTuoi(){
////        return this.tuoi;
////    }
////    // luu y set va get la co cac chuc nang gan hoac lay gia tri cua thuoc tinh nao do
//
////    private String hoTen;
////    private int tuoi;
////    public void truyenGTTen(String hoTen){
////        this.hoTen = hoTen;
////    }
////    public void truyenGTTuoi(int tuoi){
////        this.tuoi = tuoi;
////    }
////    public String layHoTen(){
////        return this.hoTen;
////    }
////    public int layTuoi(){
////        return this.tuoi;
////    }
//
//}

// su khac biet giua ham tao minh goi ham tao nao truoc thi ham do se duoc chay truoc nhu kieu minh goi ham public SinhVien(String hoTen, int tuoi){} truoc thi se duoc chay truoc
// ham SinhVien(String hoTen, int tuoi, String queQuan){} se bi goi sau
// luu y ham duoc goi se in chu trang con ham chua chay se in chi xam
public class SinhVien {
    private String hoTen;
    private int tuoi;
    private String queQuan;
    public SinhVien(int tuoi){// ham tao nay tuong duong sv3
        this.tuoi= tuoi;
    }
    public  SinhVien(String hoTen, int tuoi){// ham tao nay tuong duong sv1
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }
    public SinhVien(String hoTen, int tuoi,String queQuan){// ham tao nay tuong duong sv2
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }
}


