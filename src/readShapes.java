import java.io.PrintWriter;

public interface readShapes
{
    void readShapeIntoArray(Shapes shape);

    void writeOnFile(PrintWriter file);

    Shapes copy();


}
