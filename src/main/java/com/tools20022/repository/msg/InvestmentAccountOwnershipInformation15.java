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
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Characteristics of the ownership of an investment account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmParty
 * InvestmentAccountOwnershipInformation15.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmMoneyLaunderingCheck
 * InvestmentAccountOwnershipInformation15.mmMoneyLaunderingCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmModifiedInvestorProfileValidation
 * InvestmentAccountOwnershipInformation15.mmModifiedInvestorProfileValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmOwnershipBeneficiaryRate
 * InvestmentAccountOwnershipInformation15.mmOwnershipBeneficiaryRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmClientIdentification
 * InvestmentAccountOwnershipInformation15.mmClientIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFiscalExemption
 * InvestmentAccountOwnershipInformation15.mmFiscalExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmSignatoryRightIndicator
 * InvestmentAccountOwnershipInformation15.mmSignatoryRightIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmMiFIDClassification
 * InvestmentAccountOwnershipInformation15.mmMiFIDClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmNotification
 * InvestmentAccountOwnershipInformation15.mmNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFATCAFormType
 * InvestmentAccountOwnershipInformation15.mmFATCAFormType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFATCAStatus
 * InvestmentAccountOwnershipInformation15.mmFATCAStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFATCAReportingDate
 * InvestmentAccountOwnershipInformation15.mmFATCAReportingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmCRSFormType
 * InvestmentAccountOwnershipInformation15.mmCRSFormType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmCRSStatus
 * InvestmentAccountOwnershipInformation15.mmCRSStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmCRSReportingDate
 * InvestmentAccountOwnershipInformation15.mmCRSReportingDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmOtherIdentification
 * InvestmentAccountOwnershipInformation15.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmTaxExemption
 * InvestmentAccountOwnershipInformation15.mmTaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmTaxReporting
 * InvestmentAccountOwnershipInformation15.mmTaxReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmLanguage
 * InvestmentAccountOwnershipInformation15.mmLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmMailType
 * InvestmentAccountOwnershipInformation15.mmMailType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmCountryAndResidentialStatus
 * InvestmentAccountOwnershipInformation15.mmCountryAndResidentialStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmMonetaryWealth
 * InvestmentAccountOwnershipInformation15.mmMonetaryWealth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmEquityValue
 * InvestmentAccountOwnershipInformation15.mmEquityValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmWorkingCapital
 * InvestmentAccountOwnershipInformation15.mmWorkingCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmCompanyLink
 * InvestmentAccountOwnershipInformation15.mmCompanyLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmElectronicMailingServiceReference
 * InvestmentAccountOwnershipInformation15.mmElectronicMailingServiceReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmPrimaryCommunicationAddress
 * InvestmentAccountOwnershipInformation15.mmPrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmSecondaryCommunicationAddress
 * InvestmentAccountOwnershipInformation15.mmSecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmAdditionalRegulatoryInformation
 * InvestmentAccountOwnershipInformation15.mmAdditionalRegulatoryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmAccountingStatus
 * InvestmentAccountOwnershipInformation15.mmAccountingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmAdditionalInformation
 * InvestmentAccountOwnershipInformation15.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmControllingParty
 * InvestmentAccountOwnershipInformation15.mmControllingParty}</li>
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
 * "InvestmentAccountOwnershipInformation15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of the ownership of an investment account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
 * InvestmentAccountOwnershipInformation13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentAccountOwnershipInformation15", propOrder = {"party", "moneyLaunderingCheck", "modifiedInvestorProfileValidation", "ownershipBeneficiaryRate", "clientIdentification", "fiscalExemption", "signatoryRightIndicator",
		"miFIDClassification", "notification", "fATCAFormType", "fATCAStatus", "fATCAReportingDate", "cRSFormType", "cRSStatus", "cRSReportingDate", "otherIdentification", "taxExemption", "taxReporting", "language", "mailType",
		"countryAndResidentialStatus", "monetaryWealth", "equityValue", "workingCapital", "companyLink", "electronicMailingServiceReference", "primaryCommunicationAddress", "secondaryCommunicationAddress",
		"additionalRegulatoryInformation", "accountingStatus", "additionalInformation", "controllingParty"})
