package com.calc.gourav.gallery_making;

public class call {

    public call(){}



    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public call(Integer image, String imagename) {
        this.image = image;
        this.imagename = imagename;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer image;
    public String imagename;
}
