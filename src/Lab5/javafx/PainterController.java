package Lab5.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {                                            // Trinh Viet Anh 20214990
    @FXML
    private Pane drawingAreaPane;
    private int colorDraw;
    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    public void usePen(ActionEvent actionEvent) {
        colorDraw = 1;
    }

    @FXML public void useEraser(ActionEvent actionEvent) {
        colorDraw = 0;
    }

    public void drawingAreaMouseDragged(MouseEvent mouseEvent) {
        if (colorDraw == 1) {
            Circle newCircle = new Circle(mouseEvent.getX(), mouseEvent.getY(), 4, Color.BLACK);
            drawingAreaPane.getChildren().add(newCircle);
        }
        else {
            Circle newCircle = new Circle(mouseEvent.getX(), mouseEvent.getY(), 10, Color.WHITE);
            drawingAreaPane.getChildren().add(newCircle);
        }
    }
}
