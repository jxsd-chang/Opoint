package cn.opt.po;

public class Brush {
    private Integer brushId;

    private Integer kpId;

    private String brushTitle;

    private String brushParse;

    public Integer getBrushId() {
        return brushId;
    }

    public void setBrushId(Integer brushId) {
        this.brushId = brushId;
    }

    public Integer getKpId() {
        return kpId;
    }

    public void setKpId(Integer kpId) {
        this.kpId = kpId;
    }

    public String getBrushTitle() {
        return brushTitle;
    }

    public void setBrushTitle(String brushTitle) {
        this.brushTitle = brushTitle == null ? null : brushTitle.trim();
    }

    public String getBrushParse() {
        return brushParse;
    }

    public void setBrushParse(String brushParse) {
        this.brushParse = brushParse == null ? null : brushParse.trim();
    }
}