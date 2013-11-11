package car_browser.cars;

import car_browser.classes.ClassCLS;

public class SecondCategory extends Executive implements ClassCLS {
  
  public SecondCategory(int yearOfProduction,String[] countryOfOrigin,String engineModel,String nameCar){
    super(yearOfProduction,countryOfOrigin,engineModel,nameCar);
  }
}
