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
import com.tools20022.repository.choice.PartyIdentification7Choice;
import com.tools20022.repository.codeset.SettlementStatus1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmSettlementStatusOrExtendedSettlementStatusRule
 * SettlementData1.mmSettlementStatusOrExtendedSettlementStatusRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmCashFlowUniqueReference
 * SettlementData1.mmCashFlowUniqueReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmSettlementSystemUniqueReference
 * SettlementData1.mmSettlementSystemUniqueReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmSettlementAmount
 * SettlementData1.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmSettledAmount
 * SettlementData1.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmRejectedAmount
 * SettlementData1.mmRejectedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementData1#mmPayingParty
 * SettlementData1.mmPayingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmReceivingParty
 * SettlementData1.mmReceivingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmSettlementDate
 * SettlementData1.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmSettlementStatus
 * SettlementData1.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmExtendedSettlementStatus
 * SettlementData1.mmExtendedSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmSettlementStatusSubType
 * SettlementData1.mmSettlementStatusSubType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementData1#mmSuspended
 * SettlementData1.mmSuspended}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementData1#mmPending
 * SettlementData1.mmPending}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentObligation
 * PaymentObligation}</li>
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
 * "SettlementData1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information on the settlement of a treasury trade."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SettlementData1", propOrder = {"cashFlowUniqueReference", "settlementSystemUniqueReference", "settlementAmount", "settledAmount", "rejectedAmount", "payingParty", "receivingParty", "settlementDate", "settlementStatus",
		"extendedSettlementStatus", "settlementStatusSubType", "suspended", "pending"})
