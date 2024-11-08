package nfce.nfceByGithub;

//import autogeral.emissorfiscal.vo.model.nfceGitHub.NfceLote;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.Test;

import java.io.IOException;

public class TestSerializeble {

    @Test
    public void trySerializebleClassNfce(){

        String json =
                "{\n" +
                "  \"idLote\" : \"1\",\n" +
                "  \"indSinc\" : \"1\",\n" +
                "  \"NFe\" : [ {\n" +
                "    \"infNFe\" : {\n" +
                "      \"Id\" : \"NFe35241105437537000137650010000000011000000010\",\n" +
                "      \"ide\" : {\n" +
                "        \"cUF\" : \"35\",\n" +
                "        \"cNF\" : \"00000001\",\n" +
                "        \"natOp\" : \"NOTA FISCAL CONSUMIDOR ELETRONICA\",\n" +
                "        \"mod\" : \"65\",\n" +
                "        \"serie\" : \"1\",\n" +
                "        \"nNF\" : \"1\",\n" +
                "        \"dhEmi\" : \"2024-11-07T09:26:45-02:00\",\n" +
                "        \"dhSaiEnt\" : null,\n" +
                "        \"tpNF\" : \"1\",\n" +
                "        \"idDest\" : \"1\",\n" +
                "        \"cMunFG\" : \"3523909\",\n" +
                "        \"tpImp\" : \"4\",\n" +
                "        \"tpEmis\" : \"1\",\n" +
                "        \"cDV\" : \"0\",\n" +
                "        \"tpAmb\" : \"2\",\n" +
                "        \"finNFe\" : \"1\",\n" +
                "        \"indFinal\" : \"1\",\n" +
                "        \"indPres\" : \"1\",\n" +
                "        \"indIntermed\" : null,\n" +
                "        \"procEmi\" : \"0\",\n" +
                "        \"verProc\" : \"1.0\",\n" +
                "        \"dhCont\" : null,\n" +
                "        \"xJust\" : null,\n" +
                "        \"NFref\" : null\n" +
                "      },\n" +
                "      \"emit\" : {\n" +
                "        \"CNPJ\" : \"05437537000137\",\n" +
                "        \"CPF\" : null,\n" +
                "        \"xNome\" : \"05437537000137\",\n" +
                "        \"xFant\" : null,\n" +
                "        \"enderEmit\" : {\n" +
                "          \"xLgr\" : \"AV SANTO ANTONIO e cia\",\n" +
                "          \"nro\" : \"0\",\n" +
                "          \"xCpl\" : \"QD 17 LT 01-02-03\",\n" +
                "          \"xBairro\" : \"PQ STO ANTONIO\",\n" +
                "          \"cMun\" : \"5219753\",\n" +
                "          \"xMun\" : \"SANTO ANTONIO DO DESCOBERTO\",\n" +
                "          \"UF\" : \"SP\",\n" +
                "          \"CEP\" : \"72900000\",\n" +
                "          \"cPais\" : \"1058\",\n" +
                "          \"xPais\" : \"Brasil\",\n" +
                "          \"fone\" : \"6233215175\"\n" +
                "        },\n" +
                "        \"IE\" : \"05437537000137\",\n" +
                "        \"IEST\" : null,\n" +
                "        \"IM\" : null,\n" +
                "        \"CNAE\" : null,\n" +
                "        \"CRT\" : \"3\"\n" +
                "      },\n" +
                "      \"avulsa\" : null,\n" +
                "      \"dest\" : {\n" +
                "        \"CNPJ\" : \"05437537000137\",\n" +
                "        \"CPF\" : null,\n" +
                "        \"idEstrangeiro\" : null,\n" +
                "        \"xNome\" : \"NF-E EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL\",\n" +
                "        \"enderDest\" : {\n" +
                "          \"xLgr\" : \"Rua: Teste\",\n" +
                "          \"nro\" : \"0\",\n" +
                "          \"xCpl\" : null,\n" +
                "          \"xBairro\" : \"TESTE\",\n" +
                "          \"cMun\" : \"3523909\",\n" +
                "          \"xMun\" : \"ITU\",\n" +
                "          \"UF\" : \"SP\",\n" +
                "          \"CEP\" : \"13301000\",\n" +
                "          \"cPais\" : \"1058\",\n" +
                "          \"xPais\" : \"Brasil\",\n" +
                "          \"fone\" : \"1127158291\"\n" +
                "        },\n" +
                "        \"indIEDest\" : \"9\",\n" +
                "        \"IE\" : null,\n" +
                "        \"ISUF\" : null,\n" +
                "        \"IM\" : null,\n" +
                "        \"email\" : \"teste@test\"\n" +
                "      },\n" +
                "      \"retirada\" : null,\n" +
                "      \"entrega\" : null,\n" +
                "      \"autXML\" : null,\n" +
                "      \"det\" : [ {\n" +
                "        \"prod\" : {\n" +
                "          \"cProd\" : \"7898480650104\",\n" +
                "          \"cEAN\" : \"7898480650104\",\n" +
                "          \"cBarra\" : null,\n" +
                "          \"xProd\" : \"NOTA FISCAL EMITIDA EM AMBIENTE DE HOMOLOGACAO - SEM VALOR FISCAL\",\n" +
                "          \"NCM\" : \"27101932\",\n" +
                "          \"NVE\" : null,\n" +
                "          \"CEST\" : \"0600500\",\n" +
                "          \"indEscala\" : \"S\",\n" +
                "          \"CNPJFab\" : null,\n" +
                "          \"cBenef\" : null,\n" +
                "          \"EXTIPI\" : null,\n" +
                "          \"CFOP\" : \"5102\",\n" +
                "          \"uCom\" : \"UN\",\n" +
                "          \"qCom\" : \"1.0000\",\n" +
                "          \"vUnCom\" : \"13.0000\",\n" +
                "          \"vProd\" : \"13.00\",\n" +
                "          \"cEANTrib\" : \"7898480650104\",\n" +
                "          \"cBarraTrib\" : null,\n" +
                "          \"uTrib\" : \"UN\",\n" +
                "          \"qTrib\" : \"1.0000\",\n" +
                "          \"vUnTrib\" : \"13.0000\",\n" +
                "          \"vFrete\" : null,\n" +
                "          \"vSeg\" : null,\n" +
                "          \"vDesc\" : null,\n" +
                "          \"vOutro\" : null,\n" +
                "          \"indTot\" : \"1\",\n" +
                "          \"DI\" : null,\n" +
                "          \"detExport\" : null,\n" +
                "          \"xPed\" : null,\n" +
                "          \"nItemPed\" : null,\n" +
                "          \"nFCI\" : null,\n" +
                "          \"rastro\" : null,\n" +
                "          \"infProdNFF\" : null,\n" +
                "          \"infProdEmb\" : null,\n" +
                "          \"veicProd\" : null,\n" +
                "          \"med\" : null,\n" +
                "          \"arma\" : null,\n" +
                "          \"comb\" : null,\n" +
                "          \"nRECOPI\" : null\n" +
                "        },\n" +
                "        \"imposto\" : {\n" +
                "          \"content\" : [ {\n" +
                "            \"JAXBElement\" : {\n" +
                "              \"name\" : \"{http://www.portalfiscal.inf.br/nfe}ICMS\",\n" +
                "              \"declaredType\" : \"br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$ICMS\",\n" +
                "              \"scope\" : \"br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto\",\n" +
                "              \"value\" : {\n" +
                "                \"ICMS00\" : {\n" +
                "                  \"orig\" : \"0\",\n" +
                "                  \"CST\" : \"00\",\n" +
                "                  \"modBC\" : \"0\",\n" +
                "                  \"vBC\" : \"13.00\",\n" +
                "                  \"pICMS\" : \"7.00\",\n" +
                "                  \"vICMS\" : \"0.91\",\n" +
                "                  \"pFCP\" : null,\n" +
                "                  \"vFCP\" : null\n" +
                "                },\n" +
                "                \"ICMS02\" : null,\n" +
                "                \"ICMS10\" : null,\n" +
                "                \"ICMS15\" : null,\n" +
                "                \"ICMS20\" : null,\n" +
                "                \"ICMS30\" : null,\n" +
                "                \"ICMS40\" : null,\n" +
                "                \"ICMS51\" : null,\n" +
                "                \"ICMS53\" : null,\n" +
                "                \"ICMS60\" : null,\n" +
                "                \"ICMS61\" : null,\n" +
                "                \"ICMS70\" : null,\n" +
                "                \"ICMS90\" : null,\n" +
                "                \"ICMSPart\" : null,\n" +
                "                \"ICMSST\" : null,\n" +
                "                \"ICMSSN101\" : null,\n" +
                "                \"ICMSSN102\" : null,\n" +
                "                \"ICMSSN201\" : null,\n" +
                "                \"ICMSSN202\" : null,\n" +
                "                \"ICMSSN500\" : null,\n" +
                "                \"ICMSSN900\" : null\n" +
                "              },\n" +
                "              \"nil\" : false,\n" +
                "              \"globalScope\" : false,\n" +
                "              \"typeSubstituted\" : false\n" +
                "            }\n" +
                "          }, {\n" +
                "            \"JAXBElement\" : {\n" +
                "              \"name\" : \"{http://www.portalfiscal.inf.br/nfe}PIS\",\n" +
                "              \"declaredType\" : \"br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$PIS\",\n" +
                "              \"scope\" : \"br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto\",\n" +
                "              \"value\" : {\n" +
                "                \"PISAliq\" : {\n" +
                "                  \"CST\" : \"01\",\n" +
                "                  \"vBC\" : \"13.00\",\n" +
                "                  \"pPIS\" : \"1.65\",\n" +
                "                  \"vPIS\" : \"0.21\"\n" +
                "                },\n" +
                "                \"PISQtde\" : null,\n" +
                "                \"PISNT\" : null,\n" +
                "                \"PISOutr\" : null\n" +
                "              },\n" +
                "              \"nil\" : false,\n" +
                "              \"globalScope\" : false,\n" +
                "              \"typeSubstituted\" : false\n" +
                "            }\n" +
                "          }, {\n" +
                "            \"JAXBElement\" : {\n" +
                "              \"name\" : \"{http://www.portalfiscal.inf.br/nfe}COFINS\",\n" +
                "              \"declaredType\" : \"br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto$COFINS\",\n" +
                "              \"scope\" : \"br.com.swconsultoria.nfe.schema_4.enviNFe.TNFe$InfNFe$Det$Imposto\",\n" +
                "              \"value\" : {\n" +
                "                \"COFINSAliq\" : {\n" +
                "                  \"CST\" : \"01\",\n" +
                "                  \"vBC\" : \"13.00\",\n" +
                "                  \"pCOFINS\" : \"7.60\",\n" +
                "                  \"vCOFINS\" : \"0.99\"\n" +
                "                },\n" +
                "                \"COFINSQtde\" : null,\n" +
                "                \"COFINSNT\" : null,\n" +
                "                \"COFINSOutr\" : null\n" +
                "              },\n" +
                "              \"nil\" : false,\n" +
                "              \"globalScope\" : false,\n" +
                "              \"typeSubstituted\" : false\n" +
                "            }\n" +
                "          } ]\n" +
                "        },\n" +
                "        \"impostoDevol\" : null,\n" +
                "        \"infAdProd\" : null,\n" +
                "        \"obsItem\" : null,\n" +
                "        \"nItem\" : \"1\"\n" +
                "      } ],\n" +
                "      \"total\" : {\n" +
                "        \"ICMSTot\" : {\n" +
                "          \"vBC\" : \"13.00\",\n" +
                "          \"vICMS\" : \"0.91\",\n" +
                "          \"vICMSDeson\" : \"0.00\",\n" +
                "          \"vFCPUFDest\" : null,\n" +
                "          \"vICMSUFDest\" : null,\n" +
                "          \"vICMSUFRemet\" : null,\n" +
                "          \"vFCP\" : \"0.00\",\n" +
                "          \"vBCST\" : \"0.00\",\n" +
                "          \"vST\" : \"0.00\",\n" +
                "          \"vFCPST\" : \"0.00\",\n" +
                "          \"vFCPSTRet\" : \"0.00\",\n" +
                "          \"qBCMono\" : null,\n" +
                "          \"vICMSMono\" : null,\n" +
                "          \"qBCMonoReten\" : null,\n" +
                "          \"vICMSMonoReten\" : null,\n" +
                "          \"qBCMonoRet\" : null,\n" +
                "          \"vICMSMonoRet\" : null,\n" +
                "          \"vProd\" : \"13.00\",\n" +
                "          \"vFrete\" : \"0.00\",\n" +
                "          \"vSeg\" : \"0.00\",\n" +
                "          \"vDesc\" : \"0.00\",\n" +
                "          \"vII\" : \"0.00\",\n" +
                "          \"vIPI\" : \"0.00\",\n" +
                "          \"vIPIDevol\" : \"0.00\",\n" +
                "          \"vPIS\" : \"0.21\",\n" +
                "          \"vCOFINS\" : \"0.99\",\n" +
                "          \"vOutro\" : \"0.00\",\n" +
                "          \"vNF\" : \"13.00\",\n" +
                "          \"vTotTrib\" : null\n" +
                "        },\n" +
                "        \"ISSQNtot\" : null,\n" +
                "        \"retTrib\" : null\n" +
                "      },\n" +
                "      \"transp\" : {\n" +
                "        \"modFrete\" : \"9\",\n" +
                "        \"transporta\" : null,\n" +
                "        \"retTransp\" : null,\n" +
                "        \"veicTransp\" : null,\n" +
                "        \"reboque\" : null,\n" +
                "        \"vagao\" : null,\n" +
                "        \"balsa\" : null,\n" +
                "        \"vol\" : null\n" +
                "      },\n" +
                "      \"cobr\" : null,\n" +
                "      \"pag\" : {\n" +
                "        \"detPag\" : [ {\n" +
                "          \"indPag\" : null,\n" +
                "          \"tPag\" : \"01\",\n" +
                "          \"xPag\" : null,\n" +
                "          \"vPag\" : \"13.00\",\n" +
                "          \"card\" : null\n" +
                "        } ],\n" +
                "        \"vTroco\" : null\n" +
                "      },\n" +
                "      \"infIntermed\" : null,\n" +
                "      \"infAdic\" : null,\n" +
                "      \"exporta\" : null,\n" +
                "      \"compra\" : null,\n" +
                "      \"cana\" : null,\n" +
                "      \"infRespTec\" : null,\n" +
                "      \"infSolicNFF\" : null,\n" +
                "      \"versao\" : \"4.00\"\n" +
                "    },\n" +
                "    \"infNFeSupl\" : {\n" +
                "      \"qrCode\" : \"https://www.homologacao.nfce.fazenda.sp.gov.br/qrcode?p=35241105437537000137650010000000011000000010|2|2|1|B382301A319EDC39B5EB31083E27CBE0B8CCB49A\",\n" +
                "      \"urlChave\" : \"https://www.homologacao.nfce.fazenda.sp.gov.br/consulta\"\n" +
                "    },\n" +
                "    \"Signature\" : {\n" +
                "      \"Id\" : null,\n" +
                "      \"SignedInfo\" : {\n" +
                "        \"Id\" : null,\n" +
                "        \"CanonicalizationMethod\" : {\n" +
                "          \"Algorithm\" : \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"\n" +
                "        },\n" +
                "        \"SignatureMethod\" : {\n" +
                "          \"Algorithm\" : \"http://www.w3.org/2000/09/xmldsig#rsa-sha1\"\n" +
                "        },\n" +
                "        \"Reference\" : {\n" +
                "          \"Id\" : null,\n" +
                "          \"Transforms\" : {\n" +
                "            \"Transform\" : [ {\n" +
                "              \"XPath\" : null,\n" +
                "              \"Algorithm\" : \"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"\n" +
                "            }, {\n" +
                "              \"XPath\" : null,\n" +
                "              \"Algorithm\" : \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"\n" +
                "            } ]\n" +
                "          },\n" +
                "          \"DigestMethod\" : {\n" +
                "            \"Algorithm\" : \"http://www.w3.org/2000/09/xmldsig#sha1\"\n" +
                "          },\n" +
                "          \"DigestValue\" : \"dxDviY75LIbV9jjJ5kqdSTuQFlE=\",\n" +
                "          \"URI\" : \"#NFe35241105437537000137650010000000011000000010\",\n" +
                "          \"Type\" : null\n" +
                "        }\n" +
                "      },\n" +
                "      \"SignatureValue\" : {\n" +
                "        \"Id\" : null,\n" +
                "        \"value\" : \"MXrfQ7wpQyKSlaG49df2kLwXUBk/ON+HvY/RPN4IvFpXeUfSiMPAyh3ZBU1z1pQ3V/Eefv0p3hsujJVD4ep1ixo688ilocsPEiEd5x6Tz91pdDGvwn2aPXPAgDGEB3LIxNswILMS1A71LSbToOKsnjXPXVrwtwaGi0WCGrMpba1sD/Gm1QNsMFJD4PihKYfkpy88O9R/aHADJz2b3i1TR+gKBkH5PtqMJbTglviIWHUnFKGIMv2rDhb3/92NjMKrio0gWDQ8SGjdoEBwPS1gNW513YGoM3fdrgePpELE9jP7AzfaTTq9+VPBbbmj9eBjkw4a/guFdmUfflxqdUFOlg==\"\n" +
                "      },\n" +
                "      \"KeyInfo\" : {\n" +
                "        \"Id\" : null,\n" +
                "        \"X509Data\" : {\n" +
                "          \"X509Certificate\" : \"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\"\n" +
                "        }\n" +
                "      }\n" +
                "    }\n" +
                "  } ],\n" +
                "  \"versao\" : \"4.00\"\n" +
                "}";

        System.out.println(json);
    }}
