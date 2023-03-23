package plataforma;

public class User {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private Course course;

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("The 'name' can't be empty");
            return;
        }
        this.name = name;
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty()) {
            System.out.println("The 'last name' can't be empty");
            return;
        }
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        if (email.isEmpty()) {
            System.out.println("The 'email' can't be empty");
            return;
        }
        this.email = email;
    }

    public void setPassword(String password) {
        if (password.isEmpty()) {
            System.out.println("The 'password' can't be empty");
            return;
        }
        this.password = password;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Course getCourse() {
        return course;
    }
}