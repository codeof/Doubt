package master;

public class master2 {
    private String mastername;
    private String masterid;

    public String getMastername() {
        return mastername;
    }

    public void setMastername(String mastername) {
        this.mastername = mastername;
    }

    public String getMasterid() {
        return masterid;
    }

    public void setMasterid(String masterid) {
        this.masterid = masterid;
    }

    public master2(String mastername, String masterid) {
        this.mastername = mastername;
        this.masterid = masterid;
    }
}
