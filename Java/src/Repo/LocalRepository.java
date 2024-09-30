package src.Repo;

import src.Model.*;

import java.util.ArrayList;
import java.util.List;

public class LocalRepository implements Repository {

    @Override
    public List<Animals> getAnimals() {
        ArrayList<Animals> animals = new ArrayList<>(32);
        animals.add(new Dogs("Fido", "2020-01-01", "Sit, Stay, Fetch"));
        animals.add(new Cats("Whiskers", "2019-05-15", "Sit, Pounce"));
        animals.add(new Hamsters("Hammy", "2021-03-10", "Roll, Hide"));
        animals.add(new Dogs("Buddy", "2018-12-10", "Sit, Paw, Bark"));
        animals.add(new Cats("Smudge", "2020-02-20", "Sit, Pounce, Scratch"));
        animals.add(new Hamsters("Peanut", "2021-08-01", "Roll, Spin"));
        animals.add(new Dogs("Bella", "2019-11-11", "Sit, Stay, Roll"));
        animals.add(new Cats("Oliver", "2020-06-30", "Meow, Scratch, Jump"));
        animals.add(new Horses("Thunder", "2015-07-21", "Trot, Canter, Gallop"));
        animals.add(new Camels("Sandy", "2016-11-03", "Walk, Carry Load"));
        animals.add(new Donkeys("Eeyore", "2017-09-18", "Walk, Carry Load, Bray"));
        animals.add(new Horses("Storm", "2014-05-05", "Trot, Canter"));
        animals.add(new Camels("Dune", "2018-12-12", "Walk, Sit"));
        animals.add(new Donkeys("Burro", "2019-01-23", "Walk, Bray, Kick"));
        animals.add(new Horses("Blaze", "2016-02-29", "Trot, Jump, Gallop"));
        animals.add(new Camels("Sahara", "2015-08-14", "Walk, Run"));
        return animals;
    }
}
