import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Buoi7 {
    public static void nhapMang(int arr[], int n){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("nhap vao pt thu"+i+": ");
            arr[i] = sc.nextInt();
        }
    }
    public static void xuatMang(int arr[], int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    // 0  1  2  3   4   5   6   7   8   9   10  11  12   13   14   15
    //                          *
    //[3][5][9][11][13][20][33][41][60][90][93][94][112][220][300][400]

    // n 16 |  x =13 // thuat toan chia de tri => thuat toan nhi phan
    // (0 , n-1)(l,r)
    // mid = (l+r)/2 =(0+15)/2=7
    // voi dieu kien while (l<=r)
    //a[mid]>x 41 > 3-> r = mid -1
    //                     r = 7-1=6
    //a[mid]>x{ r= mid-1}
    //a[mid]<x{ l= mid+1}
    //a[mid]=x=>return se tra la =>a[mid]
    /*
    1. in ra 3 so lon nhat cua mang(khong sap xep lai mang)
    vd[1,5,7,2,6,3]=>5 7 6 la 3 so lon nhat
    code:
    * */
    public static void threeMax(int arr[], int n){
        int max1=-100000001,max2=-100000001,max3=-100000001;//max nho nhat se thuong la 10^8
        for (int i = 0;i < n; i++){
            if (max1<arr[i]){// vd khac: [1,4,3,5,2] max1 = 1 max2=-100000001 max3 = -100000001
                max3 = max2;// max 3 phai bang max 2
                max2 = max1;// max 2 phai bang max1
                max1 = arr[i];// max1 xong phai cap nhat lai arr[i]
            }
            else if (max2 < arr[i]){
                max3 = max2;// max3 phai bang max2
                max2 = arr[i];//max2 xong phai cap nhat lai arr[i]
            } else if (max3<arr[i]) {
                max3 = arr[i];// max3 phai cap nhat lai
            }
        }
        System.out.println(max1+"---"+max2+"---"+max3);
    }
    /*
    2.Tim chu so xuat hien nhieu nhat trong so
    vd 123232223 => so 2 xuat hien nhieu nhat
    bai toan nay se su dung thuat toan lua ga vao truong
    * */
    public static void luaGa(int so){
        // code bien dem
        // tao bien tam de hang so nay ko bi thay doi
        int temp = so;
        int arr[] = new int[10];
        while(temp!=0){
            arr[temp%10]++;
            temp/=10;
        }
        // tao ra mot bien max
        int max = arr[0];
        int x=-1;
        for (int i = 0; i <arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
                x = i;
            }
        }
//        System.out.println(Arrays.toString(arr));
        if (x!=-1)
            System.out.println(x+" xuat hien nhieu nhat");
    }
    /*
    3. Nhap vao 1 so kiem tra xem so do co phai so doi xung khong vd 123321 la so doi xung

    * */
    public static boolean checkDX(int n){
        int temp = n;
        int so = 0;
        while (temp!= 0){
            int du = temp%10;
            so = so *10+du;
            temp/=10;
        }
//        if (so == n)
            return so!=n;
    }
    /*
    4. dao nguoc mang
    vd:[1,3,1,4,6,4] => [4,6,4,1,3,1]
    nhan vien go wout
    * */
