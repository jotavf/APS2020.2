package atividade_1;
//Exercício 1

public class Product {
    
    private int codeProduct;
    private String description;
    private double priceProduct;
    private double storageCost;
    private double profitOverProduct;
    private int quantityStoragedProduct;

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
