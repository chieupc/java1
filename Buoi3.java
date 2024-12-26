import java.util.Scanner;

public class Buoi3 {
//    public static void main(String[] args) {
//        if(true)
//        {
//            System.out.println("hello");
//            int x=15;
//            x=x+1;
//            System.out.println(x);
//        }
//        if((6>50 && 5!=1) || 5<10)
//        {
//            System.out.println("hi");
//            int x=15;
//            x=x+1;
//            System.out.println(x);
//        }

//        int x=5;
//        int y=7;
//        int z=3;
//        x= z++ + --y - x;// 3 + 6 - 5 = 4
//        y= y++ + z-- + x;//6 + 4 + 4 = 14
//        z= z-- + y + x++;//3 + 14 + 4 =21
//        System.out.println(x);//5
//        System.out.println(y);//14
//        System.out.println(z);//21
//        int x;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap x: ");
//        x = sc.nextInt();
//        if(x%2 == 0){
//            System.out.println(" la so chan");
//        }
//        if(x%2 != 0){
//            System.out.println("la so le");
//        }

//          if(mệnh đề){
//              thực thi các câu lệnh
//          }
//          else{
//              thực thi câu lệnh
//        }


//         int tuoi = 20;
//         if(tuoi<18){
//             System.out.println("tre con:");
//         }
//         else{
//             System.out.println("truong thanh:");
//         }
//        int tuoi = 50;
//        if(tuoi>10){
//            System.out.println("thanh thieu nien:");
//        }
//        if(tuoi<20){
//            System.out.println("tre con:");
//        }
//        else{
//            System.out.println("nguoi lon:");
//        }
//          if(mệnh đề){
//             câu lênh
//          }
//        else if(mệnh đề){
//            câu lệnh
//        }
//        else if(mệnh đề){
//            câu lệnh
//        }
//        else{
//
//        }
//        int tuoi = 45;
//        if(tuoi<10){
//            System.out.println("thieu nhi");
//        }
//        else if(tuoi>=11 && tuoi<=18){
//            System.out.println("thanh thieu nien");
//        }
//        else if(tuoi>=19 && tuoi<=40){
//            System.out.println("thanh nien");
//        }
//        else if(tuoi>=41 && tuoi<=60){
//            System.out.println("trung nien");
//        }
//        else {
//            System.out.println("nguoi cao tuoi");
//        }


//        int tuoi;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap so tuoi vao : ");
//        tuoi =sc.nextInt();
//
//        if(tuoi<10){
//            System.out.println("thieu nhi");
//        }
//        else if(tuoi>=11 && tuoi<=18){
//            System.out.println("thanh thieu nien");
//        }
//        else if(tuoi>=19 && tuoi<=40){
//            System.out.println("thanh nien");
//        }
//        else if(tuoi>=41 && tuoi<=60){
//            System.out.println("trung nien");
//        }
//        else {
//            System.out.println("nguoi cao tuoi");
//        }
//        bài toán lính căn
//        int a = 5, b=  10, c= 15;
//        int max = a;
//        if(max < b) max =b;
//        if(max c) max c;
//        System.out.println(max);

//        bài toán rẽ nhánh
//        switch (hằng số){
//            case hằng số:
//                câu lệnh;
//                break;
//            case hằng số:
//                câu lệnh;
//                break;
//            default:
//                câu lệnh;
//        }
//        câu nào có chữ final thì mặc định ko thay đổi
//        final int a = 5;
//        a = 15;
//        int n = 2;
//        switch (n){
//            case 1:
//                System.out.println("la so 1");
//                break;
//            case 2:
//                System.out.println("la so 2");
//                break;
//            case 3 :
//                System.out.println("la so 3");
//            default:
//                System.out.println("khong hop le");
//        }

//        vd: nhập vào tháng và kiểm tra xem nó có bao nhiêu ngày trong tháng
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap vao thang: ");
//        int thang =sc.nextInt();
//        switch (thang){
//            case 1:
//                System.out.println("co 31 ngay");
//                break;
//            case 2:
//                System.out.println("nhap vao nam de kiem tra: ");
//                int nam = sc.nextInt();
//                if(nam % 4==0 && nam % 100 !=0) System.out.println("co 29 ngay");
//                else System.out.println("co 28 ngay");
//                break;
//            case 3:
//                System.out.println("co 30 ngay");
//            default:
//                System.out.println("ngay ko hop le:");
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap vao thang: ");
//        int thang = sc.nextInt();
//        switch (thang){
//            case 1,3,5,7,8,10,12:
//                System.out.println("co 31 ngay");
//                break;
//            case 4,6,9,11:
//                System.out.println("co 30 ngay");
//            case 2:
//                System.out.println("nhap vao nam de kiem tra: ");
//                int nam = sc.nextInt();
//                if(nam % 4==0 && nam % 100 !=0) System.out.println("co 29 ngay");
//                else System.out.println("co 28 ngay");
//                break;
//            default:
//                System.out.println("thang nhap vao khong hop le");
//        }
       // nhập vào a và b và tính giá trị của phương trình bậc nhất 1 ẩn
       // ax+b=0
       // input a,b
       //output x
//        Scanner sc = new Scanner(System.in);
//        int a,b;
//        System.out.println("nhap a:");
//        a = sc.nextInt();
//        System.out.println("nhap b: ");
//        b = sc.nextInt();
//        //ax+b=0
//        //0x+0=0
//        //0x+1=0
//        //2x+1=0
//        if(a==0){
//            if(b==0) System.out.println("phuong trinh vo so nghiem");
//            else System.out.println("phuong trinh vo nghiem");
//        }
//        else System.out.println("nghiem cua phuong trinh la: "+(float)-b/a);
//        int a=5;
//        float b=5f;
//        if(a==b){
//            System.out.println("bang nhau");
//        }else {
//            System.out.println("khac nhau");
//        }
//        double a = 5.4666666f;
//        double b = 5.4666666f;
//        if(b-a ==1){
//            System.out.println("hi");
//        }else {
//            System.out.println("hello");
//            System.out.println(b-a);
//        }

        //nhập vào a,b,c
        //tìm nghiệm phương trình ax^2 + bx + c = 0
        //input a,b,c
        //output x
        //Math.sprt()
//        Scanner sc = new Scanner(System.in);
//        int a,b,c;
//        System.out.println("nhap vao a:");
//        a=sc.nextInt();
//        System.out.println("nhap vao b: ");
//        b=sc.nextInt();
//        System.out.println("nhap vao c: ");
//        c=sc.nextInt();
//        //ax^2 +bx + c = 0
//        //0x^2 bx + c = 0 => bx + c = 0
//        //
//        if(a==0){
//            if(b==0){
//                if(c==0) System.out.println("pt vo so nghiem");
//                else System.out.println("pt vo nghiem");
//            }
//            else System.out.println("pt co nghiem la: " + (float) -c / b);
//        }
//        else {
//            double delta =  b*b - 4*a*c;
//            if(delta<0) System.out.println("pt vo nghiem");
//            else if(delta==0)
//                System.out.println("pt co nghiem kep:"+(float) -b / (2*a));
//            else {
//                double canDelta = Math.sqrt(delta);
//                System.out.println("nghiem x1= "+ (-b+canDelta)/ (2*a));
//                System.out.println("nghiem x2="+ (-b-canDelta)/ (2*a));
//            }
//        }
//    }
}
