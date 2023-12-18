package dori89.tripsplanapplication.users.models;

import dori89.tripsplanapplication.commons.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {


    private String firstName;
    private String lastName;
    private String emailAddress;
    private long roleId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

}
