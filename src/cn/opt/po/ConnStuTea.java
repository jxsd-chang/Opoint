package cn.opt.po;

public class ConnStuTea {
    private Integer askId;

    private Integer stuId;

    private Integer teaId;

    private String askInfo;

    private String askPic;

    private String askTime;

    private String solveInfo;

    private String solveTime;

    private Integer askState;

    private Integer isatten;

    public Integer getAskId() {
        return askId;
    }

    public void setAskId(Integer askId) {
        this.askId = askId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getAskInfo() {
        return askInfo;
    }

    public void setAskInfo(String askInfo) {
        this.askInfo = askInfo == null ? null : askInfo.trim();
    }

    public String getAskPic() {
        return askPic;
    }

    public void setAskPic(String askPic) {
        this.askPic = askPic == null ? null : askPic.trim();
    }

    public String getAskTime() {
        return askTime;
    }

    public void setAskTime(String askTime) {
        this.askTime = askTime == null ? null : askTime.trim();
    }

    public String getSolveInfo() {
        return solveInfo;
    }

    public void setSolveInfo(String solveInfo) {
        this.solveInfo = solveInfo == null ? null : solveInfo.trim();
    }

    public String getSolveTime() {
        return solveTime;
    }

    public void setSolveTime(String solveTime) {
        this.solveTime = solveTime == null ? null : solveTime.trim();
    }

    public Integer getAskState() {
        return askState;
    }

    public void setAskState(Integer askState) {
        this.askState = askState;
    }

    public Integer getIsatten() {
        return isatten;
    }

    public void setIsatten(Integer isatten) {
        this.isatten = isatten;
    }
}