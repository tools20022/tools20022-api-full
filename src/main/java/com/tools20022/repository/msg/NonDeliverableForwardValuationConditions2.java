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
import com.tools20022.repository.area.trea.AmendNonDeliverableForwardOpeningV02;
import com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02;
import com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02;
import com.tools20022.repository.choice.PartyIdentification8Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.FixingCondition;
import com.tools20022.repository.entity.NonDeliverableTrade;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions2#mmSettlementCurrency
 * NonDeliverableForwardValuationConditions2.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions2#mmValuationDate
 * NonDeliverableForwardValuationConditions2.mmValuationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions2#mmAdditionalValuationInformation
 * NonDeliverableForwardValuationConditions2.mmAdditionalValuationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions2#mmSettlementParty
 * NonDeliverableForwardValuationConditions2.mmSettlementParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FixingCondition
 * FixingCondition}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02#mmValuationConditions
 * CreateNonDeliverableForwardOpeningV02.mmValuationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardOpeningV02#mmValuationConditions
 * AmendNonDeliverableForwardOpeningV02.mmValuationConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02#mmValuationConditions
 * CancelNonDeliverableForwardOpeningV02.mmValuationConditions}</li>
 * </ul>
 * </li>
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
 * "NonDeliverableForwardValuationConditions2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of parameters used to calculate the fixing rate to be applied to a non-deliverable agreement."
 * </li>
 * </ul>
 */
public class NonDeliverableForwardValuationConditions2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ActiveOrHistoricCurrencyCode settlementCurrency;
	/**
	 * Specifies the currency in which the non deliverable trade has to be
	 * settled ie the deliverable currency.
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
	 * {@linkplain com.tools20022.repository.entity.NonDeliverableTrade#mmSettlementCurrency
	 * NonDeliverableTrade.mmSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions2
	 * NonDeliverableForwardValuationConditions2}</li>
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
	public static final MMMessageAttribute mmSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> NonDeliverableTrade.mmSettlementCurrency;
			componentContext_lazy = () -> NonDeliverableForwardValuationConditions2.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Specifies the currency in which the non deliverable trade has to be settled ie the deliverable currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected ISODate valuationDate;
	/**
	 * Date at which the rate used for calculating the net amount to be settled
	 * is observed.
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
	 * {@linkplain com.tools20022.repository.entity.FixingCondition#mmFixingDateTime
	 * FixingCondition.mmFixingDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions2
	 * NonDeliverableForwardValuationConditions2}</li>
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
	public static final MMMessageAttribute mmValuationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> FixingCondition.mmFixingDateTime;
			componentContext_lazy = () -> NonDeliverableForwardValuationConditions2.mmObject();
			isDerived = false;
			xmlTag = "ValtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationDate";
			definition = "Date at which the rate used for calculating the net amount to be settled is observed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected Max140Text additionalValuationInformation;
	/**
	 * Free format text that may contain valuation information such as the
	 * place, the time or the source of the rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions2
	 * NonDeliverableForwardValuationConditions2}</li>
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
	public static final MMMessageAttribute mmAdditionalValuationInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NonDeliverableForwardValuationConditions2.mmObject();
			isDerived = false;
			xmlTag = "AddtlValtnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalValuationInformation";
			definition = "Free format text that may contain valuation information such as the place, the time or the source of the rate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected PartyIdentification8Choice settlementParty;
	/**
	 * Party through which the settlement will take place. It may contain the
	 * BIC of a central settlement system eg CLSBUS33.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification8Choice
	 * PartyIdentification8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions2
	 * NonDeliverableForwardValuationConditions2}</li>
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
	public static final MMMessageAttribute mmSettlementParty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> NonDeliverableForwardValuationConditions2.mmObject();
			isDerived = false;
			xmlTag = "SttlmPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParty";
			definition = "Party through which the settlement will take place. It may contain the BIC of a central settlement system eg CLSBUS33.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification8Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NonDeliverableForwardValuationConditions2.mmSettlementCurrency, NonDeliverableForwardValuationConditions2.mmValuationDate,
						NonDeliverableForwardValuationConditions2.mmAdditionalValuationInformation, NonDeliverableForwardValuationConditions2.mmSettlementParty);
				messageBuildingBlock_lazy = () -> Arrays.asList(CreateNonDeliverableForwardOpeningV02.mmValuationConditions, AmendNonDeliverableForwardOpeningV02.mmValuationConditions,
						CancelNonDeliverableForwardOpeningV02.mmValuationConditions);
				trace_lazy = () -> FixingCondition.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonDeliverableForwardValuationConditions2";
				definition = "Set of parameters used to calculate the fixing rate to be applied to a non-deliverable agreement.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyCode getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(ActiveOrHistoricCurrencyCode settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	public ISODate getValuationDate() {
		return valuationDate;
	}

	public void setValuationDate(ISODate valuationDate) {
		this.valuationDate = valuationDate;
	}

	public Max140Text getAdditionalValuationInformation() {
		return additionalValuationInformation;
	}

	public void setAdditionalValuationInformation(Max140Text additionalValuationInformation) {
		this.additionalValuationInformation = additionalValuationInformation;
	}

	public PartyIdentification8Choice getSettlementParty() {
		return settlementParty;
	}

	public void setSettlementParty(PartyIdentification8Choice settlementParty) {
		this.settlementParty = settlementParty;
	}
}