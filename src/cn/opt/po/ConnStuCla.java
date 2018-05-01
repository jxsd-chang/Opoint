package cn.opt.po;

public class ConnStuCla extends ConnStuClaKey {
    private String submitWorkTitle;

    private String submitWorkInfo;

    private String submitWorkTime;

    public String getSubmitWorkTitle() {
        return submitWorkTitle;
    }

    public void setSubmitWorkTitle(String submitWorkTitle) {
        this.submitWorkTitle = submitWorkTitle == null ? null : submitWorkTitle.trim();
    }

    public String getSubmitWorkInfo() {
        return submitWorkInfo;
    }

    public void setSubmitWorkInfo(String submitWorkInfo) {
        this.submitWorkInfo = submitWorkInfo == null ? null : submitWorkInfo.trim();
    }

    public String getSubmitWorkTime() {
        return submitWorkTime;
    }

    public void setSubmitWorkTime(String submitWorkTime) {
        this.submitWorkTime = submitWorkTime == null ? null : submitWorkTime.trim();
    }
}