import java.io.*;

interface SpeakHello{
    void sayHello();
}

class Chinese implements SpeakHello{
    @Override
    public void sayHello() {
        System.out.println("Chinese say: 你好!");
    }
}
class English implements SpeakHello{
    @Override
    public void sayHello() {
        System.out.println("English say: hello!");
    }
    
}
class KindOfPeople{
    public void sayHello(SpeakHello he){
        he.sayHello();
    }
}

class BankException extends Exception{
    String mess;
    public BankException(String n){
        mess = n;
    }
    public String getMessage(){
        return mess;
    }
}
class Bank{
    public void getIncome(int in,int out) throws BankException{
        if (in<0 || out>0){
            throw new BankException("Error Conditional!" + in + ", " + out);
        }
        System.out.println("OK!");
    }
}

class FileAccept implements FilenameFilter {
    public String extendString;
    public void setExtendName(String s){
        extendString = s;
    }
    public boolean accept(File dir,String name){
        return name.endsWith(extendString);
    }
}

class A{
    int a=10;
    A(){
        System.out.println("construct A");
    }
}
class B extends A{
    int a=100;
    B(){
        System.out.println("construct B");
    }
    int get(){
        return super.a;
    }
}
public class Manic{
    public static void main(String args[]){
        Window win = new Window();
        win.setBounds(100, 100, 500, 500);
        win.setTitle("windowTitle");
    }
    void test1(){
        //Pillar p=new Pillar(new Circle(10));
        //System.out.println("Circle area: " + p.getArea());
        //System.out.println("Rectangle area: " + new Pillar(new Rectangle(10, 20)).getArea());
        //System.out.println("Triangle area: " + new Pillar(new Triangle(10, 5)).getArea());

        //Pillar p = new Pillar();
        //System.out.println("Circle area: " + p.getArea(new Circle(10)));
        //System.out.println("Circle area: " + p.getArea(new Triangle(10,5)));
        //.out.println("Circle area: " + p.getArea(new Rectangle(10,20)));

        //new KindOfPeople().sayHello(new Chinese());
        //new KindOfPeople().sayHello(new English());

        new KindOfPeople().sayHello(new SpeakHello() {
            public void sayHello(){ 
                System.out.println("Japanese say: 扣你几把" );
            }
        });
        new KindOfPeople().sayHello(new SpeakHello() {
            public void sayHello(){ 
                System.out.println("Korean say: 阿尼纳塞");
            }
        });

        try{
            System.out.println(1/0);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        Bank b = new Bank();
        try{
            b.getIncome(-5, 0);
        }
        catch(BankException e){
            System.out.println(e.getMessage());
        }

        File dir = new File(".");
        FileAccept acc = new FileAccept();
        acc.setExtendName("java");
        String[] sfile = dir.list(acc);
        for (String string : sfile) {
            System.out.println(string);
        }

        try{
            File jSrcFile = new File("Manic.java");
            //字节
            //FileInputStream in = new FileInputStream(jSrcFile);
            //byte text[] = new byte[100];
            //字符
            FileReader in = new FileReader(jSrcFile);
            char text[] = new char[100];

            int readN = 0;
            StringBuffer sbuff = new StringBuffer();
            while ((readN = in.read(text,0,100)) != -1){
                String s = new String(text, 0, readN);
                sbuff.append(s);
            }
            System.out.println(sbuff);
            in.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}