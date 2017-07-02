package shop_management;



public abstract class Instruments { // Superclass

  InstrumentType type;
  String material;



public Instruments(InstrumentType type, String material) { // constructor
  this.type = type;
  this.material = material;
}

public InstrumentType getType() { // all child classes will have access to this method
  return this.type;
}

public String getMaterial() { // all child classes will have access to this method
  return this.material;
}

}
