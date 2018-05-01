package cn.opt.po;

public class Clagrade {
    private Integer claId;

    private Integer claNo;

    private String claName;

    private Integer claCapacity;

    private String claIntro;

    private Integer teaId;

    public Integer getClaId() {
        return claId;
    }

    public void setClaId(Integer claId) {
        this.claId = claId;
    }

    public Integer getClaNo() {
        return claNo;
    }

    public void setClaNo(Integer claNo) {
        this.claNo = claNo;
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName == null ? null : claName.trim();
    }

    public Integer getClaCapacity() {
        return claCapacity;
    }

    public void setClaCapacity(Integer claCapacity) {
        this.claCapacity = claCapacity;
    }

    public String getClaIntro() {
        return claIntro;
    }

    public void setClaIntro(String claIntro) {
        this.claIntro = claIntro == null ? null : claIntro.trim();
    }

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }
}