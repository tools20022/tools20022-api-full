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
import com.tools20022.repository.choice.SecurityIdentification23Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.InvestmentFundClass;
import com.tools20022.repository.entity.LocalName;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Security that is a sub-set of an investment fund, and is governed by the same
 * investment fund policy, for example, dividend option or valuation currency.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmIdentification
 * FinancialInstrument51.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmName
 * FinancialInstrument51.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmShortName
 * FinancialInstrument51.mmShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmSupplementaryIdentification
 * FinancialInstrument51.mmSupplementaryIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmClassType
 * FinancialInstrument51.mmClassType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmSecuritiesForm
 * FinancialInstrument51.mmSecuritiesForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmDistributionPolicy
 * FinancialInstrument51.mmDistributionPolicy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmProductGroup
 * FinancialInstrument51.mmProductGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmBlockedHoldingDetails
 * FinancialInstrument51.mmBlockedHoldingDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmPledging
 * FinancialInstrument51.mmPledging}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmCollateral
 * FinancialInstrument51.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmThirdPartyRights
 * FinancialInstrument51.mmThirdPartyRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmFundOwnership
 * FinancialInstrument51.mmFundOwnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmFundIntention
 * FinancialInstrument51.mmFundIntention}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51#mmOperationalStatus
 * FinancialInstrument51.mmOperationalStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
 * InvestmentFundClass}</li>
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
 * "FinancialInstrument51"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FinancialInstrument56
 * FinancialInstrument56}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29
 * FinancialInstrument29}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "FinancialInstrument51", propOrder = {"identification", "name", "shortName", "supplementaryIdentification", "classType", "securitiesForm", "distributionPolicy", "productGroup", "blockedHoldingDetails", "pledging",
		"collateral", "thirdPartyRights", "fundOwnership", "fundIntention", "operationalStatus"})
