import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;



public class GuitarTest {
  
  Guitar rockGuitar;

  @Before
  public void before() { // creates a guitar object to be used in all the tests
    rockGuitar = new Guitar(InstrumentType.STRINGS, "metal", "black", 6, 100, 150);
  }

  @Test
  public void hasType() { 
    assertEquals(InstrumentType.STRINGS, rockGuitar.getType()); // getType inherited from superclass
  }


  @Test
  public void canPlay() {
    assertEquals("wwwaahhhhhwahwahwahwahhhh", rockGuitar.play());
  }


  @Test
  public void canCalculateMarkup() {
    assertEquals(50, rockGuitar.calculateMarkup());
  }

}