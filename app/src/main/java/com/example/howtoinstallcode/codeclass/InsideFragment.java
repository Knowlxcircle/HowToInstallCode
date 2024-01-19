
package com.example.howtoinstallcode.codeclass;

import java.io.Serializable;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class InsideFragment implements Serializable, Parcelable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nomor")
    @Expose
    private Integer nomor;
    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("image")
    @Expose
    private Object image;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("frontbutton")
    @Expose
    private Integer frontbutton;
    public final static Creator<InsideFragment> CREATOR = new Creator<InsideFragment>() {


        public InsideFragment createFromParcel(android.os.Parcel in) {
            return new InsideFragment(in);
        }

        public InsideFragment[] newArray(int size) {
            return (new InsideFragment[size]);
        }

    }
    ;
    private final static long serialVersionUID = -3965947963643935873L;

    @SuppressWarnings({
        "unchecked"
    })
    protected InsideFragment(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.nomor = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.url = ((Object) in.readValue((Object.class.getClassLoader())));
        this.image = ((Object) in.readValue((Object.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.frontbutton = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public InsideFragment() {
    }

    /**
     * 
     * @param image
     * @param id
     * @param title
     * @param nomor
     * @param frontbutton
     * @param url
     */
    public InsideFragment(Integer id, Integer nomor, Object url, Object image, String title, Integer frontbutton) {
        super();
        this.id = id;
        this.nomor = nomor;
        this.url = url;
        this.image = image;
        this.title = title;
        this.frontbutton = frontbutton;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public InsideFragment withId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getNomor() {
        return nomor;
    }

    public void setNomor(Integer nomor) {
        this.nomor = nomor;
    }

    public InsideFragment withNomor(Integer nomor) {
        this.nomor = nomor;
        return this;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public InsideFragment withUrl(Object url) {
        this.url = url;
        return this;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public InsideFragment withImage(Object image) {
        this.image = image;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public InsideFragment withTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getFrontbutton() {
        return frontbutton;
    }

    public void setFrontbutton(Integer frontbutton) {
        this.frontbutton = frontbutton;
    }

    public InsideFragment withFrontbutton(Integer frontbutton) {
        this.frontbutton = frontbutton;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InsideFragment.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nomor");
        sb.append('=');
        sb.append(((this.nomor == null)?"<null>":this.nomor));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("frontbutton");
        sb.append('=');
        sb.append(((this.frontbutton == null)?"<null>":this.frontbutton));
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
        dest.writeValue(nomor);
        dest.writeValue(url);
        dest.writeValue(image);
        dest.writeValue(title);
        dest.writeValue(frontbutton);
    }

    public int describeContents() {
        return  0;
    }

}
