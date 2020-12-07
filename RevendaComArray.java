package atividade_1;

public class RevendaComArray {
    private Product products[];
    private int index;

    public RevendaComArray(int quant) {
        products = new Product[quant];
    }

    public void insertProduct(Product product) {
        index = 0;

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
                System.out.println("Código do produto não pôde ser encontrado");
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
                System.out.println("Código do produto não pôde ser encontrado");
        }
    }

    public double checkPrice2Sell(int codeProduct) {
        int length = products.length;
        double priceProduct = 0;
        for (index = 0; index < length; index++) {
            Product product = products[index];
            int codeSearched = product.getCodeProduct();
            if (product != null) {
                if (codeSearched == codeProduct) {
                    priceProduct = product.getPriceProduct();
                    System.out.println("Preço: " + priceProduct);
                }
            } else
                System.out.println("Código do produto não pôde ser encontrado");
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