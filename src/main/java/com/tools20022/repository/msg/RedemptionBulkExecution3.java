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
import com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01;
import com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03;
import com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.CancellationRight1Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Execution of a redemption order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#CancellationRightOrExtendedCancellationRightRule
 * RedemptionBulkExecution3.CancellationRightOrExtendedCancellationRightRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmMasterReference
 * RedemptionBulkExecution3.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmPlaceOfTrade
 * RedemptionBulkExecution3.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmOrderDateTime
 * RedemptionBulkExecution3.mmOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmRequestedFutureTradeDate
 * RedemptionBulkExecution3.mmRequestedFutureTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmCancellationRight
 * RedemptionBulkExecution3.mmCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmExtendedCancellationRight
 * RedemptionBulkExecution3.mmExtendedCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmFinancialInstrumentDetails
 * RedemptionBulkExecution3.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmIndividualExecutionDetails
 * RedemptionBulkExecution3.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmRequestedSettlementCurrency
 * RedemptionBulkExecution3.mmRequestedSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmRequestedNAVCurrency
 * RedemptionBulkExecution3.mmRequestedNAVCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmTotalSettlementAmount
 * RedemptionBulkExecution3.mmTotalSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmCashSettlementDate
 * RedemptionBulkExecution3.mmCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmBulkCashSettlementDetails
 * RedemptionBulkExecution3.mmBulkCashSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RedemptionExecution
 * RedemptionExecution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationAmendmentV01#mmBulkExecutionDetails
 * RedemptionBulkOrderConfirmationAmendmentV01.mmBulkExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV03#mmBulkExecutionDetails
 * RedemptionBulkOrderConfirmationV03.mmBulkExecutionDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrency1Rule#forRedemptionBulkExecution3
 * ConstraintSettlementCurrency1Rule.forRedemptionBulkExecution3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails6Rule#forRedemptionBulkExecution3
 * ConstraintBulkCashSettlementDetails6Rule.forRedemptionBulkExecution3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCashSettlementDateRule#forRedemptionBulkExecution3
 * ConstraintCashSettlementDateRule.forRedemptionBulkExecution3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule#forRedemptionBulkExecution3
 * ConstraintRequestedSettlementCurrencyRule.forRedemptionBulkExecution3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionBulkExecution3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a redemption order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5
 * RedemptionBulkExecution5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RedemptionBulkExecution3", propOrder = {"masterReference", "placeOfTrade", "orderDateTime", "requestedFutureTradeDate", "cancellationRight", "extendedCancellationRight", "financialInstrumentDetails",
		"individualExecutionDetails", "requestedSettlementCurrency", "requestedNAVCurrency", "totalSettlementAmount", "cashSettlementDate", "bulkCashSettlementDetails"})
