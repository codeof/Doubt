package branch1;

public class branch1 {
    private String branchname;
    private String branchId;

    public branch1(String branchname, String branchId) {
        this.branchname = branchname;
        this.branchId = branchId;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }
}
