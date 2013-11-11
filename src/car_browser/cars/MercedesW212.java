package car_browser.cars;

import car_browser.classes.ClassE;

import java.util.Random;

public class MercedesW212 extends FirstCategory {
  private static int counter;
  
  public MercedesW212(){
    super(new Random().nextInt(4)+2009,new String[]{"Mexico","India","Germany"},"5.5L V8","MercedesW212-"+(++counter));
  }
  
  @Override
  public String toString(){
    return super.toString()+" "+Executive.description+", "+ClassE.description;
  }
}