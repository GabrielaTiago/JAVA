package holidays;

public class Holiday {
    private String day;
    private String name;

    public Holiday(String day, String name) {
        this.setDay(day);
        this.setName(name);
    }

    public String getDay() {
        return day;
    }

    protected void setDay(String day) {
        this.day = day;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}