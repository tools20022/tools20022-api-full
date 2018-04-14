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
import com.tools20022.repository.choice.PremiumQuote1Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PremiumCalculation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Commercial agreement in which the buyer agrees to pay the seller an amount of
 * cash. Some aspects of the payment may be defined in the agreement, for
 * example, the method of the payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount3#mmPremiumQuote
 * PremiumAmount3.mmPremiumQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PremiumAmount3#mmPremiumCurrency
 * PremiumAmount3.mmPremiumCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount3#mmAmount
 * PremiumAmount3.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PremiumAmount3#mmDecimalPlaces
 * PremiumAmount3.mmDecimalPlaces}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PremiumAmount3#mmPremiumSettlementDate
 * PremiumAmount3.mmPremiumSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PremiumAmount3#mmPayerPartyReference
 * PremiumAmount3.mmPayerPartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PremiumAmount3#mmReceiverPartyReference
 * PremiumAmount3.mmReceiverPartyReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PremiumCalculation
 * PremiumCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PremiumAmount3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Commercial agreement in which the buyer agrees to pay the seller an amount of cash. Some aspects of the payment may be defined in the agreement, for example, the method of the payment."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PremiumAmount2
 * PremiumAmount2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PremiumAmount3", propOrder = {"premiumQuote", "premiumCurrency", "amount", "decimalPlaces", "premiumSettlementDate", "payerPartyReference", "receiverPartyReference"})
