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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PaymentInstrument18Choice;
import com.tools20022.repository.choice.PaymentInstrument19Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.PercentageBoundedRate;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.entity.Dividend;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Instrument used to process a payment instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmSettlementCurrency
 * PaymentInstrument13.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmDividendPercentage
 * PaymentInstrument13.mmDividendPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmSubscriptionPaymentInstrument
 * PaymentInstrument13.mmSubscriptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmRedemptionPaymentInstrument
 * PaymentInstrument13.mmRedemptionPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmDividendPaymentInstrument
 * PaymentInstrument13.mmDividendPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmSavingsPlanPaymentInstrument
 * PaymentInstrument13.mmSavingsPlanPaymentInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13#mmInterestPaymentInstrument
 * PaymentInstrument13.mmInterestPaymentInstrument}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentInstrument13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Instrument used to process a payment instruction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PaymentInstrument13", propOrder = {"settlementCurrency", "dividendPercentage", "subscriptionPaymentInstrument", "redemptionPaymentInstrument", "dividendPaymentInstrument", "savingsPlanPaymentInstrument",
		"interestPaymentInstrument"})
public class PaymentInstrument13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveCurrencyCode settlementCurrency;
	/**
	 * Currency associated with the payment instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmTargetCurrency
	 * CurrencyExchange.mmTargetCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13
	 * PaymentInstrument13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency associated with the payment instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmTargetCurrency;
			componentContext_lazy = () -> PaymentInstrument13.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency associated with the payment instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	protected PercentageBoundedRate dividendPercentage;
	/**
	 * Percentage of the dividend payment not to be reinvested, that is, to be
	 * paid in cash.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageBoundedRate
	 * PercentageBoundedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmAnnualTotalDividendRate
	 * Dividend.mmAnnualTotalDividendRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13
	 * PaymentInstrument13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DvddPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the dividend payment not to be reinvested, that is, to be paid in cash."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDividendPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmAnnualTotalDividendRate;
			componentContext_lazy = () -> PaymentInstrument13.mmObject();
			isDerived = false;
			xmlTag = "DvddPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage";
			definition = "Percentage of the dividend payment not to be reinvested, that is, to be paid in cash.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageBoundedRate.mmObject();
		}
	};
	protected PaymentInstrument18Choice subscriptionPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for a subscription payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice
	 * PaymentInstrument18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13
	 * PaymentInstrument13}</li>
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
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a subscription payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubscriptionPaymentInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> PaymentInstrument13.mmObject();
			isDerived = false;
			xmlTag = "SbcptPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubscriptionPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a subscription payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstrument18Choice.mmObject();
		}
	};
	protected PaymentInstrument19Choice redemptionPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for a redemption payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument19Choice
	 * PaymentInstrument19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13
	 * PaymentInstrument13}</li>
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
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a redemption payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRedemptionPaymentInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> PaymentInstrument13.mmObject();
			isDerived = false;
			xmlTag = "RedPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a redemption payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstrument19Choice.mmObject();
		}
	};
	protected PaymentInstrument19Choice dividendPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for a dividend payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument19Choice
	 * PaymentInstrument19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13
	 * PaymentInstrument13}</li>
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
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for a dividend payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDividendPaymentInstrument = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> PaymentInstrument13.mmObject();
			isDerived = false;
			xmlTag = "DvddPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a dividend payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstrument19Choice.mmObject();
		}
	};
	protected PaymentInstrument18Choice savingsPlanPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for a savings plan payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument18Choice
	 * PaymentInstrument18Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13
	 * PaymentInstrument13}</li>
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
			componentContext_lazy = () -> PaymentInstrument13.mmObject();
			isDerived = false;
			xmlTag = "SvgsPlanPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SavingsPlanPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for a savings plan payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PaymentInstrument18Choice.mmObject();
		}
	};
	protected PaymentInstrument19Choice interestPaymentInstrument;
	/**
	 * Instrument that has or represents monetary value and is used to process a
	 * payment instruction for an interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PaymentInstrument19Choice
	 * PaymentInstrument19Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment Payment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PaymentInstrument13
	 * PaymentInstrument13}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmtInstrm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instrument that has or represents monetary value and is used to process a payment instruction for an interest payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestPaymentInstrument = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> PaymentInstrument13.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for an interest payment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PaymentInstrument19Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PaymentInstrument13.mmSettlementCurrency, PaymentInstrument13.mmDividendPercentage, PaymentInstrument13.mmSubscriptionPaymentInstrument,
						PaymentInstrument13.mmRedemptionPaymentInstrument, PaymentInstrument13.mmDividendPaymentInstrument, PaymentInstrument13.mmSavingsPlanPaymentInstrument, PaymentInstrument13.mmInterestPaymentInstrument);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstrument13";
				definition = "Instrument used to process a payment instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttlmCcy", required = true)
	public ActiveCurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(ActiveCurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	@XmlElement(name = "DvddPctg")
	public PercentageBoundedRate getDividendPercentage() {
		return dividendPercentage;
	}

	public void setDividendPercentage(PercentageBoundedRate dividendPercentage) {
		this.dividendPercentage = dividendPercentage;
	}

	@XmlElement(name = "SbcptPmtInstrm")
	public PaymentInstrument18Choice getSubscriptionPaymentInstrument() {
		return subscriptionPaymentInstrument;
	}

	public void setSubscriptionPaymentInstrument(PaymentInstrument18Choice subscriptionPaymentInstrument) {
		this.subscriptionPaymentInstrument = subscriptionPaymentInstrument;
	}

	@XmlElement(name = "RedPmtInstrm")
	public PaymentInstrument19Choice getRedemptionPaymentInstrument() {
		return redemptionPaymentInstrument;
	}

	public void setRedemptionPaymentInstrument(PaymentInstrument19Choice redemptionPaymentInstrument) {
		this.redemptionPaymentInstrument = redemptionPaymentInstrument;
	}

	@XmlElement(name = "DvddPmtInstrm")
	public PaymentInstrument19Choice getDividendPaymentInstrument() {
		return dividendPaymentInstrument;
	}

	public void setDividendPaymentInstrument(PaymentInstrument19Choice dividendPaymentInstrument) {
		this.dividendPaymentInstrument = dividendPaymentInstrument;
	}

	@XmlElement(name = "SvgsPlanPmtInstrm")
	public PaymentInstrument18Choice getSavingsPlanPaymentInstrument() {
		return savingsPlanPaymentInstrument;
	}

	public void setSavingsPlanPaymentInstrument(PaymentInstrument18Choice savingsPlanPaymentInstrument) {
		this.savingsPlanPaymentInstrument = savingsPlanPaymentInstrument;
	}

	@XmlElement(name = "IntrstPmtInstrm")
	public PaymentInstrument19Choice getInterestPaymentInstrument() {
		return interestPaymentInstrument;
	}

	public void setInterestPaymentInstrument(PaymentInstrument19Choice interestPaymentInstrument) {
		this.interestPaymentInstrument = interestPaymentInstrument;
	}
}