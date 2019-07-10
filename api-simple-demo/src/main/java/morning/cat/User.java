package morning.cat;

import java.io.Serializable;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/7/10 10:33 AM
 */
public class User implements Serializable {

    private String userNo;

    private Long x;

    private Long y;

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public Long getX() {
        return x;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public Long getY() {
        return y;
    }

    public void setY(Long y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "User{" +
                "userNo='" + userNo + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
