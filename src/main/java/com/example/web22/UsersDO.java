package com.example.web22;

public class UsersDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_users.id
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_users.uname
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    private String uname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_users.pwd
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    private String pwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_users.uicon
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    private String uicon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_users.point
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    private Integer point;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_users.id
     *
     * @return the value of tab_users.id
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_users.id
     *
     * @param id the value for tab_users.id
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_users.uname
     *
     * @return the value of tab_users.uname
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_users.uname
     *
     * @param uname the value for tab_users.uname
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_users.pwd
     *
     * @return the value of tab_users.pwd
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_users.pwd
     *
     * @param pwd the value for tab_users.pwd
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_users.uicon
     *
     * @return the value of tab_users.uicon
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    public String getUicon() {
        return uicon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_users.uicon
     *
     * @param uicon the value for tab_users.uicon
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    public void setUicon(String uicon) {
        this.uicon = uicon == null ? null : uicon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_users.point
     *
     * @return the value of tab_users.point
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_users.point
     *
     * @param point the value for tab_users.point
     *
     * @mbg.generated Fri Oct 08 18:22:51 CST 2021
     */
    public void setPoint(Integer point) {
        this.point = point;
    }
}