import java.util.Arrays;
import java.util.Scanner;

public class Buoi8 {
////    // neu tinh ham cua chuoi thi su dung kieu int
////    public static int lengthString(String x){//cac bien trong day goi la bien tham so cua ham
//////    x = ['h','e','l','l','o'];
////    int i = 0;
////    int dem = 0;
//////    while (x.charAt(i) != null) {// dieu  kien no ko the dung thi dung vong lap while con for thi vong lap no co diem dung
//////        dem++;
//////        i++;
//////        //        return 0;
//////        }
////        try{// try la co gang lam gi do
////            while (x.charAt(i) !='\0'){//x.chartAt(i) no la no se lay ra ky tu tai vi tri thu i
////                dem++;
////                i++;
////            }
////        }
////        catch (Exception e){// la dung la chuong trinh neu ko thi no tang cai bien dem len
////            // EXception : dich ra la loi e : ben canh la bien
//////            System.out.println(e);// e ben trong la bien no se goi ra bien
////        }
////    return dem;
////    }
//    public static void nhap(int a[][],int h, int c){
//        Scanner sc = new Scanner(System.in);
//
//
//        for (int i = 0 ;  i < h;i++){
//            for (int j = 0 ;j < c;j++){
//                System.out.println("nhap gia tri a["+i+"]["+j+"]=");
//                //a tai vi tri i j bang sc. nextInt()
//                a[i][j] = sc.nextInt();
//            }
//        }
//    }
//    public static void xuat(int a[][], int h , int c){
//        for (int i = 0 ; i < h;i++){
//            for (int j = 0 ; j < c;j++){
//                System.out.print(a[i][j]+",");
//            }
//            System.out.println();
//        }
//    }
//    public static int max(int a[][], int h, int c){
//        int max = a[0][0];
//        for (int i = 0 ; i < h ; i++){
//            for (int j = 0 ; j< c ;  j++){
//                if (max<a[i][j]) max = a[i][j];
//            }
////            System.out.println();
//        }
//        return max;
//    }
//    public static void in(int n){         // in(5) !=0 5
//        if (n!=0){                        // in(5-1) <-> in(4)
//            System.out.print(n+" ");      // in (4-1) <-> in(3)
//            in(n-1);                   // in (3-1) <-> in (2)
//        }                                 // in (2-1) <-> in(1)
//    }                                     // in(1-1) <-> 0 stop

//    public static int a(){
//        return a();
//    }
//

//    public static int sum(int n){
//        if (n==0||n==1){
//            return 1;
//        }
//        return n+sum(n-1);
//    }

//    public  static void nhap( int arr[], int n , int i){
//        if (i!=n){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("nhap phan tu thu"+i+": ");
//            arr[i]= sc.nextInt();
//            nhap(arr,n,++i);
//        }
//    }
//    public static void xuat( int arr[], int n, int i){
//        if (i!=n){
//            System.out.print(arr[i]+", ");
//            xuat(arr,n,++i);
//        }
//    }

    //dau tien viet ham sum
//    public static int sum(int n){
//        if (n==1 || n==0) return 1;
//        return n*n +sum(n-1);
//    }

//    public static int sum(int n){
//        if (n==1|| n==0)return 1;
//        return n*sum(n-1);
//    }

//    public static int tong(int n){
//        if (n == 0|| n==1){
//            return 1;
//        }
//        return n + tong(n-1);
//    }
//    public static int tich(int n){
//        if (n==0||n == 1){
//            return 1;
//        }
//        return n * tong(n-1);
//    }
//
//    public static float sum(int n){
//        if (n == 1){
//            return 1;
//        }
//        return ((float) tong(n)/tich(n)) + sum(n-1);
//    }

    public static int sum(int n){
        if (n==0||n==1) return 1;
        return n+sum(n-1);
    }
    public static int tich(int n){
        if (n==0||n==1) return 1;
        return n*sum(n-1);
    }
    public static float sum2(int n){
        if (n==1) return 1;
        return ((float) sum(n)/tich(n)) + sum2(n-1);
    }

//    public static void main(String[] args) {
//
//
//    // su khac biet giua vong lap for voi de quy for(i=0;i<n;i++) dieu kien lap
//    // con de quy dung if() dieu kien dung
//
////////////        // chuoi la mot kieu du lieu
////////////        /*
////////////        String duoc tao boi mot mang cac xau ky tu
////////////        * */
////////////        String a = " hello";
//////////////        a = ['h','e','l','l','o'];
////////////        // thi trong chuoi con duoc goi la xau ky tu
////////////        String b= a + " world";
//////////////        System.out.println(b);
//////////////        System.out.println(b.charAt(3));//  char
////////////        //['a','b','c']=> 3=> 3-1
////////////        System.out.println(b.charAt(b.length()-1));// char
//////////        String arrString = "hello xinchao he";
////////////        int b [] = new int[100];
//////////        String cutArr[] = new String[100];
//////////        cutArr = arrString.split("l");// regex: la ghi phan nao vao thi cat phan do
//////////        System.out.println(Arrays.toString(cutArr));
////////        String a = "hii";// con bien nay goi la tham chieu cua bien day
//////////        System.out.println(a.length());
////////        lengthString(a);
//////        String a = "pham van chieu";
//////        int length = lengthString(a);
//////        System.out.println(length);// 5
////        // mang hai chieu
////        int a[][] = new int[5][3];// ban chat mang hai chieu nay nhu kieu ma tran
////        /*
////        // muon dung mang hai chieu can phai su dung for long
////        a =[ [1,2,3], => a[0][0] ,a[0],[1], a[0][2]
////           [5,9,10], => a[1][0] = 5 , a[1][1] = 9 , a[1][2] = 10
////           [56,11,2], => a[2][0] = 56 , a [2][1] = 11 , a [2][2] = 2
////           [9,8,2], => a[3][0] = 9 , a[3][1] = 8 , a[3][2] = 2
////           [3,6,4] ] => a[4][0] = 3 , a[4][1] = 6 ,a[4][2] = 4
////        * */
////        // viet nhap va xuat
////        int h,c;
////        System.out.println("nhap hang: ");
////        Scanner sc = new Scanner(System.in);
////        h = sc.nextInt();
////        System.out.println(" nhap cot: ");
////        c = sc.nextInt();
////        nhap(a,h,c);
////        System.out.println(" mang vua nhap la: ");
////        xuat(a,h,c);
////        System.out.println(" mang se la: ");
////        System.out.println("max ="+max(a,h,c));
//        // de quy
//        // bai toan la lam mot thua toan ve game caro
//        // de quy ban chat cung nhu mot cai vong lap
////        int n = 5;
////        in(n);
////        System.out.println(a());
//
//
////        int n = 5;
////        System.out.println(sum(n));
////        int arr[] = new int[100];
////        int n = 5;// so luong phan tu cho mang
////        int i=0;
////        nhap(arr,n,i);
////
////        // nhap xuat thi phai goi lai no ko gia tri se thay doi
////        n = 5;
////        i=0;
////        System.out.println(" cac pt vua nhap: ");
////        xuat(arr,n,i);
//
//        // 1^2 + 2^2 + 3^2 +... + n^2
//
////        System.out.println(sum(4));
//
////        System.out.println(sum(4));
//
//
////        System.out.println(sum(1));
//        System.out.println(sum2(5));
//    }

}
