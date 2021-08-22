package com.company.week_4.task_1;

import java.util.Arrays;

public class UserGroup {
    private User[] users=new User[10];
    private int countOfUsrs=0;

    public void addUser(User user){
        if(countOfUsrs==10){
            System.out.println("I am full");
        }else{
            users[countOfUsrs]=user;
            countOfUsrs++;
        }
    }
    public UserGroup clone(){
        UserGroup cloneOfUserGroup = new UserGroup();
        for (int i=0; i<this.countOfUsrs; i++){
            cloneOfUserGroup.addUser(users[i]);
        }
        return cloneOfUserGroup;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "users=" + Arrays.toString(users) +
                '}';
    }
}
