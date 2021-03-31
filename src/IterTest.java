public class IterTest {
    Integer[] a = {1,2,3,4,5,6,7,8,9,0};
    int start = 3;
    int end = 8;

    public static void main(String arg[]){
        IterTest test = new IterTest();

        Iter i = new Iter(test);
        while (i.hasNext()) System.out.println(i.next());

        System.out.println("-------------");

        Iter2 ii = new Iter2(test);
        for(Integer e : ii) System.out.println(e);

    }
}


