package DaHinh0;

public class NhanVien2 extends Nguoi2{
    private int luong;
    private int sonamKN;

    // ham tao
    public NhanVien2(String ten, int tuoi, int luong,int sonamKN){
        super(ten, tuoi);
        this.luong = luong;
        this.sonamKN = sonamKN;
    }


    public int getLuong(){
        return luong;
    }

    public void setLuong(int luong){
        this.luong = luong;
    }

    public int getSonamKN(){
        return sonamKN;
    }
    public  void setSonamKN(int sonamKN){
        this.sonamKN = sonamKN;
    }
}
