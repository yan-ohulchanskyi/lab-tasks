package models;

import java.util.Objects;

public class Human {
    public String firstName;
    public String lastName;
    public String middleName;
    public Sex sex;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        var human = (Human)obj;

        if (!Objects.equals(human.firstName, firstName)) {
            return false;
        }

        if (!Objects.equals(human.lastName, lastName)) {
            return false;
        }

        if (!Objects.equals(human.middleName, middleName)) {
            return false;
        }

        if (human.sex != sex) {
            return false;
        }

        return true;
    }
}
