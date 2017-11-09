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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmParty
 * InvestmentAccountOwnershipInformation13.mmParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmMoneyLaunderingCheck
 * InvestmentAccountOwnershipInformation13.mmMoneyLaunderingCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmModifiedInvestorProfileValidation
 * InvestmentAccountOwnershipInformation13.mmModifiedInvestorProfileValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmOwnershipBeneficiaryRate
 * InvestmentAccountOwnershipInformation13.mmOwnershipBeneficiaryRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmClientIdentification
 * InvestmentAccountOwnershipInformation13.mmClientIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmFiscalExemption
 * InvestmentAccountOwnershipInformation13.mmFiscalExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmSignatoryRightIndicator
 * InvestmentAccountOwnershipInformation13.mmSignatoryRightIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmMiFIDClassification
 * InvestmentAccountOwnershipInformation13.mmMiFIDClassification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmNotification
 * InvestmentAccountOwnershipInformation13.mmNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmFATCAFormType
 * InvestmentAccountOwnershipInformation13.mmFATCAFormType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmFATCAStatus
 * InvestmentAccountOwnershipInformation13.mmFATCAStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmOtherIdentification
 * InvestmentAccountOwnershipInformation13.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmTaxExemption
 * InvestmentAccountOwnershipInformation13.mmTaxExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmTaxReporting
 * InvestmentAccountOwnershipInformation13.mmTaxReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmLanguage
 * InvestmentAccountOwnershipInformation13.mmLanguage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmMailType
 * InvestmentAccountOwnershipInformation13.mmMailType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmCountryAndResidentialStatus
 * InvestmentAccountOwnershipInformation13.mmCountryAndResidentialStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmMonetaryWealth
 * InvestmentAccountOwnershipInformation13.mmMonetaryWealth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmEquityValue
 * InvestmentAccountOwnershipInformation13.mmEquityValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmWorkingCapital
 * InvestmentAccountOwnershipInformation13.mmWorkingCapital}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmCompanyLink
 * InvestmentAccountOwnershipInformation13.mmCompanyLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmElectronicMailingServiceReference
 * InvestmentAccountOwnershipInformation13.mmElectronicMailingServiceReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmPrimaryCommunicationAddress
 * InvestmentAccountOwnershipInformation13.mmPrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmSecondaryCommunicationAddress
 * InvestmentAccountOwnershipInformation13.mmSecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmAdditionalRegulatoryInformation
 * InvestmentAccountOwnershipInformation13.mmAdditionalRegulatoryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmAccountingStatus
 * InvestmentAccountOwnershipInformation13.mmAccountingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13#mmAdditionalInformation
 * InvestmentAccountOwnershipInformation13.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
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
 * "InvestmentAccountOwnershipInformation13"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of the ownership of an investment account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
 * InvestmentAccountOwnershipInformation15}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11
 * InvestmentAccountOwnershipInformation11}</li>
 * </ul>
 */
