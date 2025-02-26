public class Director {
    private String name;
    private String email;
    private char gender;

    public Director(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getGenderName() {
        if(gender == 'm' && gender == 'M') return "male";
        if(gender == 'f' && gender == 'F') return "female";
        return null;
    }

    public String toString() {
        return name + " (" + email + ";" + getGenderName() + ")";
    }
}