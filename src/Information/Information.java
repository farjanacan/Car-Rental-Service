package Information;

public class Information {
    private String id;
    private String name;
    private String gender;
    private String loc;
    private String joinDate;
    public Information(){
        this.id = "";
        this.name="";
        this.gender="";
        this.loc="";
        this.joinDate="";
    }
    public Information(String id, String name,String gender, String loc,String joinDate){
        this.id = id;
        this.name=name;
        this.gender=gender;
        this.loc=loc;
        this.joinDate=joinDate;
    }
    
    public String getId() {
     return id;
    }

    public void setId(String id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender=gender;
    }

    public String getLoc() {
        return loc;
    }
    public void setLoc(String loc) {
        this.loc=loc;
    }    
    public String getJD() {
        return joinDate;
    }
    public void setJD(String joinDate) {
        this.joinDate=joinDate;
    }
    
}
