package DaHinh0;


import java.util.Objects;

public class main {
    public static void main(String[] args) {
////        Nguoi2 ng = new NhanVien2("pham van a",29,5000,5);
////        System.out.println(ng.getTen());
////
////
//////        NhanVien2 nv = (NhanVien2) new Nguoi2 ("pham van chieu",30);
////
////        Nguoi2 ng1 = new Nguoi2("pham van b",30);
////        System.out.println(ng1.getTen());
////
////        NhanVien2 nv = new NhanVien2("pham van c",20,90000,2);
////        Nguoi2 ng2 = (Nguoi2) nv;
////        System.out.println(ng2.getTen());
////
////
////        GiaoVien gv = new GiaoVien("A",2);
////        System.out.println(gv.getTrinhDo());
////        System.out.println(gv.getSoChong());
//
//        // vd xem no co pham ch con voi nhau khong
//
//        Nguoi2 ng = new Nguoi2("pham van a",21);
//        NhanVien2 nv = new NhanVien2("pham van b", 21,5000,2);
////        GiaoVien gv = new GiaoVien("A",1);
//
//        if(NhanVien2.class.isInstance(nv)){
//            System.out.println("la cha con: ");
//        }
//        else {
//            System.out.println("khong la cha con: ");
//        }

        // tu khoa Object nay duoc sinh ra de lam cha cac doi tuong khac
        Object object = new NhanVien2("pham van a",21,90000,1);
        Nguoi2 ng = (Nguoi2) object;
        System.out.println(ng.getTuoi());
        Object object1 = new Nguoi2("pham van b",20);
//        Nguoi2 ng = (Nguoi2) object;
//        System.out.println(ng.getTuoi());


    }
}
