package behaviours;

public interface Sellable { // classes that implement this interface will have to use this method
  int calculateMarkup(int buyPrice, int sellPrice); 
}