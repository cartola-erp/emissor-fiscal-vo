package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;


public class ImpostoModel  implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("content")
    private List<ContentModel> content;

    public List<ContentModel> getContent() {
        return content;
    }

    public void setContent(List<ContentModel> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ImpostoModel{" +
                "content=" + content +
                '}';
    }
}
