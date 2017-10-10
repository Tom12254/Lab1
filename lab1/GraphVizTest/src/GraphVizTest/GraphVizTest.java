package GraphVizTest;
//dsadk
import java.io.IOException;

public class GraphVizTest {
    public static void main(String[] args) {
        GraphViz gViz=new GraphViz("C:\\Users\\Baratta-Desktoop\\Desktop\\eee", "D:\\Graphviz2.38\\bin\\dot.exe");
        gViz.start_graph();
        gViz.addln("A->B;");
        gViz.addln("A->C;");
        gViz.addln("C->B;");
        gViz.addln("B->D;");
        gViz.addln("C->E;");
        gViz.end_graph();
        try {
            gViz.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}