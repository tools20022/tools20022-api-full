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
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV05;
import com.tools20022.repository.choice.CorporateActionEventType29Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the intra-position movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmSettledQuantity
 * IntraPositionDetails34.mmSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmSecuritiesSubBalanceIdentification
 * IntraPositionDetails34.mmSecuritiesSubBalanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmCollateralMonitorAmount
 * IntraPositionDetails34.mmCollateralMonitorAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmPreviouslySettledQuantity
 * IntraPositionDetails34.mmPreviouslySettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmRemainingToBeSettledQuantity
 * IntraPositionDetails34.mmRemainingToBeSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmSettlementDate
 * IntraPositionDetails34.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmAvailableDate
 * IntraPositionDetails34.mmAvailableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmCorporateActionEventType
 * IntraPositionDetails34.mmCorporateActionEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmBalanceFrom
 * IntraPositionDetails34.mmBalanceFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmBalanceTo
 * IntraPositionDetails34.mmBalanceTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34#mmInstructionProcessingAdditionalDetails
 * IntraPositionDetails34.mmInstructionProcessingAdditionalDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV05#mmIntraPositionDetails
 * IntraPositionMovementConfirmationV05.mmIntraPositionDetails}</li>
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
 * "IntraPositionDetails34"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the intra-position movement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionDetails41
 * IntraPositionDetails41}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27
 * IntraPositionDetails27}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IntraPositionDetails34", propOrder = {"settledQuantity", "securitiesSubBalanceIdentification", "collateralMonitorAmount", "previouslySettledQuantity", "remainingToBeSettledQuantity", "settlementDate", "availableDate",
		"corporateActionEventType", "balanceFrom", "balanceTo", "instructionProcessingAdditionalDetails"})
