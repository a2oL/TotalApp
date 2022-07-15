
package mx.org.totalapp.model.login;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bancos {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("arrayReferences")
    @Expose
    private List<ArrayReference> arrayReferences = null;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<ArrayReference> getArrayReferences() {
        return arrayReferences;
    }

    public void setArrayReferences(List<ArrayReference> arrayReferences) {
        this.arrayReferences = arrayReferences;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Bancos.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("arrayReferences");
        sb.append('=');
        sb.append(((this.arrayReferences == null)?"<null>":this.arrayReferences));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
