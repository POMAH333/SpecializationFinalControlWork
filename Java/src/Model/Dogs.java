package src.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Dogs extends Pets {

    String breed;
    boolean HomeOrStreet;

    public Dogs() {
        super();
        this.breed = "";
        this.HomeOrStreet = true;
    }

    public Dogs(String name, String stringBirthDate, String stringCommands) {
        super(name, stringBirthDate, stringCommands, "Dog", "freedom");
        this.breed = "";
        this.HomeOrStreet = true;
    }

    public Dogs(String name, LocalDate birthDate, ArrayList<String> commandsList) {
        super(name, birthDate, commandsList, "Dog", "freedom");
        this.breed = "";
        this.HomeOrStreet = true;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isHomeOrStreet() {
        return HomeOrStreet;
    }

    public void setHomeOrStreet(boolean homeOrStreet) {
        HomeOrStreet = homeOrStreet;
    }

}
