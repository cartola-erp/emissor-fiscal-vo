package autogeral.emissorfiscal.vo.model.nfceGitHub;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JAXBElementModel {

    @JsonProperty("name")
    private String name;
    @JsonProperty("declaredType")
    private String declaredType;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("value")
    private ValueModel value;
    @JsonProperty("nil")
    private boolean nil;
    @JsonProperty("globalScope")
    private boolean globalScope;
    @JsonProperty("typeSubstituted")
    private boolean typeSubstituted;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeclaredType() {
        return declaredType;
    }

    public void setDeclaredType(String declaredType) {
        this.declaredType = declaredType;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public ValueModel getValue() {
        return value;
    }

    public void setValue(ValueModel value) {
        this.value = value;
    }

    public boolean isNil() {
        return nil;
    }

    public void setNil(boolean nil) {
        this.nil = nil;
    }

    public boolean isGlobalScope() {
        return globalScope;
    }

    public void setGlobalScope(boolean globalScope) {
        this.globalScope = globalScope;
    }

    public boolean isTypeSubstituted() {
        return typeSubstituted;
    }

    public void setTypeSubstituted(boolean typeSubstituted) {
        this.typeSubstituted = typeSubstituted;
    }

    @Override
    public String toString() {
        return "JAXBElementModel{" +
                "name='" + name + '\'' +
                ", declaredType='" + declaredType + '\'' +
                ", scope='" + scope + '\'' +
                ", value=" + value +
                ", nil=" + nil +
                ", globalScope=" + globalScope +
                ", typeSubstituted=" + typeSubstituted +
                '}';
    }
}
