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
import com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03;
import com.tools20022.repository.area.secl.TradeLegNotificationV03;
import com.tools20022.repository.choice.PartyIdentification35Choice;
import com.tools20022.repository.codeset.NettingEligible1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Clearing;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.NonGuaranteedTrade3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.Clearing4#mmSettlementNettingEligibleCode
 * Clearing4.mmSettlementNettingEligibleCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing4#mmClearingSegment
 * Clearing4.mmClearingSegment}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing4#mmGuaranteedTrade
 * Clearing4.mmGuaranteedTrade}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Clearing4#mmNonGuaranteedTrade
 * Clearing4.mmNonGuaranteedTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Clearing Clearing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationV03#mmClearingDetails
 * TradeLegNotificationV03.mmClearingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.TradeLegNotificationCancellationV03#mmClearingDetails
 * TradeLegNotificationCancellationV03.mmClearingDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNonGuaranteedTradePresenceRule#forClearing4
 * ConstraintNonGuaranteedTradePresenceRule.forClearing4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Clearing4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the clearing details."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Clearing2
 * Clearing2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Clearing4", propOrder = {"settlementNettingEligibleCode", "clearingSegment", "guaranteedTrade", "nonGuaranteedTrade"})
public class Clearing4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttlmNetgElgblCd", required = true)
	protected NettingEligible1Code settlementNettingEligibleCode;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Clearing4
	 * Clearing4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Clearing2#mmSettlementNettingEligibleCode
	 * Clearing2.mmSettlementNettingEligibleCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Clearing4, NettingEligible1Code> mmSettlementNettingEligibleCode = new MMMessageAttribute<Clearing4, NettingEligible1Code>() {
		{
			businessElementTrace_lazy = () -> Trade.mmSettlementNetting;
			componentContext_lazy = () -> com.tools20022.repository.msg.Clearing4.mmObject();
			isDerived = false;
			xmlTag = "SttlmNetgElgblCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementNettingEligibleCode";
			definition = "Indicates to the clearing member whether the trade is eligible for settlement netting or not.";
			previousVersion_lazy = () -> Clearing2.mmSettlementNettingEligibleCode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NettingEligible1Code.mmObject();
		}

		@Override
		public NettingEligible1Code getValue(Clearing4 obj) {
			return obj.getSettlementNettingEligibleCode();
		}

		@Override
		public void setValue(Clearing4 obj, NettingEligible1Code value) {
			obj.setSettlementNettingEligibleCode(value);
		}
	};
	@XmlElement(name = "ClrSgmt")
	protected PartyIdentification35Choice clearingSegment;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Clearing4
	 * Clearing4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Clearing2#mmClearingSegment
	 * Clearing2.mmClearingSegment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Clearing4, Optional<PartyIdentification35Choice>> mmClearingSegment = new MMMessageAttribute<Clearing4, Optional<PartyIdentification35Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Clearing4.mmObject();
			isDerived = false;
			xmlTag = "ClrSgmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSegment";
			definition = "Clearing organisation that will clear the trade.\r\nNote: This field allows clearing member firm to segregate flows coming from clearing counterparty's clearing system. Indeed, clearing member firms receive messages from the same system (same sender) and this field allows them to know if the message is related to equities or derivatives.";
			previousVersion_lazy = () -> Clearing2.mmClearingSegment;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification35Choice> getValue(Clearing4 obj) {
			return obj.getClearingSegment();
		}

		@Override
		public void setValue(Clearing4 obj, Optional<PartyIdentification35Choice> value) {
			obj.setClearingSegment(value.orElse(null));
		}
	};
	@XmlElement(name = "GrntedTrad")
	protected YesNoIndicator guaranteedTrade;
	/**
	 * 
	 <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Clearing4
	 * Clearing4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Clearing2#mmGuaranteedTrade
	 * Clearing2.mmGuaranteedTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Clearing4, Optional<YesNoIndicator>> mmGuaranteedTrade = new MMMessageAttribute<Clearing4, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Clearing.mmGuaranteedTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.Clearing4.mmObject();
			isDerived = false;
			xmlTag = "GrntedTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedTrade";
			definition = "Indicates if the position is guaranteed or non-guaranteed by the central counterparty, that is whether the CCP has done the novation and then guarantees the trade, or not.";
			previousVersion_lazy = () -> Clearing2.mmGuaranteedTrade;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Clearing4 obj) {
			return obj.getGuaranteedTrade();
		}

		@Override
		public void setValue(Clearing4 obj, Optional<YesNoIndicator> value) {
			obj.setGuaranteedTrade(value.orElse(null));
		}
	};
	@XmlElement(name = "NonGrntedTrad")
	protected NonGuaranteedTrade3 nonGuaranteedTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3
	 * NonGuaranteedTrade3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
	 * SecuritiesTradeExecution.mmRelatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Clearing4
	 * Clearing4}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Clearing2#mmNonGuaranteedTrade
	 * Clearing2.mmNonGuaranteedTrade}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Clearing4, Optional<NonGuaranteedTrade3>> mmNonGuaranteedTrade = new MMMessageAssociationEnd<Clearing4, Optional<NonGuaranteedTrade3>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmRelatedTrade;
			componentContext_lazy = () -> com.tools20022.repository.msg.Clearing4.mmObject();
			isDerived = false;
			xmlTag = "NonGrntedTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonGuaranteedTrade";
			definition = "In case of trades that are not guaranteed by the central counterparty (this is when the central counterparty has not done the novation), provides details such as the trade counterparty member identification or the trade counterparty clearing member identification.";
			previousVersion_lazy = () -> Clearing2.mmNonGuaranteedTrade;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NonGuaranteedTrade3.mmObject();
		}

		@Override
		public Optional<NonGuaranteedTrade3> getValue(Clearing4 obj) {
			return obj.getNonGuaranteedTrade();
		}

		@Override
		public void setValue(Clearing4 obj, Optional<NonGuaranteedTrade3> value) {
			obj.setNonGuaranteedTrade(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Clearing4.mmSettlementNettingEligibleCode, com.tools20022.repository.msg.Clearing4.mmClearingSegment,
						com.tools20022.repository.msg.Clearing4.mmGuaranteedTrade, com.tools20022.repository.msg.Clearing4.mmNonGuaranteedTrade);
				messageBuildingBlock_lazy = () -> Arrays.asList(TradeLegNotificationV03.mmClearingDetails, TradeLegNotificationCancellationV03.mmClearingDetails);
				trace_lazy = () -> Clearing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNonGuaranteedTradePresenceRule.forClearing4);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Clearing4";
				definition = "Provides the clearing details.";
				previousVersion_lazy = () -> Clearing2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public NettingEligible1Code getSettlementNettingEligibleCode() {
		return settlementNettingEligibleCode;
	}

	public Clearing4 setSettlementNettingEligibleCode(NettingEligible1Code settlementNettingEligibleCode) {
		this.settlementNettingEligibleCode = Objects.requireNonNull(settlementNettingEligibleCode);
		return this;
	}

	public Optional<PartyIdentification35Choice> getClearingSegment() {
		return clearingSegment == null ? Optional.empty() : Optional.of(clearingSegment);
	}

	public Clearing4 setClearingSegment(PartyIdentification35Choice clearingSegment) {
		this.clearingSegment = clearingSegment;
		return this;
	}

	public Optional<YesNoIndicator> getGuaranteedTrade() {
		return guaranteedTrade == null ? Optional.empty() : Optional.of(guaranteedTrade);
	}

	public Clearing4 setGuaranteedTrade(YesNoIndicator guaranteedTrade) {
		this.guaranteedTrade = guaranteedTrade;
		return this;
	}

	public Optional<NonGuaranteedTrade3> getNonGuaranteedTrade() {
		return nonGuaranteedTrade == null ? Optional.empty() : Optional.of(nonGuaranteedTrade);
	}

	public Clearing4 setNonGuaranteedTrade(NonGuaranteedTrade3 nonGuaranteedTrade) {
		this.nonGuaranteedTrade = nonGuaranteedTrade;
		return this;
	}
}