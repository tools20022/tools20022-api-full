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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01;
import com.tools20022.repository.area.tsmt.IntentToPayNotificationV01;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Specifies the details of an intention to pay based on purchase orders or
 * commercial invoice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntentToPay1#mmByPurchaseOrderOrByCommercialInvoiceRule
 * IntentToPay1.mmByPurchaseOrderOrByCommercialInvoiceRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntentToPay1#mmByPurchaseOrder
 * IntentToPay1.mmByPurchaseOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntentToPay1#mmByCommercialInvoice
 * IntentToPay1.mmByCommercialInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntentToPay1#mmExpectedPaymentDate
 * IntentToPay1.mmExpectedPaymentDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntentToPay1#mmSettlementTerms
 * IntentToPay1.mmSettlementTerms}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.IntentToPayNotificationV01#mmIntentToPay
 * IntentToPayNotificationV01.mmIntentToPay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.ForwardIntentToPayNotificationV01#mmIntentToPay
 * ForwardIntentToPayNotificationV01.mmIntentToPay}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntentToPay1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the details of an intention to pay based on purchase orders or commercial invoice."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntentToPay2 IntentToPay2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class IntentToPay1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ReportLine3 byPurchaseOrder;
	/**
	 * The intention to pay is based on a purchase order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReportLine3
	 * ReportLine3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntentToPay1 IntentToPay1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ByPurchsOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ByPurchaseOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The intention to pay is based on a purchase order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmByPurchaseOrder = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IntentToPay1.mmObject();
			isDerived = false;
			xmlTag = "ByPurchsOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ByPurchaseOrder";
			definition = "The intention to pay is based on a purchase order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReportLine3.mmObject();
		}
	};
	protected ReportLine4 byCommercialInvoice;
	/**
	 * The intention to pay is based on a commercial invoice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReportLine4
	 * ReportLine4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntentToPay1 IntentToPay1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ByComrclInvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ByCommercialInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The intention to pay is based on a commercial invoice."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmByCommercialInvoice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IntentToPay1.mmObject();
			isDerived = false;
			xmlTag = "ByComrclInvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ByCommercialInvoice";
			definition = "The intention to pay is based on a commercial invoice.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReportLine4.mmObject();
		}
	};
	protected ISODate expectedPaymentDate;
	/**
	 * Date at which the payment would be effected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntentToPay1 IntentToPay1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpctdPmtDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date at which the payment would be effected."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntentToPay2#mmExpectedPaymentDate
	 * IntentToPay2.mmExpectedPaymentDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExpectedPaymentDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> IntentToPay1.mmObject();
			isDerived = false;
			xmlTag = "XpctdPmtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedPaymentDate";
			definition = "Date at which the payment would be effected.";
			nextVersions_lazy = () -> Arrays.asList(IntentToPay2.mmExpectedPaymentDate);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected SettlementTerms2 settlementTerms;
	/**
	 * Specifies the beneficiary's account information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementTerms2
	 * SettlementTerms2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction#mmSettlementInstruction
	 * PaymentInstruction.mmSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntentToPay1 IntentToPay1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTerms"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the beneficiary's account information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntentToPay2#mmSettlementTerms
	 * IntentToPay2.mmSettlementTerms}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTerms = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentInstruction.mmSettlementInstruction;
			componentContext_lazy = () -> IntentToPay1.mmObject();
			isDerived = false;
			xmlTag = "SttlmTerms";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTerms";
			definition = "Specifies the beneficiary's account information.";
			nextVersions_lazy = () -> Arrays.asList(IntentToPay2.mmSettlementTerms);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementTerms2.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.IntentToPay1 IntentToPay1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntentToPay1#mmByPurchaseOrder
	 * IntentToPay1.mmByPurchaseOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntentToPay1#mmByCommercialInvoice
	 * IntentToPay1.mmByCommercialInvoice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ByPurchaseOrderOrByCommercialInvoiceRule"</li>
	 * </ul>
	 */
	public static final MMXor mmByPurchaseOrderOrByCommercialInvoiceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ByPurchaseOrderOrByCommercialInvoiceRule";
			messageComponent_lazy = () -> IntentToPay1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(IntentToPay1.mmByPurchaseOrder, IntentToPay1.mmByCommercialInvoice);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IntentToPay1.mmByPurchaseOrder, IntentToPay1.mmByCommercialInvoice, IntentToPay1.mmExpectedPaymentDate, IntentToPay1.mmSettlementTerms);
				messageBuildingBlock_lazy = () -> Arrays.asList(IntentToPayNotificationV01.mmIntentToPay, ForwardIntentToPayNotificationV01.mmIntentToPay);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "IntentToPay1";
				definition = "Specifies the details of an intention to pay based on purchase orders or commercial invoice.";
				nextVersions_lazy = () -> Arrays.asList(IntentToPay2.mmObject());
				xors_lazy = () -> Arrays.asList(IntentToPay1.mmByPurchaseOrderOrByCommercialInvoiceRule);
			}
		});
		return mmObject_lazy.get();
	}

	public ReportLine3 getByPurchaseOrder() {
		return byPurchaseOrder;
	}

	public void setByPurchaseOrder(com.tools20022.repository.msg.ReportLine3 byPurchaseOrder) {
		this.byPurchaseOrder = byPurchaseOrder;
	}

	public ReportLine4 getByCommercialInvoice() {
		return byCommercialInvoice;
	}

	public void setByCommercialInvoice(com.tools20022.repository.msg.ReportLine4 byCommercialInvoice) {
		this.byCommercialInvoice = byCommercialInvoice;
	}

	public ISODate getExpectedPaymentDate() {
		return expectedPaymentDate;
	}

	public void setExpectedPaymentDate(ISODate expectedPaymentDate) {
		this.expectedPaymentDate = expectedPaymentDate;
	}

	public SettlementTerms2 getSettlementTerms() {
		return settlementTerms;
	}

	public void setSettlementTerms(com.tools20022.repository.msg.SettlementTerms2 settlementTerms) {
		this.settlementTerms = settlementTerms;
	}
}