import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;



public class ShopTest {

  Shop shop;
  Guitar rockGuitar;
  Piano classicPiano;
  Drumsticks zDrumsticks;


  @Before
  public void before() { // creates one object of each item in the shop to be used in all the tests
    shop = new Shop("Ray's Music Exchange");
    rockGuitar = new Guitar(InstrumentType.STRINGS, "metal", "black", 6, 100, 150);
    classicPiano = new Piano(InstrumentType.PERCUSSION, "wood", "black", 88, 500, 1000);
    zDrumsticks = new Drumsticks("Zildjian", "5A", 10, 20);
  }


  @Test
  public void hasName() {
    assertEquals("Ray's Music Exchange", shop.getName());
  }


  @Test
  public void shopStartsEmpty() {
    assertEquals(0, shop.stockCount());
  }




  @Test
  public void canAddGuitar() {
    shop.addItem(rockGuitar);
    assertEquals(1, shop.stockCount());
  }


  @Test
  public void canAddPiano() {
    shop.addItem(classicPiano);
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void canAddDrumsticks() {
    shop.addItem(zDrumsticks);
    assertEquals(1, shop.stockCount());
  }




  @Test
  public void hasTotalPotentialProfit() {
    shop.addItem(rockGuitar);
    shop.addItem(classicPiano);
    shop.addItem(zDrumsticks);
    assertEquals(560, shop.totalPotentialProfit());
  }

}