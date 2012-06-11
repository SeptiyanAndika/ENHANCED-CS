/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enchantedcs;

/**
 *
 * @author Hexa Null
 */
public class NewClass {
    public static void main(String[] args) {
        java.text.NumberFormat numberFormat= java.text.NumberFormat.getNumberInstance();
double number = Double.parseDouble("12000.57");
String numberStr = numberFormat.format(number);
        System.out.println(numberStr);

        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("#,##0");
double numberq = Double.parseDouble("12000.57");
        System.out.println(
        decimalFormat.format(numberq));

    }
}
