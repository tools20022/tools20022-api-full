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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV03;
import com.tools20022.repository.choice.AccountParties1Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Party related to an investment account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#mmPrincipalAccountParty
 * AccountParties6.mmPrincipalAccountParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#mmSecondaryOwner
 * AccountParties6.mmSecondaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#mmBeneficiary
 * AccountParties6.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#mmPowerOfAttorney
 * AccountParties6.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#mmLegalGuardian
 * AccountParties6.mmLegalGuardian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#mmSuccessorOnDeath
 * AccountParties6.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties6#mmAdministrator
 * AccountParties6.mmAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#mmOtherParty
 * AccountParties6.mmOtherParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#mmGranter
 * AccountParties6.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties6#mmSettler
 * AccountParties6.mmSettler}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV03#mmAccountParties
 * AccountDetailsConfirmationV03.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV03#mmAccountParties
 * AccountOpeningInstructionV03.mmAccountParties}</li>
 * </ul>
 * </li>
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
 * "AccountParties6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party related to an investment account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9
 * AccountParties9}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.AccountParties5
 * AccountParties5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AccountParties6", propOrder = {"principalAccountParty", "secondaryOwner", "beneficiary", "powerOfAttorney", "legalGuardian", "successorOnDeath", "administrator", "otherParty", "granter", "settler"})
