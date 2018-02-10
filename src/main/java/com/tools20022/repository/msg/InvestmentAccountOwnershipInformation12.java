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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
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
 * Characteristics of the ownership of a securities account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmParty
 * InvestmentAccountOwnershipInformation12.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmMoneyLaunderingCheck
 * InvestmentAccountOwnershipInformation12.mmMoneyLaunderingCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmInvestorProfileValidation
 * InvestmentAccountOwnershipInformation12.mmInvestorProfileValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmOwnershipBeneficiaryRate
 * InvestmentAccountOwnershipInformation12.mmOwnershipBeneficiaryRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmClientIdentification
 * InvestmentAccountOwnershipInformation12.mmClientIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmFiscalExemption
 * InvestmentAccountOwnershipInformation12.mmFiscalExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmSignatoryRightIndicator
 * InvestmentAccountOwnershipInformation12.mmSignatoryRightIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmMiFIDClassification
 * InvestmentAccountOwnershipInformation12.mmMiFIDClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmNotification
 * InvestmentAccountOwnershipInformation12.mmNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmFATCAFormType
 * InvestmentAccountOwnershipInformation12.mmFATCAFormType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmFATCAStatus
 * InvestmentAccountOwnershipInformation12.mmFATCAStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmOtherIdentification
 * InvestmentAccountOwnershipInformation12.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmTaxExemption
 * InvestmentAccountOwnershipInformation12.mmTaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmTaxReporting
 * InvestmentAccountOwnershipInformation12.mmTaxReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmLanguage
 * InvestmentAccountOwnershipInformation12.mmLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmMailType
 * InvestmentAccountOwnershipInformation12.mmMailType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmCountryAndResidentialStatus
 * InvestmentAccountOwnershipInformation12.mmCountryAndResidentialStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmMonetaryWealth
 * InvestmentAccountOwnershipInformation12.mmMonetaryWealth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmEquityValue
 * InvestmentAccountOwnershipInformation12.mmEquityValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmWorkingCapital
 * InvestmentAccountOwnershipInformation12.mmWorkingCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmCompanyLink
 * InvestmentAccountOwnershipInformation12.mmCompanyLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmElectronicMailingServiceReference
 * InvestmentAccountOwnershipInformation12.mmElectronicMailingServiceReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmPrimaryCommunicationAddress
 * InvestmentAccountOwnershipInformation12.mmPrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmSecondaryCommunicationAddress
 * InvestmentAccountOwnershipInformation12.mmSecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmAdditionalRegulatoryInformation
 * InvestmentAccountOwnershipInformation12.mmAdditionalRegulatoryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmAccountingStatus
 * InvestmentAccountOwnershipInformation12.mmAccountingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmAdditionalInformation
 * InvestmentAccountOwnershipInformation12.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccountOwnershipInformation12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of the ownership of a securities account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
 * InvestmentAccountOwnershipInformation14}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10
 * InvestmentAccountOwnershipInformation10}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccountOwnershipInformation12", propOrder = {"party", "moneyLaunderingCheck", "investorProfileValidation", "ownershipBeneficiaryRate", "clientIdentification", "fiscalExemption", "signatoryRightIndicator",
		"miFIDClassification", "notification", "fATCAFormType", "fATCAStatus", "otherIdentification", "taxExemption", "taxReporting", "language", "mailType", "countryAndResidentialStatus", "monetaryWealth", "equityValue", "workingCapital",
		"companyLink", "electronicMailingServiceReference", "primaryCommunicationAddress", "secondaryCommunicationAddress", "additionalRegulatoryInformation", "accountingStatus", "additionalInformation"})
