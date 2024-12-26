package OOP;
// co class Student la doi tuong
// no co cac thuoc tinh ten, tuoi, diem toan, diem ly, diem hoa
public class Student {
    private String name;
    private int age;
    private int math;
    private int physics;
    private int chemistry;

    // tinh diem trung binh tung hoc sinh
    // sap xep hoc sinh do theo thu tu giam dan thong qua diem tb
    // tim hoc sinh co diem tb lon nhat

    // co ham tao  de chuyen vao cac thuoc tinh cua no
    public Student(String name, int age, int math, int physics, int chemistry){// ham tao
        this.name = name;
        this.age = age;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;

    }
    // co them hang nua de tinh diem trung binh
    public float AVG(){
        return(float) (this.math+this.physics+this.chemistry)/3;
    }

    // ham nay la in ra cac thuoc tinh cua no de in ra thuoc tinh dang sau
    @Override// kieu nhu ham xuat
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", math=" + math +
                ", physics=" + physics +
                ", chemistry=" + chemistry +
                '}';
    }
}
