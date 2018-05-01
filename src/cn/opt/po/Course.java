package cn.opt.po;

public class Course {
    private Integer couId;

    private String couName;

    private String couSummary;

    private String couFlag;

    private String couImgname;

    private String couLable1;

    private String couLable2;

    private String couLable3;

    private String couLable4;

    private String couPerson;

    private String couAim;

    public Integer getCouId() {
        return couId;
    }

    public void setCouId(Integer couId) {
        this.couId = couId;
    }

    public String getCouName() {
        return couName;
    }

    public void setCouName(String couName) {
        this.couName = couName == null ? null : couName.trim();
    }

    public String getCouSummary() {
        return couSummary;
    }

    public void setCouSummary(String couSummary) {
        this.couSummary = couSummary == null ? null : couSummary.trim();
    }

    public String getCouFlag() {
        return couFlag;
    }

    public void setCouFlag(String couFlag) {
        this.couFlag = couFlag == null ? null : couFlag.trim();
    }

    public String getCouImgname() {
        return couImgname;
    }

    public void setCouImgname(String couImgname) {
        this.couImgname = couImgname == null ? null : couImgname.trim();
    }

    public String getCouLable1() {
        return couLable1;
    }

    public void setCouLable1(String couLable1) {
        this.couLable1 = couLable1 == null ? null : couLable1.trim();
    }

    public String getCouLable2() {
        return couLable2;
    }

    public void setCouLable2(String couLable2) {
        this.couLable2 = couLable2 == null ? null : couLable2.trim();
    }

    public String getCouLable3() {
        return couLable3;
    }

    public void setCouLable3(String couLable3) {
        this.couLable3 = couLable3 == null ? null : couLable3.trim();
    }

    public String getCouLable4() {
        return couLable4;
    }

    public void setCouLable4(String couLable4) {
        this.couLable4 = couLable4 == null ? null : couLable4.trim();
    }

    public String getCouPerson() {
        return couPerson;
    }

    public void setCouPerson(String couPerson) {
        this.couPerson = couPerson == null ? null : couPerson.trim();
    }

    public String getCouAim() {
        return couAim;
    }

    public void setCouAim(String couAim) {
        this.couAim = couAim == null ? null : couAim.trim();
    }
}