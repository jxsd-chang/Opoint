package cn.opt.po;

public class Note {
    private Integer noteId;

    private Integer noteUser;

    private String noteInfo;

    private String noteTime;

    private Integer brushId;

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public Integer getNoteUser() {
        return noteUser;
    }

    public void setNoteUser(Integer noteUser) {
        this.noteUser = noteUser;
    }

    public String getNoteInfo() {
        return noteInfo;
    }

    public void setNoteInfo(String noteInfo) {
        this.noteInfo = noteInfo == null ? null : noteInfo.trim();
    }

    public String getNoteTime() {
        return noteTime;
    }

    public void setNoteTime(String noteTime) {
        this.noteTime = noteTime == null ? null : noteTime.trim();
    }

    public Integer getBrushId() {
        return brushId;
    }

    public void setBrushId(Integer brushId) {
        this.brushId = brushId;
    }
}