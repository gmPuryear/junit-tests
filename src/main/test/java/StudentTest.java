import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void studentGrades_ConstructorInitializedEmptyArray() {
        Student s1 = new Student();
        Assert.assertEquals(new ArrayList<Integer>().size(),s1.getGrades().size());
    }

    @Test
    public void student_GivenIDAndName_FieldsAreSet(){
        // Arrange
        String name = "george";
        long id = 10L;
        // Act
        Student s2 = new Student(id, name);
        // Assert
        Assert.assertEquals(id, s2.getId());
        Assert.assertEquals(name, s2.getName);
        dlxz205xk824
    }

    @Test
    public void student

    @Test


    @Test
    // 4 parts:

    // Arrange
        //Initialize and set any data needed

    // Act
        // perorm the action which you want to test against

    // Assert
        // ask: is the expected result the same as the actual result?


//    private Student student;
//
//    ArrayList<Double> grades = new ArrayList<Double>();
//    double grade1 = 50.0;
//    double grade2 = 80.0;
//    double grade3 = 99.0;
//    double grade4 = 76.0;
//    grades.add(grade1);
//    grades.add(grade2);
//
//    @Before
//    public void setup() {
//        student = new Student("George", 5,);
//    }
//
//    @Test



}
