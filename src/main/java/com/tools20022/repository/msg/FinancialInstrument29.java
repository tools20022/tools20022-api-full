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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.SecurityIdentification3Choice;
import com.tools20022.repository.codeset.DistributionPolicy1Code;
import com.tools20022.repository.codeset.FormOfSecurity1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.LocalName;
import com.tools20022.repository.entity.Security;
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
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, eg, dividend option or valuation currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmIdentification
 * FinancialInstrument29.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmName
 * FinancialInstrument29.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmSupplementaryIdentification
 * FinancialInstrument29.mmSupplementaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmClassType
 * FinancialInstrument29.mmClassType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmSecuritiesForm
 * FinancialInstrument29.mmSecuritiesForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmDistributionPolicy
 * FinancialInstrument29.mmDistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmProductGroup
 * FinancialInstrument29.mmProductGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmBlockedHoldingDetails
 * FinancialInstrument29.mmBlockedHoldingDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline#forFinancialInstrument29
 * ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument29
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialInstrument29"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument51
 * FinancialInstrument51}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument10
 * FinancialInstrument10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancialInstrument29", propOrder = {"identification", "name", "supplementaryIdentification", "classType", "securitiesForm", "distributionPolicy", "productGroup", "blockedHoldingDetails"})
