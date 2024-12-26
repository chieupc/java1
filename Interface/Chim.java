package Interface;

public class Chim implements Animal {

    @Override
    public String diChuyen(){
        return "bang canh";
    }

    @Override
    public String thucAn(){
        return "an thoc";
    }

    @Override
    public  int soChan(){
        return 2;
    }


}
