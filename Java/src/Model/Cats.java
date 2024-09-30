package src.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cats extends Pets {

    String breed;

    public Cats() {
        super();
        this.breed = "";
    }

    public Cats(String name, String stringBirthDate, String stringCommands) {
        super(name, stringBirthDate, stringCommands, "Cat", "freedom");
        this.breed = "";
    }

    public Cats(String name, LocalDate birthDate, ArrayList<String> commandsList) {
        super(name, birthDate, commandsList, "Cat", "freedom");
        this.breed = "";
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
