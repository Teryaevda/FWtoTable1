import java.io.IOException;
import java.security.GeneralSecurityException;

public class Main {
    public static void main(String[] args) {
        //  try {
        SheetsQuickstart sheetsQuickstart = new SheetsQuickstart();
        try {
            sheetsQuickstart.writeInSheet(new HttpClient().getlistOfVacantion());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        // try {
        //sheetsQuickstart.writeInSheet(new HttpClient().getlistOfVacantion());
        // } catch (GeneralSecurityException e) {
        //     e.printStackTrace();
        // }
        //} catch (IOException e) {
        //     e.printStackTrace();
        //  }
        // }
    }
}
