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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesInitiationLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.FinancialInvoiceISOArchive;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#mmInvoiceHeader
 * FinancialInvoiceV01.mmInvoiceHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#mmTradeAgreement
 * FinancialInvoiceV01.mmTradeAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#mmTradeDelivery
 * FinancialInvoiceV01.mmTradeDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#mmTradeSettlement
 * FinancialInvoiceV01.mmTradeSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsin.FinancialInvoiceV01#mmLineItem
 * FinancialInvoiceV01.mmLineItem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.FinancialInvoiceISOArchive
 * FinancialInvoiceISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FinInvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesInitiationLatestVersion
 * TradeServicesInitiationLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsin.004.001.01}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInvoiceV01", propOrder = {"invoiceHeader", "tradeAgreement", "tradeDelivery", "tradeSettlement", "lineItem"})
public class FinancialInvoiceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InvcHdr", required = true)
	protected InvoiceHeader1 invoiceHeader;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<FinancialInvoiceV01, InvoiceHeader1> mmInvoiceHeader = new MMMessageBuildingBlock<FinancialInvoiceV01, InvoiceHeader1>() {
		{
			xmlTag = "InvcHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceHeader";
			definition = "Collection of data that is exchanged between two or more parties in written, printed or electronic form. It contains general data relevant to the main body of the invoice such as date of issue, currency code and identification number.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InvoiceHeader1.mmObject();
		}

		@Override
		public InvoiceHeader1 getValue(FinancialInvoiceV01 obj) {
			return obj.getInvoiceHeader();
		}

		@Override
		public void setValue(FinancialInvoiceV01 obj, InvoiceHeader1 value) {
			obj.setInvoiceHeader(value);
		}
	};
	@XmlElement(name = "TradAgrmt", required = true)
	protected TradeAgreement6 tradeAgreement;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<FinancialInvoiceV01, TradeAgreement6> mmTradeAgreement = new MMMessageBuildingBlock<FinancialInvoiceV01, TradeAgreement6>() {
		{
			xmlTag = "TradAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAgreement";
			definition = "Commercial information such as terms of commerce, parties, and documentation, related to the trading agreement under which this invoice is issued.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeAgreement6.mmObject();
		}

		@Override
		public TradeAgreement6 getValue(FinancialInvoiceV01 obj) {
			return obj.getTradeAgreement();
		}

		@Override
		public void setValue(FinancialInvoiceV01 obj, TradeAgreement6 value) {
			obj.setTradeAgreement(value);
		}
	};
	@XmlElement(name = "TradDlvry", required = true)
	protected TradeDelivery1 tradeDelivery;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<FinancialInvoiceV01, TradeDelivery1> mmTradeDelivery = new MMMessageBuildingBlock<FinancialInvoiceV01, TradeDelivery1>() {
		{
			xmlTag = "TradDlvry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDelivery";
			definition = "Supply chain shipping arrangements for delivery of invoiced products and/or services.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeDelivery1.mmObject();
		}

		@Override
		public TradeDelivery1 getValue(FinancialInvoiceV01 obj) {
			return obj.getTradeDelivery();
		}

		@Override
		public void setValue(FinancialInvoiceV01 obj, TradeDelivery1 value) {
			obj.setTradeDelivery(value);
		}
	};
	@XmlElement(name = "TradSttlm", required = true)
	protected TradeSettlement1 tradeSettlement;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<FinancialInvoiceV01, TradeSettlement1> mmTradeSettlement = new MMMessageBuildingBlock<FinancialInvoiceV01, TradeSettlement1>() {
		{
			xmlTag = "TradSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeSettlement";
			definition = "Settlement information that enables the financial reconciliation and payment of this invoice.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeSettlement1.mmObject();
		}

		@Override
		public TradeSettlement1 getValue(FinancialInvoiceV01 obj) {
			return obj.getTradeSettlement();
		}

		@Override
		public void setValue(FinancialInvoiceV01 obj, TradeSettlement1 value) {
			obj.setTradeSettlement(value);
		}
	};
	@XmlElement(name = "LineItm")
	protected List<LineItem10> lineItem;
	/**
	 * 
	 <p>
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
	 * "Unit of information in this invoice showning the related provision of products and/or services and monetary summations reported as a discrete line item.\r\n\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<FinancialInvoiceV01, List<LineItem10>> mmLineItem = new MMMessageBuildingBlock<FinancialInvoiceV01, List<LineItem10>>() {
		{
			xmlTag = "LineItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItem";
			definition = "Unit of information in this invoice showning the related provision of products and/or services and monetary summations reported as a discrete line item.\r\n\r\n\r\n";
			minOccurs = 0;
			complexType_lazy = () -> LineItem10.mmObject();
		}

		@Override
		public List<LineItem10> getValue(FinancialInvoiceV01 obj) {
			return obj.getLineItem();
		}

		@Override
		public void setValue(FinancialInvoiceV01 obj, List<LineItem10> value) {
			obj.setLineItem(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInvoiceV01";
				definition = "Scope\r\nThe FinancialInvoice message is used to support the provision of financial and related services where there is a requirement to exchange invoice information.\r\nUsage\r\nWhile the prime function of the FinancialInvoice message is as a request from the seller to the buyer for payment, the FinancialInvoice message can also serve to evidence an invoice in support of a financial service such as invoice factoring, letters of credit, and bank payment obligations, to enable Web based services such as electronic bill payment and presentment, and as the basis to transfer invoice information via third parties such as e-invoicing service providers.\r\nA consequence of the receipt of an invoice by the buyer is that it acts as a trigger for the use of related messages that are already defined in ISO 20022, notably where the information contained in the Financial Invoice enables payment for the goods or services received, and/or is provided in support of a request for invoice financing. While certain of these related messages, such as the CreditTransfer and PaymentInitiation messages, are shown in the sequence diagram they are out of scope. They are shown only to illustrate a given scenario and to place the invoice in the context of the financial banking processes that might be conducted between different financial institutions.\r\nThe use of self-billing by the buyer to the seller, where the buyer acts as the invoice issuer or the process of handling an incorrect invoice, is not in scope.";
				messageSet_lazy = () -> Arrays.asList(FinancialInvoiceISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "FinInvc";
				businessArea_lazy = () -> TradeServicesInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsin.FinancialInvoiceV01.mmInvoiceHeader, com.tools20022.repository.area.tsin.FinancialInvoiceV01.mmTradeAgreement,
						com.tools20022.repository.area.tsin.FinancialInvoiceV01.mmTradeDelivery, com.tools20022.repository.area.tsin.FinancialInvoiceV01.mmTradeSettlement, com.tools20022.repository.area.tsin.FinancialInvoiceV01.mmLineItem);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsin";
						messageFunctionality = "004";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return FinancialInvoiceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public InvoiceHeader1 getInvoiceHeader() {
		return invoiceHeader;
	}

	public FinancialInvoiceV01 setInvoiceHeader(InvoiceHeader1 invoiceHeader) {
		this.invoiceHeader = Objects.requireNonNull(invoiceHeader);
		return this;
	}

	public TradeAgreement6 getTradeAgreement() {
		return tradeAgreement;
	}

	public FinancialInvoiceV01 setTradeAgreement(TradeAgreement6 tradeAgreement) {
		this.tradeAgreement = Objects.requireNonNull(tradeAgreement);
		return this;
	}

	public TradeDelivery1 getTradeDelivery() {
		return tradeDelivery;
	}

	public FinancialInvoiceV01 setTradeDelivery(TradeDelivery1 tradeDelivery) {
		this.tradeDelivery = Objects.requireNonNull(tradeDelivery);
		return this;
	}

	public TradeSettlement1 getTradeSettlement() {
		return tradeSettlement;
	}

	public FinancialInvoiceV01 setTradeSettlement(TradeSettlement1 tradeSettlement) {
		this.tradeSettlement = Objects.requireNonNull(tradeSettlement);
		return this;
	}

	public List<LineItem10> getLineItem() {
		return lineItem == null ? lineItem = new ArrayList<>() : lineItem;
	}

	public FinancialInvoiceV01 setLineItem(List<LineItem10> lineItem) {
		this.lineItem = Objects.requireNonNull(lineItem);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.004.001.01")
	static public class Document {
		@XmlElement(name = "FinInvc", required = true)
		public FinancialInvoiceV01 messageBody;
	}
}