package cn.opt.po;

public class Student {
    private Integer stuId;

    private String stuName;

    private String stuPwd;

    private String stuSex;

    private Integer stuJifen;

    private String stuPro;

    private String stuTel;

    private String stuGrade;

    private String stuPic;

    private Integer stuQuecount;

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuPwd() {
        return stuPwd;
    }

    public void setStuPwd(String stuPwd) {
        this.stuPwd = stuPwd == null ? null : stuPwd.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public Integer getStuJifen() {
        return stuJifen;
    }

    public void setStuJifen(Integer stuJifen) {
        this.stuJifen = stuJifen;
    }

    public String getStuPro() {
        return stuPro;
    }

    public void setStuPro(String stuPro) {
        this.stuPro = stuPro == null ? null : stuPro.trim();
    }

    public String getStuTel() {
        return stuTel;
    }

    public void setStuTel(String stuTel) {
        this.stuTel = stuTel == null ? null : stuTel.trim();
    }

    public String getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(String stuGrade) {
        this.stuGrade = stuGrade == null ? null : stuGrade.trim();
    }

    public String getStuPic() {
        return stuPic;
    }

    public void setStuPic(String stuPic) {
        this.stuPic = stuPic == null ? null : stuPic.trim();
    }

    public Integer getStuQuecount() {
        return stuQuecount;
    }

    public void setStuQuecount(Integer stuQuecount) {
        this.stuQuecount = stuQuecount;
    }
}