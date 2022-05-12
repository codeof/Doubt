package master;

public class master {
    private String mastername;
    private String masterId;

    public master(String mastername, String masterId) {
        this.mastername = mastername;
        this.masterId = masterId;
    }

    public String getMastername() {
        return mastername;
    }

    public void setMastername(String mastername) {
        this.mastername = mastername;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }
}