//    // co hai cach :
//    // cach 1:
//    public static void daoNguocMang(int arr[], int n){
//        int a [] = new int[n];
//        int j = 0;
//        for (int i = n-1;i>=0;i--){
//            a[j] = arr[i];
//            j++;
//        }
//        System.out.println(Arrays.toString(a));
//    }
//    // cach 2:
    public static void daoNguocMang(int arr[], int n){
        for (int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i]= arr[n-i-1];
            arr[n-i-1] = temp;
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i< n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    /*
    5 .in cac so nguyen to co trong mang
    * */
    public static boolean checkSNT(int n){
        if (n<2) return false;
        for (int i = 2;i<=Math.sqrt(n);i++){
            if (n%i==0)return false;
        }
        return true;
    }
    public static void printSNT(int arr[],int n){
        for (int i = 0 ; i < n ; i++)
            if (checkSNT(arr[i])==true) System.out.print(arr[i]+" ");

    }
//    public static void randomNumber(){
//        int int_random = ThreadLocalRandom.current().nextInt();
//
//        //Print random integers
//        System.out.println("Random Integers: "+ int_random);
//        //Generate Random doubles
//        double double_rand = ThreadLocalRandom.current().nextDouble();
//
//        //Print random doubles
//        System.out.println("Random Doubles: " + double_rand);
//
//        // Generate random booleans
//        boolean boolean_rand = ThreadLocalRandom.current().nextBoolean();
//
//        // Print random booleans
//        System.out.println("Random Booleans: " + boolean_rand);
//
//    }
//    public static void main(String[] args){
////////////        // ko muon khoi tao doi tuong thi minh bo static
//////////////        int arr[] = new int[100];
//////////////        Buoi7 a = new Buoi7();
//////////////        a.nhapMang(arr,5);
//////////////        a.xuatMang(arr,5);
//////////
//////////
//////////
////////////        // cu phap goi mang
////////////        int arr[] = new int[100];
////////////        int n = 10;
//////////////        nhapMang(arr,n);
//////////////        xuatMang(arr,n);
//////////////        threeMax(arr,n);
//////////////        luaGa(1256444245);
//////////////        System.out.println(checkDX(123567));
//////////////        daoNguocMang(arr,n);
//////////////        System.out.println();
//////////////        printSNT(arr,n);
//////////////        randomNumber();
//////////
////////////        // String => chuoi
////////////        String str = " pham van chieu";
////////////        str = str+" dang hoc code";
////////////        System.out.println(str);
//////////        // ban chat chuoi la cac mang co cac ky tu bang ma ascii
////////////        String str = "npham van chieu";
////////////        char x[] = new char[]{'n','g','u','y','e','n'};
//////////        /*
//////////         bai toan viet chuoi chu thuong thanh chuoi chu in hoa va nguoc lai
//////////        * */
//////////
////////////        char x = str.charAt(0);
////////////        System.out.println((int)x);
//////////
//////////        String str = "npham van chieu"; // thuong ra in hoa NPHAM VAN CHIEU => npham van chieu
//////////        //Npham Van Chieu =>
////////////        System.out.println(str.length());
//////////        for (int i = 0;i<str.length();i++){
////////////            System.out.print(str.charAt(i)+" ");
//////////
//////////        }
//////////        int x = 65;
//////////        char y = (char) x;
//////////        String z = String.valueOf(y);
//////////        System.out.println(z);
//////////
//////////
//////////        Scanner sc = new Scanner(System.in);
//////////        String hoTen = sc.nextLine();
//////////        System.out.println(hoTen);
////////
//////////        String str = "npham van chieu";//PHAM VAN CHIEU=> pham van chieu
//////////        System.out.println(str);
//////////        String str2 = str + "hoc code";
//////////        System.out.println(str2);
//////////        System.out.println(str.toUpperCase(Locale.ROOT));
////////        Scanner sc = new Scanner(System.in);
////////        System.out.println("nhap chuoi: ");
////////        String str = sc.nextLine();
////////        String result = "";
////////        for (int i = 0; i<str.length();i++){
////////            char x = str.charAt(i);
////////            int valueAscii = (int) x;
////////            if (valueAscii>=65&& valueAscii<=90){
////////                int k = valueAscii+32;
////////                char t = (char) k;
////////                String temp = String.valueOf(t);
////////                //'a' =>" a"
////////                result = result+temp;
////////            }
////////            else if (valueAscii>=97 && valueAscii <=122){
////////                int k = valueAscii-32;
////////                char t = (char) k;
////////                String temp = String.valueOf(t);
////////                result = result+temp;
////////            }
////////            else {
////////                result = result + x ;
////////            }
////////        }
////////        System.out.println(result);
//////        // bai tap thay dau cach vao dau @
//////        String fullName = " pham van chieu";
//////        /*
//////        ho: pham
//////        ten dem: van
//////        ten: chieu
//////        * */
//////        String mangHoTen[] = new String[fullName.length()];
//////        mangHoTen[0] = "pham";
//////        mangHoTen[1] = "van";
//////        mangHoTen[2] = "chieu";
//////        System.out.println(Arrays.toString(mangHoTen));
//////
//////        // su dung mang hai chieu
//////        // day la mang hai chieu
//////        System.out.println(mangHoTen[0].charAt(0));
////////        int a[][]= new int [10][10];
//////        //a la mang hai chieu
//////        // b la mang 1 chieu
//////        // a = [[1,2,3,4],[5,9,6,10],[6,5,4]]
//////        // a[0] = [1,2,3,4]
//////        // a[1] = [5,9,6,10]
//////        // a[2] = [6,5,4]
//////        // b = [1,2,3,4]
//////        // b[0] = 1
//////        // b[1] = 2
//////        // b[2] = 3
//////        // con neu muon goi muon lay phan tu thu nhat thi goi cu phap
//////        // b[0][0]= 1
//////        // b[0][1]= 2
//////        // b[0][2]= 3
////////        int a[][] = new int[10][2];
////////        // luu y mang thu 2 no chi chua toi da 2 phan tu thoi
////////        // a =[]
////        String fullName = "pham van chieu";//mảng String dặt tên phiên là fullname
////        String [] arrName = fullName.split(" ");//split nghia la cat chuoi
//////        System.out.println(Arrays.toString(arrName));
////
////        // cach viet day du code
//////        int length = arrName.length;
//////        String ho = arrName[0];
//////        String ten = arrName[length-1];
////        // cach viet rut gon code
////        //
////       String ho = arrName[0];
////       String ten =  arrName[arrName.length-1];// ten se là mang cuoi lengh - 1 nghĩa la tổng mảng - 1
////       // length tương ứng với một mảng
////        //[1,2,3,4,5,9]=>6 -1
////        // 0,1,2,3,4,5
////        // [pham,van,chieu]=> 3-1
////        //   0 , 1 , 2
////       String tendem="";
////       for (int i = 1;i<=arrName.length-2;i++){
////           tendem +=arrName[i]+" ";
////       }
////        System.out.println("ho: "+ho);
////        System.out.println("ten dem: "+tendem);
////        System.out.println("ten: "+ten);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap chuoi: ");
//        String chuoi =sc.nextLine();
//        System.out.println("nhap ki tu: ");
//        char kyTu = sc.next().charAt(0);
//        boolean check = false;
//        for (char x : chuoi.toCharArray()){
//            if (kyTu == x){
//                check = true;
//                break;
//            }
//        }
//        System.out.println(check);
//    }
}
