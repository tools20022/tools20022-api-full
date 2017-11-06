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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.IncomePreference2Code;
import com.tools20022.repository.codeset.RoundingDirection1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.InvestmentPlan;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmFrequency
 * InvestmentPlan15.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmStartDate
 * InvestmentPlan15.mmStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmEndDate
 * InvestmentPlan15.mmEndDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmQuantity
 * InvestmentPlan15.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmGrossAmountIndicator
 * InvestmentPlan15.mmGrossAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmIncomePreference
 * InvestmentPlan15.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmInitialAmount
 * InvestmentPlan15.mmInitialAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmTotalNumberOfInstalments
 * InvestmentPlan15.mmTotalNumberOfInstalments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmRoundingDirection
 * InvestmentPlan15.mmRoundingDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmSecurityDetails
 * InvestmentPlan15.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmModifiedCashSettlement
 * InvestmentPlan15.mmModifiedCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmContractReference
 * InvestmentPlan15.mmContractReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmRelatedContractReference
 * InvestmentPlan15.mmRelatedContractReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmProductIdentification
 * InvestmentPlan15.mmProductIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmSLAChargeAndCommissionReference
 * InvestmentPlan15.mmSLAChargeAndCommissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmInsuranceCover
 * InvestmentPlan15.mmInsuranceCover}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmPlanStatus
 * InvestmentPlan15.mmPlanStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15#mmInstalmentManagerRole
 * InvestmentPlan15.mmInstalmentManagerRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
 * InvestmentPlan}</li>
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
 * "InvestmentPlan15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13 InvestmentPlan13}</li>
 * </ul>
 */
