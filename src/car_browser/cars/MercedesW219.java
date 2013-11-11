package car_browser.cars;

import car_browser.classes.ClassCLS;

import java.util.Random;

public class MercedesW219 extends SecondCategory {
  private static int counter;
  
  public MercedesW219(){
    super(new Random().nextInt(7)+2004,new String[]{"Mexico","Germany"},"5.0L V8","MercedesW219-"+(++counter));
    nameOfDesigner="Michael Fink";
  }
  
  @Override
  public String toString(){
    return super.toString()+" "+Executive.description+", "+ClassCLS.description;
  }
}