package system2;

public class machine1 {
    private String machinename;
    private String machineid;

    public String getMachinename() {
        return machinename;
    }

    public void setMachinename(String machinename) {
        this.machinename = machinename;
    }

    public String getMachineid() {
        return machineid;
    }

    public void setMachineid(String machineid) {
        this.machineid = machineid;
    }

    public machine1(String machinename, String machineid) {
        this.machinename = machinename;
        this.machineid = machineid;
    }
}
