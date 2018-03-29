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
import com.tools20022.repository.choice.Frequency20Choice;
import com.tools20022.repository.choice.InsuranceType1Choice;
import com.tools20022.repository.choice.UnitsOrAmount1Choice;
import com.tools20022.repository.codeset.IncomePreference1Code;
import com.tools20022.repository.codeset.RoundingDirection1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8;
import com.tools20022.repository.msg.Repartition2;
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
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmFrequency
 * InvestmentPlan8.mmFrequency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmStartDate
 * InvestmentPlan8.mmStartDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmEndDate
 * InvestmentPlan8.mmEndDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmQuantity
 * InvestmentPlan8.mmQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmGrossAmountIndicator
 * InvestmentPlan8.mmGrossAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmIncomePreference
 * InvestmentPlan8.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmInitialNumberOfInstalments
 * InvestmentPlan8.mmInitialNumberOfInstalments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmTotalNumberOfInstalments
 * InvestmentPlan8.mmTotalNumberOfInstalments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmRoundingDirection
 * InvestmentPlan8.mmRoundingDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmSecurityDetails
 * InvestmentPlan8.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmModifiedCashSettlement
 * InvestmentPlan8.mmModifiedCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmContractReference
 * InvestmentPlan8.mmContractReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmRelatedContractReference
 * InvestmentPlan8.mmRelatedContractReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmProductIdentification
 * InvestmentPlan8.mmProductIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmSLAChargeAndCommissionReference
 * InvestmentPlan8.mmSLAChargeAndCommissionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8#mmInsuranceCover
 * InvestmentPlan8.mmInsuranceCover}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentPlan
 * InvestmentPlan}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAmountRule#forInvestmentPlan8
 * ConstraintAmountRule.forInvestmentPlan8}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentPlan8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan11
 * InvestmentPlan11}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.InvestmentPlan7
 * InvestmentPlan7}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentPlan8", propOrder = {"frequency", "startDate", "endDate", "quantity", "grossAmountIndicator", "incomePreference", "initialNumberOfInstalments", "totalNumberOfInstalments", "roundingDirection", "securityDetails",
		"modifiedCashSettlement", "contractReference", "relatedContractReference", "productIdentification", "sLAChargeAndCommissionReference", "insuranceCover"})
