package shop_management;



public abstract class Instruments { // Superclass

  String type;
  String material;



public Instruments(String type, String material) { // constructor
  this.type = type;
  this.material = material;
}

public String getType() { // all child classes will have access to this method
  return this.type;
}

public String getMaterial() { // all child classes will have access to this method
  return this.material;
}
 
}
