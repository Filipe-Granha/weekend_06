package shop_management;
import behaviours.*;



public class Piano extends Instruments implements Sellable, Playable {

  String colour;
  int numberOfKeys;
  int buyPrice;
  int sellPrice;


  // constructor - initialises the variables of the object 
  public Piano(InstrumentType type, String material, String colour, int numberOfKeys, int buyPrice, int sellPrice) { // although type comes from superclass, the argument still needs to be referred to as ENUM
    super(type, material); 
    this.colour = colour;
    this.numberOfKeys = numberOfKeys;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }


  public String play() { // from Playable interface
    return "Dooon Doooon DOOOOOOoooooon";
  }

  public int calculateMarkup() { // from Sellable interface
    return sellPrice - buyPrice;
  }
}