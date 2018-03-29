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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02;
import com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02;
import com.tools20022.repository.choice.PartyIdentification8Choice;
import com.tools20022.repository.codeset.SettlementStatus1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.entity.TreasuryTradeSettlementStatus;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information on the settlement of a treasury trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData2#SettlementStatusOrExtendedSettlementStatusRule
 * SettlementData2.SettlementStatusOrExtendedSettlementStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmCashFlowUniqueReference
 * SettlementData2.mmCashFlowUniqueReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmSettlementSystemUniqueReference
 * SettlementData2.mmSettlementSystemUniqueReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmSettlementAmount
 * SettlementData2.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmSettledAmount
 * SettlementData2.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmRejectedAmount
 * SettlementData2.mmRejectedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementData2#mmPayingParty
 * SettlementData2.mmPayingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmReceivingParty
 * SettlementData2.mmReceivingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmSettlementDate
 * SettlementData2.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmSettlementStatus
 * SettlementData2.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmExtendedSettlementStatus
 * SettlementData2.mmExtendedSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmSettlementStatusSubType
 * SettlementData2.mmSettlementStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementData2#mmSuspended
 * SettlementData2.mmSuspended}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementData2#mmPending
 * SettlementData2.mmPending}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentObligation
 * PaymentObligation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.NonDeliverableForwardNotificationV02#mmSettlementData
 * NonDeliverableForwardNotificationV02.mmSettlementData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.ForeignExchangeOptionNotificationV02#mmSettlementData
 * ForeignExchangeOptionNotificationV02.mmSettlementData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementData2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information on the settlement of a treasury trade."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementData2", propOrder = {"cashFlowUniqueReference", "settlementSystemUniqueReference", "settlementAmount", "settledAmount", "rejectedAmount", "payingParty", "receivingParty", "settlementDate", "settlementStatus",
		"extendedSettlementStatus", "settlementStatusSubType", "suspended", "pending"})
