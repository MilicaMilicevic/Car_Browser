package car_browser.cars;

import java.util.*;

public abstract class Car {              //ne postoji auto koje nije ni executive ni grandtourer!
  private int yearOfProduction;          //godina prozivodnje
  private String[] countryOfOrigin;     //zemlje proizvodnje
  protected String nameOfDesigner;     //da se ne provlaci kroz konstruktore!
  private String nameCar;              //ispis->dodato
  private Engine engine;               //referenca na motor
  
  private class Engine {               //ugnjezdena klasa!
    String nameEngine;
    
    Engine(String arg){
      nameEngine=arg;
    }
  }
  
  public Car(int arg1,String[] arg2,String arg3,String arg4){
    yearOfProduction=arg1;
    countryOfOrigin=arg2;
    engine=new Engine(arg3);
    nameCar=arg4;
  }

 @Override
 public String toString(){
   String result=nameCar+" [Year of production: "+yearOfProduction+"|Country of origin: ";
   for(int i=0;i<countryOfOrigin.length-1;i++)
       result+=countryOfOrigin[i]+",";
   result+=countryOfOrigin[countryOfOrigin.length-1]+"|Engine: "+engine.nameEngine;
   if(nameOfDesigner!=null) 
     result+="|Designer: "+nameOfDesigner+"]";
   else 
     result+="]";
   return result;
 }
 
 public int getYOProduction(){
   return yearOfProduction;
 }
}


  
 