package shop_management;
import behaviours.*;

public class Guitar extends Instruments implements Sellable, Playable {
  
  String colour;
  int numberOfStrings;
  int buyPrice;
  int sellPrice;

  public Guitar(String type, String material, String colour, int numberOfStrings, int buyPrice, int sellPrice) { // constructor
    super(type, material);
    this.colour = colour;
    this.numberOfStrings = numberOfStrings;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public String play() { // from Playable interface
    return "wwwaahhhhhwahwahwahwahhhh"
  }

  public int calculateMarkup(int buyPrice, int sellPrice) { // from Sellable interface
    return sellPrice - buyPrice;
  }
}