import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Abstract base class for all image converters.
 * Subclasses implement the process method to transform the image.
 */
public abstract class Converter {

    /**
     * Reads the input image, processes it, and writes the output image.
     *
     * @param inputFileName  name of the source PNG file
     * @param outputFileName name of the output PNG file
     * @throws IOException if reading or writing fails
     */
    public void convert(String inputFileName, String outputFileName) throws IOException {
        BufferedImage originalImage = readImage(inputFileName);
        BufferedImage processedImage = process(originalImage);
        writeImage(processedImage, outputFileName);
    }

    /**
     * Subclasses must implement this to perform the actual image transformation.
     *
     * @param originalImage the original input image
     * @return the processed image
     */
    protected abstract BufferedImage process(BufferedImage originalImage);

    /**
     * Reads an image file into a BufferedImage.
     *
     * @param inputFileName image filename
     * @return loaded image
     * @throws IOException if the file cannot be read
     */
    protected BufferedImage readImage(String inputFileName) throws IOException {
        File inputFile = new File(inputFileName);
        BufferedImage image = ImageIO.read(inputFile);

        if (image == null) {
            throw new IOException("Unsupported image file: " + inputFileName);
        }

        return image;
    }

    /**
     * Writes a BufferedImage to a PNG file.
     *
     * @param image          image to save
     * @param outputFileName output filename
     * @throws IOException if writing fails
     */
    protected void writeImage(BufferedImage image, String outputFileName) throws IOException {
        File outputFile = new File(outputFileName);
        ImageIO.write(image, "PNG", outputFile);
    }

    /**
     * Creates a new transparent ARGB image with the given size.
     *
     * @param width  image width
     * @param height image height
     * @return new image
     */
    protected BufferedImage createEmptyImage(int width, int height) {
        return new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    }

    /**
     * Restricts a colour value to the valid range [0, 255].
     *
     * @param value any integer colour value
     * @return clamped value between 0 and 255
     */
    protected int clamp(int value) {
        return Math.max(0, Math.min(255, value));
    }
}