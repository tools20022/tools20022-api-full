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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV07;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.IncomePreference2Code;
import com.tools20022.repository.codeset.RoundingDirection1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashSettlement1;
import com.tools20022.repository.msg.Repartition5;
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
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmFrequency
 * InvestmentPlan14.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmStartDate
 * InvestmentPlan14.mmStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmEndDate
 * InvestmentPlan14.mmEndDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmQuantity
 * InvestmentPlan14.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmGrossAmountIndicator
 * InvestmentPlan14.mmGrossAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmIncomePreference
 * InvestmentPlan14.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmInitialAmount
 * InvestmentPlan14.mmInitialAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmTotalNumberOfInstalments
 * InvestmentPlan14.mmTotalNumberOfInstalments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmRoundingDirection
 * InvestmentPlan14.mmRoundingDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmSecurityDetails
 * InvestmentPlan14.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmCashSettlement
 * InvestmentPlan14.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmContractReference
 * InvestmentPlan14.mmContractReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmRelatedContractReference
 * InvestmentPlan14.mmRelatedContractReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmProductIdentification
 * InvestmentPlan14.mmProductIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmSLAChargeAndCommissionReference
 * InvestmentPlan14.mmSLAChargeAndCommissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmInsuranceCover
 * InvestmentPlan14.mmInsuranceCover}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmPlanStatus
 * InvestmentPlan14.mmPlanStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14#mmInstalmentManagerRole
 * InvestmentPlan14.mmInstalmentManagerRole}</li>
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
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmSavingsInvestmentPlan
 * AccountDetailsConfirmationV07.mmSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmWithdrawalInvestmentPlan
 * AccountDetailsConfirmationV07.mmWithdrawalInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmSavingsInvestmentPlan
 * AccountOpeningInstructionV07.mmSavingsInvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmWithdrawalInvestmentPlan
 * AccountOpeningInstructionV07.mmWithdrawalInvestmentPlan}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintAmountRule#forInvestmentPlan14
 * ConstraintAmountRule.forInvestmentPlan14}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentPlan14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12 InvestmentPlan12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentPlan14", propOrder = {"frequency", "startDate", "endDate", "quantity", "grossAmountIndicator", "incomePreference", "initialAmount", "totalNumberOfInstalments", "roundingDirection", "securityDetails",
		"cashSettlement", "contractReference", "relatedContractReference", "productIdentification", "sLAChargeAndCommissionReference", "insuranceCover", "planStatus", "instalmentManagerRole"})
