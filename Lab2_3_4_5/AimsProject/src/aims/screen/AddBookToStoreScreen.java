//Mai Minh Quân - 20225661
package Lab2_3_4_5.AimsProject.src.aims.screen;

import javax.swing.JFrame;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import Lab2_3_4_5.AimsProject.src.aims.store.Store;
import Lab2_3_4_5.AimsProject.src.aims.screen.controller.AddBookScreenController;

public class AddBookToStoreScreen extends JFrame{

    private static Store store;
    
    public static void main(String[] args) {
		new AddBookToStoreScreen(store);
	}

    public AddBookToStoreScreen(Store store) {

        super();

        AddBookToStoreScreen.store = store;

        JFXPanel fxPanel = new JFXPanel();
        this.add(fxPanel);

        this.setTitle("Add Book");
        this.setSize(1024, 768);
        this.setVisible(true);
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("addBook.fxml"));//hust/soict/cybersec/aims/screen/view/addBook.fxml
                    
                    AddBookScreenController controller = new AddBookScreenController(store);
                    loader.setController(controller);
                    Parent root = loader.load();
                    fxPanel.setScene(new Scene(root));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
    
}
