package id.ac.ui.cs.advprog.eshop.model;

import lombok.Setter;
import lombok.Getter;
import lombok.Builder;
import java.util.*;

@Getter
@Setter
public class Payment {
    private String id;
    private String method;
    private String status;
    private Map<String, String> paymentData;
    public Payment() { }
    public Payment(String id, String method, Map<String, String> paymentData) { }
    public void generateStatus() { }
    public boolean isValidVoucherCode(String voucherCode) { return false; }
    public String getStatus() { return null; }


}