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
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmTradingSideTransactionReporting
 * RegulatoryReporting4.mmTradingSideTransactionReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCounterpartySideTransactionReporting
 * RegulatoryReporting4.mmCounterpartySideTransactionReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCentralCounterpartyClearingHouse
 * RegulatoryReporting4.mmCentralCounterpartyClearingHouse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingBroker
 * RegulatoryReporting4.mmClearingBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingExceptionParty
 * RegulatoryReporting4.mmClearingExceptionParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingBrokerIdentification
 * RegulatoryReporting4.mmClearingBrokerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearingThresholdIndicator
 * RegulatoryReporting4.mmClearingThresholdIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmClearedProductIdentification
 * RegulatoryReporting4.mmClearedProductIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmUnderlyingProductIdentifier
 * RegulatoryReporting4.mmUnderlyingProductIdentifier}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmAllocationIndicator
 * RegulatoryReporting4.mmAllocationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCollateralisationIndicator
 * RegulatoryReporting4.mmCollateralisationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmExecutionVenue
 * RegulatoryReporting4.mmExecutionVenue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmExecutionTimestamp
 * RegulatoryReporting4.mmExecutionTimestamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmNonStandardFlag
 * RegulatoryReporting4.mmNonStandardFlag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmLinkSwapIdentification
 * RegulatoryReporting4.mmLinkSwapIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmFinancialNatureOfTheCounterpartyIndicator
 * RegulatoryReporting4.mmFinancialNatureOfTheCounterpartyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCollateralPortfolioIndicator
 * RegulatoryReporting4.mmCollateralPortfolioIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCollateralPortfolioCode
 * RegulatoryReporting4.mmCollateralPortfolioCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmPortfolioCompressionIndicator
 * RegulatoryReporting4.mmPortfolioCompressionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCorporateSectorIndicator
 * RegulatoryReporting4.mmCorporateSectorIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmTradeWithNonEEACounterpartyIndicator
 * RegulatoryReporting4.mmTradeWithNonEEACounterpartyIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmIntragroupTradeIndicator
 * RegulatoryReporting4.mmIntragroupTradeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmCommercialOrTreasuryFinancingIndicator
 * RegulatoryReporting4.mmCommercialOrTreasuryFinancingIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4#mmAdditionalReportingInformation
 * RegulatoryReporting4.mmAdditionalReportingInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RegulatoryReport
 * RegulatoryReport}</li>
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
 * "RegulatoryReporting4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Includes data elements that can be used for reporting to trade repositories, it is not to be used on regular trade confirmations. Although some fields, for example, unique transaction identifier and prior unique transaction identifier, might be used on regular trade confirmations."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RegulatoryReporting6
 * RegulatoryReporting6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1
 * RegulatoryReporting1}</li>
 * </ul>
 */
