package OOP.oopkethua;

public class Cat extends Animal {
    private String speak;
    private int quadruple;

//    public Cat(String speak,int quadruple){
//        this.speak =speak;
//        this.quadruple = quadruple;
//    }
    public Cat(String eat, String type, String speak, int quadruple){
        super(eat, type);
        this.speak =speak;
        this.quadruple = quadruple;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public int getQuadruple() {
        return quadruple;
    }

    public void setQuadruple(int quadruple) {
        this.quadruple = quadruple;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "speak='" + speak + '\'' +
                ", quadruple=" + quadruple +
                '}';

        // toString la cu phap goi gop chi khi dung o class Cat goi ra thi sang main chi can gan sout va goi toString la ra het du lieu cua Cat
    }
}