public class InvestmentPlan8 {

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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmFrequency
	 * InvestmentPlan11.mmFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmFrequency
	 * InvestmentPlan7.mmFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, Frequency20Choice> mmFrequency = new MMMessageAttribute<InvestmentPlan8, Frequency20Choice>() {
		{
			businessElementTrace_lazy = () -> InvestmentPlan.mmFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "Frqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Frequency";
			definition = "Frequency of the investment or divestment.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmFrequency);
			previousVersion_lazy = () -> InvestmentPlan7.mmFrequency;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Frequency20Choice.mmObject();
		}

		@Override
		public Frequency20Choice getValue(InvestmentPlan8 obj) {
			return obj.getFrequency();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, Frequency20Choice value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmStartDate
	 * InvestmentPlan11.mmStartDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmStartDate
	 * InvestmentPlan7.mmStartDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, Optional<ISODate>> mmStartDate = new MMMessageAttribute<InvestmentPlan8, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "StartDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StartDate";
			definition = "Date the investment plan starts.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmStartDate);
			previousVersion_lazy = () -> InvestmentPlan7.mmStartDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(InvestmentPlan8 obj) {
			return obj.getStartDate();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmEndDate
	 * InvestmentPlan11.mmEndDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmEndDate
	 * InvestmentPlan7.mmEndDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, Optional<ISODate>> mmEndDate = new MMMessageAttribute<InvestmentPlan8, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "EndDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndDate";
			definition = "Date the investment plan stops.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmEndDate);
			previousVersion_lazy = () -> InvestmentPlan7.mmEndDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(InvestmentPlan8 obj) {
			return obj.getEndDate();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, Optional<ISODate> value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmQuantity
	 * InvestmentPlan11.mmQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmQuantity
	 * InvestmentPlan7.mmQuantity}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, UnitsOrAmount1Choice> mmQuantity = new MMMessageAttribute<InvestmentPlan8, UnitsOrAmount1Choice>() {
		{
			businessComponentTrace_lazy = () -> InvestmentPlan.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "Qty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quantity";
			definition = "Amount of the periodical payments.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmQuantity);
			previousVersion_lazy = () -> InvestmentPlan7.mmQuantity;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitsOrAmount1Choice.mmObject();
		}

		@Override
		public UnitsOrAmount1Choice getValue(InvestmentPlan8 obj) {
			return obj.getQuantity();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, UnitsOrAmount1Choice value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmGrossAmountIndicator
	 * InvestmentPlan11.mmGrossAmountIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmGrossAmountIndicator
	 * InvestmentPlan7.mmGrossAmountIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, Optional<YesNoIndicator>> mmGrossAmountIndicator = new MMMessageAttribute<InvestmentPlan8, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmGrossAmountIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "GrssAmtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmountIndicator";
			definition = "Indicates whether an ordered amount is a gross amount (including all charges, commissions, tax). If it is not a gross amount, the ordered amount is a net amount (amount to be invested or redeemed from the fund to which other elements will be added).";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmGrossAmountIndicator);
			previousVersion_lazy = () -> InvestmentPlan7.mmGrossAmountIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvestmentPlan8 obj) {
			return obj.getGrossAmountIndicator();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, Optional<YesNoIndicator> value) {
			obj.setGrossAmountIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "IncmPref")
	protected IncomePreference1Code incomePreference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference1Code
	 * IncomePreference1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmIncomePreference
	 * InvestmentPlan11.mmIncomePreference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmIncomePreference
	 * InvestmentPlan7.mmIncomePreference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, Optional<IncomePreference1Code>> mmIncomePreference = new MMMessageAttribute<InvestmentPlan8, Optional<IncomePreference1Code>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmIncomePreference);
			previousVersion_lazy = () -> InvestmentPlan7.mmIncomePreference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}

		@Override
		public Optional<IncomePreference1Code> getValue(InvestmentPlan8 obj) {
			return obj.getIncomePreference();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, Optional<IncomePreference1Code> value) {
			obj.setIncomePreference(value.orElse(null));
		}
	};
	@XmlElement(name = "InitlNbOfInstlmts")
	protected Number initialNumberOfInstalments;
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
	 * {@linkplain com.tools20022.repository.entity.Instalment#mmInitialNumberOfInstalment
	 * Instalment.mmInitialNumberOfInstalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlNbOfInstlmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialNumberOfInstalments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of pre-paid instalment periods at the time the investment plan is created."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmInitialNumberOfInstalments
	 * InvestmentPlan11.mmInitialNumberOfInstalments}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmInitialNumberOfInstalment
	 * InvestmentPlan7.mmInitialNumberOfInstalment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, Optional<Number>> mmInitialNumberOfInstalments = new MMMessageAttribute<InvestmentPlan8, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Instalment.mmInitialNumberOfInstalment;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "InitlNbOfInstlmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialNumberOfInstalments";
			definition = "Number of pre-paid instalment periods at the time the investment plan is created.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmInitialNumberOfInstalments);
			previousVersion_lazy = () -> InvestmentPlan7.mmInitialNumberOfInstalment;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(InvestmentPlan8 obj) {
			return obj.getInitialNumberOfInstalments();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, Optional<Number> value) {
			obj.setInitialNumberOfInstalments(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmTotalNumberOfInstalments
	 * InvestmentPlan11.mmTotalNumberOfInstalments}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmTotalNumberOfInstalment
	 * InvestmentPlan7.mmTotalNumberOfInstalment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, Optional<Number>> mmTotalNumberOfInstalments = new MMMessageAttribute<InvestmentPlan8, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Instalment.mmTotalNumberOfInstalment;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "TtlNbOfInstlmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalNumberOfInstalments";
			definition = "Total number of times the amount must be invested at the predefined frequency as of the start date of the investment plan.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmTotalNumberOfInstalments);
			previousVersion_lazy = () -> InvestmentPlan7.mmTotalNumberOfInstalment;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(InvestmentPlan8 obj) {
			return obj.getTotalNumberOfInstalments();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, Optional<Number> value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmRoundingDirection
	 * InvestmentPlan11.mmRoundingDirection}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmRoundingDirection
	 * InvestmentPlan7.mmRoundingDirection}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, Optional<RoundingDirection1Code>> mmRoundingDirection = new MMMessageAttribute<InvestmentPlan8, Optional<RoundingDirection1Code>>() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "RndgDrctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingDirection";
			definition = "Indicates the rounding direction when an amount is to be spread over several funds.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmRoundingDirection);
			previousVersion_lazy = () -> InvestmentPlan7.mmRoundingDirection;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection1Code.mmObject();
		}

		@Override
		public Optional<RoundingDirection1Code> getValue(InvestmentPlan8 obj) {
			return obj.getRoundingDirection();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, Optional<RoundingDirection1Code> value) {
			obj.setRoundingDirection(value.orElse(null));
		}
	};
	@XmlElement(name = "SctyDtls", required = true)
	protected List<Repartition2> securityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Repartition2
	 * Repartition2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmSecurityDetails
	 * InvestmentPlan11.mmSecurityDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmSecurityDetails
	 * InvestmentPlan7.mmSecurityDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentPlan8, List<Repartition2>> mmSecurityDetails = new MMMessageAssociationEnd<InvestmentPlan8, List<Repartition2>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "SctyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			definition = "Security that an investment plan invests in, or from which the investment plan divests.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmSecurityDetails);
			previousVersion_lazy = () -> InvestmentPlan7.mmSecurityDetails;
			maxOccurs = 50;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Repartition2.mmObject();
		}

		@Override
		public List<Repartition2> getValue(InvestmentPlan8 obj) {
			return obj.getSecurityDetails();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, List<Repartition2> value) {
			obj.setSecurityDetails(value);
		}
	};
	@XmlElement(name = "ModfdCshSttlm")
	protected List<InvestmentFundCashSettlementInformation8> modifiedCashSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8
	 * InvestmentFundCashSettlementInformation8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmModifiedCashSettlement
	 * InvestmentPlan11.mmModifiedCashSettlement}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmModifiedCashSettlement
	 * InvestmentPlan7.mmModifiedCashSettlement}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentPlan8, List<InvestmentFundCashSettlementInformation8>> mmModifiedCashSettlement = new MMMessageAssociationEnd<InvestmentPlan8, List<InvestmentFundCashSettlementInformation8>>() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentOffset;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "ModfdCshSttlm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedCashSettlement";
			definition = "Cash settlement standing instruction associated to the investment plan and to be either inserted or deleted.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmModifiedCashSettlement);
			previousVersion_lazy = () -> InvestmentPlan7.mmModifiedCashSettlement;
			maxOccurs = 8;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentFundCashSettlementInformation8.mmObject();
		}

		@Override
		public List<InvestmentFundCashSettlementInformation8> getValue(InvestmentPlan8 obj) {
			return obj.getModifiedCashSettlement();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, List<InvestmentFundCashSettlementInformation8> value) {
			obj.setModifiedCashSettlement(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmContractReference
	 * InvestmentPlan11.mmContractReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmContractReference
	 * InvestmentPlan7.mmContractReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, Optional<Max35Text>> mmContractReference = new MMMessageAttribute<InvestmentPlan8, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "CtrctRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractReference";
			definition = "Reference of the underlying investment contract. In some markets, such as Italy, this might be required to segregate holdings between the same investment account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmContractReference);
			previousVersion_lazy = () -> InvestmentPlan7.mmContractReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentPlan8 obj) {
			return obj.getContractReference();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmRelatedContractReference
	 * InvestmentPlan11.mmRelatedContractReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmRelatedContractReference
	 * InvestmentPlan7.mmRelatedContractReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, Optional<Max35Text>> mmRelatedContractReference = new MMMessageAttribute<InvestmentPlan8, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "RltdCtrctRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedContractReference";
			definition = "Reference of the previous contract to which this savings or withdrawal plan is related.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmRelatedContractReference);
			previousVersion_lazy = () -> InvestmentPlan7.mmRelatedContractReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentPlan8 obj) {
			return obj.getRelatedContractReference();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmProductIdentification
	 * InvestmentPlan11.mmProductIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmProductIdentification
	 * InvestmentPlan7.mmProductIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, Optional<Max35Text>> mmProductIdentification = new MMMessageAttribute<InvestmentPlan8, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "PdctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductIdentification";
			definition = "Identification of the product as designated by the fund manager. In some markets, such as Italy, the financial product or service related to a savings plan or withdrawal plan are identified by a product identification or number.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmProductIdentification);
			previousVersion_lazy = () -> InvestmentPlan7.mmProductIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentPlan8 obj) {
			return obj.getProductIdentification();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, Optional<Max35Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmSLAChargeAndCommissionReference
	 * InvestmentPlan11.mmSLAChargeAndCommissionReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmSLAChargeAndCommissionReference
	 * InvestmentPlan7.mmSLAChargeAndCommissionReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, Optional<Max35Text>> mmSLAChargeAndCommissionReference = new MMMessageAttribute<InvestmentPlan8, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "SLAChrgAndComssnRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SLAChargeAndCommissionReference";
			definition = "Reference of the underlying service level agreement (SLA) governing charges and commission.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmSLAChargeAndCommissionReference);
			previousVersion_lazy = () -> InvestmentPlan7.mmSLAChargeAndCommissionReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentPlan8 obj) {
			return obj.getSLAChargeAndCommissionReference();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, Optional<Max35Text> value) {
			obj.setSLAChargeAndCommissionReference(value.orElse(null));
		}
	};
	@XmlElement(name = "InsrncCover")
	protected InsuranceType1Choice insuranceCover;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InsuranceType1Choice
	 * InsuranceType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan8
	 * InvestmentPlan8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan11#mmInsuranceCover
	 * InvestmentPlan11.mmInsuranceCover}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentPlan7#mmInsuranceCover
	 * InvestmentPlan7.mmInsuranceCover}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentPlan8, Optional<InsuranceType1Choice>> mmInsuranceCover = new MMMessageAttribute<InvestmentPlan8, Optional<InsuranceType1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "InsrncCover";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsuranceCover";
			definition = "Specifies the type of insurance contract to which the savings investment plan is linked.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmInsuranceCover);
			previousVersion_lazy = () -> InvestmentPlan7.mmInsuranceCover;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InsuranceType1Choice.mmObject();
		}

		@Override
		public Optional<InsuranceType1Choice> getValue(InvestmentPlan8 obj) {
			return obj.getInsuranceCover();
		}

		@Override
		public void setValue(InvestmentPlan8 obj, Optional<InsuranceType1Choice> value) {
			obj.setInsuranceCover(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentPlan8.mmFrequency, com.tools20022.repository.msg.InvestmentPlan8.mmStartDate, com.tools20022.repository.msg.InvestmentPlan8.mmEndDate,
						com.tools20022.repository.msg.InvestmentPlan8.mmQuantity, com.tools20022.repository.msg.InvestmentPlan8.mmGrossAmountIndicator, com.tools20022.repository.msg.InvestmentPlan8.mmIncomePreference,
						com.tools20022.repository.msg.InvestmentPlan8.mmInitialNumberOfInstalments, com.tools20022.repository.msg.InvestmentPlan8.mmTotalNumberOfInstalments,
						com.tools20022.repository.msg.InvestmentPlan8.mmRoundingDirection, com.tools20022.repository.msg.InvestmentPlan8.mmSecurityDetails, com.tools20022.repository.msg.InvestmentPlan8.mmModifiedCashSettlement,
						com.tools20022.repository.msg.InvestmentPlan8.mmContractReference, com.tools20022.repository.msg.InvestmentPlan8.mmRelatedContractReference, com.tools20022.repository.msg.InvestmentPlan8.mmProductIdentification,
						com.tools20022.repository.msg.InvestmentPlan8.mmSLAChargeAndCommissionReference, com.tools20022.repository.msg.InvestmentPlan8.mmInsuranceCover);
				trace_lazy = () -> InvestmentPlan.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAmountRule.forInvestmentPlan8);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentPlan8";
				definition = "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmObject());
				previousVersion_lazy = () -> InvestmentPlan7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Frequency20Choice getFrequency() {
		return frequency;
	}

	public InvestmentPlan8 setFrequency(Frequency20Choice frequency) {
		this.frequency = Objects.requireNonNull(frequency);
		return this;
	}

	public Optional<ISODate> getStartDate() {
		return startDate == null ? Optional.empty() : Optional.of(startDate);
	}

	public InvestmentPlan8 setStartDate(ISODate startDate) {
		this.startDate = startDate;
		return this;
	}

	public Optional<ISODate> getEndDate() {
		return endDate == null ? Optional.empty() : Optional.of(endDate);
	}

	public InvestmentPlan8 setEndDate(ISODate endDate) {
		this.endDate = endDate;
		return this;
	}

	public UnitsOrAmount1Choice getQuantity() {
		return quantity;
	}

	public InvestmentPlan8 setQuantity(UnitsOrAmount1Choice quantity) {
		this.quantity = Objects.requireNonNull(quantity);
		return this;
	}

	public Optional<YesNoIndicator> getGrossAmountIndicator() {
		return grossAmountIndicator == null ? Optional.empty() : Optional.of(grossAmountIndicator);
	}

	public InvestmentPlan8 setGrossAmountIndicator(YesNoIndicator grossAmountIndicator) {
		this.grossAmountIndicator = grossAmountIndicator;
		return this;
	}

	public Optional<IncomePreference1Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public InvestmentPlan8 setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<Number> getInitialNumberOfInstalments() {
		return initialNumberOfInstalments == null ? Optional.empty() : Optional.of(initialNumberOfInstalments);
	}

	public InvestmentPlan8 setInitialNumberOfInstalments(Number initialNumberOfInstalments) {
		this.initialNumberOfInstalments = initialNumberOfInstalments;
		return this;
	}

	public Optional<Number> getTotalNumberOfInstalments() {
		return totalNumberOfInstalments == null ? Optional.empty() : Optional.of(totalNumberOfInstalments);
	}

	public InvestmentPlan8 setTotalNumberOfInstalments(Number totalNumberOfInstalments) {
		this.totalNumberOfInstalments = totalNumberOfInstalments;
		return this;
	}

	public Optional<RoundingDirection1Code> getRoundingDirection() {
		return roundingDirection == null ? Optional.empty() : Optional.of(roundingDirection);
	}

	public InvestmentPlan8 setRoundingDirection(RoundingDirection1Code roundingDirection) {
		this.roundingDirection = roundingDirection;
		return this;
	}

	public List<Repartition2> getSecurityDetails() {
		return securityDetails == null ? securityDetails = new ArrayList<>() : securityDetails;
	}

	public InvestmentPlan8 setSecurityDetails(List<Repartition2> securityDetails) {
		this.securityDetails = Objects.requireNonNull(securityDetails);
		return this;
	}

	public List<InvestmentFundCashSettlementInformation8> getModifiedCashSettlement() {
		return modifiedCashSettlement == null ? modifiedCashSettlement = new ArrayList<>() : modifiedCashSettlement;
	}

	public InvestmentPlan8 setModifiedCashSettlement(List<InvestmentFundCashSettlementInformation8> modifiedCashSettlement) {
		this.modifiedCashSettlement = Objects.requireNonNull(modifiedCashSettlement);
		return this;
	}

	public Optional<Max35Text> getContractReference() {
		return contractReference == null ? Optional.empty() : Optional.of(contractReference);
	}

	public InvestmentPlan8 setContractReference(Max35Text contractReference) {
		this.contractReference = contractReference;
		return this;
	}

	public Optional<Max35Text> getRelatedContractReference() {
		return relatedContractReference == null ? Optional.empty() : Optional.of(relatedContractReference);
	}

	public InvestmentPlan8 setRelatedContractReference(Max35Text relatedContractReference) {
		this.relatedContractReference = relatedContractReference;
		return this;
	}

	public Optional<Max35Text> getProductIdentification() {
		return productIdentification == null ? Optional.empty() : Optional.of(productIdentification);
	}

	public InvestmentPlan8 setProductIdentification(Max35Text productIdentification) {
		this.productIdentification = productIdentification;
		return this;
	}

	public Optional<Max35Text> getSLAChargeAndCommissionReference() {
		return sLAChargeAndCommissionReference == null ? Optional.empty() : Optional.of(sLAChargeAndCommissionReference);
	}

	public InvestmentPlan8 setSLAChargeAndCommissionReference(Max35Text sLAChargeAndCommissionReference) {
		this.sLAChargeAndCommissionReference = sLAChargeAndCommissionReference;
		return this;
	}

	public Optional<InsuranceType1Choice> getInsuranceCover() {
		return insuranceCover == null ? Optional.empty() : Optional.of(insuranceCover);
	}

	public InvestmentPlan8 setInsuranceCover(InsuranceType1Choice insuranceCover) {
		this.insuranceCover = insuranceCover;
		return this;
	}
}