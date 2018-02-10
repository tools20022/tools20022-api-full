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
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Account between an investor(s) and a fund manager or a fund. The account can
 * contain holdings in any investment fund or investment fund class managed (or
 * distributed) by the fund manager, within the same fund family.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#TypeOrExtendedTypeRule
 * InvestmentAccount18.TypeOrExtendedTypeRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#OwnershipTypeOrExtendedOwnershipTypeRule
 * InvestmentAccount18.OwnershipTypeOrExtendedOwnershipTypeRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#TaxExemptionReasonOrExtendedTaxExemptionReasonRule
 * InvestmentAccount18.TaxExemptionReasonOrExtendedTaxExemptionReasonRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#StatementFrequencyOrExtendedStatementFrequencyRule
 * InvestmentAccount18.StatementFrequencyOrExtendedStatementFrequencyRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmName
 * InvestmentAccount18.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmDesignation
 * InvestmentAccount18.mmDesignation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmType
 * InvestmentAccount18.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmExtendedType
 * InvestmentAccount18.mmExtendedType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmOwnershipType
 * InvestmentAccount18.mmOwnershipType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmExtendedOwnershipType
 * InvestmentAccount18.mmExtendedOwnershipType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmTaxExemptionReason
 * InvestmentAccount18.mmTaxExemptionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmExtendedTaxExemptionReason
 * InvestmentAccount18.mmExtendedTaxExemptionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmStatementFrequency
 * InvestmentAccount18.mmStatementFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmExtendedStatementFrequency
 * InvestmentAccount18.mmExtendedStatementFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmReferenceCurrency
 * InvestmentAccount18.mmReferenceCurrency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmLanguage
 * InvestmentAccount18.mmLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmIncomePreference
 * InvestmentAccount18.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmTaxWithholdingMethod
 * InvestmentAccount18.mmTaxWithholdingMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmLetterIntentReference
 * InvestmentAccount18.mmLetterIntentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmAccumulationRightReference
 * InvestmentAccount18.mmAccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmRequiredSignatoriesNumber
 * InvestmentAccount18.mmRequiredSignatoriesNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmFundFamilyName
 * InvestmentAccount18.mmFundFamilyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmFundDetails
 * InvestmentAccount18.mmFundDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmRoundingDetails
 * InvestmentAccount18.mmRoundingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmAccountServicer
 * InvestmentAccount18.mmAccountServicer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentAccount
 * InvestmentAccount}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFundDetailsGuideline#forInvestmentAccount18
 * ConstraintFundDetailsGuideline.forInvestmentAccount18}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccount18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccount18", propOrder = {"name", "designation", "type", "extendedType", "ownershipType", "extendedOwnershipType", "taxExemptionReason", "extendedTaxExemptionReason", "statementFrequency",
		"extendedStatementFrequency", "referenceCurrency", "language", "incomePreference", "taxWithholdingMethod", "letterIntentReference", "accumulationRightReference", "requiredSignatoriesNumber", "fundFamilyName", "fundDetails",
		"roundingDetails", "accountServicer"})