public class InvestmentPlan14 {

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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmFrequency
	 * InvestmentPlan12.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan14, Frequency20Choice> mmFrequency = new MMMessageAttribute<InvestmentPlan14, Frequency20Choice>() {
		{
			businessElementTrace_lazy = () -> InvestmentPlan.mmFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the investment or divestment.";
			previousVersion_lazy = () -> InvestmentPlan12.mmFrequency;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Frequency20Choice.mmObject();
		}

		@Override
		public Frequency20Choice getValue(InvestmentPlan14 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Frequency20Choice value) {
			obj.setFrequency(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmStartDate
	 * InvestmentPlan12.mmStartDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan14, Optional<ISODate>> mmStartDate = new MMMessageAttribute<InvestmentPlan14, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Date the investment plan starts.";
			previousVersion_lazy = () -> InvestmentPlan12.mmStartDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(InvestmentPlan14 obj) {
			return obj.getStartDate();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<ISODate> value) {
			obj.setStartDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmEndDate
	 * InvestmentPlan12.mmEndDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan14, Optional<ISODate>> mmEndDate = new MMMessageAttribute<InvestmentPlan14, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "EndDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndDate";
			definition = "Date the investment plan stops.";
			previousVersion_lazy = () -> InvestmentPlan12.mmEndDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(InvestmentPlan14 obj) {
			return obj.getEndDate();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<ISODate> value) {
			obj.setEndDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmQuantity
	 * InvestmentPlan12.mmQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan14, UnitsOrAmount1Choice> mmQuantity = new MMMessageAttribute<InvestmentPlan14, UnitsOrAmount1Choice>() {
		{
			businessComponentTrace_lazy = () -> InvestmentPlan.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Amount of the periodical payments.";
			previousVersion_lazy = () -> InvestmentPlan12.mmQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitsOrAmount1Choice.mmObject();
		}

		@Override
		public UnitsOrAmount1Choice getValue(InvestmentPlan14 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, UnitsOrAmount1Choice value) {
			obj.setQuantity(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmGrossAmountIndicator
	 * InvestmentPlan12.mmGrossAmountIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan14, Optional<YesNoIndicator>> mmGrossAmountIndicator = new MMMessageAttribute<InvestmentPlan14, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmGrossAmountIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "GrssAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an ordered amount is a gross amount (including transaction overhead). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added).";
			previousVersion_lazy = () -> InvestmentPlan12.mmGrossAmountIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvestmentPlan14 obj) {
			return obj.getGrossAmountIndicator();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<YesNoIndicator> value) {
			obj.setGrossAmountIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmIncomePreference
	 * InvestmentPlan12.mmIncomePreference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan14, Optional<IncomePreference2Code>> mmIncomePreference = new MMMessageAttribute<InvestmentPlan14, Optional<IncomePreference2Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			previousVersion_lazy = () -> InvestmentPlan12.mmIncomePreference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference2Code.mmObject();
		}

		@Override
		public Optional<IncomePreference2Code> getValue(InvestmentPlan14 obj) {
			return obj.getIncomePreference();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<IncomePreference2Code> value) {
			obj.setIncomePreference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmInitialAmount
	 * InvestmentPlan12.mmInitialAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentPlan14, Optional<InitialAmount1Choice>> mmInitialAmount = new MMMessageAssociationEnd<InvestmentPlan14, Optional<InitialAmount1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentPlan.mmInstalment;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "InitlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialAmount";
			definition = "Initial amount or number of initial instalments.";
			previousVersion_lazy = () -> InvestmentPlan12.mmInitialAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InitialAmount1Choice.mmObject();
		}

		@Override
		public Optional<InitialAmount1Choice> getValue(InvestmentPlan14 obj) {
			return obj.getInitialAmount();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<InitialAmount1Choice> value) {
			obj.setInitialAmount(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmTotalNumberOfInstalments
	 * InvestmentPlan12.mmTotalNumberOfInstalments}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan14, Optional<Number>> mmTotalNumberOfInstalments = new MMMessageAttribute<InvestmentPlan14, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Instalment.mmTotalNumberOfInstalment;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfInstlmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfInstalments";
			definition = "Total number of times the amount must be invested at the predefined frequency as of the start date of the investment plan.";
			previousVersion_lazy = () -> InvestmentPlan12.mmTotalNumberOfInstalments;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(InvestmentPlan14 obj) {
			return obj.getTotalNumberOfInstalments();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<Number> value) {
			obj.setTotalNumberOfInstalments(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmRoundingDirection
	 * InvestmentPlan12.mmRoundingDirection}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan14, Optional<RoundingDirection1Code>> mmRoundingDirection = new MMMessageAttribute<InvestmentPlan14, Optional<RoundingDirection1Code>>() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "RndgDrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingDirection";
			definition = "Indicates the rounding direction when an amount is to be spread over several funds.";
			previousVersion_lazy = () -> InvestmentPlan12.mmRoundingDirection;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection1Code.mmObject();
		}

		@Override
		public Optional<RoundingDirection1Code> getValue(InvestmentPlan14 obj) {
			return obj.getRoundingDirection();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<RoundingDirection1Code> value) {
			obj.setRoundingDirection(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyDtls", required = true)
	protected List<Repartition5> securityDetails;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmSecurityDetails
	 * InvestmentPlan12.mmSecurityDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentPlan14, List<Repartition5>> mmSecurityDetails = new MMMessageAssociationEnd<InvestmentPlan14, List<Repartition5>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "SctyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			definition = "Security that an investment plan invests in, or from which the investment plan divests.";
			previousVersion_lazy = () -> InvestmentPlan12.mmSecurityDetails;
			maxOccurs = 50;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Repartition5.mmObject();
		}

		@Override
		public List<Repartition5> getValue(InvestmentPlan14 obj) {
			return obj.getSecurityDetails();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, List<Repartition5> value) {
			obj.setSecurityDetails(value);
		}
	};
	@XmlElement(name = "CshSttlm")
	protected List<CashSettlement1> cashSettlement;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmCashSettlement
	 * InvestmentPlan12.mmCashSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentPlan14, List<CashSettlement1>> mmCashSettlement = new MMMessageAssociationEnd<InvestmentPlan14, List<CashSettlement1>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentOffset;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "CshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			definition = "Cash settlement standing instruction associated to the investment plan.";
			previousVersion_lazy = () -> InvestmentPlan12.mmCashSettlement;
			maxOccurs = 8;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashSettlement1.mmObject();
		}

		@Override
		public List<CashSettlement1> getValue(InvestmentPlan14 obj) {
			return obj.getCashSettlement();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, List<CashSettlement1> value) {
			obj.setCashSettlement(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmContractReference
	 * InvestmentPlan12.mmContractReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan14, Optional<Max35Text>> mmContractReference = new MMMessageAttribute<InvestmentPlan14, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "CtrctRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractReference";
			definition = "Reference of the underlying investment contract. In some markets, such as Italy, this might be required to segregate holdings between the same investment account.";
			previousVersion_lazy = () -> InvestmentPlan12.mmContractReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentPlan14 obj) {
			return obj.getContractReference();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<Max35Text> value) {
			obj.setContractReference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmRelatedContractReference
	 * InvestmentPlan12.mmRelatedContractReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan14, Optional<Max35Text>> mmRelatedContractReference = new MMMessageAttribute<InvestmentPlan14, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "RltdCtrctRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedContractReference";
			definition = "Reference of the previous contract to which this savings or withdrawal plan is related.";
			previousVersion_lazy = () -> InvestmentPlan12.mmRelatedContractReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentPlan14 obj) {
			return obj.getRelatedContractReference();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<Max35Text> value) {
			obj.setRelatedContractReference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmProductIdentification
	 * InvestmentPlan12.mmProductIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan14, Optional<Max35Text>> mmProductIdentification = new MMMessageAttribute<InvestmentPlan14, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "PdctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductIdentification";
			definition = "Identification of the product as designated by the fund manager. In some markets, such as Italy, the financial product or service related to a savings plan or withdrawal plan are identified by a product identification or number.";
			previousVersion_lazy = () -> InvestmentPlan12.mmProductIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentPlan14 obj) {
			return obj.getProductIdentification();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<Max35Text> value) {
			obj.setProductIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmSLAChargeAndCommissionReference
	 * InvestmentPlan12.mmSLAChargeAndCommissionReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan14, Optional<Max35Text>> mmSLAChargeAndCommissionReference = new MMMessageAttribute<InvestmentPlan14, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "SLAChrgAndComssnRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SLAChargeAndCommissionReference";
			definition = "Reference of the underlying service level agreement (SLA) governing fees.";
			previousVersion_lazy = () -> InvestmentPlan12.mmSLAChargeAndCommissionReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentPlan14 obj) {
			return obj.getSLAChargeAndCommissionReference();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<Max35Text> value) {
			obj.setSLAChargeAndCommissionReference(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmInsuranceCover
	 * InvestmentPlan12.mmInsuranceCover}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan14, Optional<InsuranceType2Choice>> mmInsuranceCover = new MMMessageAttribute<InvestmentPlan14, Optional<InsuranceType2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "InsrncCover";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceCover";
			definition = "Specifies the type of insurance contract to which the savings investment plan is linked.";
			previousVersion_lazy = () -> InvestmentPlan12.mmInsuranceCover;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InsuranceType2Choice.mmObject();
		}

		@Override
		public Optional<InsuranceType2Choice> getValue(InvestmentPlan14 obj) {
			return obj.getInsuranceCover();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<InsuranceType2Choice> value) {
			obj.setInsuranceCover(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmPlanStatus
	 * InvestmentPlan12.mmPlanStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentPlan14, Optional<PlanStatus2Choice>> mmPlanStatus = new MMMessageAssociationEnd<InvestmentPlan14, Optional<PlanStatus2Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentPlan.mmPlanStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "PlanSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlanStatus";
			definition = "Status of the savings or withdrawal investment plan.";
			previousVersion_lazy = () -> InvestmentPlan12.mmPlanStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PlanStatus2Choice.mmObject();
		}

		@Override
		public Optional<PlanStatus2Choice> getValue(InvestmentPlan14 obj) {
			return obj.getPlanStatus();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<PlanStatus2Choice> value) {
			obj.setPlanStatus(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan14
	 * InvestmentPlan14}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan12#mmInstalmentManagerRole
	 * InvestmentPlan12.mmInstalmentManagerRole}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentPlan14, Optional<PartyRole4Choice>> mmInstalmentManagerRole = new MMMessageAssociationEnd<InvestmentPlan14, Optional<PartyRole4Choice>>() {
		{
			businessElementTrace_lazy = () -> Role.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan14.mmObject();
			isDerived = false;
			xmlTag = "InstlmtMgrRole";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentManagerRole";
			definition = "Role or function of the instalment manager.";
			previousVersion_lazy = () -> InvestmentPlan12.mmInstalmentManagerRole;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyRole4Choice.mmObject();
		}

		@Override
		public Optional<PartyRole4Choice> getValue(InvestmentPlan14 obj) {
			return obj.getInstalmentManagerRole();
		}

		@Override
		public void setValue(InvestmentPlan14 obj, Optional<PartyRole4Choice> value) {
			obj.setInstalmentManagerRole(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan14.mmFrequency, com.tools20022.repository.msg.InvestmentPlan14.mmStartDate, com.tools20022.repository.msg.InvestmentPlan14.mmEndDate,
						com.tools20022.repository.msg.InvestmentPlan14.mmQuantity, com.tools20022.repository.msg.InvestmentPlan14.mmGrossAmountIndicator, com.tools20022.repository.msg.InvestmentPlan14.mmIncomePreference,
						com.tools20022.repository.msg.InvestmentPlan14.mmInitialAmount, com.tools20022.repository.msg.InvestmentPlan14.mmTotalNumberOfInstalments, com.tools20022.repository.msg.InvestmentPlan14.mmRoundingDirection,
						com.tools20022.repository.msg.InvestmentPlan14.mmSecurityDetails, com.tools20022.repository.msg.InvestmentPlan14.mmCashSettlement, com.tools20022.repository.msg.InvestmentPlan14.mmContractReference,
						com.tools20022.repository.msg.InvestmentPlan14.mmRelatedContractReference, com.tools20022.repository.msg.InvestmentPlan14.mmProductIdentification,
						com.tools20022.repository.msg.InvestmentPlan14.mmSLAChargeAndCommissionReference, com.tools20022.repository.msg.InvestmentPlan14.mmInsuranceCover, com.tools20022.repository.msg.InvestmentPlan14.mmPlanStatus,
						com.tools20022.repository.msg.InvestmentPlan14.mmInstalmentManagerRole);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmSavingsInvestmentPlan, AccountDetailsConfirmationV07.mmWithdrawalInvestmentPlan, AccountOpeningInstructionV07.mmSavingsInvestmentPlan,
						AccountOpeningInstructionV07.mmWithdrawalInvestmentPlan);
				trace_lazy = () -> InvestmentPlan.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAmountRule.forInvestmentPlan14);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentPlan14";
				definition = "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria.";
				previousVersion_lazy = () -> InvestmentPlan12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Frequency20Choice getFrequency() {
		return frequency;
	}

	public InvestmentPlan14 setFrequency(Frequency20Choice frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public Optional<ISODate> getStartDate() {
		return startDate == null ? Optional.empty() : Optional.of(startDate);
	}

	public InvestmentPlan14 setStartDate(ISODate startDate) {
		this.startDate = startDate;
		return this;
	}

	public Optional<ISODate> getEndDate() {
		return endDate == null ? Optional.empty() : Optional.of(endDate);
	}

	public InvestmentPlan14 setEndDate(ISODate endDate) {
		this.endDate = endDate;
		return this;
	}

	public UnitsOrAmount1Choice getQuantity() {
		return quantity;
	}

	public InvestmentPlan14 setQuantity(UnitsOrAmount1Choice quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public Optional<YesNoIndicator> getGrossAmountIndicator() {
		return grossAmountIndicator == null ? Optional.empty() : Optional.of(grossAmountIndicator);
	}

	public InvestmentPlan14 setGrossAmountIndicator(YesNoIndicator grossAmountIndicator) {
		this.grossAmountIndicator = grossAmountIndicator;
		return this;
	}

	public Optional<IncomePreference2Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public InvestmentPlan14 setIncomePreference(IncomePreference2Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<InitialAmount1Choice> getInitialAmount() {
		return initialAmount == null ? Optional.empty() : Optional.of(initialAmount);
	}

	public InvestmentPlan14 setInitialAmount(InitialAmount1Choice initialAmount) {
		this.initialAmount = initialAmount;
		return this;
	}

	public Optional<Number> getTotalNumberOfInstalments() {
		return totalNumberOfInstalments == null ? Optional.empty() : Optional.of(totalNumberOfInstalments);
	}

	public InvestmentPlan14 setTotalNumberOfInstalments(Number totalNumberOfInstalments) {
		this.totalNumberOfInstalments = totalNumberOfInstalments;
		return this;
	}

	public Optional<RoundingDirection1Code> getRoundingDirection() {
		return roundingDirection == null ? Optional.empty() : Optional.of(roundingDirection);
	}

	public InvestmentPlan14 setRoundingDirection(RoundingDirection1Code roundingDirection) {
		this.roundingDirection = roundingDirection;
		return this;
	}

	public List<Repartition5> getSecurityDetails() {
		return securityDetails == null ? securityDetails = new ArrayList<>() : securityDetails;
	}

	public InvestmentPlan14 setSecurityDetails(List<Repartition5> securityDetails) {
		this.securityDetails = Objects.requireNonNull(securityDetails);
		return this;
	}

	public List<CashSettlement1> getCashSettlement() {
		return cashSettlement == null ? cashSettlement = new ArrayList<>() : cashSettlement;
	}

	public InvestmentPlan14 setCashSettlement(List<CashSettlement1> cashSettlement) {
		this.cashSettlement = Objects.requireNonNull(cashSettlement);
		return this;
	}

	public Optional<Max35Text> getContractReference() {
		return contractReference == null ? Optional.empty() : Optional.of(contractReference);
	}

	public InvestmentPlan14 setContractReference(Max35Text contractReference) {
		this.contractReference = contractReference;
		return this;
	}

	public Optional<Max35Text> getRelatedContractReference() {
		return relatedContractReference == null ? Optional.empty() : Optional.of(relatedContractReference);
	}

	public InvestmentPlan14 setRelatedContractReference(Max35Text relatedContractReference) {
		this.relatedContractReference = relatedContractReference;
		return this;
	}

	public Optional<Max35Text> getProductIdentification() {
		return productIdentification == null ? Optional.empty() : Optional.of(productIdentification);
	}

	public InvestmentPlan14 setProductIdentification(Max35Text productIdentification) {
		this.productIdentification = productIdentification;
		return this;
	}

	public Optional<Max35Text> getSLAChargeAndCommissionReference() {
		return sLAChargeAndCommissionReference == null ? Optional.empty() : Optional.of(sLAChargeAndCommissionReference);
	}

	public InvestmentPlan14 setSLAChargeAndCommissionReference(Max35Text sLAChargeAndCommissionReference) {
		this.sLAChargeAndCommissionReference = sLAChargeAndCommissionReference;
		return this;
	}

	public Optional<InsuranceType2Choice> getInsuranceCover() {
		return insuranceCover == null ? Optional.empty() : Optional.of(insuranceCover);
	}

	public InvestmentPlan14 setInsuranceCover(InsuranceType2Choice insuranceCover) {
		this.insuranceCover = insuranceCover;
		return this;
	}

	public Optional<PlanStatus2Choice> getPlanStatus() {
		return planStatus == null ? Optional.empty() : Optional.of(planStatus);
	}

	public InvestmentPlan14 setPlanStatus(PlanStatus2Choice planStatus) {
		this.planStatus = planStatus;
		return this;
	}

	public Optional<PartyRole4Choice> getInstalmentManagerRole() {
		return instalmentManagerRole == null ? Optional.empty() : Optional.of(instalmentManagerRole);
	}

	public InvestmentPlan14 setInstalmentManagerRole(PartyRole4Choice instalmentManagerRole) {
		this.instalmentManagerRole = instalmentManagerRole;
		return this;
	}
}