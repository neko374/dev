package com.example.web22;

public class TabYlglDo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_ylgl.id
     *
     * @mbg.generated Thu Oct 14 15:58:22 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_ylgl.data
     *
     * @mbg.generated Thu Oct 14 15:58:22 CST 2021
     */
    private String data;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_ylgl.name
     *
     * @mbg.generated Thu Oct 14 15:58:22 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_ylgl.state
     *
     * @mbg.generated Thu Oct 14 15:58:22 CST 2021
     */
    private String state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_ylgl.id
     *
     * @return the value of tab_ylgl.id
     *
     * @mbg.generated Thu Oct 14 15:58:22 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_ylgl.id
     *
     * @param id the value for tab_ylgl.id
     *
     * @mbg.generated Thu Oct 14 15:58:22 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_ylgl.data
     *
     * @return the value of tab_ylgl.data
     *
     * @mbg.generated Thu Oct 14 15:58:22 CST 2021
     */
    public String getData() {
        return data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_ylgl.data
     *
     * @param data the value for tab_ylgl.data
     *
     * @mbg.generated Thu Oct 14 15:58:22 CST 2021
     */
    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_ylgl.name
     *
     * @return the value of tab_ylgl.name
     *
     * @mbg.generated Thu Oct 14 15:58:22 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_ylgl.name
     *
     * @param name the value for tab_ylgl.name
     *
     * @mbg.generated Thu Oct 14 15:58:22 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_ylgl.state
     *
     * @return the value of tab_ylgl.state
     *
     * @mbg.generated Thu Oct 14 15:58:22 CST 2021
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_ylgl.state
     *
     * @param state the value for tab_ylgl.state
     *
     * @mbg.generated Thu Oct 14 15:58:22 CST 2021
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

//    @Override
//    public String toString() {
//        return "ArmyBaseDO{" +
//                "id=" + id +
//                ",data='" + data + '\'' +
//                ",name='" + name + '\'' +
//                ",state='" + state + '\'' +
//                '}';
//    }
}