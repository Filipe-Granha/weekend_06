package shop_management;
import behaviours.*;



public class Guitar extends Instruments implements Sellable, Playable {

  String colour;
  int numberOfStrings;
  int buyPrice;
  int sellPrice;


  // constructor - initialises the variables of the object 
  public Guitar(InstrumentType type, String material, String colour, int numberOfStrings, int buyPrice, int sellPrice) { // although type comes from superclass, the argument still needs to be referred to as ENUM
    super(type, material);
    this.colour = colour;
    this.numberOfStrings = numberOfStrings;
    this.buyPrice = buyPrice;
    this.sellPrice = sellPrice;
  }

  public String play() { // from Playable interface
    return "wwwaahhhhhwahwahwahwahhhh";
  }



  public int calculateMarkup() { // from Sellable interface
    return sellPrice - buyPrice;
  }
}