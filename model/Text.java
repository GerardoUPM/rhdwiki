package edu.ctb.upm.midas.rhdwiki.model;
/**
 * Created by gerardo on 16/09/2019.
 *
 * @author Gerardo Lagunes G. ${EMAIL}
 * @version ${<VERSION>}
 * @project dsvp-rest
 * @className Text
 * @see
 */
public class Text {
    private Integer id;
    private Long characterCount;//Número de carateres de todos los textos de cada sección
    private String content;


    public Text() {
    }

    public Text(Integer id,  String content) {
        this.id = id;
        this.content = content;
    }

    public Text(Integer id, Long characterCount, String content) {
        this.id = id;
        this.characterCount = characterCount;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCharacterCount() {
        return characterCount;
    }

    public void setCharacterCount(Long characterCount) {
        this.characterCount = characterCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "Text{" +
                "id=" + id +
                ", characterCount=" + characterCount +
                ", content='" + content + '\'' +
                '}';
    }
}
