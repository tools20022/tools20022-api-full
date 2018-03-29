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
import com.tools20022.repository.msg.ClearingBrokerIdentification1;
import com.tools20022.repository.msg.CounterpartySideTransactionReporting1;
import com.tools20022.repository.msg.SecurityIdentification19;
import com.tools20022.repository.msg.TradingSideTransactionReporting1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RegulatoryReporting6", propOrder = {"tradingSideTransactionReporting", "counterpartySideTransactionReporting", "centralCounterpartyClearingHouse", "clearingBroker", "clearingExceptionParty", "clearingBrokerIdentification",
		"clearingThresholdIndicator", "clearedProductIdentification", "underlyingProductIdentifier", "allocationIndicator", "collateralisationIndicator", "executionVenue", "executionTimestamp", "nonStandardFlag", "linkSwapIdentification",
		"financialNatureOfTheCounterpartyIndicator", "collateralPortfolioIndicator", "collateralPortfolioCode", "portfolioCompressionIndicator", "corporateSectorIndicator", "tradeWithNonEEACounterpartyIndicator",
		"intragroupTradeIndicator", "commercialOrTreasuryFinancingIndicator", "financialInstrumentIdentification", "confirmationDateAndTimestamp", "clearingTimestamp", "additionalReportingInformation"})
