package StuManage.StudentManger.src;

import javax.print.attribute.standard.JobOriginatingUserName;

public class User {
    private String userName;
    private String password;
    private String identity;
    private String phoneNumber;

    public User() {
    }

    public User(String userName, String password, String identity, String phoneNumber) {
        this.userName = userName;
        this.password = password;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * 设置
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "User{userName = " + userName + ", password = " + password + ", identity = " + identity + ", phoneNumber = " + phoneNumber + "}";
    }
}