public class FinancialInstrument51 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SecurityIdentification23Choice identification;
	/**
	 * Identification of the security by an ISIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SecurityIdentification23Choice
	 * SecurityIdentification23Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
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
	 * definition} = "Identification of the security by an ISIN."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmIdentification
	 * FinancialInstrument56.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmIdentification
	 * FinancialInstrument29.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the security by an ISIN.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmIdentification);
			previousVersion_lazy = () -> FinancialInstrument29.mmIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification23Choice.mmObject();
		}
	};
	protected Max350Text name;
	/**
	 * Name of the financial instrument in free format text.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
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
	 * definition} = "Name of the financial instrument in free format text."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmName
	 * FinancialInstrument56.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmName
	 * FinancialInstrument29.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmFullName;
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the financial instrument in free format text.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmName);
			previousVersion_lazy = () -> FinancialInstrument29.mmName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected Max35Text shortName;
	/**
	 * Financial Instrument Short Name (FISN) expressed in conformance with the
	 * ISO 18774 standard.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LocalName#mmShortName
	 * LocalName.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial Instrument Short Name (FISN) expressed in conformance with the ISO 18774 standard."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmShortName
	 * FinancialInstrument56.mmShortName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmShortName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> LocalName.mmShortName;
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "ShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortName";
			definition = "Financial Instrument Short Name (FISN) expressed in conformance with the ISO 18774 standard.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmShortName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text supplementaryIdentification;
	/**
	 * Additional information about a financial instrument to help identify the
	 * instrument.
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmSupplementaryIdentification
	 * FinancialInstrument56.mmSupplementaryIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmSupplementaryIdentification
	 * FinancialInstrument29.mmSupplementaryIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSupplementaryIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "SplmtryId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryIdentification";
			definition = "Additional information about a financial instrument to help identify the instrument.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmSupplementaryIdentification);
			previousVersion_lazy = () -> FinancialInstrument29.mmSupplementaryIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text classType;
	/**
	 * Features of units offered by a fund. For example, a unit may have a
	 * specific load structure, for example, front end or back end, an income
	 * policy, for example, pay out or accumulate, or a trailer policy, for
	 * example, with or without. Fund classes are typically denoted by a single
	 * character, for example, 'Class A', 'Class 2'.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
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
	 * "Features of units offered by a fund. For example, a unit may have a specific load structure, for example, front end or back end, an income policy,  for example, pay out or accumulate, or a trailer policy,  for example, with or without. Fund classes are typically denoted by a single character,  for example, 'Class A', 'Class 2'."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmClassType
	 * FinancialInstrument56.mmClassType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmClassType
	 * FinancialInstrument29.mmClassType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClassType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmClassType;
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "ClssTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassType";
			definition = "Features of units offered by a fund. For example, a unit may have a specific load structure, for example, front end or back end, an income policy,  for example, pay out or accumulate, or a trailer policy,  for example, with or without. Fund classes are typically denoted by a single character,  for example, 'Class A', 'Class 2'.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmClassType);
			previousVersion_lazy = () -> FinancialInstrument29.mmClassType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected FormOfSecurity1Code securitiesForm;
	/**
	 * Form of ownership, that is registered or bearer.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Form of ownership, that is registered or bearer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmSecuritiesForm
	 * FinancialInstrument56.mmSecuritiesForm}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmSecuritiesForm
	 * FinancialInstrument29.mmSecuritiesForm}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesForm = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistrationForm;
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "SctiesForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesForm";
			definition = "Form of ownership, that is registered or bearer.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmSecuritiesForm);
			previousVersion_lazy = () -> FinancialInstrument29.mmSecuritiesForm;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FormOfSecurity1Code.mmObject();
		}
	};
	protected DistributionPolicy1Code distributionPolicy;
	/**
	 * Income policy relating to a class type, that is, if income is paid out or
	 * retained in the fund.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
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
	 * "Income policy relating to a class type, that is, if income is paid out or retained in the fund."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmDistributionPolicy
	 * FinancialInstrument56.mmDistributionPolicy}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmDistributionPolicy
	 * FinancialInstrument29.mmDistributionPolicy}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDistributionPolicy = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmDistributionPolicy;
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnPlcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionPolicy";
			definition = "Income policy relating to a class type, that is, if income is paid out or retained in the fund.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmDistributionPolicy);
			previousVersion_lazy = () -> FinancialInstrument29.mmDistributionPolicy;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DistributionPolicy1Code.mmObject();
		}
	};
	protected Max140Text productGroup;
	/**
	 * Company specific description of a group of funds.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmProductGroup
	 * FinancialInstrument56.mmProductGroup}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmProductGroup
	 * FinancialInstrument29.mmProductGroup}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProductGroup = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundClass.mmProductGroup;
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "PdctGrp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProductGroup";
			definition = "Company specific description of a group of funds.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmProductGroup);
			previousVersion_lazy = () -> FinancialInstrument29.mmProductGroup;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected BlockedHoldingDetails2 blockedHoldingDetails;
	/**
	 * When an account at fund or security level is blocked, this specifies
	 * details on how the holding is blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BlockedHoldingDetails2
	 * BlockedHoldingDetails2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
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
	 * "When an account at fund or security level is blocked, this specifies details on how the holding is blocked."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmBlockedHoldingDetails
	 * FinancialInstrument56.mmBlockedHoldingDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument29#mmBlockedHoldingDetails
	 * FinancialInstrument29.mmBlockedHoldingDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBlockedHoldingDetails = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "BlckdHldgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedHoldingDetails";
			definition = "When an account at fund or security level is blocked, this specifies details on how the holding is blocked.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmBlockedHoldingDetails);
			previousVersion_lazy = () -> FinancialInstrument29.mmBlockedHoldingDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.BlockedHoldingDetails2.mmObject();
		}
	};
	protected Eligible1Code pledging;
	/**
	 * Specifies whether the holdings in the account are eligible for pledging.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmPledging
	 * FinancialInstrument56.mmPledging}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPledging = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "Pldgg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pledging";
			definition = "Specifies whether the holdings in the account are eligible for pledging.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmPledging);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Eligible1Code.mmObject();
		}
	};
	protected Collateral1Code collateral;
	/**
	 * Specifies whether the holdings in the account are used as collateral.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmCollateral
	 * FinancialInstrument56.mmCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateral = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "Coll";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Specifies whether the holdings in the account are used as collateral.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmCollateral);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Collateral1Code.mmObject();
		}
	};
	protected ThirdPartyRights1 thirdPartyRights;
	/**
	 * Details of third party rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ThirdPartyRights1
	 * ThirdPartyRights1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
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
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmThirdPartyRights
	 * FinancialInstrument56.mmThirdPartyRights}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmThirdPartyRights = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "ThrdPtyRghts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThirdPartyRights";
			definition = "Details of third party rights.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmThirdPartyRights);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ThirdPartyRights1.mmObject();
		}
	};
	protected FundOwnership1Code fundOwnership;
	/**
	 * Specifies if all the shares are owned exclusively by the fund company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundOwnership1Code
	 * FundOwnership1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndOwnrsh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOwnership"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if all the shares are owned exclusively by the fund company. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmFundOwnership
	 * FinancialInstrument56.mmFundOwnership}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFundOwnership = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "FndOwnrsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundOwnership";
			definition = "Specifies if all the shares are owned exclusively by the fund company. ";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmFundOwnership);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FundOwnership1Code.mmObject();
		}
	};
	protected FundIntention1Code fundIntention;
	/**
	 * Specifies if the fund is intended for qualified investors.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FundIntention1Code
	 * FundIntention1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndIntntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundIntention"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the fund is intended for qualified investors."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmFundIntention
	 * FinancialInstrument56.mmFundIntention}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFundIntention = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "FndIntntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundIntention";
			definition = "Specifies if the fund is intended for qualified investors.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmFundIntention);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> FundIntention1Code.mmObject();
		}
	};
	protected OperationalStatus1Code operationalStatus;
	/**
	 * Operational status of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OperationalStatus1Code
	 * OperationalStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument51
	 * FinancialInstrument51}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Operational status of the fund."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument56#mmOperationalStatus
	 * FinancialInstrument56.mmOperationalStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOperationalStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FinancialInstrument51.mmObject();
			isDerived = false;
			xmlTag = "OprlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalStatus";
			definition = "Operational status of the fund.";
			nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmOperationalStatus);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OperationalStatus1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(FinancialInstrument51.mmIdentification, FinancialInstrument51.mmName, FinancialInstrument51.mmShortName, FinancialInstrument51.mmSupplementaryIdentification,
						FinancialInstrument51.mmClassType, FinancialInstrument51.mmSecuritiesForm, FinancialInstrument51.mmDistributionPolicy, FinancialInstrument51.mmProductGroup, FinancialInstrument51.mmBlockedHoldingDetails,
						FinancialInstrument51.mmPledging, FinancialInstrument51.mmCollateral, FinancialInstrument51.mmThirdPartyRights, FinancialInstrument51.mmFundOwnership, FinancialInstrument51.mmFundIntention,
						FinancialInstrument51.mmOperationalStatus);
				trace_lazy = () -> InvestmentFundClass.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialInstrument51";
				definition = "Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, for example, dividend option or valuation currency.";
				nextVersions_lazy = () -> Arrays.asList(FinancialInstrument56.mmObject());
				previousVersion_lazy = () -> FinancialInstrument29.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public SecurityIdentification23Choice getIdentification() {
		return identification;
	}

	public void setIdentification(SecurityIdentification23Choice identification) {
		this.identification = identification;
	}

	@XmlElement(name = "Nm")
	public Max350Text getName() {
		return name;
	}

	public void setName(Max350Text name) {
		this.name = name;
	}

	@XmlElement(name = "ShrtNm")
	public Max35Text getShortName() {
		return shortName;
	}

	public void setShortName(Max35Text shortName) {
		this.shortName = shortName;
	}

	@XmlElement(name = "SplmtryId")
	public Max35Text getSupplementaryIdentification() {
		return supplementaryIdentification;
	}

	public void setSupplementaryIdentification(Max35Text supplementaryIdentification) {
		this.supplementaryIdentification = supplementaryIdentification;
	}

	@XmlElement(name = "ClssTp")
	public Max35Text getClassType() {
		return classType;
	}

	public void setClassType(Max35Text classType) {
		this.classType = classType;
	}

	@XmlElement(name = "SctiesForm")
	public FormOfSecurity1Code getSecuritiesForm() {
		return securitiesForm;
	}

	public void setSecuritiesForm(FormOfSecurity1Code securitiesForm) {
		this.securitiesForm = securitiesForm;
	}

	@XmlElement(name = "DstrbtnPlcy")
	public DistributionPolicy1Code getDistributionPolicy() {
		return distributionPolicy;
	}

	public void setDistributionPolicy(DistributionPolicy1Code distributionPolicy) {
		this.distributionPolicy = distributionPolicy;
	}

	@XmlElement(name = "PdctGrp")
	public Max140Text getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(Max140Text productGroup) {
		this.productGroup = productGroup;
	}

	@XmlElement(name = "BlckdHldgDtls")
	public BlockedHoldingDetails2 getBlockedHoldingDetails() {
		return blockedHoldingDetails;
	}

	public void setBlockedHoldingDetails(com.tools20022.repository.msg.BlockedHoldingDetails2 blockedHoldingDetails) {
		this.blockedHoldingDetails = blockedHoldingDetails;
	}

	@XmlElement(name = "Pldgg")
	public Eligible1Code getPledging() {
		return pledging;
	}

	public void setPledging(Eligible1Code pledging) {
		this.pledging = pledging;
	}

	@XmlElement(name = "Coll")
	public Collateral1Code getCollateral() {
		return collateral;
	}

	public void setCollateral(Collateral1Code collateral) {
		this.collateral = collateral;
	}

	@XmlElement(name = "ThrdPtyRghts")
	public ThirdPartyRights1 getThirdPartyRights() {
		return thirdPartyRights;
	}

	public void setThirdPartyRights(com.tools20022.repository.msg.ThirdPartyRights1 thirdPartyRights) {
		this.thirdPartyRights = thirdPartyRights;
	}

	@XmlElement(name = "FndOwnrsh")
	public FundOwnership1Code getFundOwnership() {
		return fundOwnership;
	}

	public void setFundOwnership(FundOwnership1Code fundOwnership) {
		this.fundOwnership = fundOwnership;
	}

	@XmlElement(name = "FndIntntn")
	public FundIntention1Code getFundIntention() {
		return fundIntention;
	}

	public void setFundIntention(FundIntention1Code fundIntention) {
		this.fundIntention = fundIntention;
	}

	@XmlElement(name = "OprlSts")
	public OperationalStatus1Code getOperationalStatus() {
		return operationalStatus;
	}

	public void setOperationalStatus(OperationalStatus1Code operationalStatus) {
		this.operationalStatus = operationalStatus;
	}
}