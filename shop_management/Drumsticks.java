package shop_management;
import behaviours.*;



public class Drumsticks implements Sellable {

  String brand;
  String size;
  int buyPrice;
  int sellPrice;
  

  // constructor - initialises the variables of the object 
  public Drumsticks(String brand, String size, int buyPrice, int sellPrice) {
    this.brand = brand;
    this.size = size;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }



  public String getBrand() {
    return this.brand;
  }
  

  public int calculateMarkup() { // from Sellable interface
    return sellPrice - buyPrice;
  }
}