public class InvestmentAccountOwnershipInformation15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Pty", required = true)
	protected Party33Choice party;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Party33Choice Party33Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmParty
	 * InvestmentAccountOwnershipInformation13.mmParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Party33Choice> mmParty = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Party33Choice>() {
		{
			businessComponentTrace_lazy = () -> Party.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Information about the organisation or individual person.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmParty;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Party33Choice.mmObject();
		}

		@Override
		public Party33Choice getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getParty();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Party33Choice value) {
			obj.setParty(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation13.mmMoneyLaunderingCheck}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<MoneyLaunderingCheck1Choice>> mmMoneyLaunderingCheck = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<MoneyLaunderingCheck1Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "MnyLndrgChck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmMoneyLaunderingCheck;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MoneyLaunderingCheck1Choice.mmObject();
		}

		@Override
		public Optional<MoneyLaunderingCheck1Choice> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getMoneyLaunderingCheck();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<MoneyLaunderingCheck1Choice> value) {
			obj.setMoneyLaunderingCheck(value.orElse(null));
		}
	};
	@XmlElement(name = "ModfdInvstrPrflVldtn")
	protected List<ModificationScope27> modifiedInvestorProfileValidation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ModificationScope27
	 * ModificationScope27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmProfileCertification
	 * PersonProfile.mmProfileCertification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdInvstrPrflVldtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedInvestorProfileValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the party profile to be inserted or deleted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmModifiedInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation13.
	 * mmModifiedInvestorProfileValidation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<ModificationScope27>> mmModifiedInvestorProfileValidation = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<ModificationScope27>>() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmProfileCertification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "ModfdInvstrPrflVldtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedInvestorProfileValidation";
			definition = "Information related to the party profile to be inserted or deleted.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmModifiedInvestorProfileValidation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ModificationScope27.mmObject();
		}

		@Override
		public List<ModificationScope27> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getModifiedInvestorProfileValidation();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, List<ModificationScope27> value) {
			obj.setModifiedInvestorProfileValidation(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation13.mmOwnershipBeneficiaryRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<OwnershipBeneficiaryRate1>> mmOwnershipBeneficiaryRate = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<OwnershipBeneficiaryRate1>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "OwnrshBnfcryRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnershipBeneficiaryRate";
			definition = "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions or purchases and or redemptions or sells will be allocated using the same percentage.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmOwnershipBeneficiaryRate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OwnershipBeneficiaryRate1.mmObject();
		}

		@Override
		public Optional<OwnershipBeneficiaryRate1> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getOwnershipBeneficiaryRate();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<OwnershipBeneficiaryRate1> value) {
			obj.setOwnershipBeneficiaryRate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmClientIdentification
	 * InvestmentAccountOwnershipInformation13.mmClientIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<Max35Text>> mmClientIdentification = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "ClntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientIdentification";
			definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmClientIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getClientIdentification();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<Max35Text> value) {
			obj.setClientIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation13.mmFiscalExemption}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<YesNoIndicator>> mmFiscalExemption = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmFiscalExemption;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "FsclXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalExemption";
			definition = "Indicates whether an owner of the account may benefit from a fiscal exemption or amnesty, for example, when declaring overseas investments.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmFiscalExemption;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getFiscalExemption();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<YesNoIndicator> value) {
			obj.setFiscalExemption(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmSignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation13.mmSignatoryRightIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<YesNoIndicator>> mmSignatoryRightIndicator = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmSignatoryRightIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "SgntryRghtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatoryRightIndicator";
			definition = "Indicates whether the signature of the account owner is required to authorise transactions on the account.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmSignatoryRightIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getSignatoryRightIndicator();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<YesNoIndicator> value) {
			obj.setSignatoryRightIndicator(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmMiFIDClassification
	 * InvestmentAccountOwnershipInformation13.mmMiFIDClassification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<MiFIDClassification1>> mmMiFIDClassification = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<MiFIDClassification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "MiFIDClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiFIDClassification";
			definition = "Details about the MiFID classification of the account owner.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmMiFIDClassification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MiFIDClassification1.mmObject();
		}

		@Override
		public Optional<MiFIDClassification1> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getMiFIDClassification();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<MiFIDClassification1> value) {
			obj.setMiFIDClassification(value.orElse(null));
		}
	};
	@XmlElement(name = "Ntfctn")
	protected List<Notification2> notification;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmNotification
	 * InvestmentAccountOwnershipInformation13.mmNotification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, List<Notification2>> mmNotification = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, List<Notification2>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "Ntfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notification";
			definition = "Type of information that must be provided to the account holder.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmNotification;
			minOccurs = 0;
			complexType_lazy = () -> Notification2.mmObject();
		}

		@Override
		public List<Notification2> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getNotification();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, List<Notification2> value) {
			obj.setNotification(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation13.mmFATCAFormType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<FATCAForm1Choice>> mmFATCAFormType = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<FATCAForm1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmFATCAFormType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "FATCAFormTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAFormType";
			definition = "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor or account owner.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmFATCAFormType;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FATCAForm1Choice.mmObject();
		}

		@Override
		public List<FATCAForm1Choice> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getFATCAFormType();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, List<FATCAForm1Choice> value) {
			obj.setFATCAFormType(value);
		}
	};
	@XmlElement(name = "FATCASts")
	protected List<FATCAStatus2> fATCAStatus;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation13.mmFATCAStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<FATCAStatus2>> mmFATCAStatus = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<FATCAStatus2>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmFATCAStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "FATCASts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAStatus";
			definition = "Foreign Account Tax Compliance Act (FATCA) status of the investor or account owner.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmFATCAStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FATCAStatus2.mmObject();
		}

		@Override
		public List<FATCAStatus2> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getFATCAStatus();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, List<FATCAStatus2> value) {
			obj.setFATCAStatus(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<ISODate>> mmFATCAReportingDate = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> FATCAStatus.mmFATCAReportingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "FATCARptgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAReportingDate";
			definition = "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getFATCAReportingDate();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<ISODate> value) {
			obj.setFATCAReportingDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<CRSForm1Choice>> mmCRSFormType = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<CRSForm1Choice>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmFATCAFormType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "CRSFormTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRSFormType";
			definition = "Type of Common Reporting Standard (CRS) form submitted by the investor or account owner.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CRSForm1Choice.mmObject();
		}

		@Override
		public List<CRSForm1Choice> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getCRSFormType();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, List<CRSForm1Choice> value) {
			obj.setCRSFormType(value);
		}
	};
	@XmlElement(name = "CRSSts")
	protected List<CRSStatus4> cRSStatus;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<CRSStatus4>> mmCRSStatus = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<CRSStatus4>>() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmCRSStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "CRSSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRSStatus";
			definition = "Common Reporting Standard (CRS) status of the investor or account owner.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CRSStatus4.mmObject();
		}

		@Override
		public List<CRSStatus4> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getCRSStatus();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, List<CRSStatus4> value) {
			obj.setCRSStatus(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<ISODate>> mmCRSReportingDate = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> CRSStatus.mmCRSReportingDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "CRSRptgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CRSReportingDate";
			definition = "Date provided by the account owner to inform the account servicer of the date on which the holdings must be reported before the account is subsequently closed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getCRSReportingDate();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<ISODate> value) {
			obj.setCRSReportingDate(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrId")
	protected List<GenericIdentification82> otherIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmOtherIdentification
	 * InvestmentAccountOwnershipInformation13.mmOtherIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<GenericIdentification82>> mmOtherIdentification = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<GenericIdentification82>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "OthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIdentification";
			definition = "Alternative identification, for example, national registration identification number, passport number, tax identification number. This may be an account number used to further identify the beneficial owner, for example, a Central Provident Fund (CFP) account as required for Singapore.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmOtherIdentification;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification82.mmObject();
		}

		@Override
		public List<GenericIdentification82> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getOtherIdentification();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, List<GenericIdentification82> value) {
			obj.setOtherIdentification(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmTaxExemption
	 * InvestmentAccountOwnershipInformation13.mmTaxExemption}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<TaxExemptionReason2Choice>> mmTaxExemption = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<TaxExemptionReason2Choice>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "TaxXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemption";
			definition = "Tax advantage specific to the account party.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmTaxExemption;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxExemptionReason2Choice.mmObject();
		}

		@Override
		public Optional<TaxExemptionReason2Choice> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getTaxExemption();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<TaxExemptionReason2Choice> value) {
			obj.setTaxExemption(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxRptg")
	protected List<TaxReporting2> taxReporting;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmTaxReporting
	 * InvestmentAccountOwnershipInformation13.mmTaxReporting}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<TaxReporting2>> mmTaxReporting = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<TaxReporting2>>() {
		{
			businessElementTrace_lazy = () -> TaxPartyRole.mmTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "TaxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReporting";
			definition = "Details for the reporting of tax, for example, the country of taxation.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmTaxReporting;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TaxReporting2.mmObject();
		}

		@Override
		public List<TaxReporting2> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getTaxReporting();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, List<TaxReporting2> value) {
			obj.setTaxReporting(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmLanguage
	 * InvestmentAccountOwnershipInformation13.mmLanguage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<LanguageCode>> mmLanguage = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<LanguageCode>>() {
		{
			businessElementTrace_lazy = () -> Account.mmLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "Lang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Language";
			definition = "Language in which the organisation or person communicates.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmLanguage;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public Optional<LanguageCode> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getLanguage();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<LanguageCode> value) {
			obj.setLanguage(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmMailType
	 * InvestmentAccountOwnershipInformation13.mmMailType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, Optional<MailType1Choice>> mmMailType = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, Optional<MailType1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "MailTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailType";
			definition = "Method used for postal mailing.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmMailType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MailType1Choice.mmObject();
		}

		@Override
		public Optional<MailType1Choice> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getMailType();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<MailType1Choice> value) {
			obj.setMailType(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmCountryAndResidentialStatus
	 * InvestmentAccountOwnershipInformation13.mmCountryAndResidentialStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<CountryAndResidentialStatusType2>> mmCountryAndResidentialStatus = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<CountryAndResidentialStatusType2>>() {
		{
			businessElementTrace_lazy = () -> Person.mmResidentialStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "CtryAndResdtlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryAndResidentialStatus";
			definition = "Country and residential status of the organisation or individual person.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmCountryAndResidentialStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CountryAndResidentialStatusType2.mmObject();
		}

		@Override
		public Optional<CountryAndResidentialStatusType2> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getCountryAndResidentialStatus();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<CountryAndResidentialStatusType2> value) {
			obj.setCountryAndResidentialStatus(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmMonetaryWealth
	 * InvestmentAccountOwnershipInformation13.mmMonetaryWealth}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, Optional<DateAndAmount1>> mmMonetaryWealth = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, Optional<DateAndAmount1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "MntryWlth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonetaryWealth";
			definition = "Annual wealth of the individual person or share capital value of the legal entity and date on which the annual wealth of the individual person was registered or declared or the date the stock value of the organisation was registered.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmMonetaryWealth;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndAmount1.mmObject();
		}

		@Override
		public Optional<DateAndAmount1> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getMonetaryWealth();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<DateAndAmount1> value) {
			obj.setMonetaryWealth(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmEquityValue
	 * InvestmentAccountOwnershipInformation13.mmEquityValue}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, Optional<DateAndAmount1>> mmEquityValue = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, Optional<DateAndAmount1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "EqtyVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityValue";
			definition = "Amount of total assets minus liabilities of the individual person or the amount of the difference between assets and liabilities plus rights over obligations (net equity) of the organisation and the date on which the equity value was registered.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmEquityValue;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndAmount1.mmObject();
		}

		@Override
		public Optional<DateAndAmount1> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getEquityValue();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<DateAndAmount1> value) {
			obj.setEquityValue(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmWorkingCapital
	 * InvestmentAccountOwnershipInformation13.mmWorkingCapital}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, Optional<DateAndAmount1>> mmWorkingCapital = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, Optional<DateAndAmount1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "WorkgCptl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkingCapital";
			definition = "Resource or value owned or used by a third-party company and the date on which the working capital amount was registered.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmWorkingCapital;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateAndAmount1.mmObject();
		}

		@Override
		public Optional<DateAndAmount1> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getWorkingCapital();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<DateAndAmount1> value) {
			obj.setWorkingCapital(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmCompanyLink
	 * InvestmentAccountOwnershipInformation13.mmCompanyLink}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, Optional<CompanyLink1Choice>> mmCompanyLink = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, Optional<CompanyLink1Choice>>() {
		{
			businessElementTrace_lazy = () -> Role.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "CpnyLk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyLink";
			definition = "Account owner's connection with the trading party or broker.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmCompanyLink;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CompanyLink1Choice.mmObject();
		}

		@Override
		public Optional<CompanyLink1Choice> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getCompanyLink();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<CompanyLink1Choice> value) {
			obj.setCompanyLink(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmElectronicMailingServiceReference
	 * InvestmentAccountOwnershipInformation13.
	 * mmElectronicMailingServiceReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<Max350Text>> mmElectronicMailingServiceReference = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "ElctrncMlngSvcRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicMailingServiceReference";
			definition = "Reference to be specified when a letter (for example, an order confirmation) is sent by an automated mailing system.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmElectronicMailingServiceReference;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getElectronicMailingServiceReference();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<Max350Text> value) {
			obj.setElectronicMailingServiceReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PmryComAdr")
	protected List<CommunicationAddress6> primaryCommunicationAddress;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmPrimaryCommunicationAddress
	 * InvestmentAccountOwnershipInformation13.mmPrimaryCommunicationAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<CommunicationAddress6>> mmPrimaryCommunicationAddress = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<CommunicationAddress6>>() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "PmryComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCommunicationAddress";
			definition = "Communication device number or electronic address used for communication.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmPrimaryCommunicationAddress;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommunicationAddress6.mmObject();
		}

		@Override
		public List<CommunicationAddress6> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getPrimaryCommunicationAddress();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, List<CommunicationAddress6> value) {
			obj.setPrimaryCommunicationAddress(value);
		}
	};
	@XmlElement(name = "ScndryComAdr")
	protected List<CommunicationAddress6> secondaryCommunicationAddress;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmSecondaryCommunicationAddress
	 * InvestmentAccountOwnershipInformation13.mmSecondaryCommunicationAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<CommunicationAddress6>> mmSecondaryCommunicationAddress = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<CommunicationAddress6>>() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "ScndryComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCommunicationAddress";
			definition = "Communication device number or electronic address used for communication.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmSecondaryCommunicationAddress;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommunicationAddress6.mmObject();
		}

		@Override
		public List<CommunicationAddress6> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getSecondaryCommunicationAddress();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, List<CommunicationAddress6> value) {
			obj.setSecondaryCommunicationAddress(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmAdditionalRegulatoryInformation
	 * InvestmentAccountOwnershipInformation13.mmAdditionalRegulatoryInformation
	 * }</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<RegulatoryInformation1>> mmAdditionalRegulatoryInformation = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<RegulatoryInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "AddtlRgltryInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRegulatoryInformation";
			definition = "Additional regulatory information about the investor or account owner that is required in some markets to support anti-money laundering laws.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmAdditionalRegulatoryInformation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegulatoryInformation1.mmObject();
		}

		@Override
		public Optional<RegulatoryInformation1> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getAdditionalRegulatoryInformation();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<RegulatoryInformation1> value) {
			obj.setAdditionalRegulatoryInformation(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmAccountingStatus
	 * InvestmentAccountOwnershipInformation13.mmAccountingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, Optional<AccountingStatus1Choice>> mmAccountingStatus = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, Optional<AccountingStatus1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "AcctgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountingStatus";
			definition = "Specifies if the account party is regarded as domestic or non-domestic for reporting purposes.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmAccountingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountingStatus1Choice.mmObject();
		}

		@Override
		public Optional<AccountingStatus1Choice> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getAccountingStatus();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<AccountingStatus1Choice> value) {
			obj.setAccountingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected List<AdditiononalInformation12> additionalInformation;
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmAdditionalInformation
	 * InvestmentAccountOwnershipInformation13.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<AdditiononalInformation12>> mmAdditionalInformation = new MMMessageAssociationEnd<InvestmentAccountOwnershipInformation15, List<AdditiononalInformation12>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information such as remarks or notes that must be conveyed about the party and or limitations and restrictions.";
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmAdditionalInformation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditiononalInformation12.mmObject();
		}

		@Override
		public List<AdditiononalInformation12> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, List<AdditiononalInformation12> value) {
			obj.setAdditionalInformation(value);
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
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
	public static final MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<YesNoIndicator>> mmControllingParty = new MMMessageAttribute<InvestmentAccountOwnershipInformation15, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmObject();
			isDerived = false;
			xmlTag = "CtrlgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControllingParty";
			definition = "Party is the controlling person. \r\n(For an Entity that is a legal person, the term “Controlling Persons” means the natural person(s) who exercises control over the Entity. “Control” over an Entity is generally exercised by the natural person(s) who ultimately has a controlling ownership interest in the Entity. A “control ownership interest” depends on the ownership structure of the legal person and is usually identified on the basis of a threshold applying a risk-based approach (e.g. any person(s) owning more than a certain percentage of the legal person, such as 25%). Where no natural person(s) exercises control through ownership interests, the Controlling Person(s) of the Entity will be the natural person(s) who exercises control of the Entity through other means. Where no natural person(s) is identified as exercising control of the Entity, the Controlling Person(s) of the Entity will be the natural person(s) who holds the position of senior managing official.).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InvestmentAccountOwnershipInformation15 obj) {
			return obj.getControllingParty();
		}

		@Override
		public void setValue(InvestmentAccountOwnershipInformation15 obj, Optional<YesNoIndicator> value) {
			obj.setControllingParty(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmParty, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmMoneyLaunderingCheck,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmModifiedInvestorProfileValidation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmOwnershipBeneficiaryRate,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmClientIdentification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmFiscalExemption,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmSignatoryRightIndicator, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmMiFIDClassification,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmNotification, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmFATCAFormType,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmFATCAStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmFATCAReportingDate,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmCRSFormType, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmCRSStatus,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmCRSReportingDate, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmOtherIdentification,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmTaxExemption, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmTaxReporting,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmLanguage, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmMailType,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmCountryAndResidentialStatus, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmMonetaryWealth,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmEquityValue, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmWorkingCapital,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmCompanyLink, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmElectronicMailingServiceReference,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmPrimaryCommunicationAddress, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmSecondaryCommunicationAddress,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmAdditionalRegulatoryInformation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmAccountingStatus,
						com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmAdditionalInformation, com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15.mmControllingParty);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountOwnershipInformation15";
				definition = "Characteristics of the ownership of an investment account.";
				previousVersion_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Party33Choice getParty() {
		return party;
	}

	public InvestmentAccountOwnershipInformation15 setParty(Party33Choice party) {
		this.party = Objects.requireNonNull(party);
		return this;
	}

	public Optional<MoneyLaunderingCheck1Choice> getMoneyLaunderingCheck() {
		return moneyLaunderingCheck == null ? Optional.empty() : Optional.of(moneyLaunderingCheck);
	}

	public InvestmentAccountOwnershipInformation15 setMoneyLaunderingCheck(MoneyLaunderingCheck1Choice moneyLaunderingCheck) {
		this.moneyLaunderingCheck = moneyLaunderingCheck;
		return this;
	}

	public List<ModificationScope27> getModifiedInvestorProfileValidation() {
		return modifiedInvestorProfileValidation == null ? modifiedInvestorProfileValidation = new ArrayList<>() : modifiedInvestorProfileValidation;
	}

	public InvestmentAccountOwnershipInformation15 setModifiedInvestorProfileValidation(List<ModificationScope27> modifiedInvestorProfileValidation) {
		this.modifiedInvestorProfileValidation = Objects.requireNonNull(modifiedInvestorProfileValidation);
		return this;
	}

	public Optional<OwnershipBeneficiaryRate1> getOwnershipBeneficiaryRate() {
		return ownershipBeneficiaryRate == null ? Optional.empty() : Optional.of(ownershipBeneficiaryRate);
	}

	public InvestmentAccountOwnershipInformation15 setOwnershipBeneficiaryRate(OwnershipBeneficiaryRate1 ownershipBeneficiaryRate) {
		this.ownershipBeneficiaryRate = ownershipBeneficiaryRate;
		return this;
	}

	public Optional<Max35Text> getClientIdentification() {
		return clientIdentification == null ? Optional.empty() : Optional.of(clientIdentification);
	}

	public InvestmentAccountOwnershipInformation15 setClientIdentification(Max35Text clientIdentification) {
		this.clientIdentification = clientIdentification;
		return this;
	}

	public Optional<YesNoIndicator> getFiscalExemption() {
		return fiscalExemption == null ? Optional.empty() : Optional.of(fiscalExemption);
	}

	public InvestmentAccountOwnershipInformation15 setFiscalExemption(YesNoIndicator fiscalExemption) {
		this.fiscalExemption = fiscalExemption;
		return this;
	}

	public Optional<YesNoIndicator> getSignatoryRightIndicator() {
		return signatoryRightIndicator == null ? Optional.empty() : Optional.of(signatoryRightIndicator);
	}

	public InvestmentAccountOwnershipInformation15 setSignatoryRightIndicator(YesNoIndicator signatoryRightIndicator) {
		this.signatoryRightIndicator = signatoryRightIndicator;
		return this;
	}

	public Optional<MiFIDClassification1> getMiFIDClassification() {
		return miFIDClassification == null ? Optional.empty() : Optional.of(miFIDClassification);
	}

	public InvestmentAccountOwnershipInformation15 setMiFIDClassification(MiFIDClassification1 miFIDClassification) {
		this.miFIDClassification = miFIDClassification;
		return this;
	}

	public List<Notification2> getNotification() {
		return notification == null ? notification = new ArrayList<>() : notification;
	}

	public InvestmentAccountOwnershipInformation15 setNotification(List<Notification2> notification) {
		this.notification = Objects.requireNonNull(notification);
		return this;
	}

	public List<FATCAForm1Choice> getFATCAFormType() {
		return fATCAFormType == null ? fATCAFormType = new ArrayList<>() : fATCAFormType;
	}

	public InvestmentAccountOwnershipInformation15 setFATCAFormType(List<FATCAForm1Choice> fATCAFormType) {
		this.fATCAFormType = Objects.requireNonNull(fATCAFormType);
		return this;
	}

	public List<FATCAStatus2> getFATCAStatus() {
		return fATCAStatus == null ? fATCAStatus = new ArrayList<>() : fATCAStatus;
	}

	public InvestmentAccountOwnershipInformation15 setFATCAStatus(List<FATCAStatus2> fATCAStatus) {
		this.fATCAStatus = Objects.requireNonNull(fATCAStatus);
		return this;
	}

	public Optional<ISODate> getFATCAReportingDate() {
		return fATCAReportingDate == null ? Optional.empty() : Optional.of(fATCAReportingDate);
	}

	public InvestmentAccountOwnershipInformation15 setFATCAReportingDate(ISODate fATCAReportingDate) {
		this.fATCAReportingDate = fATCAReportingDate;
		return this;
	}

	public List<CRSForm1Choice> getCRSFormType() {
		return cRSFormType == null ? cRSFormType = new ArrayList<>() : cRSFormType;
	}

	public InvestmentAccountOwnershipInformation15 setCRSFormType(List<CRSForm1Choice> cRSFormType) {
		this.cRSFormType = Objects.requireNonNull(cRSFormType);
		return this;
	}

	public List<CRSStatus4> getCRSStatus() {
		return cRSStatus == null ? cRSStatus = new ArrayList<>() : cRSStatus;
	}

	public InvestmentAccountOwnershipInformation15 setCRSStatus(List<CRSStatus4> cRSStatus) {
		this.cRSStatus = Objects.requireNonNull(cRSStatus);
		return this;
	}

	public Optional<ISODate> getCRSReportingDate() {
		return cRSReportingDate == null ? Optional.empty() : Optional.of(cRSReportingDate);
	}

	public InvestmentAccountOwnershipInformation15 setCRSReportingDate(ISODate cRSReportingDate) {
		this.cRSReportingDate = cRSReportingDate;
		return this;
	}

	public List<GenericIdentification82> getOtherIdentification() {
		return otherIdentification == null ? otherIdentification = new ArrayList<>() : otherIdentification;
	}

	public InvestmentAccountOwnershipInformation15 setOtherIdentification(List<GenericIdentification82> otherIdentification) {
		this.otherIdentification = Objects.requireNonNull(otherIdentification);
		return this;
	}

	public Optional<TaxExemptionReason2Choice> getTaxExemption() {
		return taxExemption == null ? Optional.empty() : Optional.of(taxExemption);
	}

	public InvestmentAccountOwnershipInformation15 setTaxExemption(TaxExemptionReason2Choice taxExemption) {
		this.taxExemption = taxExemption;
		return this;
	}

	public List<TaxReporting2> getTaxReporting() {
		return taxReporting == null ? taxReporting = new ArrayList<>() : taxReporting;
	}

	public InvestmentAccountOwnershipInformation15 setTaxReporting(List<TaxReporting2> taxReporting) {
		this.taxReporting = Objects.requireNonNull(taxReporting);
		return this;
	}

	public Optional<LanguageCode> getLanguage() {
		return language == null ? Optional.empty() : Optional.of(language);
	}

	public InvestmentAccountOwnershipInformation15 setLanguage(LanguageCode language) {
		this.language = language;
		return this;
	}

	public Optional<MailType1Choice> getMailType() {
		return mailType == null ? Optional.empty() : Optional.of(mailType);
	}

	public InvestmentAccountOwnershipInformation15 setMailType(MailType1Choice mailType) {
		this.mailType = mailType;
		return this;
	}

	public Optional<CountryAndResidentialStatusType2> getCountryAndResidentialStatus() {
		return countryAndResidentialStatus == null ? Optional.empty() : Optional.of(countryAndResidentialStatus);
	}

	public InvestmentAccountOwnershipInformation15 setCountryAndResidentialStatus(CountryAndResidentialStatusType2 countryAndResidentialStatus) {
		this.countryAndResidentialStatus = countryAndResidentialStatus;
		return this;
	}

	public Optional<DateAndAmount1> getMonetaryWealth() {
		return monetaryWealth == null ? Optional.empty() : Optional.of(monetaryWealth);
	}

	public InvestmentAccountOwnershipInformation15 setMonetaryWealth(DateAndAmount1 monetaryWealth) {
		this.monetaryWealth = monetaryWealth;
		return this;
	}

	public Optional<DateAndAmount1> getEquityValue() {
		return equityValue == null ? Optional.empty() : Optional.of(equityValue);
	}

	public InvestmentAccountOwnershipInformation15 setEquityValue(DateAndAmount1 equityValue) {
		this.equityValue = equityValue;
		return this;
	}

	public Optional<DateAndAmount1> getWorkingCapital() {
		return workingCapital == null ? Optional.empty() : Optional.of(workingCapital);
	}

	public InvestmentAccountOwnershipInformation15 setWorkingCapital(DateAndAmount1 workingCapital) {
		this.workingCapital = workingCapital;
		return this;
	}

	public Optional<CompanyLink1Choice> getCompanyLink() {
		return companyLink == null ? Optional.empty() : Optional.of(companyLink);
	}

	public InvestmentAccountOwnershipInformation15 setCompanyLink(CompanyLink1Choice companyLink) {
		this.companyLink = companyLink;
		return this;
	}

	public Optional<Max350Text> getElectronicMailingServiceReference() {
		return electronicMailingServiceReference == null ? Optional.empty() : Optional.of(electronicMailingServiceReference);
	}

	public InvestmentAccountOwnershipInformation15 setElectronicMailingServiceReference(Max350Text electronicMailingServiceReference) {
		this.electronicMailingServiceReference = electronicMailingServiceReference;
		return this;
	}

	public List<CommunicationAddress6> getPrimaryCommunicationAddress() {
		return primaryCommunicationAddress == null ? primaryCommunicationAddress = new ArrayList<>() : primaryCommunicationAddress;
	}

	public InvestmentAccountOwnershipInformation15 setPrimaryCommunicationAddress(List<CommunicationAddress6> primaryCommunicationAddress) {
		this.primaryCommunicationAddress = Objects.requireNonNull(primaryCommunicationAddress);
		return this;
	}

	public List<CommunicationAddress6> getSecondaryCommunicationAddress() {
		return secondaryCommunicationAddress == null ? secondaryCommunicationAddress = new ArrayList<>() : secondaryCommunicationAddress;
	}

	public InvestmentAccountOwnershipInformation15 setSecondaryCommunicationAddress(List<CommunicationAddress6> secondaryCommunicationAddress) {
		this.secondaryCommunicationAddress = Objects.requireNonNull(secondaryCommunicationAddress);
		return this;
	}

	public Optional<RegulatoryInformation1> getAdditionalRegulatoryInformation() {
		return additionalRegulatoryInformation == null ? Optional.empty() : Optional.of(additionalRegulatoryInformation);
	}

	public InvestmentAccountOwnershipInformation15 setAdditionalRegulatoryInformation(RegulatoryInformation1 additionalRegulatoryInformation) {
		this.additionalRegulatoryInformation = additionalRegulatoryInformation;
		return this;
	}

	public Optional<AccountingStatus1Choice> getAccountingStatus() {
		return accountingStatus == null ? Optional.empty() : Optional.of(accountingStatus);
	}

	public InvestmentAccountOwnershipInformation15 setAccountingStatus(AccountingStatus1Choice accountingStatus) {
		this.accountingStatus = accountingStatus;
		return this;
	}

	public List<AdditiononalInformation12> getAdditionalInformation() {
		return additionalInformation == null ? additionalInformation = new ArrayList<>() : additionalInformation;
	}

	public InvestmentAccountOwnershipInformation15 setAdditionalInformation(List<AdditiononalInformation12> additionalInformation) {
		this.additionalInformation = Objects.requireNonNull(additionalInformation);
		return this;
	}

	public Optional<YesNoIndicator> getControllingParty() {
		return controllingParty == null ? Optional.empty() : Optional.of(controllingParty);
	}

	public InvestmentAccountOwnershipInformation15 setControllingParty(YesNoIndicator controllingParty) {
		this.controllingParty = controllingParty;
		return this;
	}
}