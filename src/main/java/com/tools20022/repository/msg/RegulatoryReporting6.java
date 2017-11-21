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
import com.tools20022.repository.area.fxtr.*;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.codeset.AllocationIndicator1Code;
import com.tools20022.repository.codeset.CollateralisationIndicator1Code;
import com.tools20022.repository.codeset.CorporateSectorIdentifier1Code;
import com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Includes data elements that can be used for reporting to trade repositories,
 * it is not to be used on regular trade confirmations. Although some fields,
 * for example, unique transaction identifier and prior unique transaction
 * identifier, might be used on regular trade confirmations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmTradingSideTransactionReporting
 * RegulatoryReporting6.mmTradingSideTransactionReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCounterpartySideTransactionReporting
 * RegulatoryReporting6.mmCounterpartySideTransactionReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCentralCounterpartyClearingHouse
 * RegulatoryReporting6.mmCentralCounterpartyClearingHouse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingBroker
 * RegulatoryReporting6.mmClearingBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingExceptionParty
 * RegulatoryReporting6.mmClearingExceptionParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingBrokerIdentification
 * RegulatoryReporting6.mmClearingBrokerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingThresholdIndicator
 * RegulatoryReporting6.mmClearingThresholdIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearedProductIdentification
 * RegulatoryReporting6.mmClearedProductIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmUnderlyingProductIdentifier
 * RegulatoryReporting6.mmUnderlyingProductIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmAllocationIndicator
 * RegulatoryReporting6.mmAllocationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCollateralisationIndicator
 * RegulatoryReporting6.mmCollateralisationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmExecutionVenue
 * RegulatoryReporting6.mmExecutionVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmExecutionTimestamp
 * RegulatoryReporting6.mmExecutionTimestamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmNonStandardFlag
 * RegulatoryReporting6.mmNonStandardFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmLinkSwapIdentification
 * RegulatoryReporting6.mmLinkSwapIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmFinancialNatureOfTheCounterpartyIndicator
 * RegulatoryReporting6.mmFinancialNatureOfTheCounterpartyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCollateralPortfolioIndicator
 * RegulatoryReporting6.mmCollateralPortfolioIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCollateralPortfolioCode
 * RegulatoryReporting6.mmCollateralPortfolioCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmPortfolioCompressionIndicator
 * RegulatoryReporting6.mmPortfolioCompressionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCorporateSectorIndicator
 * RegulatoryReporting6.mmCorporateSectorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmTradeWithNonEEACounterpartyIndicator
 * RegulatoryReporting6.mmTradeWithNonEEACounterpartyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmIntragroupTradeIndicator
 * RegulatoryReporting6.mmIntragroupTradeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCommercialOrTreasuryFinancingIndicator
 * RegulatoryReporting6.mmCommercialOrTreasuryFinancingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmFinancialInstrumentIdentification
 * RegulatoryReporting6.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmConfirmationDateAndTimestamp
 * RegulatoryReporting6.mmConfirmationDateAndTimestamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingTimestamp
 * RegulatoryReporting6.mmClearingTimestamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmAdditionalReportingInformation
 * RegulatoryReporting6.mmAdditionalReportingInformation}</li>
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
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04#mmRegulatoryReporting
 * ForeignExchangeTradeInstructionV04.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusNotificationV06#mmRegulatoryReporting
 * ForeignExchangeTradeStatusNotificationV06.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmRegulatoryReporting
 * ForeignExchangeTradeInstructionCancellationV04.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04#mmRegulatoryReporting
 * ForeignExchangeTradeInstructionAmendmentV04.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmRegulatoryReporting
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.mmRegulatoryReporting}</li>
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
 * "RegulatoryReporting6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Includes data elements that can be used for reporting to trade repositories, it is not to be used on regular trade confirmations. Although some fields, for example, unique transaction identifier and prior unique transaction identifier, might be used on regular trade confirmations."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
 * RegulatoryReporting4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RegulatoryReporting6", propOrder = {"tradingSideTransactionReporting", "counterpartySideTransactionReporting", "centralCounterpartyClearingHouse", "clearingBroker", "clearingExceptionParty", "clearingBrokerIdentification",
		"clearingThresholdIndicator", "clearedProductIdentification", "underlyingProductIdentifier", "allocationIndicator", "collateralisationIndicator", "executionVenue", "executionTimestamp", "nonStandardFlag", "linkSwapIdentification",
		"financialNatureOfTheCounterpartyIndicator", "collateralPortfolioIndicator", "collateralPortfolioCode", "portfolioCompressionIndicator", "corporateSectorIndicator", "tradeWithNonEEACounterpartyIndicator",
		"intragroupTradeIndicator", "commercialOrTreasuryFinancingIndicator", "financialInstrumentIdentification", "confirmationDateAndTimestamp", "clearingTimestamp", "additionalReportingInformation"})
