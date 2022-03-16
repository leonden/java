public class OopNew {
    public static void main(String[] args) {

        java.awt.Point p = new java.awt.Point();

        p.x = 10;
        System.out.println(p.x);

        p.y = ' ';
        System.out.println(p.y);

        p.setLocation(11, 22);
        System.out.println(p);

        String s = p.toString();
        System.out.println(s.length());

        // --->
        System.out.println(p.toString().length());
        //                     ---------> String

        System.out.println(new java.awt.Point().toString().length());

        // Reference type           Object type
        java.awt.Polygon polygon = new java.awt.Polygon();

    }
}
