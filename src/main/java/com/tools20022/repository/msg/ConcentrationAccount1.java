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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.datatype.Max10NumericText;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.CurrencyExchange;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Flows1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Bank account used by a central counterparty to concentrate cash funds before
 * or after investment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ConcentrationAccount1#mmInFlow
 * ConcentrationAccount1.mmInFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1#mmOutFlow
 * ConcentrationAccount1.mmOutFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1#mmEndOfDay
 * ConcentrationAccount1.mmEndOfDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1#mmPeakCredit
 * ConcentrationAccount1.mmPeakCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1#mmPeakDebit
 * ConcentrationAccount1.mmPeakDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1#mmCurrency
 * ConcentrationAccount1.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1#mmLatePaymentConfirmation
 * ConcentrationAccount1.mmLatePaymentConfirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CashAccount
 * CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ConcentrationAccount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Bank account used by a central counterparty to concentrate cash funds before or after investment."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ConcentrationAccount1", propOrder = {"inFlow", "outFlow", "endOfDay", "peakCredit", "peakDebit", "currency", "latePaymentConfirmation"})
public class ConcentrationAccount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InFlow", required = true)
	protected Flows1 inFlow;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Flows1 Flows1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1
	 * ConcentrationAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates inflows into the account.\r\n\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ConcentrationAccount1, Flows1> mmInFlow = new MMMessageAssociationEnd<ConcentrationAccount1, Flows1>() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConcentrationAccount1.mmObject();
			isDerived = false;
			xmlTag = "InFlow";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InFlow";
			definition = "Indicates inflows into the account.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Flows1.mmObject();
		}

		@Override
		public Flows1 getValue(ConcentrationAccount1 obj) {
			return obj.getInFlow();
		}

		@Override
		public void setValue(ConcentrationAccount1 obj, Flows1 value) {
			obj.setInFlow(value);
		}
	};
	@XmlElement(name = "OutFlow", required = true)
	protected Flows1 outFlow;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Flows1 Flows1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1
	 * ConcentrationAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OutFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates outflows out of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ConcentrationAccount1, Flows1> mmOutFlow = new MMMessageAssociationEnd<ConcentrationAccount1, Flows1>() {
		{
			businessComponentTrace_lazy = () -> CashEntry.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ConcentrationAccount1.mmObject();
			isDerived = false;
			xmlTag = "OutFlow";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutFlow";
			definition = "Indicates outflows out of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Flows1.mmObject();
		}

		@Override
		public Flows1 getValue(ConcentrationAccount1 obj) {
			return obj.getOutFlow();
		}

		@Override
		public void setValue(ConcentrationAccount1 obj, Flows1 value) {
			obj.setOutFlow(value);
		}
	};
	@XmlElement(name = "EndOfDay", required = true)
	protected ImpliedCurrencyAndAmount endOfDay;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmAmount
	 * CashBalance.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1
	 * ConcentrationAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndOfDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates end of day cash balance on the account.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConcentrationAccount1, ImpliedCurrencyAndAmount> mmEndOfDay = new MMMessageAttribute<ConcentrationAccount1, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ConcentrationAccount1.mmObject();
			isDerived = false;
			xmlTag = "EndOfDay";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfDay";
			definition = "Indicates end of day cash balance on the account.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(ConcentrationAccount1 obj) {
			return obj.getEndOfDay();
		}

		@Override
		public void setValue(ConcentrationAccount1 obj, ImpliedCurrencyAndAmount value) {
			obj.setEndOfDay(value);
		}
	};
	@XmlElement(name = "PeakCdt", required = true)
	protected ImpliedCurrencyAndAmount peakCredit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmAmount
	 * CashBalance.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1
	 * ConcentrationAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PeakCdt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeakCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicatres peak credit balance on the account.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConcentrationAccount1, ImpliedCurrencyAndAmount> mmPeakCredit = new MMMessageAttribute<ConcentrationAccount1, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ConcentrationAccount1.mmObject();
			isDerived = false;
			xmlTag = "PeakCdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeakCredit";
			definition = "Indicatres peak credit balance on the account.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(ConcentrationAccount1 obj) {
			return obj.getPeakCredit();
		}

		@Override
		public void setValue(ConcentrationAccount1 obj, ImpliedCurrencyAndAmount value) {
			obj.setPeakCredit(value);
		}
	};
	@XmlElement(name = "PeakDbt", required = true)
	protected ImpliedCurrencyAndAmount peakDebit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmAmount
	 * CashBalance.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1
	 * ConcentrationAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PeakDbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeakDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates peak debit balance on the account.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConcentrationAccount1, ImpliedCurrencyAndAmount> mmPeakDebit = new MMMessageAttribute<ConcentrationAccount1, ImpliedCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ConcentrationAccount1.mmObject();
			isDerived = false;
			xmlTag = "PeakDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeakDebit";
			definition = "Indicates peak debit balance on the account.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}

		@Override
		public ImpliedCurrencyAndAmount getValue(ConcentrationAccount1 obj) {
			return obj.getPeakDebit();
		}

		@Override
		public void setValue(ConcentrationAccount1 obj, ImpliedCurrencyAndAmount value) {
			obj.setPeakDebit(value);
		}
	};
	@XmlElement(name = "Ccy", required = true)
	protected ActiveCurrencyCode currency;
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
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmSourceCurrency
	 * CurrencyExchange.mmSourceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1
	 * ConcentrationAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the currency of the account.\r\n"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConcentrationAccount1, ActiveCurrencyCode> mmCurrency = new MMMessageAttribute<ConcentrationAccount1, ActiveCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmSourceCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ConcentrationAccount1.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Indicates the currency of the account.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public ActiveCurrencyCode getValue(ConcentrationAccount1 obj) {
			return obj.getCurrency();
		}

		@Override
		public void setValue(ConcentrationAccount1 obj, ActiveCurrencyCode value) {
			obj.setCurrency(value);
		}
	};
	@XmlElement(name = "LatePmtConf", required = true)
	protected Max10NumericText latePaymentConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10NumericText
	 * Max10NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1
	 * ConcentrationAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LatePmtConf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LatePaymentConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of concentration account pay‐ins breaching the allowed time between instruction and confirmation. Usage: nil returns to be included for late payment confirmations in all cleared currencies.\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ConcentrationAccount1, Max10NumericText> mmLatePaymentConfirmation = new MMMessageAttribute<ConcentrationAccount1, Max10NumericText>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ConcentrationAccount1.mmObject();
			isDerived = false;
			xmlTag = "LatePmtConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LatePaymentConfirmation";
			definition = "Number of concentration account pay‐ins breaching the allowed time between instruction and confirmation. Usage: nil returns to be included for late payment confirmations in all cleared currencies.\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max10NumericText.mmObject();
		}

		@Override
		public Max10NumericText getValue(ConcentrationAccount1 obj) {
			return obj.getLatePaymentConfirmation();
		}

		@Override
		public void setValue(ConcentrationAccount1 obj, Max10NumericText value) {
			obj.setLatePaymentConfirmation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ConcentrationAccount1.mmInFlow, com.tools20022.repository.msg.ConcentrationAccount1.mmOutFlow,
						com.tools20022.repository.msg.ConcentrationAccount1.mmEndOfDay, com.tools20022.repository.msg.ConcentrationAccount1.mmPeakCredit, com.tools20022.repository.msg.ConcentrationAccount1.mmPeakDebit,
						com.tools20022.repository.msg.ConcentrationAccount1.mmCurrency, com.tools20022.repository.msg.ConcentrationAccount1.mmLatePaymentConfirmation);
				trace_lazy = () -> CashAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ConcentrationAccount1";
				definition = "Bank account used by a central counterparty to concentrate cash funds before or after investment.";
			}
		});
		return mmObject_lazy.get();
	}

	public Flows1 getInFlow() {
		return inFlow;
	}

	public ConcentrationAccount1 setInFlow(Flows1 inFlow) {
		this.inFlow = Objects.requireNonNull(inFlow);
		return this;
	}

	public Flows1 getOutFlow() {
		return outFlow;
	}

	public ConcentrationAccount1 setOutFlow(Flows1 outFlow) {
		this.outFlow = Objects.requireNonNull(outFlow);
		return this;
	}

	public ImpliedCurrencyAndAmount getEndOfDay() {
		return endOfDay;
	}

	public ConcentrationAccount1 setEndOfDay(ImpliedCurrencyAndAmount endOfDay) {
		this.endOfDay = Objects.requireNonNull(endOfDay);
		return this;
	}

	public ImpliedCurrencyAndAmount getPeakCredit() {
		return peakCredit;
	}

	public ConcentrationAccount1 setPeakCredit(ImpliedCurrencyAndAmount peakCredit) {
		this.peakCredit = Objects.requireNonNull(peakCredit);
		return this;
	}

	public ImpliedCurrencyAndAmount getPeakDebit() {
		return peakDebit;
	}

	public ConcentrationAccount1 setPeakDebit(ImpliedCurrencyAndAmount peakDebit) {
		this.peakDebit = Objects.requireNonNull(peakDebit);
		return this;
	}

	public ActiveCurrencyCode getCurrency() {
		return currency;
	}

	public ConcentrationAccount1 setCurrency(ActiveCurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public Max10NumericText getLatePaymentConfirmation() {
		return latePaymentConfirmation;
	}

	public ConcentrationAccount1 setLatePaymentConfirmation(Max10NumericText latePaymentConfirmation) {
		this.latePaymentConfirmation = Objects.requireNonNull(latePaymentConfirmation);
		return this;
	}
}