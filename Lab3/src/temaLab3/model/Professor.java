package temaLab3.model;

public class Professor extends Person{

    private String course;
    private int year;

    public Professor(Person person){
        super(person.getName(), person.getPhoneNumber(), person.getEmailAddress());
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Professor{" +
                " name= '" + getName() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", emailAddress='" + getEmailAddress() + '\'' +
                ", course='" + course + '\'' +
                ", year=" + year +
                '}';
    }
}
