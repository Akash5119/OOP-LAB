 class Rectangle {
    public static void main(String[] args) {
        double square_side = 4;
        double breadth =8;
        
        double area_square = square_side * square_side;
        double Rectangle = area_square;
        
        double length =Rectangle / breadth;
        
        double perimeterOfRectangle = 2 * (length + breadth);
        double areaOfRectangle = length * breadth;
        
        System.out.println("Perimeter of rectangle: " + perimeterOfRectangle);
        System.out.println("\n Area of rectangle: " + areaOfRectangle);
    }
}