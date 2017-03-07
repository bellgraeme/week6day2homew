import java.util.*;

public class Photographer{

  private HashMap<String, Integer> journal;
  private ArrayList<Camera> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
    this.journal = new HashMap<String, Integer>();
  }

  public void addCamera(Camera camera){
    cameras.add(camera);
  }

  public int count(){
    return cameras.size();
  }

  public Camera removeCamera(){
   if (count() > 0 ) {
     return cameras.remove(count() - 1);
   }
   return null;
 }

 public ArrayList cameraDetails(){
   ArrayList<String> list = new ArrayList<String>();
   for (Camera camera: cameras) {
    list.add(camera.printDetails());
  }
  return list;
}

public void addHash(String string, Integer integer){
  this.journal.put(string,integer);
}

public HashMap  journal(){
  return this.journal;
}


}

