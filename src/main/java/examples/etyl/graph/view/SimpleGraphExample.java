package examples.etyl.graph.view;

import com.harium.etyl.commons.context.Application;
import com.harium.etyl.commons.graphics.Color;
import com.harium.etyl.core.graphics.Graphics;
import com.harium.etyl.geometry.Point2D;
import com.harium.storage.graph.Graph;
import com.harium.storage.graph.Node;
import com.harium.storage.graph.WeightEdge;

import java.util.List;

public class SimpleGraphExample extends Application {

    public SimpleGraphExample(int w, int h) {
        super(w, h);
    }

    private Node<NodeData> root;

    private Node<NodeData> firstChild;

    private Graph<NodeData> graph;

    private final double nodeDistance = 40;

    @Override
    public void load() {

        loading = 10;

        graph = new Graph<>();

        root = new Node<NodeData>(new NodeData(0, 80, 90));

        firstChild = new Node<NodeData>(new NodeData(1, 0, 0));
        Node<NodeData> secondChild = new Node<>(new NodeData(2));
        Node<NodeData> thirdChild = new Node<>(new NodeData(3));

        Node<NodeData> firstChildSon = new Node<>(new NodeData(4));

        // Add three child nodes
        graph.addNode(root);
        graph.addNode(firstChild);
        graph.addNode(secondChild);
        graph.addNode(thirdChild);

        graph.addEdge(new WeightEdge<>(root, firstChild));
        graph.addEdge(new WeightEdge<>(root, secondChild));
        graph.addEdge(new WeightEdge<>(root, thirdChild));

        graph.addEdge(new WeightEdge<>(firstChild, firstChildSon));
        graph.addEdge(new WeightEdge<>(firstChild, new Node<>(new NodeData(84))));


        moveNodes(root);

        loading = 100;
    }

    @Override
    public void draw(Graphics g) {

        drawNode(g, root);
    }

    private void drawLeaf(Graphics g, Node<NodeData> node) {
        Point2D point = node.getData().point;

        int radius = 12;

        g.setColor(Color.BLACK);
        g.fillCircle(point.getX(), point.getY(), radius);
        g.setColor(Color.WHITE);

        int x = (int) point.getX() - radius;
        int y = (int) point.getY() - radius;
        int w = radius * 2;
        int h = radius * 2;

        g.drawStringBorder(Integer.toString(node.getData().data), x, y, w, h);
        g.setColor(Color.BLACK);
    }

    private void drawNode(Graphics g, Node<NodeData> node) {

        //Draw Children
        drawEdges(g, node);

        //Draw Node itself
        drawLeaf(g, node);
    }

    private void drawEdges(Graphics g, Node<NodeData> node) {

        List<WeightEdge<NodeData>> edges = graph.getEdges(node);

        g.setColor(Color.RED);

        for (WeightEdge<NodeData> edge : edges) {

            g.drawLine((int) edge.getOrigin().getData().point.getX(), (int) edge.getOrigin().getData().point.getY(),
                    (int) edge.getDestination().getData().point.getX(), (int) edge.getDestination().getData().point.getY());

            drawNode(g, edge.getDestination());
        }

    }

    public void moveNodes(Node<NodeData> root) {
        moveChildrenNodes(root, 0);
    }

    private void moveChildrenNodes(Node<NodeData> node, double initialAngle) {

        List<WeightEdge<NodeData>> edges = graph.getEdges(node);

        int size = edges.size() + 1;

        double theta = 180 / (double) size;

        int i = 0;

        for (WeightEdge<NodeData> edge : edges) {

            i++;

            Node<NodeData> destination = edge.getDestination();

            double angle = (theta * i);

            if (initialAngle > 90) {
                angle += initialAngle - 90;
            } else {
                angle -= initialAngle;
            }

            double x = node.getData().point.getX() + nodeDistance * Math.cos(Math.toRadians(angle));
            double y = node.getData().point.getY() + nodeDistance * Math.sin(Math.toRadians(angle));

            destination.getData().point.setLocation(x, y);

            moveChildrenNodes(destination, angle);
        }

    }

}
