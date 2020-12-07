package atividade_1;

public class RevendaComArray {
    private Product products[];
    private int index;

    public RevendaComArray(int quant){
        products = new Product[quant];
    }
    public void insertProduct(Product product){
        index = 0;

    }
    public void buy(int codeProduct, int quant){
        int length = products.length;
        for (index = 0; index < length; index++){
            Product product = products[index];
            if(product != null){
                if(codeProduct == product.getCodeProduct()){
                    int qnt_storage = product.getQuantityStoragedProduct();
                    product.setQuantityStoragedProduct(product.getQuantityStoragedProduct() + quant);
                }
            }
        }
    }
}