public class RegulatoryReporting6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.TradingSideTransactionReporting1> tradingSideTransactionReporting;
	/**
	 * Regulatory transaction reporting information from the Trading Side party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TradingSideTransactionReporting1
	 * TradingSideTransactionReporting1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdTxRptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideTransactionReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regulatory transaction reporting information from the Trading Side party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmTradingSideTransactionReporting
	 * RegulatoryReporting4.mmTradingSideTransactionReporting}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingSideTransactionReporting = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RegulatoryReport.mmObject();
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "TradgSdTxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideTransactionReporting";
			definition = "Regulatory transaction reporting information from the Trading Side party.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmTradingSideTransactionReporting;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TradingSideTransactionReporting1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CounterpartySideTransactionReporting1> counterpartySideTransactionReporting;
	/**
	 * Regulatory transaction reporting information from the Counterparty Side
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CounterpartySideTransactionReporting1
	 * CounterpartySideTransactionReporting1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RegulatoryReport
	 * RegulatoryReport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySdTxRptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySideTransactionReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Regulatory transaction reporting information from the Counterparty Side party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCounterpartySideTransactionReporting
	 * RegulatoryReporting4.mmCounterpartySideTransactionReporting}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterpartySideTransactionReporting = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RegulatoryReport.mmObject();
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "CtrPtySdTxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideTransactionReporting";
			definition = "Regulatory transaction reporting information from the Counterparty Side party.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmCounterpartySideTransactionReporting;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CounterpartySideTransactionReporting1.mmObject();
		}
	};
	protected PartyIdentification73Choice centralCounterpartyClearingHouse;
	/**
	 * Identifies an agency or separate corporation of a futures exchange
	 * responsible for settling and<br>
	 * clearing trades, collecting and maintaining margins, regulating delivery
	 * and reporting trade data. This can also be known as a Central
	 * Counterparty (CCP).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntrlCtrPtyClrHs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterpartyClearingHouse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies an agency or separate corporation of a futures exchange responsible for settling and\r\nclearing trades, collecting and maintaining margins, regulating delivery and reporting trade data. This can also be known as a Central Counterparty (CCP)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCentralCounterpartyClearingHouse
	 * RegulatoryReporting4.mmCentralCounterpartyClearingHouse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCentralCounterpartyClearingHouse = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "CntrlCtrPtyClrHs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralCounterpartyClearingHouse";
			definition = "Identifies an agency or separate corporation of a futures exchange responsible for settling and\r\nclearing trades, collecting and maintaining margins, regulating delivery and reporting trade data. This can also be known as a Central Counterparty (CCP).";
			previousVersion_lazy = () -> RegulatoryReporting4.mmCentralCounterpartyClearingHouse;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}
	};
	protected PartyIdentification73Choice clearingBroker;
	/**
	 * Identifies the party that is a member of the clearing house (CCP) and
	 * that acts as a liaison between the investor and the Cntral Counterparty
	 * (CCP).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrBrkr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingBroker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party that is a member of the clearing house (CCP) and that acts as a liaison between the investor and the Cntral Counterparty (CCP)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingBroker
	 * RegulatoryReporting4.mmClearingBroker}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClearingBroker = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "ClrBrkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingBroker";
			definition = "Identifies the party that is a member of the clearing house (CCP) and that acts as a liaison between the investor and the Cntral Counterparty (CCP).";
			previousVersion_lazy = () -> RegulatoryReporting4.mmClearingBroker;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingExceptionParty
	 * RegulatoryReporting4.mmClearingExceptionParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingExceptionParty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "ClrXcptnPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingExceptionParty";
			definition = "Identifies the party that is exempt from a clearing obligation.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmClearingExceptionParty;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingBrokerIdentification
	 * RegulatoryReporting4.mmClearingBrokerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingBrokerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmClearingBrokerIdentification;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "ClrBrkrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingBrokerIdentification";
			definition = "Specifies the reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmClearingBrokerIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingThresholdIndicator
	 * RegulatoryReporting4.mmClearingThresholdIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingThresholdIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Clearing.mmClearingThresholdIndicator;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "ClrThrshldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingThresholdIndicator";
			definition = "Specifies whether the contract is above or below the clearing threshold. Where No indicates the contract is below the clearing threshold and Yes indicates the contract is above the clearing threshold.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmClearingThresholdIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearedProductIdentification
	 * RegulatoryReporting4.mmClearedProductIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearedProductIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Clearing.mmClearedIdentification;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "ClrdPdctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearedProductIdentification";
			definition = "Specifies the reference number assigned by the Central Counterparty (CCP).";
			previousVersion_lazy = () -> RegulatoryReporting4.mmClearedProductIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmUnderlyingProductIdentifier
	 * RegulatoryReporting4.mmUnderlyingProductIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnderlyingProductIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RegulatoryReport.mmUnderlyingProduct;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "UndrlygPdctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingProductIdentifier";
			definition = "Specifies the underlying product type.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmUnderlyingProductIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmAllocationIndicator
	 * RegulatoryReporting4.mmAllocationIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllocationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmAllocationIndicator;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "AllcnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationIndicator";
			definition = "Specifies whether the trade is a pre-allocation or a post-allocation trade, or whether the trade is unallocated.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmAllocationIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCollateralisationIndicator
	 * RegulatoryReporting4.mmCollateralisationIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralisationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmCollateralisationType;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "CollstnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisationIndicator";
			definition = "Specifies whether the transaction is collateralised.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmCollateralisationIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmExecutionVenue
	 * RegulatoryReporting4.mmExecutionVenue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutionVenue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "ExctnVn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionVenue";
			definition = "Specifies the trading venue of the transaction.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmExecutionVenue;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmExecutionTimestamp
	 * RegulatoryReporting4.mmExecutionTimestamp}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutionTimestamp = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "ExctnTmstmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionTimestamp";
			definition = "Specifies the date and time of the execution of the transaction in Coordinated Universal Time (UTC).";
			previousVersion_lazy = () -> RegulatoryReporting4.mmExecutionTimestamp;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmNonStandardFlag
	 * RegulatoryReporting4.mmNonStandardFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonStandardFlag = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RegulatoryReport.mmNonStandardFlag;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "NonStdFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardFlag";
			definition = "Specifies whether the reportable transaction has one or more additional terms or provisions, other than those listed in the required real-time data fields, that materially affects the price of the reportable transaction.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmNonStandardFlag;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmLinkSwapIdentification
	 * RegulatoryReporting4.mmLinkSwapIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkSwapIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeSwap.mmLinkSwapIdentification;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "LkSwpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSwapIdentification";
			definition = "Specifies the common reference or correlation identification for a swap transaction where the near and far leg are confirmed separately.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmLinkSwapIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact42Text.mmObject();
		}
	};
	protected YesNoIndicator financialNatureOfTheCounterpartyIndicator;
	/**
	 * Specifies the financial nature of the reporting counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinNtrOfTheCtrPtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialNatureOfTheCounterpartyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the financial nature of the reporting counterparty."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmFinancialNatureOfTheCounterpartyIndicator
	 * RegulatoryReporting4.mmFinancialNatureOfTheCounterpartyIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialNatureOfTheCounterpartyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "FinNtrOfTheCtrPtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialNatureOfTheCounterpartyIndicator";
			definition = "Specifies the financial nature of the reporting counterparty.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmFinancialNatureOfTheCounterpartyIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator collateralPortfolioIndicator;
	/**
	 * Specifies if the collateral is posted on a portfolio basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrtflInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralPortfolioIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the collateral is posted on a portfolio basis."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCollateralPortfolioIndicator
	 * RegulatoryReporting4.mmCollateralPortfolioIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralPortfolioIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "CollPrtflInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralPortfolioIndicator";
			definition = "Specifies if the collateral is posted on a portfolio basis.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmCollateralPortfolioIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected Max10Text collateralPortfolioCode;
	/**
	 * Identifies the portfolio code to which the trade belongs if the
	 * collateral is posted on a portfolio basis (and not trade by trade).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max10Text
	 * Max10Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrtflCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralPortfolioCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the portfolio code to which the trade belongs if the collateral is posted on a portfolio basis (and not trade by trade)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCollateralPortfolioCode
	 * RegulatoryReporting4.mmCollateralPortfolioCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralPortfolioCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "CollPrtflCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralPortfolioCode";
			definition = "Identifies the portfolio code to which the trade belongs if the collateral is posted on a portfolio basis (and not trade by trade).";
			previousVersion_lazy = () -> RegulatoryReporting4.mmCollateralPortfolioCode;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10Text.mmObject();
		}
	};
	protected YesNoIndicator portfolioCompressionIndicator;
	/**
	 * Indicates if the trade results from portfolio compression.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtflCmprssnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioCompressionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the trade results from portfolio compression."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmPortfolioCompressionIndicator
	 * RegulatoryReporting4.mmPortfolioCompressionIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortfolioCompressionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "PrtflCmprssnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioCompressionIndicator";
			definition = "Indicates if the trade results from portfolio compression.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmPortfolioCompressionIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected CorporateSectorIdentifier1Code corporateSectorIndicator;
	/**
	 * Specifies the corporate sector of the counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateSectorIdentifier1Code
	 * CorporateSectorIdentifier1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpSctrInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateSectorIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the corporate sector of the counterparty."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCorporateSectorIndicator
	 * RegulatoryReporting4.mmCorporateSectorIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCorporateSectorIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "CorpSctrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateSectorIndicator";
			definition = "Specifies the corporate sector of the counterparty.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmCorporateSectorIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CorporateSectorIdentifier1Code.mmObject();
		}
	};
	protected YesNoIndicator tradeWithNonEEACounterpartyIndicator;
	/**
	 * Specifies whether the counterparty has entered into a trade with a
	 * non-European Economic Area (EEA) counterparty that is not subject to the
	 * reporting obligation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradWthNonEEACtrPtyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeWithNonEEACounterpartyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the counterparty has entered into a trade with a non-European Economic Area (EEA) counterparty that is not subject to the reporting obligation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmTradeWithNonEEACounterpartyIndicator
	 * RegulatoryReporting4.mmTradeWithNonEEACounterpartyIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeWithNonEEACounterpartyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "TradWthNonEEACtrPtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeWithNonEEACounterpartyIndicator";
			definition = "Specifies whether the counterparty has entered into a trade with a non-European Economic Area (EEA) counterparty that is not subject to the reporting obligation.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmTradeWithNonEEACounterpartyIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator intragroupTradeIndicator;
	/**
	 * To indicate if a reported trade falls under the definition of intragroup
	 * transaction, as defined by European Securities and Markets Authority
	 * (ESMA) in the Technical Standards.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtrgrpTradInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntragroupTradeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "To indicate if a reported trade falls under the definition of intragroup transaction, as defined by European Securities and Markets Authority (ESMA) in the Technical Standards."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmIntragroupTradeIndicator
	 * RegulatoryReporting4.mmIntragroupTradeIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntragroupTradeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "NtrgrpTradInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntragroupTradeIndicator";
			definition = "To indicate if a reported trade falls under the definition of intragroup transaction, as defined by European Securities and Markets Authority (ESMA) in the Technical Standards.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmIntragroupTradeIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator commercialOrTreasuryFinancingIndicator;
	/**
	 * Specifies whether the contract is objectively measurable as directly
	 * linked to the non-financial counterparty's commercial or treasury
	 * financing activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComrclOrTrsrFincgInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercialOrTreasuryFinancingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the contract is objectively measurable as directly linked to the non-financial counterparty's commercial or treasury financing activity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCommercialOrTreasuryFinancingIndicator
	 * RegulatoryReporting4.mmCommercialOrTreasuryFinancingIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommercialOrTreasuryFinancingIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "ComrclOrTrsrFincgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialOrTreasuryFinancingIndicator";
			definition = "Specifies whether the contract is objectively measurable as directly linked to the non-financial counterparty's commercial or treasury financing activity.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmCommercialOrTreasuryFinancingIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * Identification of a security, as assigned under a formal or proprietary
	 * identification scheme.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a security, as assigned under a formal or proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of a security, as assigned under a formal or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecurityIdentification19.mmObject();
		}
	};
	protected ISODateTime confirmationDateAndTimestamp;
	/**
	 * Specifies the date and time of the confirmation of the trade in UTC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfDtAndTmstmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationDateAndTimestamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date and time of the confirmation of the trade in UTC."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmConfirmationDateAndTimestamp = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "ConfDtAndTmstmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDateAndTimestamp";
			definition = "Specifies the date and time of the confirmation of the trade in UTC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISOTime clearingTimestamp;
	/**
	 * Specifies the time at which the CCP has legally taken on the clearing of
	 * the trade in UTC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmValueDate
	 * Trade.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrTmstmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingTimestamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the time at which the CCP has legally taken on the clearing of the trade in UTC."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingTimestamp = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmValueDate;
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "ClrTmstmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingTimestamp";
			definition = "Specifies the time at which the CCP has legally taken on the clearing of the trade in UTC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmAdditionalReportingInformation
	 * RegulatoryReporting4.mmAdditionalReportingInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalReportingInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "AddtlRptgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReportingInformation";
			definition = "Specifies additional information that might be required by the regulator.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmAdditionalReportingInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RegulatoryReporting6.mmTradingSideTransactionReporting, RegulatoryReporting6.mmCounterpartySideTransactionReporting, RegulatoryReporting6.mmCentralCounterpartyClearingHouse,
						RegulatoryReporting6.mmClearingBroker, RegulatoryReporting6.mmClearingExceptionParty, RegulatoryReporting6.mmClearingBrokerIdentification, RegulatoryReporting6.mmClearingThresholdIndicator,
						RegulatoryReporting6.mmClearedProductIdentification, RegulatoryReporting6.mmUnderlyingProductIdentifier, RegulatoryReporting6.mmAllocationIndicator, RegulatoryReporting6.mmCollateralisationIndicator,
						RegulatoryReporting6.mmExecutionVenue, RegulatoryReporting6.mmExecutionTimestamp, RegulatoryReporting6.mmNonStandardFlag, RegulatoryReporting6.mmLinkSwapIdentification,
						RegulatoryReporting6.mmFinancialNatureOfTheCounterpartyIndicator, RegulatoryReporting6.mmCollateralPortfolioIndicator, RegulatoryReporting6.mmCollateralPortfolioCode,
						RegulatoryReporting6.mmPortfolioCompressionIndicator, RegulatoryReporting6.mmCorporateSectorIndicator, RegulatoryReporting6.mmTradeWithNonEEACounterpartyIndicator, RegulatoryReporting6.mmIntragroupTradeIndicator,
						RegulatoryReporting6.mmCommercialOrTreasuryFinancingIndicator, RegulatoryReporting6.mmFinancialInstrumentIdentification, RegulatoryReporting6.mmConfirmationDateAndTimestamp, RegulatoryReporting6.mmClearingTimestamp,
						RegulatoryReporting6.mmAdditionalReportingInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeInstructionV04.mmRegulatoryReporting, ForeignExchangeTradeStatusNotificationV06.mmRegulatoryReporting,
						ForeignExchangeTradeInstructionCancellationV04.mmRegulatoryReporting, ForeignExchangeTradeInstructionAmendmentV04.mmRegulatoryReporting, ForeignExchangeTradeStatusAndDetailsNotificationV04.mmRegulatoryReporting);
				trace_lazy = () -> RegulatoryReport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReporting6";
				definition = "Includes data elements that can be used for reporting to trade repositories, it is not to be used on regular trade confirmations. Although some fields, for example, unique transaction identifier and prior unique transaction identifier, might be used on regular trade confirmations.";
				previousVersion_lazy = () -> RegulatoryReporting4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TradgSdTxRptg")
	public List<TradingSideTransactionReporting1> getTradingSideTransactionReporting() {
		return tradingSideTransactionReporting;
	}

	public void setTradingSideTransactionReporting(List<com.tools20022.repository.msg.TradingSideTransactionReporting1> tradingSideTransactionReporting) {
		this.tradingSideTransactionReporting = tradingSideTransactionReporting;
	}

	@XmlElement(name = "CtrPtySdTxRptg")
	public List<CounterpartySideTransactionReporting1> getCounterpartySideTransactionReporting() {
		return counterpartySideTransactionReporting;
	}

	public void setCounterpartySideTransactionReporting(List<com.tools20022.repository.msg.CounterpartySideTransactionReporting1> counterpartySideTransactionReporting) {
		this.counterpartySideTransactionReporting = counterpartySideTransactionReporting;
	}

	@XmlElement(name = "CntrlCtrPtyClrHs")
	public PartyIdentification73Choice getCentralCounterpartyClearingHouse() {
		return centralCounterpartyClearingHouse;
	}

	public void setCentralCounterpartyClearingHouse(PartyIdentification73Choice centralCounterpartyClearingHouse) {
		this.centralCounterpartyClearingHouse = centralCounterpartyClearingHouse;
	}

	@XmlElement(name = "ClrBrkr")
	public PartyIdentification73Choice getClearingBroker() {
		return clearingBroker;
	}

	public void setClearingBroker(PartyIdentification73Choice clearingBroker) {
		this.clearingBroker = clearingBroker;
	}

	@XmlElement(name = "ClrXcptnPty")
	public PartyIdentification73Choice getClearingExceptionParty() {
		return clearingExceptionParty;
	}

	public void setClearingExceptionParty(PartyIdentification73Choice clearingExceptionParty) {
		this.clearingExceptionParty = clearingExceptionParty;
	}

	@XmlElement(name = "ClrBrkrId")
	public ClearingBrokerIdentification1 getClearingBrokerIdentification() {
		return clearingBrokerIdentification;
	}

	public void setClearingBrokerIdentification(com.tools20022.repository.msg.ClearingBrokerIdentification1 clearingBrokerIdentification) {
		this.clearingBrokerIdentification = clearingBrokerIdentification;
	}

	@XmlElement(name = "ClrThrshldInd")
	public YesNoIndicator getClearingThresholdIndicator() {
		return clearingThresholdIndicator;
	}

	public void setClearingThresholdIndicator(YesNoIndicator clearingThresholdIndicator) {
		this.clearingThresholdIndicator = clearingThresholdIndicator;
	}

	@XmlElement(name = "ClrdPdctId")
	public Max35Text getClearedProductIdentification() {
		return clearedProductIdentification;
	}

	public void setClearedProductIdentification(Max35Text clearedProductIdentification) {
		this.clearedProductIdentification = clearedProductIdentification;
	}

	@XmlElement(name = "UndrlygPdctIdr")
	public UnderlyingProductIdentifier1Code getUnderlyingProductIdentifier() {
		return underlyingProductIdentifier;
	}

	public void setUnderlyingProductIdentifier(UnderlyingProductIdentifier1Code underlyingProductIdentifier) {
		this.underlyingProductIdentifier = underlyingProductIdentifier;
	}

	@XmlElement(name = "AllcnInd")
	public AllocationIndicator1Code getAllocationIndicator() {
		return allocationIndicator;
	}

	public void setAllocationIndicator(AllocationIndicator1Code allocationIndicator) {
		this.allocationIndicator = allocationIndicator;
	}

	@XmlElement(name = "CollstnInd")
	public CollateralisationIndicator1Code getCollateralisationIndicator() {
		return collateralisationIndicator;
	}

	public void setCollateralisationIndicator(CollateralisationIndicator1Code collateralisationIndicator) {
		this.collateralisationIndicator = collateralisationIndicator;
	}

	@XmlElement(name = "ExctnVn")
	public Max35Text getExecutionVenue() {
		return executionVenue;
	}

	public void setExecutionVenue(Max35Text executionVenue) {
		this.executionVenue = executionVenue;
	}

	@XmlElement(name = "ExctnTmstmp")
	public DateAndDateTimeChoice getExecutionTimestamp() {
		return executionTimestamp;
	}

	public void setExecutionTimestamp(DateAndDateTimeChoice executionTimestamp) {
		this.executionTimestamp = executionTimestamp;
	}

	@XmlElement(name = "NonStdFlg")
	public YesNoIndicator getNonStandardFlag() {
		return nonStandardFlag;
	}

	public void setNonStandardFlag(YesNoIndicator nonStandardFlag) {
		this.nonStandardFlag = nonStandardFlag;
	}

	@XmlElement(name = "LkSwpId")
	public Exact42Text getLinkSwapIdentification() {
		return linkSwapIdentification;
	}

	public void setLinkSwapIdentification(Exact42Text linkSwapIdentification) {
		this.linkSwapIdentification = linkSwapIdentification;
	}

	@XmlElement(name = "FinNtrOfTheCtrPtyInd")
	public YesNoIndicator getFinancialNatureOfTheCounterpartyIndicator() {
		return financialNatureOfTheCounterpartyIndicator;
	}

	public void setFinancialNatureOfTheCounterpartyIndicator(YesNoIndicator financialNatureOfTheCounterpartyIndicator) {
		this.financialNatureOfTheCounterpartyIndicator = financialNatureOfTheCounterpartyIndicator;
	}

	@XmlElement(name = "CollPrtflInd")
	public YesNoIndicator getCollateralPortfolioIndicator() {
		return collateralPortfolioIndicator;
	}

	public void setCollateralPortfolioIndicator(YesNoIndicator collateralPortfolioIndicator) {
		this.collateralPortfolioIndicator = collateralPortfolioIndicator;
	}

	@XmlElement(name = "CollPrtflCd")
	public Max10Text getCollateralPortfolioCode() {
		return collateralPortfolioCode;
	}

	public void setCollateralPortfolioCode(Max10Text collateralPortfolioCode) {
		this.collateralPortfolioCode = collateralPortfolioCode;
	}

	@XmlElement(name = "PrtflCmprssnInd")
	public YesNoIndicator getPortfolioCompressionIndicator() {
		return portfolioCompressionIndicator;
	}

	public void setPortfolioCompressionIndicator(YesNoIndicator portfolioCompressionIndicator) {
		this.portfolioCompressionIndicator = portfolioCompressionIndicator;
	}

	@XmlElement(name = "CorpSctrInd")
	public CorporateSectorIdentifier1Code getCorporateSectorIndicator() {
		return corporateSectorIndicator;
	}

	public void setCorporateSectorIndicator(CorporateSectorIdentifier1Code corporateSectorIndicator) {
		this.corporateSectorIndicator = corporateSectorIndicator;
	}

	@XmlElement(name = "TradWthNonEEACtrPtyInd")
	public YesNoIndicator getTradeWithNonEEACounterpartyIndicator() {
		return tradeWithNonEEACounterpartyIndicator;
	}

	public void setTradeWithNonEEACounterpartyIndicator(YesNoIndicator tradeWithNonEEACounterpartyIndicator) {
		this.tradeWithNonEEACounterpartyIndicator = tradeWithNonEEACounterpartyIndicator;
	}

	@XmlElement(name = "NtrgrpTradInd")
	public YesNoIndicator getIntragroupTradeIndicator() {
		return intragroupTradeIndicator;
	}

	public void setIntragroupTradeIndicator(YesNoIndicator intragroupTradeIndicator) {
		this.intragroupTradeIndicator = intragroupTradeIndicator;
	}

	@XmlElement(name = "ComrclOrTrsrFincgInd")
	public YesNoIndicator getCommercialOrTreasuryFinancingIndicator() {
		return commercialOrTreasuryFinancingIndicator;
	}

	public void setCommercialOrTreasuryFinancingIndicator(YesNoIndicator commercialOrTreasuryFinancingIndicator) {
		this.commercialOrTreasuryFinancingIndicator = commercialOrTreasuryFinancingIndicator;
	}

	@XmlElement(name = "FinInstrmId")
	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public void setFinancialInstrumentIdentification(com.tools20022.repository.msg.SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
	}

	@XmlElement(name = "ConfDtAndTmstmp")
	public ISODateTime getConfirmationDateAndTimestamp() {
		return confirmationDateAndTimestamp;
	}

	public void setConfirmationDateAndTimestamp(ISODateTime confirmationDateAndTimestamp) {
		this.confirmationDateAndTimestamp = confirmationDateAndTimestamp;
	}

	@XmlElement(name = "ClrTmstmp")
	public ISOTime getClearingTimestamp() {
		return clearingTimestamp;
	}

	public void setClearingTimestamp(ISOTime clearingTimestamp) {
		this.clearingTimestamp = clearingTimestamp;
	}

	@XmlElement(name = "AddtlRptgInf")
	public Max210Text getAdditionalReportingInformation() {
		return additionalReportingInformation;
	}

	public void setAdditionalReportingInformation(Max210Text additionalReportingInformation) {
		this.additionalReportingInformation = additionalReportingInformation;
	}
}