package cn.opt.po;

public class Publish {
    private String publishId;

    private Integer teaId;

    private Integer claId;

    private String workTitle;

    private String workInfo;

    private String workPic;

    private String publishTime;

    private String publishEndtime;

    public String getPublishId() {
        return publishId;
    }

    public void setPublishId(String publishId) {
        this.publishId = publishId == null ? null : publishId.trim();
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public Integer getClaId() {
        return claId;
    }

    public void setClaId(Integer claId) {
        this.claId = claId;
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(String workTitle) {
        this.workTitle = workTitle == null ? null : workTitle.trim();
    }

    public String getWorkInfo() {
        return workInfo;
    }

    public void setWorkInfo(String workInfo) {
        this.workInfo = workInfo == null ? null : workInfo.trim();
    }

    public String getWorkPic() {
        return workPic;
    }

    public void setWorkPic(String workPic) {
        this.workPic = workPic == null ? null : workPic.trim();
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime == null ? null : publishTime.trim();
    }

    public String getPublishEndtime() {
        return publishEndtime;
    }

    public void setPublishEndtime(String publishEndtime) {
        this.publishEndtime = publishEndtime == null ? null : publishEndtime.trim();
    }
}