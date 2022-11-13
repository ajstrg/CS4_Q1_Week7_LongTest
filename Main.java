// package cs4q1w7tutor;

import java.util.HashMap; // import hashmap
import java.util.Scanner; // import scanner

/**
 *
 * @author roy
 */
public class Main {


    /////// CHANGE ANY PART OF THIS CODE TO SOLVE THE PROBLEM 


  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);  
    System.out.println("\n\nTUTOR APP\n");
    
    // define contents of your hashmap
    
    Tutee s1 = new Tutee("Matthew", 1000, "Math", 70);
    Tutee s2 = new Tutee("John", 2000, "English", 75);
    
    Tutor t1 = new Tutor("Aaron",500, "Math");
    Tutor t2 = new Tutor("Danica", 200, "Math");
    Tutor t3 = new Tutor("Gerson", 600, "English" );

    // put defined contents in the hashmap

    HashMap<String, Tutee> tuteeMap = new HashMap<>();
    tuteeMap.put(s1.getName(), s1);
    tuteeMap.put(s2.getName(), s2);    
    
    HashMap<String, Tutor> tutorMap = new HashMap<>();
    tutorMap.put(t1.name, t1);
    tutorMap.put(t2.name, t2);
    tutorMap.put(t3.name, t3);
    
    int consultCount = 0;
    
    for(int i=0; i<7; i++){

        // list tutees
        System.out.println("\nEnter name of tutee: ");
        
        System.out.println("NAME \t\t SUBJECT \t\t GRADE");
        
        // output all the contents of the hashmap
        for(var t : tuteeMap.values()){
          System.out.printf(" - %s \t\t %s \t\t %S\n", t.getName(), t.getSubject(), t.getGrade());
        }
        
        // user input -- tutee name
        String tuteeName = input.nextLine();
        
        
        //check if tutee is in tuteeMap
        if(tuteeMap.containsKey(tuteeName)){

          // call user input tuteeName in Tutee.java
          
          Tutee userTutee = tuteeMap.get(tuteeName);
          System.out.println("\nEnter name of tutor: ");
        
          System.out.println("NAME \t\t SPECIALIZATION");
            for(var t : tutorMap.values()){
              System.out.printf(" - %s \t\t %s \n", t.getName(), t.getSpecialization());
            }

          String tutorName = input.nextLine();
  
          if (tutorMap.containsKey(tutorName)) {

            Tutor userTutor = tutorMap.get(tutorName); 

            // check if may pera pa si tutee
            if (userTutee.consult(userTutor)) {
           
              // check if match yung tutee and tutor 
              if ((userTutor.specialization).equals(userTutee.subject)) {
                System.out.println(tutorName + " helped " + tuteeName + " make great progress in " + userTutee.subject + ".");
                
                double newGrade = (userTutee.grade) + 3;
                System.out.println(tuteeName + " now has a grade of " + newGrade + ".");

                userTutee.grade = newGrade;

                double newMoney = (userTutee.money) - (userTutor.rate);
                System.out.println(tuteeName + " now has " + newMoney + " pesos left");

                userTutee.money = newMoney;

                consultCount++;

              }

              else {
                System.out.println(tutorName + " helped " + tuteeName + " a little.");
                
                double newGrade = (userTutee.grade) + 1;
                userTutee.grade = newGrade;

                double newMoney = (userTutee.money) - (userTutor.rate);
                userTutee.money = newMoney;

                consultCount++;
              }

              if (s1.grade > 80 && s2.grade > 80) {
                i = 7;
              }

            }

            else {
              System.out.println(tuteeName + " doesn't have enough money to have a consultation with " + tutorName + ".");
            }
          
          }

          else {
            System.out.printf("No tutor named %s is listed.\n", tutorName);
          }
        }
        else {
          System.out.printf("No tutee named %s is listed.\n", tuteeName);
        }
        
    }
    
    System.out.printf("\n\n%d consultations occurred.\n\n", consultCount);
  }          
}
