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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV07;
import com.tools20022.repository.choice.CorporateActionEventType73Choice;
import com.tools20022.repository.choice.DateAndDateTime2Choice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmSettledQuantity
 * IntraPositionDetails46.mmSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmSecuritiesSubBalanceIdentification
 * IntraPositionDetails46.mmSecuritiesSubBalanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmCollateralMonitorAmount
 * IntraPositionDetails46.mmCollateralMonitorAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmPreviouslySettledQuantity
 * IntraPositionDetails46.mmPreviouslySettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmRemainingToBeSettledQuantity
 * IntraPositionDetails46.mmRemainingToBeSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmSettlementDate
 * IntraPositionDetails46.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmAvailableDate
 * IntraPositionDetails46.mmAvailableDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmCorporateActionEventType
 * IntraPositionDetails46.mmCorporateActionEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmBalanceFrom
 * IntraPositionDetails46.mmBalanceFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmBalanceTo
 * IntraPositionDetails46.mmBalanceTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46#mmInstructionProcessingAdditionalDetails
 * IntraPositionDetails46.mmInstructionProcessingAdditionalDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmationV07#mmIntraPositionDetails
 * IntraPositionMovementConfirmationV07.mmIntraPositionDetails}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule#forIntraPositionDetails46
 * ConstraintAdditionalDetailsRule.forIntraPositionDetails46}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBalanceFromToRule#forIntraPositionDetails46
 * ConstraintBalanceFromToRule.forIntraPositionDetails46}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionDetails46"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the intra-position movement."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41
 * IntraPositionDetails41}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraPositionDetails46", propOrder = {"settledQuantity", "securitiesSubBalanceIdentification", "collateralMonitorAmount", "previouslySettledQuantity", "remainingToBeSettledQuantity", "settlementDate", "availableDate",
		"corporateActionEventType", "balanceFrom", "balanceTo", "instructionProcessingAdditionalDetails"})
