package com.example.web22;

public class ArmyAbilityDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column army_ability.abilityid
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    private Integer abilityid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column army_ability.abilitytitle
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    private String abilitytitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column army_ability.abilitydescp
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    private String abilitydescp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column army_ability.abilityid
     *
     * @return the value of army_ability.abilityid
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    public Integer getAbilityid() {
        return abilityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column army_ability.abilityid
     *
     * @param abilityid the value for army_ability.abilityid
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    public void setAbilityid(Integer abilityid) {
        this.abilityid = abilityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column army_ability.abilitytitle
     *
     * @return the value of army_ability.abilitytitle
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    public String getAbilitytitle() {
        return abilitytitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column army_ability.abilitytitle
     *
     * @param abilitytitle the value for army_ability.abilitytitle
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    public void setAbilitytitle(String abilitytitle) {
        this.abilitytitle = abilitytitle == null ? null : abilitytitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column army_ability.abilitydescp
     *
     * @return the value of army_ability.abilitydescp
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    public String getAbilitydescp() {
        return abilitydescp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column army_ability.abilitydescp
     *
     * @param abilitydescp the value for army_ability.abilitydescp
     *
     * @mbg.generated Sun Oct 10 18:40:47 CST 2021
     */
    public void setAbilitydescp(String abilitydescp) {
        this.abilitydescp = abilitydescp == null ? null : abilitydescp.trim();
    }
}