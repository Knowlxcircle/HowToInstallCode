
package com.example.howtoinstallcode.codeclass;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class InsideFragment__1 implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("program_name")
    @Expose
    private String programName;
    @SerializedName("nomor")
    @Expose
    private Integer nomor;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("image")
    @Expose
    private Object image;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("frontbutton")
    @Expose
    private Integer frontbutton;
    private final static long serialVersionUID = 2741638420035890192L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public Integer getNomor() {
        return nomor;
    }

    public void setNomor(Integer nomor) {
        this.nomor = nomor;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getFrontbutton() {
        return frontbutton;
    }

    public void setFrontbutton(Integer frontbutton) {
        this.frontbutton = frontbutton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InsideFragment__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("programName");
        sb.append('=');
        sb.append(((this.programName == null)?"<null>":this.programName));
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

}
