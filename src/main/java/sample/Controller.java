package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

public class Controller implements Initializable {
    private static final Logger LOGGER = Logger.getLogger(Controller.class.getName());

    private static final int SINGLE_REGION = 160;

    private Image circleImage;
    private Image crossImage;

    @FXML
    private VBox boardId;
    @FXML
    private ImageView regionOneImageViewId;
    @FXML
    private ImageView regionTwoImageViewId;
    @FXML
    private ImageView regionThreeImageViewId;
    @FXML
    private ImageView regionFourImageViewId;
    @FXML
    private ImageView regionFiveImageViewId;
    @FXML
    private ImageView regionSixImageViewId;
    @FXML
    private ImageView regionSevenImageViewId;
    @FXML
    private ImageView regionEightImageViewId;
    @FXML
    private ImageView regionNineImageViewId;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        LOGGER.info("initialize(...)");
        this.circleImage = new Image(Controller.class.getClassLoader().getResourceAsStream("images/circle.png"));
        this.crossImage = new Image(Controller.class.getClassLoader().getResourceAsStream("images/cross.png"));
    }

    public void regionOneOnMouseClicked(MouseEvent mouseEvent) {
        this.regionOneImageViewId.setImage(this.circleImage);
    }

    public void regionTwoOnMouseClicked(MouseEvent mouseEvent) {
        this.regionTwoImageViewId.setImage(this.circleImage);
    }

    public void regionThreeOnMouseClicked(MouseEvent mouseEvent) {
        this.regionThreeImageViewId.setImage(this.circleImage);
    }

    public void regionFourOnMouseClicked(MouseEvent mouseEvent) {
        this.regionFourImageViewId.setImage(this.circleImage);
    }

    public void regionFiveOnMouseClicked(MouseEvent mouseEvent) {
        this.regionFiveImageViewId.setImage(this.circleImage);
    }

    public void regionSixOnMouseClicked(MouseEvent mouseEvent) {
        this.regionSixImageViewId.setImage(this.circleImage);
    }

    public void regionSevenOnMouseClicked(MouseEvent mouseEvent) {
        this.regionSevenImageViewId.setImage(this.circleImage);
    }

    public void regionEightOnMouseClicked(MouseEvent mouseEvent) {
        this.regionEightImageViewId.setImage(this.circleImage);
    }

    public void regionNineOnMouseClicked(MouseEvent mouseEvent) {
        this.regionNineImageViewId.setImage(this.circleImage);
    }

    public void boardOnMouseClicked(MouseEvent mouseEvent) {
        LOGGER.info("Tic Tac Toe board clicked!");
        double mouseEventX = mouseEvent.getX();
        double mouseEventY = mouseEvent.getY();

        if (mouseEventX < SINGLE_REGION && mouseEventY < SINGLE_REGION) {
//            this.regionOneImageViewId.setImage(this.circleImage);
        }

        LOGGER.info("X: " + mouseEventX + " Y: " + mouseEventY);
    }
}
