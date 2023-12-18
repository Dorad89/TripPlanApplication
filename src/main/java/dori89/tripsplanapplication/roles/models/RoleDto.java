package dori89.tripsplanapplication.roles.models;

import dori89.tripsplanapplication.commons.BaseDto;

public class RoleDto extends BaseDto{

    private String roleTitle;

    public String getRoleTitle() {
        return roleTitle;
    }

    public void setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
    }
}
