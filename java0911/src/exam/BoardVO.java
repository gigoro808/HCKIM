package exam;
/**
 *
 * @author kosta
 Document : BoardVO Created on : ±èÇöÃ¶ 2014. 9. 11, ¿ÀÈÄ 2:11:10
 */

// POJO : VO (Value Object) 
public class BoardVO { 
    private String title;
    private String gender;
    private String name;
    private String story;
    private String date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
