package car_browser.cars;

public class GrandTourer extends Car {  //trkace auto
  protected static String description="GrandTourer";
  
  public GrandTourer(int yearOfProduction,String[] countryOfOrigin,String engineModel,String nameCar){
    super(yearOfProduction,countryOfOrigin,engineModel,nameCar);
  }
}