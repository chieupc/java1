package OOP;

//public class TinhToan {
//    private int a;
//    private int b;
//    // luu y minh muon tao moi cai ham tao thi chuot phai
//    // xong vao Generate xong nhap vao Constructor xong enter
//
//    public TinhToan(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//    public int tong(){
//        return a+b;
//    }
//    public int tong (int c){// dang them chu ky ham
//        return a+b+c;
//    }
//    public int hieu(){
//        return a-b;
//    }
//    public int hieu(int c){// dang them chu ky ham
//        return a-b-c;
//    }
//    public int tich(){
//        return a*b;
//    }
////    public float tich(int e, int g,float h){
////        return e*g*h;
////    }
//    // co the viet main trong nay cung duoc khong nhat thiet phai viet main sang class khac chur yeu la tiet kiem
//    public static void main(String[] args){
//        TinhToan t = new TinhToan(5,6);
//        System.out.println(t.tong());
//        System.out.println(t.tong(1));
//        System.out.println(t.hieu());
//        System.out.println(t.hieu(2));
//        System.out.println(t.tich());
//
//    }
//}


// cach 1 dung ham chay thang
//public class TinhToan{
//    //nhap vao 2 chuoi String kiem tra xem no co bang nhau hay khong OOP
//    private String a;
//    private String b;
//
//    public TinhToan(String a, String b){
//        this.a = a;
//        this.b = b;
//    }
//    public boolean check(){
//        return a==b;
//    }
//
//    public static void main(String[] args){
//        TinhToan t = new TinhToan("chieu","chieu");
//        System.out.println(t.check());
//    }
//}

// cach hai dung for()
//public class TinhToan {
//
//    private String a;
//    private String b;
//
//    public TinhToan(String a , String b){
//        this.a = a;
//        this.b = b;
//    }
//    public boolean check(){
//        if (a==b)return true;
//        return false;
//    }
//    public static void main(String[] args){
//        TinhToan t = new TinhToan("chieu","chieu");
//        System.out.println(t.check());
//    }
//}


// cach 3 return sosanh la ra ket qua
//public class TinhToan {
//    private String a;
//    private String b;
//
//    public TinhToan(String a, String b){
//        this.a = a;
//        this.b = b;
//    }
//    public boolean check(){
//        return a==b;
//    }
//
//    public static void main(String[] args) {
//        TinhToan t = new TinhToan("chieu","chieu");
//        System.out.println(t.check());
//    }
//}


//// cach 4 dung equals
//public class TinhToan {
//    private String a;
//    private String b;
//
//    public TinhToan(String a, String b){
//        this.a = a;
//        this.b =b;
//    }
//    public boolean check(){
//        return a.equals(b);// equals cung la ham sosanh no co the so sanh nhieu doi tuong voi nhau
//    }
//
//    public static void main(String[] args) {
//        TinhToan t = new TinhToan("chieu","chieu");
//        System.out.println(t.check());
//    }
//}

//public class TinhToan {
//
//    private String a;
//    private String b;
//
//    public TinhToan(String a, String b){
//        this.a = a;
//        this.b = b;
//    }
//    public int convertToInteger(){// convot intoro
//        return Integer.parseInt(a)+10;// integer la so nguyen, pareInt la ep kieu
//
//    }
//
//    public static void main(String[] args) {
//        TinhToan t = new TinhToan("190","11");
//        System.out.println(t.convertToInteger());
//    }
//
//}

//public class TinhToan {
//
//    private String a;
//    private String b;
//
//    public TinhToan(String a,String b){
//        this.a = a;
//        this.b = b;
//    }
//    public float convertToFloat(){
//        return Float.parseFloat(a)+Float.parseFloat(b);
//    }
//
//    public static void main(String[] args) {
//        TinhToan t = new TinhToan("5.6","9.6");
//        System.out.println(t.convertToFloat());
//    }
//}


// dung kieu int
//public class TinhToan {
//    private int a;
//    public TinhToan(int a){
//        this.a = a;
//    }
//    public String converToString(){
//        String b = String.valueOf(a);
//        return b+" oki";// b dang o kieu chuoi
//    }
//
//    public static void main(String[] args) {
//        TinhToan t = new TinhToan(59);
//        System.out.println(t.converToString());
//    }
//}

// dung kieu float
public class TinhToan {
    private float a;
    public TinhToan(float a){
        this.a = a;
    }
    public String convertToString(){
        return String.valueOf(a);
    }

    public static void main(String[] args) {
        TinhToan t = new TinhToan(10.0f);
        System.out.println(t.convertToString());
    }
}