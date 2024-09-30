package src.Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class PackAnimals extends Animals {

    private String typePackAnimal;
    private Integer workload;

    public PackAnimals() {
        super();
        this.typePackAnimal = "";
        this.workload = 0;
    }

    public PackAnimals(String name, String stringBirthDate, String stringCommands) {
        super(name, stringBirthDate, stringCommands);
        this.typePackAnimal = "";
        this.workload = 0;
    }

    public PackAnimals(String name, LocalDate birthDate, ArrayList<String> commandsList) {
        super(name, birthDate, commandsList);
        this.typePackAnimal = "";
        this.workload = 0;
    }

    public PackAnimals(String name, String stringBirthDate, String stringCommands, String typePackAnimal,
            Integer workload) {
        super(name, stringBirthDate, stringCommands);
        this.typePackAnimal = typePackAnimal;
        this.workload = workload;
    }

    public PackAnimals(String name, LocalDate birthDate, ArrayList<String> commandsList, String typePackAnimal,
            Integer workload) {
        super(name, birthDate, commandsList);
        this.typePackAnimal = typePackAnimal;
        this.workload = workload;
    }

    public String getTypePackAnimal() {
        return typePackAnimal;
    }

    public void setTypePackAnimal(String typePackAnimal) {
        this.typePackAnimal = typePackAnimal;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

}
