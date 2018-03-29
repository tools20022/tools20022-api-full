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
import com.tools20022.repository.area.sese.TransferInInstructionV08;
import com.tools20022.repository.area.sese.TransferOutInstructionV07;
import com.tools20022.repository.area.sese.TransferOutInstructionV08;
import com.tools20022.repository.choice.ChargePaymentMethod1Choice;
import com.tools20022.repository.choice.DateFormat1Choice;
import com.tools20022.repository.choice.Quantity42Choice;
import com.tools20022.repository.choice.TransferReason1Choice;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.BusinessFlowType1Code;
import com.tools20022.repository.codeset.HoldingsPlanType1Code;
import com.tools20022.repository.codeset.RoundingDirection2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AdditionalReference8;
import com.tools20022.repository.msg.FinancialInstrument63;
import com.tools20022.repository.msg.PartyIdentificationAndAccount156;
import com.tools20022.repository.msg.Unit8;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters applied to the settlement of a security transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer34#mmTransferReference
 * Transfer34.mmTransferReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer34#mmClientReference
 * Transfer34.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer34#mmCounterpartyReference
 * Transfer34.mmCounterpartyReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer34#mmBusinessFlowType
 * Transfer34.mmBusinessFlowType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer34#mmRequestedTransferDate
 * Transfer34.mmRequestedTransferDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer34#mmRequestedSettlementDate
 * Transfer34.mmRequestedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer34#mmTransferOrderDateForm
 * Transfer34.mmTransferOrderDateForm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer34#mmTransferReason
 * Transfer34.mmTransferReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer34#mmHoldingsPlanType
 * Transfer34.mmHoldingsPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer34#mmFinancialInstrumentDetails
 * Transfer34.mmFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer34#mmQuantity
 * Transfer34.mmQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer34#mmUnitsDetails
 * Transfer34.mmUnitsDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer34#mmRounding
 * Transfer34.mmRounding}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer34#mmAveragePrice
 * Transfer34.mmAveragePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer34#mmTransferCurrency
 * Transfer34.mmTransferCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer34#mmOwnAccountTransferIndicator
 * Transfer34.mmOwnAccountTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer34#mmNonStandardSettlementInformation
 * Transfer34.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer34#mmReceivingAgentDetails
 * Transfer34.mmReceivingAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer34#mmDeliveringAgentDetails
 * Transfer34.mmDeliveringAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer34#mmTransferExpensesPaymentType
 * Transfer34.mmTransferExpensesPaymentType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
 * SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV08#mmTransferDetails
 * TransferInInstructionV08.mmTransferDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV08#mmTransferDetails
 * TransferOutInstructionV08.mmTransferDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer34
 * ConstraintTotalUnitsNumberRule.forTransfer34}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Transfer34"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to the settlement of a security transfer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Transfer30
 * Transfer30}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Transfer34", propOrder = {"transferReference", "clientReference", "counterpartyReference", "businessFlowType", "requestedTransferDate", "requestedSettlementDate", "transferOrderDateForm", "transferReason",
		"holdingsPlanType", "financialInstrumentDetails", "quantity", "unitsDetails", "rounding", "averagePrice", "transferCurrency", "ownAccountTransferIndicator", "nonStandardSettlementInformation", "receivingAgentDetails",
		"deliveringAgentDetails", "transferExpensesPaymentType"})
