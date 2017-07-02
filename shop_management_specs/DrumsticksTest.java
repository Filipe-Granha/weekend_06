import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;



public class DrumsticksTest {
  
  Drumsticks zDrumsticks;

  @Before
  public void before() {
    zDrumsticks = new Drumsticks("Zildjian", "5A", 10, 20);
  }


  @Test
  public void hasBrand(){
    assertEquals("Zildjian", zDrumsticks.getBrand());
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(10, zDrumsticks.calculateMarkup());
  }

} 