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
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
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
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmParty
 * InvestmentAccountOwnershipInformation14.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmMoneyLaunderingCheck
 * InvestmentAccountOwnershipInformation14.mmMoneyLaunderingCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmInvestorProfileValidation
 * InvestmentAccountOwnershipInformation14.mmInvestorProfileValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmOwnershipBeneficiaryRate
 * InvestmentAccountOwnershipInformation14.mmOwnershipBeneficiaryRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmClientIdentification
 * InvestmentAccountOwnershipInformation14.mmClientIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFiscalExemption
 * InvestmentAccountOwnershipInformation14.mmFiscalExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmSignatoryRightIndicator
 * InvestmentAccountOwnershipInformation14.mmSignatoryRightIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmMiFIDClassification
 * InvestmentAccountOwnershipInformation14.mmMiFIDClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmNotification
 * InvestmentAccountOwnershipInformation14.mmNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFATCAFormType
 * InvestmentAccountOwnershipInformation14.mmFATCAFormType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFATCAStatus
 * InvestmentAccountOwnershipInformation14.mmFATCAStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmFATCAReportingDate
 * InvestmentAccountOwnershipInformation14.mmFATCAReportingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmCRSFormType
 * InvestmentAccountOwnershipInformation14.mmCRSFormType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmCRSStatus
 * InvestmentAccountOwnershipInformation14.mmCRSStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmCRSReportingDate
 * InvestmentAccountOwnershipInformation14.mmCRSReportingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmOtherIdentification
 * InvestmentAccountOwnershipInformation14.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmTaxExemption
 * InvestmentAccountOwnershipInformation14.mmTaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmTaxReporting
 * InvestmentAccountOwnershipInformation14.mmTaxReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmLanguage
 * InvestmentAccountOwnershipInformation14.mmLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmMailType
 * InvestmentAccountOwnershipInformation14.mmMailType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmCountryAndResidentialStatus
 * InvestmentAccountOwnershipInformation14.mmCountryAndResidentialStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmMonetaryWealth
 * InvestmentAccountOwnershipInformation14.mmMonetaryWealth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmEquityValue
 * InvestmentAccountOwnershipInformation14.mmEquityValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmWorkingCapital
 * InvestmentAccountOwnershipInformation14.mmWorkingCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmCompanyLink
 * InvestmentAccountOwnershipInformation14.mmCompanyLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmElectronicMailingServiceReference
 * InvestmentAccountOwnershipInformation14.mmElectronicMailingServiceReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmPrimaryCommunicationAddress
 * InvestmentAccountOwnershipInformation14.mmPrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmSecondaryCommunicationAddress
 * InvestmentAccountOwnershipInformation14.mmSecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmAdditionalRegulatoryInformation
 * InvestmentAccountOwnershipInformation14.mmAdditionalRegulatoryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmAccountingStatus
 * InvestmentAccountOwnershipInformation14.mmAccountingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmAdditionalInformation
 * InvestmentAccountOwnershipInformation14.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14#mmControllingParty
 * InvestmentAccountOwnershipInformation14.mmControllingParty}</li>
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
 * "InvestmentAccountOwnershipInformation14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of the ownership of a securities account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12
 * InvestmentAccountOwnershipInformation12}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccountOwnershipInformation14", propOrder = {"party", "moneyLaunderingCheck", "investorProfileValidation", "ownershipBeneficiaryRate", "clientIdentification", "fiscalExemption", "signatoryRightIndicator",
		"miFIDClassification", "notification", "fATCAFormType", "fATCAStatus", "fATCAReportingDate", "cRSFormType", "cRSStatus", "cRSReportingDate", "otherIdentification", "taxExemption", "taxReporting", "language", "mailType",
		"countryAndResidentialStatus", "monetaryWealth", "equityValue", "workingCapital", "companyLink", "electronicMailingServiceReference", "primaryCommunicationAddress", "secondaryCommunicationAddress",
		"additionalRegulatoryInformation", "accountingStatus", "additionalInformation", "controllingParty"})
