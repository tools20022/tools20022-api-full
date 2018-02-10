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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max350Text;
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
 * Information about a securities account and its characteristics.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmIdentification
 * InvestmentAccount50.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmStatus
 * InvestmentAccount50.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmStatusDate
 * InvestmentAccount50.mmStatusDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmName
 * InvestmentAccount50.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmDesignation
 * InvestmentAccount50.mmDesignation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmType
 * InvestmentAccount50.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmOwnershipType
 * InvestmentAccount50.mmOwnershipType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmTaxExemption
 * InvestmentAccount50.mmTaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmStatementFrequency
 * InvestmentAccount50.mmStatementFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmReferenceCurrency
 * InvestmentAccount50.mmReferenceCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmLanguage
 * InvestmentAccount50.mmLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmIncomePreference
 * InvestmentAccount50.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmReinvestmentDetails
 * InvestmentAccount50.mmReinvestmentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmTaxWithholdingMethod
 * InvestmentAccount50.mmTaxWithholdingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmTaxReporting
 * InvestmentAccount50.mmTaxReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmLetterIntentDetails
 * InvestmentAccount50.mmLetterIntentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmAccumulationRightReference
 * InvestmentAccount50.mmAccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmRequiredSignatoriesNumber
 * InvestmentAccount50.mmRequiredSignatoriesNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmFundFamilyName
 * InvestmentAccount50.mmFundFamilyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmFinancialInstrumentDetails
 * InvestmentAccount50.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmRoundingDetails
 * InvestmentAccount50.mmRoundingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmAccountServicer
 * InvestmentAccount50.mmAccountServicer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmBlockedStatus
 * InvestmentAccount50.mmBlockedStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmAccountUsageType
 * InvestmentAccount50.mmAccountUsageType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmForeignStatusCertification
 * InvestmentAccount50.mmForeignStatusCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmAccountSignatureDateTime
 * InvestmentAccount50.mmAccountSignatureDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmTransactionChannelType
 * InvestmentAccount50.mmTransactionChannelType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmInvestmentAccountCategory
 * InvestmentAccount50.mmInvestmentAccountCategory}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmPledging
 * InvestmentAccount50.mmPledging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmCollateral
 * InvestmentAccount50.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmThirdPartyRights
 * InvestmentAccount50.mmThirdPartyRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmPowerOfAttorneyLevelOfControl
 * InvestmentAccount50.mmPowerOfAttorneyLevelOfControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmAccountingStatus
 * InvestmentAccount50.mmAccountingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmOpeningDate
 * InvestmentAccount50.mmOpeningDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmClosingDate
 * InvestmentAccount50.mmClosingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmNegativeIndicator
 * InvestmentAccount50.mmNegativeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmProcessingOrder
 * InvestmentAccount50.mmProcessingOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmLiability
 * InvestmentAccount50.mmLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmInvestorProfile
 * InvestmentAccount50.mmInvestorProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#mmFiscalYear
 * InvestmentAccount50.mmFiscalYear}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmInvestmentAccount
 * AccountDetailsConfirmationV06.mmInvestmentAccount}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount50
 * ConstraintFundDetailsGuideline.forInvestmentAccount50}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIncomePreferenceReinvestment1Rule#forInvestmentAccount50
 * ConstraintIncomePreferenceReinvestment1Rule.forInvestmentAccount50}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule#forInvestmentAccount50
 * ConstraintReinvestmentPercentage1Rule.forInvestmentAccount50}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccount50"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information about a securities account and its characteristics."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount62
 * InvestmentAccount62}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46
 * InvestmentAccount46}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccount50", propOrder = {"identification", "status", "statusDate", "name", "designation", "type", "ownershipType", "taxExemption", "statementFrequency", "referenceCurrency", "language", "incomePreference",
		"reinvestmentDetails", "taxWithholdingMethod", "taxReporting", "letterIntentDetails", "accumulationRightReference", "requiredSignatoriesNumber", "fundFamilyName", "financialInstrumentDetails", "roundingDetails", "accountServicer",
		"blockedStatus", "accountUsageType", "foreignStatusCertification", "accountSignatureDateTime", "transactionChannelType", "investmentAccountCategory", "pledging", "collateral", "thirdPartyRights", "powerOfAttorneyLevelOfControl",
		"accountingStatus", "openingDate", "closingDate", "negativeIndicator", "processingOrder", "liability", "investorProfile", "fiscalYear"})
