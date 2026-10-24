public class Issue55_WarehouseGoodsStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A13", "B13", "C13"};
        String target = new String("B13");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
