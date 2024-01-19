
package com.example.howtoinstallcode.codeclass;

import java.io.Serializable;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Definition implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("definition")
    @Expose
    private String definition;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("url_image")
    @Expose
    private String urlImage;
    @SerializedName("front_button")
    @Expose
    private Integer frontButton;
    public final static Creator<Definition> CREATOR = new Creator<Definition>() {


        public Definition createFromParcel(android.os.Parcel in) {
            return new Definition(in);
        }

        public Definition[] newArray(int size) {
            return (new Definition[size]);
        }

    }
    ;
    private final static long serialVersionUID = 7690628260774374204L;

    @SuppressWarnings({
        "unchecked"
    })
    protected Definition(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.definition = ((String) in.readValue((String.class.getClassLoader())));
        this.image = ((String) in.readValue((String.class.getClassLoader())));
        this.urlImage = ((String) in.readValue((String.class.getClassLoader())));
        this.frontButton = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Definition() {
    }

    /**
     * 
     * @param image
     * @param frontButton
     * @param definition
     * @param id
     * @param urlImage
     */
    public Definition(Integer id, String definition, String image, String urlImage, Integer frontButton) {
        super();
        this.id = id;
        this.definition = definition;
        this.image = image;
        this.urlImage = urlImage;
        this.frontButton = frontButton;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Definition withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Definition withDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Definition withImage(String image) {
        this.image = image;
        return this;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Definition withUrlImage(String urlImage) {
        this.urlImage = urlImage;
        return this;
    }

    public Integer getFrontButton() {
        return frontButton;
    }

    public void setFrontButton(Integer frontButton) {
        this.frontButton = frontButton;
    }

    public Definition withFrontButton(Integer frontButton) {
        this.frontButton = frontButton;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Definition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("definition");
        sb.append('=');
        sb.append(((this.definition == null)?"<null>":this.definition));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("urlImage");
        sb.append('=');
        sb.append(((this.urlImage == null)?"<null>":this.urlImage));
        sb.append(',');
        sb.append("frontButton");
        sb.append('=');
        sb.append(((this.frontButton == null)?"<null>":this.frontButton));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(definition);
        dest.writeValue(image);
        dest.writeValue(urlImage);
        dest.writeValue(frontButton);
    }

    public int describeContents() {
        return  0;
    }

}
