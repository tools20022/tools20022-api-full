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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV06;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.IncomePreference2Code;
import com.tools20022.repository.codeset.RoundingDirection1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Plan that allows investors to schedule periodical investments or divestments,
 * according to pre-defined criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmFrequency
 * InvestmentPlan12.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmStartDate
 * InvestmentPlan12.mmStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmEndDate
 * InvestmentPlan12.mmEndDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmQuantity
 * InvestmentPlan12.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmGrossAmountIndicator
 * InvestmentPlan12.mmGrossAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmIncomePreference
 * InvestmentPlan12.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmInitialAmount
 * InvestmentPlan12.mmInitialAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmTotalNumberOfInstalments
 * InvestmentPlan12.mmTotalNumberOfInstalments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmRoundingDirection
 * InvestmentPlan12.mmRoundingDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmSecurityDetails
 * InvestmentPlan12.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmCashSettlement
 * InvestmentPlan12.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmContractReference
 * InvestmentPlan12.mmContractReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmRelatedContractReference
 * InvestmentPlan12.mmRelatedContractReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmProductIdentification
 * InvestmentPlan12.mmProductIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmSLAChargeAndCommissionReference
 * InvestmentPlan12.mmSLAChargeAndCommissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmInsuranceCover
 * InvestmentPlan12.mmInsuranceCover}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmPlanStatus
 * InvestmentPlan12.mmPlanStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmInstalmentManagerRole
 * InvestmentPlan12.mmInstalmentManagerRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
 * InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmSavingsInvestmentPlan
 * AccountOpeningInstructionV06.mmSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmWithdrawalInvestmentPlan
 * AccountOpeningInstructionV06.mmWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmSavingsInvestmentPlan
 * AccountDetailsConfirmationV06.mmSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmWithdrawalInvestmentPlan
 * AccountDetailsConfirmationV06.mmWithdrawalInvestmentPlan}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintAmountRule#forInvestmentPlan12
 * ConstraintAmountRule.forInvestmentPlan12}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentPlan12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan14
 * InvestmentPlan14}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10 InvestmentPlan10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentPlan12", propOrder = {"frequency", "startDate", "endDate", "quantity", "grossAmountIndicator", "incomePreference", "initialAmount", "totalNumberOfInstalments", "roundingDirection", "securityDetails",
		"cashSettlement", "contractReference", "relatedContractReference", "productIdentification", "sLAChargeAndCommissionReference", "insuranceCover", "planStatus", "instalmentManagerRole"})
