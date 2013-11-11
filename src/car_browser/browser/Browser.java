package car_browser.browser;

import car_browser.cars.*;

import java.util.*;

public class Browser {
  public static void main(String[] args){
    List<Car> cars=new ArrayList<Car>();//kreiranje automobila
    for(int i=0;i<2;i++)
    {
      cars.add(new MercedesW140());//primjena polimorfizma
      cars.add(new MercedesW212());
      cars.add(new MercedesW219());
    }
    System.out.println("Unsorted:");
    Iterator iteratorCar=cars.iterator();
    while(iteratorCar.hasNext())
      System.out.println((Car)iteratorCar.next());
    Collections.sort(cars,new Comparator<Car>(){
      @Override
      public int compare(Car arg1,Car arg2){
        return arg1.getYOProduction()-arg2.getYOProduction();
      }
    });
    System.out.println("Sorted:");
    Iterator iteratorCar1=cars.iterator();
    while(iteratorCar1.hasNext())
      System.out.println((Car)iteratorCar1.next());
  }
}