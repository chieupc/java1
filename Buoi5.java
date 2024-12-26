import java.util.Scanner;

public class Buoi5 {
//    public static void main(String[] args) {
        // break : co tac dung thoat khoi vong lap luon
        // continue: bo qua cac dong code ben duoi va tiep tuc chay vong lap
//        for(int i=0;i<10;i++){
////            System.out.println(i+" ");
//            System.out.println(i);
//            if (i ==8) {
//                break;// break o day chay tu 0 den 8 thi moi huy xong chay ham duoi
//            }
//            System.out.println("hi xin chao");
//    }
//        int n = 0;
//        for (int i = 0; i <10 ; i++) {
//            System.out.print(i+" ");
//            if (i==0) {
//                System.out.println();
//                break;
//
//            }
//            System.out.println("ah");
//
//
//        }

        //for lồng i = 0 là for bên ngoài
        //j = 10 là j bên trong
//        for (int i = 0; i <5; i++) {
//            for (int j = 10; j <20; j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i <10; i++) {
//            System.out.println(i+" ");
//        } 

//        for (int j = 0; j<5; j++) {
//            for (int i = 0; i<10; i++) {
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

//        //in ra hinh vuong
//        for (int i = 0; i <5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
//        // in ra hinh chu nhat
//        for (int i = 0; i <5; i++) {
//            for (int j = 0; j <10; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
//       // in hinh tam giac vuong goc
//        int n = 6;
//        for (int i = 0; i <n; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
//        // tam giac can
//        int n = 5;
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=n+i-1; j++) {
//                if (j>=n-i+1) {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        //in ra hinh vuong ben trong rong
//        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j <=5; j++) {
//                if (i==1||j==1||i==5||j==5) {
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//        //in tam giac
//
//        int n = 5;
//        for (int i = 0; i <=n; i++) {
//            for (int j = 0; j <=n+i-1; j++) {
//                if (j >=n-i+1) {
//                    if (j ==n+i-1 || j==n-i+1 || i==1 || i==n) {
//                        System.out.print("* ");
//                    }
//                    else {
//                        System.out.print("  ");
//                    }
////                    System.out.println();
//                }
////                System.out.println();
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//        int n = 5;
//        /*
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        * */
//        int dem=1;
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print((dem++)+" ");
//            }
//            System.out.println();
//        }
        /*
        j se la cot
        i se la hang

            j (1 2 3 4 5)

    i (1)   1 2 3 4     5
      (2)   2 4 6 8    10
      (3)   3 6 9 12   15
      (4)   4 8 12 16  20
      (5)   5 10 15 20 25
        * */

//        int n = 5;
//        int dem = 1;
//        for (int i = 1; i <=5; i++) {
//            for (int j = 1; j <=5; j++) {
//                System.out.print((i*j)+" ");
//            }
//            System.out.println();
//        }
////        System.out.println();

        /*
        mảng:
        mảng là tập hợp gồm một số cố định các phần tử có cùng kiểu dữ liệu, dùng để lưu trữ dữ liệu.
        [1,2,3,4.5]

        * */
        //cú pháp mảng trong java
        //kiểu dữ liệu [] tên mảng;
        // int[] myArray;
        //Object[]
        //arrayOfObjects;

        //int []a = new int[100];
        //int b[] = new int[100];
        //int c[] = new int[]{1,2,3,4};//1,2,3,4 ben trong là khai bao trước trong mảng c này có cừng này phần tử
        //float d[] = new float[50];// bên trong này có 50 phần tử
        //float e[] = new float[]{5.6f,6.9f,5};// bên trong {} là khai báo trước trong màng e này có cừng này phần tử
        //float h[] = new float[]{1,6,5,3.6f};// bên trong {} là khai báo trước trong màng h này có cừng này phần tử

        // lưu ý mảng các phần tử cách nhau bới dấu phẩy

//        int a[] = new int[100];
//        int chieuCaoCua1 = 170;
//        int chieuCaoCua2 = 180;
//        int chieuCaoCua3 = 200;
        // đây là cách khai báo cứng
//        int chieuCao[] = new int[50];
//        chieuCao[0] = 170;
//        chieuCao[1] = 180;
//        chieuCao[2] = 200;
//        chieuCao[3] = 160;
//        int arrayA[] = new int[100];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i<5 ; i++) {// cú pháp nhập mảng
//            System.out.println("Nhap phan tu thu "+i+": ");
//            arrayA[i] = sc.nextInt();
//        }//cú pháp duyệt các phần tử trong mảng
//        for (int i = 0; i <5; i++) {
//            System.out.print(arrayA[i]+" ");
//        }

//        int arrayA[] = new int[100];
//
//        int n;
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("nhập số lượng phần tử: ");
//        n=sc.nextInt();
//        for (int i = 0; i<n ; i++) {// cú pháp nhập mảng
//            System.out.println("Nhap phan tu thu "+i+": ");
//            arrayA[i] = sc.nextInt();
//        }

        //cú pháp duyệt các phần tử trong mảng
//        for (int i = 0; i <n; i++) {
//        System.out.println(arrayA[i]+" ");
//        }
//        arrayA[4]= 50;
//        arrayA[5]= 0;
//        for (int i = 5; i <100; i++) {//khi i nhỏ hơn 5 các phần tử trong mảng chạy hết đến mảng 4 thì còn lại sẽ mặc định là số 0
//            System.out.print(arrayA[i]+" ");
//        }
//        int sum=0;// cú pháp tính tổng
//        for (int i = 0; i <5; i++) {
//            sum+=arrayA[i];
//        }
//        System.out.println("tong="+sum);


//        int max = arrayA[0];// cú pháp max tìm mảng có dữ liệu lớn nhất
//        for (int i = 0; i <=5 ; i++) {
//            if (max<arrayA[i]) max = arrayA[i];
//        }
//        System.out.println("max="+max);
        //sắp xếp nổi bọt
        //thuật toán nổi bọt
//        for (int i = 0; i <n-1; i++) {
//            for (int j = i+1; j <n; j++) {
//                if(arrayA[i]<arrayA[j]){//cu pham mang sap xep giam dan
//                    int t = arrayA[i];
//                    arrayA[i] = arrayA[j];
//                    arrayA[j] = t;
//                }
//            }
//        }

//        for (int i = 0; i <n-1; i++) {
//            for (int j = i+1; j <n; j++) {
//                if(arrayA[i]>arrayA[j]){//cu pham mang sap xep giam dan
//                    int t = arrayA[i];
//                    arrayA[i] = arrayA[j];
//                    arrayA[j] = t;
//                }
//            }
//        }
//        //cu phap sap xep noi bot
//        //(0 1 2   3  4)
//        // 9 6 55 10 22
//        // 6 9 55 10 22
//        // 6 9 10 55 22
//        // 6 9 10 22 55
//        System.out.println("mang sau khi sap xep");
//        for (int i = 0; i <n; i++) {
//            System.out.print(arrayA[i]+" ");
//        }

//        }
}
