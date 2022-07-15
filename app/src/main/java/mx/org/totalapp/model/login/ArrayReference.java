
package mx.org.totalapp.model.login;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArrayReference {

    @SerializedName("images")
    @Expose
    private List<Image> images = null;
    @SerializedName("bank")
    @Expose
    private String bank;
    @SerializedName("reference")
    @Expose
    private String reference;
    @SerializedName("aliasbank")
    @Expose
    private String aliasbank;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getAliasbank() {
        return aliasbank;
    }

    public void setAliasbank(String aliasbank) {
        this.aliasbank = aliasbank;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ArrayReference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("images");
        sb.append('=');
        sb.append(((this.images == null)?"<null>":this.images));
        sb.append(',');
        sb.append("bank");
        sb.append('=');
        sb.append(((this.bank == null)?"<null>":this.bank));
        sb.append(',');
        sb.append("reference");
        sb.append('=');
        sb.append(((this.reference == null)?"<null>":this.reference));
        sb.append(',');
        sb.append("aliasbank");
        sb.append('=');
        sb.append(((this.aliasbank == null)?"<null>":this.aliasbank));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
