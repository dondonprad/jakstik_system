package jakstik.ac.id.beans;

import java.util.Date;
import java.util.List;

import jakstik.ac.id.model.User;

public interface ILogin_user {
    public List<User> getAllUser();
    public User getUserById(long id);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(long id);
    public List<User> getUsersByDate(Date date);
    public List<User> getUsersByStatus(String status);  

    
}
