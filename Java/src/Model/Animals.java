package src.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Animals {
    private String name;
    private LocalDate birthDate;
    private ArrayList<String> commands = new ArrayList<>();

    public Animals() {
        this.name = "";
        this.birthDate = LocalDate.MIN;
    }

    public Animals(String name, LocalDate birthDate, ArrayList<String> commandsList) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commandsList;
    }

    public Animals(String name, String stringBirthDate, String stringCommands) {
        this.name = name;
        this.birthDate = stringBirthDateToLocalDate(stringBirthDate);
        this.commands = stringCommandsToList(stringCommands);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void addCommands(String stringCommands) {
        commands.addAll(stringCommandsToList(stringCommands));
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\t{\t" +
                "name='" + name + '\'' +
                ", \tbirthDate=" + birthDate +
                ", \tcommandsList=" + commands +
                "\t}";
    }

    private ArrayList<String> stringCommandsToList(String stringCommands) {
        if (stringCommands.isEmpty())
            return new ArrayList<>();
        String[] arr = stringCommands.split(",");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim().toLowerCase();
            arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
        }
        return new ArrayList<>(Arrays.asList(arr));
    }

    private LocalDate stringBirthDateToLocalDate(String stringBirthDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(stringBirthDate, formatter);
    }
}
