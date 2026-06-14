package modul_4.praktikum_1.tanpa_srp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan isi modul_2.laporan: ");
        String reportText = scanner.nextLine();

        System.out.print("Masukkan nama file modul_2.laporan: ");
        String reportFileName = scanner.nextLine();

        ReportManager reportManager = new ReportManager(reportText);
        String report = reportManager.generateReport();

        reportManager.saveToFile(reportFileName + ".txt");
        reportManager.printReport();
    }
}
