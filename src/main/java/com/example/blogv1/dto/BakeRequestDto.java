package com.example.blogv1.dto;

public class BakeRequestDto extends PostRequestDto{

    private String portion;
    private String animalProduct;
    private String shelfLife;
    private String netQuantity;

    public BakeRequestDto(String title, String titleContent, String content, String categoryName, String portion, String animalProduct, String shelfLife, String netQuantity) {
        super(title, titleContent, content, categoryName);
        this.portion = portion;
        this.animalProduct = animalProduct;
        this.shelfLife = shelfLife;
        this.netQuantity = netQuantity;
    }

    public String getPortion() {
        return portion;
    }

    public void setPortion(String portion) {
        this.portion = portion;
    }

    public String isAnimalProduct() {
        return animalProduct;
    }

    public void setAnimalProduct(String animalProduct) {
        this.animalProduct = animalProduct;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getNetQuantity() {
        return netQuantity;
    }

    public void setNetQuantity(String netQuantity) {
        this.netQuantity = netQuantity;
    }
}
