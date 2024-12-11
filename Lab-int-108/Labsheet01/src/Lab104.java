import javax.swing.*;

public class Lab104 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter employee name:");
        double hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter hours worked:"));
        double hourlyWage = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly wage:"));

        double grossEarnings = hoursWorked * hourlyWage;
        double taxRate = 0.15;
        double tax = grossEarnings * taxRate;
        double netEarnings = grossEarnings - tax;

        String result = String.format(
            "Employee name: %s\n" +
            "Hours worked: %.1f\n" +
            "Hourly wage: $ %.1f\n" +
            "Gross earnings: $ %.1f\n" +
            "Tax rate: %.1f\n" +
            "Tax: $ %.1f\n" +
            "Net earnings: $ %.1f",
            name, hoursWorked, hourlyWage, grossEarnings, taxRate, tax, netEarnings
        );

        JOptionPane.showMessageDialog(null, result, "Payroll Summary", JOptionPane.INFORMATION_MESSAGE);
    }
}