public class RegulatoryReporting4 {

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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmTradingSideTransactionReporting
	 * RegulatoryReporting6.mmTradingSideTransactionReporting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradingSideTransactionReporting = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RegulatoryReport.mmObject();
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "TradgSdTxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideTransactionReporting";
			definition = "Regulatory transaction reporting information from the Trading Side party.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmTradingSideTransactionReporting);
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCounterpartySideTransactionReporting
	 * RegulatoryReporting6.mmCounterpartySideTransactionReporting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCounterpartySideTransactionReporting = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RegulatoryReport.mmObject();
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "CtrPtySdTxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideTransactionReporting";
			definition = "Regulatory transaction reporting information from the Counterparty Side party.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCounterpartySideTransactionReporting);
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCentralCounterpartyClearingHouse
	 * RegulatoryReporting6.mmCentralCounterpartyClearingHouse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCentralCounterpartyClearingHouse = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "CntrlCtrPtyClrHs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralCounterpartyClearingHouse";
			definition = "Identifies an agency or separate corporation of a futures exchange responsible for settling and\r\nclearing trades, collecting and maintaining margins, regulating delivery and reporting trade data. This can also be known as a Central Counterparty (CCP).";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCentralCounterpartyClearingHouse);
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingBroker
	 * RegulatoryReporting6.mmClearingBroker}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClearingBroker = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ClrBrkr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingBroker";
			definition = "Identifies the party that is a member of the clearing house (CCP) and that acts as a liaison between the investor and the Cntral Counterparty (CCP).";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmClearingBroker);
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingExceptionParty
	 * RegulatoryReporting6.mmClearingExceptionParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmClearingExceptionParty
	 * RegulatoryReporting1.mmClearingExceptionParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingExceptionParty = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ClrXcptnPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingExceptionParty";
			definition = "Identifies the party that is exempt from a clearing obligation.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmClearingExceptionParty);
			previousVersion_lazy = () -> RegulatoryReporting1.mmClearingExceptionParty;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingBrokerIdentification
	 * RegulatoryReporting6.mmClearingBrokerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmClearingBrokerIdentification
	 * RegulatoryReporting1.mmClearingBrokerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingBrokerIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmClearingBrokerIdentification;
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ClrBrkrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingBrokerIdentification";
			definition = "Specifies the reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmClearingBrokerIdentification);
			previousVersion_lazy = () -> RegulatoryReporting1.mmClearingBrokerIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearingThresholdIndicator
	 * RegulatoryReporting6.mmClearingThresholdIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmClearingThresholdIndicator
	 * RegulatoryReporting1.mmClearingThresholdIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearingThresholdIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Clearing.mmClearingThresholdIndicator;
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ClrThrshldInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingThresholdIndicator";
			definition = "Specifies whether the contract is above or below the clearing threshold. Where No indicates the contract is below the clearing threshold and Yes indicates the contract is above the clearing threshold.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmClearingThresholdIndicator);
			previousVersion_lazy = () -> RegulatoryReporting1.mmClearingThresholdIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmClearedProductIdentification
	 * RegulatoryReporting6.mmClearedProductIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmClearedProductIdentification
	 * RegulatoryReporting1.mmClearedProductIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClearedProductIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Clearing.mmClearedIdentification;
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ClrdPdctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearedProductIdentification";
			definition = "Specifies the reference number assigned by the Central Counterparty (CCP).";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmClearedProductIdentification);
			previousVersion_lazy = () -> RegulatoryReporting1.mmClearedProductIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmUnderlyingProductIdentifier
	 * RegulatoryReporting6.mmUnderlyingProductIdentifier}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmUnderlyingProductIdentifier
	 * RegulatoryReporting1.mmUnderlyingProductIdentifier}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnderlyingProductIdentifier = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RegulatoryReport.mmUnderlyingProduct;
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "UndrlygPdctIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingProductIdentifier";
			definition = "Specifies the underlying product type.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmUnderlyingProductIdentifier);
			previousVersion_lazy = () -> RegulatoryReporting1.mmUnderlyingProductIdentifier;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmAllocationIndicator
	 * RegulatoryReporting6.mmAllocationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmAllocationIndicator
	 * RegulatoryReporting1.mmAllocationIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllocationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmAllocationIndicator;
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "AllcnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationIndicator";
			definition = "Specifies whether the trade is a pre-allocation or a post-allocation trade, or whether the trade is unallocated.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmAllocationIndicator);
			previousVersion_lazy = () -> RegulatoryReporting1.mmAllocationIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCollateralisationIndicator
	 * RegulatoryReporting6.mmCollateralisationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmCollateralisationIndicator
	 * RegulatoryReporting1.mmCollateralisationIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralisationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmCollateralisationType;
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "CollstnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralisationIndicator";
			definition = "Specifies whether the transaction is collateralised.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCollateralisationIndicator);
			previousVersion_lazy = () -> RegulatoryReporting1.mmCollateralisationIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmExecutionVenue
	 * RegulatoryReporting6.mmExecutionVenue}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmExecutionVenue
	 * RegulatoryReporting1.mmExecutionVenue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutionVenue = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ExctnVn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionVenue";
			definition = "Specifies the trading venue of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmExecutionVenue);
			previousVersion_lazy = () -> RegulatoryReporting1.mmExecutionVenue;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmExecutionTimestamp
	 * RegulatoryReporting6.mmExecutionTimestamp}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmExecutionTimestamp
	 * RegulatoryReporting1.mmExecutionTimestamp}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExecutionTimestamp = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ExctnTmstmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionTimestamp";
			definition = "Specifies the date and time of the execution of the transaction in Coordinated Universal Time (UTC).";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmExecutionTimestamp);
			previousVersion_lazy = () -> RegulatoryReporting1.mmExecutionTimestamp;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmNonStandardFlag
	 * RegulatoryReporting6.mmNonStandardFlag}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmNonStandardFlag
	 * RegulatoryReporting1.mmNonStandardFlag}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonStandardFlag = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RegulatoryReport.mmNonStandardFlag;
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "NonStdFlg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardFlag";
			definition = "Specifies whether the reportable transaction has one or more additional terms or provisions, other than those listed in the required real-time data fields, that materially affects the price of the reportable transaction.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmNonStandardFlag);
			previousVersion_lazy = () -> RegulatoryReporting1.mmNonStandardFlag;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmLinkSwapIdentification
	 * RegulatoryReporting6.mmLinkSwapIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmLinkSwapIdentification
	 * RegulatoryReporting1.mmLinkSwapIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLinkSwapIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeSwap.mmLinkSwapIdentification;
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "LkSwpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkSwapIdentification";
			definition = "Specifies the common reference or correlation identification for a swap transaction where the near and far leg are confirmed separately.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmLinkSwapIdentification);
			previousVersion_lazy = () -> RegulatoryReporting1.mmLinkSwapIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmFinancialNatureOfTheCounterpartyIndicator
	 * RegulatoryReporting6.mmFinancialNatureOfTheCounterpartyIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialNatureOfTheCounterpartyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "FinNtrOfTheCtrPtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialNatureOfTheCounterpartyIndicator";
			definition = "Specifies the financial nature of the reporting counterparty.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmFinancialNatureOfTheCounterpartyIndicator);
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCollateralPortfolioIndicator
	 * RegulatoryReporting6.mmCollateralPortfolioIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralPortfolioIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "CollPrtflInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralPortfolioIndicator";
			definition = "Specifies if the collateral is posted on a portfolio basis.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCollateralPortfolioIndicator);
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCollateralPortfolioCode
	 * RegulatoryReporting6.mmCollateralPortfolioCode}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralPortfolioCode = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "CollPrtflCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralPortfolioCode";
			definition = "Identifies the portfolio code to which the trade belongs if the collateral is posted on a portfolio basis (and not trade by trade).";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCollateralPortfolioCode);
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmPortfolioCompressionIndicator
	 * RegulatoryReporting6.mmPortfolioCompressionIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortfolioCompressionIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "PrtflCmprssnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioCompressionIndicator";
			definition = "Indicates if the trade results from portfolio compression.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmPortfolioCompressionIndicator);
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCorporateSectorIndicator
	 * RegulatoryReporting6.mmCorporateSectorIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCorporateSectorIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "CorpSctrInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateSectorIndicator";
			definition = "Specifies the corporate sector of the counterparty.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCorporateSectorIndicator);
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmTradeWithNonEEACounterpartyIndicator
	 * RegulatoryReporting6.mmTradeWithNonEEACounterpartyIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeWithNonEEACounterpartyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "TradWthNonEEACtrPtyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeWithNonEEACounterpartyIndicator";
			definition = "Specifies whether the counterparty has entered into a trade with a non-European Economic Area (EEA) counterparty that is not subject to the reporting obligation.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmTradeWithNonEEACounterpartyIndicator);
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmIntragroupTradeIndicator
	 * RegulatoryReporting6.mmIntragroupTradeIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntragroupTradeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "NtrgrpTradInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntragroupTradeIndicator";
			definition = "To indicate if a reported trade falls under the definition of intragroup transaction, as defined by European Securities and Markets Authority (ESMA) in the Technical Standards.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmIntragroupTradeIndicator);
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmCommercialOrTreasuryFinancingIndicator
	 * RegulatoryReporting6.mmCommercialOrTreasuryFinancingIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommercialOrTreasuryFinancingIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "ComrclOrTrsrFincgInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercialOrTreasuryFinancingIndicator";
			definition = "Specifies whether the contract is objectively measurable as directly linked to the non-financial counterparty's commercial or treasury financing activity.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmCommercialOrTreasuryFinancingIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting4
	 * RegulatoryReporting4}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6#mmAdditionalReportingInformation
	 * RegulatoryReporting6.mmAdditionalReportingInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting1#mmAdditionalReportingInformation
	 * RegulatoryReporting1.mmAdditionalReportingInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalReportingInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RegulatoryReporting4.mmObject();
			isDerived = false;
			xmlTag = "AddtlRptgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReportingInformation";
			definition = "Specifies additional information that might be required by the regulator.";
			nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmAdditionalReportingInformation);
			previousVersion_lazy = () -> RegulatoryReporting1.mmAdditionalReportingInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RegulatoryReporting4.mmTradingSideTransactionReporting, RegulatoryReporting4.mmCounterpartySideTransactionReporting, RegulatoryReporting4.mmCentralCounterpartyClearingHouse,
						RegulatoryReporting4.mmClearingBroker, RegulatoryReporting4.mmClearingExceptionParty, RegulatoryReporting4.mmClearingBrokerIdentification, RegulatoryReporting4.mmClearingThresholdIndicator,
						RegulatoryReporting4.mmClearedProductIdentification, RegulatoryReporting4.mmUnderlyingProductIdentifier, RegulatoryReporting4.mmAllocationIndicator, RegulatoryReporting4.mmCollateralisationIndicator,
						RegulatoryReporting4.mmExecutionVenue, RegulatoryReporting4.mmExecutionTimestamp, RegulatoryReporting4.mmNonStandardFlag, RegulatoryReporting4.mmLinkSwapIdentification,
						RegulatoryReporting4.mmFinancialNatureOfTheCounterpartyIndicator, RegulatoryReporting4.mmCollateralPortfolioIndicator, RegulatoryReporting4.mmCollateralPortfolioCode,
						RegulatoryReporting4.mmPortfolioCompressionIndicator, RegulatoryReporting4.mmCorporateSectorIndicator, RegulatoryReporting4.mmTradeWithNonEEACounterpartyIndicator, RegulatoryReporting4.mmIntragroupTradeIndicator,
						RegulatoryReporting4.mmCommercialOrTreasuryFinancingIndicator, RegulatoryReporting4.mmAdditionalReportingInformation);
				trace_lazy = () -> RegulatoryReport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReporting4";
				definition = "Includes data elements that can be used for reporting to trade repositories, it is not to be used on regular trade confirmations. Although some fields, for example, unique transaction identifier and prior unique transaction identifier, might be used on regular trade confirmations.";
				nextVersions_lazy = () -> Arrays.asList(RegulatoryReporting6.mmObject());
				previousVersion_lazy = () -> RegulatoryReporting1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<TradingSideTransactionReporting1> getTradingSideTransactionReporting() {
		return tradingSideTransactionReporting;
	}

	public void setTradingSideTransactionReporting(List<com.tools20022.repository.msg.TradingSideTransactionReporting1> tradingSideTransactionReporting) {
		this.tradingSideTransactionReporting = tradingSideTransactionReporting;
	}

	public List<CounterpartySideTransactionReporting1> getCounterpartySideTransactionReporting() {
		return counterpartySideTransactionReporting;
	}

	public void setCounterpartySideTransactionReporting(List<com.tools20022.repository.msg.CounterpartySideTransactionReporting1> counterpartySideTransactionReporting) {
		this.counterpartySideTransactionReporting = counterpartySideTransactionReporting;
	}

	public PartyIdentification73Choice getCentralCounterpartyClearingHouse() {
		return centralCounterpartyClearingHouse;
	}

	public void setCentralCounterpartyClearingHouse(PartyIdentification73Choice centralCounterpartyClearingHouse) {
		this.centralCounterpartyClearingHouse = centralCounterpartyClearingHouse;
	}

	public PartyIdentification73Choice getClearingBroker() {
		return clearingBroker;
	}

	public void setClearingBroker(PartyIdentification73Choice clearingBroker) {
		this.clearingBroker = clearingBroker;
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

	public YesNoIndicator getFinancialNatureOfTheCounterpartyIndicator() {
		return financialNatureOfTheCounterpartyIndicator;
	}

	public void setFinancialNatureOfTheCounterpartyIndicator(YesNoIndicator financialNatureOfTheCounterpartyIndicator) {
		this.financialNatureOfTheCounterpartyIndicator = financialNatureOfTheCounterpartyIndicator;
	}

	public YesNoIndicator getCollateralPortfolioIndicator() {
		return collateralPortfolioIndicator;
	}

	public void setCollateralPortfolioIndicator(YesNoIndicator collateralPortfolioIndicator) {
		this.collateralPortfolioIndicator = collateralPortfolioIndicator;
	}

	public Max10Text getCollateralPortfolioCode() {
		return collateralPortfolioCode;
	}

	public void setCollateralPortfolioCode(Max10Text collateralPortfolioCode) {
		this.collateralPortfolioCode = collateralPortfolioCode;
	}

	public YesNoIndicator getPortfolioCompressionIndicator() {
		return portfolioCompressionIndicator;
	}

	public void setPortfolioCompressionIndicator(YesNoIndicator portfolioCompressionIndicator) {
		this.portfolioCompressionIndicator = portfolioCompressionIndicator;
	}

	public CorporateSectorIdentifier1Code getCorporateSectorIndicator() {
		return corporateSectorIndicator;
	}

	public void setCorporateSectorIndicator(CorporateSectorIdentifier1Code corporateSectorIndicator) {
		this.corporateSectorIndicator = corporateSectorIndicator;
	}

	public YesNoIndicator getTradeWithNonEEACounterpartyIndicator() {
		return tradeWithNonEEACounterpartyIndicator;
	}

	public void setTradeWithNonEEACounterpartyIndicator(YesNoIndicator tradeWithNonEEACounterpartyIndicator) {
		this.tradeWithNonEEACounterpartyIndicator = tradeWithNonEEACounterpartyIndicator;
	}

	public YesNoIndicator getIntragroupTradeIndicator() {
		return intragroupTradeIndicator;
	}

	public void setIntragroupTradeIndicator(YesNoIndicator intragroupTradeIndicator) {
		this.intragroupTradeIndicator = intragroupTradeIndicator;
	}

	public YesNoIndicator getCommercialOrTreasuryFinancingIndicator() {
		return commercialOrTreasuryFinancingIndicator;
	}

	public void setCommercialOrTreasuryFinancingIndicator(YesNoIndicator commercialOrTreasuryFinancingIndicator) {
		this.commercialOrTreasuryFinancingIndicator = commercialOrTreasuryFinancingIndicator;
	}

	public Max210Text getAdditionalReportingInformation() {
		return additionalReportingInformation;
	}

	public void setAdditionalReportingInformation(Max210Text additionalReportingInformation) {
		this.additionalReportingInformation = additionalReportingInformation;
	}
}