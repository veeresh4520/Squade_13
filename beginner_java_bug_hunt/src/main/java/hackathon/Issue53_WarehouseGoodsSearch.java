public class Issue53_WarehouseGoodsSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {6, 8, 3, 113};
        int target = 113;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
