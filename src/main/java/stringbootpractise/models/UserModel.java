package stringbootpractise.models;

/**
 * Created by Mazexal on 2017/7/26.
 */
public class UserModel {
    public String userName;

    public long userId;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {

        return userName;
    }

    public long getUserId() {
        return userId;
    }
}
