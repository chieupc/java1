import java.util.Scanner;

public class buoi2 {
//    public static void main(String[] args) {

        /*
        int
        float
        long
        double
        char
        String
        boolean
        * */
//        int helloWorldAll;
//        int canNang;
//        canNang = 50;
//
//        canNang = 500;
//
//        float chieuCao = 1.7f;
//          float PI = 3.14f;
//          int doDai;
//          doDai = (int) PI;
//        System.out.println(doDai);

//         int chieuCao = 5;
//         float abc;
//         abc = (float) chieuCao;
//        System.out.println(abc);
        /*
        *  +
        *  -
        *  *
        *  /
        *  %        3 % 8 = 3 3 / 8 = 0  0* 8 = 0  3-0=3
        *
        *
        * */
//        int a;
//        int b;
//        a = 5;
//        b = 3;
//        a = 3;
//        b = 5;
//        input?
//        output?
//        phuong phap linh can :
//        int trungGian;
//        trungGian = a;
//        a = b;
//        b = trungGian;
//        System.out.println("gia tri a=" + a);
//        System.out.println("gia tri b=" + b);
//          int a;
//          int b;
//          a = 5;
//          b = 3;
//          phuong pham cong tru nhan chia binh thuong
//          a = a+ b;// a = 5 + 3 = 8
//          b = a -b;// 8 - 3 =5
//          a = a - b ;// a = 8 - 5 = 3
//        System.out.println("gia tri a: "+a);
//        System.out.println("gia tri b: "+b);
         int so = 12345;
//        tong cua cac chu so trong bien so
//        vd 1+2+3+4+5 = 15
//        System.out.println(so%10);
//         int donVi = so%10;//5
//         so = so / 10;//1234
//         int hangChuc = so%10;//4
//         so = so / 10;//123
//         int hangTram = so%10;//3
//         so = so / 10;//12
//         int hangNghin = so%10;//2
//         so = so /10;//1
//         int tong = donVi+hangChuc+hangTram+hangNghin+so;
//         System.out.println(tong);
        /*
        toan tu 1 ngoi: ++, --
        int x;
        x++;// toan tu hau to 1 ngoi
        ++x;// toan tu tien to 1 ngoi
        x--;
        --x;

        * */
//        int x = 5;
//        x++;// ket thuc dong lenh thi len 6
//        x++;
//        ++x;
//        ++x;
//        x++;
//        ++x;
//        --x;
//        x--;
//        System.out.println(x);
//        int x  = 5;
//        System.out.println(x--);
//        System.out.println(x);
//          int a,b,c;
//          a = 5;
//          b = 4;
//          c = 3;
//          int e = a++ + b-- + ++c; // 5 + 4 + 4
//        System.out.println(e);//= 13
//          int a,b,c;
//          a = 5;
//          b = 4;
//          c = 3;
//          int d = a++ + b-- - --c; // 5 + 4 - 2 = 7 => d = 7
//            a = 6
//          int e = --d + b++ + c; // 6 + 3 + 2 = 11  => e =11
//          int f = --a + c-- + e++; // 5 + 2 + 11 = 18 => f = 18
//        System.out.println(d); //6
//        System.out.println(e); //12
//        System.out.println(f); //18

//         int x = 5;
//         x++;
//         int alo;
//        System.out.println(x);

//        int x = 5;
//        ++x;
//        System.out.println(x);

//         int x = 5;
//
//         x = x + 5;
//
//         x+=5;
//
//         x = x - 100;
//
//         x-=100;
          /*
          toán tử hai ngôi
          == : so sánh bằng
          != : so sánh khác
          > : so sánh lớn hơn
          < : so sánh nhỏ hơn
          >= : lớn hơn hoặc bằng
          <= : nhỏ hơn hoặc bằng
          && : so sánh và
          || : hoặc
           được sử dụng câu điều kiện if esle
          * */
          /*
           toán tử 3 ngôi
           (điều kiện) ? (biểu thức 1) : (biểu thức 2)


          * */
//        boolean a = true;
//
//        int test = a ? 1 : 2;
//        System.out.println(test);

//        nếu biểu thức này đúng thì là biểu thức 1 còn nếu sai thì là biểu thức 2
//        int a = 10;
//        int b = 15;
//        int max = (a<b) ? a : b;
//        System.out.println(max);
//        toán tử 3 ngôi
        /*
        câu lệnh rẽ nhánh
        if (điều kiện)
        {
        thực  thi các câu lệnh
        }

        * */
//        if(1>2)
//        {
//            System.out.println("bye");
//        }
//        int a = 5;
//        int b = 10;
//        if(a != b)
//        {
//            System.out.println(" day la a");
//        }
//        int a = 5;
//        int b = 10;
//        if(a!=b && a==5)
//        {
//            System.out.println("day la a");
//        }
//        int a = 5;
//        int b = 10;
//        if(a==b || a!=10 || 1<2)
//        {
//            System.out.println("day la a");
//        }
//        int a = 5;
//        int b = 10;
//        if(1<2 && 2<3)
//        {
//            System.out.println("day là a");
//        }
//         int a,b,c;
//         a = 10 ;
//         b = 15 ;
//         c = 5 ;
//         // tìm số lớn nhất trong 3 số
//        int max = a; // max = 10
//        if(max < b)  // 10 < 15 max = 15
//        {
//            max = b;
//        }
//        if(max < c)  //15 < 5
//        {
//            max = c;
//        }
//        System.out.println(max); // 15
//          int a,b,c;
//          a = 10;
//          b = 15;
//          c = 5;
//          int max1 = (a>b) ? a:b;
//          int max2 = (b>c) ? b:c;
//          int max = (max1 > max2) ? max1 : max2;
//        System.out.println(max);


//          int a,b,c;
//          a = 60;
//          b = 80;
//          c = 100;
//          int max = (a>b) ? (a>c ? a : c) : (b>c ? b : c);
//        System.out.println(max);

//        int a,b,c;
//        Scanner sc = new Scanner(System.in); // cú pháp nhập từ bàn phím
//        System.out.println("nhap a vao day:");// thông báo nhập từ bàn phím
//        a = sc.nextInt();
//        System.out.println("nhap b vao day:");//
//        b = sc.nextInt();
//        System.out.println("nhap c vao day:");
//        c = sc.nextInt();
//        int max = (a>b) ? (a>c ? a : c) : (b>c ? b : c);
//        System.out.println(max);
//    }
}
