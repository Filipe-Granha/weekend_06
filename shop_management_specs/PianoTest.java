import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;



public class PianoTest {
  
  Piano classicPiano;

  @Before
  public void before() {
    classicPiano = new Piano("percussion", "wood", "black", 88, 500, 1000);
  }


  @Test
  public void hasType(){
    assertEquals("percussion", classicPiano.getType());
  }


  @Test
  public void canCalculateMarkup() {
    assertEquals(500, classicPiano.calculateMarkup());
  }

}