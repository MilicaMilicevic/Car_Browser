package car_browser.cars;

import car_browser.classes.ClassCL;

import java.util.Random;

public class MercedesW140 extends ThirdCategory {
  private static int counter;
  
  public MercedesW140(){
    super(new Random().nextInt(17)+1996,new String[]{"Germany"},"5.0L V8","MercedesW140-"+(++counter));
  }
  
  @Override
  public String toString(){
    return super.toString()+" "+GrandTourer.description+", "+ClassCL.description;
  }
}