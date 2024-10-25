public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.setColor(200, 0, 0);
        plane.trailWidth = 100;
        plane.pausetime = 1;
        for (int x = 0; x < 6; x = x + 1) {
            rowOfSqaures(x*150);
        }
    }
    public void rowOfSqaures(int y) {


        for (int x = 0; x < 5; x = x + 1) {
            plane.teleport(x * 200, y);
            plane.setColor(0,x*60,y/4);
            System.out.println("x: " + x);
            plane.square(100);




        }
    }

}
