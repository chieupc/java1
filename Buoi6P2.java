import java.util.Scanner;

public class Buoi6P2 {
    public static void nhapMang(int arr[], int n){
        //Scaner sc = new Scanner(SYstem.in); khai baoor day de low
        for (int i = 0; i <n; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("nhap vao phan tu thu"+i+": ");
            arr[i] = sc.nextInt();
        }
    }
    public static void xuatMang(int arr[], int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void ptLe(int arr[], int n){
        for (int i = 0; i < n; i++) {
            if (arr[i]%2 != 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
//    public  static void ptChan(int arr[], int n){
//        for (int i = 0; i < n; i++) {
//            if (arr[i]%3 !=0) {
//                System.out.println(arr[i]+" ");
//            }
//        }
//    }
    // tinh tong chan cac pt trong mang viet ham
    // co hai cach viet c1 la dung int c2 la dung void
    //c1
//   public static int tongChan(int arr[], int n){
    //c1 se co va dung return ;
    //c2
    public static void tongChan(int arr[], int n){
        int tong = 0;
       for (int i = 0; i <n; i++) {
           if (arr[i]%2 == 0) {
               tong+=arr[i];// => duoc viet tat cho tong=tong+arr[i];
           }
       }
       // c1
//       return tong;
        System.out.println("tong la:"+tong);
   }
   // viet ham kiem tra xem so do co ton tai trong mang hay khong
    public static boolean timKiem(int arr[], int n, int x){
        for (int i = 0; i <n; i++) {
            if(x== arr[i]) return true;
        }
        return false;
    }
    // ham sap xep day la mang sap xep tang dan
    public static void sapXep(int arr[], int n){
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n; j++) {
                if(arr[i]>arr[j]){
                    int t = arr[i];
                    arr[i]=arr[j];
                    arr[j]= t;
                }
            }
        }
    }

    // vi sao de kieu int thanh public static int vi int la tim vi tri
    public static int binarySearch(int arr[],int n, int left, int right, int x){
        int mid;
        while (left <= right){
            mid = (left+right) / 2;
            if (arr[mid] < x) left = mid + 1;
            else if (arr[mid] > x) right = mid -1;
            else if(arr[mid] == x) return arr[mid];
        }
        return - 1;
    }
    public static void demSoLanXuatHien(int arr[],int n){
            int b[] = new int[n];
            for (int i = 0; i < n-1; i++){
                if (b[i]==0){
                int dem = 1;
                for (int j = i + 1; j < n; j++){

//                    if (b[j]==0){
//                        int dem = 0;
                        if (arr[i]==arr[j]){
                            b[j] = 1;
                            dem++;
                        }
//                            System.out.println(arr[i] + "xuat hien"+ dem + "lan");
                    }
                    System.out.println(arr[i] + "xuat hien "+ dem +"lan");
                }
//                System.out.println(arr[i] + "xuat hien "+ dem +"lan");
        }
    }
//    }
//    public static void main(String[] args) {
//            int arr[] = new int[100];
//            int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap so luong phan tu cua mang: ");
//        n = sc.nextInt();
//        nhapMang(arr,n);
//        xuatMang(arr,n);
////        nhapMang(arr,n);
////        xuatMang(arr,n);
////        System.out.println("cac phan tu le ");
////        ptLe(arr,n);
//////        System.out.println("cac phan tu chan");
//////        ptChan(arr,n);
////        // c1 int
//////        int tong = tongChan(arr,n);
//////        System.out.println(tong);
////        tongChan(arr,n);
////        System.out.println("nhap so can kiem tra vao day: ");
////        int x = sc.nextInt();
////        System.out.println(timKiem(arr, n, x));
//
//
////        // thuat toan phuc tap la thuat toan tinh cach buoc tinh toan
////        for (int i = 0;i < 5;i++){
////            for(int j = 0; j < 5;j++ ){
////                System.out.println();
//////            }
////        }
//        // thuat toan tim kiem nhi phan la no sap xep cai mang day theo thu tu tang hoac giam dan
//        // 5/2=2
//        //  l           r
//        // |9|15|26|66|90| mid = 2 thi no se lay tu 9 , 15 con 26 la 2
//        //  0  1  2  3  4
//        //|9|15|   |26|66|90|
//        //
//        //co may truong hop neu dat x = 90
//        // co 5 mang nhung lam thuat toan nhi phan thi se bang
//        // 5 / 2 = 2 se nam o mang 26 chinh la mid neu 2 truong hop
//        //mid > x => l = mid+1
//        //mid < x => r = mid-1
//
//        // day la mang sap xep tang dan
////        sapXep(arr, n);
////        System.out.println("mang sau khi sap xep");
////        xuatMang(arr,n);
//
//
////        System.out.println("nhap so can kiem tra: ");
////        int x =sc.nextInt();
////        System.out.println(timKiem(arr,n,x));
////        if (binarySearch(arr,n,0,n-1,x)!= -1){
////            System.out.println("co ton tai");
////        }
////        else {
////            System.out.println("ko ton tai");
////        }
//        // [3][6]][11][20][26][33]
//        //  0  1    2   3   4   5
//        //x=26
//        //mid = 11
//        // neu l nho hon r
//        // (0+5)/2
//        //l =0-> l = mid+1 = 3
//        //r =5-> (l+r)/2 = (3+5)/2=4 -> 4[26]
//        // return
//        //
//
//        // [9][22][30][36][52][63][77]
//        //  0   1   2   3   4   5   6     7-1
//        // neu ban chon dat x = 63
//        // l = 0
//        // r = 6
//        //mid = (l+r)/2 = 6/2 = 3 ->mid = 3
//        //a[mid]= 36 x > arr[mid]
//        // l = mid + 1 = 3 +1 = 4
//        // luc nay mid se cap nhat lai vi tri
//        // mid = (l+r)/2 = 4 +6 = 10 /2 = 5
//        //
//        // con nguoc lai x = 22
//        // l = 0
//        // r = 6
//        // mid =(l+r)/2 = 0+6 / 2 =3
//        //a[mid]=36   ->  a[mid]>x => r = mid-1 = 3 -1 = 2
//        // luc nay mid se cap nhat lai vi tri
//        // mid = (0+2)/2=1
//        //a [mid]=22 luc nay thi bang x =22 thi return
//        // kieu thu nho phan tim kiem
//        // dung hai thuat toan len phep tinh se nhanh hon
//
//        //thuat toan danh dau
//        // bai toan nhu sau dem so lan xuat hien cac chu so trong mang
//        // a =[1,2,33,33,2,1,55,6,2,11,3]
//        /*
//        1 - 2
//        2 - 3
//        33 - 2
//        6 - 1
//        55 - 1
//        3 - 1
//        11 - 1
//        * */
//        System.out.println("tuan suat xuat hien\n");
//        demSoLanXuatHien(arr,n);
//
//        // mang danh dau
//        //a [3][6][3][6][1][2]
//        //   0  1  2  3  4  5
//        //b [0][0][0][0][0][0]
//        //
//        // a[0]= a[2]=>b[2]=1
//        //
//    }
}
