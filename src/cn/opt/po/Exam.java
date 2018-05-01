package cn.opt.po;

public class Exam {
    private String exId;

    private Integer stuId;

    private Integer couId;

    private Integer paId;

    private String exOptAns;

    private String exDatiAns;

    private String exTime;

    private String exGrade;

    private Integer exState;

    private Integer teaId;

    public String getExId() {
        return exId;
    }

    public void setExId(String exId) {
        this.exId = exId == null ? null : exId.trim();
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getCouId() {
        return couId;
    }

    public void setCouId(Integer couId) {
        this.couId = couId;
    }

    public Integer getPaId() {
        return paId;
    }

    public void setPaId(Integer paId) {
        this.paId = paId;
    }

    public String getExOptAns() {
        return exOptAns;
    }

    public void setExOptAns(String exOptAns) {
        this.exOptAns = exOptAns == null ? null : exOptAns.trim();
    }

    public String getExDatiAns() {
        return exDatiAns;
    }

    public void setExDatiAns(String exDatiAns) {
        this.exDatiAns = exDatiAns == null ? null : exDatiAns.trim();
    }

    public String getExTime() {
        return exTime;
    }

    public void setExTime(String exTime) {
        this.exTime = exTime == null ? null : exTime.trim();
    }

    public String getExGrade() {
        return exGrade;
    }

    public void setExGrade(String exGrade) {
        this.exGrade = exGrade == null ? null : exGrade.trim();
    }

    public Integer getExState() {
        return exState;
    }

    public void setExState(Integer exState) {
        this.exState = exState;
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }
}