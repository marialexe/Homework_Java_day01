public class Examination {
  private String subject;
  private int duration;
  private Person[] students;
  private Classroom[] classrooms;

  public Examination (String subject, int duration) {
    this.subject = subject;
    this.duration = duration;
    this.students = new Person[10];
    this.classrooms = new Classroom[3];
  }

  public String getSubject() {
    return this.subject;
  }

  
}