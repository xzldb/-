public class test {
    public static void main(String[] args) {
        System.out.println("hello world");
        char x;
        x = 'a';
        //错误 x=“a”;
        System.out.print(x);
        char y='\'' ;
        System.out.println(y);
        char z='\u0000';

        System.out.println(z);
        long a=100L;
    /*        int b=a;*/
        int b=(int)a;
        System.out.println(b);

        char cc=65532;
        System.out.println(cc);
      /*  char cc1=65536;
        System.out.println(cc1);*/

    }
}

