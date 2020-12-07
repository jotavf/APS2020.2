package atividade_1;

public class RevendaComArray {
    private Product products[];
    private int index;
    private String defaultErrorMsg = "Código do produto não pôde ser encontrado";

    public RevendaComArray(int quant) {
        products = new Product[quant];
    }

    public void insertProduct(Product product) {
        int length = products.length;
        for(index = 0; index < length;){
            if(products[index] != null){
                index++;
            }
        }
        if(index < length){
            products[index] = product;
        }
        else
            System.out.println("Sem espaço disponível no estoque");
    }

    public void buyProduct(int codeProduct, int quant) {
        int length = products.length;
        for (index = 0; index < length; index++) {
            Product product = products[index];
            if (product != null) {
                if (codeProduct == product.getCodeProduct()) {
                    int qnt_storage = product.getQuantityStoragedProduct();
                    product.setQuantityStoragedProduct(qnt_storage + quant);
                }
            } else
                System.out.println(defaultErrorMsg);
        }
    }

    public void sellProduct(int codeProduct, int quant) {
        int length = products.length;
        for (index = 0; index < length; index++) {
            Product product = products[index];
            if (product != null) {
                if (codeProduct == product.getCodeProduct()) {
                    int qnt_storage = product.getQuantityStoragedProduct();
                    product.setQuantityStoragedProduct(qnt_storage - quant);
                }
            } else
                System.out.println(defaultErrorMsg);
        }
    }

    public double checkPrice2Sell(int codeProduct) {
        int length = products.length;
        double priceProduct = 0;
        for (index = 0; index < length; index++) {
            Product product = products[index];
            if (product != null) {
                int codeSearched = product.getCodeProduct();
                if (codeSearched == codeProduct) {
                    priceProduct = product.getPriceProduct();
                    System.out.println("Preço: " + priceProduct);
                }
            } else
                System.out.println(defaultErrorMsg);
        }
        return priceProduct;
    }

    public void listProducts(){
        int length = products.length;
        double priceProduct = 0;
        for(index = 0; index < length; index++){
            Product product = products[index];
            if(product != null){
                priceProduct += product.getPriceProduct();
                System.out.println("Código do produto: " + product.getCodeProduct());
                System.out.println("Preço: " + priceProduct);
            }
        }
    }
}