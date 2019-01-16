package com.yidai.model.entity.basic;

import java.io.Serializable;
import java.util.Date;

public class AwardDocument implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 所属礼包ID
     */
    private Integer packageId;

    /**
     * 资料类型
     */
    private Integer type;

    /**
     * 资料名称
     */
    private String title;

    /**
     * 富文本资料名称
     */
    private String htmlName;

    /**
     * 富文本资料内容
     */
    private String htmlText;

    /**
     * H5资料名称
     */
    private String h5Name;

    /**
     * H5外链地址
     */
    private String h5Text;

    /**
     * 上传文件名称
     */
    private String fileName;

    /**
     * 上传文件地址
     */
    private String fileUrl;

    /**
     * 禁启用
     */
    private Boolean disable;

    /**
     * 操作人ID
     */
    private Integer operatorId;

    /**
     * 并联时间
     */
    private Date bindTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * award_document
     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHtmlName() {
        return htmlName;
    }

    public void setHtmlName(String htmlName) {
        this.htmlName = htmlName;
    }

    public String getHtmlText() {
        return htmlText;
    }

    public void setHtmlText(String htmlText) {
        this.htmlText = htmlText;
    }

    public String getH5Name() {
        return h5Name;
    }

    public void setH5Name(String h5Name) {
        this.h5Name = h5Name;
    }

    public String getH5Text() {
        return h5Text;
    }

    public void setH5Text(String h5Text) {
        this.h5Text = h5Text;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Date getBindTime() {
        return bindTime;
    }

    public void setBindTime(Date bindTime) {
        this.bindTime = bindTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}