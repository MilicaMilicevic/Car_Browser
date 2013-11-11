package car_browser.cars;

import car_browser.classes.ClassCL;

public class ThirdCategory extends GrandTourer implements ClassCL {
  
  public ThirdCategory(int yearOfProduction,String[] countryOfOrigin,String engineModel,String nameCar){
    super(yearOfProduction,countryOfOrigin,engineModel,nameCar);
  }
}