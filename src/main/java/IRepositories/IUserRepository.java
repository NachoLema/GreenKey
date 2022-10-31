package IRepositories;

import Models.User;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Repository
public interface IUserRepository {

    ArrayList<User> getUsers();
    User getUser(String id);


}
