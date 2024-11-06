package nfce;

import autogeral.emissorfiscal.vo.model.nfce.PaymentModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.Test;

import java.io.IOException;

public class TestDeserialize {

    @Test
    public void testDeserialize() {
        String jsonString = "{\n" +
                "  \"id\": \"string\",\n" +
                "  \"payment\": [\n" +
                "    {\n" +
                "      \"paymentDetail\": [\n" +
                "        {\n" +
                "          \"method\": \"Cash\",\n" +
                "          \"methodDescription\": \"string\",\n" +
                "          \"paymentType\": \"InCash\",\n" +
                "          \"amount\": 0,\n" +
                "          \"card\": {\n" +
                "            \"federalTaxNumber\": \"string\",\n" +
                "            \"flag\": \"None\",\n" +
                "            \"authorization\": \"string\",\n" +
                "            \"integrationPaymentType\": \"Integrated\",\n" +
                "            \"federalTaxNumberRecipient\": \"string\",\n" +
                "            \"idPaymentTerminal\": \"string\"\n" +
                "          },\n" +
                "          \"paymentDate\": \"2024-11-06T15:06:59.098Z\",\n" +
                "          \"federalTaxNumberPag\": \"string\",\n" +
                "          \"statePag\": \"string\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"payBack\": 0\n" +
                "    }\n" +
                "  ],\n" +
                "  \"serie\": 0,\n" +
                "  \"number\": 0,\n" +
                "  \"operationOn\": \"2024-11-06T15:06:59.098Z\",\n" +
                "  \"operationNature\": \"string\",\n" +
                "  \"operationType\": \"Outgoing\",\n" +
                "  \"destination\": \"None\",\n" +
                "  \"printType\": \"None\",\n" +
                "  \"purposeType\": \"None\",\n" +
                "  \"consumerType\": \"FinalConsumer\",\n" +
                "  \"presenceType\": \"None\",\n" +
                "  \"contingencyOn\": \"2024-11-06T15:06:59.098Z\",\n" +
                "  \"contingencyJustification\": \"string\"\n" +
                "}";


        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());

        try {
            PaymentModel nfce = om.readValue(jsonString, PaymentModel.class);

            System.out.println("ID: " +  nfce.getId());
            System.out.println("Operation Nature: " + nfce.getOperationNature());
            System.out.println("Payment Method: " + nfce.getPayment().get(0).getPaymentDetail().get(0).getMethod());
            System.out.println("Payment Amount: " + nfce.getPayment().get(0).getPaymentDetail().get(0).getAmount());
            System.out.println("Payment Date: " + nfce.getPayment().get(0).getPaymentDetail().get(0).getPaymentDate());


        } catch (IOException e) {
            System.out.println("Ocorreu um erro: " + e);
        }
    }
}
