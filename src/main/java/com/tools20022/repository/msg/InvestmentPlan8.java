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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "InvestmentPlan8", propOrder = {"frequency", "startDate", "endDate", "quantity", "grossAmountIndicator", "incomePreference", "initialNumberOfInstalments", "totalNumberOfInstalments", "roundingDirection", "securityDetails",
		"modifiedCashSettlement", "contractReference", "relatedContractReference", "productIdentification", "SLAChargeAndCommissionReference", "insuranceCover"})
public class InvestmentPlan8 {

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
	public static final MMMessageAttribute mmFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentPlan.mmFrequency;
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
	public static final MMMessageAttribute mmStartDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmFromDateTime;
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
	public static final MMMessageAttribute mmEndDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmToDateTime;
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
	public static final MMMessageAttribute mmQuantity = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentPlan.mmObject();
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
	};
	protected YesNoIndicator grossAmountIndicator;
	/**
	 * Indicates whether an ordered amount is a gross amount (including all
	 * charges, commissions, tax). If it is not a gross amount, the ordered
	 * amount is a net amount (amount to be invested or redeemed from the fund
	 * to which other elements will be added).
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
	public static final MMMessageAttribute mmGrossAmountIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmGrossAmountIndicator;
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
	};
	protected IncomePreference1Code incomePreference;
	/**
	 * Dividend option chosen by the account owner based on the options offered
	 * in the prospectus.
	 * <p>
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
	public static final MMMessageAttribute mmIncomePreference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
	};
	protected Number initialNumberOfInstalments;
	/**
	 * Number of pre-paid instalment periods at the time the investment plan is
	 * created.
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
	public static final MMMessageAttribute mmInitialNumberOfInstalments = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Instalment.mmInitialNumberOfInstalment;
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
	public static final MMMessageAttribute mmTotalNumberOfInstalments = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Instalment.mmTotalNumberOfInstalment;
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
	public static final MMMessageAttribute mmRoundingDirection = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
	};
	protected List<com.tools20022.repository.msg.Repartition2> securityDetails;
	/**
	 * Security that an investment plan invests in, or from which the investment
	 * plan divests.
	 * <p>
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
	public static final MMMessageAssociationEnd mmSecurityDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
			type_lazy = () -> com.tools20022.repository.msg.Repartition2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8> modifiedCashSettlement;
	/**
	 * Cash settlement standing instruction associated to the investment plan
	 * and to be either inserted or deleted.
	 * <p>
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
	public static final MMMessageAssociationEnd mmModifiedCashSettlement = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentOffset;
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
			type_lazy = () -> com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8.mmObject();
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
	 * "Reference of the underlying investment contract. In some markets, such as Italy, this might be required to segregate holdings between the same investment account. "
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
	public static final MMMessageAttribute mmContractReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
			isDerived = false;
			xmlTag = "CtrctRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractReference";
			definition = "Reference of the underlying investment contract. In some markets, such as Italy, this might be required to segregate holdings between the same investment account. ";
			nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmContractReference);
			previousVersion_lazy = () -> InvestmentPlan7.mmContractReference;
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
	public static final MMMessageAttribute mmRelatedContractReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
	public static final MMMessageAttribute mmProductIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
	};
	protected Max35Text sLAChargeAndCommissionReference;
	/**
	 * Reference of the underlying service level agreement (SLA) governing
	 * charges and commission.
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
	public static final MMMessageAttribute mmSLAChargeAndCommissionReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
	};
	protected InsuranceType1Choice insuranceCover;
	/**
	 * Specifies the type of insurance contract to which the savings investment
	 * plan is linked.
	 * <p>
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
	public static final MMMessageAttribute mmInsuranceCover = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentPlan8.mmObject();
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
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InvestmentPlan8.mmFrequency, InvestmentPlan8.mmStartDate, InvestmentPlan8.mmEndDate, InvestmentPlan8.mmQuantity, InvestmentPlan8.mmGrossAmountIndicator,
						InvestmentPlan8.mmIncomePreference, InvestmentPlan8.mmInitialNumberOfInstalments, InvestmentPlan8.mmTotalNumberOfInstalments, InvestmentPlan8.mmRoundingDirection, InvestmentPlan8.mmSecurityDetails,
						InvestmentPlan8.mmModifiedCashSettlement, InvestmentPlan8.mmContractReference, InvestmentPlan8.mmRelatedContractReference, InvestmentPlan8.mmProductIdentification, InvestmentPlan8.mmSLAChargeAndCommissionReference,
						InvestmentPlan8.mmInsuranceCover);
				trace_lazy = () -> InvestmentPlan.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentPlan8";
				definition = "Plan that allows investors to schedule periodical investments or divestments, according to pre-defined criteria.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentPlan11.mmObject());
				previousVersion_lazy = () -> InvestmentPlan7.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Frqcy", required = true)
	public Frequency20Choice getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency20Choice frequency) {
		this.frequency = frequency;
	}

	@XmlElement(name = "StartDt")
	public ISODate getStartDate() {
		return startDate;
	}

	public void setStartDate(ISODate startDate) {
		this.startDate = startDate;
	}

	@XmlElement(name = "EndDt")
	public ISODate getEndDate() {
		return endDate;
	}

	public void setEndDate(ISODate endDate) {
		this.endDate = endDate;
	}

	@XmlElement(name = "Qty", required = true)
	public UnitsOrAmount1Choice getQuantity() {
		return quantity;
	}

	public void setQuantity(UnitsOrAmount1Choice quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name = "GrssAmtInd")
	public YesNoIndicator getGrossAmountIndicator() {
		return grossAmountIndicator;
	}

	public void setGrossAmountIndicator(YesNoIndicator grossAmountIndicator) {
		this.grossAmountIndicator = grossAmountIndicator;
	}

	@XmlElement(name = "IncmPref")
	public IncomePreference1Code getIncomePreference() {
		return incomePreference;
	}

	public void setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
	}

	@XmlElement(name = "InitlNbOfInstlmts")
	public Number getInitialNumberOfInstalments() {
		return initialNumberOfInstalments;
	}

	public void setInitialNumberOfInstalments(Number initialNumberOfInstalments) {
		this.initialNumberOfInstalments = initialNumberOfInstalments;
	}

	@XmlElement(name = "TtlNbOfInstlmts")
	public Number getTotalNumberOfInstalments() {
		return totalNumberOfInstalments;
	}

	public void setTotalNumberOfInstalments(Number totalNumberOfInstalments) {
		this.totalNumberOfInstalments = totalNumberOfInstalments;
	}

	@XmlElement(name = "RndgDrctn")
	public RoundingDirection1Code getRoundingDirection() {
		return roundingDirection;
	}

	public void setRoundingDirection(RoundingDirection1Code roundingDirection) {
		this.roundingDirection = roundingDirection;
	}

	@XmlElement(name = "SctyDtls", required = true)
	public List<Repartition2> getSecurityDetails() {
		return securityDetails;
	}

	public void setSecurityDetails(List<com.tools20022.repository.msg.Repartition2> securityDetails) {
		this.securityDetails = securityDetails;
	}

	@XmlElement(name = "ModfdCshSttlm")
	public List<InvestmentFundCashSettlementInformation8> getModifiedCashSettlement() {
		return modifiedCashSettlement;
	}

	public void setModifiedCashSettlement(List<com.tools20022.repository.msg.InvestmentFundCashSettlementInformation8> modifiedCashSettlement) {
		this.modifiedCashSettlement = modifiedCashSettlement;
	}

	@XmlElement(name = "CtrctRef")
	public Max35Text getContractReference() {
		return contractReference;
	}

	public void setContractReference(Max35Text contractReference) {
		this.contractReference = contractReference;
	}

	@XmlElement(name = "RltdCtrctRef")
	public Max35Text getRelatedContractReference() {
		return relatedContractReference;
	}

	public void setRelatedContractReference(Max35Text relatedContractReference) {
		this.relatedContractReference = relatedContractReference;
	}

	@XmlElement(name = "PdctId")
	public Max35Text getProductIdentification() {
		return productIdentification;
	}

	public void setProductIdentification(Max35Text productIdentification) {
		this.productIdentification = productIdentification;
	}

	@XmlElement(name = "SLAChrgAndComssnRef")
	public Max35Text getSLAChargeAndCommissionReference() {
		return sLAChargeAndCommissionReference;
	}

	public void setSLAChargeAndCommissionReference(Max35Text sLAChargeAndCommissionReference) {
		this.sLAChargeAndCommissionReference = sLAChargeAndCommissionReference;
	}

	@XmlElement(name = "InsrncCover")
	public InsuranceType1Choice getInsuranceCover() {
		return insuranceCover;
	}

	public void setInsuranceCover(InsuranceType1Choice insuranceCover) {
		this.insuranceCover = insuranceCover;
	}
}