package Models;


public class Author {
    public static void main(String[] args) {

    }
    private String name;
    private String country;
    private int birthYear;
    public Author(){}

    public Author(String name,String country, int birthday){
        this.name = name;
        this.country = country;
        this.birthYear = birthday;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
