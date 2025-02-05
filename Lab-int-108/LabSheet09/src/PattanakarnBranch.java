public class PattanakarnBranch {
    private int unit;

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getUnit() {
        return unit;
    }

    public int getTotalPrice() {
        return unit * 100;
    }

    public int payUnit() {
        return unit / 2;
    }

    public int freeUnit() {
        return unit - payUnit();
    }

    public String getBranchDetails() {
        return "You buy " + payUnit() + " units, get free " + freeUnit() + " units (" + getTotalPrice() + ").";
    }
}