package model;

/**
 * Created by rishabhmahajani on 9/9/16.
 */
public enum ClassStanding {
    FRESHMAN("FR", "Freshman"), SOPHOMORE("SO", "Sophomore"), JUNIOR("JU", "Junior"), SENIOR("SE", "Senior");

    private String representation = "";
    private String classValue = "";
    private ClassStanding(String representation, String classValue) {
        this.representation = representation;
        this.classValue = classValue;
    }
    public String getRepresentation() { return this.representation;}
    public String getClassValue() { return this.classValue;}
    public void setRepresentation(String representation){this.representation = representation;}
}
