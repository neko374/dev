package com.example.web22;

public class ImageUploadDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_imgupload.id
     *
     * @mbg.generated Wed Oct 13 22:18:11 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_imgupload.img_title
     *
     * @mbg.generated Wed Oct 13 22:18:11 CST 2021
     */
    private String imgTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tab_imgupload.img_url
     *
     * @mbg.generated Wed Oct 13 22:18:11 CST 2021
     */
    private String imgUrl;
    private String imgText;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_imgupload.id
     *
     * @return the value of tab_imgupload.id
     *
     * @mbg.generated Wed Oct 13 22:18:11 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_imgupload.id
     *
     * @param id the value for tab_imgupload.id
     *
     * @mbg.generated Wed Oct 13 22:18:11 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_imgupload.img_title
     *
     * @return the value of tab_imgupload.img_title
     *
     * @mbg.generated Wed Oct 13 22:18:11 CST 2021
     */
    public String getImgTitle() {
        return imgTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_imgupload.img_title
     *
     * @param imgTitle the value for tab_imgupload.img_title
     *
     * @mbg.generated Wed Oct 13 22:18:11 CST 2021
     */
    public void setImgTitle(String imgTitle) {
        this.imgTitle = imgTitle == null ? null : imgTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tab_imgupload.img_url
     *
     * @return the value of tab_imgupload.img_url
     *
     * @mbg.generated Wed Oct 13 22:18:11 CST 2021
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tab_imgupload.img_url
     *
     * @param imgUrl the value for tab_imgupload.img_url
     *
     * @mbg.generated Wed Oct 13 22:18:11 CST 2021
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public void setImgText(String imgText) {
        this.imgText = imgText;
    }
}