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
 

  public int stockCount(){
    return this.stock.size();
  }

  public void addItem(Sellable item){
   this.stock.add(item);
  }


  public Sellable removeItem(){
    if(stockCount() > 0){
      return stock.remove(0);
    }
    return null;
  }


  public int totalPotentialProfit() {
    int count = 0;
    for(Sellable item : this.stock) { // I chose 'item', but could have been any other name
     count += item.calculateMarkup();
    }
   return count;
   }


}