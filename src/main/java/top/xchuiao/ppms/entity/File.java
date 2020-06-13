package top.xchuiao.ppms.entity;

import java.io.Serializable;

/**
 * (File)实体类
 *
 * @author xchuiao
 * @since 2020-06-13 17:50:48
 */
public class File implements Serializable {
    private static final long serialVersionUID = -38910976430967105L;
    
    private Long fileId;
    
    private Long subId;
    
    private String fileName;
    
    private String fileRealName;
    
    private Integer fileType;


    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getSubId() {
        return subId;
    }

    public void setSubId(Long subId) {
        this.subId = subId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileRealName() {
        return fileRealName;
    }

    public void setFileRealName(String fileRealName) {
        this.fileRealName = fileRealName;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

}