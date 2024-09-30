package src.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hamsters extends Pets {

    String color;

    public Hamsters() {
        super();
        this.color = "";
    }

    public Hamsters(String name, String stringBirthDate, String stringCommands) {
        super(name, stringBirthDate, stringCommands, "Hamster", "Cage");
        this.color = "";
    }

    public Hamsters(String name, LocalDate birthDate, ArrayList<String> commandsList) {
        super(name, birthDate, commandsList, "Hamster", "Cage");
        this.color = "";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
