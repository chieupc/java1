import java.util.Scanner;

public class Buoi4 {
//    public static void main(String[] args) {
//        for(khởi tạo;điều kiện lặp;bước lặp){
//          // các câu lệnh thực thi
//        }
//        for(int i = 0;i<10;i=i+1){
//            System.out.println("hello");
//        }
//        System.out.println("xin chao");
//        for(int i = 0;i<10;i=i+1){
//            System.out.println(i);
//        }

//        in ra so chan
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap n: ");
//        int n = sc.nextInt();
//        for(int i =0;i<=n;++i){
//            if(i%2==0)
//            System.out.println(i);
//        }
//        in ra so le

//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap n: ");
//        int n = sc.nextInt();
//        for(int i =1;i<=n;i+=2) {
//           if(i%2!=0) System.out.println(i);
//        }
        //1 + 2 + 3 + 4 + ... + n
        //1 + 2 + 3 + 4 + 5 = 15
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap n: ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i <=n; i++) {
//            sum = sum + i;  // sum = 0 +1=> sum = 1
//                            // sum = sum +i= 1 + 2 = 3
//                            // SUM = sum + i = 3 + 3 = 6
//                            // sum = 6 + 4 = 10
//                            // sum = 10 + 5 = 15
////            System.out.println(sum);//sum = 15
//        }
//        //in ra ngoai lay tong gia tri cuoi cung
//        System.out.println(sum);



//        // tinh tong cac so chan
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap n: ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i <=n ; i++) {
//            if (i % 2 != 0) sum+=i;
////            System.out.println(sum);
//        }
//        //in ra ngoai lay tong gia tri cuoi cung
//        System.out.println(sum);



//        // tinh tong cac so le
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap n: ");
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 0; i <=n ; i++) {
//            if (i % 2 == 0) sum+=i;
////            System.out.println(sum);
//        }
//        //in ra ngoai lay tong gia tri cuoi cung
//        System.out.println(sum);



//        int n = 5;
//        for (int i = 0; i < n; i++) {
//            System.out.println("xin chao");
//            System.out.println("hello");
//            int max = i;
//            if(i%2==0) System.out.println("hee");
//        }


//        //1 + 1/2 + 1/3 + 1/4 + 1/5 + ... + 1/n
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap n: ");
//        int n = sc.nextInt();
//        float tong = 0;
//        for (int i = 1; i <=n ; i++) {
//            tong = tong + (1/(float)i);
//        }
//        System.out.println(tong);

//         Scanner sc = new Scanner(System.in);
//         System.out.println("nhap n : ");
//         int n =sc.nextInt();
//        for (int i = n; i >=1 ; i--) {
//            System.out.println(i);
//
//        }
//        int n = 5;
//        int i; // i ở đây được gọi là biến toàn cục sẽ được dụng các vòng lặp khác nhau hoặc if else
////        for ( i = n; i >=1 ; i--) { // i bên trong này sẽ gọi là cục bộ của for này thôi
//        for(i = n;i >=1; i--){// i = i - 1 = 5 - 1 = 4
//                              //i = 4 - 1 = 3
//                              //i = 3 -1 = 2
//                              //i = 2 - 1 = 1
//                              //i = 1 - 1 = 0// dành cho biến toàn cục
////            System.out.println(i);
//        }
//        // i cục bộ chỉ chạy bên trọng hàm for  trong ngoặc {} còn toàn cục thì tổng quát cả trong và ngoài hàm đều được
////        i = 5;// i toàn cục mới được để i ở đây
//        System.out.println(i);
//      khi sử dụng biên toàn cục thì sẽ không được sử dụng biến cục bộ và ngược lại
//        int n = 50;
//        int i;
//        for ( i = 0; i <n; i-=5) {
//            System.out.println(i);
//        }
//        // nó sẽ chạy âm vô cự số âm

//        int n = 5;
//        int i;
//        for (i = 0; i<n; ){
//
//        }
//        System.out.println(i);// thường nó sẽ chạy vô hạn
        /*
        byte : -128 ... 0 ... 127
                -2^8 ... 0 ... 2^8 -1
        * */
//        byte x =127;
//        x = (byte)(x+1);
//        System.out.println(x);//byte sẽ đảo lộn -128 theo công thức trên
//        int n =5;
//        int i =0; chạy vô hạn số 0
//        for (; i <=n;) {
//            System.out.println(i);
//        }
//        int n = 5;
//        int i =1;
//        for(; ; ){
//            System.out.println(i);
//        }
//        int n = 12345;//input 12345
        // => 54321   //output 54321
        // for
//        Scanner sc = new Scanner(System.in);
//        int n,du;
//        int dz = 0;
//        n = sc.nextInt();
//        for(;n != 0;){
//            du = n % 10;
//            dz = dz * 10 + du;
//            n = n / 10;
//        }
//        System.out.println(dz);

//        12345 => 54321
//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.println("nhap n: ");
//        n = sc.nextInt();
//        int nghichDao=0;
//        for(;n !=0;){// n = 12345
//            int phanTuCuoi = n % 10;//ptcuoi = 12345 % 10 = 5
//            nghichDao = nghichDao * 10 + phanTuCuoi;//nghichdao = 0 * 10 + 5 = 5
//                                                    //nghichdao = 5 * 10 + 4 = 4 =>54
//                                                    //nghichdao = 54 * 10 + 3 = 3 =>543
//                                                    //nghichdao = 543 * 10 + 2 = 2 =>5432
//                                                    //nghichdao = 5432 * 10 + 1 = 1 =>54321
//            n = n / 10;//12345 // 1 / 10 => 0
//        }
//
////        12345=> 54321 => 50000 + 4000 + 300 +20 + 1
//        System.out.println(nghichDao);
//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.println("nhap n: ");
//        n = sc.nextInt();
//        int tong=0;// bien trung gian
//        for ( ;n !=0;) {
//            int soCuoi = n % 10;//12345%10=>5
//                                //1234% 10=>4
//            tong += soCuoi;// tong = 0 + 5 => 5
//                           // tong = 5 + 4 => 9
//                           // tong = 9 + 3 => 12
//                           // tong = 12 + 2 => 14
//                           // tong = 14 + 1 => 15
//            n/=10;
//
//        }
//        System.out.println(tong);


//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.println("nhap n: ");
//        n = sc.nextInt();
//        int i = 1; // n = 5
//        while (i<=n){
//            System.out.println(i);// 1 2 3 4 5
//            i++;// khi chay het lenh o tren thi i o day se tang len 1 don vi
//        }
////        System.out.println("dung het");



//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.println("nhap n: ");
//        n = sc.nextInt();
//        int i = n; // n = 5
//        while (i>=1){
//            System.out.println(i);// 5 4 3 2 1
//            i--;// khi chay het lenh o tren thi i o day se tang len 1 don vi
//        }
//        System.out.println("dung het");
        // ham for va ham while giong nhau cach chay nhung phai chu y

        //for (int i = n; i>=1 ; i--) {

        //}


//        int n;
//        System.out.println("nhap n: ");
//        n = sc.nextInt();
//        int i = n; // n = 5
//        while (i>=1){
//            System.out.println(i);// 5 4 3 2 1
//            i--;// khi chay het lenh o tren thi i o day se tang len 1 don vi
//        }


        // 12345 => 54321 viet bang ham while
//        Scanner sc = new Scanner(System.in);
//        int n ;
//        System.out.println("nhap n: ");
//        n=sc.nextInt();
//        int nghichDao=0;
//        while (n!=0){
//            int soCuoi = n%10;
//            nghichDao = nghichDao*10+soCuoi;
//            n/=10;
//        }
//        System.out.println(nghichDao);

//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.println("nhap n: ");
//        n=sc.nextInt();
//        int i=1;
//        do{
//            //cac cau lenh
//            System.out.println(i);
//            i++;
//        }


//       // while (dieu kien)//trong khi cau dieu kien y dung
//        while (i<=n);


//        while (dieu kien){
//            //cac cau lenh
//        }

        // while va (do while) khac nhau while la kiem tra cac cau lenh xem no dung hay ko thi no moiw thuc hien
        // con thang do while thuc thi cau lenh roi no moi kiem tra dieu kien kieu nguoc lai cua nhau
        //while la kiem tra thi moi lam
        //do while thi lam xong moi kiem tra


//    }
}
