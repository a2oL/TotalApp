
package mx.org.totalapp.model.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("url3X3")
    @Expose
    private String url3X3;
    @SerializedName("url4X4")
    @Expose
    private String url4X4;
    @SerializedName("url5X5")
    @Expose
    private String url5X5;
    @SerializedName("url6X6")
    @Expose
    private String url6X6;
    @SerializedName("url7X7")
    @Expose
    private String url7X7;

    public String getUrl3X3() {
        return url3X3;
    }

    public void setUrl3X3(String url3X3) {
        this.url3X3 = url3X3;
    }

    public String getUrl4X4() {
        return url4X4;
    }

    public void setUrl4X4(String url4X4) {
        this.url4X4 = url4X4;
    }

    public String getUrl5X5() {
        return url5X5;
    }

    public void setUrl5X5(String url5X5) {
        this.url5X5 = url5X5;
    }

    public String getUrl6X6() {
        return url6X6;
    }

    public void setUrl6X6(String url6X6) {
        this.url6X6 = url6X6;
    }

    public String getUrl7X7() {
        return url7X7;
    }

    public void setUrl7X7(String url7X7) {
        this.url7X7 = url7X7;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Image.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url3X3");
        sb.append('=');
        sb.append(((this.url3X3 == null)?"<null>":this.url3X3));
        sb.append(',');
        sb.append("url4X4");
        sb.append('=');
        sb.append(((this.url4X4 == null)?"<null>":this.url4X4));
        sb.append(',');
        sb.append("url5X5");
        sb.append('=');
        sb.append(((this.url5X5 == null)?"<null>":this.url5X5));
        sb.append(',');
        sb.append("url6X6");
        sb.append('=');
        sb.append(((this.url6X6 == null)?"<null>":this.url6X6));
        sb.append(',');
        sb.append("url7X7");
        sb.append('=');
        sb.append(((this.url7X7 == null)?"<null>":this.url7X7));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
