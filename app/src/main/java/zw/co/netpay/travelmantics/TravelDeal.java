package zw.co.netpay.travelmantics;

import java.io.Serializable;

public class TravelDeal implements Serializable {
    private String id;
    private String title;
    private String details;
    private String price;
    private String imageURL;
    private String imageName;

    public TravelDeal(){};

    public TravelDeal(String title, String details, String price, String imageURL,String imageName){
        this.setTitle(title);
        this.setDetails(details);
        this.setPrice(price);
        this.setImageURL(imageURL);
        this.setImageName(imageName);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
