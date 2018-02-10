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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.other.*;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.codeset.AllocationIndicator1Code;
import com.tools20022.repository.codeset.CollateralisationIndicator1Code;
import com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code;
import com.tools20022.repository.datatype.Exact42Text;
import com.tools20022.repository.datatype.Max210Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RegulatoryReporting1", propOrder = {"reportingJurisdiction", "reportingParty", "tradingSideUniqueTransactionIdentifier", "counterpartySideUniqueTransactionIdentifier", "clearingExceptionParty",
		"clearingBrokerIdentification", "clearingThresholdIndicator", "clearedProductIdentification", "underlyingProductIdentifier", "allocationIndicator", "collateralisationIndicator", "executionVenue", "executionTimestamp",
		"nonStandardFlag", "linkSwapIdentification", "additionalReportingInformation"})
public class RegulatoryReporting1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptgJursdctn")
	protected Max35Text reportingJurisdiction;
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
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "RptgJursdctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingJurisdiction";
			definition = "Specifies the supervisory party to which the trade needs to be reported.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RptgPty")
	protected PartyIdentification73Choice reportingParty;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "RptgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingParty";
			definition = "Identifies the party that is responsible for reporting the trade to the trade repository.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	@XmlElement(name = "TradgSdUnqTxIdr")
	protected UniqueTransactionIdentifier1 tradingSideUniqueTransactionIdentifier;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> TradeIdentification.mmUniqueTradeIdentifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "TradgSdUnqTxIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideUniqueTransactionIdentifier";
			definition = "Specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI).This is the UTI from the Trading Side party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.UniqueTransactionIdentifier1.mmObject();
		}
	};
	@XmlElement(name = "CtrPtySdUnqTxIdr")
	protected UniqueTransactionIdentifier1 counterpartySideUniqueTransactionIdentifier;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Trade.mmTradeRelatedIdentifications;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "CtrPtySdUnqTxIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideUniqueTransactionIdentifier";
			definition = "Specifies the unique transaction identifier (UTI) to be created at the time a transaction is first executed, shared with all registered entities and counterparties involved in the transaction, and used to track that particular transaction over its life. This identifier can also be known as the Unique Swap Identifier (USI).This is the UTI from the Counterparty Side party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.UniqueTransactionIdentifier1.mmObject();
		}
	};
	@XmlElement(name = "ClrXcptnPty")
	protected PartyIdentification73Choice clearingExceptionParty;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "ClrXcptnPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingExceptionParty";
			definition = "Identifies the party that is exempt from a clearing obligation.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmClearingExceptionParty);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	@XmlElement(name = "ClrBrkrId")
	protected ClearingBrokerIdentification1 clearingBrokerIdentification;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> TradeIdentification.mmClearingBrokerIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "ClrBrkrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingBrokerIdentification";
			definition = "Specifies the reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmClearingBrokerIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.ClearingBrokerIdentification1.mmObject();
		}
	};
	@XmlElement(name = "ClrThrshldInd")
	protected YesNoIndicator clearingThresholdIndicator;
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
			businessElementTrace_lazy = () -> Clearing.mmClearingThresholdIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "ClrThrshldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingThresholdIndicator";
			definition = "Specifies whether the contract is above or below the clearing threshold. Where No indicates the contract is below the clearing threshold and Yes indicates the contract is above the clearing threshold.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmClearingThresholdIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "ClrdPdctId")
	protected Max35Text clearedProductIdentification;
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
			businessElementTrace_lazy = () -> Clearing.mmClearedIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "ClrdPdctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearedProductIdentification";
			definition = "Specifies the reference number assigned by the Central Counterparty (CCP).";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmClearedProductIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "UndrlygPdctIdr")
	protected UnderlyingProductIdentifier1Code underlyingProductIdentifier;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> RegulatoryReport.mmUnderlyingProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "UndrlygPdctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingProductIdentifier";
			definition = "Specifies the underlying product type.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmUnderlyingProductIdentifier);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UnderlyingProductIdentifier1Code.mmObject();
		}
	};
	@XmlElement(name = "AllcnInd")
	protected AllocationIndicator1Code allocationIndicator;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Trade.mmAllocationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "AllcnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationIndicator";
			definition = "Specifies whether the trade is a pre-allocation or a post-allocation trade, or whether the trade is unallocated.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmAllocationIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AllocationIndicator1Code.mmObject();
		}
	};
	@XmlElement(name = "CollstnInd")
	protected CollateralisationIndicator1Code collateralisationIndicator;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Trade.mmCollateralisationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "CollstnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisationIndicator";
			definition = "Specifies whether the transaction is collateralised.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmCollateralisationIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CollateralisationIndicator1Code.mmObject();
		}
	};
	@XmlElement(name = "ExctnVn")
	protected Max35Text executionVenue;
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
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "ExctnVn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionVenue";
			definition = "Specifies the trading venue of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmExecutionVenue);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ExctnTmstmp")
	protected DateAndDateTimeChoice executionTimestamp;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "ExctnTmstmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionTimestamp";
			definition = "Specifies the date and time of the execution of the transaction in Coordinated Universal Time (UTC).";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmExecutionTimestamp);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "NonStdFlg")
	protected YesNoIndicator nonStandardFlag;
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
			businessElementTrace_lazy = () -> RegulatoryReport.mmNonStandardFlag;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "NonStdFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardFlag";
			definition = "Specifies whether the reportable transaction has one or more additional terms or provisions, other than those listed in the required real-time data fields, that materially affects the price of the reportable transaction.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmNonStandardFlag);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "LkSwpId")
	protected Exact42Text linkSwapIdentification;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> ForeignExchangeSwap.mmLinkSwapIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "LkSwpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSwapIdentification";
			definition = "Specifies the common reference or correlation identification for a swap transaction where the near and far leg are confirmed separately.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmLinkSwapIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact42Text.mmObject();
		}
	};
	@XmlElement(name = "AddtlRptgInf")
	protected Max210Text additionalReportingInformation;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting1.mmObject();
			isDerived = false;
			xmlTag = "AddtlRptgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReportingInformation";
			definition = "Specifies additional information that might be required by the regulator.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmAdditionalReportingInformation);
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
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeInstructionAmendmentV02.mmRegulatoryReporting, ForeignExchangeTradeInstructionCancellationV02.mmRegulatoryReporting,
						ForeignExchangeTradeInstructionV02.mmRegulatoryReporting, ForeignExchangeTradeStatusAndDetailsNotificationV02.mmRegulatoryReporting, ForeignExchangeTradeStatusNotificationV04.mmRegulatoryReporting);
				trace_lazy = () -> RegulatoryReport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RegulatoryReporting1";
				definition = "Includes data elements that can be used for reporting to trade repositories, it is not to be used on regular trade confirmations. Although some fields, for example, unique transaction identifier and prior unique transaction identifier, might be used on regular confirmations.";
				nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getReportingJurisdiction() {
		return reportingJurisdiction == null ? Optional.empty() : Optional.of(reportingJurisdiction);
	}

	public RegulatoryReporting1 setReportingJurisdiction(Max35Text reportingJurisdiction) {
		this.reportingJurisdiction = reportingJurisdiction;
		return this;
	}

	public Optional<PartyIdentification73Choice> getReportingParty() {
		return reportingParty == null ? Optional.empty() : Optional.of(reportingParty);
	}

	public RegulatoryReporting1 setReportingParty(PartyIdentification73Choice reportingParty) {
		this.reportingParty = reportingParty;
		return this;
	}

	public Optional<UniqueTransactionIdentifier1> getTradingSideUniqueTransactionIdentifier() {
		return tradingSideUniqueTransactionIdentifier == null ? Optional.empty() : Optional.of(tradingSideUniqueTransactionIdentifier);
	}

	public RegulatoryReporting1 setTradingSideUniqueTransactionIdentifier(com.tools20022.repository.msg.UniqueTransactionIdentifier1 tradingSideUniqueTransactionIdentifier) {
		this.tradingSideUniqueTransactionIdentifier = tradingSideUniqueTransactionIdentifier;
		return this;
	}

	public Optional<UniqueTransactionIdentifier1> getCounterpartySideUniqueTransactionIdentifier() {
		return counterpartySideUniqueTransactionIdentifier == null ? Optional.empty() : Optional.of(counterpartySideUniqueTransactionIdentifier);
	}

	public RegulatoryReporting1 setCounterpartySideUniqueTransactionIdentifier(com.tools20022.repository.msg.UniqueTransactionIdentifier1 counterpartySideUniqueTransactionIdentifier) {
		this.counterpartySideUniqueTransactionIdentifier = counterpartySideUniqueTransactionIdentifier;
		return this;
	}

	public Optional<PartyIdentification73Choice> getClearingExceptionParty() {
		return clearingExceptionParty == null ? Optional.empty() : Optional.of(clearingExceptionParty);
	}

	public RegulatoryReporting1 setClearingExceptionParty(PartyIdentification73Choice clearingExceptionParty) {
		this.clearingExceptionParty = clearingExceptionParty;
		return this;
	}

	public Optional<ClearingBrokerIdentification1> getClearingBrokerIdentification() {
		return clearingBrokerIdentification == null ? Optional.empty() : Optional.of(clearingBrokerIdentification);
	}

	public RegulatoryReporting1 setClearingBrokerIdentification(com.tools20022.repository.msg.ClearingBrokerIdentification1 clearingBrokerIdentification) {
		this.clearingBrokerIdentification = clearingBrokerIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getClearingThresholdIndicator() {
		return clearingThresholdIndicator == null ? Optional.empty() : Optional.of(clearingThresholdIndicator);
	}

	public RegulatoryReporting1 setClearingThresholdIndicator(YesNoIndicator clearingThresholdIndicator) {
		this.clearingThresholdIndicator = clearingThresholdIndicator;
		return this;
	}

	public Optional<Max35Text> getClearedProductIdentification() {
		return clearedProductIdentification == null ? Optional.empty() : Optional.of(clearedProductIdentification);
	}

	public RegulatoryReporting1 setClearedProductIdentification(Max35Text clearedProductIdentification) {
		this.clearedProductIdentification = clearedProductIdentification;
		return this;
	}

	public Optional<UnderlyingProductIdentifier1Code> getUnderlyingProductIdentifier() {
		return underlyingProductIdentifier == null ? Optional.empty() : Optional.of(underlyingProductIdentifier);
	}

	public RegulatoryReporting1 setUnderlyingProductIdentifier(UnderlyingProductIdentifier1Code underlyingProductIdentifier) {
		this.underlyingProductIdentifier = underlyingProductIdentifier;
		return this;
	}

	public Optional<AllocationIndicator1Code> getAllocationIndicator() {
		return allocationIndicator == null ? Optional.empty() : Optional.of(allocationIndicator);
	}

	public RegulatoryReporting1 setAllocationIndicator(AllocationIndicator1Code allocationIndicator) {
		this.allocationIndicator = allocationIndicator;
		return this;
	}

	public Optional<CollateralisationIndicator1Code> getCollateralisationIndicator() {
		return collateralisationIndicator == null ? Optional.empty() : Optional.of(collateralisationIndicator);
	}

	public RegulatoryReporting1 setCollateralisationIndicator(CollateralisationIndicator1Code collateralisationIndicator) {
		this.collateralisationIndicator = collateralisationIndicator;
		return this;
	}

	public Optional<Max35Text> getExecutionVenue() {
		return executionVenue == null ? Optional.empty() : Optional.of(executionVenue);
	}

	public RegulatoryReporting1 setExecutionVenue(Max35Text executionVenue) {
		this.executionVenue = executionVenue;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getExecutionTimestamp() {
		return executionTimestamp == null ? Optional.empty() : Optional.of(executionTimestamp);
	}

	public RegulatoryReporting1 setExecutionTimestamp(DateAndDateTimeChoice executionTimestamp) {
		this.executionTimestamp = executionTimestamp;
		return this;
	}

	public Optional<YesNoIndicator> getNonStandardFlag() {
		return nonStandardFlag == null ? Optional.empty() : Optional.of(nonStandardFlag);
	}

	public RegulatoryReporting1 setNonStandardFlag(YesNoIndicator nonStandardFlag) {
		this.nonStandardFlag = nonStandardFlag;
		return this;
	}

	public Optional<Exact42Text> getLinkSwapIdentification() {
		return linkSwapIdentification == null ? Optional.empty() : Optional.of(linkSwapIdentification);
	}

	public RegulatoryReporting1 setLinkSwapIdentification(Exact42Text linkSwapIdentification) {
		this.linkSwapIdentification = linkSwapIdentification;
		return this;
	}

	public Optional<Max210Text> getAdditionalReportingInformation() {
		return additionalReportingInformation == null ? Optional.empty() : Optional.of(additionalReportingInformation);
	}

	public RegulatoryReporting1 setAdditionalReportingInformation(Max210Text additionalReportingInformation) {
		this.additionalReportingInformation = additionalReportingInformation;
		return this;
	}
}