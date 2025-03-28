package br.com.autogeral.emissorfiscal.vo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class InvoiceModelTest {

    @Test
    public void teste_serialize01() {
        InvoiceModel invoice = new InvoiceModel();
        invoice.setReponseQueue("vault");
        invoice.setIncludePdf(true);
        invoice.setCodigoLoja("26");
        invoice.setCodUf("12");
        invoice.setConsumerType("1");
        invoice.setDestination("1");
        invoice.setFinalidadeNota("1");
        invoice.setModeloNota("55");
        invoice.setModoDePagamentoDescricao("Dinheiro");
        invoice.setModoPagamento("01");
        invoice.setNumber(123456);
        invoice.setOperationNature("Venda de Mercadoria");
        LocalDateTime emissao = LocalDateTime.of(2021, 11, 10, 13, 8, 7);
        invoice.setOperationOn(emissao);
        invoice.setOperationType("1");
        invoice.setPresenceType("1");
        invoice.setPrintType("1");
        invoice.setPurposeType("1");
        invoice.setSerie(1);
        invoice.setUfOrigem("SP");

        EmitModel em = new EmitModel();
        em.setNomeEmitente("Emitente");
        em.setCpnjEmitente("01.234.567/0001-89");
        em.setInscricaoEstadual("111.111.111.111");
        em.setLogradouroEmitente("Rua das Flores");
        em.setNumeroLogradouroEmitente("123");
        em.setBairroEmitente("Judas encontrou as botas");
        em.setRegimeTributario("2");
        invoice.setEmitente(em);

        //
        BuyerModel buyer = new BuyerModel();
        buyer.setId("XXX");
        buyer.setName("Scarlett Johansson");
        buyer.setFederalTaxNumber(12345678901L);

        AddressModel address = new AddressModel();
        address.setState("SP");
        CityModel city = new CityModel();
        city.setName("São Paulo");
        city.setCode("3550308");
        address.setCity(city);

        address.setStreet("Rodeo Drive");
        address.setNumber("1000");
        address.setAdditionalInformation("");
        address.setDistrict("HOLYWOOD");
        address.setPostalCode("90028000");
        address.setCountry("EUA");
        address.setPhone("00155599994444");
        buyer.setAddress(address);
        invoice.setBuyer(buyer);


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        String json = null;
        try {
            json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(invoice);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace(System.err);
            fail("Erro ao serializar o objeto InvoiceModel");
        }
        assertNotNull(json);
        boolean contemDataHora = json.contains("2021-11-10T13:08:07");
        assertTrue(contemDataHora);


    }
}
