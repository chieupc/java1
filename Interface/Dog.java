package Interface;

public class Dog implements Animal {
    // no gan nhu kieu ke thua


  @Override
  public String diChuyen(){
      return "bang chan";
  }

  @Override
  public String thucAn(){
      return "an thit";
  }

  @Override
  public int soChan(){
      return 4;
  }

}
