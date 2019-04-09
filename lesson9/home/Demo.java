package Lesson9.home;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        User users1 = new User(12345, "Ann", "first");
        User users2 = new User(12346, "Ann", "second");
        User users3 = new User(12347, "Ann", "third");

        User[] users = {users1, null, users2, null, null, null, null};
        UserRepository userRepository = new UserRepository(users);
       userRepository.getUserNames();
      // System.out.println(Arrays.toString(userRepository.getUserIds()));
       // userRepository.getUserNameById(123469);
       // userRepository.getUserByName("Jack");
//        System.out.println(Arrays.toString(userRepository.getUsers()));
//        System.out.println(userRepository.save(users3));
//       System.out.println(Arrays.toString(userRepository.getUsers()));
       System.out.println(userRepository.update(users2));
//        System.out.println(Arrays.toString(userRepository.getUsers()));
//        userRepository.delete(12347);
//        System.out.println(Arrays.toString(userRepository.getUsers()));


    }


}