public class Transfer34 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrfRef", required = true)
	protected Max35Text transferReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmIdentification
	 * SecuritiesTransfer.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for the transfer instruction, as assigned by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferReference
	 * Transfer30.mmTransferReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Max35Text> mmTransferReference = new MMMessageAttribute<Transfer34, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "TrfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReference";
			definition = "Unique and unambiguous identifier for the transfer instruction, as assigned by the instructing party.";
			previousVersion_lazy = () -> Transfer30.mmTransferReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Transfer34 obj) {
			return obj.getTransferReference();
		}

		@Override
		public void setValue(Transfer34 obj, Max35Text value) {
			obj.setTransferReference(value);
		}
	};
	@XmlElement(name = "ClntRef")
	protected AdditionalReference8 clientReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of the transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmClientReference
	 * Transfer30.mmClientReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Optional<AdditionalReference8>> mmClientReference = new MMMessageAttribute<Transfer34, Optional<AdditionalReference8>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of the transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client.";
			previousVersion_lazy = () -> Transfer30.mmClientReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference8.mmObject();
		}

		@Override
		public Optional<AdditionalReference8> getValue(Transfer34 obj) {
			return obj.getClientReference();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<AdditionalReference8> value) {
			obj.setClientReference(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrPtyRef")
	protected AdditionalReference8 counterpartyReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
	 * TradeIdentification.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transfer allocated by the counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmCounterpartyReference
	 * Transfer30.mmCounterpartyReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Optional<AdditionalReference8>> mmCounterpartyReference = new MMMessageAttribute<Transfer34, Optional<AdditionalReference8>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the transfer allocated by the counterparty.";
			previousVersion_lazy = () -> Transfer30.mmCounterpartyReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference8.mmObject();
		}

		@Override
		public Optional<AdditionalReference8> getValue(Transfer34 obj) {
			return obj.getCounterpartyReference();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<AdditionalReference8> value) {
			obj.setCounterpartyReference(value.orElse(null));
		}
	};
	@XmlElement(name = "BizFlowTp")
	protected BusinessFlowType1Code businessFlowType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessFlowType1Code
	 * BusinessFlowType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizFlowTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessFlowType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the business process in which the actors are involved. This is important to trigger the right business process, according to the market business model, which may require matching instructions in a CSD environment (double leg process) or not (single leg process)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmBusinessFlowType
	 * Transfer30.mmBusinessFlowType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Optional<BusinessFlowType1Code>> mmBusinessFlowType = new MMMessageAttribute<Transfer34, Optional<BusinessFlowType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "BizFlowTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessFlowType";
			definition = "Identifies the business process in which the actors are involved. This is important to trigger the right business process, according to the market business model, which may require matching instructions in a CSD environment (double leg process) or not (single leg process).";
			previousVersion_lazy = () -> Transfer30.mmBusinessFlowType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BusinessFlowType1Code.mmObject();
		}

		@Override
		public Optional<BusinessFlowType1Code> getValue(Transfer34 obj) {
			return obj.getBusinessFlowType();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<BusinessFlowType1Code> value) {
			obj.setBusinessFlowType(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdTrfDt")
	protected DateFormat1Choice requestedTransferDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat1Choice
	 * DateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdTrfDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedTransferDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date for which the instructing party requests the transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#mmRequestedTransferDate
	 * TransferOutInstructionV07.mmRequestedTransferDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transfer34, Optional<DateFormat1Choice>> mmRequestedTransferDate = new MMMessageAssociationEnd<Transfer34, Optional<DateFormat1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "ReqdTrfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedTransferDate";
			definition = "Date for which the instructing party requests the transfer.";
			previousVersion_lazy = () -> TransferOutInstructionV07.mmRequestedTransferDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat1Choice.mmObject();
		}

		@Override
		public Optional<DateFormat1Choice> getValue(Transfer34 obj) {
			return obj.getRequestedTransferDate();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<DateFormat1Choice> value) {
			obj.setRequestedTransferDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ReqdSttlmDt")
	protected ISODate requestedSettlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmRequestedSettlementDate
	 * Transfer30.mmRequestedSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Optional<ISODate>> mmRequestedSettlementDate = new MMMessageAttribute<Transfer34, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD).";
			previousVersion_lazy = () -> Transfer30.mmRequestedSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Transfer34 obj) {
			return obj.getRequestedSettlementDate();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<ISODate> value) {
			obj.setRequestedSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfOrdrDtForm")
	protected ISODate transferOrderDateForm;
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfOrdrDtForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOrderDateForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the investor signed the transfer order form."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferOrderDateForm
	 * Transfer30.mmTransferOrderDateForm}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Optional<ISODate>> mmTransferOrderDateForm = new MMMessageAttribute<Transfer34, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "TrfOrdrDtForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOrderDateForm";
			definition = "Date on which the investor signed the transfer order form.";
			previousVersion_lazy = () -> Transfer30.mmTransferOrderDateForm;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Transfer34 obj) {
			return obj.getTransferOrderDateForm();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<ISODate> value) {
			obj.setTransferOrderDateForm(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfRsn")
	protected TransferReason1Choice transferReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TransferReason1Choice
	 * TransferReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferReason
	 * SecuritiesTransfer.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for the transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferReason
	 * Transfer30.mmTransferReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Optional<TransferReason1Choice>> mmTransferReason = new MMMessageAttribute<Transfer34, Optional<TransferReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "TrfRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReason";
			definition = "Reason for the transfer.";
			previousVersion_lazy = () -> Transfer30.mmTransferReason;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransferReason1Choice.mmObject();
		}

		@Override
		public Optional<TransferReason1Choice> getValue(Transfer34 obj) {
			return obj.getTransferReason();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<TransferReason1Choice> value) {
			obj.setTransferReason(value.orElse(null));
		}
	};
	@XmlElement(name = "HldgsPlanTp")
	protected List<HoldingsPlanType1Code> holdingsPlanType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanType1Code
	 * HoldingsPlanType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldingsPlanType
	 * SecuritiesSettlement.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgsPlanTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsPlanType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information about investment plans included in the holding."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmHoldingsPlanType
	 * Transfer30.mmHoldingsPlanType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, List<HoldingsPlanType1Code>> mmHoldingsPlanType = new MMMessageAttribute<Transfer34, List<HoldingsPlanType1Code>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmHoldingsPlanType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "HldgsPlanTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingsPlanType";
			definition = "Specifies information about investment plans included in the holding.";
			previousVersion_lazy = () -> Transfer30.mmHoldingsPlanType;
			maxOccurs = 3;
			minOccurs = 0;
			simpleType_lazy = () -> HoldingsPlanType1Code.mmObject();
		}

		@Override
		public List<HoldingsPlanType1Code> getValue(Transfer34 obj) {
			return obj.getHoldingsPlanType();
		}

		@Override
		public void setValue(Transfer34 obj, List<HoldingsPlanType1Code> value) {
			obj.setHoldingsPlanType(value);
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument63 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument63
	 * FinancialInstrument63}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the financial instrument to be transferred."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmFinancialInstrumentDetails
	 * Transfer30.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transfer34, FinancialInstrument63> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<Transfer34, FinancialInstrument63>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Information related to the financial instrument to be transferred.";
			previousVersion_lazy = () -> Transfer30.mmFinancialInstrumentDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrument63.mmObject();
		}

		@Override
		public FinancialInstrument63 getValue(Transfer34 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(Transfer34 obj, FinancialInstrument63 value) {
			obj.setFinancialInstrumentDetails(value);
		}
	};
	@XmlElement(name = "Qty", required = true)
	protected Quantity42Choice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Quantity42Choice
	 * Quantity42Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total quantity of securities to be transferred, expressed as a number of units or a percentage rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmQuantity
	 * Transfer30.mmQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Quantity42Choice> mmQuantity = new MMMessageAttribute<Transfer34, Quantity42Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Total quantity of securities to be transferred, expressed as a number of units or a percentage rate.";
			previousVersion_lazy = () -> Transfer30.mmQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Quantity42Choice.mmObject();
		}

		@Override
		public Quantity42Choice getValue(Transfer34 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(Transfer34 obj, Quantity42Choice value) {
			obj.setQuantity(value);
		}
	};
	@XmlElement(name = "UnitsDtls")
	protected List<Unit8> unitsDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Unit8 Unit8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Breakdown of units to be transferred."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmUnitsDetails
	 * Transfer30.mmUnitsDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transfer34, List<Unit8>> mmUnitsDetails = new MMMessageAssociationEnd<Transfer34, List<Unit8>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "UnitsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsDetails";
			definition = "Breakdown of units to be transferred.";
			previousVersion_lazy = () -> Transfer30.mmUnitsDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Unit8.mmObject();
		}

		@Override
		public List<Unit8> getValue(Transfer34 obj) {
			return obj.getUnitsDetails();
		}

		@Override
		public void setValue(Transfer34 obj, List<Unit8> value) {
			obj.setUnitsDetails(value);
		}
	};
	@XmlElement(name = "Rndg")
	protected RoundingDirection2Code rounding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirection2Code
	 * RoundingDirection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRoundingDirection
	 * RoundingParameters.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rndg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rounding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rounding direction applied to nearest unit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmRounding
	 * Transfer30.mmRounding}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Optional<RoundingDirection2Code>> mmRounding = new MMMessageAttribute<Transfer34, Optional<RoundingDirection2Code>>() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "Rndg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rounding";
			definition = "Rounding direction applied to nearest unit.";
			previousVersion_lazy = () -> Transfer30.mmRounding;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection2Code.mmObject();
		}

		@Override
		public Optional<RoundingDirection2Code> getValue(Transfer34 obj) {
			return obj.getRounding();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<RoundingDirection2Code> value) {
			obj.setRounding(value.orElse(null));
		}
	};
	@XmlElement(name = "AvrgPric")
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount averagePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AveragePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the security, as booked in the account. Book value is often different from the current market value of the security."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmAveragePrice
	 * Transfer30.mmAveragePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount>> mmAveragePrice = new MMMessageAttribute<Transfer34, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount>>() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "AvrgPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AveragePrice";
			definition = "Value of the security, as booked in the account. Book value is often different from the current market value of the security.";
			previousVersion_lazy = () -> Transfer30.mmAveragePrice;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getValue(Transfer34 obj) {
			return obj.getAveragePrice();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> value) {
			obj.setAveragePrice(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfCcy")
	protected ActiveOrHistoricCurrencyCode transferCurrency;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmTransferCurrency
	 * SecuritiesDeliveryObligation.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency to be used to transfer the holdings. Some transfer agents register holdings grouped by currency in addition to using the ISIN for multi-currency fund shares."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferCurrency
	 * Transfer30.mmTransferCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Optional<ActiveOrHistoricCurrencyCode>> mmTransferCurrency = new MMMessageAttribute<Transfer34, Optional<ActiveOrHistoricCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmTransferCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "TrfCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCurrency";
			definition = "Currency to be used to transfer the holdings. Some transfer agents register holdings grouped by currency in addition to using the ISIN for multi-currency fund shares.";
			previousVersion_lazy = () -> Transfer30.mmTransferCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveOrHistoricCurrencyCode> getValue(Transfer34 obj) {
			return obj.getTransferCurrency();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<ActiveOrHistoricCurrencyCode> value) {
			obj.setTransferCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "OwnAcctTrfInd")
	protected YesNoIndicator ownAccountTransferIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmOwnAccountTransferIndicator
	 * SecuritiesTransfer.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnAcctTrfInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnAccountTransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transfer results in a change of beneficial owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmOwnAccountTransferIndicator
	 * Transfer30.mmOwnAccountTransferIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Optional<YesNoIndicator>> mmOwnAccountTransferIndicator = new MMMessageAttribute<Transfer34, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmOwnAccountTransferIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "OwnAcctTrfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnAccountTransferIndicator";
			definition = "Indicates whether the transfer results in a change of beneficial owner.";
			previousVersion_lazy = () -> Transfer30.mmOwnAccountTransferIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Transfer34 obj) {
			return obj.getOwnAccountTransferIndicator();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<YesNoIndicator> value) {
			obj.setOwnAccountTransferIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NonStdSttlmInf")
	protected Max350Text nonStandardSettlementInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
	 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonStdSttlmInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional specific settlement information for the fund."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmNonStandardSettlementInformation
	 * Transfer30.mmNonStandardSettlementInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Optional<Max350Text>> mmNonStandardSettlementInformation = new MMMessageAttribute<Transfer34, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for the fund.";
			previousVersion_lazy = () -> Transfer30.mmNonStandardSettlementInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(Transfer34 obj) {
			return obj.getNonStandardSettlementInformation();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<Max350Text> value) {
			obj.setNonStandardSettlementInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgAgtDtls")
	protected PartyIdentificationAndAccount156 receivingAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount156
	 * PartyIdentificationAndAccount156}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives securities from the delivering agent via the place of settlement, for example, securities central depository."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmReceivingAgentDetails
	 * Transfer30.mmReceivingAgentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Optional<PartyIdentificationAndAccount156>> mmReceivingAgentDetails = new MMMessageAttribute<Transfer34, Optional<PartyIdentificationAndAccount156>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgentDetails";
			definition = "Party that receives securities from the delivering agent via the place of settlement, for example, securities central depository.";
			previousVersion_lazy = () -> Transfer30.mmReceivingAgentDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentificationAndAccount156.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount156> getValue(Transfer34 obj) {
			return obj.getReceivingAgentDetails();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<PartyIdentificationAndAccount156> value) {
			obj.setReceivingAgentDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgAgtDtls")
	protected PartyIdentificationAndAccount156 deliveringAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount156
	 * PartyIdentificationAndAccount156}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmDeliveringAgentDetails
	 * Transfer30.mmDeliveringAgentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Transfer34, Optional<PartyIdentificationAndAccount156>> mmDeliveringAgentDetails = new MMMessageAttribute<Transfer34, Optional<PartyIdentificationAndAccount156>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgentDetails";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository.";
			previousVersion_lazy = () -> Transfer30.mmDeliveringAgentDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentificationAndAccount156.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount156> getValue(Transfer34 obj) {
			return obj.getDeliveringAgentDetails();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<PartyIdentificationAndAccount156> value) {
			obj.setDeliveringAgentDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "TrfExpnssPmtTp")
	protected ChargePaymentMethod1Choice transferExpensesPaymentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ChargePaymentMethod1Choice
	 * ChargePaymentMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmChargePaymentMethod
	 * Charges.mmChargePaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer34
	 * Transfer34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfExpnssPmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferExpensesPaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the payment of fees and taxes as a result of the transfer is covered, that is, whether by cash or the redemption of units."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer30#mmTransferExpensesPaymentType
	 * Transfer30.mmTransferExpensesPaymentType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Transfer34, Optional<ChargePaymentMethod1Choice>> mmTransferExpensesPaymentType = new MMMessageAssociationEnd<Transfer34, Optional<ChargePaymentMethod1Choice>>() {
		{
			businessElementTrace_lazy = () -> Charges.mmChargePaymentMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer34.mmObject();
			isDerived = false;
			xmlTag = "TrfExpnssPmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferExpensesPaymentType";
			definition = "Specifies how the payment of fees and taxes as a result of the transfer is covered, that is, whether by cash or the redemption of units.";
			previousVersion_lazy = () -> Transfer30.mmTransferExpensesPaymentType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ChargePaymentMethod1Choice.mmObject();
		}

		@Override
		public Optional<ChargePaymentMethod1Choice> getValue(Transfer34 obj) {
			return obj.getTransferExpensesPaymentType();
		}

		@Override
		public void setValue(Transfer34 obj, Optional<ChargePaymentMethod1Choice> value) {
			obj.setTransferExpensesPaymentType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer34.mmTransferReference, com.tools20022.repository.msg.Transfer34.mmClientReference,
						com.tools20022.repository.msg.Transfer34.mmCounterpartyReference, com.tools20022.repository.msg.Transfer34.mmBusinessFlowType, com.tools20022.repository.msg.Transfer34.mmRequestedTransferDate,
						com.tools20022.repository.msg.Transfer34.mmRequestedSettlementDate, com.tools20022.repository.msg.Transfer34.mmTransferOrderDateForm, com.tools20022.repository.msg.Transfer34.mmTransferReason,
						com.tools20022.repository.msg.Transfer34.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer34.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer34.mmQuantity,
						com.tools20022.repository.msg.Transfer34.mmUnitsDetails, com.tools20022.repository.msg.Transfer34.mmRounding, com.tools20022.repository.msg.Transfer34.mmAveragePrice,
						com.tools20022.repository.msg.Transfer34.mmTransferCurrency, com.tools20022.repository.msg.Transfer34.mmOwnAccountTransferIndicator, com.tools20022.repository.msg.Transfer34.mmNonStandardSettlementInformation,
						com.tools20022.repository.msg.Transfer34.mmReceivingAgentDetails, com.tools20022.repository.msg.Transfer34.mmDeliveringAgentDetails, com.tools20022.repository.msg.Transfer34.mmTransferExpensesPaymentType);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferInInstructionV08.mmTransferDetails, TransferOutInstructionV08.mmTransferDetails);
				trace_lazy = () -> SecuritiesTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer34);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Transfer34";
				definition = "Parameters applied to the settlement of a security transfer.";
				previousVersion_lazy = () -> Transfer30.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransferReference() {
		return transferReference;
	}

	public Transfer34 setTransferReference(Max35Text transferReference) {
		this.transferReference = Objects.requireNonNull(transferReference);
		return this;
	}

	public Optional<AdditionalReference8> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public Transfer34 setClientReference(AdditionalReference8 clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Optional<AdditionalReference8> getCounterpartyReference() {
		return counterpartyReference == null ? Optional.empty() : Optional.of(counterpartyReference);
	}

	public Transfer34 setCounterpartyReference(AdditionalReference8 counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
		return this;
	}

	public Optional<BusinessFlowType1Code> getBusinessFlowType() {
		return businessFlowType == null ? Optional.empty() : Optional.of(businessFlowType);
	}

	public Transfer34 setBusinessFlowType(BusinessFlowType1Code businessFlowType) {
		this.businessFlowType = businessFlowType;
		return this;
	}

	public Optional<DateFormat1Choice> getRequestedTransferDate() {
		return requestedTransferDate == null ? Optional.empty() : Optional.of(requestedTransferDate);
	}

	public Transfer34 setRequestedTransferDate(DateFormat1Choice requestedTransferDate) {
		this.requestedTransferDate = requestedTransferDate;
		return this;
	}

	public Optional<ISODate> getRequestedSettlementDate() {
		return requestedSettlementDate == null ? Optional.empty() : Optional.of(requestedSettlementDate);
	}

	public Transfer34 setRequestedSettlementDate(ISODate requestedSettlementDate) {
		this.requestedSettlementDate = requestedSettlementDate;
		return this;
	}

	public Optional<ISODate> getTransferOrderDateForm() {
		return transferOrderDateForm == null ? Optional.empty() : Optional.of(transferOrderDateForm);
	}

	public Transfer34 setTransferOrderDateForm(ISODate transferOrderDateForm) {
		this.transferOrderDateForm = transferOrderDateForm;
		return this;
	}

	public Optional<TransferReason1Choice> getTransferReason() {
		return transferReason == null ? Optional.empty() : Optional.of(transferReason);
	}

	public Transfer34 setTransferReason(TransferReason1Choice transferReason) {
		this.transferReason = transferReason;
		return this;
	}

	public List<HoldingsPlanType1Code> getHoldingsPlanType() {
		return holdingsPlanType == null ? holdingsPlanType = new ArrayList<>() : holdingsPlanType;
	}

	public Transfer34 setHoldingsPlanType(List<HoldingsPlanType1Code> holdingsPlanType) {
		this.holdingsPlanType = Objects.requireNonNull(holdingsPlanType);
		return this;
	}

	public FinancialInstrument63 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public Transfer34 setFinancialInstrumentDetails(FinancialInstrument63 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public Quantity42Choice getQuantity() {
		return quantity;
	}

	public Transfer34 setQuantity(Quantity42Choice quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public List<Unit8> getUnitsDetails() {
		return unitsDetails == null ? unitsDetails = new ArrayList<>() : unitsDetails;
	}

	public Transfer34 setUnitsDetails(List<Unit8> unitsDetails) {
		this.unitsDetails = Objects.requireNonNull(unitsDetails);
		return this;
	}

	public Optional<RoundingDirection2Code> getRounding() {
		return rounding == null ? Optional.empty() : Optional.of(rounding);
	}

	public Transfer34 setRounding(RoundingDirection2Code rounding) {
		this.rounding = rounding;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getAveragePrice() {
		return averagePrice == null ? Optional.empty() : Optional.of(averagePrice);
	}

	public Transfer34 setAveragePrice(ActiveOrHistoricCurrencyAnd13DecimalAmount averagePrice) {
		this.averagePrice = averagePrice;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getTransferCurrency() {
		return transferCurrency == null ? Optional.empty() : Optional.of(transferCurrency);
	}

	public Transfer34 setTransferCurrency(ActiveOrHistoricCurrencyCode transferCurrency) {
		this.transferCurrency = transferCurrency;
		return this;
	}

	public Optional<YesNoIndicator> getOwnAccountTransferIndicator() {
		return ownAccountTransferIndicator == null ? Optional.empty() : Optional.of(ownAccountTransferIndicator);
	}

	public Transfer34 setOwnAccountTransferIndicator(YesNoIndicator ownAccountTransferIndicator) {
		this.ownAccountTransferIndicator = ownAccountTransferIndicator;
		return this;
	}

	public Optional<Max350Text> getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation == null ? Optional.empty() : Optional.of(nonStandardSettlementInformation);
	}

	public Transfer34 setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
		return this;
	}

	public Optional<PartyIdentificationAndAccount156> getReceivingAgentDetails() {
		return receivingAgentDetails == null ? Optional.empty() : Optional.of(receivingAgentDetails);
	}

	public Transfer34 setReceivingAgentDetails(PartyIdentificationAndAccount156 receivingAgentDetails) {
		this.receivingAgentDetails = receivingAgentDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount156> getDeliveringAgentDetails() {
		return deliveringAgentDetails == null ? Optional.empty() : Optional.of(deliveringAgentDetails);
	}

	public Transfer34 setDeliveringAgentDetails(PartyIdentificationAndAccount156 deliveringAgentDetails) {
		this.deliveringAgentDetails = deliveringAgentDetails;
		return this;
	}

	public Optional<ChargePaymentMethod1Choice> getTransferExpensesPaymentType() {
		return transferExpensesPaymentType == null ? Optional.empty() : Optional.of(transferExpensesPaymentType);
	}

	public Transfer34 setTransferExpensesPaymentType(ChargePaymentMethod1Choice transferExpensesPaymentType) {
		this.transferExpensesPaymentType = transferExpensesPaymentType;
		return this;
	}
}