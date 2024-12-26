
//public class SinhVien extends Nguoi1 {// extends la ke thua
//    private String tenLop;
//    private float dtb;
//
//    public SinhVien(String ten,String queQuan, int tuoi){
//        super(ten,queQuan, tuoi);// cau lenh ke thua
//    }
////    public void test(){
////        this.tenLop = "111";
////        super.setTen("pham van chieu");
////    }
//
//
//}

package OOP.oopkethua;

public class SinhVien1 extends Nguoi1 {
    private String tenLop;
    private float dtb;
    public SinhVien1(String ten, String queQuan, int tuoi, String tenlop, float dtb){//super La thang cha
        super(ten, queQuan, tuoi);
        this.tenLop = tenlop;
        this.dtb = dtb;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }
    // cu phap tra ve p1
//    @Override
//    public String toString() {
//      return this.getTen()+"-"+this.getTuoi()+"-"+this.getQueQuan()+"-"+this.getTenLop()+"-"+this.getDtb();
//    }
    // c2 cu phap tra ve
    public String info(){
        return this.getTen()+"-"+this.getTuoi()+"-"+this.getQueQuan()+"-"+this.getTenLop()+"-"+this.getDtb();
    }
}


