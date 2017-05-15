import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ExaminationTest {
  Examination exam1;
  Examination exam2;
  Examination exam3;
  Person student1;
  Person student2;
  Person student3;
  Person student4;
  Person student5;
  Person student6;
  Person student7;
  Person student8;
  Person student9;
  Classroom classroom3;
  Classroom classroom5;
  Classroom classroom7;

  @Before
  public void before() {
    exam1 = new Examination("Maths",3);
    exam2 = new Examination("Logic",2);
    exam3 = new Examination("Computer Science",3)

    classroom3 = new Classroom(3,5,false);
    classroom5 = new Classroom(5,7,true);
    classroom7 = new Classroom(7,9,true);

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
  
}