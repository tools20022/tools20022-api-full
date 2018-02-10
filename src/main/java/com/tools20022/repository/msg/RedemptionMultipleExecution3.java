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
import com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01;
import com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03;
import com.tools20022.repository.choice.PlaceOfTradeIdentification1Choice;
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
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#CancellationRightOrExtendedCancellationRightRule
 * RedemptionMultipleExecution3.CancellationRightOrExtendedCancellationRightRule
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmMasterReference
 * RedemptionMultipleExecution3.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmBeneficiaryDetails
 * RedemptionMultipleExecution3.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmPlaceOfTrade
 * RedemptionMultipleExecution3.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmOrderDateTime
 * RedemptionMultipleExecution3.mmOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmRequestedFutureTradeDate
 * RedemptionMultipleExecution3.mmRequestedFutureTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmCancellationRight
 * RedemptionMultipleExecution3.mmCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmExtendedCancellationRight
 * RedemptionMultipleExecution3.mmExtendedCancellationRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmInvestmentAccountDetails
 * RedemptionMultipleExecution3.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmIndividualExecutionDetails
 * RedemptionMultipleExecution3.mmIndividualExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmTotalSettlementAmount
 * RedemptionMultipleExecution3.mmTotalSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmCashSettlementDate
 * RedemptionMultipleExecution3.mmCashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmBulkCashSettlementDetails
 * RedemptionMultipleExecution3.mmBulkCashSettlementDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationAmendmentV01#mmMultipleExecutionDetails
 * RedemptionOrderConfirmationAmendmentV01.mmMultipleExecutionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV03#mmMultipleExecutionDetails
 * RedemptionOrderConfirmationV03.mmMultipleExecutionDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails2Rule#forRedemptionMultipleExecution3
 * ConstraintBulkCashSettlementDetails2Rule.forRedemptionMultipleExecution3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementCurrency4Rule#forRedemptionMultipleExecution3
 * ConstraintSettlementCurrency4Rule.forRedemptionMultipleExecution3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCashSettlementDateRule#forRedemptionMultipleExecution3
 * ConstraintCashSettlementDateRule.forRedemptionMultipleExecution3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule#forRedemptionMultipleExecution3
 * ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleExecution3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RedemptionMultipleExecution3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Execution of a redemption order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5
 * RedemptionMultipleExecution5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RedemptionMultipleExecution3", propOrder = {"masterReference", "beneficiaryDetails", "placeOfTrade", "orderDateTime", "requestedFutureTradeDate", "cancellationRight", "extendedCancellationRight",
		"investmentAccountDetails", "individualExecutionDetails", "totalSettlementAmount", "cashSettlementDate", "bulkCashSettlementDetails"})
