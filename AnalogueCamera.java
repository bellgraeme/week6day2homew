public class AnalogueCamera implements Camera{

  private String name;
  private Integer speed;
  private Integer price;

  public AnalogueCamera(String name, Integer speed, Integer price){
  this.name = name;
  this.speed = speed;
  this.price = price;
}


public String printDetails(){
  return this.name;
}



}
