package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        boolean result = false;
        User foundUser = null;
        for (User user :
                users) {
            if (login.equals(user.getUsername())){
                result = true;
                foundUser = user;
                break;
            }
        }
        if (!result){
            throw new UserNotFoundException("User not found");
        }
        return foundUser;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User invalid");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Username is less than three characters");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = null;
        try {
            user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}