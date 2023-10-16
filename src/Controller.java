import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

public class Controller {

    private Stage stage;
    private Scene scene;

    public void getUrl(ActionEvent event) throws URISyntaxException, IOException{
        Desktop d=Desktop.getDesktop();

        // Browse a URL, say google.com
        d.browse(new URI("https://drive.google.com/file/d/10Np350EHWdcCGZjjgQXsusgL7WcfvLgD/view?usp=drivesdk"));
    }


    //Addresses
    
    public void switchToSem1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sem3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToHome(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("UniNote.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToM3(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("M3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
