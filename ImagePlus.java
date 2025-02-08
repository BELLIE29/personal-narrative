import org.code.theater.*;
import org.code.media.*;

/*
 * Represents an image that can be modified with filters and effects
 */
public class ImagePlus extends Image {

  private Pixel[][] pixels;    // The 2D array of pixels

  /*
 * Sets the superclass filename to the specified filename
 * and calls the getPixelsFromImage() method to initialize
 * the 2D array of Pixel objects that make up the image
 */
  public ImagePlus(String filename) {
    super(filename);     // Calls the Image class constructor
    
    // Initialize the pixels array by getting the pixels from the image
    pixels = getPixelsFromImage();
  }

  /*
   * Returns the pixels in the image as a 2D array of Pixel objects
   */
  public Pixel[][] getPixelsFromImage() {
    Pixel[][] tempPixels = new Pixel[getHeight()][getWidth()];
    
    for (int row = 0; row < tempPixels.length; row++) {
      for (int col = 0; col < tempPixels[0].length; col++) {
        tempPixels[row][col] = getPixel(col, row);
      }
    }/*
      * Returns the 2D array of pixels
      */
    return tempPixels;
  }

  /*
   * Applies the thermal flter to the image
   */
  public void applyThermalFilter() {
    Pixel[][] pixels = getPixelsFromImage();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        Pixel currentPixel = pixels[row][col];
        
        int newRed = Math.min(currentPixel.getRed() + 50, 255);
        int newGreen = Math.min(currentPixel.getGreen() - 50, 255);
        int newBlue = Math.min(currentPixel.getBlue() - 30, 255);
        
        currentPixel.setRed(newRed);
        currentPixel.setGreen(newGreen);
        currentPixel.setBlue(newBlue);
      }
    }
  }

  /*
   * Changes the contrast of the image
   */
  public void adjustContrast(int m) {
    Pixel[][] pixels = getPixelsFromImage();
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[row].length; col++) {
        Pixel currentPixel = pixels[row][col];

        int newRed = currentPixel.getRed() * m;
        int newGreen = currentPixel.getGreen() * m;
        int newBlue = currentPixel.getBlue() * m;

  /*
   * Ensures that the coloe values do not 
   * exceed over 255
   */
        newRed = Math.min(newRed, 255);
        newGreen = Math.min(newGreen, 255);
        newBlue = Math.min(newBlue, 255);

        currentPixel.setRed(newRed);
        currentPixel.setGreen(newGreen);
        currentPixel.setBlue(newBlue);
      }
    }
  }
}
