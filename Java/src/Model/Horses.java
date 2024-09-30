package src.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Horses extends PackAnimals {

    String breed;

    public Horses() {
        super();
    }

    public Horses(String name, String stringBirthDate, String stringCommands) {
        super(name, stringBirthDate, stringCommands, "Horse", 0);
    }

    public Horses(String name, LocalDate birthDate, ArrayList<String> commandsList) {
        super(name, birthDate, commandsList, "Horse", 80);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

}
