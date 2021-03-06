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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CommercialTrade;
import com.tools20022.repository.entity.CommercialTradeSettlement;
import com.tools20022.repository.entity.Invoice;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InvoiceHeader2;
import com.tools20022.repository.msg.LineItem16;
import com.tools20022.repository.msg.TradeAgreement13;
import com.tools20022.repository.msg.TradeDelivery2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Detailed invoice data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2#mmInvoiceHeader
 * CardPaymentInvoice2.mmInvoiceHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2#mmTradeAgreement
 * CardPaymentInvoice2.mmTradeAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2#mmTradeDelivery
 * CardPaymentInvoice2.mmTradeDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentInvoice2#mmLineItem
 * CardPaymentInvoice2.mmLineItem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CommercialTrade
 * CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentInvoice2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Detailed invoice data."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentInvoice3
 * CardPaymentInvoice3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1
 * CardPaymentInvoice1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardPaymentInvoice2", propOrder = {"invoiceHeader", "tradeAgreement", "tradeDelivery", "lineItem"})
public class CardPaymentInvoice2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InvcHdr", required = true)
	protected InvoiceHeader2 invoiceHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvoiceHeader2
	 * InvoiceHeader2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2
	 * CardPaymentInvoice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvcHdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvoiceHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "General data relevant to the main body of the invoice such as date of issue, currency code and identification number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice3#mmInvoiceHeader
	 * CardPaymentInvoice3.mmInvoiceHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1#mmInvoiceHeader
	 * CardPaymentInvoice1.mmInvoiceHeader}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentInvoice2, InvoiceHeader2> mmInvoiceHeader = new MMMessageAssociationEnd<CardPaymentInvoice2, InvoiceHeader2>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentInvoice2.mmObject();
			isDerived = false;
			xmlTag = "InvcHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceHeader";
			definition = "General data relevant to the main body of the invoice such as date of issue, currency code and identification number.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentInvoice3.mmInvoiceHeader);
			previousVersion_lazy = () -> CardPaymentInvoice1.mmInvoiceHeader;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvoiceHeader2.mmObject();
		}

		@Override
		public InvoiceHeader2 getValue(CardPaymentInvoice2 obj) {
			return obj.getInvoiceHeader();
		}

		@Override
		public void setValue(CardPaymentInvoice2 obj, InvoiceHeader2 value) {
			obj.setInvoiceHeader(value);
		}
	};
	@XmlElement(name = "TradAgrmt", required = true)
	protected TradeAgreement13 tradeAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeAgreement13
	 * TradeAgreement13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmGoverningDocument
	 * Trade.mmGoverningDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2
	 * CardPaymentInvoice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradAgrmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contractual details related to the agreement between parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice3#mmTradeAgreement
	 * CardPaymentInvoice3.mmTradeAgreement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1#mmTradeAgreement
	 * CardPaymentInvoice1.mmTradeAgreement}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentInvoice2, TradeAgreement13> mmTradeAgreement = new MMMessageAssociationEnd<CardPaymentInvoice2, TradeAgreement13>() {
		{
			businessElementTrace_lazy = () -> Trade.mmGoverningDocument;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentInvoice2.mmObject();
			isDerived = false;
			xmlTag = "TradAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAgreement";
			definition = "Contractual details related to the agreement between parties.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentInvoice3.mmTradeAgreement);
			previousVersion_lazy = () -> CardPaymentInvoice1.mmTradeAgreement;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeAgreement13.mmObject();
		}

		@Override
		public TradeAgreement13 getValue(CardPaymentInvoice2 obj) {
			return obj.getTradeAgreement();
		}

		@Override
		public void setValue(CardPaymentInvoice2 obj, TradeAgreement13 value) {
			obj.setTradeAgreement(value);
		}
	};
	@XmlElement(name = "TradDlvry", required = true)
	protected TradeDelivery2 tradeDelivery;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeDelivery2
	 * TradeDelivery2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmProductDelivery
	 * CommercialTradeSettlement.mmProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2
	 * CardPaymentInvoice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDlvry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Supply chain shipping arrangements for delivery of invoiced products and/or services."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice3#mmTradeDelivery
	 * CardPaymentInvoice3.mmTradeDelivery}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1#mmTradeDelivery
	 * CardPaymentInvoice1.mmTradeDelivery}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentInvoice2, TradeDelivery2> mmTradeDelivery = new MMMessageAssociationEnd<CardPaymentInvoice2, TradeDelivery2>() {
		{
			businessElementTrace_lazy = () -> CommercialTradeSettlement.mmProductDelivery;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentInvoice2.mmObject();
			isDerived = false;
			xmlTag = "TradDlvry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDelivery";
			definition = "Supply chain shipping arrangements for delivery of invoiced products and/or services.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentInvoice3.mmTradeDelivery);
			previousVersion_lazy = () -> CardPaymentInvoice1.mmTradeDelivery;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeDelivery2.mmObject();
		}

		@Override
		public TradeDelivery2 getValue(CardPaymentInvoice2 obj) {
			return obj.getTradeDelivery();
		}

		@Override
		public void setValue(CardPaymentInvoice2 obj, TradeDelivery2 value) {
			obj.setTradeDelivery(value);
		}
	};
	@XmlElement(name = "LineItm")
	protected List<LineItem16> lineItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItem16 LineItem16}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
	 * Invoice.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2
	 * CardPaymentInvoice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineItm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unit of information showing the related provision of products and/or services and monetary summations reported as a discrete line items."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice3#mmLineItem
	 * CardPaymentInvoice3.mmLineItem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1#mmLineItem
	 * CardPaymentInvoice1.mmLineItem}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CardPaymentInvoice2, List<LineItem16>> mmLineItem = new MMMessageAssociationEnd<CardPaymentInvoice2, List<LineItem16>>() {
		{
			businessElementTrace_lazy = () -> Invoice.mmLineItem;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardPaymentInvoice2.mmObject();
			isDerived = false;
			xmlTag = "LineItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItem";
			definition = "Unit of information showing the related provision of products and/or services and monetary summations reported as a discrete line items.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentInvoice3.mmLineItem);
			previousVersion_lazy = () -> CardPaymentInvoice1.mmLineItem;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LineItem16.mmObject();
		}

		@Override
		public List<LineItem16> getValue(CardPaymentInvoice2 obj) {
			return obj.getLineItem();
		}

		@Override
		public void setValue(CardPaymentInvoice2 obj, List<LineItem16> value) {
			obj.setLineItem(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardPaymentInvoice2.mmInvoiceHeader, com.tools20022.repository.msg.CardPaymentInvoice2.mmTradeAgreement,
						com.tools20022.repository.msg.CardPaymentInvoice2.mmTradeDelivery, com.tools20022.repository.msg.CardPaymentInvoice2.mmLineItem);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentInvoice2";
				definition = "Detailed invoice data.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentInvoice3.mmObject());
				previousVersion_lazy = () -> CardPaymentInvoice1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public InvoiceHeader2 getInvoiceHeader() {
		return invoiceHeader;
	}

	public CardPaymentInvoice2 setInvoiceHeader(InvoiceHeader2 invoiceHeader) {
		this.invoiceHeader = Objects.requireNonNull(invoiceHeader);
		return this;
	}

	public TradeAgreement13 getTradeAgreement() {
		return tradeAgreement;
	}

	public CardPaymentInvoice2 setTradeAgreement(TradeAgreement13 tradeAgreement) {
		this.tradeAgreement = Objects.requireNonNull(tradeAgreement);
		return this;
	}

	public TradeDelivery2 getTradeDelivery() {
		return tradeDelivery;
	}

	public CardPaymentInvoice2 setTradeDelivery(TradeDelivery2 tradeDelivery) {
		this.tradeDelivery = Objects.requireNonNull(tradeDelivery);
		return this;
	}

	public List<LineItem16> getLineItem() {
		return lineItem == null ? lineItem = new ArrayList<>() : lineItem;
	}

	public CardPaymentInvoice2 setLineItem(List<LineItem16> lineItem) {
		this.lineItem = Objects.requireNonNull(lineItem);
		return this;
	}
}