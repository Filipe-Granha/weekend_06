package shop_management;
import behaviours.*;

public class Drumsticks implements Sellable {

  String brand;
  int size;
  int buyPrice;
  int sellPrice;

  public Drumsticks(String brand, int size, int buyPrice, int sellPrice) {
    this.brand = brand;
    this.size = size;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public int calculateMarkup(int buyPrice, int sellPrice) { // from Sellable interface
    return sellPrice - buyPrice;
  }
}