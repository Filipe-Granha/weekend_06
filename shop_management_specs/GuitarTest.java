import static org.junit.Assert.*;
import org.junit.*;
import shop_management.*;



public class GuitarTest {
  
  Guitar rockGuitar;

  @Before
  public void before() {
    rockGuitar = new Guitar("strings", "metal", "black", 6, 100, 150);
  }

  @Test
  public void hasType() {
    assertEquals("strings", rockGuitar.getType());
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