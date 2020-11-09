class Main {

  final static int ASPECT   = 1;
  final static int SCALE    = 8;
  final static int WIDTH    = SCALE * ASPECT;
  final static int HEIGHT   = SCALE / ASPECT;

  final static String BRICK = " + ";
  final static String SPACE = " - ";

  public static void main(String[] args) {

    String totalBricks = "";
    String totalSpaces = "";

    for(int row = 1; row < HEIGHT + 1; row++){

      for(int col = 0; col < ((row - 1) + WIDTH) / WIDTH; col++){
        totalBricks += BRICK;
      }
      for(int spaces = WIDTH; spaces > row; spaces--){
        totalSpaces += SPACE;
      }
      
      drawRow(row,totalBricks,totalSpaces);
      totalSpaces = "";

    }

  }

  public static void drawRow(int r, String b, String s){
      System.out.println(b + " | " + s + " | " + r);
  }
}