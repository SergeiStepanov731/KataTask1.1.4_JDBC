package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.createUsersTable();
        userDao.saveUser("Ivan", "Ivanov", (byte) 18);
        userDao.saveUser("Petr", "Petrov", (byte) 21);
        userDao.saveUser("Egor", "Egorov", (byte) 25);
        userDao.saveUser("Vasiliy", "Vasiliev", (byte) 30);
        System.out.println(userDao.getAllUsers());
        userDao.removeUserById(1);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        System.out.println(userDao.getAllUsers());
        userDao.dropUsersTable();
        userDao.dropUsersTable();

    }
}
