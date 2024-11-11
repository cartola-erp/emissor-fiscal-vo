# emissor-fiscal-vo
Modelagem do emissor fiscal 

# Estrutura Geral e Campos do JSON para NFC-e

Este documento descreve a estrutura geral e os principais campos do JSON necessário para criar uma NFC-e com os dados exigidos para validação e registro junto à SEFAZ.

## Campos Gerais

### Identificação
- **id**: Identificador único da nota NFC-e.

### Pagamento
- **payment**: Lista dos detalhes de pagamento.
- **paymentDetail**: Lista dos métodos de pagamento usados na transação.
- **method**: Método de pagamento (ex., Cash, Credit).
- **methodDescription**: Descrição detalhada do método de pagamento.
- **paymentType**: Tipo de pagamento, como "InCash" (à vista).
- **amount**: Valor do pagamento.
- **card**: Detalhes do cartão, caso o pagamento seja feito com cartão.
    - **federalTaxNumber**: CPF ou CNPJ do portador do cartão.
    - **flag**: Bandeira do cartão (Visa, Master, etc.).
    - **authorization**: Código de autorização da transação.
    - **integrationPaymentType**: Tipo de integração (Ex: Integrated).
    - **federalTaxNumberRecipient**: CPF ou CNPJ do recebedor.
    - **idPaymentTerminal**: ID do terminal de pagamento.
    - **paymentDate**: Data do pagamento.
    - **federalTaxNumberPag**: CPF/CNPJ do pagador.
    - **statePag**: UF do pagador.
    - **payBack**: Troco, caso o pagamento seja em dinheiro.

## Detalhes da Nota
- **serie**: Série da nota.
- **number**: Número da nota.
- **operationOn**: Data e hora da operação.
- **operationNature**: Natureza da operação (ex., Venda).
- **operationType**: Tipo de operação (ex., Outgoing).
- **destination**: Destino da operação.
- **printType**: Tipo de impressão (ex., DANFE NFC-e).
- **purposeType**: Finalidade da emissão.
- **consumerType**: Tipo do consumidor (ex., FinalConsumer).
- **presenceType**: Indicador de presença (ex., None).
- **contingencyOn**: Data de ativação da contingência.
- **contingencyJustification**: Justificativa para a contingência.

## Informações do Comprador
- **buyer**: Informações do comprador.
    - **accountId**: Identificação da conta do comprador.
    - **id**: Identificador único do comprador.
    - **name**: Nome do comprador.
    - **federalTaxNumber**: CPF/CNPJ do comprador.
    - **email**: Email do comprador.
    - **address**: Endereço do comprador.
        - **state**: Estado.
        - **city**: Cidade (com código e nome).
        - **district**: Bairro.
        - **additionalInformation**: Informações adicionais sobre o endereço.
        - **street**: Rua.
        - **number**: Número do endereço.
        - **postalCode**: CEP.
        - **country**: País.
        - **phone**: Telefone.
    - **type**: Tipo de pessoa (ex., Física).
    - **stateTaxNumberIndicator**: Indicador de inscrição estadual.
    - **tradeName**: Nome comercial.
    - **taxRegime**: Regime tributário do comprador.
    - **stateTaxNumber**: Inscrição estadual.

## Informações de Transporte
- **transport**: Dados de transporte.
    - **freightModality**: Modalidade do frete (Ex: ByIssuer).
    - **transportGroup**: Detalhes do grupo de transporte.
    - **reboque**: Dados de reboque.
    - **volume**: Informações de volume (peso, quantidade).
    - **transportVehicle**: Informações do veículo de transporte.
    - **sealNumber**: Número do lacre.
    - **transpRate**: Taxas de transporte.

## Informações Adicionais
- **additionalInformation**: Informações adicionais para SEFAZ e contribuinte.
    - **fisco**: Informações de interesse do fisco.
    - **taxpayer**: Informações de interesse do contribuinte.
    - **xmlAuthorized**: Lista de CNPJs autorizados a acessar o XML da nota.
    - **taxDocumentsReference**: Referência a documentos fiscais, como cupons e faturas.
    - **taxpayerComments**: Comentários do contribuinte.
    - **referencedProcess**: Processos referenciados para benefícios fiscais.

## Itens
- **items**: Lista de itens da nota.
    - **code**: Código do produto.
    - **description**: Descrição do item.
    - **ncm**: NCM do produto.
    - **quantity**: Quantidade.
    - **unitAmount**: Valor unitário.
    - **tax**: Informações tributárias do item.
        - **icms**: Informações do ICMS.
        - **ipi**: Informações do IPI.
        - **ii**: Informações de Imposto de Importação.
        - **pis**: Informações do PIS.
        - **cofins**: Informações do COFINS.

## Totais
- **totals**: Totais de impostos e valores.
    - **icms**: Totais de ICMS.
    - **issqn**: Totais de ISSQN.

## Faturamento
- **billing**: Informações de faturamento.
    - **bill**: Detalhes da cobrança.
    - **duplicates**: Lista de duplicatas com vencimento e valor.

## Emitente
- **issuer**: Dados do emitente, incluindo IE.

## Intermediário
- **transactionIntermediate**: Informações sobre o intermediário na transação.

Este JSON é detalhado para capturar os requisitos de uma NFC-e, permitindo o cálculo de tributos e o registro de informações obrigatórias da operação.
