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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.codeset.AllocationIndicator1Code;
import com.tools20022.repository.codeset.CollateralisationIndicator1Code;
import com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code;
import com.tools20022.repository.datatype.Exact42Text;
import com.tools20022.repository.datatype.Max210Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.RegulatoryReport;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Includes data elements that can be used for reporting to trade repositories,
 * it is not to be used on regular trade confirmations. Although some fields,
 * for example, unique transaction identifier and prior unique transaction
 * identifier, might be used on regular confirmations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmReportingJurisdiction
 * RegulatoryReporting1.mmReportingJurisdiction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmReportingParty
 * RegulatoryReporting1.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmTradingSideUniqueTransactionIdentifier
 * RegulatoryReporting1.mmTradingSideUniqueTransactionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmCounterpartySideUniqueTransactionIdentifier
 * RegulatoryReporting1.mmCounterpartySideUniqueTransactionIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmClearingExceptionParty
 * RegulatoryReporting1.mmClearingExceptionParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmClearingBrokerIdentification
 * RegulatoryReporting1.mmClearingBrokerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmClearingThresholdIndicator
 * RegulatoryReporting1.mmClearingThresholdIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmClearedProductIdentification
 * RegulatoryReporting1.mmClearedProductIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmUnderlyingProductIdentifier
 * RegulatoryReporting1.mmUnderlyingProductIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmAllocationIndicator
 * RegulatoryReporting1.mmAllocationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmCollateralisationIndicator
 * RegulatoryReporting1.mmCollateralisationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmExecutionVenue
 * RegulatoryReporting1.mmExecutionVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmExecutionTimestamp
 * RegulatoryReporting1.mmExecutionTimestamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmNonStandardFlag
 * RegulatoryReporting1.mmNonStandardFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmLinkSwapIdentification
 * RegulatoryReporting1.mmLinkSwapIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmAdditionalReportingInformation
 * RegulatoryReporting1.mmAdditionalReportingInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RegulatoryReport
 * RegulatoryReport}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionAmendmentV02#mmRegulatoryReporting
 * ForeignExchangeTradeInstructionAmendmentV02.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionCancellationV02#mmRegulatoryReporting
 * ForeignExchangeTradeInstructionCancellationV02.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmRegulatoryReporting
 * ForeignExchangeTradeInstructionV02.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmRegulatoryReporting
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusNotificationV04#mmRegulatoryReporting
 * ForeignExchangeTradeStatusNotificationV04.mmRegulatoryReporting}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegulatoryReporting1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Includes data elements that can be used for reporting to trade repositories, it is not to be used on regular trade confirmations. Although some fields, for example, unique transaction identifier and prior unique transaction identifier, might be used on regular confirmations."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RegulatoryReporting4
 * RegulatoryReporting4}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class RegulatoryReporting1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text reportingJurisdiction;
	/**
	 * Specifies the supervisory party to which the trade needs to be reported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgJursdctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingJurisdiction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the supervisory party to which the trade needs to be reported."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportingJurisdiction = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentification;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "RptgJursdctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingJurisdiction";
			definition = "Specifies the supervisory party to which the trade needs to be reported.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification73Choice reportingParty;
	/**
	 * Identifies the party that is responsible for reporting the trade to the
	 * trade repository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that is responsible for reporting the trade to the trade repository."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReportingParty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "RptgPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingParty";
			definition = "Identifies the party that is responsible for reporting the trade to the trade repository.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	protected UniqueTransactionIdentifier1 tradingSideUniqueTransactionIdentifier;
	/**
	 * Specifies the unique transaction identifier (UTI) to be created at the
	 * time a transaction is first executed, shared with all registered entities
	 * and counterparties involved in the transaction, and used to track that
	 * particular transaction over its life. This identifier can also be known
	 * as the Unique Swap Identifier (USI).This is the UTI from the Trading Side
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier1
	 * UniqueTransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmUniqueTradeIdentifier
	 * TradeIdentification.mmUniqueTradeIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdUnqTxIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideUniqueTransactionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI).This is the UTI from the Trading Side party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradingSideUniqueTransactionIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmUniqueTradeIdentifier;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "TradgSdUnqTxIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideUniqueTransactionIdentifier";
			definition = "Specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI).This is the UTI from the Trading Side party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.UniqueTransactionIdentifier1.mmObject();
		}
	};
	protected UniqueTransactionIdentifier1 counterpartySideUniqueTransactionIdentifier;
	/**
	 * Specifies the unique transaction identifier (UTI) to be created at the
	 * time a transaction is first executed, shared with all registered entities
	 * and counterparties involved in the transaction, and used to track that
	 * particular transaction over its life. This identifier can also be known
	 * as the Unique Swap Identifier (USI).This is the UTI from the Counterparty
	 * Side party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UniqueTransactionIdentifier1
	 * UniqueTransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeRelatedIdentifications
	 * Trade.mmTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySdUnqTxIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySideUniqueTransactionIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI).This is the UTI from the Counterparty Side party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartySideUniqueTransactionIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.mmTradeRelatedIdentifications;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "CtrPtySdUnqTxIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideUniqueTransactionIdentifier";
			definition = "Specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI).This is the UTI from the Counterparty Side party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.UniqueTransactionIdentifier1.mmObject();
		}
	};
	protected PartyIdentification73Choice clearingExceptionParty;
	/**
	 * Identifies the party that is exempt from a clearing obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrXcptnPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingExceptionParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that is exempt from a clearing obligation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingExceptionParty
	 * RegulatoryReporting4.mmClearingExceptionParty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingExceptionParty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "ClrXcptnPty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingExceptionParty";
			definition = "Identifies the party that is exempt from a clearing obligation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting4.mmClearingExceptionParty);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	protected ClearingBrokerIdentification1 clearingBrokerIdentification;
	/**
	 * Specifies the reference number assigned by the clearing broker. A
	 * distinction can be made between the reference for the Central
	 * Counterparty (CCP) leg and the reference for the client leg of the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ClearingBrokerIdentification1
	 * ClearingBrokerIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmClearingBrokerIdentification
	 * TradeIdentification.mmClearingBrokerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrBrkrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingBrokerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingBrokerIdentification
	 * RegulatoryReporting4.mmClearingBrokerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingBrokerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.TradeIdentification.mmClearingBrokerIdentification;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "ClrBrkrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingBrokerIdentification";
			definition = "Specifies the reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting4.mmClearingBrokerIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ClearingBrokerIdentification1.mmObject();
		}
	};
	protected YesNoIndicator clearingThresholdIndicator;
	/**
	 * Specifies whether the contract is above or below the clearing threshold.
	 * Where No indicates the contract is below the clearing threshold and Yes
	 * indicates the contract is above the clearing threshold.
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
	 * {@linkplain com.tools20022.repository.entity.Clearing#mmClearingThresholdIndicator
	 * Clearing.mmClearingThresholdIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrThrshldInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingThresholdIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the contract is above or below the clearing threshold. Where No indicates the contract is below the clearing threshold and Yes indicates the contract is above the clearing threshold."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingThresholdIndicator
	 * RegulatoryReporting4.mmClearingThresholdIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingThresholdIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Clearing.mmClearingThresholdIndicator;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "ClrThrshldInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingThresholdIndicator";
			definition = "Specifies whether the contract is above or below the clearing threshold. Where No indicates the contract is below the clearing threshold and Yes indicates the contract is above the clearing threshold.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting4.mmClearingThresholdIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max35Text clearedProductIdentification;
	/**
	 * Specifies the reference number assigned by the Central Counterparty
	 * (CCP).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Clearing#mmClearedIdentification
	 * Clearing.mmClearedIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrdPdctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearedProductIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reference number assigned by the Central Counterparty (CCP)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearedProductIdentification
	 * RegulatoryReporting4.mmClearedProductIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearedProductIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Clearing.mmClearedIdentification;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "ClrdPdctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearedProductIdentification";
			definition = "Specifies the reference number assigned by the Central Counterparty (CCP).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting4.mmClearedProductIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected UnderlyingProductIdentifier1Code underlyingProductIdentifier;
	/**
	 * Specifies the underlying product type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code
	 * UnderlyingProductIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmUnderlyingProduct
	 * RegulatoryReport.mmUnderlyingProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygPdctIdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingProductIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying product type."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmUnderlyingProductIdentifier
	 * RegulatoryReporting4.mmUnderlyingProductIdentifier}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnderlyingProductIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmUnderlyingProduct;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygPdctIdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingProductIdentifier";
			definition = "Specifies the underlying product type.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting4.mmUnderlyingProductIdentifier);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UnderlyingProductIdentifier1Code.mmObject();
		}
	};
	protected AllocationIndicator1Code allocationIndicator;
	/**
	 * Specifies whether the trade is a pre-allocation or a post-allocation
	 * trade, or whether the trade is unallocated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AllocationIndicator1Code
	 * AllocationIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmAllocationIndicator
	 * Trade.mmAllocationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllcnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the trade is a pre-allocation or a post-allocation trade, or whether the trade is unallocated."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmAllocationIndicator
	 * RegulatoryReporting4.mmAllocationIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllocationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.mmAllocationIndicator;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "AllcnInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationIndicator";
			definition = "Specifies whether the trade is a pre-allocation or a post-allocation trade, or whether the trade is unallocated.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting4.mmAllocationIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AllocationIndicator1Code.mmObject();
		}
	};
	protected CollateralisationIndicator1Code collateralisationIndicator;
	/**
	 * Specifies whether the transaction is collateralised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralisationIndicator1Code
	 * CollateralisationIndicator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmCollateralisationType
	 * Trade.mmCollateralisationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollstnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralisationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the transaction is collateralised."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCollateralisationIndicator
	 * RegulatoryReporting4.mmCollateralisationIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralisationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.mmCollateralisationType;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "CollstnInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisationIndicator";
			definition = "Specifies whether the transaction is collateralised.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting4.mmCollateralisationIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CollateralisationIndicator1Code.mmObject();
		}
	};
	protected Max35Text executionVenue;
	/**
	 * Specifies the trading venue of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnVn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionVenue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the trading venue of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmExecutionVenue
	 * RegulatoryReporting4.mmExecutionVenue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutionVenue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.mmIdentification;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "ExctnVn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionVenue";
			definition = "Specifies the trading venue of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting4.mmExecutionVenue);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected DateAndDateTimeChoice executionTimestamp;
	/**
	 * Specifies the date and time of the execution of the transaction in
	 * Coordinated Universal Time (UTC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctnTmstmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionTimestamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date and time of the execution of the transaction in Coordinated Universal Time (UTC)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmExecutionTimestamp
	 * RegulatoryReporting4.mmExecutionTimestamp}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutionTimestamp = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.mmTradeDateTime;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "ExctnTmstmp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionTimestamp";
			definition = "Specifies the date and time of the execution of the transaction in Coordinated Universal Time (UTC).";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting4.mmExecutionTimestamp);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected YesNoIndicator nonStandardFlag;
	/**
	 * Specifies whether the reportable transaction has one or more additional
	 * terms or provisions, other than those listed in the required real-time
	 * data fields, that materially affects the price of the reportable
	 * transaction.
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
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport#mmNonStandardFlag
	 * RegulatoryReport.mmNonStandardFlag}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonStdFlg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardFlag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the reportable transaction has one or more additional terms or provisions, other than those listed in the required real-time data fields, that materially affects the price of the reportable transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmNonStandardFlag
	 * RegulatoryReporting4.mmNonStandardFlag}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonStandardFlag = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RegulatoryReport.mmNonStandardFlag;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "NonStdFlg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardFlag";
			definition = "Specifies whether the reportable transaction has one or more additional terms or provisions, other than those listed in the required real-time data fields, that materially affects the price of the reportable transaction.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting4.mmNonStandardFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Exact42Text linkSwapIdentification;
	/**
	 * Specifies the common reference or correlation identification for a swap
	 * transaction where the near and far leg are confirmed separately.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Exact42Text
	 * Exact42Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeSwap#mmLinkSwapIdentification
	 * ForeignExchangeSwap.mmLinkSwapIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkSwpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkSwapIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the common reference or correlation identification for a swap transaction where the near and far leg are confirmed separately."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmLinkSwapIdentification
	 * RegulatoryReporting4.mmLinkSwapIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkSwapIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.ForeignExchangeSwap.mmLinkSwapIdentification;
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "LkSwpId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSwapIdentification";
			definition = "Specifies the common reference or correlation identification for a swap transaction where the near and far leg are confirmed separately.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting4.mmLinkSwapIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact42Text.mmObject();
		}
	};
	protected Max210Text additionalReportingInformation;
	/**
	 * Specifies additional information that might be required by the regulator.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
	 * RegulatoryReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRptgInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReportingInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information that might be required by the regulator."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmAdditionalReportingInformation
	 * RegulatoryReporting4.mmAdditionalReportingInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalReportingInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "AddtlRptgInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReportingInformation";
			definition = "Specifies additional information that might be required by the regulator.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting4.mmAdditionalReportingInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting1.mmReportingJurisdiction, com.tools20022.repository.msg.RegulatoryReporting1.mmReportingParty,
						com.tools20022.repository.msg.RegulatoryReporting1.mmTradingSideUniqueTransactionIdentifier, com.tools20022.repository.msg.RegulatoryReporting1.mmCounterpartySideUniqueTransactionIdentifier,
						com.tools20022.repository.msg.RegulatoryReporting1.mmClearingExceptionParty, com.tools20022.repository.msg.RegulatoryReporting1.mmClearingBrokerIdentification,
						com.tools20022.repository.msg.RegulatoryReporting1.mmClearingThresholdIndicator, com.tools20022.repository.msg.RegulatoryReporting1.mmClearedProductIdentification,
						com.tools20022.repository.msg.RegulatoryReporting1.mmUnderlyingProductIdentifier, com.tools20022.repository.msg.RegulatoryReporting1.mmAllocationIndicator,
						com.tools20022.repository.msg.RegulatoryReporting1.mmCollateralisationIndicator, com.tools20022.repository.msg.RegulatoryReporting1.mmExecutionVenue,
						com.tools20022.repository.msg.RegulatoryReporting1.mmExecutionTimestamp, com.tools20022.repository.msg.RegulatoryReporting1.mmNonStandardFlag,
						com.tools20022.repository.msg.RegulatoryReporting1.mmLinkSwapIdentification, com.tools20022.repository.msg.RegulatoryReporting1.mmAdditionalReportingInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.other.ForeignExchangeTradeInstructionAmendmentV02.mmRegulatoryReporting,
						com.tools20022.repository.area.other.ForeignExchangeTradeInstructionCancellationV02.mmRegulatoryReporting, com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02.mmRegulatoryReporting,
						com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02.mmRegulatoryReporting, com.tools20022.repository.area.other.ForeignExchangeTradeStatusNotificationV04.mmRegulatoryReporting);
				trace_lazy = () -> RegulatoryReport.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RegulatoryReporting1";
				definition = "Includes data elements that can be used for reporting to trade repositories, it is not to be used on regular trade confirmations. Although some fields, for example, unique transaction identifier and prior unique transaction identifier, might be used on regular confirmations.";
				nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReportingJurisdiction() {
		return reportingJurisdiction;
	}

	public void setReportingJurisdiction(Max35Text reportingJurisdiction) {
		this.reportingJurisdiction = reportingJurisdiction;
	}

	public PartyIdentification73Choice getReportingParty() {
		return reportingParty;
	}

	public void setReportingParty(PartyIdentification73Choice reportingParty) {
		this.reportingParty = reportingParty;
	}

	public UniqueTransactionIdentifier1 getTradingSideUniqueTransactionIdentifier() {
		return tradingSideUniqueTransactionIdentifier;
	}

	public void setTradingSideUniqueTransactionIdentifier(com.tools20022.repository.msg.UniqueTransactionIdentifier1 tradingSideUniqueTransactionIdentifier) {
		this.tradingSideUniqueTransactionIdentifier = tradingSideUniqueTransactionIdentifier;
	}

	public UniqueTransactionIdentifier1 getCounterpartySideUniqueTransactionIdentifier() {
		return counterpartySideUniqueTransactionIdentifier;
	}

	public void setCounterpartySideUniqueTransactionIdentifier(com.tools20022.repository.msg.UniqueTransactionIdentifier1 counterpartySideUniqueTransactionIdentifier) {
		this.counterpartySideUniqueTransactionIdentifier = counterpartySideUniqueTransactionIdentifier;
	}

	public PartyIdentification73Choice getClearingExceptionParty() {
		return clearingExceptionParty;
	}

	public void setClearingExceptionParty(PartyIdentification73Choice clearingExceptionParty) {
		this.clearingExceptionParty = clearingExceptionParty;
	}

	public ClearingBrokerIdentification1 getClearingBrokerIdentification() {
		return clearingBrokerIdentification;
	}

	public void setClearingBrokerIdentification(com.tools20022.repository.msg.ClearingBrokerIdentification1 clearingBrokerIdentification) {
		this.clearingBrokerIdentification = clearingBrokerIdentification;
	}

	public YesNoIndicator getClearingThresholdIndicator() {
		return clearingThresholdIndicator;
	}

	public void setClearingThresholdIndicator(YesNoIndicator clearingThresholdIndicator) {
		this.clearingThresholdIndicator = clearingThresholdIndicator;
	}

	public Max35Text getClearedProductIdentification() {
		return clearedProductIdentification;
	}

	public void setClearedProductIdentification(Max35Text clearedProductIdentification) {
		this.clearedProductIdentification = clearedProductIdentification;
	}

	public UnderlyingProductIdentifier1Code getUnderlyingProductIdentifier() {
		return underlyingProductIdentifier;
	}

	public void setUnderlyingProductIdentifier(UnderlyingProductIdentifier1Code underlyingProductIdentifier) {
		this.underlyingProductIdentifier = underlyingProductIdentifier;
	}

	public AllocationIndicator1Code getAllocationIndicator() {
		return allocationIndicator;
	}

	public void setAllocationIndicator(AllocationIndicator1Code allocationIndicator) {
		this.allocationIndicator = allocationIndicator;
	}

	public CollateralisationIndicator1Code getCollateralisationIndicator() {
		return collateralisationIndicator;
	}

	public void setCollateralisationIndicator(CollateralisationIndicator1Code collateralisationIndicator) {
		this.collateralisationIndicator = collateralisationIndicator;
	}

	public Max35Text getExecutionVenue() {
		return executionVenue;
	}

	public void setExecutionVenue(Max35Text executionVenue) {
		this.executionVenue = executionVenue;
	}

	public DateAndDateTimeChoice getExecutionTimestamp() {
		return executionTimestamp;
	}

	public void setExecutionTimestamp(DateAndDateTimeChoice executionTimestamp) {
		this.executionTimestamp = executionTimestamp;
	}

	public YesNoIndicator getNonStandardFlag() {
		return nonStandardFlag;
	}

	public void setNonStandardFlag(YesNoIndicator nonStandardFlag) {
		this.nonStandardFlag = nonStandardFlag;
	}

	public Exact42Text getLinkSwapIdentification() {
		return linkSwapIdentification;
	}

	public void setLinkSwapIdentification(Exact42Text linkSwapIdentification) {
		this.linkSwapIdentification = linkSwapIdentification;
	}

	public Max210Text getAdditionalReportingInformation() {
		return additionalReportingInformation;
	}

	public void setAdditionalReportingInformation(Max210Text additionalReportingInformation) {
		this.additionalReportingInformation = additionalReportingInformation;
	}
}