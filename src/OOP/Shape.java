package OOP;

public class Shape {
    int getCorner(){
        return 0;
    }
}

// Super untuk mengakses method parent
class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }
    int getCornerParent(){
        return super.getCorner();
    }
}
