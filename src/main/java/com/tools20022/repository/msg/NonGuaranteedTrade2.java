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
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade2#mmTradeCounterpartyMemberIdentification
 * NonGuaranteedTrade2.mmTradeCounterpartyMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade2#mmTradeCounterpartyClearingMemberIdentification
 * NonGuaranteedTrade2.mmTradeCounterpartyClearingMemberIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade2#mmDeliveringParties
 * NonGuaranteedTrade2.mmDeliveringParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade2#mmReceivingParties
 * NonGuaranteedTrade2.mmReceivingParties}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
 * SystemPartyRole}</li>
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
 * "NonGuaranteedTrade2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the non guaranteed trade details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3
 * NonGuaranteedTrade3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NonGuaranteedTrade2", propOrder = {"tradeCounterpartyMemberIdentification", "tradeCounterpartyClearingMemberIdentification", "deliveringParties", "receivingParties"})
public class NonGuaranteedTrade2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradCtrPtyMmbId", required = true)
	protected PartyIdentification35Choice tradeCounterpartyMemberIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade2
	 * NonGuaranteedTrade2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3#mmTradeCounterpartyMemberIdentification
	 * NonGuaranteedTrade3.mmTradeCounterpartyMemberIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeCounterpartyMemberIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonGuaranteedTrade2.mmObject();
			isDerived = false;
			xmlTag = "TradCtrPtyMmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeCounterpartyMemberIdentification";
			definition = "External identification of the member who is the market counterpart member of the current trade leg (in case of non guarantee trades, this field allows buyer and seller to identify each other).";
			nextVersions_lazy = () -> Arrays.asList(NonGuaranteedTrade3.mmTradeCounterpartyMemberIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}
	};
	@XmlElement(name = "TradCtrPtyClrMmbId", required = true)
	protected PartyIdentification35Choice tradeCounterpartyClearingMemberIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade2
	 * NonGuaranteedTrade2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3#mmTradeCounterpartyClearingMemberIdentification
	 * NonGuaranteedTrade3.mmTradeCounterpartyClearingMemberIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeCounterpartyClearingMemberIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonGuaranteedTrade2.mmObject();
			isDerived = false;
			xmlTag = "TradCtrPtyClrMmbId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeCounterpartyClearingMemberIdentification";
			definition = "External identification of the clearing member of the market couterpart member (in case of non guarantee trades, this field allows buyer and seller to identify each other).";
			nextVersions_lazy = () -> Arrays.asList(NonGuaranteedTrade3.mmTradeCounterpartyClearingMemberIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}
	};
	@XmlElement(name = "DlvrgPties")
	protected DeliveringPartiesAndAccount7 deliveringParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DeliveringPartiesAndAccount7
	 * DeliveringPartiesAndAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade2
	 * NonGuaranteedTrade2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3#mmDeliveringParties
	 * NonGuaranteedTrade3.mmDeliveringParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveringParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.NonGuaranteedTrade2.mmObject();
			isDerived = false;
			xmlTag = "DlvrgPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringParties";
			definition = "Provides details about the delivering parties involved in the settlement chain.";
			nextVersions_lazy = () -> Arrays.asList(NonGuaranteedTrade3.mmDeliveringParties);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DeliveringPartiesAndAccount7.mmObject();
		}
	};
	@XmlElement(name = "RcvgPties")
	protected ReceivingPartiesAndAccount7 receivingParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount7
	 * ReceivingPartiesAndAccount7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade2
	 * NonGuaranteedTrade2}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3#mmReceivingParties
	 * NonGuaranteedTrade3.mmReceivingParties}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.NonGuaranteedTrade2.mmObject();
			isDerived = false;
			xmlTag = "RcvgPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingParties";
			definition = "Provides details about the receiving parties involved in the settlement chain.";
			nextVersions_lazy = () -> Arrays.asList(NonGuaranteedTrade3.mmReceivingParties);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NonGuaranteedTrade2.mmTradeCounterpartyMemberIdentification,
						com.tools20022.repository.msg.NonGuaranteedTrade2.mmTradeCounterpartyClearingMemberIdentification, com.tools20022.repository.msg.NonGuaranteedTrade2.mmDeliveringParties,
						com.tools20022.repository.msg.NonGuaranteedTrade2.mmReceivingParties);
				trace_lazy = () -> SystemPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "NonGuaranteedTrade2";
				definition = "Provides the non guaranteed trade details.";
				nextVersions_lazy = () -> Arrays.asList(NonGuaranteedTrade3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification35Choice getTradeCounterpartyMemberIdentification() {
		return tradeCounterpartyMemberIdentification;
	}

	public NonGuaranteedTrade2 setTradeCounterpartyMemberIdentification(PartyIdentification35Choice tradeCounterpartyMemberIdentification) {
		this.tradeCounterpartyMemberIdentification = Objects.requireNonNull(tradeCounterpartyMemberIdentification);
		return this;
	}

	public PartyIdentification35Choice getTradeCounterpartyClearingMemberIdentification() {
		return tradeCounterpartyClearingMemberIdentification;
	}

	public NonGuaranteedTrade2 setTradeCounterpartyClearingMemberIdentification(PartyIdentification35Choice tradeCounterpartyClearingMemberIdentification) {
		this.tradeCounterpartyClearingMemberIdentification = Objects.requireNonNull(tradeCounterpartyClearingMemberIdentification);
		return this;
	}

	public Optional<DeliveringPartiesAndAccount7> getDeliveringParties() {
		return deliveringParties == null ? Optional.empty() : Optional.of(deliveringParties);
	}

	public NonGuaranteedTrade2 setDeliveringParties(com.tools20022.repository.msg.DeliveringPartiesAndAccount7 deliveringParties) {
		this.deliveringParties = deliveringParties;
		return this;
	}

	public Optional<ReceivingPartiesAndAccount7> getReceivingParties() {
		return receivingParties == null ? Optional.empty() : Optional.of(receivingParties);
	}

	public NonGuaranteedTrade2 setReceivingParties(com.tools20022.repository.msg.ReceivingPartiesAndAccount7 receivingParties) {
		this.receivingParties = receivingParties;
		return this;
	}
}