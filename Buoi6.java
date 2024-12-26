import java.util.Scanner;

public class Buoi6 {
//    public static void main(String[] args) {
        /*
         kiem tra xem so do co phai so nguyen to hay ko
         so nguyen to la so chia het cho 1 va chinh no thoi
         so nguyen to bat buot phai lon hon no
          2 3 5 7 11 43

          Math.sqrt duoc goi la can bac 2
        * */
        // cach 1:
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap n: ");
//        n = sc.nextInt();
//        if (n<2) {
//            System.out.println("khong phai so nguyen to");
//        }
//        else {6
//            int dem = 0;
//            for (int i = 2; i <=n; i++) {
//                if (n%i==0){
//                    dem++;
////                    break;
//                }
//            }
//            if (dem>0){
//                System.out.println("khong phai so nguyen to");
//            }
//            else {
//                System.out.println("la so nguyen to");
//            }
//        }

        // cach 2
//                int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap n: ");
//        n = sc.nextInt();
//        if (n<2) {
//            System.out.println("khong phai so nguyen to");
//        }
//        else {
//            int dem = 0;
//            for (int i = 2; i <=Math.sqrt(n); i++) {// 6> 6/2=3
//                if (n%i==0){
//                    dem++;
////                    break;
//                }
//            }
//            if (dem>0){
//                System.out.println("khong phai so nguyen to");
//            }
//            else {
//                System.out.println("la so nguyen to");
//            }
//        }


//        //cach 3
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap n:");
//        n=sc.nextInt();
//
//        if (n<2){
//            System.out.println("khong phai so nguyen to");
//        }else {
//            boolean check = true;
//            for (int i = 2;i<=Math.sqrt(n);i++){
////                if (n%i == 0) {
//                    check = false;
//                    break;
//                }
//            }
//            if (check==true) {
//                System.out.println("la so nguyen to");
//            }
//            else {
//                System.out.println("khong la so nguyen to");
//            }
//        }

        //Phan nhac lai bai cu for long
//        //for long
//        int hang =5;
//        int cot = 10;
//        for (int i = 0; i <hang; i++) {
//            for (int j = 0; j <cot; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//        int hang = 5;
//        int cot = 5;
//        for (int i = 0; i <hang; i++) {
//            for (int j = 0; j <cot; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }


//        int hang = 5;
//        int cot = 5;
//        for (int i = 0; i <hang; i++) {
//            for (int j = 0; j <cot; j++) {
//                if (i == 0||j==0||i==hang-1||j== cot-1) {
//                    System.out.print("*  ");
//                }
//                else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
        // tam giac can
//        int chieuCao;
//        chieuCao =5;
//        for (int i = 1; i <=chieuCao; i++) {
//            for (int j = 1; j <=chieuCao+i-1; j++) {
//                if (j >= chieuCao-i+1) {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
            // tam giac can rong
//        int chieuCao;
//        chieuCao=5;
//        for (int i = 1; i <=chieuCao; i++) {
//            for (int j = 1; j <=chieuCao+i-1; j++) {
//                if (j>=chieuCao-i+1) {
//                    if(i==1 || j==1 || j==chieuCao-i+1 || j==chieuCao+i-1 || i==chieuCao)
//                    System.out.print("* ");
//                    else System.out.print("  ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
        // mang la tap hop cac phan tu co chung kieu du lieu , su dung mang de quan ly de hon do phai tao nhieu bien
        // cu phap khai bao
        //mang thi co nhieu cac goi
        // int arr[] = new int [100];
        // int []arr = new int [50];

        //a = 8
        // [6][5][23][18][65][11][0][24]
        //  0  1   2   3   4   5  6   7
        //a[0] = 6
        //a[1] = 5
        //a[2] = 23
        // . . .
        // . . .
        //a[7]= 24
        //a[n-1] = a [8-1]

//        int []arr= new int[100];
//        arr[5] = 99;
//        System.out.println(arr[5]);
        // luu y mang se bat dau tu vi tri thu 0 neu ma chua duoc gan gia tri nao thi mac dinh no se la 0
//        int []arr = new int[50];
//        arr[6]=124;
//        for (int i = 0; i <50; i++) {
//            System.out.println(arr[i]);
//        }
    //ham la chuc no ma nguoi ta co the tai su ding lai code lam cho code co the de dang sua va de nhin gon hon
        // cu phap cua ham la: public static void inRaChuoi(){}
//    }
}