public class RegulatoryReporting6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradgSdTxRptg")
	protected List<TradingSideTransactionReporting1> tradingSideTransactionReporting;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<RegulatoryReporting6, List<TradingSideTransactionReporting1>> mmTradingSideTransactionReporting = new MMMessageAssociationEnd<RegulatoryReporting6, List<TradingSideTransactionReporting1>>() {
		{
			businessComponentTrace_lazy = () -> RegulatoryReport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "TradgSdTxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideTransactionReporting";
			definition = "Regulatory transaction reporting information from the Trading Side party.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmTradingSideTransactionReporting;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradingSideTransactionReporting1.mmObject();
		}

		@Override
		public List<TradingSideTransactionReporting1> getValue(RegulatoryReporting6 obj) {
			return obj.getTradingSideTransactionReporting();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, List<TradingSideTransactionReporting1> value) {
			obj.setTradingSideTransactionReporting(value);
		}
	};
	@XmlElement(name = "CtrPtySdTxRptg")
	protected List<CounterpartySideTransactionReporting1> counterpartySideTransactionReporting;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<RegulatoryReporting6, List<CounterpartySideTransactionReporting1>> mmCounterpartySideTransactionReporting = new MMMessageAssociationEnd<RegulatoryReporting6, List<CounterpartySideTransactionReporting1>>() {
		{
			businessComponentTrace_lazy = () -> RegulatoryReport.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "CtrPtySdTxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideTransactionReporting";
			definition = "Regulatory transaction reporting information from the Counterparty Side party.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmCounterpartySideTransactionReporting;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CounterpartySideTransactionReporting1.mmObject();
		}

		@Override
		public List<CounterpartySideTransactionReporting1> getValue(RegulatoryReporting6 obj) {
			return obj.getCounterpartySideTransactionReporting();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, List<CounterpartySideTransactionReporting1> value) {
			obj.setCounterpartySideTransactionReporting(value);
		}
	};
	@XmlElement(name = "CntrlCtrPtyClrHs")
	protected PartyIdentification73Choice centralCounterpartyClearingHouse;
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
	public static final MMMessageAssociationEnd<RegulatoryReporting6, Optional<PartyIdentification73Choice>> mmCentralCounterpartyClearingHouse = new MMMessageAssociationEnd<RegulatoryReporting6, Optional<PartyIdentification73Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<PartyIdentification73Choice> getValue(RegulatoryReporting6 obj) {
			return obj.getCentralCounterpartyClearingHouse();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<PartyIdentification73Choice> value) {
			obj.setCentralCounterpartyClearingHouse(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrBrkr")
	protected PartyIdentification73Choice clearingBroker;
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
	public static final MMMessageAssociationEnd<RegulatoryReporting6, Optional<PartyIdentification73Choice>> mmClearingBroker = new MMMessageAssociationEnd<RegulatoryReporting6, Optional<PartyIdentification73Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<PartyIdentification73Choice> getValue(RegulatoryReporting6 obj) {
			return obj.getClearingBroker();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<PartyIdentification73Choice> value) {
			obj.setClearingBroker(value.orElse(null));
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<PartyIdentification73Choice>> mmClearingExceptionParty = new MMMessageAttribute<RegulatoryReporting6, Optional<PartyIdentification73Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<PartyIdentification73Choice> getValue(RegulatoryReporting6 obj) {
			return obj.getClearingExceptionParty();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<PartyIdentification73Choice> value) {
			obj.setClearingExceptionParty(value.orElse(null));
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<ClearingBrokerIdentification1>> mmClearingBrokerIdentification = new MMMessageAttribute<RegulatoryReporting6, Optional<ClearingBrokerIdentification1>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmClearingBrokerIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "ClrBrkrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingBrokerIdentification";
			definition = "Specifies the reference number assigned by the clearing broker. A distinction can be made between the reference for the Central Counterparty (CCP) leg and the reference for the client leg of the transaction.";
			previousVersion_lazy = () -> RegulatoryReporting4.mmClearingBrokerIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ClearingBrokerIdentification1.mmObject();
		}

		@Override
		public Optional<ClearingBrokerIdentification1> getValue(RegulatoryReporting6 obj) {
			return obj.getClearingBrokerIdentification();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<ClearingBrokerIdentification1> value) {
			obj.setClearingBrokerIdentification(value.orElse(null));
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>> mmClearingThresholdIndicator = new MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Clearing.mmClearingThresholdIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting6 obj) {
			return obj.getClearingThresholdIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<YesNoIndicator> value) {
			obj.setClearingThresholdIndicator(value.orElse(null));
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<Max35Text>> mmClearedProductIdentification = new MMMessageAttribute<RegulatoryReporting6, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Clearing.mmClearedIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<Max35Text> getValue(RegulatoryReporting6 obj) {
			return obj.getClearedProductIdentification();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<Max35Text> value) {
			obj.setClearedProductIdentification(value.orElse(null));
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<UnderlyingProductIdentifier1Code>> mmUnderlyingProductIdentifier = new MMMessageAttribute<RegulatoryReporting6, Optional<UnderlyingProductIdentifier1Code>>() {
		{
			businessElementTrace_lazy = () -> RegulatoryReport.mmUnderlyingProduct;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<UnderlyingProductIdentifier1Code> getValue(RegulatoryReporting6 obj) {
			return obj.getUnderlyingProductIdentifier();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<UnderlyingProductIdentifier1Code> value) {
			obj.setUnderlyingProductIdentifier(value.orElse(null));
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<AllocationIndicator1Code>> mmAllocationIndicator = new MMMessageAttribute<RegulatoryReporting6, Optional<AllocationIndicator1Code>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmAllocationIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<AllocationIndicator1Code> getValue(RegulatoryReporting6 obj) {
			return obj.getAllocationIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<AllocationIndicator1Code> value) {
			obj.setAllocationIndicator(value.orElse(null));
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<CollateralisationIndicator1Code>> mmCollateralisationIndicator = new MMMessageAttribute<RegulatoryReporting6, Optional<CollateralisationIndicator1Code>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmCollateralisationType;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<CollateralisationIndicator1Code> getValue(RegulatoryReporting6 obj) {
			return obj.getCollateralisationIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<CollateralisationIndicator1Code> value) {
			obj.setCollateralisationIndicator(value.orElse(null));
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<Max35Text>> mmExecutionVenue = new MMMessageAttribute<RegulatoryReporting6, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<Max35Text> getValue(RegulatoryReporting6 obj) {
			return obj.getExecutionVenue();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<Max35Text> value) {
			obj.setExecutionVenue(value.orElse(null));
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<DateAndDateTimeChoice>> mmExecutionTimestamp = new MMMessageAttribute<RegulatoryReporting6, Optional<DateAndDateTimeChoice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<DateAndDateTimeChoice> getValue(RegulatoryReporting6 obj) {
			return obj.getExecutionTimestamp();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setExecutionTimestamp(value.orElse(null));
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>> mmNonStandardFlag = new MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> RegulatoryReport.mmNonStandardFlag;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting6 obj) {
			return obj.getNonStandardFlag();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<YesNoIndicator> value) {
			obj.setNonStandardFlag(value.orElse(null));
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<Exact42Text>> mmLinkSwapIdentification = new MMMessageAttribute<RegulatoryReporting6, Optional<Exact42Text>>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeSwap.mmLinkSwapIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<Exact42Text> getValue(RegulatoryReporting6 obj) {
			return obj.getLinkSwapIdentification();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<Exact42Text> value) {
			obj.setLinkSwapIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "FinNtrOfTheCtrPtyInd")
	protected YesNoIndicator financialNatureOfTheCounterpartyIndicator;
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>> mmFinancialNatureOfTheCounterpartyIndicator = new MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting6 obj) {
			return obj.getFinancialNatureOfTheCounterpartyIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<YesNoIndicator> value) {
			obj.setFinancialNatureOfTheCounterpartyIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CollPrtflInd")
	protected YesNoIndicator collateralPortfolioIndicator;
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>> mmCollateralPortfolioIndicator = new MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting6 obj) {
			return obj.getCollateralPortfolioIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<YesNoIndicator> value) {
			obj.setCollateralPortfolioIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CollPrtflCd")
	protected Max10Text collateralPortfolioCode;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<Max10Text>> mmCollateralPortfolioCode = new MMMessageAttribute<RegulatoryReporting6, Optional<Max10Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<Max10Text> getValue(RegulatoryReporting6 obj) {
			return obj.getCollateralPortfolioCode();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<Max10Text> value) {
			obj.setCollateralPortfolioCode(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtflCmprssnInd")
	protected YesNoIndicator portfolioCompressionIndicator;
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>> mmPortfolioCompressionIndicator = new MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting6 obj) {
			return obj.getPortfolioCompressionIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<YesNoIndicator> value) {
			obj.setPortfolioCompressionIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpSctrInd")
	protected CorporateSectorIdentifier1Code corporateSectorIndicator;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<CorporateSectorIdentifier1Code>> mmCorporateSectorIndicator = new MMMessageAttribute<RegulatoryReporting6, Optional<CorporateSectorIdentifier1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<CorporateSectorIdentifier1Code> getValue(RegulatoryReporting6 obj) {
			return obj.getCorporateSectorIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<CorporateSectorIdentifier1Code> value) {
			obj.setCorporateSectorIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "TradWthNonEEACtrPtyInd")
	protected YesNoIndicator tradeWithNonEEACounterpartyIndicator;
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>> mmTradeWithNonEEACounterpartyIndicator = new MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting6 obj) {
			return obj.getTradeWithNonEEACounterpartyIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<YesNoIndicator> value) {
			obj.setTradeWithNonEEACounterpartyIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "NtrgrpTradInd")
	protected YesNoIndicator intragroupTradeIndicator;
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>> mmIntragroupTradeIndicator = new MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting6 obj) {
			return obj.getIntragroupTradeIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<YesNoIndicator> value) {
			obj.setIntragroupTradeIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "ComrclOrTrsrFincgInd")
	protected YesNoIndicator commercialOrTreasuryFinancingIndicator;
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>> mmCommercialOrTreasuryFinancingIndicator = new MMMessageAttribute<RegulatoryReporting6, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<YesNoIndicator> getValue(RegulatoryReporting6 obj) {
			return obj.getCommercialOrTreasuryFinancingIndicator();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<YesNoIndicator> value) {
			obj.setCommercialOrTreasuryFinancingIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmId")
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<RegulatoryReporting6, Optional<SecurityIdentification19>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<RegulatoryReporting6, Optional<SecurityIdentification19>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Identification of a security, as assigned under a formal or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public Optional<SecurityIdentification19> getValue(RegulatoryReporting6 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<SecurityIdentification19> value) {
			obj.setFinancialInstrumentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ConfDtAndTmstmp")
	protected ISODateTime confirmationDateAndTimestamp;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<ISODateTime>> mmConfirmationDateAndTimestamp = new MMMessageAttribute<RegulatoryReporting6, Optional<ISODateTime>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "ConfDtAndTmstmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDateAndTimestamp";
			definition = "Specifies the date and time of the confirmation of the trade in UTC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(RegulatoryReporting6 obj) {
			return obj.getConfirmationDateAndTimestamp();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<ISODateTime> value) {
			obj.setConfirmationDateAndTimestamp(value.orElse(null));
		}
	};
	@XmlElement(name = "ClrTmstmp")
	protected ISOTime clearingTimestamp;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<ISOTime>> mmClearingTimestamp = new MMMessageAttribute<RegulatoryReporting6, Optional<ISOTime>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
			isDerived = false;
			xmlTag = "ClrTmstmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingTimestamp";
			definition = "Specifies the time at which the CCP has legally taken on the clearing of the trade in UTC.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
		}

		@Override
		public Optional<ISOTime> getValue(RegulatoryReporting6 obj) {
			return obj.getClearingTimestamp();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<ISOTime> value) {
			obj.setClearingTimestamp(value.orElse(null));
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
	public static final MMMessageAttribute<RegulatoryReporting6, Optional<Max210Text>> mmAdditionalReportingInformation = new MMMessageAttribute<RegulatoryReporting6, Optional<Max210Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RegulatoryReporting6.mmObject();
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

		@Override
		public Optional<Max210Text> getValue(RegulatoryReporting6 obj) {
			return obj.getAdditionalReportingInformation();
		}

		@Override
		public void setValue(RegulatoryReporting6 obj, Optional<Max210Text> value) {
			obj.setAdditionalReportingInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RegulatoryReporting6.mmTradingSideTransactionReporting, com.tools20022.repository.msg.RegulatoryReporting6.mmCounterpartySideTransactionReporting,
						com.tools20022.repository.msg.RegulatoryReporting6.mmCentralCounterpartyClearingHouse, com.tools20022.repository.msg.RegulatoryReporting6.mmClearingBroker,
						com.tools20022.repository.msg.RegulatoryReporting6.mmClearingExceptionParty, com.tools20022.repository.msg.RegulatoryReporting6.mmClearingBrokerIdentification,
						com.tools20022.repository.msg.RegulatoryReporting6.mmClearingThresholdIndicator, com.tools20022.repository.msg.RegulatoryReporting6.mmClearedProductIdentification,
						com.tools20022.repository.msg.RegulatoryReporting6.mmUnderlyingProductIdentifier, com.tools20022.repository.msg.RegulatoryReporting6.mmAllocationIndicator,
						com.tools20022.repository.msg.RegulatoryReporting6.mmCollateralisationIndicator, com.tools20022.repository.msg.RegulatoryReporting6.mmExecutionVenue,
						com.tools20022.repository.msg.RegulatoryReporting6.mmExecutionTimestamp, com.tools20022.repository.msg.RegulatoryReporting6.mmNonStandardFlag,
						com.tools20022.repository.msg.RegulatoryReporting6.mmLinkSwapIdentification, com.tools20022.repository.msg.RegulatoryReporting6.mmFinancialNatureOfTheCounterpartyIndicator,
						com.tools20022.repository.msg.RegulatoryReporting6.mmCollateralPortfolioIndicator, com.tools20022.repository.msg.RegulatoryReporting6.mmCollateralPortfolioCode,
						com.tools20022.repository.msg.RegulatoryReporting6.mmPortfolioCompressionIndicator, com.tools20022.repository.msg.RegulatoryReporting6.mmCorporateSectorIndicator,
						com.tools20022.repository.msg.RegulatoryReporting6.mmTradeWithNonEEACounterpartyIndicator, com.tools20022.repository.msg.RegulatoryReporting6.mmIntragroupTradeIndicator,
						com.tools20022.repository.msg.RegulatoryReporting6.mmCommercialOrTreasuryFinancingIndicator, com.tools20022.repository.msg.RegulatoryReporting6.mmFinancialInstrumentIdentification,
						com.tools20022.repository.msg.RegulatoryReporting6.mmConfirmationDateAndTimestamp, com.tools20022.repository.msg.RegulatoryReporting6.mmClearingTimestamp,
						com.tools20022.repository.msg.RegulatoryReporting6.mmAdditionalReportingInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeInstructionV04.mmRegulatoryReporting, ForeignExchangeTradeStatusNotificationV06.mmRegulatoryReporting,
						ForeignExchangeTradeInstructionCancellationV04.mmRegulatoryReporting, ForeignExchangeTradeInstructionAmendmentV04.mmRegulatoryReporting, ForeignExchangeTradeStatusAndDetailsNotificationV04.mmRegulatoryReporting);
				trace_lazy = () -> RegulatoryReport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryReporting6";
				definition = "Includes data elements that can be used for reporting to trade repositories, it is not to be used on regular trade confirmations. Although some fields, for example, unique transaction identifier and prior unique transaction identifier, might be used on regular trade confirmations.";
				previousVersion_lazy = () -> RegulatoryReporting4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<TradingSideTransactionReporting1> getTradingSideTransactionReporting() {
		return tradingSideTransactionReporting == null ? tradingSideTransactionReporting = new ArrayList<>() : tradingSideTransactionReporting;
	}

	public RegulatoryReporting6 setTradingSideTransactionReporting(List<TradingSideTransactionReporting1> tradingSideTransactionReporting) {
		this.tradingSideTransactionReporting = Objects.requireNonNull(tradingSideTransactionReporting);
		return this;
	}

	public List<CounterpartySideTransactionReporting1> getCounterpartySideTransactionReporting() {
		return counterpartySideTransactionReporting == null ? counterpartySideTransactionReporting = new ArrayList<>() : counterpartySideTransactionReporting;
	}

	public RegulatoryReporting6 setCounterpartySideTransactionReporting(List<CounterpartySideTransactionReporting1> counterpartySideTransactionReporting) {
		this.counterpartySideTransactionReporting = Objects.requireNonNull(counterpartySideTransactionReporting);
		return this;
	}

	public Optional<PartyIdentification73Choice> getCentralCounterpartyClearingHouse() {
		return centralCounterpartyClearingHouse == null ? Optional.empty() : Optional.of(centralCounterpartyClearingHouse);
	}

	public RegulatoryReporting6 setCentralCounterpartyClearingHouse(PartyIdentification73Choice centralCounterpartyClearingHouse) {
		this.centralCounterpartyClearingHouse = centralCounterpartyClearingHouse;
		return this;
	}

	public Optional<PartyIdentification73Choice> getClearingBroker() {
		return clearingBroker == null ? Optional.empty() : Optional.of(clearingBroker);
	}

	public RegulatoryReporting6 setClearingBroker(PartyIdentification73Choice clearingBroker) {
		this.clearingBroker = clearingBroker;
		return this;
	}

	public Optional<PartyIdentification73Choice> getClearingExceptionParty() {
		return clearingExceptionParty == null ? Optional.empty() : Optional.of(clearingExceptionParty);
	}

	public RegulatoryReporting6 setClearingExceptionParty(PartyIdentification73Choice clearingExceptionParty) {
		this.clearingExceptionParty = clearingExceptionParty;
		return this;
	}

	public Optional<ClearingBrokerIdentification1> getClearingBrokerIdentification() {
		return clearingBrokerIdentification == null ? Optional.empty() : Optional.of(clearingBrokerIdentification);
	}

	public RegulatoryReporting6 setClearingBrokerIdentification(ClearingBrokerIdentification1 clearingBrokerIdentification) {
		this.clearingBrokerIdentification = clearingBrokerIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getClearingThresholdIndicator() {
		return clearingThresholdIndicator == null ? Optional.empty() : Optional.of(clearingThresholdIndicator);
	}

	public RegulatoryReporting6 setClearingThresholdIndicator(YesNoIndicator clearingThresholdIndicator) {
		this.clearingThresholdIndicator = clearingThresholdIndicator;
		return this;
	}

	public Optional<Max35Text> getClearedProductIdentification() {
		return clearedProductIdentification == null ? Optional.empty() : Optional.of(clearedProductIdentification);
	}

	public RegulatoryReporting6 setClearedProductIdentification(Max35Text clearedProductIdentification) {
		this.clearedProductIdentification = clearedProductIdentification;
		return this;
	}

	public Optional<UnderlyingProductIdentifier1Code> getUnderlyingProductIdentifier() {
		return underlyingProductIdentifier == null ? Optional.empty() : Optional.of(underlyingProductIdentifier);
	}

	public RegulatoryReporting6 setUnderlyingProductIdentifier(UnderlyingProductIdentifier1Code underlyingProductIdentifier) {
		this.underlyingProductIdentifier = underlyingProductIdentifier;
		return this;
	}

	public Optional<AllocationIndicator1Code> getAllocationIndicator() {
		return allocationIndicator == null ? Optional.empty() : Optional.of(allocationIndicator);
	}

	public RegulatoryReporting6 setAllocationIndicator(AllocationIndicator1Code allocationIndicator) {
		this.allocationIndicator = allocationIndicator;
		return this;
	}

	public Optional<CollateralisationIndicator1Code> getCollateralisationIndicator() {
		return collateralisationIndicator == null ? Optional.empty() : Optional.of(collateralisationIndicator);
	}

	public RegulatoryReporting6 setCollateralisationIndicator(CollateralisationIndicator1Code collateralisationIndicator) {
		this.collateralisationIndicator = collateralisationIndicator;
		return this;
	}

	public Optional<Max35Text> getExecutionVenue() {
		return executionVenue == null ? Optional.empty() : Optional.of(executionVenue);
	}

	public RegulatoryReporting6 setExecutionVenue(Max35Text executionVenue) {
		this.executionVenue = executionVenue;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getExecutionTimestamp() {
		return executionTimestamp == null ? Optional.empty() : Optional.of(executionTimestamp);
	}

	public RegulatoryReporting6 setExecutionTimestamp(DateAndDateTimeChoice executionTimestamp) {
		this.executionTimestamp = executionTimestamp;
		return this;
	}

	public Optional<YesNoIndicator> getNonStandardFlag() {
		return nonStandardFlag == null ? Optional.empty() : Optional.of(nonStandardFlag);
	}

	public RegulatoryReporting6 setNonStandardFlag(YesNoIndicator nonStandardFlag) {
		this.nonStandardFlag = nonStandardFlag;
		return this;
	}

	public Optional<Exact42Text> getLinkSwapIdentification() {
		return linkSwapIdentification == null ? Optional.empty() : Optional.of(linkSwapIdentification);
	}

	public RegulatoryReporting6 setLinkSwapIdentification(Exact42Text linkSwapIdentification) {
		this.linkSwapIdentification = linkSwapIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getFinancialNatureOfTheCounterpartyIndicator() {
		return financialNatureOfTheCounterpartyIndicator == null ? Optional.empty() : Optional.of(financialNatureOfTheCounterpartyIndicator);
	}

	public RegulatoryReporting6 setFinancialNatureOfTheCounterpartyIndicator(YesNoIndicator financialNatureOfTheCounterpartyIndicator) {
		this.financialNatureOfTheCounterpartyIndicator = financialNatureOfTheCounterpartyIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getCollateralPortfolioIndicator() {
		return collateralPortfolioIndicator == null ? Optional.empty() : Optional.of(collateralPortfolioIndicator);
	}

	public RegulatoryReporting6 setCollateralPortfolioIndicator(YesNoIndicator collateralPortfolioIndicator) {
		this.collateralPortfolioIndicator = collateralPortfolioIndicator;
		return this;
	}

	public Optional<Max10Text> getCollateralPortfolioCode() {
		return collateralPortfolioCode == null ? Optional.empty() : Optional.of(collateralPortfolioCode);
	}

	public RegulatoryReporting6 setCollateralPortfolioCode(Max10Text collateralPortfolioCode) {
		this.collateralPortfolioCode = collateralPortfolioCode;
		return this;
	}

	public Optional<YesNoIndicator> getPortfolioCompressionIndicator() {
		return portfolioCompressionIndicator == null ? Optional.empty() : Optional.of(portfolioCompressionIndicator);
	}

	public RegulatoryReporting6 setPortfolioCompressionIndicator(YesNoIndicator portfolioCompressionIndicator) {
		this.portfolioCompressionIndicator = portfolioCompressionIndicator;
		return this;
	}

	public Optional<CorporateSectorIdentifier1Code> getCorporateSectorIndicator() {
		return corporateSectorIndicator == null ? Optional.empty() : Optional.of(corporateSectorIndicator);
	}

	public RegulatoryReporting6 setCorporateSectorIndicator(CorporateSectorIdentifier1Code corporateSectorIndicator) {
		this.corporateSectorIndicator = corporateSectorIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getTradeWithNonEEACounterpartyIndicator() {
		return tradeWithNonEEACounterpartyIndicator == null ? Optional.empty() : Optional.of(tradeWithNonEEACounterpartyIndicator);
	}

	public RegulatoryReporting6 setTradeWithNonEEACounterpartyIndicator(YesNoIndicator tradeWithNonEEACounterpartyIndicator) {
		this.tradeWithNonEEACounterpartyIndicator = tradeWithNonEEACounterpartyIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getIntragroupTradeIndicator() {
		return intragroupTradeIndicator == null ? Optional.empty() : Optional.of(intragroupTradeIndicator);
	}

	public RegulatoryReporting6 setIntragroupTradeIndicator(YesNoIndicator intragroupTradeIndicator) {
		this.intragroupTradeIndicator = intragroupTradeIndicator;
		return this;
	}

	public Optional<YesNoIndicator> getCommercialOrTreasuryFinancingIndicator() {
		return commercialOrTreasuryFinancingIndicator == null ? Optional.empty() : Optional.of(commercialOrTreasuryFinancingIndicator);
	}

	public RegulatoryReporting6 setCommercialOrTreasuryFinancingIndicator(YesNoIndicator commercialOrTreasuryFinancingIndicator) {
		this.commercialOrTreasuryFinancingIndicator = commercialOrTreasuryFinancingIndicator;
		return this;
	}

	public Optional<SecurityIdentification19> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? Optional.empty() : Optional.of(financialInstrumentIdentification);
	}

	public RegulatoryReporting6 setFinancialInstrumentIdentification(SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
		return this;
	}

	public Optional<ISODateTime> getConfirmationDateAndTimestamp() {
		return confirmationDateAndTimestamp == null ? Optional.empty() : Optional.of(confirmationDateAndTimestamp);
	}

	public RegulatoryReporting6 setConfirmationDateAndTimestamp(ISODateTime confirmationDateAndTimestamp) {
		this.confirmationDateAndTimestamp = confirmationDateAndTimestamp;
		return this;
	}

	public Optional<ISOTime> getClearingTimestamp() {
		return clearingTimestamp == null ? Optional.empty() : Optional.of(clearingTimestamp);
	}

	public RegulatoryReporting6 setClearingTimestamp(ISOTime clearingTimestamp) {
		this.clearingTimestamp = clearingTimestamp;
		return this;
	}

	public Optional<Max210Text> getAdditionalReportingInformation() {
		return additionalReportingInformation == null ? Optional.empty() : Optional.of(additionalReportingInformation);
	}

	public RegulatoryReporting6 setAdditionalReportingInformation(Max210Text additionalReportingInformation) {
		this.additionalReportingInformation = additionalReportingInformation;
		return this;
	}
}