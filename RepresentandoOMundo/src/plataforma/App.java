package plataforma;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        User newUser = new User();
        Course newCourse = new Course();
        ArrayList<String> classes = new ArrayList<>();
 
        classes.add("Cálculo 1");
        classes.add("Algoritimos e Programação de Computadores");
        classes.add("Algebra Linear");

        newCourse.setState( "Distrito Federal");
        newCourse.setUniversity("Universidade de Brasília");
        newCourse.setCampus("FGA - Gama");
        newCourse.setCourseName("Engenharia de Software");
        newCourse.setEntranceYear("1º de 2022");
        newCourse.setClasses(classes);

        newUser.setName("Gabriela");
        newUser.setLastName("Tiago");
        newUser.setEmail("gabriela@gmail.com");
        newUser.setPassword("Teste123$");
        newUser.setCourse(newCourse);

        System.out.println(newUser.getCourse().getCampus());
    }
}