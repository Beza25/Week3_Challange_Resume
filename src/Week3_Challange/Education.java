package Week3_Challange;

public class Education {
    private String degreeType;
    private String major;
    private String University;
    private int graduationYear;
    //-----------------------------Constructors------------------------
    public Education() {
        this.degreeType = "";
        this.major = "";
        this.University = "";
        this.graduationYear = 0000;
    }
    public Education(String degreeType, String major, String university, int graduationYear){
        this.degreeType = degreeType;
        this.major = major;
        this.University = university;
        this.graduationYear = graduationYear;
    }
    //-------------------------Methods-------------------------------------
    public String toSting(){
        return getDegreeType() + " in " + getMajor() + ",\n" +
                getUniversity() + ", " + getGraduationYear() +"\n";
    }
    //----------------------Getters and Setters-----------------------------

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }
}
