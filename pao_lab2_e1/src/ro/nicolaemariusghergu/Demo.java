package ro.nicolaemariusghergu.queryit.queryitdata;

public class Demo {

    Sorter sorter;

    public Demo(Sorter sorter) {
        this.sorter = sorter;
    }

    public void demo(int[] list) {
        sorter.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
