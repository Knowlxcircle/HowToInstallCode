
package com.example.howtoinstallcode.codeclass;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data implements Serializable
{

    @SerializedName("definition")
    @Expose
    private Definition definition;
    @SerializedName("inside_fragment")
    @Expose
    private List<InsideFragment__1> insideFragment;
    private final static long serialVersionUID = -4889760067366470641L;

    public Definition getDefinition() {
        return definition;
    }

    public void setDefinition(Definition definition) {
        this.definition = definition;
    }

    public List<InsideFragment__1> getInsideFragment() {
        return insideFragment;
    }

    public void setInsideFragment(List<InsideFragment__1> insideFragment) {
        this.insideFragment = insideFragment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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

}
