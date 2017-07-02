import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;



public class PianoTest {
  
  Piano classicPiano;

  @Before
  public void before() { // creates a piano object to be used in all the tests
    classicPiano = new Piano(InstrumentType.PERCUSSION, "wood", "black", 88, 500, 1000);
  }


  @Test
  public void hasType() {
    assertEquals(InstrumentType.PERCUSSION, classicPiano.getType()); // getType inherited from superclass
  }



  @Test
  public void canPlay() {
    assertEquals("Dooon Doooon DOOOOOOoooooon", classicPiano.play());
  }


  @Test
  public void canCalculateMarkup() {
    assertEquals(500, classicPiano.calculateMarkup());
  }

}