public class SettlementData1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text cashFlowUniqueReference;
	/**
	 * Unique reference supplied by the trade processing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
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
	public static final MMMessageAttribute mmCashFlowUniqueReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementData1.mmObject();
			isDerived = false;
			xmlTag = "CshFlowUnqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashFlowUniqueReference";
			definition = "Unique reference supplied by the trade processing system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text settlementSystemUniqueReference;
	/**
	 * Unique reference assigned by a settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
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
	public static final MMMessageAttribute mmSettlementSystemUniqueReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementData1.mmObject();
			isDerived = false;
			xmlTag = "SttlmSysUnqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemUniqueReference";
			definition = "Unique reference assigned by a settlement system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount settlementAmount;
	/**
	 * Original amount which should be settled. This information should be
	 * provided when the trade is partially settled or when the settlement is
	 * rejected.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
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
	public static final MMMessageAttribute mmSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> SettlementData1.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Original amount which should be settled. This information should be provided when the trade is partially settled or when the settlement is rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount settledAmount;
	/**
	 * Funds which the trading side is expected to receive.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementAmount
	 * Obligation.mmRequestedSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
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
	public static final MMMessageAttribute mmSettledAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementAmount;
			componentContext_lazy = () -> SettlementData1.mmObject();
			isDerived = false;
			xmlTag = "SttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Funds which the trading side is expected to receive.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveOrHistoricCurrencyAndAmount rejectedAmount;
	/**
	 * Amount that cannot be settled by a settlement system.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
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
	public static final MMMessageAttribute mmRejectedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmRejectedAmount;
			componentContext_lazy = () -> SettlementData1.mmObject();
			isDerived = false;
			xmlTag = "RjctdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedAmount";
			definition = "Amount that cannot be settled by a settlement system.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	protected PartyIdentification7Choice payingParty;
	/**
	 * Specifies the party that pays the settlement amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
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
	public static final MMMessageAssociationEnd mmPayingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SettlementData1.mmObject();
			isDerived = false;
			xmlTag = "PngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayingParty";
			definition = "Specifies the party that pays the settlement amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification7Choice.mmObject();
		}
	};
	protected PartyIdentification7Choice receivingParty;
	/**
	 * Specifies the party that receives the settlement amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
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
	public static final MMMessageAssociationEnd mmReceivingParty = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> SettlementData1.mmObject();
			isDerived = false;
			xmlTag = "RcvgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingParty";
			definition = "Specifies the party that receives the settlement amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentification7Choice.mmObject();
		}
	};
	protected ISODate settlementDate;
	/**
	 * Date on which the settlement is due to settle.
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmValueDate
	 * Payment.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
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
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> SettlementData1.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the settlement is due to settle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected SettlementStatus1Code settlementStatus;
	/**
	 * Specifies the status of a settlement eg rejected, settled or awaiting
	 * authorisation.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
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
	public static final MMMessageAttribute mmSettlementStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmSettlement;
			componentContext_lazy = () -> SettlementData1.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Specifies the status of a settlement eg rejected, settled or awaiting authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStatus1Code.mmObject();
		}
	};
	protected Extended350Code extendedSettlementStatus;
	/**
	 * Description of the status of the settlement of a trade when no coded form
	 * is available.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
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
	public static final MMMessageAttribute mmExtendedSettlementStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementData1.mmObject();
			isDerived = false;
			xmlTag = "XtndedSttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedSettlementStatus";
			definition = "Description of the status of the settlement of a trade when no coded form is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	protected Max70Text settlementStatusSubType;
	/**
	 * Additional information about the cause of the rejection of a settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
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
	public static final MMMessageAttribute mmSettlementStatusSubType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementData1.mmObject();
			isDerived = false;
			xmlTag = "SttlmStsSubTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusSubType";
			definition = "Additional information about the cause of the rejection of a settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}
	};
	protected YesNoIndicator suspended;
	/**
	 * Cash settlement is suspended.
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
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmSettlementSuspended
	 * TreasuryTradeSettlementStatus.mmSettlementSuspended}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
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
	public static final MMMessageAttribute mmSuspended = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmSettlementSuspended;
			componentContext_lazy = () -> SettlementData1.mmObject();
			isDerived = false;
			xmlTag = "Sspd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			definition = "Cash settlement is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator pending;
	/**
	 * Cash settlement is pending.
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
	 * {@linkplain com.tools20022.repository.entity.TreasuryTradeSettlementStatus#mmPendingSettlement
	 * TreasuryTradeSettlementStatus.mmPendingSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
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
	public static final MMMessageAttribute mmPending = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TreasuryTradeSettlementStatus.mmPendingSettlement;
			componentContext_lazy = () -> SettlementData1.mmObject();
			isDerived = false;
			xmlTag = "Pdg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Cash settlement is pending.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.SettlementData1
	 * SettlementData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmSettlementStatus
	 * SettlementData1.mmSettlementStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementData1#mmExtendedSettlementStatus
	 * SettlementData1.mmExtendedSettlementStatus}</li>
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
	public static final MMXor mmSettlementStatusOrExtendedSettlementStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatusOrExtendedSettlementStatusRule";
			messageComponent_lazy = () -> SettlementData1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(SettlementData1.mmSettlementStatus, SettlementData1.mmExtendedSettlementStatus);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SettlementData1.mmCashFlowUniqueReference, SettlementData1.mmSettlementSystemUniqueReference, SettlementData1.mmSettlementAmount, SettlementData1.mmSettledAmount,
						SettlementData1.mmRejectedAmount, SettlementData1.mmPayingParty, SettlementData1.mmReceivingParty, SettlementData1.mmSettlementDate, SettlementData1.mmSettlementStatus, SettlementData1.mmExtendedSettlementStatus,
						SettlementData1.mmSettlementStatusSubType, SettlementData1.mmSuspended, SettlementData1.mmPending);
				trace_lazy = () -> PaymentObligation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementData1";
				definition = "Provides information on the settlement of a treasury trade.";
				xors_lazy = () -> Arrays.asList(SettlementData1.mmSettlementStatusOrExtendedSettlementStatusRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CshFlowUnqRef")
	public Max35Text getCashFlowUniqueReference() {
		return cashFlowUniqueReference;
	}

	public void setCashFlowUniqueReference(Max35Text cashFlowUniqueReference) {
		this.cashFlowUniqueReference = cashFlowUniqueReference;
	}

	@XmlElement(name = "SttlmSysUnqRef")
	public Max35Text getSettlementSystemUniqueReference() {
		return settlementSystemUniqueReference;
	}

	public void setSettlementSystemUniqueReference(Max35Text settlementSystemUniqueReference) {
		this.settlementSystemUniqueReference = settlementSystemUniqueReference;
	}

	@XmlElement(name = "SttlmAmt", required = true)
	public ActiveOrHistoricCurrencyAndAmount getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(ActiveOrHistoricCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	@XmlElement(name = "SttldAmt")
	public ActiveOrHistoricCurrencyAndAmount getSettledAmount() {
		return settledAmount;
	}

	public void setSettledAmount(ActiveOrHistoricCurrencyAndAmount settledAmount) {
		this.settledAmount = settledAmount;
	}

	@XmlElement(name = "RjctdAmt")
	public ActiveOrHistoricCurrencyAndAmount getRejectedAmount() {
		return rejectedAmount;
	}

	public void setRejectedAmount(ActiveOrHistoricCurrencyAndAmount rejectedAmount) {
		this.rejectedAmount = rejectedAmount;
	}

	@XmlElement(name = "PngPty", required = true)
	public PartyIdentification7Choice getPayingParty() {
		return payingParty;
	}

	public void setPayingParty(PartyIdentification7Choice payingParty) {
		this.payingParty = payingParty;
	}

	@XmlElement(name = "RcvgPty", required = true)
	public PartyIdentification7Choice getReceivingParty() {
		return receivingParty;
	}

	public void setReceivingParty(PartyIdentification7Choice receivingParty) {
		this.receivingParty = receivingParty;
	}

	@XmlElement(name = "SttlmDt", required = true)
	public ISODate getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(ISODate settlementDate) {
		this.settlementDate = settlementDate;
	}

	@XmlElement(name = "SttlmSts", required = true)
	public SettlementStatus1Code getSettlementStatus() {
		return settlementStatus;
	}

	public void setSettlementStatus(SettlementStatus1Code settlementStatus) {
		this.settlementStatus = settlementStatus;
	}

	@XmlElement(name = "XtndedSttlmSts", required = true)
	public Extended350Code getExtendedSettlementStatus() {
		return extendedSettlementStatus;
	}

	public void setExtendedSettlementStatus(Extended350Code extendedSettlementStatus) {
		this.extendedSettlementStatus = extendedSettlementStatus;
	}

	@XmlElement(name = "SttlmStsSubTp")
	public Max70Text getSettlementStatusSubType() {
		return settlementStatusSubType;
	}

	public void setSettlementStatusSubType(Max70Text settlementStatusSubType) {
		this.settlementStatusSubType = settlementStatusSubType;
	}

	@XmlElement(name = "Sspd", required = true)
	public YesNoIndicator getSuspended() {
		return suspended;
	}

	public void setSuspended(YesNoIndicator suspended) {
		this.suspended = suspended;
	}

	@XmlElement(name = "Pdg", required = true)
	public YesNoIndicator getPending() {
		return pending;
	}

	public void setPending(YesNoIndicator pending) {
		this.pending = pending;
	}
}