public class AccountParties6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AccountParties1Choice principalAccountParty;
	/**
	 * Main party associated with the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice
	 * AccountParties1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties6
	 * AccountParties6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrncplAcctPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalAccountParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Main party associated with the account."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties9#mmPrincipalAccountParty
	 * AccountParties9.mmPrincipalAccountParty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrincipalAccountParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> AccountParties6.mmObject();
			isDerived = false;
			xmlTag = "PrncplAcctPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalAccountParty";
			definition = "Main party associated with the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties9.mmPrincipalAccountParty);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountParties1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> secondaryOwner;
	/**
	 * Entity that is not the primary owner when the ownership of the investment
	 * account is split among several owners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6
	 * InvestmentAccountOwnershipInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecondaryOwner
	 * SecondaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties6
	 * AccountParties6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that is not the primary owner when the ownership of the investment account is split among several owners."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties9#mmSecondaryOwner
	 * AccountParties9.mmSecondaryOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondaryOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecondaryOwner.mmObject();
			componentContext_lazy = () -> AccountParties6.mmObject();
			isDerived = false;
			xmlTag = "ScndryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryOwner";
			definition = "Entity that is not the primary owner when the ownership of the investment account is split among several owners.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties9.mmSecondaryOwner);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> beneficiary;
	/**
	 * Ultimate party that is entitled to either receive the benefits of the
	 * ownership of a financial instrument, or to be paid/credited as a result
	 * of a transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6
	 * InvestmentAccountOwnershipInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties6
	 * AccountParties6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bnfcry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties9#mmBeneficiary
	 * AccountParties9.mmBeneficiary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficiary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> AccountParties6.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties9.mmBeneficiary);
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> powerOfAttorney;
	/**
	 * Entity that was given the authority by another entity to act on its
	 * behalf.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6
	 * InvestmentAccountOwnershipInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MandateHolder MandateHolder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties6
	 * AccountParties6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PwrOfAttny"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that was given the authority by another entity to act on its behalf."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties9#mmPowerOfAttorney
	 * AccountParties9.mmPowerOfAttorney}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPowerOfAttorney = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MandateHolder.mmObject();
			componentContext_lazy = () -> AccountParties6.mmObject();
			isDerived = false;
			xmlTag = "PwrOfAttny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorney";
			definition = "Entity that was given the authority by another entity to act on its behalf.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties9.mmPowerOfAttorney);
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> legalGuardian;
	/**
	 * Entity that has been appointed by a legal authority to act on behalf of a
	 * person judged to be incapacitated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6
	 * InvestmentAccountOwnershipInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.LegalGuardianRole
	 * LegalGuardianRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties6
	 * AccountParties6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglGuardn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalGuardian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties9#mmLegalGuardian
	 * AccountParties9.mmLegalGuardian}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegalGuardian = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> LegalGuardianRole.mmObject();
			componentContext_lazy = () -> AccountParties6.mmObject();
			isDerived = false;
			xmlTag = "LglGuardn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalGuardian";
			definition = "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties9.mmLegalGuardian);
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> successorOnDeath;
	/**
	 * Deceased's estate, or successor, to whom the respective percentage of
	 * ownership will be transferred upon the death of one of the owners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6
	 * InvestmentAccountOwnershipInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuccessorOnDeath
	 * SuccessorOnDeath}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties6
	 * AccountParties6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SucssrOnDth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuccessorOnDeath"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties9#mmSuccessorOnDeath
	 * AccountParties9.mmSuccessorOnDeath}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSuccessorOnDeath = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SuccessorOnDeath.mmObject();
			componentContext_lazy = () -> AccountParties6.mmObject();
			isDerived = false;
			xmlTag = "SucssrOnDth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuccessorOnDeath";
			definition = "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties9.mmSuccessorOnDeath);
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.mmObject();
		}
	};
	protected InvestmentAccountOwnershipInformation6 administrator;
	/**
	 * Entity that has been appointed by a legal authorithy to act on behalf of
	 * a person or organisation that has gone bankrupt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6
	 * InvestmentAccountOwnershipInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdministratorRole
	 * AdministratorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties6
	 * AccountParties6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Admstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Administrator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that has been appointed by a legal authorithy to act on behalf of a person or organisation that has gone bankrupt."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties9#mmAdministrator
	 * AccountParties9.mmAdministrator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdministrator = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AdministratorRole.mmObject();
			componentContext_lazy = () -> AccountParties6.mmObject();
			isDerived = false;
			xmlTag = "Admstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Administrator";
			definition = "Entity that has been appointed by a legal authorithy to act on behalf of a person or organisation that has gone bankrupt.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties9.mmAdministrator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ExtendedParty3> otherParty;
	/**
	 * Other type of party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExtendedParty3
	 * ExtendedParty3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties6
	 * AccountParties6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other type of party."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties9#mmOtherParty
	 * AccountParties9.mmOtherParty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherParty = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> AccountParties6.mmObject();
			isDerived = false;
			xmlTag = "OthrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParty";
			definition = "Other type of party.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties9.mmOtherParty);
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExtendedParty3.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> granter;
	/**
	 * Granter role in the hedge funds industry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6
	 * InvestmentAccountOwnershipInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Grantor Grantor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties6
	 * AccountParties6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Granter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Granter role in the hedge funds industry."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9#mmGranter
	 * AccountParties9.mmGranter}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGranter = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Grantor.mmObject();
			componentContext_lazy = () -> AccountParties6.mmObject();
			isDerived = false;
			xmlTag = "Grntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Granter";
			definition = "Granter role in the hedge funds industry.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties9.mmGranter);
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> settler;
	/**
	 * Settler role in the hedge funds industry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6
	 * InvestmentAccountOwnershipInformation6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlor Settlor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties6
	 * AccountParties6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sttlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settler"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settler role in the hedge funds industry."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties9#mmSettler
	 * AccountParties9.mmSettler}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettler = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Settlor.mmObject();
			componentContext_lazy = () -> AccountParties6.mmObject();
			isDerived = false;
			xmlTag = "Sttlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settler";
			definition = "Settler role in the hedge funds industry.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties9.mmSettler);
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AccountParties6.mmPrincipalAccountParty, AccountParties6.mmSecondaryOwner, AccountParties6.mmBeneficiary, AccountParties6.mmPowerOfAttorney, AccountParties6.mmLegalGuardian,
						AccountParties6.mmSuccessorOnDeath, AccountParties6.mmAdministrator, AccountParties6.mmOtherParty, AccountParties6.mmGranter, AccountParties6.mmSettler);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV03.mmAccountParties, AccountOpeningInstructionV03.mmAccountParties);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountParties6";
				definition = "Party related to an investment account.";
				nextVersions_lazy = () -> Arrays.asList(AccountParties9.mmObject());
				previousVersion_lazy = () -> AccountParties5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PrncplAcctPty", required = true)
	public AccountParties1Choice getPrincipalAccountParty() {
		return principalAccountParty;
	}

	public void setPrincipalAccountParty(AccountParties1Choice principalAccountParty) {
		this.principalAccountParty = principalAccountParty;
	}

	@XmlElement(name = "ScndryOwnr")
	public List<InvestmentAccountOwnershipInformation6> getSecondaryOwner() {
		return secondaryOwner;
	}

	public void setSecondaryOwner(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> secondaryOwner) {
		this.secondaryOwner = secondaryOwner;
	}

	@XmlElement(name = "Bnfcry")
	public List<InvestmentAccountOwnershipInformation6> getBeneficiary() {
		return beneficiary;
	}

	public void setBeneficiary(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> beneficiary) {
		this.beneficiary = beneficiary;
	}

	@XmlElement(name = "PwrOfAttny")
	public List<InvestmentAccountOwnershipInformation6> getPowerOfAttorney() {
		return powerOfAttorney;
	}

	public void setPowerOfAttorney(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
	}

	@XmlElement(name = "LglGuardn")
	public List<InvestmentAccountOwnershipInformation6> getLegalGuardian() {
		return legalGuardian;
	}

	public void setLegalGuardian(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> legalGuardian) {
		this.legalGuardian = legalGuardian;
	}

	@XmlElement(name = "SucssrOnDth")
	public List<InvestmentAccountOwnershipInformation6> getSuccessorOnDeath() {
		return successorOnDeath;
	}

	public void setSuccessorOnDeath(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> successorOnDeath) {
		this.successorOnDeath = successorOnDeath;
	}

	@XmlElement(name = "Admstr")
	public InvestmentAccountOwnershipInformation6 getAdministrator() {
		return administrator;
	}

	public void setAdministrator(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6 administrator) {
		this.administrator = administrator;
	}

	@XmlElement(name = "OthrPty")
	public List<ExtendedParty3> getOtherParty() {
		return otherParty;
	}

	public void setOtherParty(List<com.tools20022.repository.msg.ExtendedParty3> otherParty) {
		this.otherParty = otherParty;
	}

	@XmlElement(name = "Grntr")
	public List<InvestmentAccountOwnershipInformation6> getGranter() {
		return granter;
	}

	public void setGranter(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> granter) {
		this.granter = granter;
	}

	@XmlElement(name = "Sttlr")
	public List<InvestmentAccountOwnershipInformation6> getSettler() {
		return settler;
	}

	public void setSettler(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation6> settler) {
		this.settler = settler;
	}
}