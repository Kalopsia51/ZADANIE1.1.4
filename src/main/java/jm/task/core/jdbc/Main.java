package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Dima", "Zhuk", (byte) 25);
        userService.saveUser("Zhima", "Duk", (byte) 15);
        userService.saveUser("Roma", "Gol", (byte) 26);
        userService.saveUser("Zanch", "Dash", (byte) 21);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();



    }
}
