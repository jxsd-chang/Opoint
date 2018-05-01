package cn.opt.po;

public class Kninfo {
    private Integer kninfoId;

    private Integer kpId;

    private String kninfoContent;

    private String kninfoTitle;

    public Integer getKninfoId() {
        return kninfoId;
    }

    public void setKninfoId(Integer kninfoId) {
        this.kninfoId = kninfoId;
    }

    public Integer getKpId() {
        return kpId;
    }

    public void setKpId(Integer kpId) {
        this.kpId = kpId;
    }

    public String getKninfoContent() {
        return kninfoContent;
    }

    public void setKninfoContent(String kninfoContent) {
        this.kninfoContent = kninfoContent == null ? null : kninfoContent.trim();
    }

    public String getKninfoTitle() {
        return kninfoTitle;
    }

    public void setKninfoTitle(String kninfoTitle) {
        this.kninfoTitle = kninfoTitle == null ? null : kninfoTitle.trim();
    }
}