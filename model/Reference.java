package edu.ctb.upm.midas.rhdwiki.model;

import java.util.List;

public class Reference {

    private Integer id;
    private String referenceId;
    private String text;
    private String type;
    private List<Link> backLinks;
    private List<Link> textLinks;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Link> getBackLinks() {
        return backLinks;
    }

    public void setBackLinks(List<Link> backLinks) {
        this.backLinks = backLinks;
    }

    public List<Link> getTextLinks() {
        return textLinks;
    }

    public void setTextLinks(List<Link> textLinks) {
        this.textLinks = textLinks;
    }


    @Override
    public String toString() {
        return "Reference{" +
                "id=" + id +
                ", referenceId='" + referenceId + '\'' +
                ", text='" + text + '\'' +
                ", type='" + type + '\'' +
                ", backLinks=" + backLinks +
                ", textLinks=" + textLinks +
                '}';
    }
}
