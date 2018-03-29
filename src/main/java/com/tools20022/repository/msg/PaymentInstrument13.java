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
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PaymentInstrument13", propOrder = {"settlementCurrency", "dividendPercentage", "subscriptionPaymentInstrument", "redemptionPaymentInstrument", "dividendPaymentInstrument", "savingsPlanPaymentInstrument",
		"interestPaymentInstrument"})
public class PaymentInstrument13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttlmCcy", required = true)
	protected ActiveCurrencyCode settlementCurrency;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<PaymentInstrument13, ActiveCurrencyCode> mmSettlementCurrency = new MMMessageAttribute<PaymentInstrument13, ActiveCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmTargetCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstrument13.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency associated with the payment instrument.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(PaymentInstrument13 obj) {
			return obj.getSettlementCurrency();
		}

		@Override
		public void setValue(PaymentInstrument13 obj, ActiveCurrencyCode value) {
			obj.setSettlementCurrency(value);
		}
	};
	@XmlElement(name = "DvddPctg")
	protected PercentageBoundedRate dividendPercentage;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<PaymentInstrument13, Optional<PercentageBoundedRate>> mmDividendPercentage = new MMMessageAttribute<PaymentInstrument13, Optional<PercentageBoundedRate>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmAnnualTotalDividendRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstrument13.mmObject();
			isDerived = false;
			xmlTag = "DvddPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendPercentage";
			definition = "Percentage of the dividend payment not to be reinvested, that is, to be paid in cash.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageBoundedRate.mmObject();
		}

		@Override
		public Optional<PercentageBoundedRate> getValue(PaymentInstrument13 obj) {
			return obj.getDividendPercentage();
		}

		@Override
		public void setValue(PaymentInstrument13 obj, Optional<PercentageBoundedRate> value) {
			obj.setDividendPercentage(value.orElse(null));
		}
	};
	@XmlElement(name = "SbcptPmtInstrm")
	protected PaymentInstrument18Choice subscriptionPaymentInstrument;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<PaymentInstrument13, Optional<PaymentInstrument18Choice>> mmSubscriptionPaymentInstrument = new MMMessageAssociationEnd<PaymentInstrument13, Optional<PaymentInstrument18Choice>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstrument13.mmObject();
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

		@Override
		public Optional<PaymentInstrument18Choice> getValue(PaymentInstrument13 obj) {
			return obj.getSubscriptionPaymentInstrument();
		}

		@Override
		public void setValue(PaymentInstrument13 obj, Optional<PaymentInstrument18Choice> value) {
			obj.setSubscriptionPaymentInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "RedPmtInstrm")
	protected PaymentInstrument19Choice redemptionPaymentInstrument;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<PaymentInstrument13, Optional<PaymentInstrument19Choice>> mmRedemptionPaymentInstrument = new MMMessageAssociationEnd<PaymentInstrument13, Optional<PaymentInstrument19Choice>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstrument13.mmObject();
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

		@Override
		public Optional<PaymentInstrument19Choice> getValue(PaymentInstrument13 obj) {
			return obj.getRedemptionPaymentInstrument();
		}

		@Override
		public void setValue(PaymentInstrument13 obj, Optional<PaymentInstrument19Choice> value) {
			obj.setRedemptionPaymentInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "DvddPmtInstrm")
	protected PaymentInstrument19Choice dividendPaymentInstrument;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<PaymentInstrument13, Optional<PaymentInstrument19Choice>> mmDividendPaymentInstrument = new MMMessageAssociationEnd<PaymentInstrument13, Optional<PaymentInstrument19Choice>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstrument13.mmObject();
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

		@Override
		public Optional<PaymentInstrument19Choice> getValue(PaymentInstrument13 obj) {
			return obj.getDividendPaymentInstrument();
		}

		@Override
		public void setValue(PaymentInstrument13 obj, Optional<PaymentInstrument19Choice> value) {
			obj.setDividendPaymentInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "SvgsPlanPmtInstrm")
	protected PaymentInstrument18Choice savingsPlanPaymentInstrument;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<PaymentInstrument13, Optional<PaymentInstrument18Choice>> mmSavingsPlanPaymentInstrument = new MMMessageAssociationEnd<PaymentInstrument13, Optional<PaymentInstrument18Choice>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstrument13.mmObject();
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

		@Override
		public Optional<PaymentInstrument18Choice> getValue(PaymentInstrument13 obj) {
			return obj.getSavingsPlanPaymentInstrument();
		}

		@Override
		public void setValue(PaymentInstrument13 obj, Optional<PaymentInstrument18Choice> value) {
			obj.setSavingsPlanPaymentInstrument(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstPmtInstrm")
	protected PaymentInstrument19Choice interestPaymentInstrument;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<PaymentInstrument13, Optional<PaymentInstrument19Choice>> mmInterestPaymentInstrument = new MMMessageAttribute<PaymentInstrument13, Optional<PaymentInstrument19Choice>>() {
		{
			businessComponentTrace_lazy = () -> Payment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PaymentInstrument13.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmtInstrm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentInstrument";
			definition = "Instrument that has or represents monetary value and is used to process a payment instruction for an interest payment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PaymentInstrument19Choice.mmObject();
		}

		@Override
		public Optional<PaymentInstrument19Choice> getValue(PaymentInstrument13 obj) {
			return obj.getInterestPaymentInstrument();
		}

		@Override
		public void setValue(PaymentInstrument13 obj, Optional<PaymentInstrument19Choice> value) {
			obj.setInterestPaymentInstrument(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PaymentInstrument13.mmSettlementCurrency, com.tools20022.repository.msg.PaymentInstrument13.mmDividendPercentage,
						com.tools20022.repository.msg.PaymentInstrument13.mmSubscriptionPaymentInstrument, com.tools20022.repository.msg.PaymentInstrument13.mmRedemptionPaymentInstrument,
						com.tools20022.repository.msg.PaymentInstrument13.mmDividendPaymentInstrument, com.tools20022.repository.msg.PaymentInstrument13.mmSavingsPlanPaymentInstrument,
						com.tools20022.repository.msg.PaymentInstrument13.mmInterestPaymentInstrument);
				trace_lazy = () -> Payment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstrument13";
				definition = "Instrument used to process a payment instruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveCurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public PaymentInstrument13 setSettlementCurrency(ActiveCurrencyCode settlementCurrency) {
		this.settlementCurrency = Objects.requireNonNull(settlementCurrency);
		return this;
	}

	public Optional<PercentageBoundedRate> getDividendPercentage() {
		return dividendPercentage == null ? Optional.empty() : Optional.of(dividendPercentage);
	}

	public PaymentInstrument13 setDividendPercentage(PercentageBoundedRate dividendPercentage) {
		this.dividendPercentage = dividendPercentage;
		return this;
	}

	public Optional<PaymentInstrument18Choice> getSubscriptionPaymentInstrument() {
		return subscriptionPaymentInstrument == null ? Optional.empty() : Optional.of(subscriptionPaymentInstrument);
	}

	public PaymentInstrument13 setSubscriptionPaymentInstrument(PaymentInstrument18Choice subscriptionPaymentInstrument) {
		this.subscriptionPaymentInstrument = subscriptionPaymentInstrument;
		return this;
	}

	public Optional<PaymentInstrument19Choice> getRedemptionPaymentInstrument() {
		return redemptionPaymentInstrument == null ? Optional.empty() : Optional.of(redemptionPaymentInstrument);
	}

	public PaymentInstrument13 setRedemptionPaymentInstrument(PaymentInstrument19Choice redemptionPaymentInstrument) {
		this.redemptionPaymentInstrument = redemptionPaymentInstrument;
		return this;
	}

	public Optional<PaymentInstrument19Choice> getDividendPaymentInstrument() {
		return dividendPaymentInstrument == null ? Optional.empty() : Optional.of(dividendPaymentInstrument);
	}

	public PaymentInstrument13 setDividendPaymentInstrument(PaymentInstrument19Choice dividendPaymentInstrument) {
		this.dividendPaymentInstrument = dividendPaymentInstrument;
		return this;
	}

	public Optional<PaymentInstrument18Choice> getSavingsPlanPaymentInstrument() {
		return savingsPlanPaymentInstrument == null ? Optional.empty() : Optional.of(savingsPlanPaymentInstrument);
	}

	public PaymentInstrument13 setSavingsPlanPaymentInstrument(PaymentInstrument18Choice savingsPlanPaymentInstrument) {
		this.savingsPlanPaymentInstrument = savingsPlanPaymentInstrument;
		return this;
	}

	public Optional<PaymentInstrument19Choice> getInterestPaymentInstrument() {
		return interestPaymentInstrument == null ? Optional.empty() : Optional.of(interestPaymentInstrument);
	}

	public PaymentInstrument13 setInterestPaymentInstrument(PaymentInstrument19Choice interestPaymentInstrument) {
		this.interestPaymentInstrument = interestPaymentInstrument;
		return this;
	}
}