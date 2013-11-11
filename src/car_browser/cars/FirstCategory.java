package car_browser.cars;

import car_browser.classes.ClassE;


public class FirstCategory extends Executive implements ClassE { //ovako mozemo kreirati novu seriju aut. koji su
                                                                    //i executive i classE
  public FirstCategory(int yearOfProduction,String[] countryOfOrigin,String engineModel,String nameCar){
    super(yearOfProduction,countryOfOrigin,engineModel,nameCar);
  }
}