public class RedemptionMultipleExecution3 {

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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmMasterReference
	 * RedemptionMultipleExecution5.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionMultipleExecution5.mmMasterReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "BnfcryDtls")
	protected IndividualPerson12 beneficiaryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson12
	 * IndividualPerson12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the investor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmBeneficiaryDetails
	 * RedemptionMultipleExecution5.mmBeneficiaryDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficiaryDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
			isDerived = false;
			xmlTag = "BnfcryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryDetails";
			definition = "Additional information about the investor.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionMultipleExecution5.mmBeneficiaryDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IndividualPerson12.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradingMarket TradingMarket}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmPlaceOfTrade
	 * RedemptionMultipleExecution5.mmPlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPlaceOfTrade = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> TradingMarket.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
			isDerived = false;
			xmlTag = "PlcOfTrad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Market in which the advised trade transaction was executed.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionMultipleExecution5.mmPlaceOfTrade);
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmOrderDateTime
	 * RedemptionMultipleExecution5.mmOrderDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
			isDerived = false;
			xmlTag = "OrdrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDateTime";
			definition = "Date and time at which the order was placed by the investor.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionMultipleExecution5.mmOrderDateTime);
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmRequestedFutureTradeDate
	 * RedemptionMultipleExecution5.mmRequestedFutureTradeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedFutureTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmRequestedExecutionDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
			isDerived = false;
			xmlTag = "ReqdFutrTradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedFutureTradeDate";
			definition = "Future date at which the investor requests the order to be executed.\nThe specification of a requested future trade date is not allowed in some markets. The date must be a date in the future.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionMultipleExecution5.mmRequestedFutureTradeDate);
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
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
	@XmlElement(name = "InvstmtAcctDtls", required = true)
	protected InvestmentAccount21 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount21
	 * InvestmentAccount21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account impacted by an investment fund order."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmInvestmentAccountDetails
	 * RedemptionMultipleExecution5.mmInvestmentAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account impacted by an investment fund order.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionMultipleExecution5.mmInvestmentAccountDetails);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccount21.mmObject();
		}
	};
	@XmlElement(name = "IndvExctnDtls", required = true)
	protected List<com.tools20022.repository.msg.RedemptionExecution6> individualExecutionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RedemptionExecution6
	 * RedemptionExecution6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionExecution
	 * RedemptionExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmIndividualExecutionDetails
	 * RedemptionMultipleExecution5.mmIndividualExecutionDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndividualExecutionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RedemptionExecution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
			isDerived = false;
			xmlTag = "IndvExctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualExecutionDetails";
			definition = "Execution of a redemption order.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionMultipleExecution5.mmIndividualExecutionDetails);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RedemptionExecution6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmTotalSettlementAmount
	 * RedemptionMultipleExecution5.mmTotalSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
			isDerived = false;
			xmlTag = "TtlSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalSettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the multiple order.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionMultipleExecution5.mmTotalSettlementAmount);
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
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
	 * "Payment transaction resulting from the investment fund order execution."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution5#mmBulkCashSettlementDetails
	 * RedemptionMultipleExecution5.mmBulkCashSettlementDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBulkCashSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> BulkPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
			isDerived = false;
			xmlTag = "BlkCshSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BulkCashSettlementDetails";
			definition = "Payment transaction resulting from the investment fund order execution.";
			nextVersions_lazy = () -> Arrays.asList(RedemptionMultipleExecution5.mmBulkCashSettlementDetails);
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
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3
	 * RedemptionMultipleExecution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmCancellationRight
	 * RedemptionMultipleExecution3.mmCancellationRight}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionMultipleExecution3#mmExtendedCancellationRight
	 * RedemptionMultipleExecution3.mmExtendedCancellationRight}</li>
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
			messageComponent_lazy = () -> com.tools20022.repository.msg.RedemptionMultipleExecution3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionMultipleExecution3.mmCancellationRight, com.tools20022.repository.msg.RedemptionMultipleExecution3.mmExtendedCancellationRight);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionMultipleExecution3.mmMasterReference, com.tools20022.repository.msg.RedemptionMultipleExecution3.mmBeneficiaryDetails,
						com.tools20022.repository.msg.RedemptionMultipleExecution3.mmPlaceOfTrade, com.tools20022.repository.msg.RedemptionMultipleExecution3.mmOrderDateTime,
						com.tools20022.repository.msg.RedemptionMultipleExecution3.mmRequestedFutureTradeDate, com.tools20022.repository.msg.RedemptionMultipleExecution3.mmCancellationRight,
						com.tools20022.repository.msg.RedemptionMultipleExecution3.mmExtendedCancellationRight, com.tools20022.repository.msg.RedemptionMultipleExecution3.mmInvestmentAccountDetails,
						com.tools20022.repository.msg.RedemptionMultipleExecution3.mmIndividualExecutionDetails, com.tools20022.repository.msg.RedemptionMultipleExecution3.mmTotalSettlementAmount,
						com.tools20022.repository.msg.RedemptionMultipleExecution3.mmCashSettlementDate, com.tools20022.repository.msg.RedemptionMultipleExecution3.mmBulkCashSettlementDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(RedemptionOrderConfirmationAmendmentV01.mmMultipleExecutionDetails, RedemptionOrderConfirmationV03.mmMultipleExecutionDetails);
				trace_lazy = () -> RedemptionExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBulkCashSettlementDetails2Rule.forRedemptionMultipleExecution3,
						com.tools20022.repository.constraints.ConstraintSettlementCurrency4Rule.forRedemptionMultipleExecution3, com.tools20022.repository.constraints.ConstraintCashSettlementDateRule.forRedemptionMultipleExecution3,
						com.tools20022.repository.constraints.ConstraintOrderOriginatorEligibility3Rule.forRedemptionMultipleExecution3);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "RedemptionMultipleExecution3";
				definition = "Execution of a redemption order.";
				nextVersions_lazy = () -> Arrays.asList(RedemptionMultipleExecution5.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RedemptionMultipleExecution3.CancellationRightOrExtendedCancellationRightRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public RedemptionMultipleExecution3 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Optional<IndividualPerson12> getBeneficiaryDetails() {
		return beneficiaryDetails == null ? Optional.empty() : Optional.of(beneficiaryDetails);
	}

	public RedemptionMultipleExecution3 setBeneficiaryDetails(com.tools20022.repository.msg.IndividualPerson12 beneficiaryDetails) {
		this.beneficiaryDetails = beneficiaryDetails;
		return this;
	}

	public Optional<PlaceOfTradeIdentification1Choice> getPlaceOfTrade() {
		return placeOfTrade == null ? Optional.empty() : Optional.of(placeOfTrade);
	}

	public RedemptionMultipleExecution3 setPlaceOfTrade(PlaceOfTradeIdentification1Choice placeOfTrade) {
		this.placeOfTrade = placeOfTrade;
		return this;
	}

	public Optional<ISODateTime> getOrderDateTime() {
		return orderDateTime == null ? Optional.empty() : Optional.of(orderDateTime);
	}

	public RedemptionMultipleExecution3 setOrderDateTime(ISODateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
		return this;
	}

	public Optional<ISODate> getRequestedFutureTradeDate() {
		return requestedFutureTradeDate == null ? Optional.empty() : Optional.of(requestedFutureTradeDate);
	}

	public RedemptionMultipleExecution3 setRequestedFutureTradeDate(ISODate requestedFutureTradeDate) {
		this.requestedFutureTradeDate = requestedFutureTradeDate;
		return this;
	}

	public Optional<CancellationRight1Code> getCancellationRight() {
		return cancellationRight == null ? Optional.empty() : Optional.of(cancellationRight);
	}

	public RedemptionMultipleExecution3 setCancellationRight(CancellationRight1Code cancellationRight) {
		this.cancellationRight = cancellationRight;
		return this;
	}

	public Optional<Extended350Code> getExtendedCancellationRight() {
		return extendedCancellationRight == null ? Optional.empty() : Optional.of(extendedCancellationRight);
	}

	public RedemptionMultipleExecution3 setExtendedCancellationRight(Extended350Code extendedCancellationRight) {
		this.extendedCancellationRight = extendedCancellationRight;
		return this;
	}

	public InvestmentAccount21 getInvestmentAccountDetails() {
		return investmentAccountDetails;
	}

	public RedemptionMultipleExecution3 setInvestmentAccountDetails(com.tools20022.repository.msg.InvestmentAccount21 investmentAccountDetails) {
		this.investmentAccountDetails = Objects.requireNonNull(investmentAccountDetails);
		return this;
	}

	public List<RedemptionExecution6> getIndividualExecutionDetails() {
		return individualExecutionDetails == null ? individualExecutionDetails = new ArrayList<>() : individualExecutionDetails;
	}

	public RedemptionMultipleExecution3 setIndividualExecutionDetails(List<com.tools20022.repository.msg.RedemptionExecution6> individualExecutionDetails) {
		this.individualExecutionDetails = Objects.requireNonNull(individualExecutionDetails);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getTotalSettlementAmount() {
		return totalSettlementAmount == null ? Optional.empty() : Optional.of(totalSettlementAmount);
	}

	public RedemptionMultipleExecution3 setTotalSettlementAmount(ActiveCurrencyAndAmount totalSettlementAmount) {
		this.totalSettlementAmount = totalSettlementAmount;
		return this;
	}

	public Optional<ISODate> getCashSettlementDate() {
		return cashSettlementDate == null ? Optional.empty() : Optional.of(cashSettlementDate);
	}

	public RedemptionMultipleExecution3 setCashSettlementDate(ISODate cashSettlementDate) {
		this.cashSettlementDate = cashSettlementDate;
		return this;
	}

	public Optional<PaymentTransaction22> getBulkCashSettlementDetails() {
		return bulkCashSettlementDetails == null ? Optional.empty() : Optional.of(bulkCashSettlementDetails);
	}

	public RedemptionMultipleExecution3 setBulkCashSettlementDetails(com.tools20022.repository.msg.PaymentTransaction22 bulkCashSettlementDetails) {
		this.bulkCashSettlementDetails = bulkCashSettlementDetails;
		return this;
	}
}