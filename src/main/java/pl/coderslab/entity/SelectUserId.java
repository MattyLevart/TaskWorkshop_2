package pl.coderslab.entity;

public class SelectUserId {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User read = userDao.read(1);
        System.out.println(read.toString());

    }
}

