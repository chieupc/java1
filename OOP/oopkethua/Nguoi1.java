package OOP.oopkethua;

//public class SinhVien1
//{
//    private String ten;
//    private String queQuan;
//    private int tuoi;
//    private String lop;
//    private float dtb;
//
//}
//public class CongNhan{
//    private String ten;
//    private String queQuan;
//    private int tuoi;
//    private float luongCb;
//    private int soNgay;
//    // trung cac thuoc tinh minh muon viet the nao de toi uu, trong java co mot cai goi la tinh ke thua,
//    // cac thuoc tinh co trung gia tri voi thuoc tinh cha thi no goi la con
//}
public class Nguoi1 {
    private String ten;
    private String queQuan;
    private int tuoi;

    public Nguoi1(String ten, String queQuan, int tuoi) {
        this.ten = ten;
        this.queQuan = queQuan;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

}