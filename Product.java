package atividade_1;
/*Exercício 1
• Implemente uma classe Produto


*/

public class Product {
    /*
    • atributos:
        • código: código do produto (private int) X  
        • descrição: descrição do produto (private String) X
        • valor de compra (private double) X
        • custo: custo para armazenar e/ou beneficiar o produto (private double) X
        • margem de lucro: margem de lucro desejada, utilizado para calcular o preço de venda do produto,
        (private double)
        • quantidade em estoque: quantidade de unidades do produto em estoque (private int)
    */
    private int codeProduct;
    private String description;
    private double priceProduct;
    private double storageCost;
    private double profitOverProduct;
    private int quantityStoragedProduct;
    /*
    • métodos:
        • void compra(int quant){qtd_estoque = qtd_estoque + quant;}
        • void venda(int quant){qtd_estoque = qtd_estoque - quant;}
        • double calculaPrecoVenda( ){returrn vl_compra + custo + margem_lucro*(vl_compra + custo) }
        • crie métodos getAtributo e setAtributo para os atributos: valor de compra, custo e margem de lucro
        • crie um construtor para inicializar o valor dos atributos: código e descrição
        • crie um construtor para inicializar o valor dos atributos: código, descrição, valor de compra, custo e
        margem de lucro
        • crie um construtor para inicializar o valor dos atributos: código, descrição, valor de compra, custo,
        margem de lucro e quantidade em estoque
    */
    void buyProduct(int quant){
        quantityStoragedProduct = quantityStoragedProduct + quant;
    }
    void sellProduct(int quant){
        quantityStoragedProduct = quantityStoragedProduct - quant;
    }
    double calcSellPrice() {
        return priceProduct + storageCost + profitOverProduct*(priceProduct + storageCost);
    }

    //Getters and Setters

    public double getPriceProduct() {
        return priceProduct;
    }
    public double getStorageCost() {
        return storageCost;
    }
    public double getProfitOverProduct() {
        return profitOverProduct;
    }
    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }
    public void setStorageCost(double storageCost) {
        this.storageCost = storageCost;
    }
    public void setProfitOverProduct(double profitOverProduct) {
        this.profitOverProduct = profitOverProduct;
    }
    public int getCodeProduct() {
        return codeProduct;
    }
    public void setQuantityStoragedProduct(int quantityStoragedProduct) {
        this.quantityStoragedProduct = quantityStoragedProduct;
    }
    public int getQuantityStoragedProduct() {
        return quantityStoragedProduct;
    }

    // Constructors

    public Product(int codeProduct, String description){
        this.codeProduct = codeProduct;
        this.description = description;
    }

    public Product(int codeProduct, String description, double priceProduct, double storageCost, double profitOverProduct){
        this.codeProduct = codeProduct;
        this.description = description;
        this.priceProduct = priceProduct;
        this.storageCost = storageCost;
        this.profitOverProduct = profitOverProduct;
    }

    public Product(int codeProduct, String description, double priceProduct, double storageCost, double profitOverProduct, int quantityStoragedProduct){
        this.codeProduct = codeProduct;
        this.description = description;
        this.priceProduct = priceProduct;
        this.storageCost = storageCost;
        this.profitOverProduct = profitOverProduct;
        this.quantityStoragedProduct = quantityStoragedProduct;
    }
}
