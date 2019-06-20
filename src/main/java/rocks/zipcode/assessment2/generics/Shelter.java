package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<Occupant> extends Ageable implements Iterable{

    private List<Occupant> occupants;


    public Shelter() {
        this.occupants = new ArrayList<>();
 //       throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return occupants.size();
    }

    public void add(Occupant occupant) {
        occupants.add(occupant);
    }

    public Boolean contains(Occupant occupant) {

        return occupants.contains(occupant);
    }

    public void remove(Occupant occupant) {
        occupants.remove(occupant);
    }

    public Occupant get(Integer index) {

        return occupants.get(index);
    }

    public Integer getIndexOf(Occupant ageable) {

        return occupants.indexOf(ageable);
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}