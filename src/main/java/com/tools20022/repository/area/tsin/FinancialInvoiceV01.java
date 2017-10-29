/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area.tsin;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.repository.area.TradeServicesInitiationLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.FinancialInvoiceISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The FinancialInvoice message is used to support the provision of financial
 * and related services where there is a requirement to exchange invoice
 * information.<br>
 * <b>Usage</b><br>
 * While the prime function of the FinancialInvoice message is as a request from
 * the seller to the buyer for payment, the FinancialInvoice message can also
 * serve to evidence an invoice in support of a financial service such as
 * invoice factoring, letters of credit, and bank payment obligations, to enable
 * Web based services such as electronic bill payment and presentment, and as
 * the basis to transfer invoice information via third parties such as
 * e-invoicing service providers.<br>
 * A consequence of the receipt of an invoice by the buyer is that it acts as a
 * trigger for the use of related messages that are already defined in ISO
 * 20022, notably where the information contained in the Financial Invoice
 * enables payment for the goods or services received, and/or is provided in
 * support of a request for invoice financing. While certain of these related
 * messages, such as the CreditTransfer and PaymentInitiation messages, are
 * shown in the sequence diagram they are out of scope. They are shown only to
 * illustrate a given scenario and to place the invoice in the context of the
 * financial banking processes that might be conducted between different
 * financial institutions.<br>
 * The use of self-billing by the buyer to the seller, where the buyer acts as
 * the invoice issuer or the process of handling an incorrect invoice, is not in
 * scope.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
 * TradeServicesInitiationLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.FinancialInvoiceISOArchive
 * FinancialInvoiceISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FinInvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#InvoiceHeader
 * FinancialInvoiceV01.InvoiceHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#TradeAgreement
 * FinancialInvoiceV01.TradeAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#TradeDelivery
 * FinancialInvoiceV01.TradeDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#TradeSettlement
 * FinancialInvoiceV01.TradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#LineItem
 * FinancialInvoiceV01.LineItem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} =
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#identifier
 * FinancialInvoiceV01.identifier}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInvoiceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe FinancialInvoice message is used to support the provision of financial and related services where there is a requirement to exchange invoice information.\r\nUsage\r\nWhile the prime function of the FinancialInvoice message is as a request from the seller to the buyer for payment, the FinancialInvoice message can also serve to evidence an invoice in support of a financial service such as invoice factoring, letters of credit, and bank payment obligations, to enable Web based services such as electronic bill payment and presentment, and as the basis to transfer invoice information via third parties such as e-invoicing service providers.\r\nA consequence of the receipt of an invoice by the buyer is that it acts as a trigger for the use of related messages that are already defined in ISO 20022, notably where the information contained in the Financial Invoice enables payment for the goods or services received, and/or is provided in support of a request for invoice financing. While certain of these related messages, such as the CreditTransfer and PaymentInitiation messages, are shown in the sequence diagram they are out of scope. They are shown only to illustrate a given scenario and to place the invoice in the context of the financial banking processes that might be conducted between different financial institutions.\r\nThe use of self-billing by the buyer to the seller, where the buyer acts as the invoice issuer or the process of handling an incorrect invoice, is not in scope."
 * </li>
 * </ul>
 */
