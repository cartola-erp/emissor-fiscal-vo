package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContenttModel {

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
        return "ContenttModel{" +
                "jaxbElement=" + jaxbElement +
                '}';
    }

}
