package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import javax.swing.*;
import java.util.Arrays;

public class MainDao {
    public static void main(String[] args) {
       UserDao userDao = new UserDao();

      //Tworzenie nowego user'a
       /*User user = new User();
       user.setUserName("Kasia");
       user.setEmail("katrina@gmail.pl");
       user.setPassword("lubiekwiatki");
       userDao.create(user);*/

        //Odczyt danych user po id
       /*User read = userDao.read(1);
        System.out.println(read);
        //Odczyt danych nie istniejącego user po id
        User empty = userDao.read(4);
        System.out.println(empty);*/

        //Zmiana danych user'a po podanym id
        /*User update = userDao.read(1);
        update.setUserName("Mateusz");
        update.setEmail("matty@gmail.com");
        update.setPassword("jasnygwint");
        userDao.update(read);*/

        //Usunięcie usera o podanym id
        //userDao.delete(6);

        //Wyczytanie całej tablicy users powstałej z tabeli users na dwa sposoby
        /*User[] findAll = userDao.findAll();
        System.out.println(Arrays.toString(findAll));
        for (User user: findAll){
            System.out.println(user);
        }*/


    }
}
