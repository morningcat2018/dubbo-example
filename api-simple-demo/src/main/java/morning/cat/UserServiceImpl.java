package morning.cat;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/7/10 10:35 AM
 */
public class UserServiceImpl implements UserService {
    public User get() {
        User user = new User();
        user.setUserNo("U2019xxxxx0021");
        user.setX(100L);
        user.setY(100L);
        return user;
    }

    public User get(String userNo) {
        User user = new User();
        user.setUserNo(userNo);
        user.setX(333L);
        user.setY(333L);
        return user;
    }
}
