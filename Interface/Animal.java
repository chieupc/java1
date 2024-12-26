package Interface;

public interface Animal {
    // de khai bao lop triu tuong phai dung interface
    // => di chuyen
    // + cho : chan
    // + chim : bay = canh

    //=> thuc an
    // + chim: sau
    // + meo: an thit

    // nhu nay nguoi ta sinh ra interface lop triu tuong
    // no duoc goi la cac method ma da la method thi no se khong co ten ham
    String diChuyen();
    String thucAn();
    int soChan();
    // tu khoa default bt xoa di no se noi luon thuong thuong interface co them ham,ham thi co than ham la dau bao dong la ngoac bao dong co ngoac bao dong them tu
    // khoa default
    default String tiengNoi(){
        return "gau gau";
    }
}
