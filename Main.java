import java.util.Scanner;
class NodeBinTree{
    public Integer data;
    public NodeBinTree left_child;
    public NodeBinTree right_child;
    public NodeBinTree parent;


    public NodeBinTree(){
        this.data= null;
        this.left_child= null;
        this.right_child=null;
        this.parent=null;
    }
    public NodeBinTree(int num){
        this.data= num;
        this.left_child= null;
        this.right_child=null;
        this.parent=null;
    }
}

class _BinTree{
    public NodeBinTree head;
    public _BinTree(int num){
        NodeBinTree temp=new NodeBinTree(num);
        this.head=temp;
    }
    public void Append(int num){
        NodeBinTree temp = new NodeBinTree(num);

        NodeBinTree temp_node=this.head;
        NodeBinTree last_node=temp_node;

        while (temp_node != null){
            last_node=temp_node;
            if(temp_node.data > temp.data) {
                temp_node=temp_node.left_child;
            }
            else {
                temp_node=temp_node.right_child;
            }
        }
        temp_node= temp;
        if(last_node.data > temp.data){
            last_node.left_child=temp_node;
        }else{
            last_node.right_child=temp_node;
        }
        temp_node.parent=last_node;
    }




}
public class Main {
    public static void main(String[] args) {
        _BinTree Test=new _BinTree(15);
        Test.Append(10);
        Test.Append(25);
        Test.Append(5);
        System.out.println(Test.head.data);
        System.out.println(Test.head.left_child.data);
        System.out.println(Test.head.right_child.data);
        System.out.println(Test.head.left_child.left_child.data);


    }
}