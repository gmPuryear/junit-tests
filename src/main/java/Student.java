import java.util.ArrayList;
import java.util.List;

public class Student {
    private Long id;
    private String name;
    private List<Integer> grades;


    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public double getGradeAverage() {
        return grades.stream.red(0, grade) -> (sum + grade) / grades.size();
    }


    //    private String name;
//    private Long id;
//    private ArrayList<Integer> grades;
//
//    public Student(String name, Long id, ArrayList<Integer> grades) {
//        this.name = name;
//        this.id = id;
//        this.grades = grades;
//    }
//
//    // returns the student's id
//    public long getId(){
//        return id;
//    }
//
//    // returns the student's name
//    public String getName(){
//        return name;
//    }
//
//    // adds the given grade to the grades list
//    public void addGrade(int grade){
//        this.grades.add(grade);
//    }
//
//    // returns the list of grades
//    public ArrayList<Integer> getGrades(){
//        return grades;
//    }
//
//    // returns the average of the students grades
//    public double getGradeAverage(){
//        double sum = 0;
//        for (double i : grades) {
//            sum += i;
//        }
//        return sum / grades.size();
//    }
}
