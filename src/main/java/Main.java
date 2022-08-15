import java.io.IOException;
import java.security.GeneralSecurityException;

public class Main {
    public static void main(String[] args) {
        while (true) {
            SheetsServiceUtil sheetsServiceUtil = new SheetsServiceUtil();
            try {
                SheetsServiceUtil.setup();
                HttpClient httpClient = new HttpClient();
                httpClient.httpGenerationVacantion();
                sheetsServiceUtil.clearSheetAndWriteSheet(httpClient.listOfVacantion);
            } catch (GeneralSecurityException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