public class InvestmentAccount50 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected Max35Text identification;
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
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmIdentification
	 * InvestmentAccount62.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmIdentification
	 * InvestmentAccount46.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmIdentification);
			previousVersion_lazy = () -> InvestmentAccount46.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected AccountStatus1Choice status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountStatus1Choice
	 * AccountStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmStatus
	 * Account.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the account, for example, enabled or deleted."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmAccountStatus
	 * InvestmentAccount62.mmAccountStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the account, for example, enabled or deleted.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmAccountStatus);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountStatus1Choice.mmObject();
		}
	};
	@XmlElement(name = "StsDt")
	protected DateAndDateTime1Choice statusDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime1Choice
	 * DateAndDateTime1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDateTime
	 * Status.mmStatusDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date the status is assigned."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmStatusDate
	 * InvestmentAccount62.mmStatusDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStatusDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "StsDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDate";
			definition = "Date the status is assigned.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmStatusDate);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTime1Choice.mmObject();
		}
	};
	@XmlElement(name = "Nm")
	protected Max35Text name;
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
	 * {@linkplain com.tools20022.repository.entity.AccountIdentification#mmName
	 * AccountIdentification.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmName
	 * InvestmentAccount62.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmName
	 * InvestmentAccount46.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmName);
			previousVersion_lazy = () -> InvestmentAccount46.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Dsgnt")
	protected Max35Text designation;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmDesignation
	 * InvestmentAccount.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dsgnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Designation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmDesignation
	 * InvestmentAccount62.mmDesignation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmDesignation
	 * InvestmentAccount46.mmDesignation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDesignation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmDesignation;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "Dsgnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Designation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmDesignation);
			previousVersion_lazy = () -> InvestmentAccount46.mmDesignation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Tp")
	protected AccountType2Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountType2Choice
	 * AccountType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmType
	 * InvestmentAccount62.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmType
	 * InvestmentAccount46.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmType);
			previousVersion_lazy = () -> InvestmentAccount46.mmType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountType2Choice.mmObject();
		}
	};
	@XmlElement(name = "OwnrshTp", required = true)
	protected OwnershipType2Choice ownershipType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.OwnershipType2Choice
	 * OwnershipType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmOwnershipType
	 * InvestmentAccount.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnrshTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ownership status of the account, for example, joint owners."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmOwnershipType
	 * InvestmentAccount62.mmOwnershipType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmOwnershipType
	 * InvestmentAccount46.mmOwnershipType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnershipType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmOwnershipType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "OwnrshTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnershipType";
			definition = "Ownership status of the account, for example, joint owners.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmOwnershipType);
			previousVersion_lazy = () -> InvestmentAccount46.mmOwnershipType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OwnershipType2Choice.mmObject();
		}
	};
	@XmlElement(name = "TaxXmptn")
	protected TaxExemptionReason2Choice taxExemption;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TaxExemptionReason2Choice
	 * TaxExemptionReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundTax
	 * InvestmentAccount.mmInvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxXmptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax advantage specific to the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmTaxExemption
	 * InvestmentAccount62.mmTaxExemption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmTaxExemption
	 * InvestmentAccount46.mmTaxExemption}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxExemption = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentFundTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "TaxXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemption";
			definition = "Tax advantage specific to the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmTaxExemption);
			previousVersion_lazy = () -> InvestmentAccount46.mmTaxExemption;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxExemptionReason2Choice.mmObject();
		}
	};
	@XmlElement(name = "StmtFrqcy")
	protected StatementFrequencyReason2Choice statementFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.StatementFrequencyReason2Choice
	 * StatementFrequencyReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
	 * ReportingService.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmtFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency at which a statement is issued."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmStatementFrequency
	 * InvestmentAccount62.mmStatementFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmStatementFrequency
	 * InvestmentAccount46.mmStatementFrequency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "StmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementFrequency";
			definition = "Frequency at which a statement is issued.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmStatementFrequency);
			previousVersion_lazy = () -> InvestmentAccount46.mmStatementFrequency;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> StatementFrequencyReason2Choice.mmObject();
		}
	};
	@XmlElement(name = "RefCcy")
	protected ActiveCurrencyCode referenceCurrency;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmReferenceCurrency
	 * InvestmentAccount.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency chosen for reporting purposes by the account owner in agreement with the account servicer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmReferenceCurrency
	 * InvestmentAccount62.mmReferenceCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmReferenceCurrency
	 * InvestmentAccount46.mmReferenceCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmReferenceCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "RefCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceCurrency";
			definition = "Currency chosen for reporting purposes by the account owner in agreement with the account servicer.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmReferenceCurrency);
			previousVersion_lazy = () -> InvestmentAccount46.mmReferenceCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "Lang")
	protected LanguageCode language;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmLanguage
	 * Account.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lang"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language for all communication concerning the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmLanguage
	 * InvestmentAccount62.mmLanguage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmLanguage
	 * InvestmentAccount46.mmLanguage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLanguage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "Lang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Language";
			definition = "Language for all communication concerning the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmLanguage);
			previousVersion_lazy = () -> InvestmentAccount46.mmLanguage;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmIncomePreference
	 * InvestmentAccount62.mmIncomePreference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmIncomePreference
	 * InvestmentAccount46.mmIncomePreference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomePreference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmIncomePreference);
			previousVersion_lazy = () -> InvestmentAccount46.mmIncomePreference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference2Code.mmObject();
		}
	};
	@XmlElement(name = "RinvstmtDtls")
	protected List<com.tools20022.repository.msg.Reinvestment2> reinvestmentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Reinvestment2
	 * Reinvestment2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmReinvestment
	 * InvestmentAccountService.mmReinvestment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RinvstmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies, for income on the fund or security that is to be reinvested, parameters for the reinvestment. If the reinvestment percentage is less than one hundred percent, the remaining percentage will be invested according to the investor’s or account owner's subsequent instructions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmReinvestmentDetails
	 * InvestmentAccount62.mmReinvestmentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmReinvestmentDetails
	 * InvestmentAccount46.mmReinvestmentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReinvestmentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmReinvestment;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "RinvstmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentDetails";
			definition = "Specifies, for income on the fund or security that is to be reinvested, parameters for the reinvestment. If the reinvestment percentage is less than one hundred percent, the remaining percentage will be invested according to the investor’s or account owner's subsequent instructions.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmReinvestmentDetails);
			previousVersion_lazy = () -> InvestmentAccount46.mmReinvestmentDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Reinvestment2.mmObject();
		}
	};
	@XmlElement(name = "TaxWhldgMtd")
	protected TaxWithholdingMethod3Code taxWithholdingMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod3Code
	 * TaxWithholdingMethod3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmTaxWithholdingMethod
	 * InvestmentAccountService.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxWhldgMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxWithholdingMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method by which the tax (withholding tax) is to be processed, that is,  either withheld at source or tax information is reported to tax authorities or tax information is reported due to the provision of a tax certificate."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmTaxWithholdingMethod
	 * InvestmentAccount62.mmTaxWithholdingMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmTaxWithholdingMethod
	 * InvestmentAccount46.mmTaxWithholdingMethod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxWithholdingMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmTaxWithholdingMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "TaxWhldgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxWithholdingMethod";
			definition = "Method by which the tax (withholding tax) is to be processed, that is,  either withheld at source or tax information is reported to tax authorities or tax information is reported due to the provision of a tax certificate.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmTaxWithholdingMethod);
			previousVersion_lazy = () -> InvestmentAccount46.mmTaxWithholdingMethod;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxWithholdingMethod3Code.mmObject();
		}
	};
	@XmlElement(name = "TaxRptg")
	protected List<com.tools20022.repository.msg.TaxReporting1> taxReporting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxReporting1
	 * TaxReporting1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole#mmTax
	 * TaxPartyRole.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details for the reporting of tax, for example, the country of taxation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmTaxReporting
	 * InvestmentAccount62.mmTaxReporting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxReporting = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TaxPartyRole.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "TaxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReporting";
			definition = "Details for the reporting of tax, for example, the country of taxation.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmTaxReporting);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxReporting1.mmObject();
		}
	};
	@XmlElement(name = "LttrInttDtls")
	protected LetterIntent1 letterIntentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.LetterIntent1
	 * LetterIntent1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmLetterIntentReference
	 * InvestmentAccountContract.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrInttDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterIntentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the letter of intent."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmLetterIntentDetails
	 * InvestmentAccount62.mmLetterIntentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmLetterIntentDetails
	 * InvestmentAccount46.mmLetterIntentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLetterIntentDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountContract.mmLetterIntentReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "LttrInttDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterIntentDetails";
			definition = "Details of the letter of intent.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmLetterIntentDetails);
			previousVersion_lazy = () -> InvestmentAccount46.mmLetterIntentDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.LetterIntent1.mmObject();
		}
	};
	@XmlElement(name = "AcmltnRghtRef")
	protected Max35Text accumulationRightReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmAccumulationRightReference
	 * InvestmentAccountContract.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcmltnRghtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulationRightReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of an accumulation rights program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmAccumulationRightReference
	 * InvestmentAccount62.mmAccumulationRightReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmAccumulationRightReference
	 * InvestmentAccount46.mmAccumulationRightReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccumulationRightReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountContract.mmAccumulationRightReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "AcmltnRghtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulationRightReference";
			definition = "Reference of an accumulation rights program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmAccumulationRightReference);
			previousVersion_lazy = () -> InvestmentAccount46.mmAccumulationRightReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ReqrdSgntriesNb")
	protected Number requiredSignatoriesNumber;
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
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmRequiredSignatureNumber
	 * SignatureCondition.mmRequiredSignatureNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqrdSgntriesNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequiredSignatoriesNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of account owners or related parties required to authorise transactions on the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmRequiredSignatoriesNumber
	 * InvestmentAccount62.mmRequiredSignatoriesNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmRequiredSignatoriesNumber
	 * InvestmentAccount46.mmRequiredSignatoriesNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequiredSignatoriesNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmRequiredSignatureNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "ReqrdSgntriesNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredSignatoriesNumber";
			definition = "Number of account owners or related parties required to authorise transactions on the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmRequiredSignatoriesNumber);
			previousVersion_lazy = () -> InvestmentAccount46.mmRequiredSignatoriesNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "FndFmlyNm")
	protected Max350Text fundFamilyName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundFamily#mmFundFamilyName
	 * InvestmentFundFamily.mmFundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndFmlyNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundFamilyName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the investment fund family."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmFundFamilyName
	 * InvestmentAccount62.mmFundFamilyName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmFundFamilyName
	 * InvestmentAccount46.mmFundFamilyName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFundFamilyName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundFamily.mmFundFamilyName;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "FndFmlyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundFamilyName";
			definition = "Name of the investment fund family.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmFundFamilyName);
			previousVersion_lazy = () -> InvestmentAccount46.mmFundFamilyName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmDtls")
	protected List<com.tools20022.repository.msg.FinancialInstrument51> financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
	 * InvestmentAccount.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
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
	 * "Detailed information about the investment fund or security associated to the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmFinancialInstrumentDetails
	 * InvestmentAccount62.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmFundsDetails
	 * InvestmentAccount46.mmFundsDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Detailed information about the investment fund or security associated to the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmFinancialInstrumentDetails);
			previousVersion_lazy = () -> InvestmentAccount46.mmFundsDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument51.mmObject();
		}
	};
	@XmlElement(name = "RndgDtls")
	protected RoundingParameters1 roundingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RoundingParameters1
	 * RoundingParameters1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmRoundingMethod
	 * InvestmentAccountService.mmRoundingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters to be applied on deal amount for orders when the amount is a fractional number."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmRoundingDetails
	 * InvestmentAccount62.mmRoundingDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmRoundingDetails
	 * InvestmentAccount46.mmRoundingDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRoundingDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmRoundingMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "RndgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingDetails";
			definition = "Parameters to be applied on deal amount for orders when the amount is a fractional number.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmRoundingDetails);
			previousVersion_lazy = () -> InvestmentAccount46.mmRoundingDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RoundingParameters1.mmObject();
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected PartyIdentification70Choice accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmAccountServicer
	 * InvestmentAccount62.mmAccountServicer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmAccountServicer
	 * InvestmentAccount46.mmAccountServicer}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountServicer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmAccountServicer);
			previousVersion_lazy = () -> InvestmentAccount46.mmAccountServicer;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification70Choice.mmObject();
		}
	};
	@XmlElement(name = "BlckdSts")
	protected List<com.tools20022.repository.msg.Blocked2> blockedStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Blocked2
	 * Blocked2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmStatus
	 * Account.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the account is blocked and other factors for the blocked account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmBlockedStatus
	 * InvestmentAccount62.mmBlockedStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmBlockedStatus
	 * InvestmentAccount46.mmBlockedStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBlockedStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "BlckdSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedStatus";
			definition = "Specifies the account is blocked and other factors for the blocked account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmBlockedStatus);
			previousVersion_lazy = () -> InvestmentAccount46.mmBlockedStatus;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Blocked2.mmObject();
		}
	};
	@XmlElement(name = "AcctUsgTp")
	protected AccountUsageType2Choice accountUsageType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountUsageType2Choice
	 * AccountUsageType2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount
	 * InvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctUsgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountUsageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of usage of the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmAccountUsageType
	 * InvestmentAccount62.mmAccountUsageType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmAccountUsageType
	 * InvestmentAccount46.mmAccountUsageType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountUsageType = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccount.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "AcctUsgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountUsageType";
			definition = "Specifies the type of usage of the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmAccountUsageType);
			previousVersion_lazy = () -> InvestmentAccount46.mmAccountUsageType;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountUsageType2Choice.mmObject();
		}
	};
	@XmlElement(name = "FrgnStsCertfctn")
	protected Provided1Code foreignStatusCertification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Provided1Code
	 * Provided1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrgnStsCertfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignStatusCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if documentary evidence has been provided for the foreign resident."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmForeignStatusCertification
	 * InvestmentAccount62.mmForeignStatusCertification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmForeignStatusCertification
	 * InvestmentAccount46.mmForeignStatusCertification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForeignStatusCertification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "FrgnStsCertfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignStatusCertification";
			definition = "Specifies if documentary evidence has been provided for the foreign resident.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmForeignStatusCertification);
			previousVersion_lazy = () -> InvestmentAccount46.mmForeignStatusCertification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Provided1Code.mmObject();
		}
	};
	@XmlElement(name = "AcctSgntrDtTm")
	protected DateAndDateTimeChoice accountSignatureDateTime;
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
	 * {@linkplain com.tools20022.repository.entity.Agreement#mmDateSigned
	 * Agreement.mmDateSigned}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSgntrDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountSignatureDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date the investor or account owner signs the open account form."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmAccountSignatureDateTime
	 * InvestmentAccount62.mmAccountSignatureDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmAccountSignatureDateTime
	 * InvestmentAccount46.mmAccountSignatureDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountSignatureDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Agreement.mmDateSigned;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "AcctSgntrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountSignatureDateTime";
			definition = "Date the investor or account owner signs the open account form.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmAccountSignatureDateTime);
			previousVersion_lazy = () -> InvestmentAccount46.mmAccountSignatureDateTime;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "TxChanlTp")
	protected TransactionChannelType1Choice transactionChannelType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TransactionChannelType1Choice
	 * TransactionChannelType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AccountContract#mmTransactionChannel
	 * AccountContract.mmTransactionChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxChanlTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionChannelType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the means by which the investor or account owner submits the open account form. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmTransactionChannelType
	 * InvestmentAccount62.mmTransactionChannelType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmTransactionChannelType
	 * InvestmentAccount46.mmTransactionChannelType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionChannelType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AccountContract.mmTransactionChannel;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "TxChanlTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionChannelType";
			definition = "Specifies the means by which the investor or account owner submits the open account form. ";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmTransactionChannelType);
			previousVersion_lazy = () -> InvestmentAccount46.mmTransactionChannelType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TransactionChannelType1Choice.mmObject();
		}
	};
	@XmlElement(name = "InvstmtAcctCtgy")
	protected InvestmentAccountCategory1Choice investmentAccountCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InvestmentAccountCategory1Choice
	 * InvestmentAccountCategory1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmCategory
	 * InvestmentAccount.mmCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmInvestmentAccountCategory
	 * InvestmentAccount62.mmInvestmentAccountCategory}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#mmInvestmentAccountCategory
	 * InvestmentAccount46.mmInvestmentAccountCategory}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentAccountCategory = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmCategory;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountCategory";
			definition = "Specifies the category of the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmInvestmentAccountCategory);
			previousVersion_lazy = () -> InvestmentAccount46.mmInvestmentAccountCategory;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountCategory1Choice.mmObject();
		}
	};
	@XmlElement(name = "Pldgg")
	protected Eligible1Code pledging;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Eligible1Code
	 * Eligible1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pldgg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pledging"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the holdings in the account are eligible for pledging."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmPledging
	 * InvestmentAccount62.mmPledging}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPledging = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "Pldgg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledging";
			definition = "Specifies whether the holdings in the account are eligible for pledging.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmPledging);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Eligible1Code.mmObject();
		}
	};
	@XmlElement(name = "Coll")
	protected Collateral1Code collateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Collateral1Code
	 * Collateral1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Coll"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the holdings in the account are used as collateral."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmCollateral
	 * InvestmentAccount62.mmCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateral = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "Coll";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Specifies whether the holdings in the account are used as collateral.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmCollateral);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Collateral1Code.mmObject();
		}
	};
	@XmlElement(name = "ThrdPtyRghts")
	protected ThirdPartyRights1 thirdPartyRights;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ThirdPartyRights1
	 * ThirdPartyRights1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThrdPtyRghts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThirdPartyRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of third party rights."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmThirdPartyRights
	 * InvestmentAccount62.mmThirdPartyRights}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmThirdPartyRights = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "ThrdPtyRghts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdPartyRights";
			definition = "Details of third party rights.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmThirdPartyRights);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ThirdPartyRights1.mmObject();
		}
	};
	@XmlElement(name = "PwrOfAttnyLvlOfCtrl")
	protected LevelOfControl1Choice powerOfAttorneyLevelOfControl;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LevelOfControl1Choice
	 * LevelOfControl1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PwrOfAttnyLvlOfCtrl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorneyLevelOfControl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Functionality permitted to a third party in the actions that may be taken on an account on behalf of the investor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmPowerOfAttorneyLevelOfControl
	 * InvestmentAccount62.mmPowerOfAttorneyLevelOfControl}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPowerOfAttorneyLevelOfControl = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "PwrOfAttnyLvlOfCtrl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorneyLevelOfControl";
			definition = "Functionality permitted to a third party in the actions that may be taken on an account on behalf of the investor.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmPowerOfAttorneyLevelOfControl);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LevelOfControl1Choice.mmObject();
		}
	};
	@XmlElement(name = "AcctgSts")
	protected AccountingStatus1Choice accountingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountingStatus1Choice
	 * AccountingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the account is regarded as domestic or non-domestic for reporting purposes."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmAccountingStatus
	 * InvestmentAccount62.mmAccountingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountingStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "AcctgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountingStatus";
			definition = "Specifies if the account is regarded as domestic or non-domestic for reporting purposes.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmAccountingStatus);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountingStatus1Choice.mmObject();
		}
	};
	@XmlElement(name = "OpngDt")
	protected DateAndDateTimeChoice openingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmOpeningDate
	 * Account.mmOpeningDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal opening date for the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmOpeningDate
	 * InvestmentAccount62.mmOpeningDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOpeningDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmOpeningDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "OpngDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningDate";
			definition = "Legal opening date for the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmOpeningDate);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "ClsgDt")
	protected DateAndDateTimeChoice closingDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmClosingDate
	 * Account.mmClosingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal closing date for the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmClosingDate
	 * InvestmentAccount62.mmClosingDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmClosingDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Account.mmClosingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "ClsgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDate";
			definition = "Legal closing date for the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmClosingDate);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "NegInd")
	protected YesNoIndicator negativeIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NegInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegativeIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the account can hold a negative position in a security."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmNegativeIndicator
	 * InvestmentAccount62.mmNegativeIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNegativeIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "NegInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegativeIndicator";
			definition = "Indicates whether the account can hold a negative position in a security.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmNegativeIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PrcgOrdr")
	protected PositionEffect3Code processingOrder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect3Code
	 * PositionEffect3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmPositionEffect
	 * SecuritiesOrder.mmPositionEffect}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgOrdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order in which securities are moved from the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmProcessingOrder
	 * InvestmentAccount62.mmProcessingOrder}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessingOrder = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmPositionEffect;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "PrcgOrdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingOrder";
			definition = "Order in which securities are moved from the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmProcessingOrder);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PositionEffect3Code.mmObject();
		}
	};
	@XmlElement(name = "Lblty")
	protected Liability1Choice liability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Liability1Choice
	 * Liability1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lblty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Liability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the investor assumes responsibility for the liability."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmLiability
	 * InvestmentAccount62.mmLiability}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLiability = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "Lblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Liability";
			definition = "Specifies whether the investor assumes responsibility for the liability.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmLiability);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Liability1Choice.mmObject();
		}
	};
	@XmlElement(name = "InvstrPrfl")
	protected List<com.tools20022.repository.msg.InvestorProfile1> investorProfile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestorProfile1
	 * InvestorProfile1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrPrfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information used to determine fees and types of operations that can be carried out on the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmInvestorProfile
	 * InvestmentAccount62.mmInvestorProfile}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestorProfile = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "InvstrPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorProfile";
			definition = "Information used to determine fees and types of operations that can be carried out on the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmInvestorProfile);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestorProfile1.mmObject();
		}
	};
	@XmlElement(name = "FsclYr")
	protected FiscalYear1Choice fiscalYear;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.FiscalYear1Choice
	 * FiscalYear1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxDate Tax.mmTaxDate}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50
	 * InvestmentAccount50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FsclYr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fiscal year, when not the same as the calendar year."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#mmFiscalYear
	 * InvestmentAccount62.mmFiscalYear}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFiscalYear = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount50.mmObject();
			isDerived = false;
			xmlTag = "FsclYr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalYear";
			definition = "Fiscal year, when not the same as the calendar year.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmFiscalYear);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FiscalYear1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount50.mmIdentification, com.tools20022.repository.msg.InvestmentAccount50.mmStatus,
						com.tools20022.repository.msg.InvestmentAccount50.mmStatusDate, com.tools20022.repository.msg.InvestmentAccount50.mmName, com.tools20022.repository.msg.InvestmentAccount50.mmDesignation,
						com.tools20022.repository.msg.InvestmentAccount50.mmType, com.tools20022.repository.msg.InvestmentAccount50.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount50.mmTaxExemption,
						com.tools20022.repository.msg.InvestmentAccount50.mmStatementFrequency, com.tools20022.repository.msg.InvestmentAccount50.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount50.mmLanguage,
						com.tools20022.repository.msg.InvestmentAccount50.mmIncomePreference, com.tools20022.repository.msg.InvestmentAccount50.mmReinvestmentDetails,
						com.tools20022.repository.msg.InvestmentAccount50.mmTaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount50.mmTaxReporting, com.tools20022.repository.msg.InvestmentAccount50.mmLetterIntentDetails,
						com.tools20022.repository.msg.InvestmentAccount50.mmAccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount50.mmRequiredSignatoriesNumber,
						com.tools20022.repository.msg.InvestmentAccount50.mmFundFamilyName, com.tools20022.repository.msg.InvestmentAccount50.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.InvestmentAccount50.mmRoundingDetails, com.tools20022.repository.msg.InvestmentAccount50.mmAccountServicer, com.tools20022.repository.msg.InvestmentAccount50.mmBlockedStatus,
						com.tools20022.repository.msg.InvestmentAccount50.mmAccountUsageType, com.tools20022.repository.msg.InvestmentAccount50.mmForeignStatusCertification,
						com.tools20022.repository.msg.InvestmentAccount50.mmAccountSignatureDateTime, com.tools20022.repository.msg.InvestmentAccount50.mmTransactionChannelType,
						com.tools20022.repository.msg.InvestmentAccount50.mmInvestmentAccountCategory, com.tools20022.repository.msg.InvestmentAccount50.mmPledging, com.tools20022.repository.msg.InvestmentAccount50.mmCollateral,
						com.tools20022.repository.msg.InvestmentAccount50.mmThirdPartyRights, com.tools20022.repository.msg.InvestmentAccount50.mmPowerOfAttorneyLevelOfControl,
						com.tools20022.repository.msg.InvestmentAccount50.mmAccountingStatus, com.tools20022.repository.msg.InvestmentAccount50.mmOpeningDate, com.tools20022.repository.msg.InvestmentAccount50.mmClosingDate,
						com.tools20022.repository.msg.InvestmentAccount50.mmNegativeIndicator, com.tools20022.repository.msg.InvestmentAccount50.mmProcessingOrder, com.tools20022.repository.msg.InvestmentAccount50.mmLiability,
						com.tools20022.repository.msg.InvestmentAccount50.mmInvestorProfile, com.tools20022.repository.msg.InvestmentAccount50.mmFiscalYear);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV06.mmInvestmentAccount);
				trace_lazy = () -> InvestmentAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount50,
						com.tools20022.repository.constraints.ConstraintIncomePreferenceReinvestment1Rule.forInvestmentAccount50, com.tools20022.repository.constraints.ConstraintReinvestmentPercentage1Rule.forInvestmentAccount50);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccount50";
				definition = "Information about a securities account and its characteristics.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentAccount62.mmObject());
				previousVersion_lazy = () -> InvestmentAccount46.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIdentification() {
		return identification;
	}

	public InvestmentAccount50 setIdentification(Max35Text identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public AccountStatus1Choice getStatus() {
		return status;
	}

	public InvestmentAccount50 setStatus(AccountStatus1Choice status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<DateAndDateTime1Choice> getStatusDate() {
		return statusDate == null ? Optional.empty() : Optional.of(statusDate);
	}

	public InvestmentAccount50 setStatusDate(DateAndDateTime1Choice statusDate) {
		this.statusDate = statusDate;
		return this;
	}

	public Optional<Max35Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public InvestmentAccount50 setName(Max35Text name) {
		this.name = name;
		return this;
	}

	public Optional<Max35Text> getDesignation() {
		return designation == null ? Optional.empty() : Optional.of(designation);
	}

	public InvestmentAccount50 setDesignation(Max35Text designation) {
		this.designation = designation;
		return this;
	}

	public Optional<AccountType2Choice> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public InvestmentAccount50 setType(AccountType2Choice type) {
		this.type = type;
		return this;
	}

	public OwnershipType2Choice getOwnershipType() {
		return ownershipType;
	}

	public InvestmentAccount50 setOwnershipType(OwnershipType2Choice ownershipType) {
		this.ownershipType = Objects.requireNonNull(ownershipType);
		return this;
	}

	public Optional<TaxExemptionReason2Choice> getTaxExemption() {
		return taxExemption == null ? Optional.empty() : Optional.of(taxExemption);
	}

	public InvestmentAccount50 setTaxExemption(TaxExemptionReason2Choice taxExemption) {
		this.taxExemption = taxExemption;
		return this;
	}

	public Optional<StatementFrequencyReason2Choice> getStatementFrequency() {
		return statementFrequency == null ? Optional.empty() : Optional.of(statementFrequency);
	}

	public InvestmentAccount50 setStatementFrequency(StatementFrequencyReason2Choice statementFrequency) {
		this.statementFrequency = statementFrequency;
		return this;
	}

	public Optional<ActiveCurrencyCode> getReferenceCurrency() {
		return referenceCurrency == null ? Optional.empty() : Optional.of(referenceCurrency);
	}

	public InvestmentAccount50 setReferenceCurrency(ActiveCurrencyCode referenceCurrency) {
		this.referenceCurrency = referenceCurrency;
		return this;
	}

	public Optional<LanguageCode> getLanguage() {
		return language == null ? Optional.empty() : Optional.of(language);
	}

	public InvestmentAccount50 setLanguage(LanguageCode language) {
		this.language = language;
		return this;
	}

	public Optional<IncomePreference2Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public InvestmentAccount50 setIncomePreference(IncomePreference2Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public List<Reinvestment2> getReinvestmentDetails() {
		return reinvestmentDetails == null ? reinvestmentDetails = new ArrayList<>() : reinvestmentDetails;
	}

	public InvestmentAccount50 setReinvestmentDetails(List<com.tools20022.repository.msg.Reinvestment2> reinvestmentDetails) {
		this.reinvestmentDetails = Objects.requireNonNull(reinvestmentDetails);
		return this;
	}

	public Optional<TaxWithholdingMethod3Code> getTaxWithholdingMethod() {
		return taxWithholdingMethod == null ? Optional.empty() : Optional.of(taxWithholdingMethod);
	}

	public InvestmentAccount50 setTaxWithholdingMethod(TaxWithholdingMethod3Code taxWithholdingMethod) {
		this.taxWithholdingMethod = taxWithholdingMethod;
		return this;
	}

	public List<TaxReporting1> getTaxReporting() {
		return taxReporting == null ? taxReporting = new ArrayList<>() : taxReporting;
	}

	public InvestmentAccount50 setTaxReporting(List<com.tools20022.repository.msg.TaxReporting1> taxReporting) {
		this.taxReporting = Objects.requireNonNull(taxReporting);
		return this;
	}

	public Optional<LetterIntent1> getLetterIntentDetails() {
		return letterIntentDetails == null ? Optional.empty() : Optional.of(letterIntentDetails);
	}

	public InvestmentAccount50 setLetterIntentDetails(com.tools20022.repository.msg.LetterIntent1 letterIntentDetails) {
		this.letterIntentDetails = letterIntentDetails;
		return this;
	}

	public Optional<Max35Text> getAccumulationRightReference() {
		return accumulationRightReference == null ? Optional.empty() : Optional.of(accumulationRightReference);
	}

	public InvestmentAccount50 setAccumulationRightReference(Max35Text accumulationRightReference) {
		this.accumulationRightReference = accumulationRightReference;
		return this;
	}

	public Optional<Number> getRequiredSignatoriesNumber() {
		return requiredSignatoriesNumber == null ? Optional.empty() : Optional.of(requiredSignatoriesNumber);
	}

	public InvestmentAccount50 setRequiredSignatoriesNumber(Number requiredSignatoriesNumber) {
		this.requiredSignatoriesNumber = requiredSignatoriesNumber;
		return this;
	}

	public Optional<Max350Text> getFundFamilyName() {
		return fundFamilyName == null ? Optional.empty() : Optional.of(fundFamilyName);
	}

	public InvestmentAccount50 setFundFamilyName(Max350Text fundFamilyName) {
		this.fundFamilyName = fundFamilyName;
		return this;
	}

	public List<FinancialInstrument51> getFinancialInstrumentDetails() {
		return financialInstrumentDetails == null ? financialInstrumentDetails = new ArrayList<>() : financialInstrumentDetails;
	}

	public InvestmentAccount50 setFinancialInstrumentDetails(List<com.tools20022.repository.msg.FinancialInstrument51> financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public Optional<RoundingParameters1> getRoundingDetails() {
		return roundingDetails == null ? Optional.empty() : Optional.of(roundingDetails);
	}

	public InvestmentAccount50 setRoundingDetails(com.tools20022.repository.msg.RoundingParameters1 roundingDetails) {
		this.roundingDetails = roundingDetails;
		return this;
	}

	public Optional<PartyIdentification70Choice> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public InvestmentAccount50 setAccountServicer(PartyIdentification70Choice accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}

	public List<Blocked2> getBlockedStatus() {
		return blockedStatus == null ? blockedStatus = new ArrayList<>() : blockedStatus;
	}

	public InvestmentAccount50 setBlockedStatus(List<com.tools20022.repository.msg.Blocked2> blockedStatus) {
		this.blockedStatus = Objects.requireNonNull(blockedStatus);
		return this;
	}

	public Optional<AccountUsageType2Choice> getAccountUsageType() {
		return accountUsageType == null ? Optional.empty() : Optional.of(accountUsageType);
	}

	public InvestmentAccount50 setAccountUsageType(AccountUsageType2Choice accountUsageType) {
		this.accountUsageType = accountUsageType;
		return this;
	}

	public Optional<Provided1Code> getForeignStatusCertification() {
		return foreignStatusCertification == null ? Optional.empty() : Optional.of(foreignStatusCertification);
	}

	public InvestmentAccount50 setForeignStatusCertification(Provided1Code foreignStatusCertification) {
		this.foreignStatusCertification = foreignStatusCertification;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getAccountSignatureDateTime() {
		return accountSignatureDateTime == null ? Optional.empty() : Optional.of(accountSignatureDateTime);
	}

	public InvestmentAccount50 setAccountSignatureDateTime(DateAndDateTimeChoice accountSignatureDateTime) {
		this.accountSignatureDateTime = accountSignatureDateTime;
		return this;
	}

	public Optional<TransactionChannelType1Choice> getTransactionChannelType() {
		return transactionChannelType == null ? Optional.empty() : Optional.of(transactionChannelType);
	}

	public InvestmentAccount50 setTransactionChannelType(TransactionChannelType1Choice transactionChannelType) {
		this.transactionChannelType = transactionChannelType;
		return this;
	}

	public Optional<InvestmentAccountCategory1Choice> getInvestmentAccountCategory() {
		return investmentAccountCategory == null ? Optional.empty() : Optional.of(investmentAccountCategory);
	}

	public InvestmentAccount50 setInvestmentAccountCategory(InvestmentAccountCategory1Choice investmentAccountCategory) {
		this.investmentAccountCategory = investmentAccountCategory;
		return this;
	}

	public Optional<Eligible1Code> getPledging() {
		return pledging == null ? Optional.empty() : Optional.of(pledging);
	}

	public InvestmentAccount50 setPledging(Eligible1Code pledging) {
		this.pledging = pledging;
		return this;
	}

	public Optional<Collateral1Code> getCollateral() {
		return collateral == null ? Optional.empty() : Optional.of(collateral);
	}

	public InvestmentAccount50 setCollateral(Collateral1Code collateral) {
		this.collateral = collateral;
		return this;
	}

	public Optional<ThirdPartyRights1> getThirdPartyRights() {
		return thirdPartyRights == null ? Optional.empty() : Optional.of(thirdPartyRights);
	}

	public InvestmentAccount50 setThirdPartyRights(com.tools20022.repository.msg.ThirdPartyRights1 thirdPartyRights) {
		this.thirdPartyRights = thirdPartyRights;
		return this;
	}

	public Optional<LevelOfControl1Choice> getPowerOfAttorneyLevelOfControl() {
		return powerOfAttorneyLevelOfControl == null ? Optional.empty() : Optional.of(powerOfAttorneyLevelOfControl);
	}

	public InvestmentAccount50 setPowerOfAttorneyLevelOfControl(LevelOfControl1Choice powerOfAttorneyLevelOfControl) {
		this.powerOfAttorneyLevelOfControl = powerOfAttorneyLevelOfControl;
		return this;
	}

	public Optional<AccountingStatus1Choice> getAccountingStatus() {
		return accountingStatus == null ? Optional.empty() : Optional.of(accountingStatus);
	}

	public InvestmentAccount50 setAccountingStatus(AccountingStatus1Choice accountingStatus) {
		this.accountingStatus = accountingStatus;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getOpeningDate() {
		return openingDate == null ? Optional.empty() : Optional.of(openingDate);
	}

	public InvestmentAccount50 setOpeningDate(DateAndDateTimeChoice openingDate) {
		this.openingDate = openingDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getClosingDate() {
		return closingDate == null ? Optional.empty() : Optional.of(closingDate);
	}

	public InvestmentAccount50 setClosingDate(DateAndDateTimeChoice closingDate) {
		this.closingDate = closingDate;
		return this;
	}

	public Optional<YesNoIndicator> getNegativeIndicator() {
		return negativeIndicator == null ? Optional.empty() : Optional.of(negativeIndicator);
	}

	public InvestmentAccount50 setNegativeIndicator(YesNoIndicator negativeIndicator) {
		this.negativeIndicator = negativeIndicator;
		return this;
	}

	public Optional<PositionEffect3Code> getProcessingOrder() {
		return processingOrder == null ? Optional.empty() : Optional.of(processingOrder);
	}

	public InvestmentAccount50 setProcessingOrder(PositionEffect3Code processingOrder) {
		this.processingOrder = processingOrder;
		return this;
	}

	public Optional<Liability1Choice> getLiability() {
		return liability == null ? Optional.empty() : Optional.of(liability);
	}

	public InvestmentAccount50 setLiability(Liability1Choice liability) {
		this.liability = liability;
		return this;
	}

	public List<InvestorProfile1> getInvestorProfile() {
		return investorProfile == null ? investorProfile = new ArrayList<>() : investorProfile;
	}

	public InvestmentAccount50 setInvestorProfile(List<com.tools20022.repository.msg.InvestorProfile1> investorProfile) {
		this.investorProfile = Objects.requireNonNull(investorProfile);
		return this;
	}

	public Optional<FiscalYear1Choice> getFiscalYear() {
		return fiscalYear == null ? Optional.empty() : Optional.of(fiscalYear);
	}

	public InvestmentAccount50 setFiscalYear(FiscalYear1Choice fiscalYear) {
		this.fiscalYear = fiscalYear;
		return this;
	}
}