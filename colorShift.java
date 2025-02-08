import org.code.theater.*;
import org.code.media.*;

/*
 * Represents a colorShift
 */
public class colorShift extends ImagePlus {

  /*
   * Constructor to create the color shift filter
   * with the specified file name
   */
  public colorShift(String filename) {
    super(filename);
  }

  /*
   * Applies the color shift filter to the image
   */
  public void applycolorShift() {
    Pixel[][] pixels = getPixelsFromImage();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        Pixel currentPixel = pixels[row][col];

  /*
   * these are the new values assigned
   */
        int newRed = currentPixel.getRed() + 30; // Example
        if (newRed > 255) newRed = 255;
        currentPixel.setRed(newRed);
      }
    }
  }
}
