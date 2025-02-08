import org.code.theater.*;
import org.code.media.*;

/*
 * Represents a blurred filter
 */
public class blurredFilter extends ImagePlus {

  /*
   * Constructor to create a SepiaImage
   * with the specified file name
   */
  public blurredFilter(String filename) {
    super(filename); // Call to parent constructor
  }

  /*
   * Applies the blurred filter to the image
   */
  public void applyblurredFilter() {
    Pixel[][] pixels = getPixelsFromImage();
    // Implement the logic to blur the image 
  }
}
