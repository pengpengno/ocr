import com.spire.ocr.OcrException;
import com.spire.ocr.OcrScanner;

import java.io.File;

public class OCR {


    public static void main(String[] args) throws OcrException {


        String property = System.getProperty("os.name");
        System.out.println(property);
        // Specify the path to the dependency files
        File dependencies1 = new File("dependencies");
        File file = new File("test.png");
        String absolutePath = dependencies1.getAbsolutePath();

        String dependencies = absolutePath;
//        String imageFile = "data/Sample.png";
        String imageFile = file.getAbsolutePath();
        // Specify the path to the output file

        // Create an OcrScanner object
        OcrScanner scanner = new OcrScanner();
        // Set the dependency file path for the OcrScanner object
        scanner.setDependencies(dependencies);

        // Use the OcrScanner object to scan the specified image file
        scanner.scan(imageFile);

        // Get the scanned text content
        String scannedText = scanner.getText().toString();

        System.out.println(scannedText);


    }
}
