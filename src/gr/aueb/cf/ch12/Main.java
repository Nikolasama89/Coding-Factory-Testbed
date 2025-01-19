package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;
import gr.aueb.cf.ch12.model.UserCredentials;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1L, "Nikolaos", "Michos");
        UserCredentials userOne = new UserCredentials(1L,"Nikolasama", "@4568384@");

        System.out.println("{ " + user1.getId() + ", " + user1.getFirstname() + ", " + user1.getLastname()+ "}");
        System.out.println("{ " + userOne.getId() + ", " + userOne.getUsername() + ", " + userOne.getPassword()+ "}");
    }
}
