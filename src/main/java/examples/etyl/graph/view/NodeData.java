package examples.etyl.graph.view;

import com.harium.etyl.geometry.Point2D;

public class NodeData {

    Point2D point;
    int data;

    public NodeData(int data) {
        this.data = data;
    }

    public NodeData(int data, int x, int y) {
        this.data = data;
        point = new Point2D(x, y);
    }
}