public class RedemptionBulkExecution3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
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
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmMasterReference
	 * RedemptionBulkExecution5.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkExecution5.mmMasterReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PlcOfTrad")
	protected PlaceOfTradeIdentification1Choice placeOfTrade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice
	 * PlaceOfTradeIdentification1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcOfTrad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market in which the advised trade transaction was executed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmPlaceOfTrade
	 * RedemptionBulkExecution5.mmPlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfTrade = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which the advised trade transaction was executed.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkExecution5.mmPlaceOfTrade);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PlaceOfTradeIdentification1Choice.mmObject();
		}
	};
	@XmlElement(name = "OrdrDtTm")
	protected ISODateTime orderDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderDateTime
	 * InvestmentFundOrder.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the order was placed by the investor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmOrderDateTime
	 * RedemptionBulkExecution5.mmOrderDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			isDerived = false;
			xmlTag = "OrdrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDateTime";
			definition = "Date and time at which the order was placed by the investor.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkExecution5.mmOrderDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "ReqdFutrTradDt")
	protected ISODate requestedFutureTradeDate;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedExecutionDateTime
	 * InvestmentFundOrder.mmRequestedExecutionDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdFutrTradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedFutureTradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Future date at which the investor requests the order to be executed.\nThe specification of a requested future trade date is not allowed in some markets. The date must be a date in the future."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmRequestedFutureTradeDate
	 * RedemptionBulkExecution5.mmRequestedFutureTradeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedFutureTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedExecutionDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			isDerived = false;
			xmlTag = "ReqdFutrTradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedFutureTradeDate";
			definition = "Future date at which the investor requests the order to be executed.\nThe specification of a requested future trade date is not allowed in some markets. The date must be a date in the future.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkExecution5.mmRequestedFutureTradeDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "CxlRght")
	protected CancellationRight1Code cancellationRight;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationRight1Code
	 * CancellationRight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmCancellationRight
	 * InvestmentFundOrder.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation right of an investor with respect to an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationRight = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmCancellationRight;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			isDerived = false;
			xmlTag = "CxlRght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRight";
			definition = "Cancellation right of an investor with respect to an investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CancellationRight1Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedCxlRght")
	protected Extended350Code extendedCancellationRight;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmCancellationRight
	 * InvestmentFundOrder.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedCxlRght"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedCancellationRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation right of an investor with respect to an investment fund order."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedCancellationRight = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmCancellationRight;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			isDerived = false;
			xmlTag = "XtndedCxlRght";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedCancellationRight";
			definition = "Cancellation right of an investor with respect to an investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument10 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument10
	 * FinancialInstrument10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
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
	 * "Investment fund class to which an investment fund order execution is related."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmFinancialInstrumentDetails
	 * RedemptionBulkExecution5.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Investment fund class to which an investment fund order execution is related.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkExecution5.mmFinancialInstrumentDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument10.mmObject();
		}
	};
	@XmlElement(name = "IndvExctnDtls", required = true)
	protected List<com.tools20022.repository.msg.RedemptionExecution5> individualExecutionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RedemptionExecution5
	 * RedemptionExecution5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
	 * RedemptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvExctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualExecutionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Execution of a redemption order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmIndividualExecutionDetails
	 * RedemptionBulkExecution5.mmIndividualExecutionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndividualExecutionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RedemptionExecution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			isDerived = false;
			xmlTag = "IndvExctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualExecutionDetails";
			definition = "Execution of a redemption order.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkExecution5.mmIndividualExecutionDetails);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RedemptionExecution5.mmObject();
		}
	};
	@XmlElement(name = "ReqdSttlmCcy")
	protected ActiveCurrencyCode requestedSettlementCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmRequestedSettlementCurrency
	 * InvestmentFundOrder.mmRequestedSettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency requested for settlement of cash proceeds."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmRequestedSettlementCurrency
	 * RedemptionBulkExecution5.mmRequestedSettlementCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedSettlementCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedSettlementCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementCurrency";
			definition = "Currency requested for settlement of cash proceeds.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkExecution5.mmRequestedSettlementCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "ReqdNAVCcy")
	protected ActiveOrHistoricCurrencyCode requestedNAVCurrency;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmRequestedNAVCurrency
	 * InvestmentFundClass.mmRequestedNAVCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdNAVCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedNAVCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmRequestedNAVCurrency
	 * RedemptionBulkExecution5.mmRequestedNAVCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedNAVCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmRequestedNAVCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			isDerived = false;
			xmlTag = "ReqdNAVCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedNAVCurrency";
			definition = "Currency to be used for pricing the fund. This currency must be among the set of currencies in which the price may be expressed, as stated in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkExecution5.mmRequestedNAVCurrency);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "TtlSttlmAmt")
	protected ActiveCurrencyAndAmount totalSettlementAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlSttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money paid /to be paid or received in exchange for the financial instrument in the multiple order."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmTotalSettlementAmount
	 * RedemptionBulkExecution5.mmTotalSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			isDerived = false;
			xmlTag = "TtlSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalSettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the multiple order.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkExecution5.mmTotalSettlementAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "CshSttlmDt")
	protected ISODate cashSettlementDate;
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which cash is available."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDate";
			definition = "Date on which cash is available.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "BlkCshSttlmDtls")
	protected PaymentTransaction22 bulkCashSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction22
	 * PaymentTransaction22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BulkPayment BulkPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlkCshSttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BulkCashSettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment processes required to transfer cash from the debtor to the creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution5#mmBulkCashSettlementDetails
	 * RedemptionBulkExecution5.mmBulkCashSettlementDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBulkCashSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> BulkPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			isDerived = false;
			xmlTag = "BlkCshSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionBulkExecution5.mmBulkCashSettlementDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTransaction22.mmObject();
		}
	};
	/**
	 * Either CancellationRight or ExtendedCancellationRight may be present but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3
	 * RedemptionBulkExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmCancellationRight
	 * RedemptionBulkExecution3.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionBulkExecution3#mmExtendedCancellationRight
	 * RedemptionBulkExecution3.mmExtendedCancellationRight}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRightOrExtendedCancellationRightRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CancellationRight or ExtendedCancellationRight may be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor CancellationRightOrExtendedCancellationRightRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRightOrExtendedCancellationRightRule";
			definition = "Either CancellationRight or ExtendedCancellationRight may be present but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.RedemptionBulkExecution3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionBulkExecution3.mmCancellationRight, com.tools20022.repository.msg.RedemptionBulkExecution3.mmExtendedCancellationRight);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionBulkExecution3.mmMasterReference, com.tools20022.repository.msg.RedemptionBulkExecution3.mmPlaceOfTrade,
						com.tools20022.repository.msg.RedemptionBulkExecution3.mmOrderDateTime, com.tools20022.repository.msg.RedemptionBulkExecution3.mmRequestedFutureTradeDate,
						com.tools20022.repository.msg.RedemptionBulkExecution3.mmCancellationRight, com.tools20022.repository.msg.RedemptionBulkExecution3.mmExtendedCancellationRight,
						com.tools20022.repository.msg.RedemptionBulkExecution3.mmFinancialInstrumentDetails, com.tools20022.repository.msg.RedemptionBulkExecution3.mmIndividualExecutionDetails,
						com.tools20022.repository.msg.RedemptionBulkExecution3.mmRequestedSettlementCurrency, com.tools20022.repository.msg.RedemptionBulkExecution3.mmRequestedNAVCurrency,
						com.tools20022.repository.msg.RedemptionBulkExecution3.mmTotalSettlementAmount, com.tools20022.repository.msg.RedemptionBulkExecution3.mmCashSettlementDate,
						com.tools20022.repository.msg.RedemptionBulkExecution3.mmBulkCashSettlementDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(RedemptionBulkOrderConfirmationAmendmentV01.mmBulkExecutionDetails, RedemptionBulkOrderConfirmationV03.mmBulkExecutionDetails);
				trace_lazy = () -> RedemptionExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementCurrency1Rule.forRedemptionBulkExecution3,
						com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails6Rule.forRedemptionBulkExecution3, com.tools20022.repository.constraints.ConstraintCashSettlementDateRule.forRedemptionBulkExecution3,
						com.tools20022.repository.constraints.ConstraintRequestedSettlementCurrencyRule.forRedemptionBulkExecution3);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "RedemptionBulkExecution3";
				definition = "Execution of a redemption order.";
				nextVersions_lazy = () -> Arrays.asList(RedemptionBulkExecution5.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionBulkExecution3.CancellationRightOrExtendedCancellationRightRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public RedemptionBulkExecution3 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Optional<PlaceOfTradeIdentification1Choice> getPlaceOfTrade() {
		return placeOfTrade == null ? Optional.empty() : Optional.of(placeOfTrade);
	}

	public RedemptionBulkExecution3 setPlaceOfTrade(PlaceOfTradeIdentification1Choice placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
		return this;
	}

	public Optional<ISODateTime> getOrderDateTime() {
		return orderDateTime == null ? Optional.empty() : Optional.of(orderDateTime);
	}

	public RedemptionBulkExecution3 setOrderDateTime(ISODateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
		return this;
	}

	public Optional<ISODate> getRequestedFutureTradeDate() {
		return requestedFutureTradeDate == null ? Optional.empty() : Optional.of(requestedFutureTradeDate);
	}

	public RedemptionBulkExecution3 setRequestedFutureTradeDate(ISODate requestedFutureTradeDate) {
		this.requestedFutureTradeDate = requestedFutureTradeDate;
		return this;
	}

	public Optional<CancellationRight1Code> getCancellationRight() {
		return cancellationRight == null ? Optional.empty() : Optional.of(cancellationRight);
	}

	public RedemptionBulkExecution3 setCancellationRight(CancellationRight1Code cancellationRight) {
		this.cancellationRight = cancellationRight;
		return this;
	}

	public Optional<Extended350Code> getExtendedCancellationRight() {
		return extendedCancellationRight == null ? Optional.empty() : Optional.of(extendedCancellationRight);
	}

	public RedemptionBulkExecution3 setExtendedCancellationRight(Extended350Code extendedCancellationRight) {
		this.extendedCancellationRight = extendedCancellationRight;
		return this;
	}

	public FinancialInstrument10 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public RedemptionBulkExecution3 setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument10 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public List<RedemptionExecution5> getIndividualExecutionDetails() {
		return individualExecutionDetails == null ? individualExecutionDetails = new ArrayList<>() : individualExecutionDetails;
	}

	public RedemptionBulkExecution3 setIndividualExecutionDetails(List<com.tools20022.repository.msg.RedemptionExecution5> individualExecutionDetails) {
		this.individualExecutionDetails = Objects.requireNonNull(individualExecutionDetails);
		return this;
	}

	public Optional<ActiveCurrencyCode> getRequestedSettlementCurrency() {
		return requestedSettlementCurrency == null ? Optional.empty() : Optional.of(requestedSettlementCurrency);
	}

	public RedemptionBulkExecution3 setRequestedSettlementCurrency(ActiveCurrencyCode requestedSettlementCurrency) {
		this.requestedSettlementCurrency = requestedSettlementCurrency;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getRequestedNAVCurrency() {
		return requestedNAVCurrency == null ? Optional.empty() : Optional.of(requestedNAVCurrency);
	}

	public RedemptionBulkExecution3 setRequestedNAVCurrency(ActiveOrHistoricCurrencyCode requestedNAVCurrency) {
		this.requestedNAVCurrency = requestedNAVCurrency;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalSettlementAmount() {
		return totalSettlementAmount == null ? Optional.empty() : Optional.of(totalSettlementAmount);
	}

	public RedemptionBulkExecution3 setTotalSettlementAmount(ActiveCurrencyAndAmount totalSettlementAmount) {
		this.totalSettlementAmount = totalSettlementAmount;
		return this;
	}

	public Optional<ISODate> getCashSettlementDate() {
		return cashSettlementDate == null ? Optional.empty() : Optional.of(cashSettlementDate);
	}

	public RedemptionBulkExecution3 setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = cashSettlementDate;
		return this;
	}

	public Optional<PaymentTransaction22> getBulkCashSettlementDetails() {
		return bulkCashSettlementDetails == null ? Optional.empty() : Optional.of(bulkCashSettlementDetails);
	}

	public RedemptionBulkExecution3 setBulkCashSettlementDetails(com.tools20022.repository.msg.PaymentTransaction22 bulkCashSettlementDetails) {
		this.bulkCashSettlementDetails = bulkCashSettlementDetails;
		return this;
	}
}