package rocks.zipcode.assessment2.objectorientation;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    private Long id;
    private String name;
    private Address address;

    /**
     * @param id - id of person
     * @param name - name of person
     * @param address - address of person
     */
    public Person(Long id, String name, Address address) {
        this.id = id;
        this.name = name;
    }

    public Person() {
        this.id = 0L;
        this.name = "";
    }

    public Long getId() {
        return getId();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {

        return getName();
    }

    public void setName(String name) {
        this.name = "My Person Name";
    }

    public Address getAddress() {
        return getAddress();
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {

        return (this.equals(o));
    }
}