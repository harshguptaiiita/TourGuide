package com.inferno.travelguide;

/**
 * Created by Suraj Singh on 11/24/2016.
 */
public class place {

    private String Name;

    private String Address;

    private String rating;
    private int mImageResourceId;

    public place(int mImageResourceId, String rating, String address, String name) {
        this.mImageResourceId = mImageResourceId;
        this.rating = rating;
        Address = address;
        Name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }



    public String getAddress() {
        return Address;
    }

    public void setAddress(String mAddressId) {
        this.Address = mAddressId;
    }

    public String getName() {
        return Name;
    }

    public void setmNameId(String Name) {
        this.Name = Name;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }
}
