import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ClassroomTest {
  Classroom classroom;
  Person student1;
  Person student2;
  Person student3;
  Person student4;
  Person student5;
  Person student6;
  Person student7;
  Person student8;
  Person student9;

  @Before
  public void before() {
    classroom = new Classroom(5,7,true);
    student1 = new Person("Mariska", "Alexeva",27);
    student2 = new Person("Dina", "Zulkarnayeva",25);
    student3 = new Person("Teresa","Joia",30);
    student4 = new Person("Sezen", "Mercalogu",25);
    student5 = new Person("Andreea","Mitu",30);
    student6 = new Person("Svetlana", "Babkina",25);
    student7 = new Person("Cristina","Ilas",30);
    student8 = new Person("Florentina","Dumitru",35);
    student9 = new Person("Elena", "Diaconu",37);
  }

  @Test
  public void hasnumber() {
    assertEquals(5,classroom.getNumber());
  }

  @Test
  public void classroomInitiallyEmpty() {
    assertEquals(0,classroom.studentsCount());
  }

  @Test
  public void addStudentToClassroom() {
    classroom.addStudent(student1);
    assertEquals(1,classroom.studentsCount());
    classroom.addStudent(student2);
    assertEquals(2,classroom.studentsCount());
  }

  @Test
  public void classroomIsNotFull() {
    classroom.addStudent(student1);
    classroom.addStudent(student2);
    classroom.addStudent(student3);
    classroom.addStudent(student4);
    classroom.addStudent(student5);
    assertEquals(false,classroom.isClassRoomFull());
  }

  @Test
  public void classroomIsFull() {
    classroom.addStudent(student1);
    classroom.addStudent(student2);
    classroom.addStudent(student3);
    classroom.addStudent(student4);
    classroom.addStudent(student5);
    classroom.addStudent(student6);
    classroom.addStudent(student7);
    assertEquals(true,classroom.isClassRoomFull());
  }

  @Test
  public void canNotAddMoreStudentsWhenClassroomFull() {
    classroom.addStudent(student1);
    classroom.addStudent(student2);
    classroom.addStudent(student3);
    classroom.addStudent(student4);
    classroom.addStudent(student5);
    classroom.addStudent(student6);
    classroom.addStudent(student7);
    classroom.addStudent(student8);
    classroom.addStudent(student9);
    assertEquals(7,classroom.studentsCount());
  }

  @Test
  public void emptyClassroom() {
    classroom.addStudent(student1);
    classroom.addStudent(student2);
    classroom.addStudent(student3);
    classroom.addStudent(student4);
    classroom.classesTerminate();
    assertEquals(0,classroom.studentsCount());
  }
}