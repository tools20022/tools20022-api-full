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
import com.tools20022.repository.area.camt.NetReportV01;
import com.tools20022.repository.choice.NettingIdentification1Choice;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.codeset.PaymentReceipt1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max10NumericText;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SettlementParties29;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the amount, direction and parties involved in a payment obligation
 * between two participants (and their netting group or trading party) of a
 * netting service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetObligation1#mmObligationIdentification
 * NetObligation1.mmObligationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.NetObligation1#mmAmount
 * NetObligation1.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetObligation1#mmParticipantNettingIdentification
 * NetObligation1.mmParticipantNettingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetObligation1#mmObligationDirection
 * NetObligation1.mmObligationDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetObligation1#mmCounterpartyNettingIdentification
 * NetObligation1.mmCounterpartyNettingIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetObligation1#mmNetServiceCounterpartyIdentification
 * NetObligation1.mmNetServiceCounterpartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetObligation1#mmCounterpartySettlementInstructions
 * NetObligation1.mmCounterpartySettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NetObligation1#mmTransactionsNumber
 * NetObligation1.mmTransactionsNumber}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.NetReportV01#mmNetObligation
 * NetReportV01.mmNetObligation}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintCounterpartySettlementInstructionRule#forNetObligation1
 * ConstraintCounterpartySettlementInstructionRule.forNetObligation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCounterpartyIdentificationRule#forNetObligation1
 * ConstraintCounterpartyIdentificationRule.forNetObligation1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NetObligation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the amount, direction and parties involved in a payment obligation between two participants (and their netting group or trading party) of a netting service."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NetObligation1", propOrder = {"obligationIdentification", "amount", "participantNettingIdentification", "obligationDirection", "counterpartyNettingIdentification", "netServiceCounterpartyIdentification",
		"counterpartySettlementInstructions", "transactionsNumber"})
