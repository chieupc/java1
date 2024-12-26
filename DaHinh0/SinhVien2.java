package DaHinh0;

public class SinhVien2 extends Nguoi2 {
    private String maSV;
    private float dtb;
    public SinhVien2(String ten, int tuoi, String maSV,float dtb){
        super(ten, tuoi);
        this.maSV = maSV;
        this.dtb = dtb;
    }
    public String getMaSV(){
        return maSV;
    }

    public void setMaSV(String maSV){
        this.maSV = maSV;
    }

    public float getDtb(){
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }
}
