package src.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Donkeys extends PackAnimals {

    String color;

    public Donkeys() {
        super();
    }

    public Donkeys(String name, String stringBirthDate, String stringCommands) {
        super(name, stringBirthDate, stringCommands, "Donkey", 0);
    }

    public Donkeys(String name, LocalDate birthDate, ArrayList<String> commandsList) {
        super(name, birthDate, commandsList, "Donkey", 50);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
