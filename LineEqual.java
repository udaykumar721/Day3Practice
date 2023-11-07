//public class LineEqual {
//}
public class LineEqual {
    private double x1, y1, x2, y2;

    public LineEqual(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference, so they are equal
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // Different class or null, so not equal
        }

        Line other = (Line) obj; // Cast the object to a Line

        // Check if the end points are equal
        return x1 == other.x1 && y1 == other.y1 && x2 == other.x2 && y2 == other.y2;
    }

    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        Line line2 = new Line(0, 0, 3, 4);
        Line line3 = new Line(1, 1, 5, 5);

        boolean linesEqual12 = line1.equals(line2);
        boolean linesEqual13 = line1.equals(line3);

        System.out.println("Line 1 and Line 2 are equal: " + linesEqual12);
        System.out.println("Line 1 and Line 3 are equal: " + linesEqual13);
    }
}

