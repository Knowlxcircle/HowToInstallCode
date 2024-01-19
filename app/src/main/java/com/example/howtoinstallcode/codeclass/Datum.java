
package com.example.howtoinstallcode.codeclass;

import java.io.Serializable;
import java.util.List;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Datum implements Serializable, Parcelable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("definition")
    @Expose
    private List<Definition> definition;
    @SerializedName("inside_fragment")
    @Expose
    private List<InsideFragment> insideFragment;
    public final static Creator<Datum> CREATOR = new Creator<Datum>() {

        public Datum createFromParcel(android.os.Parcel in) {
            return new Datum(in);
        }

        public Datum[] newArray(int size) {
            return (new Datum[size]);
        }

    };
    private final static long serialVersionUID = -5303178514278542528L;

    @SuppressWarnings({
        "unchecked"
    })
    protected Datum(android.os.Parcel in) {
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.image = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.definition, (com.example.howtoinstallcode.codeclass.Definition.class.getClassLoader()));
        in.readList(this.insideFragment, (com.example.howtoinstallcode.codeclass.InsideFragment.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Datum() {
    }

    /**
     * 
     * @param insideFragment
     * @param image
     * @param name
     * @param definition
     * @param id
     * @param url
     */
    public Datum(Integer id, String name, String url, String image, List<Definition> definition, List<InsideFragment> insideFragment) {
        super();
        this.id = id;
        this.name = name;
        this.url = url;
        this.image = image;
        this.definition = definition;
        this.insideFragment = insideFragment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Datum withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Datum withName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Datum withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Datum withImage(String image) {
        this.image = image;
        return this;
    }

    public List<Definition> getDefinition() {
        return definition;
    }

    public void setDefinition(List<Definition> definition) {
        this.definition = definition;
    }

    public Datum withDefinition(List<Definition> definition) {
        this.definition = definition;
        return this;
    }

    public List<InsideFragment> getInsideFragment() {
        return insideFragment;
    }

    public void setInsideFragment(List<InsideFragment> insideFragment) {
        this.insideFragment = insideFragment;
    }

    public Datum withInsideFragment(List<InsideFragment> insideFragment) {
        this.insideFragment = insideFragment;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null)?"<null>":this.image));
        sb.append(',');
        sb.append("definition");
        sb.append('=');
        sb.append(((this.definition == null)?"<null>":this.definition));
        sb.append(',');
        sb.append("insideFragment");
        sb.append('=');
        sb.append(((this.insideFragment == null)?"<null>":this.insideFragment));
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
        dest.writeValue(name);
        dest.writeValue(url);
        dest.writeValue(image);
        dest.writeList(definition);
        dest.writeList(insideFragment);
    }

    public int describeContents() {
        return  0;
    }

}