public class FinancialInstrument29 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected SecurityIdentification3Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification3Choice
	 * SecurityIdentification3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29
	 * FinancialInstrument29}</li>
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
	 * definition} = "Identification of a security by an ISIN."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmIdentification
	 * FinancialInstrument51.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument29.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of a security by an ISIN.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument51.mmIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification3Choice.mmObject();
		}
	};
	@XmlElement(name = "Nm")
	protected Max350Text name;
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
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmFullName
	 * LocalName.mmFullName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29
	 * FinancialInstrument29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70a::FIAN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the financial instrument in free format text."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmName
	 * FinancialInstrument51.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument29.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70a::FIAN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument51.mmName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "SplmtryId")
	protected Max35Text supplementaryIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29
	 * FinancialInstrument29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about a financial instrument to help identify the instrument."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmSupplementaryIdentification
	 * FinancialInstrument51.mmSupplementaryIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSupplementaryIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument29.mmObject();
			isDerived = false;
			xmlTag = "SplmtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryIdentification";
			definition = "Additional information about a financial instrument to help identify the instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument51.mmSupplementaryIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ClssTp")
	protected Max35Text classType;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmClassType
	 * InvestmentFundClass.mmClassType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29
	 * FinancialInstrument29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClssTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmClassType
	 * FinancialInstrument51.mmClassType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClassType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmClassType;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument29.mmObject();
			isDerived = false;
			xmlTag = "ClssTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassType";
			definition = "Features of units offered by a fund. For example, a unit may have a specific load structure, eg, front end or back end, an income policy, eg, pay out or accumulate, or a trailer policy, eg, with or without. Fund classes are typically denoted by a single character, eg, 'Class A', 'Class 2'.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument51.mmClassType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "SctiesForm")
	protected FormOfSecurity1Code securitiesForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FormOfSecurity1Code
	 * FormOfSecurity1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistrationForm
	 * Security.mmRegistrationForm}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29
	 * FinancialInstrument29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::FORM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form, ie, ownership, of the security, eg, registered or bearer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmSecuritiesForm
	 * FinancialInstrument51.mmSecuritiesForm}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesForm = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument29.mmObject();
			isDerived = false;
			xmlTag = "SctiesForm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::FORM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesForm";
			definition = "Form, ie, ownership, of the security, eg, registered or bearer.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument51.mmSecuritiesForm);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FormOfSecurity1Code.mmObject();
		}
	};
	@XmlElement(name = "DstrbtnPlcy")
	protected DistributionPolicy1Code distributionPolicy;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DistributionPolicy1Code
	 * DistributionPolicy1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmDistributionPolicy
	 * InvestmentFundClass.mmDistributionPolicy}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29
	 * FinancialInstrument29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstrbtnPlcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionPolicy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Income policy relating to a class type, ie, if income is paid out or retained in the fund."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmDistributionPolicy
	 * FinancialInstrument51.mmDistributionPolicy}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDistributionPolicy = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDistributionPolicy;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument29.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to a class type, ie, if income is paid out or retained in the fund.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument51.mmDistributionPolicy);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DistributionPolicy1Code.mmObject();
		}
	};
	@XmlElement(name = "PdctGrp")
	protected Max140Text productGroup;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmProductGroup
	 * InvestmentFundClass.mmProductGroup}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29
	 * FinancialInstrument29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdctGrp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProductGroup"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Company specific description of a group of funds."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmProductGroup
	 * FinancialInstrument51.mmProductGroup}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductGroup = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProductGroup;
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument29.mmObject();
			isDerived = false;
			xmlTag = "PdctGrp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductGroup";
			definition = "Company specific description of a group of funds.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument51.mmProductGroup);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	@XmlElement(name = "BlckdHldgDtls")
	protected BlockedHoldingDetails1 blockedHoldingDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails1
	 * BlockedHoldingDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29
	 * FinancialInstrument29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckdHldgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedHoldingDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When an account at fund level is blocked, this specifies details on how the holding is blocked."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmBlockedHoldingDetails
	 * FinancialInstrument51.mmBlockedHoldingDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBlockedHoldingDetails = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancialInstrument29.mmObject();
			isDerived = false;
			xmlTag = "BlckdHldgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedHoldingDetails";
			definition = "When an account at fund level is blocked, this specifies details on how the holding is blocked.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument51.mmBlockedHoldingDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.BlockedHoldingDetails1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancialInstrument29.mmIdentification, com.tools20022.repository.msg.FinancialInstrument29.mmName,
						com.tools20022.repository.msg.FinancialInstrument29.mmSupplementaryIdentification, com.tools20022.repository.msg.FinancialInstrument29.mmClassType,
						com.tools20022.repository.msg.FinancialInstrument29.mmSecuritiesForm, com.tools20022.repository.msg.FinancialInstrument29.mmDistributionPolicy, com.tools20022.repository.msg.FinancialInstrument29.mmProductGroup,
						com.tools20022.repository.msg.FinancialInstrument29.mmBlockedHoldingDetails);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintFinancialInstrumentIdentificationGuideline.forFinancialInstrument29);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrument29";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.";
				nextVersions_lazy = () -> Arrays.asList(FinancialInstrument51.mmObject());
				previousVersion_lazy = () -> FinancialInstrument10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public SecurityIdentification3Choice getIdentification() {
		return identification;
	}

	public FinancialInstrument29 setIdentification(SecurityIdentification3Choice identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<Max350Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public FinancialInstrument29 setName(Max350Text name) {
		this.name = name;
		return this;
	}

	public Optional<Max35Text> getSupplementaryIdentification() {
		return supplementaryIdentification == null ? Optional.empty() : Optional.of(supplementaryIdentification);
	}

	public FinancialInstrument29 setSupplementaryIdentification(Max35Text supplementaryIdentification) {
		this.supplementaryIdentification = supplementaryIdentification;
		return this;
	}

	public Optional<Max35Text> getClassType() {
		return classType == null ? Optional.empty() : Optional.of(classType);
	}

	public FinancialInstrument29 setClassType(Max35Text classType) {
		this.classType = classType;
		return this;
	}

	public Optional<FormOfSecurity1Code> getSecuritiesForm() {
		return securitiesForm == null ? Optional.empty() : Optional.of(securitiesForm);
	}

	public FinancialInstrument29 setSecuritiesForm(FormOfSecurity1Code securitiesForm) {
		this.securitiesForm = securitiesForm;
		return this;
	}

	public Optional<DistributionPolicy1Code> getDistributionPolicy() {
		return distributionPolicy == null ? Optional.empty() : Optional.of(distributionPolicy);
	}

	public FinancialInstrument29 setDistributionPolicy(DistributionPolicy1Code distributionPolicy) {
		this.distributionPolicy = distributionPolicy;
		return this;
	}

	public Optional<Max140Text> getProductGroup() {
		return productGroup == null ? Optional.empty() : Optional.of(productGroup);
	}

	public FinancialInstrument29 setProductGroup(Max140Text productGroup) {
		this.productGroup = productGroup;
		return this;
	}

	public Optional<BlockedHoldingDetails1> getBlockedHoldingDetails() {
		return blockedHoldingDetails == null ? Optional.empty() : Optional.of(blockedHoldingDetails);
	}

	public FinancialInstrument29 setBlockedHoldingDetails(com.tools20022.repository.msg.BlockedHoldingDetails1 blockedHoldingDetails) {
		this.blockedHoldingDetails = blockedHoldingDetails;
		return this;
	}
}