package src.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pets extends Animals {

    private String typePet;
    private String condition;

    public Pets() {
        super();
        this.typePet = "";
        this.condition = "";
    }

    public Pets(String name, String stringBirthDate, String stringCommands) {
        super(name, stringBirthDate, stringCommands);
        this.typePet = "";
        this.condition = "";
    }

    public Pets(String name, LocalDate birthDate, ArrayList<String> commandsList) {
        super(name, birthDate, commandsList);
        this.typePet = "";
        this.condition = "";
    }

    public Pets(String name, String stringBirthDate, String stringCommands, String typePet, String condition) {
        super(name, stringBirthDate, stringCommands);
        this.typePet = typePet;
        this.condition = condition;
    }

    public Pets(String name, LocalDate birthDate, ArrayList<String> commandsList, String typePet, String condition) {
        super(name, birthDate, commandsList);
        this.typePet = typePet;
        this.condition = condition;
    }

    public String getTypePet() {
        return typePet;
    }

    public void setTypePet(String typePet) {
        this.typePet = typePet;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

}
