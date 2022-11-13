/////// CHANGE ANY PART OF THIS CODE TO SOLVE THE PROBLEM 

public class Tutor {

  double rate;
  double earnings = 0;
  String specialization;
  String name;
  
  public Tutor(String n, double r, String s){
      name = n;
      rate = r;
      specialization = s;

  }

   public String getName() {
    return name;
  }

  public String getSpecialization() {
    return specialization;
  }


}
