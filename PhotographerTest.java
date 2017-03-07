import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{

  Photographer person;
  AnalogueCamera acamera;
  DigitalCamera dcamera;



  @Before
  public void before(){
    person = new Photographer();
    acamera = new AnalogueCamera("Cannon", 200, 200);
    dcamera = new DigitalCamera("Panasonic", 400, 4200);
    person.addCamera(acamera);
    person.addCamera(dcamera);
    person.addHash("Monday", 5);
  }

  @Test
  public void canAddCamera(){  
    assertEquals(2, person.count());
  }

  @Test
  public void canRemoveCamera(){
    person.removeCamera();
    assertEquals(1, person.count());
    }


  @Test
  public void canGetCameraDetails(){
    assertEquals("Cannon", acamera.printDetails());
  }
  @Test
  public void detailsFromList(){
    Object [] list = person.cameraDetails().toArray();
    assertEquals("Cannon", list[0]);
  }

  @Test
  public void canAddtoHash(){
 assertEquals(1,person.journal().size());
  }

}