package model;

/**
 * Created by rishabhmahajani on 9/9/16.
 */
public enum ClassStanding {
    FRESHMAN("FR"), SOPHOMORE("SO"), JUNIOR("JU"), SENIOR("SE");

    private String representation = "";
    private ClassStanding(String representation) {
        this.representation = representation;
    }
    public String getRepresentation() { return this.representation;}
    public void setRepresentation(String representation){this.representation = representation;}
}
