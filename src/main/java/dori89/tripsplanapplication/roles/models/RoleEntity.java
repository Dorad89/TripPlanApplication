package dori89.tripsplanapplication.roles.models;

import dori89.tripsplanapplication.commons.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Roles")
public class RoleEntity extends BaseEntity {
    private String roleTitle;

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }
}
