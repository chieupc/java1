package OOP.oopkethua;

public abstract class Animal  {// abstract nay sinh ra de lam cha cac doi tuong khac thoi chu khong de
    /*
    luu y abstract sinh ra de lam cha con
    extends thi nguoc lai sinh ra de lam con khi co abstract thi se khong co
    extends va nguoc lai
    * */
    private String eat;
    private String type;

    public Animal(){

    }

    public Animal(String eat, String type) {
        this.eat = eat;
        this.type = type;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
