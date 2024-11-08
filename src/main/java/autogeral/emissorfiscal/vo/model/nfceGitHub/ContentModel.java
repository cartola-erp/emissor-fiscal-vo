package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ContentModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonProperty("JAXBElement")
    private JAXBElementModel jaxbElement;

    public JAXBElementModel getJaxbElement() {
        return jaxbElement;
    }

    public void setJaxbElement(JAXBElementModel jaxbElement) {
        this.jaxbElement = jaxbElement;
    }

    @Override
    public String toString() {
        return "ContentModel{" +
                "jaxbElement=" + jaxbElement +
                '}';
    }
}