public class SettlementData2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CshFlowUnqRef")
	protected Max35Text cashFlowUniqueReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshFlowUnqRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashFlowUniqueReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique reference supplied by the trade processing system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementData2, Optional<Max35Text>> mmCashFlowUniqueReference = new MMMessageAttribute<SettlementData2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			isDerived = false;
			xmlTag = "CshFlowUnqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashFlowUniqueReference";
			definition = "Unique reference supplied by the trade processing system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SettlementData2 obj) {
			return obj.getCashFlowUniqueReference();
		}

		@Override
		public void setValue(SettlementData2 obj, Optional<Max35Text> value) {
			obj.setCashFlowUniqueReference(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmSysUnqRef")
	protected Max35Text settlementSystemUniqueReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSysUnqRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemUniqueReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique reference assigned by a settlement system."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementData2, Optional<Max35Text>> mmSettlementSystemUniqueReference = new MMMessageAttribute<SettlementData2, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			isDerived = false;
			xmlTag = "SttlmSysUnqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemUniqueReference";
			definition = "Unique reference assigned by a settlement system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SettlementData2 obj) {
			return obj.getSettlementSystemUniqueReference();
		}

		@Override
		public void setValue(SettlementData2 obj, Optional<Max35Text> value) {
			obj.setSettlementSystemUniqueReference(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAmt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original amount which should be settled. This information should be provided when the trade is partially settled or when the settlement is rejected."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementData2, ActiveOrHistoricCurrencyAndAmount> mmSettlementAmount = new MMMessageAttribute<SettlementData2, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Original amount which should be settled. This information should be provided when the trade is partially settled or when the settlement is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(SettlementData2 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(SettlementData2 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setSettlementAmount(value);
		}
	};
	@XmlElement(name = "SttldAmt")
	protected ActiveOrHistoricCurrencyAndAmount settledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Funds which the trading side is expected to receive."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementData2, Optional<ActiveOrHistoricCurrencyAndAmount>> mmSettledAmount = new MMMessageAttribute<SettlementData2, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			isDerived = false;
			xmlTag = "SttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Funds which the trading side is expected to receive.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(SettlementData2 obj) {
			return obj.getSettledAmount();
		}

		@Override
		public void setValue(SettlementData2 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setSettledAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RjctdAmt")
	protected ActiveOrHistoricCurrencyAndAmount rejectedAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmRejectedAmount
	 * TreasuryTradeSettlementStatus.mmRejectedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount that cannot be settled by a settlement system."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementData2, Optional<ActiveOrHistoricCurrencyAndAmount>> mmRejectedAmount = new MMMessageAttribute<SettlementData2, Optional<ActiveOrHistoricCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmRejectedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			isDerived = false;
			xmlTag = "RjctdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedAmount";
			definition = "Amount that cannot be settled by a settlement system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAndAmount> getValue(SettlementData2 obj) {
			return obj.getRejectedAmount();
		}

		@Override
		public void setValue(SettlementData2 obj, Optional<ActiveOrHistoricCurrencyAndAmount> value) {
			obj.setRejectedAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PngPty", required = true)
	protected PartyIdentification8Choice payingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PngPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the party that pays the settlement amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementData2, PartyIdentification8Choice> mmPayingParty = new MMMessageAssociationEnd<SettlementData2, PartyIdentification8Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			isDerived = false;
			xmlTag = "PngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingParty";
			definition = "Specifies the party that pays the settlement amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification8Choice.mmObject();
		}

		@Override
		public PartyIdentification8Choice getValue(SettlementData2 obj) {
			return obj.getPayingParty();
		}

		@Override
		public void setValue(SettlementData2 obj, PartyIdentification8Choice value) {
			obj.setPayingParty(value);
		}
	};
	@XmlElement(name = "RcvgPty", required = true)
	protected PartyIdentification8Choice receivingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the party that receives the settlement amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementData2, PartyIdentification8Choice> mmReceivingParty = new MMMessageAssociationEnd<SettlementData2, PartyIdentification8Choice>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			isDerived = false;
			xmlTag = "RcvgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingParty";
			definition = "Specifies the party that receives the settlement amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification8Choice.mmObject();
		}

		@Override
		public PartyIdentification8Choice getValue(SettlementData2 obj) {
			return obj.getReceivingParty();
		}

		@Override
		public void setValue(SettlementData2 obj, PartyIdentification8Choice value) {
			obj.setReceivingParty(value);
		}
	};
	@XmlElement(name = "SttlmDt", required = true)
	protected ISODate settlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the settlement is due to settle."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementData2, ISODate> mmSettlementDate = new MMMessageAttribute<SettlementData2, ISODate>() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the settlement is due to settle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(SettlementData2 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(SettlementData2 obj, ISODate value) {
			obj.setSettlementDate(value);
		}
	};
	@XmlElement(name = "SttlmSts", required = true)
	protected SettlementStatus1Code settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus1Code
	 * SettlementStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmSettlement
	 * TreasuryTradeSettlementStatus.mmSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of a settlement eg rejected, settled or awaiting authorisation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementData2, SettlementStatus1Code> mmSettlementStatus = new MMMessageAttribute<SettlementData2, SettlementStatus1Code>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Specifies the status of a settlement eg rejected, settled or awaiting authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStatus1Code.mmObject();
		}

		@Override
		public SettlementStatus1Code getValue(SettlementData2 obj) {
			return obj.getSettlementStatus();
		}

		@Override
		public void setValue(SettlementData2 obj, SettlementStatus1Code value) {
			obj.setSettlementStatus(value);
		}
	};
	@XmlElement(name = "XtndedSttlmSts", required = true)
	protected Extended350Code extendedSettlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedSttlmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedSettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Description of the status of the settlement of a trade when no coded form is available."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementData2, Extended350Code> mmExtendedSettlementStatus = new MMMessageAttribute<SettlementData2, Extended350Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			isDerived = false;
			xmlTag = "XtndedSttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedSettlementStatus";
			definition = "Description of the status of the settlement of a trade when no coded form is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}

		@Override
		public Extended350Code getValue(SettlementData2 obj) {
			return obj.getExtendedSettlementStatus();
		}

		@Override
		public void setValue(SettlementData2 obj, Extended350Code value) {
			obj.setExtendedSettlementStatus(value);
		}
	};
	@XmlElement(name = "SttlmStsSubTp")
	protected Max70Text settlementStatusSubType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmStsSubTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusSubType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about the cause of the rejection of a settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementData2, Optional<Max70Text>> mmSettlementStatusSubType = new MMMessageAttribute<SettlementData2, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			isDerived = false;
			xmlTag = "SttlmStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusSubType";
			definition = "Additional information about the cause of the rejection of a settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(SettlementData2 obj) {
			return obj.getSettlementStatusSubType();
		}

		@Override
		public void setValue(SettlementData2 obj, Optional<Max70Text> value) {
			obj.setSettlementStatusSubType(value.orElse(null));
		}
	};
	@XmlElement(name = "Sspd", required = true)
	protected YesNoIndicator suspended;
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
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmSettlementSuspended
	 * TreasuryTradeSettlementStatus.mmSettlementSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sspd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement is suspended."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementData2, YesNoIndicator> mmSuspended = new MMMessageAttribute<SettlementData2, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmSettlementSuspended;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			isDerived = false;
			xmlTag = "Sspd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Cash settlement is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SettlementData2 obj) {
			return obj.getSuspended();
		}

		@Override
		public void setValue(SettlementData2 obj, YesNoIndicator value) {
			obj.setSuspended(value);
		}
	};
	@XmlElement(name = "Pdg", required = true)
	protected YesNoIndicator pending;
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
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmPendingSettlement
	 * TreasuryTradeSettlementStatus.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pdg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement is pending."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementData2, YesNoIndicator> mmPending = new MMMessageAttribute<SettlementData2, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmPendingSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			isDerived = false;
			xmlTag = "Pdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Cash settlement is pending.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(SettlementData2 obj) {
			return obj.getPending();
		}

		@Override
		public void setValue(SettlementData2 obj, YesNoIndicator value) {
			obj.setPending(value);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData2
	 * SettlementData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmSettlementStatus
	 * SettlementData2.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData2#mmExtendedSettlementStatus
	 * SettlementData2.mmExtendedSettlementStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatusOrExtendedSettlementStatusRule"</li>
	 * </ul>
	 */
	public static final MMXor SettlementStatusOrExtendedSettlementStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusOrExtendedSettlementStatusRule";
			messageComponent_lazy = () -> com.tools20022.repository.msg.SettlementData2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementData2.mmSettlementStatus, com.tools20022.repository.msg.SettlementData2.mmExtendedSettlementStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementData2.mmCashFlowUniqueReference, com.tools20022.repository.msg.SettlementData2.mmSettlementSystemUniqueReference,
						com.tools20022.repository.msg.SettlementData2.mmSettlementAmount, com.tools20022.repository.msg.SettlementData2.mmSettledAmount, com.tools20022.repository.msg.SettlementData2.mmRejectedAmount,
						com.tools20022.repository.msg.SettlementData2.mmPayingParty, com.tools20022.repository.msg.SettlementData2.mmReceivingParty, com.tools20022.repository.msg.SettlementData2.mmSettlementDate,
						com.tools20022.repository.msg.SettlementData2.mmSettlementStatus, com.tools20022.repository.msg.SettlementData2.mmExtendedSettlementStatus, com.tools20022.repository.msg.SettlementData2.mmSettlementStatusSubType,
						com.tools20022.repository.msg.SettlementData2.mmSuspended, com.tools20022.repository.msg.SettlementData2.mmPending);
				messageBuildingBlock_lazy = () -> Arrays.asList(NonDeliverableForwardNotificationV02.mmSettlementData, ForeignExchangeOptionNotificationV02.mmSettlementData);
				trace_lazy = () -> PaymentObligation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SettlementData2";
				definition = "Provides information on the settlement of a treasury trade.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementData2.SettlementStatusOrExtendedSettlementStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getCashFlowUniqueReference() {
		return cashFlowUniqueReference == null ? Optional.empty() : Optional.of(cashFlowUniqueReference);
	}

	public SettlementData2 setCashFlowUniqueReference(Max35Text cashFlowUniqueReference) {
		this.cashFlowUniqueReference = cashFlowUniqueReference;
		return this;
	}

	public Optional<Max35Text> getSettlementSystemUniqueReference() {
		return settlementSystemUniqueReference == null ? Optional.empty() : Optional.of(settlementSystemUniqueReference);
	}

	public SettlementData2 setSettlementSystemUniqueReference(Max35Text settlementSystemUniqueReference) {
		this.settlementSystemUniqueReference = settlementSystemUniqueReference;
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getSettlementAmount() {
		return settlementAmount;
	}

	public SettlementData2 setSettlementAmount(ActiveOrHistoricCurrencyAndAmount settlementAmount) {
		this.settlementAmount = Objects.requireNonNull(settlementAmount);
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getSettledAmount() {
		return settledAmount == null ? Optional.empty() : Optional.of(settledAmount);
	}

	public SettlementData2 setSettledAmount(ActiveOrHistoricCurrencyAndAmount settledAmount) {
		this.settledAmount = settledAmount;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getRejectedAmount() {
		return rejectedAmount == null ? Optional.empty() : Optional.of(rejectedAmount);
	}

	public SettlementData2 setRejectedAmount(ActiveOrHistoricCurrencyAndAmount rejectedAmount) {
		this.rejectedAmount = rejectedAmount;
		return this;
	}

	public PartyIdentification8Choice getPayingParty() {
		return payingParty;
	}

	public SettlementData2 setPayingParty(PartyIdentification8Choice payingParty) {
		this.payingParty = Objects.requireNonNull(payingParty);
		return this;
	}

	public PartyIdentification8Choice getReceivingParty() {
		return receivingParty;
	}

	public SettlementData2 setReceivingParty(PartyIdentification8Choice receivingParty) {
		this.receivingParty = Objects.requireNonNull(receivingParty);
		return this;
	}

	public ISODate getSettlementDate() {
		return settlementDate;
	}

	public SettlementData2 setSettlementDate(ISODate settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public SettlementStatus1Code getSettlementStatus() {
		return settlementStatus;
	}

	public SettlementData2 setSettlementStatus(SettlementStatus1Code settlementStatus) {
		this.settlementStatus = Objects.requireNonNull(settlementStatus);
		return this;
	}

	public Extended350Code getExtendedSettlementStatus() {
		return extendedSettlementStatus;
	}

	public SettlementData2 setExtendedSettlementStatus(Extended350Code extendedSettlementStatus) {
		this.extendedSettlementStatus = Objects.requireNonNull(extendedSettlementStatus);
		return this;
	}

	public Optional<Max70Text> getSettlementStatusSubType() {
		return settlementStatusSubType == null ? Optional.empty() : Optional.of(settlementStatusSubType);
	}

	public SettlementData2 setSettlementStatusSubType(Max70Text settlementStatusSubType) {
		this.settlementStatusSubType = settlementStatusSubType;
		return this;
	}

	public YesNoIndicator getSuspended() {
		return suspended;
	}

	public SettlementData2 setSuspended(YesNoIndicator suspended) {
		this.suspended = Objects.requireNonNull(suspended);
		return this;
	}

	public YesNoIndicator getPending() {
		return pending;
	}

	public SettlementData2 setPending(YesNoIndicator pending) {
		this.pending = Objects.requireNonNull(pending);
		return this;
	}
}