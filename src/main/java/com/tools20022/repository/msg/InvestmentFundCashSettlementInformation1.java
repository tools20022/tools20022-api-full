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
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Settlement instructions to be used to transfer cash from the Debtor to the
 * Creditor.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1#mmSubscriptionPaymentInstrument
 * InvestmentFundCashSettlementInformation1.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1#mmRedemptionPaymentInstrument
 * InvestmentFundCashSettlementInformation1.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1#mmDividendPaymentInstrument
 * InvestmentFundCashSettlementInformation1.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1#mmSavingsPlanPaymentInstrument
 * InvestmentFundCashSettlementInformation1.mmSavingsPlanPaymentInstrument}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundCashSettlementInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Settlement instructions to be used to transfer cash from the Debtor to the Creditor.\n"
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InvestmentFundCashSettlementInformation1", propOrder = {"subscriptionPaymentInstrument", "redemptionPaymentInstrument", "dividendPaymentInstrument", "savingsPlanPaymentInstrument"})
public class InvestmentFundCashSettlementInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentInstrument7 subscriptionPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for a subscription payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument7
	 * PaymentInstrument7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1
	 * InvestmentFundCashSettlementInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbcptPmtInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubscriptionPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a subscription payment.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubscriptionPaymentInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> InvestmentFundCashSettlementInformation1.mmObject();
			isDerived = false;
			xmlTag = "SbcptPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a subscription payment.\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentInstrument7.mmObject();
		}
	};
	protected PaymentInstrument6 redemptionPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for a redemption payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument6
	 * PaymentInstrument6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1
	 * InvestmentFundCashSettlementInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RedPmtInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a redemption payment.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRedemptionPaymentInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> InvestmentFundCashSettlementInformation1.mmObject();
			isDerived = false;
			xmlTag = "RedPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a redemption payment.\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentInstrument6.mmObject();
		}
	};
	protected PaymentInstrument6 dividendPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for a dividend payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument6
	 * PaymentInstrument6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1
	 * InvestmentFundCashSettlementInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddPmtInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a dividend payment.\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDividendPaymentInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> InvestmentFundCashSettlementInformation1.mmObject();
			isDerived = false;
			xmlTag = "DvddPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a dividend payment.\n";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentInstrument6.mmObject();
		}
	};
	protected PaymentInstrument7 savingsPlanPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for a savings plan payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstrument7
	 * PaymentInstrument7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation1
	 * InvestmentFundCashSettlementInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SvgsPlanPmtInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SavingsPlanPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a savings plan payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSavingsPlanPaymentInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> InvestmentFundCashSettlementInformation1.mmObject();
			isDerived = false;
			xmlTag = "SvgsPlanPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsPlanPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a savings plan payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentInstrument7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InvestmentFundCashSettlementInformation1.mmSubscriptionPaymentInstrument, InvestmentFundCashSettlementInformation1.mmRedemptionPaymentInstrument,
						InvestmentFundCashSettlementInformation1.mmDividendPaymentInstrument, InvestmentFundCashSettlementInformation1.mmSavingsPlanPaymentInstrument);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "InvestmentFundCashSettlementInformation1";
				definition = "Settlement instructions to be used to transfer cash from the Debtor to the Creditor.\n";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SbcptPmtInstrm")
	public PaymentInstrument7 getSubscriptionPaymentInstrument() {
		return subscriptionPaymentInstrument;
	}

	public void setSubscriptionPaymentInstrument(com.tools20022.repository.msg.PaymentInstrument7 subscriptionPaymentInstrument) {
		this.subscriptionPaymentInstrument = subscriptionPaymentInstrument;
	}

	@XmlElement(name = "RedPmtInstrm")
	public PaymentInstrument6 getRedemptionPaymentInstrument() {
		return redemptionPaymentInstrument;
	}

	public void setRedemptionPaymentInstrument(com.tools20022.repository.msg.PaymentInstrument6 redemptionPaymentInstrument) {
		this.redemptionPaymentInstrument = redemptionPaymentInstrument;
	}

	@XmlElement(name = "DvddPmtInstrm")
	public PaymentInstrument6 getDividendPaymentInstrument() {
		return dividendPaymentInstrument;
	}

	public void setDividendPaymentInstrument(com.tools20022.repository.msg.PaymentInstrument6 dividendPaymentInstrument) {
		this.dividendPaymentInstrument = dividendPaymentInstrument;
	}

	@XmlElement(name = "SvgsPlanPmtInstrm")
	public PaymentInstrument7 getSavingsPlanPaymentInstrument() {
		return savingsPlanPaymentInstrument;
	}

	public void setSavingsPlanPaymentInstrument(com.tools20022.repository.msg.PaymentInstrument7 savingsPlanPaymentInstrument) {
		this.savingsPlanPaymentInstrument = savingsPlanPaymentInstrument;
	}
}