public class InvestmentPlan15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Frequency20Choice frequency;
	/**
	 * Frequency of the investment or divestment.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmFrequency
	 * InvestmentPlan13.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmFrequency;
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the investment or divestment.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmFrequency;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Frequency20Choice.mmObject();
		}
	};
	protected ISODate startDate;
	/**
	 * Date the investment plan starts.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmStartDate
	 * InvestmentPlan13.mmStartDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStartDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Date the investment plan starts.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmStartDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate endDate;
	/**
	 * Date the investment plan stops.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmEndDate
	 * InvestmentPlan13.mmEndDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEndDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "EndDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndDate";
			definition = "Date the investment plan stops.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmEndDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected UnitsOrAmount1Choice quantity;
	/**
	 * Amount of the periodical payments.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmQuantity
	 * InvestmentPlan13.mmQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentPlan.mmObject();
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Amount of the periodical payments.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitsOrAmount1Choice.mmObject();
		}
	};
	protected YesNoIndicator grossAmountIndicator;
	/**
	 * Indicates whether an ordered amount is a gross amount (including
	 * transaction overhead). If it is not a gross amount, the ordered amount is
	 * a net amount (amount to be invested or redeemed from the fund to which
	 * other elements will be added).
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmountIndicator
	 * InvestmentFundOrder.mmGrossAmountIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * "Indicates whether an ordered amount is a gross amount (including transaction overhead). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmGrossAmountIndicator
	 * InvestmentPlan13.mmGrossAmountIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossAmountIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrder.mmGrossAmountIndicator;
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "GrssAmtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an ordered amount is a gross amount (including transaction overhead). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmGrossAmountIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected IncomePreference2Code incomePreference;
	/**
	 * Dividend option chosen by the account owner based on the options offered
	 * in the prospectus.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmIncomePreference
	 * InvestmentPlan13.mmIncomePreference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomePreference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmIncomePreference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference2Code.mmObject();
		}
	};
	protected InitialAmount1Choice initialAmount;
	/**
	 * Initial amount or number of initial instalments.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmInitialAmount
	 * InvestmentPlan13.mmInitialAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitialAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmInstalment;
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "InitlAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialAmount";
			definition = "Initial amount or number of initial instalments.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmInitialAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InitialAmount1Choice.mmObject();
		}
	};
	protected Number totalNumberOfInstalments;
	/**
	 * Total number of times the amount must be invested at the predefined
	 * frequency as of the start date of the investment plan.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmTotalNumberOfInstalments
	 * InvestmentPlan13.mmTotalNumberOfInstalments}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalNumberOfInstalments = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Instalment.mmTotalNumberOfInstalment;
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfInstlmts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfInstalments";
			definition = "Total number of times the amount must be invested at the predefined frequency as of the start date of the investment plan.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmTotalNumberOfInstalments;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected RoundingDirection1Code roundingDirection;
	/**
	 * Indicates the rounding direction when an amount is to be spread over
	 * several funds.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmRoundingDirection
	 * InvestmentPlan13.mmRoundingDirection}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRoundingDirection = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "RndgDrctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingDirection";
			definition = "Indicates the rounding direction when an amount is to be spread over several funds.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmRoundingDirection;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Repartition5> securityDetails;
	/**
	 * Security that an investment plan invests in, or from which the investment
	 * plan divests.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Repartition5
	 * Repartition5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmSecurityDetails
	 * InvestmentPlan13.mmSecurityDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecurityDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "SctyDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			definition = "Security that an investment plan invests in, or from which the investment plan divests.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmSecurityDetails;
			maxOccurs = 50;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Repartition5.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CashSettlement2> modifiedCashSettlement;
	/**
	 * Cash settlement standing instruction associated to the investment plan
	 * and to be either inserted or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashSettlement2
	 * CashSettlement2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdCshSttlm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedCashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash settlement standing instruction associated to the investment plan and to be either inserted or deleted."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmModifiedCashSettlement
	 * InvestmentPlan13.mmModifiedCashSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModifiedCashSettlement = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PaymentObligation.mmPaymentOffset;
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "ModfdCshSttlm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedCashSettlement";
			definition = "Cash settlement standing instruction associated to the investment plan and to be either inserted or deleted.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmModifiedCashSettlement;
			maxOccurs = 8;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashSettlement2.mmObject();
		}
	};
	protected Max35Text contractReference;
	/**
	 * Reference of the underlying investment contract. In some markets, such as
	 * Italy, this might be required to segregate holdings between the same
	 * investment account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * "Reference of the underlying investment contract. In some markets, such as Italy, this might be required to segregate holdings between the same investment account. "
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmContractReference
	 * InvestmentPlan13.mmContractReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContractReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "CtrctRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractReference";
			definition = "Reference of the underlying investment contract. In some markets, such as Italy, this might be required to segregate holdings between the same investment account. ";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmContractReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text relatedContractReference;
	/**
	 * Reference of the previous contract to which this savings or withdrawal
	 * plan is related.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmRelatedContractReference
	 * InvestmentPlan13.mmRelatedContractReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRelatedContractReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "RltdCtrctRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedContractReference";
			definition = "Reference of the previous contract to which this savings or withdrawal plan is related.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmRelatedContractReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text productIdentification;
	/**
	 * Identification of the product as designated by the fund manager. In some
	 * markets, such as Italy, the financial product or service related to a
	 * savings plan or withdrawal plan are identified by a product
	 * identification or number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmProductIdentification
	 * InvestmentPlan13.mmProductIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "PdctId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductIdentification";
			definition = "Identification of the product as designated by the fund manager. In some markets, such as Italy, the financial product or service related to a savings plan or withdrawal plan are identified by a product identification or number.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmProductIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text sLAChargeAndCommissionReference;
	/**
	 * Reference of the underlying service level agreement (SLA) governing fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * "Reference of the underlying service level agreement (SLA) governing fees."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmSLAChargeAndCommissionReference
	 * InvestmentPlan13.mmSLAChargeAndCommissionReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSLAChargeAndCommissionReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "SLAChrgAndComssnRef";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SLAChargeAndCommissionReference";
			definition = "Reference of the underlying service level agreement (SLA) governing fees.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmSLAChargeAndCommissionReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected InsuranceType2Choice insuranceCover;
	/**
	 * Specifies the type of insurance contract to which the savings investment
	 * plan is linked.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmInsuranceCover
	 * InvestmentPlan13.mmInsuranceCover}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInsuranceCover = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "InsrncCover";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceCover";
			definition = "Specifies the type of insurance contract to which the savings investment plan is linked.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmInsuranceCover;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InsuranceType2Choice.mmObject();
		}
	};
	protected PlanStatus2Choice planStatus;
	/**
	 * Status of the savings or withdrawal investment plan.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * definition} = "Status of the savings or withdrawal investment plan. "</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmPlanStatus
	 * InvestmentPlan13.mmPlanStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPlanStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentPlan.mmPlanStatus;
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "PlanSts";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlanStatus";
			definition = "Status of the savings or withdrawal investment plan. ";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmPlanStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PlanStatus2Choice.mmObject();
		}
	};
	protected PartyRole4Choice instalmentManagerRole;
	/**
	 * Role or function of the instalment manager.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan15
	 * InvestmentPlan15}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan13#mmInstalmentManagerRole
	 * InvestmentPlan13.mmInstalmentManagerRole}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstalmentManagerRole = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Role.mmPartyRole;
			componentContext_lazy = () -> InvestmentPlan15.mmObject();
			isDerived = false;
			xmlTag = "InstlmtMgrRole";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentManagerRole";
			definition = "Role or function of the instalment manager.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.InvestmentPlan13.mmInstalmentManagerRole;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyRole4Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan15.mmFrequency, com.tools20022.repository.msg.InvestmentPlan15.mmStartDate, com.tools20022.repository.msg.InvestmentPlan15.mmEndDate,
						com.tools20022.repository.msg.InvestmentPlan15.mmQuantity, com.tools20022.repository.msg.InvestmentPlan15.mmGrossAmountIndicator, com.tools20022.repository.msg.InvestmentPlan15.mmIncomePreference,
						com.tools20022.repository.msg.InvestmentPlan15.mmInitialAmount, com.tools20022.repository.msg.InvestmentPlan15.mmTotalNumberOfInstalments, com.tools20022.repository.msg.InvestmentPlan15.mmRoundingDirection,
						com.tools20022.repository.msg.InvestmentPlan15.mmSecurityDetails, com.tools20022.repository.msg.InvestmentPlan15.mmModifiedCashSettlement, com.tools20022.repository.msg.InvestmentPlan15.mmContractReference,
						com.tools20022.repository.msg.InvestmentPlan15.mmRelatedContractReference, com.tools20022.repository.msg.InvestmentPlan15.mmProductIdentification,
						com.tools20022.repository.msg.InvestmentPlan15.mmSLAChargeAndCommissionReference, com.tools20022.repository.msg.InvestmentPlan15.mmInsuranceCover, com.tools20022.repository.msg.InvestmentPlan15.mmPlanStatus,
						com.tools20022.repository.msg.InvestmentPlan15.mmInstalmentManagerRole);
				trace_lazy = () -> InvestmentPlan.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "InvestmentPlan15";
				definition = "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria.";
				previousVersion_lazy = () -> InvestmentPlan13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Frequency20Choice getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency20Choice frequency) {
		this.frequency = frequency;
	}

	public ISODate getStartDate() {
		return startDate;
	}

	public void setStartDate(ISODate startDate) {
		this.startDate = startDate;
	}

	public ISODate getEndDate() {
		return endDate;
	}

	public void setEndDate(ISODate endDate) {
		this.endDate = endDate;
	}

	public UnitsOrAmount1Choice getQuantity() {
		return quantity;
	}

	public void setQuantity(UnitsOrAmount1Choice quantity) {
		this.quantity = quantity;
	}

	public YesNoIndicator getGrossAmountIndicator() {
		return grossAmountIndicator;
	}

	public void setGrossAmountIndicator(YesNoIndicator grossAmountIndicator) {
		this.grossAmountIndicator = grossAmountIndicator;
	}

	public IncomePreference2Code getIncomePreference() {
		return incomePreference;
	}

	public void setIncomePreference(IncomePreference2Code incomePreference) {
		this.incomePreference = incomePreference;
	}

	public InitialAmount1Choice getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(InitialAmount1Choice initialAmount) {
		this.initialAmount = initialAmount;
	}

	public Number getTotalNumberOfInstalments() {
		return totalNumberOfInstalments;
	}

	public void setTotalNumberOfInstalments(Number totalNumberOfInstalments) {
		this.totalNumberOfInstalments = totalNumberOfInstalments;
	}

	public RoundingDirection1Code getRoundingDirection() {
		return roundingDirection;
	}

	public void setRoundingDirection(RoundingDirection1Code roundingDirection) {
		this.roundingDirection = roundingDirection;
	}

	public List<Repartition5> getSecurityDetails() {
		return securityDetails;
	}

	public void setSecurityDetails(List<com.tools20022.repository.msg.Repartition5> securityDetails) {
		this.securityDetails = securityDetails;
	}

	public List<CashSettlement2> getModifiedCashSettlement() {
		return modifiedCashSettlement;
	}

	public void setModifiedCashSettlement(List<com.tools20022.repository.msg.CashSettlement2> modifiedCashSettlement) {
		this.modifiedCashSettlement = modifiedCashSettlement;
	}

	public Max35Text getContractReference() {
		return contractReference;
	}

	public void setContractReference(Max35Text contractReference) {
		this.contractReference = contractReference;
	}

	public Max35Text getRelatedContractReference() {
		return relatedContractReference;
	}

	public void setRelatedContractReference(Max35Text relatedContractReference) {
		this.relatedContractReference = relatedContractReference;
	}

	public Max35Text getProductIdentification() {
		return productIdentification;
	}

	public void setProductIdentification(Max35Text productIdentification) {
		this.productIdentification = productIdentification;
	}

	public Max35Text getSLAChargeAndCommissionReference() {
		return sLAChargeAndCommissionReference;
	}

	public void setSLAChargeAndCommissionReference(Max35Text sLAChargeAndCommissionReference) {
		this.sLAChargeAndCommissionReference = sLAChargeAndCommissionReference;
	}

	public InsuranceType2Choice getInsuranceCover() {
		return insuranceCover;
	}

	public void setInsuranceCover(InsuranceType2Choice insuranceCover) {
		this.insuranceCover = insuranceCover;
	}

	public PlanStatus2Choice getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(PlanStatus2Choice planStatus) {
		this.planStatus = planStatus;
	}

	public PartyRole4Choice getInstalmentManagerRole() {
		return instalmentManagerRole;
	}

	public void setInstalmentManagerRole(PartyRole4Choice instalmentManagerRole) {
		this.instalmentManagerRole = instalmentManagerRole;
	}
}