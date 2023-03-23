package plataforma;

import java.util.List;

public class Course {
    private String state;
    private String university;
    private String campus;
    private String courseName;
    private String entranceYear;
    private List<String> classes;

    public void setState(String state) {
        if (state.isEmpty()) {
            System.out.println("The 'state' can't be empty");
            return;
        }
        this.state = state;
    }

    public void setUniversity(String university) {
        if (university.isEmpty()) {
            System.out.println("The 'university' can't be empty");
            return;
        }
        this.university = university;
    }

    public void setCampus(String campus) {
        if (campus.isEmpty()) {
            System.out.println("The 'campus' can't be empty");
            return;
        }
        this.campus = campus;
    }

    public void setCourseName(String courseName) {
        if (courseName.isEmpty()) {
            System.out.println("The 'course name' can't be empty");
            return;
        }
        this.courseName = courseName;
    }

    public void setEntranceYear(String entranceYear) {
        if (entranceYear.isEmpty()) {
            System.out.println("The 'entrance year' can't be empty");
            return;
        }
        this.entranceYear = entranceYear;
    }

    public void setClasses(List<String> classes) {
        if (classes.isEmpty()) {
            System.out.println("The 'classes' can't be empty");
            return;
        }
        this.classes = classes;
    }

    public String getState() {
        return state;
    }

    public String getUniversity() {
        return university;
    }

    public String getCampus() {
        return campus;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getEntranceYear() {
        return entranceYear;
    }

    public List<String> getClasses() {
        return classes;
    }

}