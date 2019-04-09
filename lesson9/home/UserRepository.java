package Lesson9.home;

import java.util.Arrays;

public class UserRepository {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {

        return users;
    }

    public String[] getUserNames() {


        String[] names = new String[countUsers()];
        int ind = 0;
        for (User user : users) {
            if (user != null) {
                names[ind] = user.getName();
                ind++;
            }
        }

        return names;
    }

    public long[] getUserIds() {
        long[] ids = new long[countUsers()];
        int ind1 = 0;
        for (User user : users) {
            if (user != null) {
                ids[ind1] = user.getId();
                ind1++;
            }
        }
        return ids;
    }

    public String getUserNameById(long id) {
        String userName = null;
        for (User user : users) {
            if (user != null && user.getId() == id)
                userName = user.getName();
        }
        return userName;
    }

    private int countUsers() {
        int count = 0;
        for (User user : users) {
            if (user != null)
                count++;
        }
        return count;
    }

    public User getUserByName(String name) {
        User usersN = null;
        for (User user : users) {
            if (user != null && user.getName() == name)
                usersN = user;
            return usersN;
        }
        return usersN;
    }

    public User findById(long Id) {
        User usersN = null;
        for (User userN : users) {
            if (userN != null && userN.getId() == Id)
                usersN = userN;
        }
        return usersN;
    }

    public User getUserBySessionId(String sessionId) {
        User usersN = null;
        for (User user : users) {
            if (user != null && user.getSessionId() == sessionId)
                usersN = user;
        }
        return usersN;
    }

    public User save(User user) {
        User userM = findById(user.getId());
        for (User userN : users) {
            if (userN == userM && userN != null)
                return null;
        }
        int i = 0;
        for (User userN : users){
            if (userN == null) {
                users[i] = user;
                return user;
            }
            i++;
        }
        return null;
    }

    public User update(User user){
        User userM = findById(user.getId());
        int i = 0;
        for (User userN : users){
            if(userN == userM && userN != null){
                users[i] = user;
                return user;
            }
            i++;
        }
        return null;
    }

    public void delete(long id){
        User userM = findById(id);
        int i = 0;
        for (User userN : users){
            if(userN == userM && userN != null){
                users[i] = null;
            }
            i++;
        }
    }
}
