import java.io.IOException;
import java.security.GeneralSecurityException;

public class Main {
    public static void main(String[] args) {
       SheetsServiceUtil sheetsServiceUtil = new SheetsServiceUtil();
        try {
            SheetsServiceUtil.getSheetsService();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
    }
}
