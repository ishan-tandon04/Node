public class TestNode {
    public static void main(String[] args) {
        //testing out all the methods from the node class
        NodeProject a = new NodeProject();
        NodeProject b = new NodeProject(3);
        NodeProject c = new NodeProject(3,a,b);
        a.toString();
        b.toString();
        c.toString();

        b.setFirstNode(c);
        a.setSecondNode(c);
        System.out.println(a.equals(b));
        a.setValue("node is a data type");
        System.out.println(a.equals(c));
    }
}
