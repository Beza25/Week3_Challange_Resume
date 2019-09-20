package Week3_Challange;

public class Skills {
    private String skillName;
    private String skillRating;
    //--------------------Constructors---------------------
    public Skills(){
        this.skillName = "";
        this.skillRating = "";
    }
    public Skills(String skillName, String skillRating){
        this.skillName = skillName;
        this.skillRating = skillRating;
    }
    //--------------------Methods----------------------
    public String toString(){
        return getSkillName() + ", " + getSkillRating();
    }
    //------------------Getters and Setters------------------

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillRating() {
        return skillRating;
    }

    public void setSkillRating(String skilRating) {
        this.skillRating = skilRating;
    }
}
