

/////// CHANGE ANY PART OF THIS CODE TO SOLVE THE PROBLEM 

public class Tutee {
  final String name, subject;
  double money, grade;
  static int totalTutorialSessions = 0;

  public Tutee(String n, double m) {
    name = n;
    money = m;
    subject = "Math";
  }

  public Tutee(String n, double m, String s, double g) {
    name = n;
    money = m;
    subject = s;
    grade = g;
  }

  public String getName() {
    return name;
  }

  public String getSubject() {
    return subject;
  }

  public double getMoney() {
    return money;
  }

  public double getGrade() {
    return grade;
  }

  public int getTotalTutorialSessions() {
    return totalTutorialSessions;
  }

  public boolean consult(Tutor t) {
    if (money >= t.rate) {
      return true;
    } else {
      return false;
    }
  }

  public boolean check80() {
    if (grade > 80) {
      return true;
    } else {
      return false;
    }
  }
}