public class InvestmentAccountOwnershipInformation14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pty", required = true)
	protected Party32Choice party;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Party32Choice Party32Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmParty
	 * InvestmentAccountOwnershipInformation12.mmParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Party.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Information about the organisation or individual person.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmParty;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Party32Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation12.mmMoneyLaunderingCheck}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMoneyLaunderingCheck = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "MnyLndrgChck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmMoneyLaunderingCheck;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * definition} =
	 * "Information to support Know Your Customer (KYC) processes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation12.mmInvestorProfileValidation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestorProfileValidation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmProfileCertification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "InvstrPrflVldtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorProfileValidation";
			definition = "Information to support Know Your Customer (KYC) processes.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmInvestorProfileValidation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyProfileInformation5.mmObject();
		}
	};
	@XmlElement(name = "OwnrshBnfcryRate")
	protected OwnershipBeneficiaryRate1 ownershipBeneficiaryRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OwnershipBeneficiaryRate1
	 * OwnershipBeneficiaryRate1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmOwnershipBeneficiaryRate
	 * InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation12.mmOwnershipBeneficiaryRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnershipBeneficiaryRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "OwnrshBnfcryRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnershipBeneficiaryRate";
			definition = "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions or purchases and or redemptions or sells will be allocated using the same percentage.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmOwnershipBeneficiaryRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.OwnershipBeneficiaryRate1.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmClientIdentification
	 * InvestmentAccountOwnershipInformation12.mmClientIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "ClntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientIdentification";
			definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmClientIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation12.mmFiscalExemption}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFiscalExemption = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmFiscalExemption;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "FsclXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalExemption";
			definition = "Indicates whether an owner of the account may benefit from a fiscal exemption or amnesty, for example, when declaring overseas investments.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmFiscalExemption;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmSignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation12.mmSignatoryRightIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSignatoryRightIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmSignatoryRightIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "SgntryRghtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatoryRightIndicator";
			definition = "Indicates whether the signature of the account owner is required to authorise transactions on the account.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmSignatoryRightIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmMiFIDClassification
	 * InvestmentAccountOwnershipInformation12.mmMiFIDClassification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMiFIDClassification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "MiFIDClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiFIDClassification";
			definition = "Details about the MiFID classification of the account owner.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmMiFIDClassification;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmNotification
	 * InvestmentAccountOwnershipInformation12.mmNotification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "Ntfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notification";
			definition = "Type of information that must be provided to the account holder.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmNotification;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation12.mmFATCAFormType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFATCAFormType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmFATCAFormType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "FATCAFormTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAFormType";
			definition = "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor or account owner.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmFATCAFormType;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation12.mmFATCAStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFATCAStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmFATCAStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "FATCASts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAStatus";
			definition = "Foreign Account Tax Compliance Act (FATCA) status of the investor or account owner.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmFATCAStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FATCAStatus2.mmObject();
		}
	};
	@XmlElement(name = "FATCARptgDt")
	protected ISODate fATCAReportingDate;
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
	 * {@linkplain com.tools20022.repository.entity.FATCAStatus#mmFATCAReportingDate
	 * FATCAStatus.mmFATCAReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FATCARptgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FATCAReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFATCAReportingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> FATCAStatus.mmFATCAReportingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "FATCARptgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAReportingDate";
			definition = "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "CRSFormTp")
	protected List<CRSForm1Choice> cRSFormType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.CRSForm1Choice
	 * CRSForm1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmFATCAFormType
	 * InvestmentAccountPartyRole.mmFATCAFormType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CRSFormTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRSFormType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of Common Reporting Standard (CRS) form submitted by the investor or account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCRSFormType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmFATCAFormType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "CRSFormTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRSFormType";
			definition = "Type of Common Reporting Standard (CRS) form submitted by the investor or account owner.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CRSForm1Choice.mmObject();
		}
	};
	@XmlElement(name = "CRSSts")
	protected List<com.tools20022.repository.msg.CRSStatus4> cRSStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CRSStatus4 CRSStatus4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole#mmCRSStatus
	 * InvestmentAccountPartyRole.mmCRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CRSSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRSStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common Reporting Standard (CRS) status of the investor or account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCRSStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmCRSStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "CRSSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRSStatus";
			definition = "Common Reporting Standard (CRS) status of the investor or account owner.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CRSStatus4.mmObject();
		}
	};
	@XmlElement(name = "CRSRptgDt")
	protected ISODate cRSReportingDate;
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
	 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmCRSReportingDate
	 * CRSStatus.mmCRSReportingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CRSRptgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CRSReportingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCRSReportingDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CRSStatus.mmCRSReportingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "CRSRptgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRSReportingDate";
			definition = "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmOtherIdentification
	 * InvestmentAccountOwnershipInformation12.mmOtherIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "OthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIdentification";
			definition = "Alternative identification, for example, national registration identification number, passport number, tax identification number. This may be an account number used to further identify the beneficial owner, for example, a Central Provident Fund (CFP) account as required for Singapore.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmOtherIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmTaxExemption
	 * InvestmentAccountOwnershipInformation12.mmTaxExemption}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxExemption = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "TaxXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemption";
			definition = "Tax advantage specific to the account party.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmTaxExemption;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxExemptionReason2Choice.mmObject();
		}
	};
	@XmlElement(name = "TaxRptg")
	protected List<com.tools20022.repository.msg.TaxReporting2> taxReporting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxReporting2
	 * TaxReporting2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxPartyRole#mmTax
	 * TaxPartyRole.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmTaxReporting
	 * InvestmentAccountOwnershipInformation12.mmTaxReporting}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxReporting = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TaxPartyRole.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "TaxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReporting";
			definition = "Details for the reporting of tax, for example, the country of taxation.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmTaxReporting;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxReporting2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmLanguage
	 * InvestmentAccountOwnershipInformation12.mmLanguage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLanguage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "Lang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Language";
			definition = "Language in which the organisation or person communicates.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmLanguage;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmMailType
	 * InvestmentAccountOwnershipInformation12.mmMailType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMailType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "MailTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailType";
			definition = "Method used for postal mailing.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmMailType;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmCountryAndResidentialStatus
	 * InvestmentAccountOwnershipInformation12.mmCountryAndResidentialStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryAndResidentialStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmResidentialStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "CtryAndResdtlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryAndResidentialStatus";
			definition = "Country and residential status of the organisation or individual person.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmCountryAndResidentialStatus;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmMonetaryWealth
	 * InvestmentAccountOwnershipInformation12.mmMonetaryWealth}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMonetaryWealth = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "MntryWlth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonetaryWealth";
			definition = "Annual wealth of the individual person or share capital value of the legal entity and date on which the annual wealth of the individual person was registered or declared or the date the stock value of the organisation was registered.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmMonetaryWealth;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmEquityValue
	 * InvestmentAccountOwnershipInformation12.mmEquityValue}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEquityValue = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "EqtyVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityValue";
			definition = "Amount of total assets minus liabilities of the individual person or the amount of the difference between assets and liabilities plus rights over obligations (net equity) of the organisation and the date on which the equity value was registered.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmEquityValue;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmWorkingCapital
	 * InvestmentAccountOwnershipInformation12.mmWorkingCapital}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWorkingCapital = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "WorkgCptl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkingCapital";
			definition = "Resource or value owned or used by a third-party company and the date on which the working capital amount was registered.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmWorkingCapital;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmCompanyLink
	 * InvestmentAccountOwnershipInformation12.mmCompanyLink}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCompanyLink = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Role.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "CpnyLk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyLink";
			definition = "Account owner's connection with the trading party or broker.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmCompanyLink;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmElectronicMailingServiceReference
	 * InvestmentAccountOwnershipInformation12.
	 * mmElectronicMailingServiceReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElectronicMailingServiceReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "ElctrncMlngSvcRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicMailingServiceReference";
			definition = "Reference to be specified when a letter (for example, an order confirmation) is sent by an automated mailing system.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmElectronicMailingServiceReference;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmPrimaryCommunicationAddress
	 * InvestmentAccountOwnershipInformation12.mmPrimaryCommunicationAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrimaryCommunicationAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "PmryComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCommunicationAddress";
			definition = "Communication device number or electronic address used for communication.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmPrimaryCommunicationAddress;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmSecondaryCommunicationAddress
	 * InvestmentAccountOwnershipInformation12.mmSecondaryCommunicationAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondaryCommunicationAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "ScndryComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCommunicationAddress";
			definition = "Communication device number or electronic address used for communication.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmSecondaryCommunicationAddress;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmAdditionalRegulatoryInformation
	 * InvestmentAccountOwnershipInformation12.mmAdditionalRegulatoryInformation
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalRegulatoryInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "AddtlRgltryInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRegulatoryInformation";
			definition = "Additional regulatory information about the investor or account owner that is required in some markets to support anti-money laundering laws.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmAdditionalRegulatoryInformation;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmAccountingStatus
	 * InvestmentAccountOwnershipInformation12.mmAccountingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountingStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "AcctgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountingStatus";
			definition = "Specifies if the account party is regarded as domestic or non-domestic for reporting purposes.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmAccountingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountingStatus1Choice.mmObject();
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<com.tools20022.repository.msg.AdditiononalInformation12> additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AdditiononalInformation12
	 * AdditiononalInformation12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
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
	 * "Additional information such as remarks or notes that must be conveyed about the party and or limitations and restrictions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation12#mmAdditionalInformation
	 * InvestmentAccountOwnershipInformation12.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information such as remarks or notes that must be conveyed about the party and or limitations and restrictions.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmAdditionalInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AdditiononalInformation12.mmObject();
		}
	};
	@XmlElement(name = "CtrlgPty")
	protected YesNoIndicator controllingParty;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControllingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party is the controlling person. \r\n(For an Entity that is a legal person, the term “Controlling Persons” means the natural person(s) who exercises control over the Entity. “Control” over an Entity is generally exercised by the natural person(s) who ultimately has a controlling ownership interest in the Entity. A “control ownership interest” depends on the ownership structure of the legal person and is usually identified on the basis of a threshold applying a risk-based approach (e.g. any person(s) owning more than a certain percentage of the legal person, such as 25%). Where no natural person(s) exercises control through ownership interests, the Controlling Person(s) of the Entity will be the natural person(s) who exercises control of the Entity through other means. Where no natural person(s) is identified as exercising control of the Entity, the Controlling Person(s) of the Entity will be the natural person(s) who holds the position of senior managing official.)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmControllingParty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
			isDerived = false;
			xmlTag = "CtrlgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControllingParty";
			definition = "Party is the controlling person. \r\n(For an Entity that is a legal person, the term “Controlling Persons” means the natural person(s) who exercises control over the Entity. “Control” over an Entity is generally exercised by the natural person(s) who ultimately has a controlling ownership interest in the Entity. A “control ownership interest” depends on the ownership structure of the legal person and is usually identified on the basis of a threshold applying a risk-based approach (e.g. any person(s) owning more than a certain percentage of the legal person, such as 25%). Where no natural person(s) exercises control through ownership interests, the Controlling Person(s) of the Entity will be the natural person(s) who exercises control of the Entity through other means. Where no natural person(s) is identified as exercising control of the Entity, the Controlling Person(s) of the Entity will be the natural person(s) who holds the position of senior managing official.).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmParty, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmMoneyLaunderingCheck,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmInvestorProfileValidation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmOwnershipBeneficiaryRate,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmClientIdentification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmFiscalExemption,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmSignatoryRightIndicator, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmMiFIDClassification,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmNotification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmFATCAFormType,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmFATCAStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmFATCAReportingDate,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmCRSFormType, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmCRSStatus,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmCRSReportingDate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmOtherIdentification,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmTaxExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmTaxReporting,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmLanguage, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmMailType,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmCountryAndResidentialStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmMonetaryWealth,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmEquityValue, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmWorkingCapital,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmCompanyLink, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmElectronicMailingServiceReference,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmPrimaryCommunicationAddress, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmSecondaryCommunicationAddress,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmAdditionalRegulatoryInformation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmAccountingStatus,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmAdditionalInformation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmControllingParty);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountOwnershipInformation14";
				definition = "Characteristics of the ownership of a securities account.";
				previousVersion_lazy = () -> InvestmentAccountOwnershipInformation12.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Party32Choice getParty() {
		return party;
	}

	public InvestmentAccountOwnershipInformation14 setParty(Party32Choice party) {
		this.party = Objects.requireNonNull(party);
		return this;
	}

	public Optional<MoneyLaunderingCheck1Choice> getMoneyLaunderingCheck() {
		return moneyLaunderingCheck == null ? Optional.empty() : Optional.of(moneyLaunderingCheck);
	}

	public InvestmentAccountOwnershipInformation14 setMoneyLaunderingCheck(MoneyLaunderingCheck1Choice moneyLaunderingCheck) {
		this.moneyLaunderingCheck = moneyLaunderingCheck;
		return this;
	}

	public List<PartyProfileInformation5> getInvestorProfileValidation() {
		return investorProfileValidation == null ? investorProfileValidation = new ArrayList<>() : investorProfileValidation;
	}

	public InvestmentAccountOwnershipInformation14 setInvestorProfileValidation(List<com.tools20022.repository.msg.PartyProfileInformation5> investorProfileValidation) {
		this.investorProfileValidation = Objects.requireNonNull(investorProfileValidation);
		return this;
	}

	public Optional<OwnershipBeneficiaryRate1> getOwnershipBeneficiaryRate() {
		return ownershipBeneficiaryRate == null ? Optional.empty() : Optional.of(ownershipBeneficiaryRate);
	}

	public InvestmentAccountOwnershipInformation14 setOwnershipBeneficiaryRate(com.tools20022.repository.msg.OwnershipBeneficiaryRate1 ownershipBeneficiaryRate) {
		this.ownershipBeneficiaryRate = ownershipBeneficiaryRate;
		return this;
	}

	public Optional<Max35Text> getClientIdentification() {
		return clientIdentification == null ? Optional.empty() : Optional.of(clientIdentification);
	}

	public InvestmentAccountOwnershipInformation14 setClientIdentification(Max35Text clientIdentification) {
		this.clientIdentification = clientIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getFiscalExemption() {
		return fiscalExemption == null ? Optional.empty() : Optional.of(fiscalExemption);
	}

	public InvestmentAccountOwnershipInformation14 setFiscalExemption(YesNoIndicator fiscalExemption) {
		this.fiscalExemption = fiscalExemption;
		return this;
	}

	public Optional<YesNoIndicator> getSignatoryRightIndicator() {
		return signatoryRightIndicator == null ? Optional.empty() : Optional.of(signatoryRightIndicator);
	}

	public InvestmentAccountOwnershipInformation14 setSignatoryRightIndicator(YesNoIndicator signatoryRightIndicator) {
		this.signatoryRightIndicator = signatoryRightIndicator;
		return this;
	}

	public Optional<MiFIDClassification1> getMiFIDClassification() {
		return miFIDClassification == null ? Optional.empty() : Optional.of(miFIDClassification);
	}

	public InvestmentAccountOwnershipInformation14 setMiFIDClassification(com.tools20022.repository.msg.MiFIDClassification1 miFIDClassification) {
		this.miFIDClassification = miFIDClassification;
		return this;
	}

	public List<Notification2> getNotification() {
		return notification == null ? notification = new ArrayList<>() : notification;
	}

	public InvestmentAccountOwnershipInformation14 setNotification(List<com.tools20022.repository.msg.Notification2> notification) {
		this.notification = Objects.requireNonNull(notification);
		return this;
	}

	public List<FATCAForm1Choice> getFATCAFormType() {
		return fATCAFormType == null ? fATCAFormType = new ArrayList<>() : fATCAFormType;
	}

	public InvestmentAccountOwnershipInformation14 setFATCAFormType(List<FATCAForm1Choice> fATCAFormType) {
		this.fATCAFormType = Objects.requireNonNull(fATCAFormType);
		return this;
	}

	public List<FATCAStatus2> getFATCAStatus() {
		return fATCAStatus == null ? fATCAStatus = new ArrayList<>() : fATCAStatus;
	}

	public InvestmentAccountOwnershipInformation14 setFATCAStatus(List<com.tools20022.repository.msg.FATCAStatus2> fATCAStatus) {
		this.fATCAStatus = Objects.requireNonNull(fATCAStatus);
		return this;
	}

	public Optional<ISODate> getFATCAReportingDate() {
		return fATCAReportingDate == null ? Optional.empty() : Optional.of(fATCAReportingDate);
	}

	public InvestmentAccountOwnershipInformation14 setFATCAReportingDate(ISODate fATCAReportingDate) {
		this.fATCAReportingDate = fATCAReportingDate;
		return this;
	}

	public List<CRSForm1Choice> getCRSFormType() {
		return cRSFormType == null ? cRSFormType = new ArrayList<>() : cRSFormType;
	}

	public InvestmentAccountOwnershipInformation14 setCRSFormType(List<CRSForm1Choice> cRSFormType) {
		this.cRSFormType = Objects.requireNonNull(cRSFormType);
		return this;
	}

	public List<CRSStatus4> getCRSStatus() {
		return cRSStatus == null ? cRSStatus = new ArrayList<>() : cRSStatus;
	}

	public InvestmentAccountOwnershipInformation14 setCRSStatus(List<com.tools20022.repository.msg.CRSStatus4> cRSStatus) {
		this.cRSStatus = Objects.requireNonNull(cRSStatus);
		return this;
	}

	public Optional<ISODate> getCRSReportingDate() {
		return cRSReportingDate == null ? Optional.empty() : Optional.of(cRSReportingDate);
	}

	public InvestmentAccountOwnershipInformation14 setCRSReportingDate(ISODate cRSReportingDate) {
		this.cRSReportingDate = cRSReportingDate;
		return this;
	}

	public List<GenericIdentification82> getOtherIdentification() {
		return otherIdentification == null ? otherIdentification = new ArrayList<>() : otherIdentification;
	}

	public InvestmentAccountOwnershipInformation14 setOtherIdentification(List<com.tools20022.repository.msg.GenericIdentification82> otherIdentification) {
		this.otherIdentification = Objects.requireNonNull(otherIdentification);
		return this;
	}

	public Optional<TaxExemptionReason2Choice> getTaxExemption() {
		return taxExemption == null ? Optional.empty() : Optional.of(taxExemption);
	}

	public InvestmentAccountOwnershipInformation14 setTaxExemption(TaxExemptionReason2Choice taxExemption) {
		this.taxExemption = taxExemption;
		return this;
	}

	public List<TaxReporting2> getTaxReporting() {
		return taxReporting == null ? taxReporting = new ArrayList<>() : taxReporting;
	}

	public InvestmentAccountOwnershipInformation14 setTaxReporting(List<com.tools20022.repository.msg.TaxReporting2> taxReporting) {
		this.taxReporting = Objects.requireNonNull(taxReporting);
		return this;
	}

	public Optional<LanguageCode> getLanguage() {
		return language == null ? Optional.empty() : Optional.of(language);
	}

	public InvestmentAccountOwnershipInformation14 setLanguage(LanguageCode language) {
		this.language = language;
		return this;
	}

	public Optional<MailType1Choice> getMailType() {
		return mailType == null ? Optional.empty() : Optional.of(mailType);
	}

	public InvestmentAccountOwnershipInformation14 setMailType(MailType1Choice mailType) {
		this.mailType = mailType;
		return this;
	}

	public Optional<CountryAndResidentialStatusType2> getCountryAndResidentialStatus() {
		return countryAndResidentialStatus == null ? Optional.empty() : Optional.of(countryAndResidentialStatus);
	}

	public InvestmentAccountOwnershipInformation14 setCountryAndResidentialStatus(com.tools20022.repository.msg.CountryAndResidentialStatusType2 countryAndResidentialStatus) {
		this.countryAndResidentialStatus = countryAndResidentialStatus;
		return this;
	}

	public Optional<DateAndAmount1> getMonetaryWealth() {
		return monetaryWealth == null ? Optional.empty() : Optional.of(monetaryWealth);
	}

	public InvestmentAccountOwnershipInformation14 setMonetaryWealth(com.tools20022.repository.msg.DateAndAmount1 monetaryWealth) {
		this.monetaryWealth = monetaryWealth;
		return this;
	}

	public Optional<DateAndAmount1> getEquityValue() {
		return equityValue == null ? Optional.empty() : Optional.of(equityValue);
	}

	public InvestmentAccountOwnershipInformation14 setEquityValue(com.tools20022.repository.msg.DateAndAmount1 equityValue) {
		this.equityValue = equityValue;
		return this;
	}

	public Optional<DateAndAmount1> getWorkingCapital() {
		return workingCapital == null ? Optional.empty() : Optional.of(workingCapital);
	}

	public InvestmentAccountOwnershipInformation14 setWorkingCapital(com.tools20022.repository.msg.DateAndAmount1 workingCapital) {
		this.workingCapital = workingCapital;
		return this;
	}

	public Optional<CompanyLink1Choice> getCompanyLink() {
		return companyLink == null ? Optional.empty() : Optional.of(companyLink);
	}

	public InvestmentAccountOwnershipInformation14 setCompanyLink(CompanyLink1Choice companyLink) {
		this.companyLink = companyLink;
		return this;
	}

	public Optional<Max350Text> getElectronicMailingServiceReference() {
		return electronicMailingServiceReference == null ? Optional.empty() : Optional.of(electronicMailingServiceReference);
	}

	public InvestmentAccountOwnershipInformation14 setElectronicMailingServiceReference(Max350Text electronicMailingServiceReference) {
		this.electronicMailingServiceReference = electronicMailingServiceReference;
		return this;
	}

	public List<CommunicationAddress6> getPrimaryCommunicationAddress() {
		return primaryCommunicationAddress == null ? primaryCommunicationAddress = new ArrayList<>() : primaryCommunicationAddress;
	}

	public InvestmentAccountOwnershipInformation14 setPrimaryCommunicationAddress(List<com.tools20022.repository.msg.CommunicationAddress6> primaryCommunicationAddress) {
		this.primaryCommunicationAddress = Objects.requireNonNull(primaryCommunicationAddress);
		return this;
	}

	public List<CommunicationAddress6> getSecondaryCommunicationAddress() {
		return secondaryCommunicationAddress == null ? secondaryCommunicationAddress = new ArrayList<>() : secondaryCommunicationAddress;
	}

	public InvestmentAccountOwnershipInformation14 setSecondaryCommunicationAddress(List<com.tools20022.repository.msg.CommunicationAddress6> secondaryCommunicationAddress) {
		this.secondaryCommunicationAddress = Objects.requireNonNull(secondaryCommunicationAddress);
		return this;
	}

	public Optional<RegulatoryInformation1> getAdditionalRegulatoryInformation() {
		return additionalRegulatoryInformation == null ? Optional.empty() : Optional.of(additionalRegulatoryInformation);
	}

	public InvestmentAccountOwnershipInformation14 setAdditionalRegulatoryInformation(com.tools20022.repository.msg.RegulatoryInformation1 additionalRegulatoryInformation) {
		this.additionalRegulatoryInformation = additionalRegulatoryInformation;
		return this;
	}

	public Optional<AccountingStatus1Choice> getAccountingStatus() {
		return accountingStatus == null ? Optional.empty() : Optional.of(accountingStatus);
	}

	public InvestmentAccountOwnershipInformation14 setAccountingStatus(AccountingStatus1Choice accountingStatus) {
		this.accountingStatus = accountingStatus;
		return this;
	}

	public List<AdditiononalInformation12> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public InvestmentAccountOwnershipInformation14 setAdditionalInformation(List<com.tools20022.repository.msg.AdditiononalInformation12> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}

	public Optional<YesNoIndicator> getControllingParty() {
		return controllingParty == null ? Optional.empty() : Optional.of(controllingParty);
	}

	public InvestmentAccountOwnershipInformation14 setControllingParty(YesNoIndicator controllingParty) {
		this.controllingParty = controllingParty;
		return this;
	}
}