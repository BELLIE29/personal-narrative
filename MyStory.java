import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {
  private String[][] imageNames;    // 2D array of imageNames
  private ImagePlus[][] images;     // 2D array of images

  // Constructor
  public MyStory(String[][] imageNames) {
    this.imageNames = imageNames;
    this.images = new ImagePlus[imageNames.length][imageNames[0].length];
    
    /*
   * Loads all of the images
   */
    for (int i = 0; i < imageNames.length; i++) {
      for (int l = 0; l < imageNames[i].length; l++) {
        this.images[i][l] = new ImagePlus(imageNames[i][l]);
      }
    }
  }

  /*
   * Plays the first scene with the thermal filter added
   */
  public void drawFirstScene() {
    clear("pink");

    // Plays images with the filter and adjusted contrast
    images[0][0].applyThermalFilter();
    drawImage(images[0][0], 0, 0, 200);
    pause(3.0);

    images[0][1].adjustContrast(2);
    drawImage(images[0][1], 200, 0, 200);
    pause(3.0);
  }

  /*
   * Plays the second scene
   */
  public void drawSecondScene() {
    clear("pink");

    /*
   * Plays images with filter and adjusted contrast
   */
    images[1][0].applyThermalFilter();
    drawImage(images[1][0], 0, 200, 200);
    pause(3.0);

    images[1][1].adjustContrast(2); 
    drawImage(images[1][1], 200, 200, 200);
    pause(3.0);
  }
  /*
   * Play all the scenes in order
   */
  public void drawScenes() {
    drawFirstScene();
    drawSecondScene();
  }
}
