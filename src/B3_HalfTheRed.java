public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("Adele.jpg");
        plane.showBackGround();
        plane.pausetime = 1;


        for (int y = 0; y < 900; y = y + 1) {
            for (int x = 0; x < 669; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
               // if(red == 0 && green == 255 && blue == 1) {
                    plane.setPixelColor(0, 0, 0);
                //}
              //  plane.setPixelColor(red / 2, green/4, blue);
            }
        }
    }
}

