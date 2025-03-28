package br.com.autogeral.emissorfiscal.response.vo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class InvoiceResponseTest {

    @Test
    public void teste_serialize01() {
        InvoiceResponse ir = new InvoiceResponse();
        ir.setChave("12345678901234567890123456789012345678901234");
        ir.setNumero(123456);
        ir.setSerie(1);
        ir.setPdf("pdf");
        ir.setXml("xml");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        String json = null;
        try {
            json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(ir);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace(System.err);
            fail("Erro ao serializar o objeto InvoiceResponse");
        }
        assertNotNull(json);
    }
}
