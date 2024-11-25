/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasiresepmasakan;

/**
 *
 * @author ACER A314
 */
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CetakPDF {

    // Path ke file font
    private static final String FONT_PATH = "resources/fonts/Courier New Regular.ttf";

    public static void cetakResep(String namaResep, String dataResep) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.setFont(PDType0Font.load(document, new File(FONT_PATH)), 12); // Gunakan font eksternal
            contentStream.beginText();
            contentStream.setLeading(14.5f);
            contentStream.newLineAtOffset(25, 700);

            // Tambahkan teks
            String[] lines = dataResep.split("\n");
            for (String line : lines) {
                contentStream.showText(line);
                contentStream.newLine();
            }

            contentStream.endText();
            contentStream.close();

        // Generate nama file berbasis nama resep
        String sanitizedNamaResep = namaResep.replaceAll("[^a-zA-Z0-9]", "_"); 
        String fileName = "Resep_" + sanitizedNamaResep + ".pdf";
        document.save(fileName);

        System.out.println("PDF Resep berhasil dibuat dengan nama: " + fileName);
    } catch (Exception e) {
        System.err.println("Error saat mencetak resep:");
        e.printStackTrace();
    }
    }

public static void cetakSemuaResep(String dataResep) {
    try (PDDocument document = new PDDocument()) {
        PDPage page = new PDPage();
        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);
        contentStream.setFont(PDType0Font.load(document, new File(FONT_PATH)), 12);
        contentStream.beginText();
        contentStream.setLeading(14.5f);
        contentStream.newLineAtOffset(25, 700);

        // Tambahkan teks
        String[] lines = dataResep.split("\n");
        for (String line : lines) {
            contentStream.showText(line);
            contentStream.newLine();
        }

        contentStream.endText();
        contentStream.close();

        // Generate nama file unik
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String fileName = "SemuaResep_" + timestamp + ".pdf";
        document.save(fileName);

        System.out.println("PDF Semua Resep berhasil dibuat dengan nama: " + fileName);
    } catch (Exception e) {
        System.err.println("Error saat mencetak semua resep:");
        e.printStackTrace();
    }
}
}


