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
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Commercial agreement in which the buyer agrees to pay the seller an amount of
 * cash. Some aspects of the payment may be defined in the agreement, for
 * example, the method of the payment
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PremiumAmount3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Commercial agreement in which the buyer agrees to pay the seller an amount of cash. Some aspects of the payment may be defined in the agreement, for example, the method of the payment"
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.PremiumAmount2
 * PremiumAmount2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PremiumAmount3", propOrder = {"premiumQuote", "premiumCurrency", "amount", "decimalPlaces", "premiumSettlementDate", "payerPartyReference", "receiverPartyReference"})
public class PremiumAmount3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PremiumQuote1Choice premiumQuote;
	/**
	 * Specifies the calculation method of the premium amount.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the calculation method of the premium amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount2#mmPremiumQuote
	 * PremiumAmount2.mmPremiumQuote}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPremiumQuote = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PremiumAmount3.mmObject();
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
	};
	protected ActiveOrHistoricCurrencyCode premiumCurrency;
	/**
	 * Identification of the premium currency in which the option is held. <br>
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the premium currency in which the option is held. \r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPremiumCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyOfTransfer;
			componentContext_lazy = () -> PremiumAmount3.mmObject();
			isDerived = false;
			xmlTag = "PrmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumCurrency";
			definition = "Identification of the premium currency in which the option is held. \r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount amount;
	/**
	 * Result of the calculation of the premium amount on the basis of the
	 * premium quote and one of the amounts of the underlying foreign exchange
	 * trade.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the calculation of the premium amount on the basis of the premium quote and one of the amounts of the underlying foreign exchange trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PremiumAmount2#mmAmount
	 * PremiumAmount2.mmAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PremiumAmount3.mmObject();
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
	};
	protected Number decimalPlaces;
	/**
	 * Number of decimal places to which quantities of units/shares are rounded.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecimalPlaces"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of decimal places to which quantities of units/shares are rounded."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDecimalPlaces = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PremiumAmount3.mmObject();
			isDerived = false;
			xmlTag = "DcmlPlcs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecimalPlaces";
			definition = "Number of decimal places to which quantities of units/shares are rounded.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ISODate premiumSettlementDate;
	/**
	 * Date on which the premium must be settled.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the premium must be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPremiumSettlementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PremiumAmount3.mmObject();
			isDerived = false;
			xmlTag = "PrmSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumSettlementDate";
			definition = "Date on which the premium must be settled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max35Text payerPartyReference;
	/**
	 * Premium fee payer related information
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayerPartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Premium fee payer related information"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPayerPartyReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PremiumAmount3.mmObject();
			isDerived = false;
			xmlTag = "PyerPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayerPartyReference";
			definition = "Premium fee payer related information";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text receiverPartyReference;
	/**
	 * Premium fee receiver related information
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverPartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Premium fee receiver related information"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceiverPartyReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PremiumAmount3.mmObject();
			isDerived = false;
			xmlTag = "RcvrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverPartyReference";
			definition = "Premium fee receiver related information";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PremiumAmount3.mmPremiumQuote, PremiumAmount3.mmPremiumCurrency, PremiumAmount3.mmAmount, PremiumAmount3.mmDecimalPlaces, PremiumAmount3.mmPremiumSettlementDate,
						PremiumAmount3.mmPayerPartyReference, PremiumAmount3.mmReceiverPartyReference);
				trace_lazy = () -> PremiumCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PremiumAmount3";
				definition = "Commercial agreement in which the buyer agrees to pay the seller an amount of cash. Some aspects of the payment may be defined in the agreement, for example, the method of the payment";
				previousVersion_lazy = () -> PremiumAmount2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrmQt", required = true)
	public PremiumQuote1Choice getPremiumQuote() {
		return premiumQuote;
	}

	public void setPremiumQuote(PremiumQuote1Choice premiumQuote) {
		this.premiumQuote = premiumQuote;
	}

	@XmlElement(name = "PrmCcy", required = true)
	public ActiveOrHistoricCurrencyCode getPremiumCurrency() {
		return premiumCurrency;
	}

	public void setPremiumCurrency(ActiveOrHistoricCurrencyCode premiumCurrency) {
		this.premiumCurrency = premiumCurrency;
	}

	@XmlElement(name = "Amt", required = true)
	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = amount;
	}

	@XmlElement(name = "DcmlPlcs", required = true)
	public Number getDecimalPlaces() {
		return decimalPlaces;
	}

	public void setDecimalPlaces(Number decimalPlaces) {
		this.decimalPlaces = decimalPlaces;
	}

	@XmlElement(name = "PrmSttlmDt", required = true)
	public ISODate getPremiumSettlementDate() {
		return premiumSettlementDate;
	}

	public void setPremiumSettlementDate(ISODate premiumSettlementDate) {
		this.premiumSettlementDate = premiumSettlementDate;
	}

	@XmlElement(name = "PyerPtyRef", required = true)
	public Max35Text getPayerPartyReference() {
		return payerPartyReference;
	}

	public void setPayerPartyReference(Max35Text payerPartyReference) {
		this.payerPartyReference = payerPartyReference;
	}

	@XmlElement(name = "RcvrPtyRef", required = true)
	public Max35Text getReceiverPartyReference() {
		return receiverPartyReference;
	}

	public void setReceiverPartyReference(Max35Text receiverPartyReference) {
		this.receiverPartyReference = receiverPartyReference;
	}
}