public class InvestmentAccountOwnershipInformation13 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Party30Choice party;
	/**
	 * Information about the organisation or individual person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Party30Choice Party30Choice}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party Party}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * definition} = "Information about the organisation or individual person. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmParty
	 * InvestmentAccountOwnershipInformation15.mmParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmParty
	 * InvestmentAccountOwnershipInformation11.mmParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Party.mmObject();
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "Pty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party";
			definition = "Information about the organisation or individual person. ";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmParty);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation11.mmParty;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Party30Choice.mmObject();
		}
	};
	protected MoneyLaunderingCheck1Choice moneyLaunderingCheck;
	/**
	 * Status of an identity check to prevent money laundering. This includes
	 * the counter-terrorism check.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation15.mmMoneyLaunderingCheck}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation11.mmMoneyLaunderingCheck}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMoneyLaunderingCheck = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "MnyLndrgChck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmMoneyLaunderingCheck);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation11.mmMoneyLaunderingCheck;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MoneyLaunderingCheck1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ModificationScope27> modifiedInvestorProfileValidation;
	/**
	 * Information related to the party profile to be inserted or deleted.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmModifiedInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation15.
	 * mmModifiedInvestorProfileValidation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmModifiedInvestorProfileValidation
	 * InvestmentAccountOwnershipInformation11.
	 * mmModifiedInvestorProfileValidation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModifiedInvestorProfileValidation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmProfileCertification;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "ModfdInvstrPrflVldtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedInvestorProfileValidation";
			definition = "Information related to the party profile to be inserted or deleted.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmModifiedInvestorProfileValidation);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation11.mmModifiedInvestorProfileValidation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ModificationScope27.mmObject();
		}
	};
	protected PercentageRate ownershipBeneficiaryRate;
	/**
	 * Percentage of ownership or of beneficial ownership of the shares/units in
	 * the account. All subsequent subscriptions or purchases and or redemptions
	 * or sells will be allocated using the same percentage.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions or purchases and or redemptions or sells  will be allocated using the same percentage."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation15.mmOwnershipBeneficiaryRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmOwnershipBeneficiaryRate
	 * InvestmentAccountOwnershipInformation11.mmOwnershipBeneficiaryRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnershipBeneficiaryRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "OwnrshBnfcryRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnershipBeneficiaryRate";
			definition = "Percentage of ownership or of beneficial ownership of the shares/units in the account. All subsequent subscriptions or purchases and or redemptions or sells  will be allocated using the same percentage.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmOwnershipBeneficiaryRate);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation11.mmOwnershipBeneficiaryRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected Max35Text clientIdentification;
	/**
	 * Unique identification, as assigned by an organisation, to unambiguously
	 * identify a party.
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmClientIdentification
	 * InvestmentAccountOwnershipInformation15.mmClientIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmClientIdentification
	 * InvestmentAccountOwnershipInformation11.mmClientIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "ClntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientIdentification";
			definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmClientIdentification);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation11.mmClientIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected YesNoIndicator fiscalExemption;
	/**
	 * Indicates whether an owner of the account may benefit from a fiscal
	 * exemption or amnesty, for example, when declaring overseas investments.
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmFiscalExemption
	 * InvestmentFundTax.mmFiscalExemption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation15.mmFiscalExemption}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmFiscalExemption
	 * InvestmentAccountOwnershipInformation11.mmFiscalExemption}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFiscalExemption = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmFiscalExemption;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "FsclXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalExemption";
			definition = "Indicates whether an owner of the account may benefit from a fiscal exemption or amnesty, for example, when declaring overseas investments.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmFiscalExemption);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation11.mmFiscalExemption;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator signatoryRightIndicator;
	/**
	 * Indicates whether the signature of the account owner is required to
	 * authorise transactions on the account.
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
	 * {@linkplain com.tools20022.repository.entity.SignatureCondition#mmSignatoryRightIndicator
	 * SignatureCondition.mmSignatoryRightIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmSignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation15.mmSignatoryRightIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmSignatoryRightIndicator
	 * InvestmentAccountOwnershipInformation11.mmSignatoryRightIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSignatoryRightIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmSignatoryRightIndicator;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "SgntryRghtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatoryRightIndicator";
			definition = "Indicates whether the signature of the account owner is required to authorise transactions on the account.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmSignatoryRightIndicator);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation11.mmSignatoryRightIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected MiFIDClassification1 miFIDClassification;
	/**
	 * Details about the MiFID classification of the account owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmMiFIDClassification
	 * InvestmentAccountOwnershipInformation15.mmMiFIDClassification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmMiFIDClassification
	 * InvestmentAccountOwnershipInformation11.mmMiFIDClassification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMiFIDClassification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "MiFIDClssfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiFIDClassification";
			definition = "Details about the MiFID classification of the account owner.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmMiFIDClassification);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation11.mmMiFIDClassification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.MiFIDClassification1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Notification2> notification;
	/**
	 * Type of information that must be provided to the account holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Notification2
	 * Notification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmNotification
	 * InvestmentAccountOwnershipInformation15.mmNotification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmInformationDistribution
	 * InvestmentAccountOwnershipInformation11.mmInformationDistribution}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "Ntfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Notification";
			definition = "Type of information that must be provided to the account holder.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmNotification);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation11.mmInformationDistribution;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Notification2.mmObject();
		}
	};
	protected List<FATCAForm1Choice> fATCAFormType;
	/**
	 * Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the
	 * investor or account owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation15.mmFATCAFormType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmFATCAFormType
	 * InvestmentAccountOwnershipInformation11.mmFATCAFormType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFATCAFormType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmFATCAFormType;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "FATCAFormTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAFormType";
			definition = "Type of Foreign Account Tax Compliance Act (FATCA) form submitted by the investor or account owner.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmFATCAFormType);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation11.mmFATCAFormType;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FATCAForm1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.FATCAStatus2> fATCAStatus;
	/**
	 * Foreign Account Tax Compliance Act (FATCA) status of the investor or
	 * account owner.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation15.mmFATCAStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation11#mmFATCAStatus
	 * InvestmentAccountOwnershipInformation11.mmFATCAStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFATCAStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmFATCAStatus;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "FATCASts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FATCAStatus";
			definition = "Foreign Account Tax Compliance Act (FATCA) status of the investor or account owner.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmFATCAStatus);
			previousVersion_lazy = () -> InvestmentAccountOwnershipInformation11.mmFATCAStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FATCAStatus2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GenericIdentification82> otherIdentification;
	/**
	 * Alternative identification, for example, national registration
	 * identification number, passport number, tax identification number. This
	 * may be an account number used to further identify the beneficial owner,
	 * for example, a Central Provident Fund (CFP) account as required for
	 * Singapore.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmOtherIdentification
	 * InvestmentAccountOwnershipInformation15.mmOtherIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "OthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIdentification";
			definition = "Alternative identification, for example, national registration identification number, passport number, tax identification number. This may be an account number used to further identify the beneficial owner, for example, a Central Provident Fund (CFP) account as required for Singapore.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmOtherIdentification);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification82.mmObject();
		}
	};
	protected TaxExemptionReason2Choice taxExemption;
	/**
	 * Tax advantage specific to the account party.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmTaxExemption
	 * InvestmentAccountOwnershipInformation15.mmTaxExemption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxExemption = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "TaxXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemption";
			definition = "Tax advantage specific to the account party.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmTaxExemption);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxExemptionReason2Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.TaxReporting1> taxReporting;
	/**
	 * Details for the reporting of tax, for example, the country of taxation.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmTaxReporting
	 * InvestmentAccountOwnershipInformation15.mmTaxReporting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxReporting = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TaxPartyRole.mmTax;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "TaxRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReporting";
			definition = "Details for the reporting of tax, for example, the country of taxation.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmTaxReporting);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxReporting1.mmObject();
		}
	};
	protected LanguageCode language;
	/**
	 * Language in which the organisation or person communicates.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmLanguage
	 * InvestmentAccountOwnershipInformation15.mmLanguage}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLanguage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Account.mmLanguage;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "Lang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Language";
			definition = "Language in which the organisation or person communicates.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmLanguage);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}
	};
	protected MailType1Choice mailType;
	/**
	 * Method used for postal mailing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.MailType1Choice
	 * MailType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmMailType
	 * InvestmentAccountOwnershipInformation15.mmMailType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMailType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "MailTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailType";
			definition = "Method used for postal mailing.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmMailType);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MailType1Choice.mmObject();
		}
	};
	protected CountryAndResidentialStatusType2 countryAndResidentialStatus;
	/**
	 * Country and residential status of the organisation or individual person.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * "Country and residential status of the organisation or individual person. "
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmCountryAndResidentialStatus
	 * InvestmentAccountOwnershipInformation15.mmCountryAndResidentialStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCountryAndResidentialStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Person.mmResidentialStatus;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "CtryAndResdtlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryAndResidentialStatus";
			definition = "Country and residential status of the organisation or individual person. ";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmCountryAndResidentialStatus);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CountryAndResidentialStatusType2.mmObject();
		}
	};
	protected DateAndAmount1 monetaryWealth;
	/**
	 * Annual wealth of the individual person or share capital value of the
	 * legal entity and date on which the annual wealth of the individual person
	 * was registered or declared or the date the stock value of the
	 * organisation was registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateAndAmount1
	 * DateAndAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * "Annual wealth of the individual person or share capital value of the legal entity and date on which the annual wealth of the individual person was registered or declared or the date the  stock value of the organisation was registered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmMonetaryWealth
	 * InvestmentAccountOwnershipInformation15.mmMonetaryWealth}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMonetaryWealth = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "MntryWlth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonetaryWealth";
			definition = "Annual wealth of the individual person or share capital value of the legal entity and date on which the annual wealth of the individual person was registered or declared or the date the  stock value of the organisation was registered.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmMonetaryWealth);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateAndAmount1.mmObject();
		}
	};
	protected DateAndAmount1 equityValue;
	/**
	 * Amount of total assets minus liabilities of the individual person or the
	 * amount of the difference between assets and liabilities plus rights over
	 * obligations (net equity) of the organisation and the date on which the
	 * equity value was registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateAndAmount1
	 * DateAndAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmEquityValue
	 * InvestmentAccountOwnershipInformation15.mmEquityValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEquityValue = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "EqtyVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EquityValue";
			definition = "Amount of total assets minus liabilities of the individual person or the amount of the difference between assets and liabilities plus rights over obligations (net equity) of the organisation and the date on which the equity value was registered.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmEquityValue);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateAndAmount1.mmObject();
		}
	};
	protected DateAndAmount1 workingCapital;
	/**
	 * Resource or value owned or used by a third-party company and the date on
	 * which the working capital amount was registered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DateAndAmount1
	 * DateAndAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmWorkingCapital
	 * InvestmentAccountOwnershipInformation15.mmWorkingCapital}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmWorkingCapital = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "WorkgCptl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WorkingCapital";
			definition = "Resource or value owned or used by a third-party company and the date on which the working capital amount was registered.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmWorkingCapital);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DateAndAmount1.mmObject();
		}
	};
	protected CompanyLink1Choice companyLink;
	/**
	 * Account owner's connection with the trading party or broker.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmCompanyLink
	 * InvestmentAccountOwnershipInformation15.mmCompanyLink}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCompanyLink = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Role.mmPartyRole;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "CpnyLk";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyLink";
			definition = "Account owner's connection with the trading party or broker.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmCompanyLink);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CompanyLink1Choice.mmObject();
		}
	};
	protected Max350Text electronicMailingServiceReference;
	/**
	 * Reference to be specified when a letter (for example, an order
	 * confirmation) is sent by an automated mailing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmElectronicMailingServiceReference
	 * InvestmentAccountOwnershipInformation15.
	 * mmElectronicMailingServiceReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmElectronicMailingServiceReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "ElctrncMlngSvcRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicMailingServiceReference";
			definition = "Reference to be specified when a letter (for example, an order confirmation) is sent by an automated mailing system.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmElectronicMailingServiceReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CommunicationAddress6> primaryCommunicationAddress;
	/**
	 * Communication device number or electronic address used for communication.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmPrimaryCommunicationAddress
	 * InvestmentAccountOwnershipInformation15.mmPrimaryCommunicationAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrimaryCommunicationAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "PmryComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCommunicationAddress";
			definition = "Communication device number or electronic address used for communication.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmPrimaryCommunicationAddress);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CommunicationAddress6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CommunicationAddress6> secondaryCommunicationAddress;
	/**
	 * Communication device number or electronic address used for communication.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmSecondaryCommunicationAddress
	 * InvestmentAccountOwnershipInformation15.mmSecondaryCommunicationAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondaryCommunicationAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "ScndryComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCommunicationAddress";
			definition = "Communication device number or electronic address used for communication.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmSecondaryCommunicationAddress);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CommunicationAddress6.mmObject();
		}
	};
	protected RegulatoryInformation1 additionalRegulatoryInformation;
	/**
	 * Additional regulatory information about the investor or account owner
	 * that is required in some markets to support anti-money laundering laws.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmAdditionalRegulatoryInformation
	 * InvestmentAccountOwnershipInformation15.mmAdditionalRegulatoryInformation
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalRegulatoryInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "AddtlRgltryInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRegulatoryInformation";
			definition = "Additional regulatory information about the investor or account owner that is required in some markets to support anti-money laundering laws.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmAdditionalRegulatoryInformation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.RegulatoryInformation1.mmObject();
		}
	};
	protected AccountingStatus1Choice accountingStatus;
	/**
	 * Specifies if the account party is regarded as domestic or non-domestic
	 * for reporting purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountingStatus1Choice
	 * AccountingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmAccountingStatus
	 * InvestmentAccountOwnershipInformation15.mmAccountingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountingStatus = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "AcctgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountingStatus";
			definition = "Specifies if the account party is regarded as domestic or non-domestic for reporting purposes.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmAccountingStatus);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountingStatus1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AccountRestrictions1> additionalInformation;
	/**
	 * Additional information concerning limitations and restrictions on the
	 * account party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountRestrictions1
	 * AccountRestrictions1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation13
	 * InvestmentAccountOwnershipInformation13}</li>
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15#mmAdditionalInformation
	 * InvestmentAccountOwnershipInformation15.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation13.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information concerning limitations and restrictions on the account party.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmAdditionalInformation);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountRestrictions1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation13.mmParty, InvestmentAccountOwnershipInformation13.mmMoneyLaunderingCheck,
						InvestmentAccountOwnershipInformation13.mmModifiedInvestorProfileValidation, InvestmentAccountOwnershipInformation13.mmOwnershipBeneficiaryRate, InvestmentAccountOwnershipInformation13.mmClientIdentification,
						InvestmentAccountOwnershipInformation13.mmFiscalExemption, InvestmentAccountOwnershipInformation13.mmSignatoryRightIndicator, InvestmentAccountOwnershipInformation13.mmMiFIDClassification,
						InvestmentAccountOwnershipInformation13.mmNotification, InvestmentAccountOwnershipInformation13.mmFATCAFormType, InvestmentAccountOwnershipInformation13.mmFATCAStatus,
						InvestmentAccountOwnershipInformation13.mmOtherIdentification, InvestmentAccountOwnershipInformation13.mmTaxExemption, InvestmentAccountOwnershipInformation13.mmTaxReporting,
						InvestmentAccountOwnershipInformation13.mmLanguage, InvestmentAccountOwnershipInformation13.mmMailType, InvestmentAccountOwnershipInformation13.mmCountryAndResidentialStatus,
						InvestmentAccountOwnershipInformation13.mmMonetaryWealth, InvestmentAccountOwnershipInformation13.mmEquityValue, InvestmentAccountOwnershipInformation13.mmWorkingCapital,
						InvestmentAccountOwnershipInformation13.mmCompanyLink, InvestmentAccountOwnershipInformation13.mmElectronicMailingServiceReference, InvestmentAccountOwnershipInformation13.mmPrimaryCommunicationAddress,
						InvestmentAccountOwnershipInformation13.mmSecondaryCommunicationAddress, InvestmentAccountOwnershipInformation13.mmAdditionalRegulatoryInformation, InvestmentAccountOwnershipInformation13.mmAccountingStatus,
						InvestmentAccountOwnershipInformation13.mmAdditionalInformation);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InvestmentAccountOwnershipInformation13";
				definition = "Characteristics of the ownership of an investment account.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation15.mmObject());
				previousVersion_lazy = () -> InvestmentAccountOwnershipInformation11.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Party30Choice getParty() {
		return party;
	}

	public void setParty(Party30Choice party) {
		this.party = party;
	}

	public MoneyLaunderingCheck1Choice getMoneyLaunderingCheck() {
		return moneyLaunderingCheck;
	}

	public void setMoneyLaunderingCheck(MoneyLaunderingCheck1Choice moneyLaunderingCheck) {
		this.moneyLaunderingCheck = moneyLaunderingCheck;
	}

	public List<ModificationScope27> getModifiedInvestorProfileValidation() {
		return modifiedInvestorProfileValidation;
	}

	public void setModifiedInvestorProfileValidation(List<com.tools20022.repository.msg.ModificationScope27> modifiedInvestorProfileValidation) {
		this.modifiedInvestorProfileValidation = modifiedInvestorProfileValidation;
	}

	public PercentageRate getOwnershipBeneficiaryRate() {
		return ownershipBeneficiaryRate;
	}

	public void setOwnershipBeneficiaryRate(PercentageRate ownershipBeneficiaryRate) {
		this.ownershipBeneficiaryRate = ownershipBeneficiaryRate;
	}

	public Max35Text getClientIdentification() {
		return clientIdentification;
	}

	public void setClientIdentification(Max35Text clientIdentification) {
		this.clientIdentification = clientIdentification;
	}

	public YesNoIndicator getFiscalExemption() {
		return fiscalExemption;
	}

	public void setFiscalExemption(YesNoIndicator fiscalExemption) {
		this.fiscalExemption = fiscalExemption;
	}

	public YesNoIndicator getSignatoryRightIndicator() {
		return signatoryRightIndicator;
	}

	public void setSignatoryRightIndicator(YesNoIndicator signatoryRightIndicator) {
		this.signatoryRightIndicator = signatoryRightIndicator;
	}

	public MiFIDClassification1 getMiFIDClassification() {
		return miFIDClassification;
	}

	public void setMiFIDClassification(com.tools20022.repository.msg.MiFIDClassification1 miFIDClassification) {
		this.miFIDClassification = miFIDClassification;
	}

	public List<Notification2> getNotification() {
		return notification;
	}

	public void setNotification(List<com.tools20022.repository.msg.Notification2> notification) {
		this.notification = notification;
	}

	public List<FATCAForm1Choice> getFATCAFormType() {
		return fATCAFormType;
	}

	public void setFATCAFormType(List<FATCAForm1Choice> fATCAFormType) {
		this.fATCAFormType = fATCAFormType;
	}

	public List<FATCAStatus2> getFATCAStatus() {
		return fATCAStatus;
	}

	public void setFATCAStatus(List<com.tools20022.repository.msg.FATCAStatus2> fATCAStatus) {
		this.fATCAStatus = fATCAStatus;
	}

	public List<GenericIdentification82> getOtherIdentification() {
		return otherIdentification;
	}

	public void setOtherIdentification(List<com.tools20022.repository.msg.GenericIdentification82> otherIdentification) {
		this.otherIdentification = otherIdentification;
	}

	public TaxExemptionReason2Choice getTaxExemption() {
		return taxExemption;
	}

	public void setTaxExemption(TaxExemptionReason2Choice taxExemption) {
		this.taxExemption = taxExemption;
	}

	public List<TaxReporting1> getTaxReporting() {
		return taxReporting;
	}

	public void setTaxReporting(List<com.tools20022.repository.msg.TaxReporting1> taxReporting) {
		this.taxReporting = taxReporting;
	}

	public LanguageCode getLanguage() {
		return language;
	}

	public void setLanguage(LanguageCode language) {
		this.language = language;
	}

	public MailType1Choice getMailType() {
		return mailType;
	}

	public void setMailType(MailType1Choice mailType) {
		this.mailType = mailType;
	}

	public CountryAndResidentialStatusType2 getCountryAndResidentialStatus() {
		return countryAndResidentialStatus;
	}

	public void setCountryAndResidentialStatus(com.tools20022.repository.msg.CountryAndResidentialStatusType2 countryAndResidentialStatus) {
		this.countryAndResidentialStatus = countryAndResidentialStatus;
	}

	public DateAndAmount1 getMonetaryWealth() {
		return monetaryWealth;
	}

	public void setMonetaryWealth(com.tools20022.repository.msg.DateAndAmount1 monetaryWealth) {
		this.monetaryWealth = monetaryWealth;
	}

	public DateAndAmount1 getEquityValue() {
		return equityValue;
	}

	public void setEquityValue(com.tools20022.repository.msg.DateAndAmount1 equityValue) {
		this.equityValue = equityValue;
	}

	public DateAndAmount1 getWorkingCapital() {
		return workingCapital;
	}

	public void setWorkingCapital(com.tools20022.repository.msg.DateAndAmount1 workingCapital) {
		this.workingCapital = workingCapital;
	}

	public CompanyLink1Choice getCompanyLink() {
		return companyLink;
	}

	public void setCompanyLink(CompanyLink1Choice companyLink) {
		this.companyLink = companyLink;
	}

	public Max350Text getElectronicMailingServiceReference() {
		return electronicMailingServiceReference;
	}

	public void setElectronicMailingServiceReference(Max350Text electronicMailingServiceReference) {
		this.electronicMailingServiceReference = electronicMailingServiceReference;
	}

	public List<CommunicationAddress6> getPrimaryCommunicationAddress() {
		return primaryCommunicationAddress;
	}

	public void setPrimaryCommunicationAddress(List<com.tools20022.repository.msg.CommunicationAddress6> primaryCommunicationAddress) {
		this.primaryCommunicationAddress = primaryCommunicationAddress;
	}

	public List<CommunicationAddress6> getSecondaryCommunicationAddress() {
		return secondaryCommunicationAddress;
	}

	public void setSecondaryCommunicationAddress(List<com.tools20022.repository.msg.CommunicationAddress6> secondaryCommunicationAddress) {
		this.secondaryCommunicationAddress = secondaryCommunicationAddress;
	}

	public RegulatoryInformation1 getAdditionalRegulatoryInformation() {
		return additionalRegulatoryInformation;
	}

	public void setAdditionalRegulatoryInformation(com.tools20022.repository.msg.RegulatoryInformation1 additionalRegulatoryInformation) {
		this.additionalRegulatoryInformation = additionalRegulatoryInformation;
	}

	public AccountingStatus1Choice getAccountingStatus() {
		return accountingStatus;
	}

	public void setAccountingStatus(AccountingStatus1Choice accountingStatus) {
		this.accountingStatus = accountingStatus;
	}

	public List<AccountRestrictions1> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<com.tools20022.repository.msg.AccountRestrictions1> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}