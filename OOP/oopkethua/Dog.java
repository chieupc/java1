package OOP.oopkethua;

public class Dog extends Animal{
    String speak;
    private int quadruple;

    public Dog(String eat, String type, String speak, int quadruple){
        super(eat,type);
        this.speak =speak;
        this.quadruple = quadruple;
    }

}
