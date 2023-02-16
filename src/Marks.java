public abstract class Marks {
    int science;
    int math;
    int history;

    Marks(int science,int math, int history){
        this.science=science;
        this.math=math;
        this.history=history;
    }

    abstract int getPercentage();
}
class A extends Marks{


    A(int science,int math, int history){
        super(science,math,history);
    }
    @Override
    int getPercentage() {
        return (science+math+history)/3;
    }
}
class B extends Marks{
int finance;
    B(int science,int math, int history,int finance){
        super(science,math,history);
        this.finance=finance;
    }
    int getPercentage() {
        return (science+math+history+finance)/4;
    }
}
class MarksTester{
    public static void main(String[] args) {
        A a = new A(80, 75, 98);
        System.out.println(a.getPercentage());
        B b=new B(50,67,78,98);
        b.getPercentage();
    }

}