public class IntraPositionDetails34 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected FinancialInstrumentQuantity1Choice settledQuantity;
	/**
	 * Quantity of financial instrument effectively settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34
	 * IntraPositionDetails34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument effectively settled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmSettledQuantity
	 * IntraPositionDetails41.mmSettledQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmSettledQuantity
	 * IntraPositionDetails27.mmSettledQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettledQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> IntraPositionDetails34.mmObject();
			isDerived = false;
			xmlTag = "SttldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledQuantity";
			definition = "Quantity of financial instrument effectively settled.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails41.mmSettledQuantity);
			previousVersion_lazy = () -> IntraPositionDetails27.mmSettledQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected GenericIdentification37 securitiesSubBalanceIdentification;
	/**
	 * Number identifying a Securities Sub balance Type (example restriction
	 * identification etc…).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification37
	 * GenericIdentification37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34
	 * IntraPositionDetails34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSubBalId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSubBalanceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number identifying a Securities Sub balance Type (example restriction identification etc…)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmSecuritiesSubBalanceIdentification
	 * IntraPositionDetails41.mmSecuritiesSubBalanceIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmSecuritiesSubBalanceIdentification
	 * IntraPositionDetails27.mmSecuritiesSubBalanceIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesSubBalanceIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IntraPositionDetails34.mmObject();
			isDerived = false;
			xmlTag = "SctiesSubBalId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSubBalanceIdentification";
			definition = "Number identifying a Securities Sub balance Type (example restriction identification etc…).";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails41.mmSecuritiesSubBalanceIdentification);
			previousVersion_lazy = () -> IntraPositionDetails27.mmSecuritiesSubBalanceIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification37.mmObject();
		}
	};
	protected AmountAndDirection44 collateralMonitorAmount;
	/**
	 * Value of the collateral available for the delivery settlement process at
	 * the account level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection44
	 * AmountAndDirection44}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntraPositionTransfer#mmCollateralAmount
	 * IntraPositionTransfer.mmCollateralAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34
	 * IntraPositionDetails34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollMntrAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralMonitorAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of the collateral available for the delivery settlement process at the account level."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmCollateralMonitorAmount
	 * IntraPositionDetails41.mmCollateralMonitorAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmCollateralMonitorAmount
	 * IntraPositionDetails27.mmCollateralMonitorAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateralMonitorAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> IntraPositionTransfer.mmCollateralAmount;
			componentContext_lazy = () -> IntraPositionDetails34.mmObject();
			isDerived = false;
			xmlTag = "CollMntrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralMonitorAmount";
			definition = "Value of the collateral available for the delivery settlement process at the account level.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails41.mmCollateralMonitorAmount);
			previousVersion_lazy = () -> IntraPositionDetails27.mmCollateralMonitorAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice previouslySettledQuantity;
	/**
	 * Quantity of financial instrument previously settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34
	 * IntraPositionDetails34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrevslySttldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslySettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument previously settled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmPreviouslySettledQuantity
	 * IntraPositionDetails41.mmPreviouslySettledQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmPreviouslySettledQuantity
	 * IntraPositionDetails27.mmPreviouslySettledQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviouslySettledQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> IntraPositionDetails34.mmObject();
			isDerived = false;
			xmlTag = "PrevslySttldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslySettledQuantity";
			definition = "Quantity of financial instrument previously settled.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails41.mmPreviouslySettledQuantity);
			previousVersion_lazy = () -> IntraPositionDetails27.mmPreviouslySettledQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected FinancialInstrumentQuantity1Choice remainingToBeSettledQuantity;
	/**
	 * Quantity of financial instrument remaining to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34
	 * IntraPositionDetails34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngToBeSttldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingToBeSettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument remaining to be settled."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails41.mmRemainingToBeSettledQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails27.mmRemainingToBeSettledQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemainingToBeSettledQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> IntraPositionDetails34.mmObject();
			isDerived = false;
			xmlTag = "RmngToBeSttldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingToBeSettledQuantity";
			definition = "Quantity of financial instrument remaining to be settled.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails41.mmRemainingToBeSettledQuantity);
			previousVersion_lazy = () -> IntraPositionDetails27.mmRemainingToBeSettledQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	protected DateAndDateTimeChoice settlementDate;
	/**
	 * Date and time at which the securities were moved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34
	 * IntraPositionDetails34}</li>
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
	 * definition} = "Date and time at which the securities were moved."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmSettlementDate
	 * IntraPositionDetails41.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmSettlementDate
	 * IntraPositionDetails27.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> IntraPositionDetails34.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities were moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails41.mmSettlementDate);
			previousVersion_lazy = () -> IntraPositionDetails27.mmSettlementDate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected DateAndDateTimeChoice availableDate;
	/**
	 * Date/time securities become available for sale (if securities become
	 * unavailable, this specifies the date/time at which they will become
	 * available again).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmAvailableDate
	 * Security.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34
	 * IntraPositionDetails34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvailableDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time securities become available for sale (if securities become unavailable, this specifies the date/time at which they will become available again)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmAvailableDate
	 * IntraPositionDetails41.mmAvailableDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmAvailableDate
	 * IntraPositionDetails27.mmAvailableDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAvailableDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmAvailableDate;
			componentContext_lazy = () -> IntraPositionDetails34.mmObject();
			isDerived = false;
			xmlTag = "AvlblDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDate";
			definition = "Date/time securities become available for sale (if securities become unavailable, this specifies the date/time at which they will become available again).";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails41.mmAvailableDate);
			previousVersion_lazy = () -> IntraPositionDetails27.mmAvailableDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	protected CorporateActionEventType29Choice corporateActionEventType;
	/**
	 * Specifies the type of corporate event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType29Choice
	 * CorporateActionEventType29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
	 * Security.mmCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34
	 * IntraPositionDetails34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of corporate event."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmCorporateActionEventType
	 * IntraPositionDetails41.mmCorporateActionEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmCorporateActionEventType
	 * IntraPositionDetails27.mmCorporateActionEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCorporateActionEventType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmCorporateEvent;
			componentContext_lazy = () -> IntraPositionDetails34.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventType";
			definition = "Specifies the type of corporate event.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails41.mmCorporateActionEventType);
			previousVersion_lazy = () -> IntraPositionDetails27.mmCorporateActionEventType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionEventType29Choice.mmObject();
		}
	};
	protected SecuritiesSubBalanceTypeAndQuantityBreakdown3 balanceFrom;
	/**
	 * Balance from which the securities are moving.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34
	 * IntraPositionDetails34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance from which the securities are moving."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmBalanceFrom
	 * IntraPositionDetails41.mmBalanceFrom}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmBalanceFrom
	 * IntraPositionDetails27.mmBalanceFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalanceFrom = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> IntraPositionDetails34.mmObject();
			isDerived = false;
			xmlTag = "BalFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFrom";
			definition = "Balance from which the securities are moving.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails41.mmBalanceFrom);
			previousVersion_lazy = () -> IntraPositionDetails27.mmBalanceFrom;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmObject();
		}
	};
	protected SecuritiesSubBalanceTypeAndQuantityBreakdown3 balanceTo;
	/**
	 * Balance to which the securities are moving.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSecuritiesBalanceType
	 * SecuritiesBalance.mmSecuritiesBalanceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34
	 * IntraPositionDetails34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance to which the securities are moving."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmBalanceTo
	 * IntraPositionDetails41.mmBalanceTo}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmBalanceTo
	 * IntraPositionDetails27.mmBalanceTo}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalanceTo = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> IntraPositionDetails34.mmObject();
			isDerived = false;
			xmlTag = "BalTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTo";
			definition = "Balance to which the securities are moving.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails41.mmBalanceTo);
			previousVersion_lazy = () -> IntraPositionDetails27.mmBalanceTo;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmObject();
		}
	};
	protected Max350Text instructionProcessingAdditionalDetails;
	/**
	 * Provides additional settlement processing information which can not be
	 * included within the structured fields of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails34
	 * IntraPositionDetails34}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrcgAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional settlement processing information which can not be included within the structured fields of the message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmInstructionProcessingAdditionalDetails
	 * IntraPositionDetails41.mmInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails27#mmInstructionProcessingAdditionalDetails
	 * IntraPositionDetails27.mmInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionProcessingAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraPositionDetails34.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgAddtlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails41.mmInstructionProcessingAdditionalDetails);
			previousVersion_lazy = () -> IntraPositionDetails27.mmInstructionProcessingAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IntraPositionDetails34.mmSettledQuantity, IntraPositionDetails34.mmSecuritiesSubBalanceIdentification, IntraPositionDetails34.mmCollateralMonitorAmount,
						IntraPositionDetails34.mmPreviouslySettledQuantity, IntraPositionDetails34.mmRemainingToBeSettledQuantity, IntraPositionDetails34.mmSettlementDate, IntraPositionDetails34.mmAvailableDate,
						IntraPositionDetails34.mmCorporateActionEventType, IntraPositionDetails34.mmBalanceFrom, IntraPositionDetails34.mmBalanceTo, IntraPositionDetails34.mmInstructionProcessingAdditionalDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(IntraPositionMovementConfirmationV05.mmIntraPositionDetails);
				trace_lazy = () -> IntraPositionTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntraPositionDetails34";
				definition = "Details of the intra-position movement.";
				nextVersions_lazy = () -> Arrays.asList(IntraPositionDetails41.mmObject());
				previousVersion_lazy = () -> IntraPositionDetails27.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttldQty", required = true)
	public FinancialInstrumentQuantity1Choice getSettledQuantity() {
		return settledQuantity;
	}

	public void setSettledQuantity(FinancialInstrumentQuantity1Choice settledQuantity) {
		this.settledQuantity = settledQuantity;
	}

	@XmlElement(name = "SctiesSubBalId")
	public GenericIdentification37 getSecuritiesSubBalanceIdentification() {
		return securitiesSubBalanceIdentification;
	}

	public void setSecuritiesSubBalanceIdentification(com.tools20022.repository.msg.GenericIdentification37 securitiesSubBalanceIdentification) {
		this.securitiesSubBalanceIdentification = securitiesSubBalanceIdentification;
	}

	@XmlElement(name = "CollMntrAmt")
	public AmountAndDirection44 getCollateralMonitorAmount() {
		return collateralMonitorAmount;
	}

	public void setCollateralMonitorAmount(com.tools20022.repository.msg.AmountAndDirection44 collateralMonitorAmount) {
		this.collateralMonitorAmount = collateralMonitorAmount;
	}

	@XmlElement(name = "PrevslySttldQty")
	public FinancialInstrumentQuantity1Choice getPreviouslySettledQuantity() {
		return previouslySettledQuantity;
	}

	public void setPreviouslySettledQuantity(FinancialInstrumentQuantity1Choice previouslySettledQuantity) {
		this.previouslySettledQuantity = previouslySettledQuantity;
	}

	@XmlElement(name = "RmngToBeSttldQty")
	public FinancialInstrumentQuantity1Choice getRemainingToBeSettledQuantity() {
		return remainingToBeSettledQuantity;
	}

	public void setRemainingToBeSettledQuantity(FinancialInstrumentQuantity1Choice remainingToBeSettledQuantity) {
		this.remainingToBeSettledQuantity = remainingToBeSettledQuantity;
	}

	@XmlElement(name = "SttlmDt", required = true)
	public DateAndDateTimeChoice getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(DateAndDateTimeChoice settlementDate) {
		this.settlementDate = settlementDate;
	}

	@XmlElement(name = "AvlblDt")
	public DateAndDateTimeChoice getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(DateAndDateTimeChoice availableDate) {
		this.availableDate = availableDate;
	}

	@XmlElement(name = "CorpActnEvtTp")
	public CorporateActionEventType29Choice getCorporateActionEventType() {
		return corporateActionEventType;
	}

	public void setCorporateActionEventType(CorporateActionEventType29Choice corporateActionEventType) {
		this.corporateActionEventType = corporateActionEventType;
	}

	@XmlElement(name = "BalFr", required = true)
	public SecuritiesSubBalanceTypeAndQuantityBreakdown3 getBalanceFrom() {
		return balanceFrom;
	}

	public void setBalanceFrom(com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3 balanceFrom) {
		this.balanceFrom = balanceFrom;
	}

	@XmlElement(name = "BalTo", required = true)
	public SecuritiesSubBalanceTypeAndQuantityBreakdown3 getBalanceTo() {
		return balanceTo;
	}

	public void setBalanceTo(com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3 balanceTo) {
		this.balanceTo = balanceTo;
	}

	@XmlElement(name = "InstrPrcgAddtlDtls")
	public Max350Text getInstructionProcessingAdditionalDetails() {
		return instructionProcessingAdditionalDetails;
	}

	public void setInstructionProcessingAdditionalDetails(Max350Text instructionProcessingAdditionalDetails) {
		this.instructionProcessingAdditionalDetails = instructionProcessingAdditionalDetails;
	}
}