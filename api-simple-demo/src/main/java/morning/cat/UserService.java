package morning.cat;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/7/10 10:32 AM
 */
public interface UserService {

    User get();

    User get(String userNo);
}
