public class Line implements Comparable<Line> {
    double x1;
    double y1;
    double x2;
    double y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double calculateLineLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public int compareTo(Line other) {
        // Compare lines based on their lengths
        double thisLength = this.calculateLineLength();
        double otherLength = other.calculateLineLength();

        if (thisLength == otherLength) {
            return 0; // Lines are equal in length
        } else if (thisLength < otherLength) {
            return -1; // This line is shorter than the other
        } else {
            return 1; // This line is longer than the other
        }
    }

    public static void main(String[] args) {
        Line line1 = new Line(0, 0, 3, 4);
        Line line2 = new Line(1, 1, 5, 5);

        int comparisonResult = line1.compareTo(line2);

        if (comparisonResult == 0) {
            System.out.println("The two lines are equal in length.");
        } else if (comparisonResult < 0) {
            System.out.println("Line 1 is shorter than Line 2.");
        } else {
            System.out.println("Line 1 is longer than Line 2.");
        }
    }
}

