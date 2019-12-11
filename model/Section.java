package edu.ctb.upm.midas.rhdwiki.model;

public class Section {

    private Integer toclevel;
    private String level;
    private String line;
    private String number;
    private String index;
    private String fromtitle;
    private Integer byteoffset;
    private String anchor;

    public Section() {
    }

    public Section(Integer toclevel, String level, String line, String number, String index, String fromtitle, Integer byteoffset, String anchor) {
        this.toclevel = toclevel;
        this.level = level;
        this.line = line;
        this.number = number;
        this.index = index;
        this.fromtitle = fromtitle;
        this.byteoffset = byteoffset;
        this.anchor = anchor;
    }

    public Integer getToclevel() {
        return toclevel;
    }

    public void setToclevel(Integer toclevel) {
        this.toclevel = toclevel;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFromtitle() {
        return fromtitle;
    }

    public void setFromtitle(String fromtitle) {
        this.fromtitle = fromtitle;
    }

    public Integer getByteoffset() {
        return byteoffset;
    }

    public void setByteoffset(Integer byteoffset) {
        this.byteoffset = byteoffset;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    @Override
    public String toString() {
        return "Section{" +
                "toclevel=" + toclevel +
                ", level='" + level + '\'' +
                ", line='" + line + '\'' +
                ", number='" + number + '\'' +
                ", index='" + index + '\'' +
                ", fromtitle='" + fromtitle + '\'' +
                ", byteoffset=" + byteoffset +
                ", anchor='" + anchor + '\'' +
                '}';
    }
}