public class InvestmentAccount18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmDesignation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmDesignation;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "Dsgnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Designation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Tp")
	protected FundCashAccount2Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundCashAccount2Code
	 * FundCashAccount2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountType
	 * InvestmentAccount.mmInvestmentAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * definition} =
	 * "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, PEP, ISA."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentAccountType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, PEP, ISA.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FundCashAccount2Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedTp")
	protected Extended350Code extendedType;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountType
	 * InvestmentAccount.mmInvestmentAccountType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, PEP, ISA."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentAccountType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "XtndedTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedType";
			definition = "Purpose of the account/source fund type. This is typically linked to an investment product, eg, wrapper, PEP, ISA.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "OwnrshTp")
	protected AccountOwnershipType2Code ownershipType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmOwnershipType
	 * InvestmentAccount.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * definition} = "Ownership status of the account, eg, joint owners."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnershipType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmOwnershipType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "OwnrshTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnershipType";
			definition = "Ownership status of the account, eg, joint owners.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AccountOwnershipType2Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedOwnrshTp")
	protected Extended350Code extendedOwnershipType;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmOwnershipType
	 * InvestmentAccount.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedOwnrshTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedOwnershipType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ownership status of the account, eg, joint owners."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedOwnershipType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmOwnershipType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "XtndedOwnrshTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedOwnershipType";
			definition = "Ownership status of the account, eg, joint owners.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "TaxXmptnRsn")
	protected TaxExemptReason1Code taxExemptionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxExemptReason1Code
	 * TaxExemptReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmExemptionReason
	 * Tax.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxXmptnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax advantage specific to the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxExemptionReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmExemptionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "TaxXmptnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemptionReason";
			definition = "Tax advantage specific to the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxExemptReason1Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedTaxXmptnRsn")
	protected Extended350Code extendedTaxExemptionReason;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmExemptionReason
	 * Tax.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedTaxXmptnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedTaxExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax advantage specific to the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedTaxExemptionReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmExemptionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "XtndedTaxXmptnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedTaxExemptionReason";
			definition = "Tax advantage specific to the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "StmtFrqcy")
	protected Frequency1Code statementFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency1Code
	 * Frequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
	 * ReportingService.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * definition} = "Regularity at which a statement is issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatementFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "StmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementFrequency";
			definition = "Regularity at which a statement is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedStmtFrqcy")
	protected Extended350Code extendedStatementFrequency;
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
	 * {@linkplain com.tools20022.repository.entity.ReportingService#mmStatementFrequency
	 * ReportingService.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedStmtFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedStatementFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regularity at which a statement is issued."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedStatementFrequency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ReportingService.mmStatementFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "XtndedStmtFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedStatementFrequency";
			definition = "Regularity at which a statement is issued.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "RefCcy")
	protected CurrencyCode referenceCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmReferenceCurrency
	 * InvestmentAccount.mmReferenceCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmReferenceCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "RefCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceCurrency";
			definition = "Currency chosen for reporting purposes by the account owner in agreement with the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmLanguage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "Lang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Language";
			definition = "Language for all communication concerning the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomePreference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}
	};
	@XmlElement(name = "TaxWhldgMtd")
	protected TaxWithholdingMethod1Code taxWithholdingMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TaxWithholdingMethod1Code
	 * TaxWithholdingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmTaxWithholdingMethod
	 * InvestmentAccountService.mmTaxWithholdingMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * "Method by which the tax (withholding tax) is to be processed i.e. either withheld at source or tax information reported to tax authorities or tax information is reported due to the provision of a tax certificate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxWithholdingMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmTaxWithholdingMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "TaxWhldgMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxWithholdingMethod";
			definition = "Method by which the tax (withholding tax) is to be processed i.e. either withheld at source or tax information reported to tax authorities or tax information is reported due to the provision of a tax certificate.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TaxWithholdingMethod1Code.mmObject();
		}
	};
	@XmlElement(name = "LttrInttRef")
	protected Max35Text letterIntentReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmLetterIntentReference
	 * InvestmentAccountContract.mmLetterIntentReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrInttRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterIntentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLetterIntentReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountContract.mmLetterIntentReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "LttrInttRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterIntentReference";
			definition = "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccumulationRightReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountContract.mmAccumulationRightReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "AcmltnRghtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulationRightReference";
			definition = "Reference of an accumulation rights program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market.";
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequiredSignatoriesNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmRequiredSignatureNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "ReqrdSgntriesNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequiredSignatoriesNumber";
			definition = "Number of account owners or related parties required to authorise transactions on the account.";
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmFundFamilyName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundFamily.mmFundFamilyName;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "FndFmlyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundFamilyName";
			definition = "Name of the investment fund family.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "FndDtls")
	protected FinancialInstrument6 fundDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument6
	 * FinancialInstrument6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
	 * InvestmentAccount.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Detailed information about the investment fund associated to the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFundDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "FndDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundDetails";
			definition = "Detailed information about the investment fund associated to the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument6.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRoundingDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmRoundingMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "RndgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingDetails";
			definition = "Parameters to be applied on deal amount for orders when the amount is a fractional number.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RoundingParameters1.mmObject();
		}
	};
	@XmlElement(name = "AcctSvcr")
	protected PartyIdentification2Choice accountServicer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
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
	 * "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.\n."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountServicer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.\n.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	/**
	 * Either Type or ExtendedType may be present but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmType
	 * InvestmentAccount18.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmExtendedType
	 * InvestmentAccount18.mmExtendedType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOrExtendedTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either Type or ExtendedType may be present but not both."</li>
	 * </ul>
	 */
	public static final MMXor TypeOrExtendedTypeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOrExtendedTypeRule";
			definition = "Either Type or ExtendedType may be present but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount18.mmType, com.tools20022.repository.msg.InvestmentAccount18.mmExtendedType);
		}
	};
	/**
	 * Either OwnershipType or ExtendedOwnershipType must be present but not
	 * both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmOwnershipType
	 * InvestmentAccount18.mmOwnershipType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmExtendedOwnershipType
	 * InvestmentAccount18.mmExtendedOwnershipType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipTypeOrExtendedOwnershipTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either OwnershipType or ExtendedOwnershipType must be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor OwnershipTypeOrExtendedOwnershipTypeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnershipTypeOrExtendedOwnershipTypeRule";
			definition = "Either OwnershipType or ExtendedOwnershipType must be present but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount18.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount18.mmExtendedOwnershipType);
		}
	};
	/**
	 * Either TaxExemptionReason or ExtendedTaxExemptionReason may be present
	 * but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmTaxExemptionReason
	 * InvestmentAccount18.mmTaxExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmExtendedTaxExemptionReason
	 * InvestmentAccount18.mmExtendedTaxExemptionReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemptionReasonOrExtendedTaxExemptionReasonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TaxExemptionReason or ExtendedTaxExemptionReason may be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor TaxExemptionReasonOrExtendedTaxExemptionReasonRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemptionReasonOrExtendedTaxExemptionReasonRule";
			definition = "Either TaxExemptionReason or ExtendedTaxExemptionReason may be present but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount18.mmTaxExemptionReason, com.tools20022.repository.msg.InvestmentAccount18.mmExtendedTaxExemptionReason);
		}
	};
	/**
	 * Either StatementFrequency or ExtendedStatementFrequency may be present
	 * but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18
	 * InvestmentAccount18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmStatementFrequency
	 * InvestmentAccount18.mmStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#mmExtendedStatementFrequency
	 * InvestmentAccount18.mmExtendedStatementFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementFrequencyOrExtendedStatementFrequencyRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either StatementFrequency or ExtendedStatementFrequency may be present but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor StatementFrequencyOrExtendedStatementFrequencyRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatementFrequencyOrExtendedStatementFrequencyRule";
			definition = "Either StatementFrequency or ExtendedStatementFrequency may be present but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.InvestmentAccount18.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount18.mmStatementFrequency, com.tools20022.repository.msg.InvestmentAccount18.mmExtendedStatementFrequency);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount18.mmName, com.tools20022.repository.msg.InvestmentAccount18.mmDesignation, com.tools20022.repository.msg.InvestmentAccount18.mmType,
						com.tools20022.repository.msg.InvestmentAccount18.mmExtendedType, com.tools20022.repository.msg.InvestmentAccount18.mmOwnershipType, com.tools20022.repository.msg.InvestmentAccount18.mmExtendedOwnershipType,
						com.tools20022.repository.msg.InvestmentAccount18.mmTaxExemptionReason, com.tools20022.repository.msg.InvestmentAccount18.mmExtendedTaxExemptionReason,
						com.tools20022.repository.msg.InvestmentAccount18.mmStatementFrequency, com.tools20022.repository.msg.InvestmentAccount18.mmExtendedStatementFrequency,
						com.tools20022.repository.msg.InvestmentAccount18.mmReferenceCurrency, com.tools20022.repository.msg.InvestmentAccount18.mmLanguage, com.tools20022.repository.msg.InvestmentAccount18.mmIncomePreference,
						com.tools20022.repository.msg.InvestmentAccount18.mmTaxWithholdingMethod, com.tools20022.repository.msg.InvestmentAccount18.mmLetterIntentReference,
						com.tools20022.repository.msg.InvestmentAccount18.mmAccumulationRightReference, com.tools20022.repository.msg.InvestmentAccount18.mmRequiredSignatoriesNumber,
						com.tools20022.repository.msg.InvestmentAccount18.mmFundFamilyName, com.tools20022.repository.msg.InvestmentAccount18.mmFundDetails, com.tools20022.repository.msg.InvestmentAccount18.mmRoundingDetails,
						com.tools20022.repository.msg.InvestmentAccount18.mmAccountServicer);
				trace_lazy = () -> InvestmentAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFundDetailsGuideline.forInvestmentAccount18);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "InvestmentAccount18";
				definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount18.TypeOrExtendedTypeRule, com.tools20022.repository.msg.InvestmentAccount18.OwnershipTypeOrExtendedOwnershipTypeRule,
						com.tools20022.repository.msg.InvestmentAccount18.TaxExemptionReasonOrExtendedTaxExemptionReasonRule, com.tools20022.repository.msg.InvestmentAccount18.StatementFrequencyOrExtendedStatementFrequencyRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public InvestmentAccount18 setName(Max35Text name) {
		this.name = name;
		return this;
	}

	public Optional<Max35Text> getDesignation() {
		return designation == null ? Optional.empty() : Optional.of(designation);
	}

	public InvestmentAccount18 setDesignation(Max35Text designation) {
		this.designation = designation;
		return this;
	}

	public Optional<FundCashAccount2Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public InvestmentAccount18 setType(FundCashAccount2Code type) {
		this.type = type;
		return this;
	}

	public Optional<Extended350Code> getExtendedType() {
		return extendedType == null ? Optional.empty() : Optional.of(extendedType);
	}

	public InvestmentAccount18 setExtendedType(Extended350Code extendedType) {
		this.extendedType = extendedType;
		return this;
	}

	public Optional<AccountOwnershipType2Code> getOwnershipType() {
		return ownershipType == null ? Optional.empty() : Optional.of(ownershipType);
	}

	public InvestmentAccount18 setOwnershipType(AccountOwnershipType2Code ownershipType) {
		this.ownershipType = ownershipType;
		return this;
	}

	public Optional<Extended350Code> getExtendedOwnershipType() {
		return extendedOwnershipType == null ? Optional.empty() : Optional.of(extendedOwnershipType);
	}

	public InvestmentAccount18 setExtendedOwnershipType(Extended350Code extendedOwnershipType) {
		this.extendedOwnershipType = extendedOwnershipType;
		return this;
	}

	public Optional<TaxExemptReason1Code> getTaxExemptionReason() {
		return taxExemptionReason == null ? Optional.empty() : Optional.of(taxExemptionReason);
	}

	public InvestmentAccount18 setTaxExemptionReason(TaxExemptReason1Code taxExemptionReason) {
		this.taxExemptionReason = taxExemptionReason;
		return this;
	}

	public Optional<Extended350Code> getExtendedTaxExemptionReason() {
		return extendedTaxExemptionReason == null ? Optional.empty() : Optional.of(extendedTaxExemptionReason);
	}

	public InvestmentAccount18 setExtendedTaxExemptionReason(Extended350Code extendedTaxExemptionReason) {
		this.extendedTaxExemptionReason = extendedTaxExemptionReason;
		return this;
	}

	public Optional<Frequency1Code> getStatementFrequency() {
		return statementFrequency == null ? Optional.empty() : Optional.of(statementFrequency);
	}

	public InvestmentAccount18 setStatementFrequency(Frequency1Code statementFrequency) {
		this.statementFrequency = statementFrequency;
		return this;
	}

	public Optional<Extended350Code> getExtendedStatementFrequency() {
		return extendedStatementFrequency == null ? Optional.empty() : Optional.of(extendedStatementFrequency);
	}

	public InvestmentAccount18 setExtendedStatementFrequency(Extended350Code extendedStatementFrequency) {
		this.extendedStatementFrequency = extendedStatementFrequency;
		return this;
	}

	public Optional<CurrencyCode> getReferenceCurrency() {
		return referenceCurrency == null ? Optional.empty() : Optional.of(referenceCurrency);
	}

	public InvestmentAccount18 setReferenceCurrency(CurrencyCode referenceCurrency) {
		this.referenceCurrency = referenceCurrency;
		return this;
	}

	public Optional<LanguageCode> getLanguage() {
		return language == null ? Optional.empty() : Optional.of(language);
	}

	public InvestmentAccount18 setLanguage(LanguageCode language) {
		this.language = language;
		return this;
	}

	public Optional<IncomePreference1Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public InvestmentAccount18 setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<TaxWithholdingMethod1Code> getTaxWithholdingMethod() {
		return taxWithholdingMethod == null ? Optional.empty() : Optional.of(taxWithholdingMethod);
	}

	public InvestmentAccount18 setTaxWithholdingMethod(TaxWithholdingMethod1Code taxWithholdingMethod) {
		this.taxWithholdingMethod = taxWithholdingMethod;
		return this;
	}

	public Optional<Max35Text> getLetterIntentReference() {
		return letterIntentReference == null ? Optional.empty() : Optional.of(letterIntentReference);
	}

	public InvestmentAccount18 setLetterIntentReference(Max35Text letterIntentReference) {
		this.letterIntentReference = letterIntentReference;
		return this;
	}

	public Optional<Max35Text> getAccumulationRightReference() {
		return accumulationRightReference == null ? Optional.empty() : Optional.of(accumulationRightReference);
	}

	public InvestmentAccount18 setAccumulationRightReference(Max35Text accumulationRightReference) {
		this.accumulationRightReference = accumulationRightReference;
		return this;
	}

	public Optional<Number> getRequiredSignatoriesNumber() {
		return requiredSignatoriesNumber == null ? Optional.empty() : Optional.of(requiredSignatoriesNumber);
	}

	public InvestmentAccount18 setRequiredSignatoriesNumber(Number requiredSignatoriesNumber) {
		this.requiredSignatoriesNumber = requiredSignatoriesNumber;
		return this;
	}

	public Optional<Max350Text> getFundFamilyName() {
		return fundFamilyName == null ? Optional.empty() : Optional.of(fundFamilyName);
	}

	public InvestmentAccount18 setFundFamilyName(Max350Text fundFamilyName) {
		this.fundFamilyName = fundFamilyName;
		return this;
	}

	public Optional<FinancialInstrument6> getFundDetails() {
		return fundDetails == null ? Optional.empty() : Optional.of(fundDetails);
	}

	public InvestmentAccount18 setFundDetails(com.tools20022.repository.msg.FinancialInstrument6 fundDetails) {
		this.fundDetails = fundDetails;
		return this;
	}

	public Optional<RoundingParameters1> getRoundingDetails() {
		return roundingDetails == null ? Optional.empty() : Optional.of(roundingDetails);
	}

	public InvestmentAccount18 setRoundingDetails(com.tools20022.repository.msg.RoundingParameters1 roundingDetails) {
		this.roundingDetails = roundingDetails;
		return this;
	}

	public Optional<PartyIdentification2Choice> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public InvestmentAccount18 setAccountServicer(PartyIdentification2Choice accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}
}