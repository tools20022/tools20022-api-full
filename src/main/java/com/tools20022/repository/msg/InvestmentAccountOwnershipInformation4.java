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
import com.tools20022.repository.codeset.MoneyLaunderingCheck1Code;
import com.tools20022.repository.datatype.Extended350Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;

/**
 * Characteristics of the ownership of an investment account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmMoneyLaunderingCheckOrExtendedRule
 * InvestmentAccountOwnershipInformation4.mmMoneyLaunderingCheckOrExtendedRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmOrganisationOrIndividualPersonRule
 * InvestmentAccountOwnershipInformation4.mmOrganisationOrIndividualPersonRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmOrganisation
 * InvestmentAccountOwnershipInformation4.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmIndividualPerson
 * InvestmentAccountOwnershipInformation4.mmIndividualPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmMoneyLaunderingCheck
 * InvestmentAccountOwnershipInformation4.mmMoneyLaunderingCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmExtendedMoneyLaunderingCheck
 * InvestmentAccountOwnershipInformation4.mmExtendedMoneyLaunderingCheck}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmOwnershipBeneficiaryRate
 * InvestmentAccountOwnershipInformation4.mmOwnershipBeneficiaryRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmClientIdentification
 * InvestmentAccountOwnershipInformation4.mmClientIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmFiscalExemption
 * InvestmentAccountOwnershipInformation4.mmFiscalExemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmSignatoryRightIndicator
 * InvestmentAccountOwnershipInformation4.mmSignatoryRightIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmModifiedInvestorProfileValidation
 * InvestmentAccountOwnershipInformation4.mmModifiedInvestorProfileValidation}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentAccountOwnershipInformation4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics of the ownership of an investment account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
 * InvestmentAccountOwnershipInformation7}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class InvestmentAccountOwnershipInformation4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Organisation3 organisation;
	/**
	 * Organised structure that is set up for a particular purpose, eg, a
	 * business, government body, department, charity, or financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Organisation3
	 * Organisation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation Organisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Org"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOrganisation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Organisation.mmObject();
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
			isDerived = false;
			xmlTag = "Org";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Organisation";
			definition = "Organised structure that is set up for a particular purpose, eg, a business, government body, department, charity, or financial institution.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Organisation3.mmObject();
		}
	};
	protected IndividualPerson11 individualPerson;
	/**
	 * Human entity, as distinguished from a corporate entity (which is
	 * sometimes referred to as an 'artificial person').
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson11
	 * IndividualPerson11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIndividualPerson = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
			isDerived = false;
			xmlTag = "IndvPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualPerson";
			definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IndividualPerson11.mmObject();
		}
	};
	protected MoneyLaunderingCheck1Code moneyLaunderingCheck;
	/**
	 * Status of an identity check to prevent money laundering. This includes
	 * the counter-terrorism check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheck1Code
	 * MoneyLaunderingCheck1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
	 * Party.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmMoneyLaunderingCheck = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
			isDerived = false;
			xmlTag = "MnyLndrgChck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MoneyLaunderingCheck1Code.mmObject();
		}
	};
	protected Extended350Code extendedMoneyLaunderingCheck;
	/**
	 * Status of an identity check to prevent money laundering. This includes
	 * the counter-terrorism check.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.Party#mmMoneyLaunderingCheck
	 * Party.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedMnyLndrgChck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedMoneyLaunderingCheck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of an identity check to prevent money laundering. This includes the counter-terrorism check."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedMoneyLaunderingCheck = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmMoneyLaunderingCheck;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
			isDerived = false;
			xmlTag = "XtndedMnyLndrgChck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedMoneyLaunderingCheck";
			definition = "Status of an identity check to prevent money laundering. This includes the counter-terrorism check.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	protected PercentageRate ownershipBeneficiaryRate;
	/**
	 * Percentage of ownership or beneficiary ownership of the shares/units in
	 * the account. All subsequent subscriptions and or redemptions will be
	 * allocated using the same percentage.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
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
	 * "Percentage of ownership or beneficiary ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnershipBeneficiaryRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountPartyRole.mmOwnershipBeneficiaryRate;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
			isDerived = false;
			xmlTag = "OwnrshBnfcryRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnershipBeneficiaryRate";
			definition = "Percentage of ownership or beneficiary ownership of the shares/units in the account. All subsequent subscriptions and or redemptions will be allocated using the same percentage.";
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
			isDerived = false;
			xmlTag = "ClntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientIdentification";
			definition = "Unique identification, as assigned by an organisation, to unambiguously identify a party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected YesNoIndicator fiscalExemption;
	/**
	 * Indicates whether an owner of an investment account may benefit from a
	 * fiscal exemption or amnesty for instance for declaring overseas
	 * investments.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
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
	 * "Indicates whether an owner of an investment account may benefit from a fiscal exemption or amnesty for instance for declaring overseas investments."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFiscalExemption = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmFiscalExemption;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
			isDerived = false;
			xmlTag = "FsclXmptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalExemption";
			definition = "Indicates whether an owner of an investment account may benefit from a fiscal exemption or amnesty for instance for declaring overseas investments.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected YesNoIndicator signatoryRightIndicator;
	/**
	 * Indicates whether the account owner signature is required to authorise
	 * transactions on the account.
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
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
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
	 * "Indicates whether the account owner signature is required to authorise transactions on the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSignatoryRightIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SignatureCondition.mmSignatoryRightIndicator;
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
			isDerived = false;
			xmlTag = "SgntryRghtInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatoryRightIndicator";
			definition = "Indicates whether the account owner signature is required to authorise transactions on the account.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ModificationScope11> modifiedInvestorProfileValidation;
	/**
	 * Information related to the party profile to be inserted or deleted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ModificationScope11
	 * ModificationScope11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmModifiedInvestorProfileValidation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
			isDerived = false;
			xmlTag = "ModfdInvstrPrflVldtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedInvestorProfileValidation";
			definition = "Information related to the party profile to be inserted or deleted.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ModificationScope11.mmObject();
		}
	};
	/**
	 * Either MoneyLaunderingCheck or ExtendedMoneyLaunderingCheck may be
	 * present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation4.mmMoneyLaunderingCheck}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmExtendedMoneyLaunderingCheck
	 * InvestmentAccountOwnershipInformation4.mmExtendedMoneyLaunderingCheck}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneyLaunderingCheckOrExtendedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either MoneyLaunderingCheck or ExtendedMoneyLaunderingCheck may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmMoneyLaunderingCheckOrExtendedRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneyLaunderingCheckOrExtendedRule";
			definition = "Either MoneyLaunderingCheck or ExtendedMoneyLaunderingCheck may be present, but not both.";
			messageComponent_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
			impactedElements_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation4.mmMoneyLaunderingCheck, InvestmentAccountOwnershipInformation4.mmExtendedMoneyLaunderingCheck);
		}
	};
	/**
	 * Either Organisation or IndividualPerson must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmOrganisation
	 * InvestmentAccountOwnershipInformation4.mmOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4#mmIndividualPerson
	 * InvestmentAccountOwnershipInformation4.mmIndividualPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationOrIndividualPersonRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either Organisation or IndividualPerson must be present, but not both."</li>
	 * </ul>
	 */
	public static final MMXor mmOrganisationOrIndividualPersonRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationOrIndividualPersonRule";
			definition = "Either Organisation or IndividualPerson must be present, but not both.";
			messageComponent_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
			impactedElements_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation4.mmOrganisation, InvestmentAccountOwnershipInformation4.mmIndividualPerson);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation4.mmOrganisation, InvestmentAccountOwnershipInformation4.mmIndividualPerson, InvestmentAccountOwnershipInformation4.mmMoneyLaunderingCheck,
						InvestmentAccountOwnershipInformation4.mmExtendedMoneyLaunderingCheck, InvestmentAccountOwnershipInformation4.mmOwnershipBeneficiaryRate, InvestmentAccountOwnershipInformation4.mmClientIdentification,
						InvestmentAccountOwnershipInformation4.mmFiscalExemption, InvestmentAccountOwnershipInformation4.mmSignatoryRightIndicator, InvestmentAccountOwnershipInformation4.mmModifiedInvestorProfileValidation);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "InvestmentAccountOwnershipInformation4";
				definition = "Characteristics of the ownership of an investment account.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation7.mmObject());
				xors_lazy = () -> Arrays.asList(InvestmentAccountOwnershipInformation4.mmMoneyLaunderingCheckOrExtendedRule, InvestmentAccountOwnershipInformation4.mmOrganisationOrIndividualPersonRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Organisation3 getOrganisation() {
		return organisation;
	}

	public void setOrganisation(com.tools20022.repository.msg.Organisation3 organisation) {
		this.organisation = organisation;
	}

	public IndividualPerson11 getIndividualPerson() {
		return individualPerson;
	}

	public void setIndividualPerson(com.tools20022.repository.msg.IndividualPerson11 individualPerson) {
		this.individualPerson = individualPerson;
	}

	public MoneyLaunderingCheck1Code getMoneyLaunderingCheck() {
		return moneyLaunderingCheck;
	}

	public void setMoneyLaunderingCheck(MoneyLaunderingCheck1Code moneyLaunderingCheck) {
		this.moneyLaunderingCheck = moneyLaunderingCheck;
	}

	public Extended350Code getExtendedMoneyLaunderingCheck() {
		return extendedMoneyLaunderingCheck;
	}

	public void setExtendedMoneyLaunderingCheck(Extended350Code extendedMoneyLaunderingCheck) {
		this.extendedMoneyLaunderingCheck = extendedMoneyLaunderingCheck;
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

	public List<ModificationScope11> getModifiedInvestorProfileValidation() {
		return modifiedInvestorProfileValidation;
	}

	public void setModifiedInvestorProfileValidation(List<com.tools20022.repository.msg.ModificationScope11> modifiedInvestorProfileValidation) {
		this.modifiedInvestorProfileValidation = modifiedInvestorProfileValidation;
	}
}