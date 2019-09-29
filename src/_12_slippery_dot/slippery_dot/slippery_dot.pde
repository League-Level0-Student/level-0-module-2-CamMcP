 // 1. Create three integer variables to represent the x, y, and the size of the ellipse
 int x = 50;
 int y = 500;
 int ellipse = (25);
    void setup() {
      // 2. Set the size of your sketch
    size (1000, 1000);
    }
    
    void draw() {
      // 3. Set the background color of your sketch
    background (150, 0, 255);  
      // 4. Draw an ellipse. Make sure it fits in the window.
      // Use the variables created at the top of the sketch, 
      // for the location and size of your ellipse
    ellipse (x, y, ellipse, ellipse);
    }
    
    void mousePressed() {
      //5. Create an integer variable called distance
      int distance = getDistance(mouseX, mouseY, x, y); 
      //6. Set the value of the distance variable to the value returned by the getDistance method
      //   Pass the mouse's x and y (mouseX and mouseY) and the x and y of your ellipse to the method.
        
          
      //7.  Use an if statement to check if the distance variable is < the radius of the ellipse
      //    If it is, set a new x and y for the ellipse, using a random location on the window
      //    Hint: Use the Processing random() function
      if (distance < ellipse){
        x = (int) random(1000);
        y = (int) random(1000);
      }
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
