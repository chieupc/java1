package DaHinh0;

public class GiaoVien {
    private String trinhDo;
    private int soChong;

    public GiaoVien(String trinhDo, int soChong){
        this.trinhDo = trinhDo;
        this.soChong = soChong;
    }

    public String getTrinhDo(){
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo){
        this.trinhDo = trinhDo;
    }

    public int getSoChong(){
        return soChong;
    }

    public void setSoChong(int soChong){
        this.soChong = soChong;
    }
}
