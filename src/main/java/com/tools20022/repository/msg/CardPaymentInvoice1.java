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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1#mmInvoiceHeader
 * CardPaymentInvoice1.mmInvoiceHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1#mmTradeAgreement
 * CardPaymentInvoice1.mmTradeAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1#mmTradeDelivery
 * CardPaymentInvoice1.mmTradeDelivery}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentInvoice1#mmLineItem
 * CardPaymentInvoice1.mmLineItem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CommercialTrade
 * CommercialTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentInvoice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Detailed invoice data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentInvoice2
 * CardPaymentInvoice2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CardPaymentInvoice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected InvoiceHeader1 invoiceHeader;
	/**
	 * General data relevant to the main body of the invoice such as date of
	 * issue, currency code and identification number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvoiceHeader1
	 * InvoiceHeader1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1
	 * CardPaymentInvoice1}</li>
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
	 * "General data relevant to the main body of the invoice such as date of issue, currency code and identification number."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2#mmInvoiceHeader
	 * CardPaymentInvoice2.mmInvoiceHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvoiceHeader = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentInvoice1.mmObject();
			isDerived = false;
			xmlTag = "InvcHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvoiceHeader";
			definition = "General data relevant to the main body of the invoice such as date of issue, currency code and identification number.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentInvoice2.mmInvoiceHeader);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvoiceHeader1.mmObject();
		}
	};
	protected TradeAgreement6 tradeAgreement;
	/**
	 * Contractual details related to the agreement between parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeAgreement6
	 * TradeAgreement6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmGoverningDocument
	 * Trade.mmGoverningDocument}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1
	 * CardPaymentInvoice1}</li>
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
	 * "Contractual details related to the agreement between parties."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2#mmTradeAgreement
	 * CardPaymentInvoice2.mmTradeAgreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeAgreement = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmGoverningDocument;
			componentContext_lazy = () -> CardPaymentInvoice1.mmObject();
			isDerived = false;
			xmlTag = "TradAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAgreement";
			definition = "Contractual details related to the agreement between parties.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentInvoice2.mmTradeAgreement);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeAgreement6.mmObject();
		}
	};
	protected TradeDelivery1 tradeDelivery;
	/**
	 * Supply chain shipping arrangements for delivery of invoiced products
	 * and/or services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeDelivery1
	 * TradeDelivery1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTradeSettlement#mmProductDelivery
	 * CommercialTradeSettlement.mmProductDelivery}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1
	 * CardPaymentInvoice1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2#mmTradeDelivery
	 * CardPaymentInvoice2.mmTradeDelivery}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeDelivery = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CommercialTradeSettlement.mmProductDelivery;
			componentContext_lazy = () -> CardPaymentInvoice1.mmObject();
			isDerived = false;
			xmlTag = "TradDlvry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDelivery";
			definition = "Supply chain shipping arrangements for delivery of invoiced products and/or services.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentInvoice2.mmTradeDelivery);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradeDelivery1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.LineItem10> lineItem;
	/**
	 * Unit of information showing the related provision of products and/or
	 * services and monetary summations reported as a discrete line items.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LineItem10 LineItem10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmLineItem
	 * Invoice.mmLineItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice1
	 * CardPaymentInvoice1}</li>
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
	 * "Unit of information showing the related provision of products and/or services and monetary summations reported as a discrete line items."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentInvoice2#mmLineItem
	 * CardPaymentInvoice2.mmLineItem}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLineItem = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Invoice.mmLineItem;
			componentContext_lazy = () -> CardPaymentInvoice1.mmObject();
			isDerived = false;
			xmlTag = "LineItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineItem";
			definition = "Unit of information showing the related provision of products and/or services and monetary summations reported as a discrete line items.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentInvoice2.mmLineItem);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LineItem10.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentInvoice1.mmInvoiceHeader, CardPaymentInvoice1.mmTradeAgreement, CardPaymentInvoice1.mmTradeDelivery, CardPaymentInvoice1.mmLineItem);
				trace_lazy = () -> CommercialTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardPaymentInvoice1";
				definition = "Detailed invoice data.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentInvoice2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public InvoiceHeader1 getInvoiceHeader() {
		return invoiceHeader;
	}

	public void setInvoiceHeader(com.tools20022.repository.msg.InvoiceHeader1 invoiceHeader) {
		this.invoiceHeader = invoiceHeader;
	}

	public TradeAgreement6 getTradeAgreement() {
		return tradeAgreement;
	}

	public void setTradeAgreement(com.tools20022.repository.msg.TradeAgreement6 tradeAgreement) {
		this.tradeAgreement = tradeAgreement;
	}

	public TradeDelivery1 getTradeDelivery() {
		return tradeDelivery;
	}

	public void setTradeDelivery(com.tools20022.repository.msg.TradeDelivery1 tradeDelivery) {
		this.tradeDelivery = tradeDelivery;
	}

	public List<LineItem10> getLineItem() {
		return lineItem;
	}

	public void setLineItem(List<com.tools20022.repository.msg.LineItem10> lineItem) {
		this.lineItem = lineItem;
	}
}