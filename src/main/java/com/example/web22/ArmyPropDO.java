package com.example.web22;

public class ArmyPropDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column army_prop.propid
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    private Integer propid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column army_prop.propname
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    private String propname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column army_prop.propdescp
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    private String propdescp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column army_prop.propid
     *
     * @return the value of army_prop.propid
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    public Integer getPropid() {
        return propid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column army_prop.propid
     *
     * @param propid the value for army_prop.propid
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    public void setPropid(Integer propid) {
        this.propid = propid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column army_prop.propname
     *
     * @return the value of army_prop.propname
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    public String getPropname() {
        return propname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column army_prop.propname
     *
     * @param propname the value for army_prop.propname
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    public void setPropname(String propname) {
        this.propname = propname == null ? null : propname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column army_prop.propdescp
     *
     * @return the value of army_prop.propdescp
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    public String getPropdescp() {
        return propdescp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column army_prop.propdescp
     *
     * @param propdescp the value for army_prop.propdescp
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    public void setPropdescp(String propdescp) {
        this.propdescp = propdescp == null ? null : propdescp.trim();
    }
}