public class IntraPositionDetails46 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttldQty", required = true)
	protected FinancialInstrumentQuantity1Choice settledQuantity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::ESTT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument effectively settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmSettledQuantity
	 * IntraPositionDetails41.mmSettledQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettledQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails46.mmObject();
			isDerived = false;
			xmlTag = "SttldQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::ESTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledQuantity";
			definition = "Quantity of financial instrument effectively settled.";
			previousVersion_lazy = () -> IntraPositionDetails41.mmSettledQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "SctiesSubBalId")
	protected GenericIdentification37 securitiesSubBalanceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification37
	 * GenericIdentification37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
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
	 * "Number identifying a Securities Sub balance Type for example restriction identification."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmSecuritiesSubBalanceIdentification
	 * IntraPositionDetails41.mmSecuritiesSubBalanceIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesSubBalanceIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails46.mmObject();
			isDerived = false;
			xmlTag = "SctiesSubBalId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSubBalanceIdentification";
			definition = "Number identifying a Securities Sub balance Type for example restriction identification.";
			previousVersion_lazy = () -> IntraPositionDetails41.mmSecuritiesSubBalanceIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification37.mmObject();
		}
	};
	@XmlElement(name = "CollMntrAmt")
	protected AmountAndDirection44 collateralMonitorAmount;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmCollateralMonitorAmount
	 * IntraPositionDetails41.mmCollateralMonitorAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCollateralMonitorAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> IntraPositionTransfer.mmCollateralAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails46.mmObject();
			isDerived = false;
			xmlTag = "CollMntrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralMonitorAmount";
			definition = "Value of the collateral available for the delivery settlement process at the account level.";
			previousVersion_lazy = () -> IntraPositionDetails41.mmCollateralMonitorAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection44.mmObject();
		}
	};
	@XmlElement(name = "PrevslySttldQty")
	protected FinancialInstrumentQuantity1Choice previouslySettledQuantity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrevslySttldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::PSTT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslySettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument previously settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmPreviouslySettledQuantity
	 * IntraPositionDetails41.mmPreviouslySettledQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPreviouslySettledQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails46.mmObject();
			isDerived = false;
			xmlTag = "PrevslySttldQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::PSTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslySettledQuantity";
			definition = "Quantity of financial instrument previously settled.";
			previousVersion_lazy = () -> IntraPositionDetails41.mmPreviouslySettledQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "RmngToBeSttldQty")
	protected FinancialInstrumentQuantity1Choice remainingToBeSettledQuantity;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngToBeSttldQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :36B::RSTT</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmRemainingToBeSettledQuantity
	 * IntraPositionDetails41.mmRemainingToBeSettledQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemainingToBeSettledQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails46.mmObject();
			isDerived = false;
			xmlTag = "RmngToBeSttldQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":36B::RSTT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingToBeSettledQuantity";
			definition = "Quantity of financial instrument remaining to be settled.";
			previousVersion_lazy = () -> IntraPositionDetails41.mmRemainingToBeSettledQuantity;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}
	};
	@XmlElement(name = "SttlmDt", required = true)
	protected DateAndDateTime2Choice settlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime2Choice
	 * DateAndDateTime2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the securities were moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmSettlementDate
	 * IntraPositionDetails41.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails46.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities were moved.";
			previousVersion_lazy = () -> IntraPositionDetails41.mmSettlementDate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> DateAndDateTime2Choice.mmObject();
		}
	};
	@XmlElement(name = "AvlblDt")
	protected DateAndDateTime2Choice availableDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime2Choice
	 * DateAndDateTime2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmAvailableDate
	 * Security.mmAvailableDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvlblDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::AVAL</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmAvailableDate
	 * IntraPositionDetails41.mmAvailableDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAvailableDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmAvailableDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails46.mmObject();
			isDerived = false;
			xmlTag = "AvlblDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::AVAL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvailableDate";
			definition = "Date/time securities become available for sale (if securities become unavailable, this specifies the date/time at which they will become available again).";
			previousVersion_lazy = () -> IntraPositionDetails41.mmAvailableDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTime2Choice.mmObject();
		}
	};
	@XmlElement(name = "CorpActnEvtTp")
	protected CorporateActionEventType73Choice corporateActionEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType73Choice
	 * CorporateActionEventType73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmCorporateEvent
	 * Security.mmCorporateEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::CAEV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of corporate event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmCorporateActionEventType
	 * IntraPositionDetails41.mmCorporateActionEventType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCorporateActionEventType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmCorporateEvent;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails46.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::CAEV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventType";
			definition = "Specifies the type of corporate event.";
			previousVersion_lazy = () -> IntraPositionDetails41.mmCorporateActionEventType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionEventType73Choice.mmObject();
		}
	};
	@XmlElement(name = "BalFr", required = true)
	protected SecuritiesSubBalanceTypeAndQuantityBreakdown3 balanceFrom;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::FROM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance from which the securities are moving."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmBalanceFrom
	 * IntraPositionDetails41.mmBalanceFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalanceFrom = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails46.mmObject();
			isDerived = false;
			xmlTag = "BalFr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::FROM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFrom";
			definition = "Balance from which the securities are moving.";
			previousVersion_lazy = () -> IntraPositionDetails41.mmBalanceFrom;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmObject();
		}
	};
	@XmlElement(name = "BalTo", required = true)
	protected SecuritiesSubBalanceTypeAndQuantityBreakdown3 balanceTo;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::TOBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance to which the securities are moving."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmBalanceTo
	 * IntraPositionDetails41.mmBalanceTo}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalanceTo = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesBalance.mmSecuritiesBalanceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails46.mmObject();
			isDerived = false;
			xmlTag = "BalTo";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::TOBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTo";
			definition = "Balance to which the securities are moving.";
			previousVersion_lazy = () -> IntraPositionDetails41.mmBalanceTo;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3.mmObject();
		}
	};
	@XmlElement(name = "InstrPrcgAddtlDtls")
	protected Max350Text instructionProcessingAdditionalDetails;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails46
	 * IntraPositionDetails46}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrcgAddtlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::SPRO</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails41#mmInstructionProcessingAdditionalDetails
	 * IntraPositionDetails41.mmInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInstructionProcessingAdditionalDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionDetails46.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgAddtlDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::SPRO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			previousVersion_lazy = () -> IntraPositionDetails41.mmInstructionProcessingAdditionalDetails;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraPositionDetails46.mmSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails46.mmSecuritiesSubBalanceIdentification,
						com.tools20022.repository.msg.IntraPositionDetails46.mmCollateralMonitorAmount, com.tools20022.repository.msg.IntraPositionDetails46.mmPreviouslySettledQuantity,
						com.tools20022.repository.msg.IntraPositionDetails46.mmRemainingToBeSettledQuantity, com.tools20022.repository.msg.IntraPositionDetails46.mmSettlementDate,
						com.tools20022.repository.msg.IntraPositionDetails46.mmAvailableDate, com.tools20022.repository.msg.IntraPositionDetails46.mmCorporateActionEventType,
						com.tools20022.repository.msg.IntraPositionDetails46.mmBalanceFrom, com.tools20022.repository.msg.IntraPositionDetails46.mmBalanceTo,
						com.tools20022.repository.msg.IntraPositionDetails46.mmInstructionProcessingAdditionalDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(IntraPositionMovementConfirmationV07.mmIntraPositionDetails);
				trace_lazy = () -> IntraPositionTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAdditionalDetailsRule.forIntraPositionDetails46,
						com.tools20022.repository.constraints.ConstraintBalanceFromToRule.forIntraPositionDetails46);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IntraPositionDetails46";
				definition = "Details of the intra-position movement.";
				previousVersion_lazy = () -> IntraPositionDetails41.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentQuantity1Choice getSettledQuantity() {
		return settledQuantity;
	}

	public IntraPositionDetails46 setSettledQuantity(FinancialInstrumentQuantity1Choice settledQuantity) {
		this.settledQuantity = Objects.requireNonNull(settledQuantity);
		return this;
	}

	public Optional<GenericIdentification37> getSecuritiesSubBalanceIdentification() {
		return securitiesSubBalanceIdentification == null ? Optional.empty() : Optional.of(securitiesSubBalanceIdentification);
	}

	public IntraPositionDetails46 setSecuritiesSubBalanceIdentification(com.tools20022.repository.msg.GenericIdentification37 securitiesSubBalanceIdentification) {
		this.securitiesSubBalanceIdentification = securitiesSubBalanceIdentification;
		return this;
	}

	public Optional<AmountAndDirection44> getCollateralMonitorAmount() {
		return collateralMonitorAmount == null ? Optional.empty() : Optional.of(collateralMonitorAmount);
	}

	public IntraPositionDetails46 setCollateralMonitorAmount(com.tools20022.repository.msg.AmountAndDirection44 collateralMonitorAmount) {
		this.collateralMonitorAmount = collateralMonitorAmount;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getPreviouslySettledQuantity() {
		return previouslySettledQuantity == null ? Optional.empty() : Optional.of(previouslySettledQuantity);
	}

	public IntraPositionDetails46 setPreviouslySettledQuantity(FinancialInstrumentQuantity1Choice previouslySettledQuantity) {
		this.previouslySettledQuantity = previouslySettledQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getRemainingToBeSettledQuantity() {
		return remainingToBeSettledQuantity == null ? Optional.empty() : Optional.of(remainingToBeSettledQuantity);
	}

	public IntraPositionDetails46 setRemainingToBeSettledQuantity(FinancialInstrumentQuantity1Choice remainingToBeSettledQuantity) {
		this.remainingToBeSettledQuantity = remainingToBeSettledQuantity;
		return this;
	}

	public DateAndDateTime2Choice getSettlementDate() {
		return settlementDate;
	}

	public IntraPositionDetails46 setSettlementDate(DateAndDateTime2Choice settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public Optional<DateAndDateTime2Choice> getAvailableDate() {
		return availableDate == null ? Optional.empty() : Optional.of(availableDate);
	}

	public IntraPositionDetails46 setAvailableDate(DateAndDateTime2Choice availableDate) {
		this.availableDate = availableDate;
		return this;
	}

	public Optional<CorporateActionEventType73Choice> getCorporateActionEventType() {
		return corporateActionEventType == null ? Optional.empty() : Optional.of(corporateActionEventType);
	}

	public IntraPositionDetails46 setCorporateActionEventType(CorporateActionEventType73Choice corporateActionEventType) {
		this.corporateActionEventType = corporateActionEventType;
		return this;
	}

	public SecuritiesSubBalanceTypeAndQuantityBreakdown3 getBalanceFrom() {
		return balanceFrom;
	}

	public IntraPositionDetails46 setBalanceFrom(com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3 balanceFrom) {
		this.balanceFrom = Objects.requireNonNull(balanceFrom);
		return this;
	}

	public SecuritiesSubBalanceTypeAndQuantityBreakdown3 getBalanceTo() {
		return balanceTo;
	}

	public IntraPositionDetails46 setBalanceTo(com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown3 balanceTo) {
		this.balanceTo = Objects.requireNonNull(balanceTo);
		return this;
	}

	public Optional<Max350Text> getInstructionProcessingAdditionalDetails() {
		return instructionProcessingAdditionalDetails == null ? Optional.empty() : Optional.of(instructionProcessingAdditionalDetails);
	}

	public IntraPositionDetails46 setInstructionProcessingAdditionalDetails(Max350Text instructionProcessingAdditionalDetails) {
		this.instructionProcessingAdditionalDetails = instructionProcessingAdditionalDetails;
		return this;
	}
}