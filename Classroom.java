public class Classroom {
  private int number;
  private int maxCapacity;
  private boolean lockers;
  private Person[] students;

  public Classroom(int number, int max_capacity, boolean lockers) {
    this.number = number;
    this.maxCapacity = maxCapacity;
    this.lockers = lockers;
    this.students = new Person[7];
  }

  public int getNumber() {
    return this.number;
  }

  public int studentsCount() {
    int count=0;
    for(Person student : students)
      if (student !=null) {
        count++;
      }
    return count;  
  }

  public void addStudent(Person student) {
    if (isClassRoomFull()) {
      return;
    }
    int index = studentsCount();
    students[index] = student;
    String name = student.firstName;
  }

  public boolean isClassRoomFull() {
    return studentsCount() == students.length;
  }

  public void classesTerminate() {
    for(int i=0; i<students.length; i++) {
      students[i]=null;
    }
  }

}