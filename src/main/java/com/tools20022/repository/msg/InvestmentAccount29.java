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
import com.tools20022.repository.choice.IndividualPersonIdentificationChoice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.choice.PartyIdentification5Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#IndividualOrOrganisationOwnerIdentificationRule
 * InvestmentAccount29.IndividualOrOrganisationOwnerIdentificationRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmName
 * InvestmentAccount29.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmDesignation
 * InvestmentAccount29.mmDesignation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmFundType
 * InvestmentAccount29.mmFundType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmFundFamilyName
 * InvestmentAccount29.mmFundFamilyName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmSecurityDetails
 * InvestmentAccount29.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmIndividualOwnerIdentification
 * InvestmentAccount29.mmIndividualOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmOrganisationOwnerIdentification
 * InvestmentAccount29.mmOrganisationOwnerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmIntermediary
 * InvestmentAccount29.mmIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmAccountServicer
 * InvestmentAccount29.mmAccountServicer}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccount29"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount44
 * InvestmentAccount44}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount52
 * InvestmentAccount52}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccount29", propOrder = {"name", "designation", "fundType", "fundFamilyName", "securityDetails", "individualOwnerIdentification", "organisationOwnerIdentification", "intermediary", "accountServicer"})
public class InvestmentAccount29 {

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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29
	 * InvestmentAccount29}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount44#mmName
	 * InvestmentAccount44.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.InvestmentAccount52#mmName
	 * InvestmentAccount52.mmName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AccountIdentification.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount29.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the account. It provides an additional means of identification, and is designated by the account servicer in agreement with the account owner.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount44.mmName, InvestmentAccount52.mmName);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29
	 * InvestmentAccount29}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount44#mmDesignation
	 * InvestmentAccount44.mmDesignation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#mmDesignation
	 * InvestmentAccount52.mmDesignation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDesignation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmDesignation;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount29.mmObject();
			isDerived = false;
			xmlTag = "Dsgnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Designation";
			definition = "Supplementary registration information applying to a specific block of units for dealing and reporting purposes. The supplementary registration information may be used when all the units are registered, for example, to a funds supermarket, but holdings for each investor have to reconciled individually.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount44.mmDesignation, InvestmentAccount52.mmDesignation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "FndTp")
	protected Max35Text fundType;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmFundType
	 * InvestmentFund.mmFundType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29
	 * InvestmentAccount29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal form of the fund, eg, UCITS, SICAV, OEIC, Unit Trust, and FCP."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount44#mmFundType
	 * InvestmentAccount44.mmFundType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#mmFundType
	 * InvestmentAccount52.mmFundType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFundType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmFundType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount29.mmObject();
			isDerived = false;
			xmlTag = "FndTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundType";
			definition = "Legal form of the fund, eg, UCITS, SICAV, OEIC, Unit Trust, and FCP.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount44.mmFundType, InvestmentAccount52.mmFundType);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29
	 * InvestmentAccount29}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount44#mmFundFamilyName
	 * InvestmentAccount44.mmFundFamilyName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#mmFundFamilyName
	 * InvestmentAccount52.mmFundFamilyName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFundFamilyName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundFamily.mmFundFamilyName;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount29.mmObject();
			isDerived = false;
			xmlTag = "FndFmlyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundFamilyName";
			definition = "Name of the investment fund family.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount44.mmFundFamilyName, InvestmentAccount52.mmFundFamilyName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "SctyDtls")
	protected FinancialInstrument10 securityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument10
	 * FinancialInstrument10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentFundClass
	 * InvestmentAccount.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29
	 * InvestmentAccount29}</li>
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
	 * "Detailed information about the investment fund associated to the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount44#mmSecurityDetails
	 * InvestmentAccount44.mmSecurityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#mmSecurityDetails
	 * InvestmentAccount52.mmSecurityDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecurityDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount29.mmObject();
			isDerived = false;
			xmlTag = "SctyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			definition = "Detailed information about the investment fund associated to the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount44.mmSecurityDetails, InvestmentAccount52.mmSecurityDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument10.mmObject();
		}
	};
	@XmlElement(name = "IndvOwnrId")
	protected IndividualPersonIdentificationChoice individualOwnerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentificationChoice
	 * IndividualPersonIdentificationChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPersonIdentification
	 * Person.mmPersonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29
	 * InvestmentAccount29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvOwnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualOwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an individual person whom legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndividualOwnerIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Person.mmPersonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount29.mmObject();
			isDerived = false;
			xmlTag = "IndvOwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOwnerIdentification";
			definition = "Identification of an individual person whom legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> IndividualPersonIdentificationChoice.mmObject();
		}
	};
	@XmlElement(name = "OrgOwnrId")
	protected PartyIdentification5Choice organisationOwnerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification5Choice
	 * PartyIdentification5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29
	 * InvestmentAccount29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgOwnrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationOwnerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of an organisation that legally owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrganisationOwnerIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount29.mmObject();
			isDerived = false;
			xmlTag = "OrgOwnrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationOwnerIdentification";
			definition = "Identification of an organisation that legally owns the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification5Choice.mmObject();
		}
	};
	@XmlElement(name = "Intrmy")
	protected List<com.tools20022.repository.msg.Intermediary7> intermediary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary7
	 * Intermediary7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.IntermediaryRole
	 * IntermediaryRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29
	 * InvestmentAccount29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Intrmy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that provides services relating to financial products to investors, eg, advice on products and placement of orders for the investment fund."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount44#mmIntermediary
	 * InvestmentAccount44.mmIntermediary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#mmIntermediary
	 * InvestmentAccount52.mmIntermediary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIntermediary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> IntermediaryRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount29.mmObject();
			isDerived = false;
			xmlTag = "Intrmy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			definition = "Party that provides services relating to financial products to investors, eg, advice on products and placement of orders for the investment fund.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount44.mmIntermediary, InvestmentAccount52.mmIntermediary);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Intermediary7.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29
	 * InvestmentAccount29}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount44#mmAccountServicer
	 * InvestmentAccount44.mmAccountServicer}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount52#mmAccountServicer
	 * InvestmentAccount52.mmAccountServicer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountServicer = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccount29.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccount44.mmAccountServicer, InvestmentAccount52.mmAccountServicer);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	/**
	 * Either IndividualOwnerIdentification or OrganisationOwnerIdentification
	 * may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29
	 * InvestmentAccount29}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmIndividualOwnerIdentification
	 * InvestmentAccount29.mmIndividualOwnerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount29#mmOrganisationOwnerIdentification
	 * InvestmentAccount29.mmOrganisationOwnerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualOrOrganisationOwnerIdentificationRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either IndividualOwnerIdentification or OrganisationOwnerIdentification may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor IndividualOrOrganisationOwnerIdentificationRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualOrOrganisationOwnerIdentificationRule";
			definition = "Either IndividualOwnerIdentification or OrganisationOwnerIdentification may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.InvestmentAccount29.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount29.mmIndividualOwnerIdentification, com.tools20022.repository.msg.InvestmentAccount29.mmOrganisationOwnerIdentification);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount29.mmName, com.tools20022.repository.msg.InvestmentAccount29.mmDesignation,
						com.tools20022.repository.msg.InvestmentAccount29.mmFundType, com.tools20022.repository.msg.InvestmentAccount29.mmFundFamilyName, com.tools20022.repository.msg.InvestmentAccount29.mmSecurityDetails,
						com.tools20022.repository.msg.InvestmentAccount29.mmIndividualOwnerIdentification, com.tools20022.repository.msg.InvestmentAccount29.mmOrganisationOwnerIdentification,
						com.tools20022.repository.msg.InvestmentAccount29.mmIntermediary, com.tools20022.repository.msg.InvestmentAccount29.mmAccountServicer);
				trace_lazy = () -> InvestmentAccount.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "InvestmentAccount29";
				definition = "Account between an investor(s) and a fund manager or a fund. The account can contain holdings in any investment fund or investment fund class managed (or distributed) by the fund manager, within the same fund family.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentAccount44.mmObject(), InvestmentAccount52.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount29.IndividualOrOrganisationOwnerIdentificationRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public InvestmentAccount29 setName(Max35Text name) {
		this.name = name;
		return this;
	}

	public Optional<Max35Text> getDesignation() {
		return designation == null ? Optional.empty() : Optional.of(designation);
	}

	public InvestmentAccount29 setDesignation(Max35Text designation) {
		this.designation = designation;
		return this;
	}

	public Optional<Max35Text> getFundType() {
		return fundType == null ? Optional.empty() : Optional.of(fundType);
	}

	public InvestmentAccount29 setFundType(Max35Text fundType) {
		this.fundType = fundType;
		return this;
	}

	public Optional<Max350Text> getFundFamilyName() {
		return fundFamilyName == null ? Optional.empty() : Optional.of(fundFamilyName);
	}

	public InvestmentAccount29 setFundFamilyName(Max350Text fundFamilyName) {
		this.fundFamilyName = fundFamilyName;
		return this;
	}

	public Optional<FinancialInstrument10> getSecurityDetails() {
		return securityDetails == null ? Optional.empty() : Optional.of(securityDetails);
	}

	public InvestmentAccount29 setSecurityDetails(com.tools20022.repository.msg.FinancialInstrument10 securityDetails) {
		this.securityDetails = securityDetails;
		return this;
	}

	public Optional<IndividualPersonIdentificationChoice> getIndividualOwnerIdentification() {
		return individualOwnerIdentification == null ? Optional.empty() : Optional.of(individualOwnerIdentification);
	}

	public InvestmentAccount29 setIndividualOwnerIdentification(IndividualPersonIdentificationChoice individualOwnerIdentification) {
		this.individualOwnerIdentification = individualOwnerIdentification;
		return this;
	}

	public Optional<PartyIdentification5Choice> getOrganisationOwnerIdentification() {
		return organisationOwnerIdentification == null ? Optional.empty() : Optional.of(organisationOwnerIdentification);
	}

	public InvestmentAccount29 setOrganisationOwnerIdentification(PartyIdentification5Choice organisationOwnerIdentification) {
		this.organisationOwnerIdentification = organisationOwnerIdentification;
		return this;
	}

	public List<Intermediary7> getIntermediary() {
		return intermediary == null ? intermediary = new ArrayList<>() : intermediary;
	}

	public InvestmentAccount29 setIntermediary(List<com.tools20022.repository.msg.Intermediary7> intermediary) {
		this.intermediary = Objects.requireNonNull(intermediary);
		return this;
	}

	public Optional<PartyIdentification2Choice> getAccountServicer() {
		return accountServicer == null ? Optional.empty() : Optional.of(accountServicer);
	}

	public InvestmentAccount29 setAccountServicer(PartyIdentification2Choice accountServicer) {
		this.accountServicer = accountServicer;
		return this;
	}
}