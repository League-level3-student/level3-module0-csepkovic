/* Copy the code into a new Processing sketch and complete then steps. */
int[] colors;
//1. create an array of ints. don't initialize it yet
import java.util.Random;
int[] integers;
void setup() {
  //2. set the size of your window
  size(1000,1000);
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.
  

  //3. initialize your array with the built in width variable
  integers = new int[width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  for (int i = 0; i < integers.length; i++) {
    integers[i] = new Random().nextInt(height);
  }
  //5. call the noStroke() method
  noStroke();
  colors = new int[6];
  for (int i = 0; i < colors.length; i++) {
    colors[i] = 150;
  }
}

void draw() {
  addRandomNumber(colors);
  //6. set the background color with background(r, g, b);
  background(colors[0], colors[1], colors[2]);
  //7. set the color for your graph
  fill(colors[3], colors[4], colors[5]);

  //8. draw a rectangle for each int in your array.
  //   the x value will be the index of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array
  for (int i = 0; i < integers.length; i++){
    rect(i, height, 1, -(integers[i]));
  }

  //9. call the stepSort method
  stepSort(integers);

  //10. extract the code that randomizes the array into a method.
  

  //11. call the method you made in step 10 when the mouse is pressed
  
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}

void mousePressed() {
  for (int i = 0; i < integers.length; i++) {
    integers[i] = new Random().nextInt(height);
  }
  for (int i = 0; i < colors.length; i++) {
    colors[i] = new Random().nextInt(255);
  }
}

void addRandomNumber(int[] intArr) {
  for (int i = 0; i < colors.length; i++) {
    int h = new Random().nextInt(11);
    colors[i] += (h - 5);
    if (colors[i] < 0){
      colors[i] += h;
    } else if (colors[i] > 255) {
      colors[i] -= h;
  }
}
}