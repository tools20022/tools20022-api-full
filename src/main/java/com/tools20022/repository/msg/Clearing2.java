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
import com.tools20022.repository.codeset.NettingEligible1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Clearing;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the clearing details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Clearing2#mmSettlementNettingEligibleCode
 * Clearing2.mmSettlementNettingEligibleCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing2#mmClearingSegment
 * Clearing2.mmClearingSegment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing2#mmGuaranteedTrade
 * Clearing2.mmGuaranteedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing2#mmNonGuaranteedTrade
 * Clearing2.mmNonGuaranteedTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Clearing Clearing}</li>
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
 * "Clearing2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the clearing details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing4 Clearing4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Clearing2", propOrder = {"settlementNettingEligibleCode", "clearingSegment", "guaranteedTrade", "nonGuaranteedTrade"})
public class Clearing2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected NettingEligible1Code settlementNettingEligibleCode;
	/**
	 * Indicates to the clearing member whether the trade is eligible for
	 * settlement netting or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NettingEligible1Code
	 * NettingEligible1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmSettlementNetting
	 * Trade.mmSettlementNetting}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Clearing2
	 * Clearing2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmNetgElgblCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementNettingEligibleCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates to the clearing member whether the trade is eligible for settlement netting or not."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing4#mmSettlementNettingEligibleCode
	 * Clearing4.mmSettlementNettingEligibleCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementNettingEligibleCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmSettlementNetting;
			componentContext_lazy = () -> Clearing2.mmObject();
			isDerived = false;
			xmlTag = "SttlmNetgElgblCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementNettingEligibleCode";
			definition = "Indicates to the clearing member whether the trade is eligible for settlement netting or not.";
			nextVersions_lazy = () -> Arrays.asList(Clearing4.mmSettlementNettingEligibleCode);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NettingEligible1Code.mmObject();
		}
	};
	protected PartyIdentification35Choice clearingSegment;
	/**
	 * Clearing organisation that will clear the trade.<br>
	 * Note: This field allows clearing member firm to segregate flows coming
	 * from clearing counterparty's clearing system. Indeed, clearing member
	 * firms receive messages from the same system (same sender) and this field
	 * allows them to know if the message is related to equities or derivatives.
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Clearing2
	 * Clearing2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSgmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSegment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing organisation that will clear the trade.\r\nNote: This field allows clearing member firm to segregate flows coming from clearing counterparty's clearing system. Indeed, clearing member firms receive messages from the same system (same sender) and this field allows them to know if the message is related to equities or derivatives."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing4#mmClearingSegment
	 * Clearing4.mmClearingSegment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingSegment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> Clearing2.mmObject();
			isDerived = false;
			xmlTag = "ClrSgmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSegment";
			definition = "Clearing organisation that will clear the trade.\r\nNote: This field allows clearing member firm to segregate flows coming from clearing counterparty's clearing system. Indeed, clearing member firms receive messages from the same system (same sender) and this field allows them to know if the message is related to equities or derivatives.";
			nextVersions_lazy = () -> Arrays.asList(Clearing4.mmClearingSegment);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}
	};
	protected YesNoIndicator guaranteedTrade;
	/**
	 * Indicates if the position is guaranteed or non-guaranteed by the central
	 * counterparty, that is whether the CCP has done the novation and then
	 * guarantees the trade, or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Clearing#mmGuaranteedTrade
	 * Clearing.mmGuaranteedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Clearing2
	 * Clearing2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrntedTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the position is guaranteed or non-guaranteed by the central counterparty, that is whether the CCP has done the novation and then guarantees the trade, or not."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing4#mmGuaranteedTrade
	 * Clearing4.mmGuaranteedTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGuaranteedTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Clearing.mmGuaranteedTrade;
			componentContext_lazy = () -> Clearing2.mmObject();
			isDerived = false;
			xmlTag = "GrntedTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedTrade";
			definition = "Indicates if the position is guaranteed or non-guaranteed by the central counterparty, that is whether the CCP has done the novation and then guarantees the trade, or not.";
			nextVersions_lazy = () -> Arrays.asList(Clearing4.mmGuaranteedTrade);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected NonGuaranteedTrade2 nonGuaranteedTrade;
	/**
	 * In case of trades that are not guaranteed by the central counterparty
	 * (this is when the central counterparty has not done the novation),
	 * provides details such as the trade counterparty member identification or
	 * the trade counterparty clearing member identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade2
	 * NonGuaranteedTrade2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
	 * SecuritiesTradeExecution.mmRelatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Clearing2
	 * Clearing2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonGrntedTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonGuaranteedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In case of trades that are not guaranteed by the central counterparty (this is when the central counterparty has not done the novation), provides details such as the trade counterparty member identification or the trade counterparty clearing member identification."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Clearing4#mmNonGuaranteedTrade
	 * Clearing4.mmNonGuaranteedTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNonGuaranteedTrade = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmRelatedTrade;
			componentContext_lazy = () -> Clearing2.mmObject();
			isDerived = false;
			xmlTag = "NonGrntedTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonGuaranteedTrade";
			definition = "In case of trades that are not guaranteed by the central counterparty (this is when the central counterparty has not done the novation), provides details such as the trade counterparty member identification or the trade counterparty clearing member identification.";
			nextVersions_lazy = () -> Arrays.asList(Clearing4.mmNonGuaranteedTrade);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NonGuaranteedTrade2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Clearing2.mmSettlementNettingEligibleCode, Clearing2.mmClearingSegment, Clearing2.mmGuaranteedTrade, Clearing2.mmNonGuaranteedTrade);
				trace_lazy = () -> Clearing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Clearing2";
				definition = "Provides the clearing details.";
				nextVersions_lazy = () -> Arrays.asList(Clearing4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttlmNetgElgblCd", required = true)
	public NettingEligible1Code getSettlementNettingEligibleCode() {
		return settlementNettingEligibleCode;
	}

	public void setSettlementNettingEligibleCode(NettingEligible1Code settlementNettingEligibleCode) {
		this.settlementNettingEligibleCode = settlementNettingEligibleCode;
	}

	@XmlElement(name = "ClrSgmt")
	public PartyIdentification35Choice getClearingSegment() {
		return clearingSegment;
	}

	public void setClearingSegment(PartyIdentification35Choice clearingSegment) {
		this.clearingSegment = clearingSegment;
	}

	@XmlElement(name = "GrntedTrad")
	public YesNoIndicator getGuaranteedTrade() {
		return guaranteedTrade;
	}

	public void setGuaranteedTrade(YesNoIndicator guaranteedTrade) {
		this.guaranteedTrade = guaranteedTrade;
	}

	@XmlElement(name = "NonGrntedTrad")
	public NonGuaranteedTrade2 getNonGuaranteedTrade() {
		return nonGuaranteedTrade;
	}

	public void setNonGuaranteedTrade(com.tools20022.repository.msg.NonGuaranteedTrade2 nonGuaranteedTrade) {
		this.nonGuaranteedTrade = nonGuaranteedTrade;
	}
}