public class InvestmentPlan12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Frqcy", required = true)
	protected Frequency20Choice frequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Frequency20Choice
	 * Frequency20Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmFrequency
	 * InvestmentPlan.mmFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the investment or divestment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmFrequency
	 * InvestmentPlan14.mmFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmFrequency
	 * InvestmentPlan10.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentPlan.mmFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the investment or divestment.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmFrequency);
			previousVersion_lazy = () -> InvestmentPlan10.mmFrequency;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Frequency20Choice.mmObject();
		}
	};
	@XmlElement(name = "StartDt")
	protected ISODate startDate;
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmFromDateTime
	 * DateTimePeriod.mmFromDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StartDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the investment plan starts."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmStartDate
	 * InvestmentPlan14.mmStartDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmStartDate
	 * InvestmentPlan10.mmStartDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStartDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Date the investment plan starts.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmStartDate);
			previousVersion_lazy = () -> InvestmentPlan10.mmStartDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "EndDt")
	protected ISODate endDate;
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
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmToDateTime
	 * DateTimePeriod.mmToDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EndDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the investment plan stops."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmEndDate
	 * InvestmentPlan14.mmEndDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmEndDate
	 * InvestmentPlan10.mmEndDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEndDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "EndDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndDate";
			definition = "Date the investment plan stops.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmEndDate);
			previousVersion_lazy = () -> InvestmentPlan10.mmEndDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "Qty", required = true)
	protected UnitsOrAmount1Choice quantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitsOrAmount1Choice
	 * UnitsOrAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan
	 * InvestmentPlan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
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
	 * definition} = "Amount of the periodical payments."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmQuantity
	 * InvestmentPlan14.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmQuantity
	 * InvestmentPlan10.mmQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentPlan.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Amount of the periodical payments.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmQuantity);
			previousVersion_lazy = () -> InvestmentPlan10.mmQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitsOrAmount1Choice.mmObject();
		}
	};
	@XmlElement(name = "GrssAmtInd")
	protected YesNoIndicator grossAmountIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmountIndicator
	 * InvestmentFundOrder.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssAmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an ordered amount is a gross amount (including all charges, commissions, tax). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmGrossAmountIndicator
	 * InvestmentPlan14.mmGrossAmountIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmGrossAmountIndicator
	 * InvestmentPlan10.mmGrossAmountIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossAmountIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmGrossAmountIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "GrssAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an ordered amount is a gross amount (including all charges, commissions, tax). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added).";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmGrossAmountIndicator);
			previousVersion_lazy = () -> InvestmentPlan10.mmGrossAmountIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "IncmPref")
	protected IncomePreference2Code incomePreference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference2Code
	 * IncomePreference2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmIncomePreference
	 * InvestmentPlan14.mmIncomePreference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmIncomePreference
	 * InvestmentPlan10.mmIncomePreference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomePreference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmIncomePreference);
			previousVersion_lazy = () -> InvestmentPlan10.mmIncomePreference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference2Code.mmObject();
		}
	};
	@XmlElement(name = "InitlAmt")
	protected InitialAmount1Choice initialAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InitialAmount1Choice
	 * InitialAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmInstalment
	 * InvestmentPlan.mmInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial amount or number of initial instalments."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmInitialAmount
	 * InvestmentPlan14.mmInitialAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitialAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentPlan.mmInstalment;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "InitlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialAmount";
			definition = "Initial amount or number of initial instalments.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmInitialAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InitialAmount1Choice.mmObject();
		}
	};
	@XmlElement(name = "TtlNbOfInstlmts")
	protected Number totalNumberOfInstalments;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmTotalNumberOfInstalment
	 * Instalment.mmTotalNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlNbOfInstlmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalNumberOfInstalments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total number of times the amount must be invested at the predefined frequency as of the start date of the investment plan."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmTotalNumberOfInstalments
	 * InvestmentPlan14.mmTotalNumberOfInstalments}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmTotalNumberOfInstalments
	 * InvestmentPlan10.mmTotalNumberOfInstalments}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfInstalments = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Instalment.mmTotalNumberOfInstalment;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfInstlmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfInstalments";
			definition = "Total number of times the amount must be invested at the predefined frequency as of the start date of the investment plan.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmTotalNumberOfInstalments);
			previousVersion_lazy = () -> InvestmentPlan10.mmTotalNumberOfInstalments;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "RndgDrctn")
	protected RoundingDirection1Code roundingDirection;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirection1Code
	 * RoundingDirection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRoundingDirection
	 * RoundingParameters.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndgDrctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the rounding direction when an amount is to be spread over several funds."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmRoundingDirection
	 * InvestmentPlan14.mmRoundingDirection}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmRoundingDirection
	 * InvestmentPlan10.mmRoundingDirection}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRoundingDirection = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "RndgDrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingDirection";
			definition = "Indicates the rounding direction when an amount is to be spread over several funds.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmRoundingDirection);
			previousVersion_lazy = () -> InvestmentPlan10.mmRoundingDirection;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection1Code.mmObject();
		}
	};
	@XmlElement(name = "SctyDtls", required = true)
	protected List<com.tools20022.repository.msg.Repartition4> securityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Repartition4
	 * Repartition4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security that an investment plan invests in, or from which the investment plan divests."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmSecurityDetails
	 * InvestmentPlan14.mmSecurityDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmSecurityDetails
	 * InvestmentPlan10.mmSecurityDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecurityDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "SctyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			definition = "Security that an investment plan invests in, or from which the investment plan divests.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmSecurityDetails);
			previousVersion_lazy = () -> InvestmentPlan10.mmSecurityDetails;
			maxOccurs = 50;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Repartition4.mmObject();
		}
	};
	@XmlElement(name = "CshSttlm")
	protected List<com.tools20022.repository.msg.CashSettlement1> cashSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashSettlement1
	 * CashSettlement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash settlement standing instruction associated to the investment plan."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmCashSettlement
	 * InvestmentPlan14.mmCashSettlement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmCashSettlement
	 * InvestmentPlan10.mmCashSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashSettlement = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentOffset;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "CshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Cash settlement standing instruction associated to the investment plan.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmCashSettlement);
			previousVersion_lazy = () -> InvestmentPlan10.mmCashSettlement;
			maxOccurs = 8;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashSettlement1.mmObject();
		}
	};
	@XmlElement(name = "CtrctRef")
	protected Max35Text contractReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the underlying investment contract. In some markets, such as Italy, this might be required to segregate holdings between the same investment account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmContractReference
	 * InvestmentPlan14.mmContractReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmContractReference
	 * InvestmentPlan10.mmContractReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContractReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "CtrctRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractReference";
			definition = "Reference of the underlying investment contract. In some markets, such as Italy, this might be required to segregate holdings between the same investment account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmContractReference);
			previousVersion_lazy = () -> InvestmentPlan10.mmContractReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "RltdCtrctRef")
	protected Max35Text relatedContractReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdCtrctRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedContractReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the previous contract to which this savings or withdrawal plan is related."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmRelatedContractReference
	 * InvestmentPlan14.mmRelatedContractReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmRelatedContractReference
	 * InvestmentPlan10.mmRelatedContractReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRelatedContractReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "RltdCtrctRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedContractReference";
			definition = "Reference of the previous contract to which this savings or withdrawal plan is related.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmRelatedContractReference);
			previousVersion_lazy = () -> InvestmentPlan10.mmRelatedContractReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "PdctId")
	protected Max35Text productIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the product as designated by the fund manager. In some markets, such as Italy, the financial product or service related to a savings plan or withdrawal plan are identified by a product identification or number."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmProductIdentification
	 * InvestmentPlan14.mmProductIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmProductIdentification
	 * InvestmentPlan10.mmProductIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "PdctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductIdentification";
			definition = "Identification of the product as designated by the fund manager. In some markets, such as Italy, the financial product or service related to a savings plan or withdrawal plan are identified by a product identification or number.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmProductIdentification);
			previousVersion_lazy = () -> InvestmentPlan10.mmProductIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SLAChrgAndComssnRef")
	protected Max35Text sLAChargeAndCommissionReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SLAChrgAndComssnRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SLAChargeAndCommissionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the underlying service level agreement (SLA) governing charges and commission."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmSLAChargeAndCommissionReference
	 * InvestmentPlan14.mmSLAChargeAndCommissionReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmSLAChargeAndCommissionReference
	 * InvestmentPlan10.mmSLAChargeAndCommissionReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSLAChargeAndCommissionReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "SLAChrgAndComssnRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SLAChargeAndCommissionReference";
			definition = "Reference of the underlying service level agreement (SLA) governing charges and commission.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmSLAChargeAndCommissionReference);
			previousVersion_lazy = () -> InvestmentPlan10.mmSLAChargeAndCommissionReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "InsrncCover")
	protected InsuranceType2Choice insuranceCover;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InsuranceType2Choice
	 * InsuranceType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InsrncCover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsuranceCover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of insurance contract to which the savings investment plan is linked."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmInsuranceCover
	 * InvestmentPlan14.mmInsuranceCover}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmInsuranceCover
	 * InvestmentPlan10.mmInsuranceCover}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInsuranceCover = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "InsrncCover";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceCover";
			definition = "Specifies the type of insurance contract to which the savings investment plan is linked.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmInsuranceCover);
			previousVersion_lazy = () -> InvestmentPlan10.mmInsuranceCover;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InsuranceType2Choice.mmObject();
		}
	};
	@XmlElement(name = "PlanSts")
	protected PlanStatus2Choice planStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PlanStatus2Choice
	 * PlanStatus2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentPlan#mmPlanStatus
	 * InvestmentPlan.mmPlanStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlanSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlanStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the savings or withdrawal investment plan."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmPlanStatus
	 * InvestmentPlan14.mmPlanStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmPlanStatus
	 * InvestmentPlan10.mmPlanStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlanStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentPlan.mmPlanStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "PlanSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlanStatus";
			definition = "Status of the savings or withdrawal investment plan.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmPlanStatus);
			previousVersion_lazy = () -> InvestmentPlan10.mmPlanStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PlanStatus2Choice.mmObject();
		}
	};
	@XmlElement(name = "InstlmtMgrRole")
	protected PartyRole4Choice instalmentManagerRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PartyRole4Choice
	 * PartyRole4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmPartyRole
	 * Role.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12
	 * InvestmentPlan12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstlmtMgrRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentManagerRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Role or function of the instalment manager."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmInstalmentManagerRole
	 * InvestmentPlan14.mmInstalmentManagerRole}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan10#mmInstalmentManagerRole
	 * InvestmentPlan10.mmInstalmentManagerRole}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstalmentManagerRole = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Role.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan12.mmObject();
			isDerived = false;
			xmlTag = "InstlmtMgrRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentManagerRole";
			definition = "Role or function of the instalment manager.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmInstalmentManagerRole);
			previousVersion_lazy = () -> InvestmentPlan10.mmInstalmentManagerRole;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyRole4Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan12.mmFrequency, com.tools20022.repository.msg.InvestmentPlan12.mmStartDate, com.tools20022.repository.msg.InvestmentPlan12.mmEndDate,
						com.tools20022.repository.msg.InvestmentPlan12.mmQuantity, com.tools20022.repository.msg.InvestmentPlan12.mmGrossAmountIndicator, com.tools20022.repository.msg.InvestmentPlan12.mmIncomePreference,
						com.tools20022.repository.msg.InvestmentPlan12.mmInitialAmount, com.tools20022.repository.msg.InvestmentPlan12.mmTotalNumberOfInstalments, com.tools20022.repository.msg.InvestmentPlan12.mmRoundingDirection,
						com.tools20022.repository.msg.InvestmentPlan12.mmSecurityDetails, com.tools20022.repository.msg.InvestmentPlan12.mmCashSettlement, com.tools20022.repository.msg.InvestmentPlan12.mmContractReference,
						com.tools20022.repository.msg.InvestmentPlan12.mmRelatedContractReference, com.tools20022.repository.msg.InvestmentPlan12.mmProductIdentification,
						com.tools20022.repository.msg.InvestmentPlan12.mmSLAChargeAndCommissionReference, com.tools20022.repository.msg.InvestmentPlan12.mmInsuranceCover, com.tools20022.repository.msg.InvestmentPlan12.mmPlanStatus,
						com.tools20022.repository.msg.InvestmentPlan12.mmInstalmentManagerRole);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountOpeningInstructionV06.mmSavingsInvestmentPlan, AccountOpeningInstructionV06.mmWithdrawalInvestmentPlan, AccountDetailsConfirmationV06.mmSavingsInvestmentPlan,
						AccountDetailsConfirmationV06.mmWithdrawalInvestmentPlan);
				trace_lazy = () -> InvestmentPlan.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAmountRule.forInvestmentPlan12);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentPlan12";
				definition = "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentPlan14.mmObject());
				previousVersion_lazy = () -> InvestmentPlan10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Frequency20Choice getFrequency() {
		return frequency;
	}

	public InvestmentPlan12 setFrequency(Frequency20Choice frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public Optional<ISODate> getStartDate() {
		return startDate == null ? Optional.empty() : Optional.of(startDate);
	}

	public InvestmentPlan12 setStartDate(ISODate startDate) {
		this.startDate = startDate;
		return this;
	}

	public Optional<ISODate> getEndDate() {
		return endDate == null ? Optional.empty() : Optional.of(endDate);
	}

	public InvestmentPlan12 setEndDate(ISODate endDate) {
		this.endDate = endDate;
		return this;
	}

	public UnitsOrAmount1Choice getQuantity() {
		return quantity;
	}

	public InvestmentPlan12 setQuantity(UnitsOrAmount1Choice quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public Optional<YesNoIndicator> getGrossAmountIndicator() {
		return grossAmountIndicator == null ? Optional.empty() : Optional.of(grossAmountIndicator);
	}

	public InvestmentPlan12 setGrossAmountIndicator(YesNoIndicator grossAmountIndicator) {
		this.grossAmountIndicator = grossAmountIndicator;
		return this;
	}

	public Optional<IncomePreference2Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public InvestmentPlan12 setIncomePreference(IncomePreference2Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<InitialAmount1Choice> getInitialAmount() {
		return initialAmount == null ? Optional.empty() : Optional.of(initialAmount);
	}

	public InvestmentPlan12 setInitialAmount(InitialAmount1Choice initialAmount) {
		this.initialAmount = initialAmount;
		return this;
	}

	public Optional<Number> getTotalNumberOfInstalments() {
		return totalNumberOfInstalments == null ? Optional.empty() : Optional.of(totalNumberOfInstalments);
	}

	public InvestmentPlan12 setTotalNumberOfInstalments(Number totalNumberOfInstalments) {
		this.totalNumberOfInstalments = totalNumberOfInstalments;
		return this;
	}

	public Optional<RoundingDirection1Code> getRoundingDirection() {
		return roundingDirection == null ? Optional.empty() : Optional.of(roundingDirection);
	}

	public InvestmentPlan12 setRoundingDirection(RoundingDirection1Code roundingDirection) {
		this.roundingDirection = roundingDirection;
		return this;
	}

	public List<Repartition4> getSecurityDetails() {
		return securityDetails == null ? securityDetails = new ArrayList<>() : securityDetails;
	}

	public InvestmentPlan12 setSecurityDetails(List<com.tools20022.repository.msg.Repartition4> securityDetails) {
		this.securityDetails = Objects.requireNonNull(securityDetails);
		return this;
	}

	public List<CashSettlement1> getCashSettlement() {
		return cashSettlement == null ? cashSettlement = new ArrayList<>() : cashSettlement;
	}

	public InvestmentPlan12 setCashSettlement(List<com.tools20022.repository.msg.CashSettlement1> cashSettlement) {
		this.cashSettlement = Objects.requireNonNull(cashSettlement);
		return this;
	}

	public Optional<Max35Text> getContractReference() {
		return contractReference == null ? Optional.empty() : Optional.of(contractReference);
	}

	public InvestmentPlan12 setContractReference(Max35Text contractReference) {
		this.contractReference = contractReference;
		return this;
	}

	public Optional<Max35Text> getRelatedContractReference() {
		return relatedContractReference == null ? Optional.empty() : Optional.of(relatedContractReference);
	}

	public InvestmentPlan12 setRelatedContractReference(Max35Text relatedContractReference) {
		this.relatedContractReference = relatedContractReference;
		return this;
	}

	public Optional<Max35Text> getProductIdentification() {
		return productIdentification == null ? Optional.empty() : Optional.of(productIdentification);
	}

	public InvestmentPlan12 setProductIdentification(Max35Text productIdentification) {
		this.productIdentification = productIdentification;
		return this;
	}

	public Optional<Max35Text> getSLAChargeAndCommissionReference() {
		return sLAChargeAndCommissionReference == null ? Optional.empty() : Optional.of(sLAChargeAndCommissionReference);
	}

	public InvestmentPlan12 setSLAChargeAndCommissionReference(Max35Text sLAChargeAndCommissionReference) {
		this.sLAChargeAndCommissionReference = sLAChargeAndCommissionReference;
		return this;
	}

	public Optional<InsuranceType2Choice> getInsuranceCover() {
		return insuranceCover == null ? Optional.empty() : Optional.of(insuranceCover);
	}

	public InvestmentPlan12 setInsuranceCover(InsuranceType2Choice insuranceCover) {
		this.insuranceCover = insuranceCover;
		return this;
	}

	public Optional<PlanStatus2Choice> getPlanStatus() {
		return planStatus == null ? Optional.empty() : Optional.of(planStatus);
	}

	public InvestmentPlan12 setPlanStatus(PlanStatus2Choice planStatus) {
		this.planStatus = planStatus;
		return this;
	}

	public Optional<PartyRole4Choice> getInstalmentManagerRole() {
		return instalmentManagerRole == null ? Optional.empty() : Optional.of(instalmentManagerRole);
	}

	public InvestmentPlan12 setInstalmentManagerRole(PartyRole4Choice instalmentManagerRole) {
		this.instalmentManagerRole = instalmentManagerRole;
		return this;
	}
}