public class NetObligation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OblgtnId", required = true)
	protected Max35Text obligationIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation Obligation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetObligation1 NetObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgtnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification for the obligation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetObligation1, Max35Text> mmObligationIdentification = new MMMessageAttribute<NetObligation1, Max35Text>() {
		{
			businessComponentTrace_lazy = () -> Obligation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.NetObligation1.mmObject();
			isDerived = false;
			xmlTag = "OblgtnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligationIdentification";
			definition = "Unique identification for the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(NetObligation1 obj) {
			return obj.getObligationIdentification();
		}

		@Override
		public void setValue(NetObligation1 obj, Max35Text value) {
			obj.setObligationIdentification(value);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementAmount
	 * Obligation.mmRequestedSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetObligation1 NetObligation1}</li>
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
	 * definition} = "Amount and currency of the obligation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetObligation1, ActiveCurrencyAndAmount> mmAmount = new MMMessageAttribute<NetObligation1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetObligation1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount and currency of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(NetObligation1 obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(NetObligation1 obj, ActiveCurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "PtcptNetgId", required = true)
	protected NettingIdentification1Choice participantNettingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NettingIdentification1Choice
	 * NettingIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetObligation1 NetObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtcptNetgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantNettingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the party or netting group (of the participant receiving the report) involved in the calculation of the obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NetObligation1, NettingIdentification1Choice> mmParticipantNettingIdentification = new MMMessageAssociationEnd<NetObligation1, NettingIdentification1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetObligation1.mmObject();
			isDerived = false;
			xmlTag = "PtcptNetgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantNettingIdentification";
			definition = "Describes the party or netting group (of the participant receiving the report) involved in the calculation of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NettingIdentification1Choice.mmObject();
		}

		@Override
		public NettingIdentification1Choice getValue(NetObligation1 obj) {
			return obj.getParticipantNettingIdentification();
		}

		@Override
		public void setValue(NetObligation1 obj, NettingIdentification1Choice value) {
			obj.setParticipantNettingIdentification(value);
		}
	};
	@XmlElement(name = "OblgtnDrctn", required = true)
	protected PaymentReceipt1Code obligationDirection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentReceipt1Code
	 * PaymentReceipt1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Netting#mmAmountDirection
	 * Netting.mmAmountDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetObligation1 NetObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OblgtnDrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ObligationDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the direction of the obligation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetObligation1, PaymentReceipt1Code> mmObligationDirection = new MMMessageAttribute<NetObligation1, PaymentReceipt1Code>() {
		{
			businessElementTrace_lazy = () -> Netting.mmAmountDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetObligation1.mmObject();
			isDerived = false;
			xmlTag = "OblgtnDrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligationDirection";
			definition = "Specifies the direction of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentReceipt1Code.mmObject();
		}

		@Override
		public PaymentReceipt1Code getValue(NetObligation1 obj) {
			return obj.getObligationDirection();
		}

		@Override
		public void setValue(NetObligation1 obj, PaymentReceipt1Code value) {
			obj.setObligationDirection(value);
		}
	};
	@XmlElement(name = "CtrPtyNetgId", required = true)
	protected NettingIdentification1Choice counterpartyNettingIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.NettingIdentification1Choice
	 * NettingIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetObligation1 NetObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyNetgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyNettingIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the party or netting group (of the counterparty in the obligation) involved in the calculation of the obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NetObligation1, NettingIdentification1Choice> mmCounterpartyNettingIdentification = new MMMessageAssociationEnd<NetObligation1, NettingIdentification1Choice>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetObligation1.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyNetgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyNettingIdentification";
			definition = "Describes the party or netting group (of the counterparty in the obligation) involved in the calculation of the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> NettingIdentification1Choice.mmObject();
		}

		@Override
		public NettingIdentification1Choice getValue(NetObligation1 obj) {
			return obj.getCounterpartyNettingIdentification();
		}

		@Override
		public void setValue(NetObligation1 obj, NettingIdentification1Choice value) {
			obj.setCounterpartyNettingIdentification(value);
		}
	};
	@XmlElement(name = "NetSvcCtrPtyId")
	protected PartyIdentification73Choice netServiceCounterpartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ClearingMemberRole
	 * ClearingMemberRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetObligation1 NetObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetSvcCtrPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetServiceCounterpartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Describes the counterparty participant involved in the obligation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NetObligation1, Optional<PartyIdentification73Choice>> mmNetServiceCounterpartyIdentification = new MMMessageAssociationEnd<NetObligation1, Optional<PartyIdentification73Choice>>() {
		{
			businessComponentTrace_lazy = () -> ClearingMemberRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.NetObligation1.mmObject();
			isDerived = false;
			xmlTag = "NetSvcCtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetServiceCounterpartyIdentification";
			definition = "Describes the counterparty participant involved in the obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(NetObligation1 obj) {
			return obj.getNetServiceCounterpartyIdentification();
		}

		@Override
		public void setValue(NetObligation1 obj, Optional<PartyIdentification73Choice> value) {
			obj.setNetServiceCounterpartyIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrPtySttlmInstrs")
	protected SettlementParties29 counterpartySettlementInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties29
	 * SettlementParties29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmSettlementPartyRole
	 * Settlement.mmSettlementPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NetObligation1 NetObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySttlmInstrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the standard settlement instructions used to issue payment to the counterparty in order to settle the obligation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NetObligation1, Optional<SettlementParties29>> mmCounterpartySettlementInstructions = new MMMessageAssociationEnd<NetObligation1, Optional<SettlementParties29>>() {
		{
			businessElementTrace_lazy = () -> Settlement.mmSettlementPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.NetObligation1.mmObject();
			isDerived = false;
			xmlTag = "CtrPtySttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySettlementInstructions";
			definition = "Specifies the standard settlement instructions used to issue payment to the counterparty in order to settle the obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties29.mmObject();
		}

		@Override
		public Optional<SettlementParties29> getValue(NetObligation1 obj) {
			return obj.getCounterpartySettlementInstructions();
		}

		@Override
		public void setValue(NetObligation1 obj, Optional<SettlementParties29> value) {
			obj.setCounterpartySettlementInstructions(value.orElse(null));
		}
	};
	@XmlElement(name = "TxsNb")
	protected Max10NumericText transactionsNumber;
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
	 * {@linkplain com.tools20022.repository.msg.NetObligation1 NetObligation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of transactions used to calculate the obligation. This is used in reconciliation between the net report obligation and the previously provided transaction status updates."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NetObligation1, Optional<Max10NumericText>> mmTransactionsNumber = new MMMessageAttribute<NetObligation1, Optional<Max10NumericText>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.NetObligation1.mmObject();
			isDerived = false;
			xmlTag = "TxsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsNumber";
			definition = "Number of transactions used to calculate the obligation. This is used in reconciliation between the net report obligation and the previously provided transaction status updates.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10NumericText.mmObject();
		}

		@Override
		public Optional<Max10NumericText> getValue(NetObligation1 obj) {
			return obj.getTransactionsNumber();
		}

		@Override
		public void setValue(NetObligation1 obj, Optional<Max10NumericText> value) {
			obj.setTransactionsNumber(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NetObligation1.mmObligationIdentification, com.tools20022.repository.msg.NetObligation1.mmAmount,
						com.tools20022.repository.msg.NetObligation1.mmParticipantNettingIdentification, com.tools20022.repository.msg.NetObligation1.mmObligationDirection,
						com.tools20022.repository.msg.NetObligation1.mmCounterpartyNettingIdentification, com.tools20022.repository.msg.NetObligation1.mmNetServiceCounterpartyIdentification,
						com.tools20022.repository.msg.NetObligation1.mmCounterpartySettlementInstructions, com.tools20022.repository.msg.NetObligation1.mmTransactionsNumber);
				messageBuildingBlock_lazy = () -> Arrays.asList(NetReportV01.mmNetObligation);
				trace_lazy = () -> Obligation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCounterpartySettlementInstructionRule.forNetObligation1,
						com.tools20022.repository.constraints.ConstraintCounterpartyIdentificationRule.forNetObligation1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetObligation1";
				definition = "Describes the amount, direction and parties involved in a payment obligation between two participants (and their netting group or trading party) of a netting service.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getObligationIdentification() {
		return obligationIdentification;
	}

	public NetObligation1 setObligationIdentification(Max35Text obligationIdentification) {
		this.obligationIdentification = Objects.requireNonNull(obligationIdentification);
		return this;
	}

	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public NetObligation1 setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public NettingIdentification1Choice getParticipantNettingIdentification() {
		return participantNettingIdentification;
	}

	public NetObligation1 setParticipantNettingIdentification(NettingIdentification1Choice participantNettingIdentification) {
		this.participantNettingIdentification = Objects.requireNonNull(participantNettingIdentification);
		return this;
	}

	public PaymentReceipt1Code getObligationDirection() {
		return obligationDirection;
	}

	public NetObligation1 setObligationDirection(PaymentReceipt1Code obligationDirection) {
		this.obligationDirection = Objects.requireNonNull(obligationDirection);
		return this;
	}

	public NettingIdentification1Choice getCounterpartyNettingIdentification() {
		return counterpartyNettingIdentification;
	}

	public NetObligation1 setCounterpartyNettingIdentification(NettingIdentification1Choice counterpartyNettingIdentification) {
		this.counterpartyNettingIdentification = Objects.requireNonNull(counterpartyNettingIdentification);
		return this;
	}

	public Optional<PartyIdentification73Choice> getNetServiceCounterpartyIdentification() {
		return netServiceCounterpartyIdentification == null ? Optional.empty() : Optional.of(netServiceCounterpartyIdentification);
	}

	public NetObligation1 setNetServiceCounterpartyIdentification(PartyIdentification73Choice netServiceCounterpartyIdentification) {
		this.netServiceCounterpartyIdentification = netServiceCounterpartyIdentification;
		return this;
	}

	public Optional<SettlementParties29> getCounterpartySettlementInstructions() {
		return counterpartySettlementInstructions == null ? Optional.empty() : Optional.of(counterpartySettlementInstructions);
	}

	public NetObligation1 setCounterpartySettlementInstructions(SettlementParties29 counterpartySettlementInstructions) {
		this.counterpartySettlementInstructions = counterpartySettlementInstructions;
		return this;
	}

	public Optional<Max10NumericText> getTransactionsNumber() {
		return transactionsNumber == null ? Optional.empty() : Optional.of(transactionsNumber);
	}

	public NetObligation1 setTransactionsNumber(Max10NumericText transactionsNumber) {
		this.transactionsNumber = transactionsNumber;
		return this;
	}
}