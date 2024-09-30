package src.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Camels extends PackAnimals {

    Integer humps;

    public Camels() {
        super();
        this.humps = 2;
    }

    public Camels(String name, String stringBirthDate, String stringCommands) {
        super(name, stringBirthDate, stringCommands, "Camel", 0);
        this.humps = 2;
    }

    public Camels(String name, LocalDate birthDate, ArrayList<String> commandsList) {
        super(name, birthDate, commandsList, "Camel", 100);
        this.humps = 2;
    }

    public Integer getHumps() {
        return humps;
    }

    public void setHumps(Integer humps) {
        this.humps = humps;
    }

}
