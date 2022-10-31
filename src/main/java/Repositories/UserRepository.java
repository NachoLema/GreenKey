package Repositories;

import IRepositories.IUserRepository;
import Models.User;

import java.util.ArrayList;

public class UserRepository implements IUserRepository {


    @Override
    public ArrayList<User> getUsers() {
        return null;
    }

    @Override
    public User getUser(String id) {
        User u = new User();
        u.setName("Nacho");
        u.setLastName("Lema");
        return  u;
    }




}
