import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

 /*
 * Analyzes phrases and sentences
 */
    String[][] array1 = {
      {"sister.JPG", "oreo.jpg"},
      {"mexico.jpg", "food.jpg"}
    };

    MyStory scene = new MyStory(array1);
    // Creates and then displays the scenes
    scene.drawScenes();
    Theater.playScenes(scene);   
  }
}