import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class QRcode extends Application {

	public void start(Stage primaryStage) {
		//Random grid
		int rowNum = 30;
		int colNum = 30;
					
	    GridPane grid = new GridPane();
	    Random rand = new Random();
	    Color[] colors = {Color.BLACK, Color.WHITE, Color.BLACK, Color.WHITE};

	  
	    for (int row = 0; row < rowNum; row++) {
	        for (int col = 0; col < colNum; col++) {
	            int n = rand.nextInt(4);
	            Rectangle rec = new Rectangle();
	            rec.setWidth(20);
	            rec.setHeight(20);
	            rec.setFill(colors[n]);
	            GridPane.setRowIndex(rec, row);
	            GridPane.setColumnIndex(rec, col);
	            grid.getChildren().addAll(rec);
	        }
	    }
		
		try {
			
			//Fixed Squares
			//quadrant1
			Rectangle rq1 = new Rectangle(10, 10, 128, 128);
			rq1.setFill(Color.WHITE);
			rq1.setStroke(Color.BLACK);
			rq1.setStrokeWidth(20);
			
			Rectangle rq11 = new Rectangle (40, 40, 69, 69);
			rq11.setFill(Color.BLACK);
			
			Rectangle rq12 = new Rectangle (148, 0, 15, 163);
			rq12.setFill(Color.WHITE);
					
			Rectangle rq13 = new Rectangle (0, 148, 163, 15);
			rq13.setFill(Color.WHITE);
			
			
			//quadrant2
			Rectangle rq2 = new Rectangle (374, 10, 128, 128);
			rq2.setFill(Color.WHITE);
			rq2.setStroke(Color.BLACK);
			rq2.setStrokeWidth(20);
			
			Rectangle rq21 = new Rectangle (404, 40, 69, 69);
			rq21.setFill(Color.BLACK);
			
			Rectangle rq22 = new Rectangle (349, 0, 15, 163);
			rq22.setFill(Color.WHITE);
				
			Rectangle rq23 = new Rectangle (349, 148, 178, 15);
			rq23.setFill(Color.WHITE);
			
			//quadrant3
			Rectangle rq3 = new Rectangle (10, 374, 128, 128);
			rq3.setFill(Color.WHITE);
			rq3.setStroke(Color.BLACK);
			rq3.setStrokeWidth(20);
			
			Rectangle rq31 = new Rectangle (40, 404, 69, 69);
			rq31.setFill(Color.BLACK);
			
			Rectangle rq32 = new Rectangle (0, 349, 163, 15);
			rq32.setFill(Color.WHITE);
			
			Rectangle rq33 = new Rectangle (148, 339, 15, 178);
			rq33.setFill(Color.WHITE);
			
			
			//quadrant4
			Rectangle rq4 = new Rectangle (344, 344, 76, 76);
			rq4.setFill(Color.WHITE);
			rq4.setStrokeWidth(20);
			rq4.setStroke(Color.BLACK);
			
			Rectangle rq41 = new Rectangle (373, 373, 20,  20);
			rq41.setFill(Color.BLACK);
			
			Rectangle rq42 = new Rectangle (324, 324, 116, 116);
			rq42.setFill(null);
			rq42.setStroke(Color.WHITE);
			rq42.setStrokeWidth(20);
			
			
			
			Group root = new Group(grid, rq1, rq11, rq12, rq13, rq2, rq21, rq22, rq23, rq3, rq31, rq32, rq33, rq4, rq41, rq42);
			Scene scene = new Scene(root, 512, 512, Color.WHITE);
			primaryStage.setTitle("QR Code Generator");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		launch(args);
	}

}
