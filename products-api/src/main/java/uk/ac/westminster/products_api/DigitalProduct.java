package uk.ac.westminster.products_api;


public class DigitalProduct extends Product {

    private String downloadUrl;
    private double fileSizeMB;

    // no-arg constructor: Jackson needs it to build an object from a POST body
    public DigitalProduct() {
    }

    public DigitalProduct(Long id, String name, double price,
                          String downloadUrl, double fileSizeMB) {
        super(id, name, price); // MUST be the first statement
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSizeMB() {
        return fileSizeMB;
    }
}
