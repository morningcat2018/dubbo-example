package morning.cat;


public class UserServiceImpl implements UserService {
    public User get() {
        return User.builder().userNo("U2019xxxxx0021").x(100L).y(100L).build();
    }

    public User get(String userNo) {
        return User.builder().userNo(userNo).x(666L).y(666L).build();
    }
}
