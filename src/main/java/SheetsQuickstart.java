import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.SheetsScopes;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SheetsQuickstart {
    private static final String APPLICATION_NAME = "Актуальные потребности TEAMFORCE";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "tokens";
    ArrayList<Vacantion> listOfVacantion;
    /**
     * Global instance of the scopes required by this quickstart.
     * If modifying these scopes, delete your previously saved tokens/ folder.
     */
    private static final List<String> SCOPES = Collections.singletonList(SheetsScopes.SPREADSHEETS_READONLY);
    private static final String CREDENTIALS_FILE_PATH = "/client_secret.json";

    /**
     * Creates an authorized Credential object.
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = SheetsQuickstart.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        if (in == null) {
            throw new FileNotFoundException("Resource not found: " + CREDENTIALS_FILE_PATH);
        }
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();
        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8080).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

    public void writeInSheet(ArrayList<Vacantion> listOfVacantion) throws IOException, GeneralSecurityException {
        this.listOfVacantion = listOfVacantion;
        // Build a new authorized API client service.
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        final String spreadsheetId = "1Tp10m32jJywD8_L2s2gqapcobvUOLxBpNyyevUQsAh0"; // код таблицы
        final String range = "Актуальные потребности!A2:K";   // название листа и диапозона
        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();
        int countCellA = 1;
        /*
        for (Vacantion vacantion : listOfVacantion) {
            ValueRange body = new ValueRange()
                    .setValues(Arrays.asList(
                            Arrays.asList("" + vacantion.getIdVacantion()),
                            Arrays.asList("Пока пусто"),
                            Arrays.asList("" + vacantion.getStackOfVacantion()),
                            Arrays.asList("" + vacantion.getGradeOfVacantion()),
                            Arrays.asList("" + vacantion.getDescriptionOfVacantion()),
                            Arrays.asList("" + vacantion.getRequirementsToVacantion()),
                            Arrays.asList("" + vacantion.getExpirienceOfVacantion()),
                            Arrays.asList("" + vacantion.getAddressOfVacantion()),
                            Arrays.asList("" + vacantion.getGeographyOfVacantion()),
                            Arrays.asList("" + vacantion.getWorkFormatOfVacantion()),
                            Arrays.asList("" + vacantion.getResourceManagerOfVacantion())));

            UpdateValuesResponse result = service.spreadsheets().values()
                    .update(spreadsheetId, "A" + 1, body)
                    .setValueInputOption("RAW")
                    .execute();
            // ValueRange response = service.spreadsheets().values()
            //       .get(spreadsheetId, range)
            //       .execute();


        }

         */



    }
}