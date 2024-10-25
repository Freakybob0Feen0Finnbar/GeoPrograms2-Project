public class GradedPicture extends World {

    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.pausetime = 0;


        plane.loadBackGround("Adele.jpg");
        plane.showBackGround();
        plane.teleport(5, 6);
        for (int y = 0; y < 900; y = y + 1) {
            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
//                plane.teleport(x, 488 - y);
                if (red == 0 && green > 250 && blue == 1) {
                    plane.setPixelColor(0, 0, 0);
                    plane.teleport(x, 488 - y);


                }
            }

        }
        for (int y = 0; y < 900; y = y + 1) {
            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red == 0 && green > 250 && blue == 1) {
                    plane.setPixelColor(0, 0, 0);
                    plane.teleport(x, 488 - y);
                }
            }
        }
        for (int row = 0; row < 900; row += 20) {
            for (int col = 0; col < 1000; col += 20) {
                plane.teleport(col, row);
                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();

                if (red > 150) {
                    plane.setPixelColor(0, 0, 0);
                    plane.square(10);
                }
            }
        }

        for (int x = 0; x < 100; x = x + 1){
            cursedcode();
        }
cursedcode();

    }
//(int)(Math.random() * rangeOfNumbers)
    public void cursedcode() {
        plane.startingAngle(45);
        plane.teleport((int)(Math.random() * 500),500);
        plane.isTrail = true;
        plane.setColor(255, 255, 255);
        plane.trailWidth = 2;
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);
        plane.move(200);
        plane.turn(90);



    }


}