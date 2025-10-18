/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataPasien;
import net.sf.jasperreports.engine.*;
/**
 *
 * @author User
 */
public class CompileReport {
    public static void main(String[] args) {
        try {
            String sourceFile = "src/DataPasien/ReportDataPasien.jrxml"; // lokasi file jrxml
            String destFile = "src/DataPasien/ReportDataPasien.jasper"; // hasil compile
            JasperCompileManager.compileReportToFile(sourceFile, destFile);
            System.out.println("Report compiled successfully!");
        } catch (JRException e) {
            e.printStackTrace();
        }
    }
}
