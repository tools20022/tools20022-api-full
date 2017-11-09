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
import com.tools20022.repository.choice.PartyIdentification35Choice;
import com.tools20022.repository.entity.DeliveringSettlementParty;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.ReceivingSettlementParty;
import com.tools20022.repository.entity.SystemPartyRole;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides the non guaranteed trade details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade1#mmTradeCounterpartyMemberIdentification
 * NonGuaranteedTrade1.mmTradeCounterpartyMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade1#mmTradeCounterpartyClearingMemberIdentification
 * NonGuaranteedTrade1.mmTradeCounterpartyClearingMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade1#mmDeliveringParties
 * NonGuaranteedTrade1.mmDeliveringParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade1#mmReceivingParties
 * NonGuaranteedTrade1.mmReceivingParties}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
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
 * "NonGuaranteedTrade1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the non guaranteed trade details."</li>
 * </ul>
 */
public class NonGuaranteedTrade1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PartyIdentification35Choice tradeCounterpartyMemberIdentification;
	/**
	 * External identification of the member who is the market counterpart
	 * member of the current trade leg (in case of non guarantee trades, this
	 * field allows buyer and seller to identify each other).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade1
	 * NonGuaranteedTrade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradCtrPtyMmbId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeCounterpartyMemberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "External identification of the member who is the market counterpart member of the current trade leg (in case of non guarantee trades, this field allows buyer and seller to identify each other)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeCounterpartyMemberIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> NonGuaranteedTrade1.mmObject();
			isDerived = false;
			xmlTag = "TradCtrPtyMmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeCounterpartyMemberIdentification";
			definition = "External identification of the member who is the market counterpart member of the current trade leg (in case of non guarantee trades, this field allows buyer and seller to identify each other).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}
	};
	protected PartyIdentification35Choice tradeCounterpartyClearingMemberIdentification;
	/**
	 * External identification of the clearing member of the market couterpart
	 * member (in case of non guarantee trades, this field allows buyer and
	 * seller to identify each other).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade1
	 * NonGuaranteedTrade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradCtrPtyClrMmbId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeCounterpartyClearingMemberIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "External identification of the clearing member of the market couterpart member (in case of non guarantee trades, this field allows buyer and seller to identify each other)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeCounterpartyClearingMemberIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> NonGuaranteedTrade1.mmObject();
			isDerived = false;
			xmlTag = "TradCtrPtyClrMmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeCounterpartyClearingMemberIdentification";
			definition = "External identification of the clearing member of the market couterpart member (in case of non guarantee trades, this field allows buyer and seller to identify each other).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}
	};
	protected DeliveringPartiesAndAccount5 deliveringParties;
	/**
	 * Provides details about the delivering parties involved in the settlement
	 * chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount5
	 * DeliveringPartiesAndAccount5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade1
	 * NonGuaranteedTrade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the delivering parties involved in the settlement chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveringParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> NonGuaranteedTrade1.mmObject();
			isDerived = false;
			xmlTag = "DlvrgPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringParties";
			definition = "Provides details about the delivering parties involved in the settlement chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount5.mmObject();
		}
	};
	protected ReceivingPartiesAndAccount6 receivingParties;
	/**
	 * Provides details about the receiving parties involved in the settlement
	 * chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount6
	 * ReceivingPartiesAndAccount6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade1
	 * NonGuaranteedTrade1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the receiving parties involved in the settlement chain."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> NonGuaranteedTrade1.mmObject();
			isDerived = false;
			xmlTag = "RcvgPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingParties";
			definition = "Provides details about the receiving parties involved in the settlement chain.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NonGuaranteedTrade1.mmTradeCounterpartyMemberIdentification, NonGuaranteedTrade1.mmTradeCounterpartyClearingMemberIdentification, NonGuaranteedTrade1.mmDeliveringParties,
						NonGuaranteedTrade1.mmReceivingParties);
				trace_lazy = () -> SystemPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NonGuaranteedTrade1";
				definition = "Provides the non guaranteed trade details.";
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification35Choice getTradeCounterpartyMemberIdentification() {
		return tradeCounterpartyMemberIdentification;
	}

	public void setTradeCounterpartyMemberIdentification(PartyIdentification35Choice tradeCounterpartyMemberIdentification) {
		this.tradeCounterpartyMemberIdentification = tradeCounterpartyMemberIdentification;
	}

	public PartyIdentification35Choice getTradeCounterpartyClearingMemberIdentification() {
		return tradeCounterpartyClearingMemberIdentification;
	}

	public void setTradeCounterpartyClearingMemberIdentification(PartyIdentification35Choice tradeCounterpartyClearingMemberIdentification) {
		this.tradeCounterpartyClearingMemberIdentification = tradeCounterpartyClearingMemberIdentification;
	}

	public DeliveringPartiesAndAccount5 getDeliveringParties() {
		return deliveringParties;
	}

	public void setDeliveringParties(com.tools20022.repository.msg.DeliveringPartiesAndAccount5 deliveringParties) {
		this.deliveringParties = deliveringParties;
	}

	public ReceivingPartiesAndAccount6 getReceivingParties() {
		return receivingParties;
	}

	public void setReceivingParties(com.tools20022.repository.msg.ReceivingPartiesAndAccount6 receivingParties) {
		this.receivingParties = receivingParties;
	}
}