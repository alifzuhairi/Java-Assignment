import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Deadlock extends Application {
static int P;
static int R ;
static TextField fileTf= new TextField();
static Button analyseBt=new Button("Analyse");
static Label fileLabel=new Label("Read case from: ");
static Label statusLabel=new Label("Case status: ");
static Text file=new Text("");
static Text status=new Text("");
public void start(Stage primaryStage) {
GridPane pane = new GridPane();
pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
pane.setHgap(10);
pane.setVgap(10);
pane.add(fileTf,0,0);
pane.add(analyseBt , 1,0);
pane.add(fileLabel,0,1);
pane.add(file , 1,1);
pane.add(statusLabel,0,2);
pane.add(status, 1,2);
Scene scene= new Scene(pane, 350, 200);
primaryStage.setTitle("Deadlock Case Analyser");
primaryStage.setScene(scene);
primaryStage.show();
}
static boolean detectDeadlock(int available[], int request[][],
 int allocation[][])
{
boolean []finish = new boolean[P];
int []safeSeq = new int[P];
int []work = new int[R];
for (int i = 0; i < R ; i++)
 work[i] = available[i];
int count = 0;
while (count < P)
{
 boolean found = false;
 for (int p = 0; p < P; p++)
 {
 if (finish[p] == false)
 {
 int j;
 for (j = 0; j < R; j++)
 if (request[p][j] > work[j])
 break;
 if (j == R)
 {
 for (int k = 0 ; k < R ; k++)
 work[k] += allocation[p][k];
 safeSeq[count++] = p;
 finish[p] = true;
 found = true;
 }
 }
 }
 if (found == false)
 {
 file.setText(fileTf.getText());
 status.setText("Deadlock");

 return false;
 }
}
file.setText(fileTf.getText());
status.setText("No Deadlock");
return true;
}
public static void main(String[] args) {
analyseBt.setOnAction(e -> {
File myObj = new File(fileTf.getText());
 Scanner scanner = null;
try {
scanner = new Scanner(myObj);
} catch (FileNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
 List<Integer> integers = new ArrayList<>();
 while (scanner.hasNext()) {
 if (scanner.hasNextInt()) {
 integers.add(scanner.nextInt());
 } else {
 scanner.next();
 }
 }
 int in=integers.size();
 integers.get(0);
 int[] intergers;
 intergers=new int[in];
 P= integers.get(0);;
 R=integers.get(1);
 int[] availableR=new int[R];
 int[][] allocation=new int[P][R];
 int[][] need=new int[P][R];
 int ar=1;
int j=0;
for(j=0; j<R; j++) {
ar++;
availableR[j]=integers.get(ar);
}
for(int i=0; i<P; i++) {
j=0;
ar++;
allocation[i][j]=integers.get(ar);
j++;
for(j=1; j<R; j++) {
ar++;
allocation[i][j]=integers.get(ar);
}
}
for(int i=0; i<P; i++) {
j=0;
 ar++;
need[i][j]=integers.get(ar);
j++;
for(j=1; j<R; j++) {
ar++;
need[i][j]=integers.get(ar);
}
}
detectDeadlock(availableR, need, allocation);
});
Application.launch(args);
}
}