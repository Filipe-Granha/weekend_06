package shop_management;
import java.util.ArrayList;
import behaviours.*; // not sure if needed?

public class Shop {
  private String name;
  private ArrayList<Sellable> stock;

  public Shop(String name) {
    this.name = name;
    this.stock = new ArrayList<Sellable>();
  }



  public int totalPotentialProfit() {
    int count = 0;
    for(Sellable items : this.stock) { // I chose 'items', but could have been any other name
     count += items.calculateMarkup();
    }
   return count;
   }


}