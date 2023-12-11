package com.example.animalapp;

public class Item {

    int imageId;
    String animalName;
    String animalType;

    public Item(int imageId, String animalName, String animalType) {
        this.imageId = imageId;
        this.animalName = animalName;
        this.animalType = animalType;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
