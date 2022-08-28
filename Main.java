class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.addDummyProducts();
        System.out.println(Utils.products);

        int cost = utils.sellItems(1, 2);
        System.out.println(cost);
        System.out.println(Utils.products);
    }

}
