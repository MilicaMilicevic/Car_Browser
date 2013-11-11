package car_browser.cars;

public class Executive extends Car { //poslovno auto
  protected static String description="Executive";
  
  public Executive(int yearOfProduction,String[] countryOfOrigin, String engineModel, String nameCar){
    super(yearOfProduction,countryOfOrigin,engineModel,nameCar);
  }
}