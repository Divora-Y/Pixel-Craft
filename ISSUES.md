# PixelCraft Project Issues

This file lists the tasks/issues for the PixelCraft Java image processing project. Each section represents a potential GitHub issue that should be created and tracked.

## Required Converters (S1.1 - 1 point each)

### Issue 1: Implement Grayscale Converter
**Description:**  
Implement the Grayscale converter that converts an image to grayscale by averaging the red, green, and blue values of each pixel.

**Acceptance Criteria:**
- Inherits from Converter abstract class
- Correctly processes all pixels
- Output filename follows the pattern: `input_Grayscale.png`
- Can be run with: `java -cp "path/to/classes" PixelCraft Grayscale input.png`

### Issue 2: Implement Rotate Converter
**Description:**  
Implement the Rotate converter that rotates the image 90 degrees clockwise.

**Acceptance Criteria:**
- Inherits from Converter abstract class
- Rotates image 90 degrees clockwise (not counterclockwise)
- Maintains image dimensions correctly
- Output filename follows the pattern: `input_Rotate.png`

### Issue 3: Implement Blur Converter
**Description:**  
Implement the Blur converter that applies a simple blur effect by averaging the color of surrounding pixels.

**Acceptance Criteria:**
- Inherits from Converter abstract class
- Applies blur effect using neighboring pixel averaging
- Output filename follows the pattern: `input_Blur.png`

## Additional Converters (S1.2/S1.3)

### Issue 4: Implement Additional Converter 1
**Description:**  
Implement an additional image processing converter of your choice (e.g., Sepia, Invert, Brightness, Contrast, etc.).

**Acceptance Criteria:**
- Inherits from Converter abstract class
- Implements a unique image processing effect
- Follows naming conventions
- Includes proper documentation

### Issue 5: Implement Additional Converter 2
**Description:**  
Implement a second additional image processing converter.

**Acceptance Criteria:**
- Same as Issue 4
- Different effect from the first additional converter

### Issue 6: Implement Additional Converter 3
**Description:**  
Implement a third additional converter to reach the minimum of 6 total converters.

**Acceptance Criteria:**
- Same as Issue 4
- Different effect from previous converters

### Issue 7: Implement Additional Converter 4 (Optional for S1.3)
**Description:**  
Implement a fourth additional converter to reach 8 total converters for maximum points.

**Acceptance Criteria:**
- Same as Issue 4

### Issue 8: Implement Additional Converter 5 (Optional for S1.3)
**Description:**  
Implement a fifth additional converter to reach 8 total converters.

**Acceptance Criteria:**
- Same as Issue 4

## Recursive Implementation (S2.1/S2.2)

### Issue 9: Implement Recursive Converter 1
**Description:**  
Implement at least one converter using ONLY recursion (no loops).

**Acceptance Criteria:**
- Uses recursive algorithms instead of iterative loops
- Inherits from Converter abstract class
- Processes image correctly using recursive approach

### Issue 10: Implement Recursive Converter 2 (Optional for S2.2)
**Description:**  
Implement a second converter using ONLY recursion.

**Acceptance Criteria:**
- Same as Issue 9
- Different converter from the first recursive one

## Object-Oriented Design (S3.1/S3.2)

### Issue 11: Create Converter Abstract Base Class
**Description:**  
Create the abstract Converter base class that all converters inherit from.

**Acceptance Criteria:**
- Abstract class with convert method
- Handles common operations: reading input file, writing output file
- Uses BufferedImage for image manipulation
- Proper inheritance structure

### Issue 12: Refactor for Proper OOP Design
**Description:**  
Ensure proper object-oriented design by avoiding unnecessary code duplication and branching.

**Acceptance Criteria:**
- No code duplication between converters
- Clean inheritance hierarchy
- Polymorphism used effectively
- Common functionality in base class

## Documentation and Reporting (S4.1/S4.2/S4.3)

### Issue 13: Add Code Documentation
**Description:**  
Add high-quality documentation to all source code.

**Acceptance Criteria:**
- Javadoc comments for all classes and methods
- Clear explanations of algorithms
- Parameter and return value documentation
- Inline comments for complex logic

### Issue 14: Create Project Report
**Description:**  
Create a comprehensive report describing the implemented converters.

**Acceptance Criteria:**
- Well-written descriptions of all implemented converters
- Explanation of algorithms used
- Screenshots or examples of input/output
- Technical details of implementation

### Issue 15: Self-Assessment in Report
**Description:**  
Include accurate self-assessment in the project report.

**Acceptance Criteria:**
- Evaluation against each grading criterion
- Honest assessment of strengths and weaknesses
- Reflection on learning objectives
- Suggestions for improvement

## Project Setup

### Issue 16: Set Up Project Structure
**Description:**  
Set up the initial project structure with proper directories and files.

**Acceptance Criteria:**
- Create src/ directory
- Add PixelCraft.java with provided code
- Add ARGB.java utility class
- Configure build path for compilation
- Test basic compilation

### Issue 17: Implement Main PixelCraft Class
**Description:**  
Implement the main PixelCraft.java class exactly as specified.

**Acceptance Criteria:**
- Matches the provided code exactly
- Handles command line arguments correctly
- Uses Java reflection to instantiate converters
- Proper error handling and messages

## Testing and Validation

### Issue 18: Test All Converters
**Description:**  
Test all implemented converters with sample images.

**Acceptance Criteria:**
- All converters work with PNG images
- Output files are generated correctly
- Image processing effects are visible and correct
- No runtime errors

### Issue 19: Performance Optimization
**Description:**  
Optimize converter implementations for better performance.

**Acceptance Criteria:**
- Efficient algorithms
- Minimal memory usage
- Fast processing times
- Consider large image handling