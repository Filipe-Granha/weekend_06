package shop_management;
import java.util.ArrayList;
import behaviours.*;



public class Shop { 
  

  private String name;
  private ArrayList<Sellable> stock;



  public Shop(String name) { // ??    constructor --> Why don't we insert ArrayList as an argument?
  this.name = name;
  this.stock = new ArrayList<Sellable>();
}


public String getName() {
  return this.name;
}


public int stockCount() {
  return this.stock.size();
}

  public void addItem(Sellable anyItem) { // adds literally any item categorized as Sellable to the array Stock
   this.stock.add(anyItem);
 }


 public Sellable removeItem() { 
  if(stockCount() > 0) {
      return stock.remove(0); // removes item with index 0, if there is any item inside the array
    }
    return null;
  }


  public int totalPotentialProfit() {
    int count = 0;
    for(Sellable item : this.stock) { // I chose 'item', but could have been any other name
     count += item.calculateMarkup(); // applies Markup to each item in the array, and adds result to counter
   }
   return count;
 }


}