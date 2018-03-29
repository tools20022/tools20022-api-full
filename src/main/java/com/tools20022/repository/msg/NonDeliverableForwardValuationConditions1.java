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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.PartyIdentification7Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.FixingCondition;
import com.tools20022.repository.entity.NonDeliverableTrade;
import com.tools20022.repository.entity.Party;
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
 * Set of parameters used to calculate the fixing rate to be applied to a
 * non-deliverable agreement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1#mmSettlementCurrency
 * NonDeliverableForwardValuationConditions1.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1#mmValuationDate
 * NonDeliverableForwardValuationConditions1.mmValuationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1#mmAdditionalValuationInformation
 * NonDeliverableForwardValuationConditions1.mmAdditionalValuationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1#mmSettlementParty
 * NonDeliverableForwardValuationConditions1.mmSettlementParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FixingCondition
 * FixingCondition}</li>
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
 * "NonDeliverableForwardValuationConditions1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of parameters used to calculate the fixing rate to be applied to a non-deliverable agreement."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NonDeliverableForwardValuationConditions1", propOrder = {"settlementCurrency", "valuationDate", "additionalValuationInformation", "settlementParty"})
public class NonDeliverableForwardValuationConditions1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttlmCcy", required = true)
	protected ActiveOrHistoricCurrencyCode settlementCurrency;
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
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmSettlementCurrency
	 * NonDeliverableTrade.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1
	 * NonDeliverableForwardValuationConditions1}</li>
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
	 * definition} =
	 * "Specifies the currency in which the non deliverable trade has to be settled ie the deliverable currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NonDeliverableForwardValuationConditions1, ActiveOrHistoricCurrencyCode> mmSettlementCurrency = new MMMessageAttribute<NonDeliverableForwardValuationConditions1, ActiveOrHistoricCurrencyCode>() {
		{
			businessElementTrace_lazy = () -> NonDeliverableTrade.mmSettlementCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Specifies the currency in which the non deliverable trade has to be settled ie the deliverable currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyCode getValue(NonDeliverableForwardValuationConditions1 obj) {
			return obj.getSettlementCurrency();
		}

		@Override
		public void setValue(NonDeliverableForwardValuationConditions1 obj, ActiveOrHistoricCurrencyCode value) {
			obj.setSettlementCurrency(value);
		}
	};
	@XmlElement(name = "ValtnDt", required = true)
	protected ISODate valuationDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFixingDateTime
	 * FixingCondition.mmFixingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1
	 * NonDeliverableForwardValuationConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at which the rate used for calculating the net amount to be settled is observed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NonDeliverableForwardValuationConditions1, ISODate> mmValuationDate = new MMMessageAttribute<NonDeliverableForwardValuationConditions1, ISODate>() {
		{
			businessElementTrace_lazy = () -> FixingCondition.mmFixingDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1.mmObject();
			isDerived = false;
			xmlTag = "ValtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDate";
			definition = "Date at which the rate used for calculating the net amount to be settled is observed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(NonDeliverableForwardValuationConditions1 obj) {
			return obj.getValuationDate();
		}

		@Override
		public void setValue(NonDeliverableForwardValuationConditions1 obj, ISODate value) {
			obj.setValuationDate(value);
		}
	};
	@XmlElement(name = "AddtlValtnInf")
	protected Max140Text additionalValuationInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1
	 * NonDeliverableForwardValuationConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlValtnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalValuationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Free format text that may contain valuation information such as the place, the time or the source of the rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NonDeliverableForwardValuationConditions1, Optional<Max140Text>> mmAdditionalValuationInformation = new MMMessageAttribute<NonDeliverableForwardValuationConditions1, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1.mmObject();
			isDerived = false;
			xmlTag = "AddtlValtnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalValuationInformation";
			definition = "Free format text that may contain valuation information such as the place, the time or the source of the rate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(NonDeliverableForwardValuationConditions1 obj) {
			return obj.getAdditionalValuationInformation();
		}

		@Override
		public void setValue(NonDeliverableForwardValuationConditions1 obj, Optional<Max140Text> value) {
			obj.setAdditionalValuationInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmPty")
	protected PartyIdentification7Choice settlementParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification7Choice
	 * PartyIdentification7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1
	 * NonDeliverableForwardValuationConditions1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party through which the settlement will take place. It may contain the BIC of a central settlement system eg CLSBUS33."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NonDeliverableForwardValuationConditions1, Optional<PartyIdentification7Choice>> mmSettlementParty = new MMMessageAttribute<NonDeliverableForwardValuationConditions1, Optional<PartyIdentification7Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1.mmObject();
			isDerived = false;
			xmlTag = "SttlmPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParty";
			definition = "Party through which the settlement will take place. It may contain the BIC of a central settlement system eg CLSBUS33.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification7Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification7Choice> getValue(NonDeliverableForwardValuationConditions1 obj) {
			return obj.getSettlementParty();
		}

		@Override
		public void setValue(NonDeliverableForwardValuationConditions1 obj, Optional<PartyIdentification7Choice> value) {
			obj.setSettlementParty(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1.mmSettlementCurrency,
						com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1.mmValuationDate, com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1.mmAdditionalValuationInformation,
						com.tools20022.repository.msg.NonDeliverableForwardValuationConditions1.mmSettlementParty);
				trace_lazy = () -> FixingCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NonDeliverableForwardValuationConditions1";
				definition = "Set of parameters used to calculate the fixing rate to be applied to a non-deliverable agreement.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public NonDeliverableForwardValuationConditions1 setSettlementCurrency(ActiveOrHistoricCurrencyCode settlementCurrency) {
		this.settlementCurrency = Objects.requireNonNull(settlementCurrency);
		return this;
	}

	public ISODate getValuationDate() {
		return valuationDate;
	}

	public NonDeliverableForwardValuationConditions1 setValuationDate(ISODate valuationDate) {
		this.valuationDate = Objects.requireNonNull(valuationDate);
		return this;
	}

	public Optional<Max140Text> getAdditionalValuationInformation() {
		return additionalValuationInformation == null ? Optional.empty() : Optional.of(additionalValuationInformation);
	}

	public NonDeliverableForwardValuationConditions1 setAdditionalValuationInformation(Max140Text additionalValuationInformation) {
		this.additionalValuationInformation = additionalValuationInformation;
		return this;
	}

	public Optional<PartyIdentification7Choice> getSettlementParty() {
		return settlementParty == null ? Optional.empty() : Optional.of(settlementParty);
	}

	public NonDeliverableForwardValuationConditions1 setSettlementParty(PartyIdentification7Choice settlementParty) {
		this.settlementParty = settlementParty;
		return this;
	}
}