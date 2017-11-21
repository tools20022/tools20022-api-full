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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "NetObligation1", propOrder = {"obligationIdentification", "amount", "participantNettingIdentification", "obligationDirection", "counterpartyNettingIdentification", "netServiceCounterpartyIdentification",
		"counterpartySettlementInstructions", "transactionsNumber"})
public class NetObligation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text obligationIdentification;
	/**
	 * Unique identification for the obligation.
	 * <p>
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
	public static final MMMessageAttribute mmObligationIdentification = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Obligation.mmObject();
			componentContext_lazy = () -> NetObligation1.mmObject();
			isDerived = false;
			xmlTag = "OblgtnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligationIdentification";
			definition = "Unique identification for the obligation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount amount;
	/**
	 * Amount and currency of the obligation
	 * <p>
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
	 * definition} = "Amount and currency of the obligation"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementAmount;
			componentContext_lazy = () -> NetObligation1.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount and currency of the obligation";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected NettingIdentification1Choice participantNettingIdentification;
	/**
	 * Describes the party or netting group (of the participant receiving the
	 * report) involved in the calculation of the obligation.
	 * <p>
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
	public static final MMMessageAssociationEnd mmParticipantNettingIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> NetObligation1.mmObject();
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
	};
	protected PaymentReceipt1Code obligationDirection;
	/**
	 * Specifies the direction of the obligation.
	 * <p>
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
	 * definition} = "Specifies the direction of the obligation. "</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmObligationDirection = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Netting.mmAmountDirection;
			componentContext_lazy = () -> NetObligation1.mmObject();
			isDerived = false;
			xmlTag = "OblgtnDrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ObligationDirection";
			definition = "Specifies the direction of the obligation. ";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PaymentReceipt1Code.mmObject();
		}
	};
	protected NettingIdentification1Choice counterpartyNettingIdentification;
	/**
	 * Describes the party or netting group (of the counterparty in the
	 * obligation) involved in the calculation of the obligation.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCounterpartyNettingIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeRelatedIdentifications;
			componentContext_lazy = () -> NetObligation1.mmObject();
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
	};
	protected PartyIdentification73Choice netServiceCounterpartyIdentification;
	/**
	 * Describes the counterparty participant involved in the obligation.
	 * <p>
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
	public static final MMMessageAssociationEnd mmNetServiceCounterpartyIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ClearingMemberRole.mmObject();
			componentContext_lazy = () -> NetObligation1.mmObject();
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
	};
	protected SettlementParties29 counterpartySettlementInstructions;
	/**
	 * Specifies the standard settlement instructions used to issue payment to
	 * the counterparty in order to settle the obligation.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCounterpartySettlementInstructions = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Settlement.mmSettlementPartyRole;
			componentContext_lazy = () -> NetObligation1.mmObject();
			isDerived = false;
			xmlTag = "CtrPtySttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySettlementInstructions";
			definition = "Specifies the standard settlement instructions used to issue payment to the counterparty in order to settle the obligation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties29.mmObject();
		}
	};
	protected Max10NumericText transactionsNumber;
	/**
	 * Number of transactions used to calculate the obligation. This is used in
	 * reconciliation between the net report obligation and the previously
	 * provided transaction status updates.
	 * <p>
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
	public static final MMMessageAttribute mmTransactionsNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> NetObligation1.mmObject();
			isDerived = false;
			xmlTag = "TxsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionsNumber";
			definition = "Number of transactions used to calculate the obligation. This is used in reconciliation between the net report obligation and the previously provided transaction status updates.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10NumericText.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(NetObligation1.mmObligationIdentification, NetObligation1.mmAmount, NetObligation1.mmParticipantNettingIdentification, NetObligation1.mmObligationDirection,
						NetObligation1.mmCounterpartyNettingIdentification, NetObligation1.mmNetServiceCounterpartyIdentification, NetObligation1.mmCounterpartySettlementInstructions, NetObligation1.mmTransactionsNumber);
				messageBuildingBlock_lazy = () -> Arrays.asList(NetReportV01.mmNetObligation);
				trace_lazy = () -> Obligation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetObligation1";
				definition = "Describes the amount, direction and parties involved in a payment obligation between two participants (and their netting group or trading party) of a netting service.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "OblgtnId", required = true)
	public Max35Text getObligationIdentification() {
		return obligationIdentification;
	}

	public void setObligationIdentification(Max35Text obligationIdentification) {
		this.obligationIdentification = obligationIdentification;
	}

	@XmlElement(name = "Amt", required = true)
	public ActiveCurrencyAndAmount getAmount() {
		return amount;
	}

	public void setAmount(ActiveCurrencyAndAmount amount) {
		this.amount = amount;
	}

	@XmlElement(name = "PtcptNetgId", required = true)
	public NettingIdentification1Choice getParticipantNettingIdentification() {
		return participantNettingIdentification;
	}

	public void setParticipantNettingIdentification(NettingIdentification1Choice participantNettingIdentification) {
		this.participantNettingIdentification = participantNettingIdentification;
	}

	@XmlElement(name = "OblgtnDrctn", required = true)
	public PaymentReceipt1Code getObligationDirection() {
		return obligationDirection;
	}

	public void setObligationDirection(PaymentReceipt1Code obligationDirection) {
		this.obligationDirection = obligationDirection;
	}

	@XmlElement(name = "CtrPtyNetgId", required = true)
	public NettingIdentification1Choice getCounterpartyNettingIdentification() {
		return counterpartyNettingIdentification;
	}

	public void setCounterpartyNettingIdentification(NettingIdentification1Choice counterpartyNettingIdentification) {
		this.counterpartyNettingIdentification = counterpartyNettingIdentification;
	}

	@XmlElement(name = "NetSvcCtrPtyId")
	public PartyIdentification73Choice getNetServiceCounterpartyIdentification() {
		return netServiceCounterpartyIdentification;
	}

	public void setNetServiceCounterpartyIdentification(PartyIdentification73Choice netServiceCounterpartyIdentification) {
		this.netServiceCounterpartyIdentification = netServiceCounterpartyIdentification;
	}

	@XmlElement(name = "CtrPtySttlmInstrs")
	public SettlementParties29 getCounterpartySettlementInstructions() {
		return counterpartySettlementInstructions;
	}

	public void setCounterpartySettlementInstructions(com.tools20022.repository.msg.SettlementParties29 counterpartySettlementInstructions) {
		this.counterpartySettlementInstructions = counterpartySettlementInstructions;
	}

	@XmlElement(name = "TxsNb")
	public Max10NumericText getTransactionsNumber() {
		return transactionsNumber;
	}

	public void setTransactionsNumber(Max10NumericText transactionsNumber) {
		this.transactionsNumber = transactionsNumber;
	}
}