public class InvestmentAccountOwnershipInformation12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pty", required = true)
	protected Party31Choice party;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Party31Choice Party31Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the organisation or individual person."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmParty
	 * InvestmentAccountOwnershipInformation14.mmParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmParty
	 * InvestmentAccountOwnershipInformation10.mmParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Party.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Information about the organisation or individual person.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmParty);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation10.mmParty;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Party31Choice.mmObject();
		}
	};
	@XmlElement(name = "MnyLndrgChck")
	protected MoneyLaunderingCheck1Choice moneyLaunderingCheck;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MoneyLaunderingCheck1Choice
	 * MoneyLaunderingCheck1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
	 * Party.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MnyLndrgChck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of an identity check to prevent money laundering. This includes the counter-terrorism check."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation14.mmMoneyLaunderingCheck}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation10.mmMoneyLaunderingCheck}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMoneyLaunderingCheck = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "MnyLndrgChck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmMoneyLaunderingCheck);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation10.mmMoneyLaunderingCheck;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MoneyLaunderingCheck1Choice.mmObject();
		}
	};
	@XmlElement(name = "InvstrPrflVldtn")
	protected List<com.tools20022.repository.msg.PartyProfileInformation5> investorProfileValidation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyProfileInformation5
	 * PartyProfileInformation5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmProfileCertification
	 * PersonProfile.mmProfileCertification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstrPrflVldtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorProfileValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information to support Know Your Customer processes."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation14.mmInvestorProfileValidation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation10.mmInvestorProfileValidation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestorProfileValidation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmProfileCertification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "InvstrPrflVldtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorProfileValidation";
			definition = "Information to support Know Your Customer processes.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmInvestorProfileValidation);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation10.mmInvestorProfileValidation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
		}
	};
	@XmlElement(name = "OwnrshBnfcryRate")
	protected PercentageRate ownershipBeneficiaryRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmOwnershipBeneficiaryRate
	 * InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnrshBnfcryRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnershipBeneficiaryRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions or purchases and or redemptions or sells will be allocated using the same percentage."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation14.mmOwnershipBeneficiaryRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation10.mmOwnershipBeneficiaryRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnershipBeneficiaryRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "OwnrshBnfcryRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnershipBeneficiaryRate";
			definition = "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions or purchases and or redemptions or sells will be allocated using the same percentage.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmOwnershipBeneficiaryRate);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation10.mmOwnershipBeneficiaryRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "ClntId")
	protected Max35Text clientIdentification;
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by an organisation, to unambiguously identify a party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmClientIdentification
	 * InvestmentAccountOwnershipInformation14.mmClientIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmClientIdentification
	 * InvestmentAccountOwnershipInformation10.mmClientIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "ClntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientIdentification";
			definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmClientIdentification);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation10.mmClientIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "FsclXmptn")
	protected YesNoIndicator fiscalExemption;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmFiscalExemption
	 * InvestmentFundTax.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FsclXmptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalExemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether an owner of the account may benefit from a fiscal exemption or amnesty, for example, when declaring overseas investments."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation14.mmFiscalExemption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation10.mmFiscalExemption}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFiscalExemption = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmFiscalExemption;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "FsclXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalExemption";
			definition = "Indicates whether an owner of the account may benefit from a fiscal exemption or amnesty, for example, when declaring overseas investments.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmFiscalExemption);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation10.mmFiscalExemption;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "SgntryRghtInd")
	protected YesNoIndicator signatoryRightIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignatoryRightIndicator
	 * SignatureCondition.mmSignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgntryRghtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatoryRightIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the signature of the account owner is required to authorise transactions on the account."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmSignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation14.mmSignatoryRightIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmSignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation10.mmSignatoryRightIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSignatoryRightIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmSignatoryRightIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "SgntryRghtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatoryRightIndicator";
			definition = "Indicates whether the signature of the account owner is required to authorise transactions on the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmSignatoryRightIndicator);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation10.mmSignatoryRightIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "MiFIDClssfctn")
	protected MiFIDClassification1 miFIDClassification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MiFIDClassification1
	 * MiFIDClassification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MiFIDClssfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiFIDClassification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details about the MiFID classification of the account owner."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmMiFIDClassification
	 * InvestmentAccountOwnershipInformation14.mmMiFIDClassification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmMiFIDClassification
	 * InvestmentAccountOwnershipInformation10.mmMiFIDClassification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMiFIDClassification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "MiFIDClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiFIDClassification";
			definition = "Details about the MiFID classification of the account owner.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmMiFIDClassification);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation10.mmMiFIDClassification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.MiFIDClassification1.mmObject();
		}
	};
	@XmlElement(name = "Ntfctn")
	protected List<com.tools20022.repository.msg.Notification2> notification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Notification2
	 * Notification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ntfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Notification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of information that must be provided to the account holder."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmNotification
	 * InvestmentAccountOwnershipInformation14.mmNotification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmInformationDistribution
	 * InvestmentAccountOwnershipInformation10.mmInformationDistribution}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "Ntfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notification";
			definition = "Type of information that must be provided to the account holder.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmNotification);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation10.mmInformationDistribution;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Notification2.mmObject();
		}
	};
	@XmlElement(name = "FATCAFormTp")
	protected List<FATCAForm1Choice> fATCAFormType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.FATCAForm1Choice
	 * FATCAForm1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAFormType
	 * InvestmentAccountPartyRole.mmFATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FATCAFormTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAFormType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor or account owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation14.mmFATCAFormType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation10.mmFATCAFormType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFATCAFormType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmFATCAFormType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "FATCAFormTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAFormType";
			definition = "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor or account owner.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmFATCAFormType);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation10.mmFATCAFormType;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FATCAForm1Choice.mmObject();
		}
	};
	@XmlElement(name = "FATCASts")
	protected List<com.tools20022.repository.msg.FATCAStatus2> fATCAStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FATCAStatus2
	 * FATCAStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAStatus
	 * InvestmentAccountPartyRole.mmFATCAStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FATCASts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign Account Tax Compliance Act (FATCA) status of the investor or account owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation14.mmFATCAStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation10#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation10.mmFATCAStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFATCAStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmFATCAStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "FATCASts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAStatus";
			definition = "Foreign Account Tax Compliance Act (FATCA) status of the investor or account owner.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmFATCAStatus);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation10.mmFATCAStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FATCAStatus2.mmObject();
		}
	};
	@XmlElement(name = "OthrId")
	protected List<com.tools20022.repository.msg.GenericIdentification82> otherIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification82
	 * GenericIdentification82}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Alternative identification, for example, national registration identification number, passport number, tax identification number. This may be an account number used to further identify the beneficial owner, for example, a Central Provident Fund (CFP) account as required for Singapore."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmOtherIdentification
	 * InvestmentAccountOwnershipInformation14.mmOtherIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "OthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIdentification";
			definition = "Alternative identification, for example, national registration identification number, passport number, tax identification number. This may be an account number used to further identify the beneficial owner, for example, a Central Provident Fund (CFP) account as required for Singapore.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmOtherIdentification);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification82.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
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
	 * definition} = "Tax advantage specific to the account party."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmTaxExemption
	 * InvestmentAccountOwnershipInformation14.mmTaxExemption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxExemption = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "TaxXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemption";
			definition = "Tax advantage specific to the account party.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmTaxExemption);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxExemptionReason2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmTaxReporting
	 * InvestmentAccountOwnershipInformation14.mmTaxReporting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxReporting = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TaxPartyRole.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "TaxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReporting";
			definition = "Details for the reporting of tax, for example, the country of taxation.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmTaxReporting);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxReporting1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
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
	 * definition} =
	 * "Language in which the organisation or person communicates."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmLanguage
	 * InvestmentAccountOwnershipInformation14.mmLanguage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLanguage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "Lang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Language";
			definition = "Language in which the organisation or person communicates.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmLanguage);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	@XmlElement(name = "MailTp")
	protected MailType1Choice mailType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.MailType1Choice
	 * MailType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MailTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method used for postal mailing."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmMailType
	 * InvestmentAccountOwnershipInformation14.mmMailType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMailType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "MailTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailType";
			definition = "Method used for postal mailing.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmMailType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MailType1Choice.mmObject();
		}
	};
	@XmlElement(name = "CtryAndResdtlSts")
	protected CountryAndResidentialStatusType2 countryAndResidentialStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType2
	 * CountryAndResidentialStatusType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmResidentialStatus
	 * Person.mmResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryAndResdtlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryAndResidentialStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country and residential status of the organisation or individual person."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmCountryAndResidentialStatus
	 * InvestmentAccountOwnershipInformation14.mmCountryAndResidentialStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryAndResidentialStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmResidentialStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "CtryAndResdtlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryAndResidentialStatus";
			definition = "Country and residential status of the organisation or individual person.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmCountryAndResidentialStatus);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CountryAndResidentialStatusType2.mmObject();
		}
	};
	@XmlElement(name = "MntryWlth")
	protected DateAndAmount1 monetaryWealth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateAndAmount1
	 * DateAndAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntryWlth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonetaryWealth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Annual wealth of the individual person or share capital value of the legal entity and date on which the annual wealth of the individual person was registered or declared or the date the stock value of the organisation was registered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmMonetaryWealth
	 * InvestmentAccountOwnershipInformation14.mmMonetaryWealth}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMonetaryWealth = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "MntryWlth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonetaryWealth";
			definition = "Annual wealth of the individual person or share capital value of the legal entity and date on which the annual wealth of the individual person was registered or declared or the date the stock value of the organisation was registered.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmMonetaryWealth);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateAndAmount1.mmObject();
		}
	};
	@XmlElement(name = "EqtyVal")
	protected DateAndAmount1 equityValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateAndAmount1
	 * DateAndAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EqtyVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EquityValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of total assets minus liabilities of the individual person or the amount of the difference between assets and liabilities plus rights over obligations (net equity) of the organisation and the date on which the equity value was registered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmEquityValue
	 * InvestmentAccountOwnershipInformation14.mmEquityValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEquityValue = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "EqtyVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityValue";
			definition = "Amount of total assets minus liabilities of the individual person or the amount of the difference between assets and liabilities plus rights over obligations (net equity) of the organisation and the date on which the equity value was registered.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmEquityValue);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateAndAmount1.mmObject();
		}
	};
	@XmlElement(name = "WorkgCptl")
	protected DateAndAmount1 workingCapital;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateAndAmount1
	 * DateAndAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WorkgCptl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WorkingCapital"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Resource or value owned or used by a third-party company and the date on which the working capital amount was registered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmWorkingCapital
	 * InvestmentAccountOwnershipInformation14.mmWorkingCapital}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWorkingCapital = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "WorkgCptl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkingCapital";
			definition = "Resource or value owned or used by a third-party company and the date on which the working capital amount was registered.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmWorkingCapital);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateAndAmount1.mmObject();
		}
	};
	@XmlElement(name = "CpnyLk")
	protected CompanyLink1Choice companyLink;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.CompanyLink1Choice
	 * CompanyLink1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmPartyRole
	 * Role.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpnyLk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account owner's connection with the trading party or broker."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmCompanyLink
	 * InvestmentAccountOwnershipInformation14.mmCompanyLink}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCompanyLink = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Role.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "CpnyLk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyLink";
			definition = "Account owner's connection with the trading party or broker.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmCompanyLink);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CompanyLink1Choice.mmObject();
		}
	};
	@XmlElement(name = "ElctrncMlngSvcRef")
	protected Max350Text electronicMailingServiceReference;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElctrncMlngSvcRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicMailingServiceReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to be specified when a letter (for example, an order confirmation) is sent by an automated mailing system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmElectronicMailingServiceReference
	 * InvestmentAccountOwnershipInformation14.
	 * mmElectronicMailingServiceReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElectronicMailingServiceReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "ElctrncMlngSvcRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicMailingServiceReference";
			definition = "Reference to be specified when a letter (for example, an order confirmation) is sent by an automated mailing system.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmElectronicMailingServiceReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "PmryComAdr")
	protected List<com.tools20022.repository.msg.CommunicationAddress6> primaryCommunicationAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommunicationAddress6
	 * CommunicationAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryComAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryCommunicationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Communication device number or electronic address used for communication."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmPrimaryCommunicationAddress
	 * InvestmentAccountOwnershipInformation14.mmPrimaryCommunicationAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrimaryCommunicationAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "PmryComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCommunicationAddress";
			definition = "Communication device number or electronic address used for communication.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmPrimaryCommunicationAddress);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CommunicationAddress6.mmObject();
		}
	};
	@XmlElement(name = "ScndryComAdr")
	protected List<com.tools20022.repository.msg.CommunicationAddress6> secondaryCommunicationAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommunicationAddress6
	 * CommunicationAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryComAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryCommunicationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Communication device number or electronic address used for communication."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmSecondaryCommunicationAddress
	 * InvestmentAccountOwnershipInformation14.mmSecondaryCommunicationAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondaryCommunicationAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "ScndryComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCommunicationAddress";
			definition = "Communication device number or electronic address used for communication.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmSecondaryCommunicationAddress);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CommunicationAddress6.mmObject();
		}
	};
	@XmlElement(name = "AddtlRgltryInf")
	protected RegulatoryInformation1 additionalRegulatoryInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryInformation1
	 * RegulatoryInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRgltryInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRegulatoryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional regulatory information about the investor or account owner that is required in some markets to support anti-money laundering laws."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmAdditionalRegulatoryInformation
	 * InvestmentAccountOwnershipInformation14.mmAdditionalRegulatoryInformation
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalRegulatoryInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "AddtlRgltryInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRegulatoryInformation";
			definition = "Additional regulatory information about the investor or account owner that is required in some markets to support anti-money laundering laws.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmAdditionalRegulatoryInformation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.RegulatoryInformation1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
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
	 * "Specifies if the account party is regarded as domestic or non-domestic for reporting purposes."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmAccountingStatus
	 * InvestmentAccountOwnershipInformation14.mmAccountingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountingStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "AcctgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountingStatus";
			definition = "Specifies if the account party is regarded as domestic or non-domestic for reporting purposes.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmAccountingStatus);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountingStatus1Choice.mmObject();
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<com.tools20022.repository.msg.AccountRestrictions1> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
	 * InvestmentAccountOwnershipInformation12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information concerning limitations and restrictions on the account party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmAdditionalInformation
	 * InvestmentAccountOwnershipInformation14.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information concerning limitations and restrictions on the account party.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmAdditionalInformation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountRestrictions1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmParty, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmMoneyLaunderingCheck,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmInvestorProfileValidation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmOwnershipBeneficiaryRate,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmClientIdentification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmFiscalExemption,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmSignatoryRightIndicator, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmMiFIDClassification,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmNotification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmFATCAFormType,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmFATCAStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmOtherIdentification,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmTaxExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmTaxReporting,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmLanguage, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmMailType,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmCountryAndResidentialStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmMonetaryWealth,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmEquityValue, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmWorkingCapital,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmCompanyLink, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmElectronicMailingServiceReference,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmPrimaryCommunicationAddress, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmSecondaryCommunicationAddress,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmAdditionalRegulatoryInformation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmAccountingStatus,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12.mmAdditionalInformation);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountOwnershipInformation12";
				definition = "Characteristics of the ownership of a securities account.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation14.mmObject());
				previousVersion_lazy = () -> InvestmentAccountOwnershipInformation10.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Party31Choice getParty() {
		return party;
	}

	public InvestmentAccountOwnershipInformation12 setParty(Party31Choice party) {
		this.party = Objects.requireNonNull(party);
		return this;
	}

	public Optional<MoneyLaunderingCheck1Choice> getMoneyLaunderingCheck() {
		return moneyLaunderingCheck == null ? Optional.empty() : Optional.of(moneyLaunderingCheck);
	}

	public InvestmentAccountOwnershipInformation12 setMoneyLaunderingCheck(MoneyLaunderingCheck1Choice moneyLaunderingCheck) {
		this.moneyLaunderingCheck = moneyLaunderingCheck;
		return this;
	}

	public List<PartyProfileInformation5> getInvestorProfileValidation() {
		return investorProfileValidation == null ? investorProfileValidation = new ArrayList<>() : investorProfileValidation;
	}

	public InvestmentAccountOwnershipInformation12 setInvestorProfileValidation(List<com.tools20022.repository.msg.PartyProfileInformation5> investorProfileValidation) {
		this.investorProfileValidation = Objects.requireNonNull(investorProfileValidation);
		return this;
	}

	public Optional<PercentageRate> getOwnershipBeneficiaryRate() {
		return ownershipBeneficiaryRate == null ? Optional.empty() : Optional.of(ownershipBeneficiaryRate);
	}

	public InvestmentAccountOwnershipInformation12 setOwnershipBeneficiaryRate(PercentageRate ownershipBeneficiaryRate) {
		this.ownershipBeneficiaryRate = ownershipBeneficiaryRate;
		return this;
	}

	public Optional<Max35Text> getClientIdentification() {
		return clientIdentification == null ? Optional.empty() : Optional.of(clientIdentification);
	}

	public InvestmentAccountOwnershipInformation12 setClientIdentification(Max35Text clientIdentification) {
		this.clientIdentification = clientIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getFiscalExemption() {
		return fiscalExemption == null ? Optional.empty() : Optional.of(fiscalExemption);
	}

	public InvestmentAccountOwnershipInformation12 setFiscalExemption(YesNoIndicator fiscalExemption) {
		this.fiscalExemption = fiscalExemption;
		return this;
	}

	public Optional<YesNoIndicator> getSignatoryRightIndicator() {
		return signatoryRightIndicator == null ? Optional.empty() : Optional.of(signatoryRightIndicator);
	}

	public InvestmentAccountOwnershipInformation12 setSignatoryRightIndicator(YesNoIndicator signatoryRightIndicator) {
		this.signatoryRightIndicator = signatoryRightIndicator;
		return this;
	}

	public Optional<MiFIDClassification1> getMiFIDClassification() {
		return miFIDClassification == null ? Optional.empty() : Optional.of(miFIDClassification);
	}

	public InvestmentAccountOwnershipInformation12 setMiFIDClassification(com.tools20022.repository.msg.MiFIDClassification1 miFIDClassification) {
		this.miFIDClassification = miFIDClassification;
		return this;
	}

	public List<Notification2> getNotification() {
		return notification == null ? notification = new ArrayList<>() : notification;
	}

	public InvestmentAccountOwnershipInformation12 setNotification(List<com.tools20022.repository.msg.Notification2> notification) {
		this.notification = Objects.requireNonNull(notification);
		return this;
	}

	public List<FATCAForm1Choice> getFATCAFormType() {
		return fATCAFormType == null ? fATCAFormType = new ArrayList<>() : fATCAFormType;
	}

	public InvestmentAccountOwnershipInformation12 setFATCAFormType(List<FATCAForm1Choice> fATCAFormType) {
		this.fATCAFormType = Objects.requireNonNull(fATCAFormType);
		return this;
	}

	public List<FATCAStatus2> getFATCAStatus() {
		return fATCAStatus == null ? fATCAStatus = new ArrayList<>() : fATCAStatus;
	}

	public InvestmentAccountOwnershipInformation12 setFATCAStatus(List<com.tools20022.repository.msg.FATCAStatus2> fATCAStatus) {
		this.fATCAStatus = Objects.requireNonNull(fATCAStatus);
		return this;
	}

	public List<GenericIdentification82> getOtherIdentification() {
		return otherIdentification == null ? otherIdentification = new ArrayList<>() : otherIdentification;
	}

	public InvestmentAccountOwnershipInformation12 setOtherIdentification(List<com.tools20022.repository.msg.GenericIdentification82> otherIdentification) {
		this.otherIdentification = Objects.requireNonNull(otherIdentification);
		return this;
	}

	public Optional<TaxExemptionReason2Choice> getTaxExemption() {
		return taxExemption == null ? Optional.empty() : Optional.of(taxExemption);
	}

	public InvestmentAccountOwnershipInformation12 setTaxExemption(TaxExemptionReason2Choice taxExemption) {
		this.taxExemption = taxExemption;
		return this;
	}

	public List<TaxReporting1> getTaxReporting() {
		return taxReporting == null ? taxReporting = new ArrayList<>() : taxReporting;
	}

	public InvestmentAccountOwnershipInformation12 setTaxReporting(List<com.tools20022.repository.msg.TaxReporting1> taxReporting) {
		this.taxReporting = Objects.requireNonNull(taxReporting);
		return this;
	}

	public Optional<LanguageCode> getLanguage() {
		return language == null ? Optional.empty() : Optional.of(language);
	}

	public InvestmentAccountOwnershipInformation12 setLanguage(LanguageCode language) {
		this.language = language;
		return this;
	}

	public Optional<MailType1Choice> getMailType() {
		return mailType == null ? Optional.empty() : Optional.of(mailType);
	}

	public InvestmentAccountOwnershipInformation12 setMailType(MailType1Choice mailType) {
		this.mailType = mailType;
		return this;
	}

	public Optional<CountryAndResidentialStatusType2> getCountryAndResidentialStatus() {
		return countryAndResidentialStatus == null ? Optional.empty() : Optional.of(countryAndResidentialStatus);
	}

	public InvestmentAccountOwnershipInformation12 setCountryAndResidentialStatus(com.tools20022.repository.msg.CountryAndResidentialStatusType2 countryAndResidentialStatus) {
		this.countryAndResidentialStatus = countryAndResidentialStatus;
		return this;
	}

	public Optional<DateAndAmount1> getMonetaryWealth() {
		return monetaryWealth == null ? Optional.empty() : Optional.of(monetaryWealth);
	}

	public InvestmentAccountOwnershipInformation12 setMonetaryWealth(com.tools20022.repository.msg.DateAndAmount1 monetaryWealth) {
		this.monetaryWealth = monetaryWealth;
		return this;
	}

	public Optional<DateAndAmount1> getEquityValue() {
		return equityValue == null ? Optional.empty() : Optional.of(equityValue);
	}

	public InvestmentAccountOwnershipInformation12 setEquityValue(com.tools20022.repository.msg.DateAndAmount1 equityValue) {
		this.equityValue = equityValue;
		return this;
	}

	public Optional<DateAndAmount1> getWorkingCapital() {
		return workingCapital == null ? Optional.empty() : Optional.of(workingCapital);
	}

	public InvestmentAccountOwnershipInformation12 setWorkingCapital(com.tools20022.repository.msg.DateAndAmount1 workingCapital) {
		this.workingCapital = workingCapital;
		return this;
	}

	public Optional<CompanyLink1Choice> getCompanyLink() {
		return companyLink == null ? Optional.empty() : Optional.of(companyLink);
	}

	public InvestmentAccountOwnershipInformation12 setCompanyLink(CompanyLink1Choice companyLink) {
		this.companyLink = companyLink;
		return this;
	}

	public Optional<Max350Text> getElectronicMailingServiceReference() {
		return electronicMailingServiceReference == null ? Optional.empty() : Optional.of(electronicMailingServiceReference);
	}

	public InvestmentAccountOwnershipInformation12 setElectronicMailingServiceReference(Max350Text electronicMailingServiceReference) {
		this.electronicMailingServiceReference = electronicMailingServiceReference;
		return this;
	}

	public List<CommunicationAddress6> getPrimaryCommunicationAddress() {
		return primaryCommunicationAddress == null ? primaryCommunicationAddress = new ArrayList<>() : primaryCommunicationAddress;
	}

	public InvestmentAccountOwnershipInformation12 setPrimaryCommunicationAddress(List<com.tools20022.repository.msg.CommunicationAddress6> primaryCommunicationAddress) {
		this.primaryCommunicationAddress = Objects.requireNonNull(primaryCommunicationAddress);
		return this;
	}

	public List<CommunicationAddress6> getSecondaryCommunicationAddress() {
		return secondaryCommunicationAddress == null ? secondaryCommunicationAddress = new ArrayList<>() : secondaryCommunicationAddress;
	}

	public InvestmentAccountOwnershipInformation12 setSecondaryCommunicationAddress(List<com.tools20022.repository.msg.CommunicationAddress6> secondaryCommunicationAddress) {
		this.secondaryCommunicationAddress = Objects.requireNonNull(secondaryCommunicationAddress);
		return this;
	}

	public Optional<RegulatoryInformation1> getAdditionalRegulatoryInformation() {
		return additionalRegulatoryInformation == null ? Optional.empty() : Optional.of(additionalRegulatoryInformation);
	}

	public InvestmentAccountOwnershipInformation12 setAdditionalRegulatoryInformation(com.tools20022.repository.msg.RegulatoryInformation1 additionalRegulatoryInformation) {
		this.additionalRegulatoryInformation = additionalRegulatoryInformation;
		return this;
	}

	public Optional<AccountingStatus1Choice> getAccountingStatus() {
		return accountingStatus == null ? Optional.empty() : Optional.of(accountingStatus);
	}

	public InvestmentAccountOwnershipInformation12 setAccountingStatus(AccountingStatus1Choice accountingStatus) {
		this.accountingStatus = accountingStatus;
		return this;
	}

	public List<AccountRestrictions1> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public InvestmentAccountOwnershipInformation12 setAdditionalInformation(List<com.tools20022.repository.msg.AccountRestrictions1> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}
}