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
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.entity.PaymentPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identification of a settlement party by a choice between a BIC or a name and
 * address or a party identification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementParties29#mmDeliveryAgent
 * SettlementParties29.mmDeliveryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementParties29#mmIntermediary
 * SettlementParties29.mmIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementParties29#mmReceivingAgent
 * SettlementParties29.mmReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementParties29#mmBeneficiaryInstitution
 * SettlementParties29.mmBeneficiaryInstitution}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentPartyRole
 * PaymentPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionAmendmentV02#mmTradingSideSettlementInstructions
 * ForeignExchangeTradeInstructionAmendmentV02.
 * mmTradingSideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionAmendmentV02#mmCounterpartySideSettlementInstructions
 * ForeignExchangeTradeInstructionAmendmentV02.
 * mmCounterpartySideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionCancellationV02#mmTradingSideSettlementInstructions
 * ForeignExchangeTradeInstructionCancellationV02.
 * mmTradingSideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionCancellationV02#mmCounterpartySideSettlementInstructions
 * ForeignExchangeTradeInstructionCancellationV02.
 * mmCounterpartySideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmTradingSideSettlementInstructions
 * ForeignExchangeTradeInstructionV02.mmTradingSideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmCounterpartySideSettlementInstructions
 * ForeignExchangeTradeInstructionV02.mmCounterpartySideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmTradingSideSettlementInstructions
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.
 * mmTradingSideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmCounterpartySideSettlementInstructions
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.
 * mmCounterpartySideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04#mmTradingSideSettlementInstructions
 * ForeignExchangeTradeInstructionV04.mmTradingSideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04#mmCounterpartySideSettlementInstructions
 * ForeignExchangeTradeInstructionV04.mmCounterpartySideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmTradingSideSettlementInstructions
 * ForeignExchangeTradeInstructionCancellationV04.
 * mmTradingSideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmCounterpartySideSettlementInstructions
 * ForeignExchangeTradeInstructionCancellationV04.
 * mmCounterpartySideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04#mmTradingSideSettlementInstructions
 * ForeignExchangeTradeInstructionAmendmentV04.
 * mmTradingSideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04#mmCounterpartySideSettlementInstructions
 * ForeignExchangeTradeInstructionAmendmentV04.
 * mmCounterpartySideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmTradingSideSettlementInstructions
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.
 * mmTradingSideSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmCounterpartySideSettlementInstructions
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.
 * mmCounterpartySideSettlementInstructions}</li>
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
 * "SettlementParties29"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identification of a settlement party by a choice between a BIC or a name and address or a party identification."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SettlementParties9
 * SettlementParties9}</li>
 * </ul>
 */
public class SettlementParties29 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification73Choice deliveryAgent;
	/**
	 * Financial institution from which cash will be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties29
	 * SettlementParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution from which cash will be transferred."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveryAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> SettlementParties29.mmObject();
			isDerived = false;
			xmlTag = "DlvryAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryAgent";
			definition = "Financial institution from which cash will be transferred.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	protected PartyIdentification73Choice intermediary;
	/**
	 * Party, within the settlement chain, between the delivery and receiving
	 * agents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties29
	 * SettlementParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party, within the settlement chain, between the delivery and receiving agents."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediary = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> SettlementParties29.mmObject();
			isDerived = false;
			xmlTag = "Intrmy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			definition = "Party, within the settlement chain, between the delivery and receiving agents.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	protected PartyIdentification73Choice receivingAgent;
	/**
	 * Financial institution where the payee will receive the funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties29
	 * SettlementParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial institution where the payee will receive the funds."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingAgent = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> SettlementParties29.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgent";
			definition = "Financial institution where the payee will receive the funds.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	protected PartyIdentification73Choice beneficiaryInstitution;
	/**
	 * Ultimate institution that will receive the funds when different from the
	 * trading or counterparty side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties29
	 * SettlementParties29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryInstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate institution that will receive the funds when different from the trading or counterparty side."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficiaryInstitution = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> SettlementParties29.mmObject();
			isDerived = false;
			xmlTag = "BnfcryInstn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryInstitution";
			definition = "Ultimate institution that will receive the funds when different from the trading or counterparty side.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementParties29.mmDeliveryAgent, com.tools20022.repository.msg.SettlementParties29.mmIntermediary,
						com.tools20022.repository.msg.SettlementParties29.mmReceivingAgent, com.tools20022.repository.msg.SettlementParties29.mmBeneficiaryInstitution);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.other.ForeignExchangeTradeInstructionAmendmentV02.mmTradingSideSettlementInstructions,
						com.tools20022.repository.area.other.ForeignExchangeTradeInstructionAmendmentV02.mmCounterpartySideSettlementInstructions,
						com.tools20022.repository.area.other.ForeignExchangeTradeInstructionCancellationV02.mmTradingSideSettlementInstructions,
						com.tools20022.repository.area.other.ForeignExchangeTradeInstructionCancellationV02.mmCounterpartySideSettlementInstructions,
						com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02.mmTradingSideSettlementInstructions,
						com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02.mmCounterpartySideSettlementInstructions,
						com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmTradingSideSettlementInstructions,
						com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmCounterpartySideSettlementInstructions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04.mmTradingSideSettlementInstructions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04.mmCounterpartySideSettlementInstructions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmTradingSideSettlementInstructions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04.mmCounterpartySideSettlementInstructions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04.mmTradingSideSettlementInstructions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04.mmCounterpartySideSettlementInstructions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmTradingSideSettlementInstructions,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04.mmCounterpartySideSettlementInstructions);
				trace_lazy = () -> PaymentPartyRole.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementParties29";
				definition = "Identification of a settlement party by a choice between a BIC or a name and address or a party identification.";
				previousVersion_lazy = () -> SettlementParties9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification73Choice getDeliveryAgent() {
		return deliveryAgent;
	}

	public void setDeliveryAgent(PartyIdentification73Choice deliveryAgent) {
		this.deliveryAgent = deliveryAgent;
	}

	public PartyIdentification73Choice getIntermediary() {
		return intermediary;
	}

	public void setIntermediary(PartyIdentification73Choice intermediary) {
		this.intermediary = intermediary;
	}

	public PartyIdentification73Choice getReceivingAgent() {
		return receivingAgent;
	}

	public void setReceivingAgent(PartyIdentification73Choice receivingAgent) {
		this.receivingAgent = receivingAgent;
	}

	public PartyIdentification73Choice getBeneficiaryInstitution() {
		return beneficiaryInstitution;
	}

	public void setBeneficiaryInstitution(PartyIdentification73Choice beneficiaryInstitution) {
		this.beneficiaryInstitution = beneficiaryInstitution;
	}
}