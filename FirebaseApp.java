import java.lang.Object;

public abstract class FirebaseApp extends Main {

FileInputStream serviceAccount =
  new FileInputStream("path/to/serviceAccountKey.json");

FirebaseOptions options = new FirebaseOptions.Builder()
  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
  .setDatabaseUrl("https://gupsy-288118.firebaseio.com")
  .build();

FirebaseApp.initializeApp(options);
}