public class PremiumAmount3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrmQt", required = true)
	protected PremiumQuote1Choice premiumQuote;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PremiumQuote1Choice
	 * PremiumQuote1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount3 PremiumAmount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrmQt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the calculation method of the premium amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount2#mmPremiumQuote
	 * PremiumAmount2.mmPremiumQuote}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PremiumAmount3, PremiumQuote1Choice> mmPremiumQuote = new MMMessageAssociationEnd<PremiumAmount3, PremiumQuote1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PremiumAmount3.mmObject();
			isDerived = false;
			xmlTag = "PrmQt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumQuote";
			definition = "Specifies the calculation method of the premium amount.";
			previousVersion_lazy = () -> PremiumAmount2.mmPremiumQuote;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PremiumQuote1Choice.mmObject();
		}

		@Override
		public PremiumQuote1Choice getValue(PremiumAmount3 obj) {
			return obj.getPremiumQuote();
		}

		@Override
		public void setValue(PremiumAmount3 obj, PremiumQuote1Choice value) {
			obj.setPremiumQuote(value);
		}
	};
	@XmlElement(name = "PrmCcy", required = true)
	protected ActiveOrHistoricCurrencyCode premiumCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyOfTransfer
	 * Payment.mmCurrencyOfTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount3 PremiumAmount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrmCcy"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the premium currency in which the option is held. \r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PremiumAmount3, ActiveOrHistoricCurrencyCode> mmPremiumCurrency = new MMMessageAttribute<PremiumAmount3, ActiveOrHistoricCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyOfTransfer;
			componentContext_lazy = () -> com.tools20022.repository.msg.PremiumAmount3.mmObject();
			isDerived = false;
			xmlTag = "PrmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumCurrency";
			definition = "Identification of the premium currency in which the option is held. \r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyCode getValue(PremiumAmount3 obj) {
			return obj.getPremiumCurrency();
		}

		@Override
		public void setValue(PremiumAmount3 obj, ActiveOrHistoricCurrencyCode value) {
			obj.setPremiumCurrency(value);
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected ActiveCurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount3 PremiumAmount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the calculation of the premium amount on the basis of the premium quote and one of the amounts of the underlying foreign exchange trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount2#mmAmount
	 * PremiumAmount2.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PremiumAmount3, ActiveCurrencyAndAmount> mmAmount = new MMMessageAttribute<PremiumAmount3, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PremiumAmount3.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Result of the calculation of the premium amount on the basis of the premium quote and one of the amounts of the underlying foreign exchange trade.";
			previousVersion_lazy = () -> PremiumAmount2.mmAmount;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(PremiumAmount3 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(PremiumAmount3 obj, ActiveCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "DcmlPlcs", required = true)
	protected Number decimalPlaces;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount3 PremiumAmount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DcmlPlcs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecimalPlaces"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of decimal places to which quantities of units/shares are rounded."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PremiumAmount3, Number> mmDecimalPlaces = new MMMessageAttribute<PremiumAmount3, Number>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PremiumAmount3.mmObject();
			isDerived = false;
			xmlTag = "DcmlPlcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecimalPlaces";
			definition = "Number of decimal places to which quantities of units/shares are rounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(PremiumAmount3 obj) {
			return obj.getDecimalPlaces();
		}

		@Override
		public void setValue(PremiumAmount3 obj, Number value) {
			obj.setDecimalPlaces(value);
		}
	};
	@XmlElement(name = "PrmSttlmDt", required = true)
	protected ISODate premiumSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount3 PremiumAmount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrmSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the premium must be settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PremiumAmount3, ISODate> mmPremiumSettlementDate = new MMMessageAttribute<PremiumAmount3, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PremiumAmount3.mmObject();
			isDerived = false;
			xmlTag = "PrmSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumSettlementDate";
			definition = "Date on which the premium must be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(PremiumAmount3 obj) {
			return obj.getPremiumSettlementDate();
		}

		@Override
		public void setValue(PremiumAmount3 obj, ISODate value) {
			obj.setPremiumSettlementDate(value);
		}
	};
	@XmlElement(name = "PyerPtyRef", required = true)
	protected Max35Text payerPartyReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount3 PremiumAmount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PyerPtyRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayerPartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Premium fee payer related information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PremiumAmount3, Max35Text> mmPayerPartyReference = new MMMessageAttribute<PremiumAmount3, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PremiumAmount3.mmObject();
			isDerived = false;
			xmlTag = "PyerPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayerPartyReference";
			definition = "Premium fee payer related information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PremiumAmount3 obj) {
			return obj.getPayerPartyReference();
		}

		@Override
		public void setValue(PremiumAmount3 obj, Max35Text value) {
			obj.setPayerPartyReference(value);
		}
	};
	@XmlElement(name = "RcvrPtyRef", required = true)
	protected Max35Text receiverPartyReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount3 PremiumAmount3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrPtyRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverPartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Premium fee receiver related information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PremiumAmount3, Max35Text> mmReceiverPartyReference = new MMMessageAttribute<PremiumAmount3, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PremiumAmount3.mmObject();
			isDerived = false;
			xmlTag = "RcvrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverPartyReference";
			definition = "Premium fee receiver related information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(PremiumAmount3 obj) {
			return obj.getReceiverPartyReference();
		}

		@Override
		public void setValue(PremiumAmount3 obj, Max35Text value) {
			obj.setReceiverPartyReference(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PremiumAmount3.mmPremiumQuote, com.tools20022.repository.msg.PremiumAmount3.mmPremiumCurrency, com.tools20022.repository.msg.PremiumAmount3.mmAmount,
						com.tools20022.repository.msg.PremiumAmount3.mmDecimalPlaces, com.tools20022.repository.msg.PremiumAmount3.mmPremiumSettlementDate, com.tools20022.repository.msg.PremiumAmount3.mmPayerPartyReference,
						com.tools20022.repository.msg.PremiumAmount3.mmReceiverPartyReference);
				trace_lazy = () -> PremiumCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PremiumAmount3";
				definition = "Commercial agreement in which the buyer agrees to pay the seller an amount of cash. Some aspects of the payment may be defined in the agreement, for example, the method of the payment.";
				previousVersion_lazy = () -> PremiumAmount2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PremiumQuote1Choice getPremiumQuote() {
		return premiumQuote;
	}

	public PremiumAmount3 setPremiumQuote(PremiumQuote1Choice premiumQuote) {
		this.premiumQuote = Objects.requireNonNull(premiumQuote);
		return this;
	}

	public ActiveOrHistoricCurrencyCode getPremiumCurrency() {
		return premiumCurrency;
	}

	public PremiumAmount3 setPremiumCurrency(ActiveOrHistoricCurrencyCode premiumCurrency) {
		this.premiumCurrency = Objects.requireNonNull(premiumCurrency);
		return this;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public PremiumAmount3 setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public Number getDecimalPlaces() {
		return decimalPlaces;
	}

	public PremiumAmount3 setDecimalPlaces(Number decimalPlaces) {
		this.decimalPlaces = Objects.requireNonNull(decimalPlaces);
		return this;
	}

	public ISODate getPremiumSettlementDate() {
		return premiumSettlementDate;
	}

	public PremiumAmount3 setPremiumSettlementDate(ISODate premiumSettlementDate) {
		this.premiumSettlementDate = Objects.requireNonNull(premiumSettlementDate);
		return this;
	}

	public Max35Text getPayerPartyReference() {
		return payerPartyReference;
	}

	public PremiumAmount3 setPayerPartyReference(Max35Text payerPartyReference) {
		this.payerPartyReference = Objects.requireNonNull(payerPartyReference);
		return this;
	}

	public Max35Text getReceiverPartyReference() {
		return receiverPartyReference;
	}

	public PremiumAmount3 setReceiverPartyReference(Max35Text receiverPartyReference) {
		this.receiverPartyReference = Objects.requireNonNull(receiverPartyReference);
		return this;
	}
}