public class FinancialInvoiceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Collection of data that is exchanged between two or more parties in
	 * written, printed or electronic form. It contains general data relevant to
	 * the main body of the invoice such as date of issue, currency code and
	 * identification number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.InvoiceHeader1
	 * InvoiceHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collection of data that is exchanged between two or more parties in written, printed or electronic form. It contains general data relevant to the main body of the invoice such as date of issue, currency code and identification number."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock InvoiceHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "InvcHdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceHeader";
			definition = "Collection of data that is exchanged between two or more parties in written, printed or electronic form. It contains general data relevant to the main body of the invoice such as date of issue, currency code and identification number.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> InvoiceHeader1.mmObject();
		}
	};
	/**
	 * Commercial information such as terms of commerce, parties, and
	 * documentation, related to the trading agreement under which this invoice
	 * is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeAgreement6
	 * TradeAgreement6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradAgrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commercial information such as terms of commerce, parties, and documentation, related to the trading agreement under which this invoice is issued."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock TradeAgreement = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradAgrmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAgreement";
			definition = "Commercial information such as terms of commerce, parties, and documentation, related to the trading agreement under which this invoice is issued.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> TradeAgreement6.mmObject();
		}
	};
	/**
	 * Supply chain shipping arrangements for delivery of invoiced products
	 * and/or services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeDelivery1
	 * TradeDelivery1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDlvry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Supply chain shipping arrangements for delivery of invoiced products and/or services."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock TradeDelivery = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradDlvry";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDelivery";
			definition = "Supply chain shipping arrangements for delivery of invoiced products and/or services.";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> TradeDelivery1.mmObject();
		}
	};
	/**
	 * Settlement information that enables the financial reconciliation and
	 * payment of this invoice.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradeSettlement1
	 * TradeSettlement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement information that enables the financial reconciliation and payment of this invoice.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock TradeSettlement = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradSttlm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeSettlement";
			definition = "Settlement information that enables the financial reconciliation and payment of this invoice.\r\n";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> TradeSettlement1.mmObject();
		}
	};
	/**
	 * Unit of information in this invoice showning the related provision of
	 * products and/or services and monetary summations reported as a discrete
	 * line item.<br>
	 * <br>
	 * <br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.LineItem10
	 * LineItem10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of information in this invoice showning the related  provision of products and/or services and monetary summations reported as a discrete line item.\r\n\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock LineItem = new MMMessageBuildingBlock() {
		{
			xmlTag = "LineItm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItem";
			definition = "Unit of information in this invoice showning the related  provision of products and/or services and monetary summations reported as a discrete line item.\r\n\r\n\r\n";
			minOccurs = 0;
			complexType_lazy = () -> LineItem10.mmObject();
		}
	};
	/**
	 * An instance of MessageDefinitionIdentifier.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getVersion
	 * version} = "01"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getBusinessArea
	 * businessArea} = "tsin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getMessageFunctionality
	 * messageFunctionality} = "004"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageDefinitionIdentifier#getFlavour
	 * flavour} = "001"</li>
	 * </ul>
	 */
	public static final MMMessageDefinitionIdentifier identifier = new MMMessageDefinitionIdentifier() {
		{
			businessArea = "tsin";
			messageFunctionality = "004";
			version = "01";
			flavour = "001";
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FinancialInvoiceV01";
				definition = "Scope\r\nThe FinancialInvoice message is used to support the provision of financial and related services where there is a requirement to exchange invoice information.\r\nUsage\r\nWhile the prime function of the FinancialInvoice message is as a request from the seller to the buyer for payment, the FinancialInvoice message can also serve to evidence an invoice in support of a financial service such as invoice factoring, letters of credit, and bank payment obligations, to enable Web based services such as electronic bill payment and presentment, and as the basis to transfer invoice information via third parties such as e-invoicing service providers.\r\nA consequence of the receipt of an invoice by the buyer is that it acts as a trigger for the use of related messages that are already defined in ISO 20022, notably where the information contained in the Financial Invoice enables payment for the goods or services received, and/or is provided in support of a request for invoice financing. While certain of these related messages, such as the CreditTransfer and PaymentInitiation messages, are shown in the sequence diagram they are out of scope. They are shown only to illustrate a given scenario and to place the invoice in the context of the financial banking processes that might be conducted between different financial institutions.\r\nThe use of self-billing by the buyer to the seller, where the buyer acts as the invoice issuer or the process of handling an incorrect invoice, is not in scope.";
				messageSet_lazy = () -> Arrays.asList(FinancialInvoiceISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FinInvc";
				businessArea_lazy = () -> TradeServicesInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.FinancialInvoiceV01.InvoiceHeader, com.tools20022.repository.area.tsin.FinancialInvoiceV01.TradeAgreement,
						com.tools20022.repository.area.tsin.FinancialInvoiceV01.TradeDelivery, com.tools20022.repository.area.tsin.FinancialInvoiceV01.TradeSettlement, com.tools20022.repository.area.tsin.FinancialInvoiceV01.LineItem);
				messageDefinitionIdentifier_lazy = () -> com.tools20022.repository.area.tsin.FinancialInvoiceV01.identifier;
			}
		});
		return mmObject_lazy.get();
	}
}