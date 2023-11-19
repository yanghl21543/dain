package dain;
// IncomeTaxRequest.java
public class IncomeTaxRequest {
    private double income;
    private String maritalStatus;
    private int numDependents;

    public IncomeTaxRequest() {
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getNumDependents() {
        return numDependents;
    }

    public void setNumDependents(int numDependents) {
        this.numDependents = numDependents;
    }
}
