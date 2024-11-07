package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImpostoModel {

    @JsonProperty("content")
    private List<ContenttModel> content;

    public List<ContenttModel> getContent() {
        return content;
    }

    public void setContent(List<ContenttModel> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ImpostoModel{" +
                "content=" + content +
                '}';
    }
}