import javax.swing.JOptionPane;

public class Shop100Baht {
    public static void main(String[] args) {
        Product product = new Product();
        int unit = Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:"));
        product.setUnit(unit);

        int confirm = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?", "Confirm", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            PattanakarnBranch branch = new PattanakarnBranch();
            branch.setUnit(unit);
            JOptionPane.showMessageDialog(null, branch.getBranchDetails());
        } else {
            JOptionPane.showMessageDialog(null, product.toString());
        }
    }
}