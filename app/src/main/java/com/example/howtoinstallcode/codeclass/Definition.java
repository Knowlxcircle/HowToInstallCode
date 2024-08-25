
package com.example.howtoinstallcode.codeclass;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Definition implements Serializable
{

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("definition")
    @Expose
    private String definition;
    @SerializedName("program_name")
    @Expose
    private String programName;
    @SerializedName("image")
    @Expose
    private Object image;
    @SerializedName("url_image")
    @Expose
    private String urlImage;
    @SerializedName("front_button")
    @Expose
    private Integer frontButton;
    private final static long serialVersionUID = 6519425728670890842L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Integer getFrontButton() {
        return frontButton;
    }

    public void setFrontButton(Integer frontButton) {
        this.frontButton = frontButton;
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
        sb.append("programName");
        sb.append('=');
        sb.append(((this.programName == null)?"<null>":this.programName));
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

}
