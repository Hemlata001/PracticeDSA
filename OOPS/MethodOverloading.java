package OOPS;
public class MethodOverloading
{
    public void display(int a){
        System.out.println("Integer : " + a);
    }
    public void display(String str){
        System.out.println("String : "+str);
    }
    public void display(int a , double d){
        System.out.println("Integer " + a  + " Double " + d);
    }
    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        m.display(4);
        m.display("hemlata");
        m.display(4,0.4);
    }
}
