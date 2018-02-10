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
import com.tools20022.repository.area.acmt.AccountModificationInstructionV03;
import com.tools20022.repository.choice.AccountParties2Choice;
import com.tools20022.repository.codeset.DataModification1Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.AccountParties7#mmModificationScopeIndication
 * AccountParties7.mmModificationScopeIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#mmPrincipalAccountParty
 * AccountParties7.mmPrincipalAccountParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#mmSecondaryOwner
 * AccountParties7.mmSecondaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#mmBeneficiary
 * AccountParties7.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#mmPowerOfAttorney
 * AccountParties7.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#mmLegalGuardian
 * AccountParties7.mmLegalGuardian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#mmSuccessorOnDeath
 * AccountParties7.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties7#mmAdministrator
 * AccountParties7.mmAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#mmGranter
 * AccountParties7.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#mmSettler
 * AccountParties7.mmSettler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7#mmOtherParty
 * AccountParties7.mmOtherParty}</li>
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
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV03#mmModifiedAccountParties
 * AccountModificationInstructionV03.mmModifiedAccountParties}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule#forAccountParties7
 * ConstraintRegistrationAddressIndicator1Rule.forAccountParties7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties7
 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties7}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAddressRule#forAccountParties7
 * ConstraintAddressRule.forAccountParties7}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountParties7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party related to an investment account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8
 * AccountParties8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.AccountParties4
 * AccountParties4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountParties7", propOrder = {"modificationScopeIndication", "principalAccountParty", "secondaryOwner", "beneficiary", "powerOfAttorney", "legalGuardian", "successorOnDeath", "administrator", "granter", "settler",
		"otherParty"})
public class AccountParties7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ModScpIndctn", required = true)
	protected DataModification1Code modificationScopeIndication;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataModification1Code
	 * DataModification1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModScpIndctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModificationScopeIndication"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of modification to be applied on a set of information."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmModificationScopeIndication
	 * AccountParties8.mmModificationScopeIndication}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmModificationScopeIndication = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties7.mmObject();
			isDerived = false;
			xmlTag = "ModScpIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationScopeIndication";
			definition = "Specifies the type of modification to be applied on a set of information.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties8.mmModificationScopeIndication);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataModification1Code.mmObject();
		}
	};
	@XmlElement(name = "PrncplAcctPty")
	protected AccountParties2Choice principalAccountParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties2Choice
	 * AccountParties2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmPrincipalAccountParty
	 * AccountParties8.mmPrincipalAccountParty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrincipalAccountParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties7.mmObject();
			isDerived = false;
			xmlTag = "PrncplAcctPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalAccountParty";
			definition = "Main party associated with the account.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties8.mmPrincipalAccountParty);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountParties2Choice.mmObject();
		}
	};
	@XmlElement(name = "ScndryOwnr")
	protected InvestmentAccountOwnershipInformation7 secondaryOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecondaryOwner
	 * SecondaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmSecondaryOwner
	 * AccountParties8.mmSecondaryOwner}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondaryOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecondaryOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties7.mmObject();
			isDerived = false;
			xmlTag = "ScndryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryOwner";
			definition = "Entity that is not the primary owner when the ownership of the investment account is split among several owners.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties8.mmSecondaryOwner);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
		}
	};
	@XmlElement(name = "Bnfcry")
	protected InvestmentAccountOwnershipInformation7 beneficiary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmBeneficiary
	 * AccountParties8.mmBeneficiary}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficiary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties7.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties8.mmBeneficiary);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
		}
	};
	@XmlElement(name = "PwrOfAttny")
	protected InvestmentAccountOwnershipInformation7 powerOfAttorney;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MandateHolder MandateHolder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmPowerOfAttorney
	 * AccountParties8.mmPowerOfAttorney}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPowerOfAttorney = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MandateHolder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties7.mmObject();
			isDerived = false;
			xmlTag = "PwrOfAttny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorney";
			definition = "Entity that was given the authority by another entity to act on its behalf.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties8.mmPowerOfAttorney);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
		}
	};
	@XmlElement(name = "LglGuardn")
	protected InvestmentAccountOwnershipInformation7 legalGuardian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.LegalGuardianRole
	 * LegalGuardianRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmLegalGuardian
	 * AccountParties8.mmLegalGuardian}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegalGuardian = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> LegalGuardianRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties7.mmObject();
			isDerived = false;
			xmlTag = "LglGuardn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalGuardian";
			definition = "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties8.mmLegalGuardian);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
		}
	};
	@XmlElement(name = "SucssrOnDth")
	protected InvestmentAccountOwnershipInformation7 successorOnDeath;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuccessorOnDeath
	 * SuccessorOnDeath}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmSuccessorOnDeath
	 * AccountParties8.mmSuccessorOnDeath}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSuccessorOnDeath = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SuccessorOnDeath.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties7.mmObject();
			isDerived = false;
			xmlTag = "SucssrOnDth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuccessorOnDeath";
			definition = "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties8.mmSuccessorOnDeath);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
		}
	};
	@XmlElement(name = "Admstr")
	protected InvestmentAccountOwnershipInformation7 administrator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdministratorRole
	 * AdministratorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmAdministrator
	 * AccountParties8.mmAdministrator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdministrator = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AdministratorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties7.mmObject();
			isDerived = false;
			xmlTag = "Admstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Administrator";
			definition = "Entity that has been appointed by a legal authorithy to act on behalf of a person or organisation that has gone bankrupt.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties8.mmAdministrator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
		}
	};
	@XmlElement(name = "Grntr")
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7> granter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Grantor Grantor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8#mmGranter
	 * AccountParties8.mmGranter}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGranter = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Grantor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties7.mmObject();
			isDerived = false;
			xmlTag = "Grntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Granter";
			definition = "Granter role in the hedge funds industry.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties8.mmGranter);
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
		}
	};
	@XmlElement(name = "Sttlr")
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7> settler;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7
	 * InvestmentAccountOwnershipInformation7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlor Settlor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties8#mmSettler
	 * AccountParties8.mmSettler}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettler = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Settlor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties7.mmObject();
			isDerived = false;
			xmlTag = "Sttlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settler";
			definition = "Settler role in the hedge funds industry.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties8.mmSettler);
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7.mmObject();
		}
	};
	@XmlElement(name = "OthrPty")
	protected List<com.tools20022.repository.msg.ExtendedParty4> otherParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExtendedParty4
	 * ExtendedParty4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties7
	 * AccountParties7}</li>
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
	 * definition} = "An other type of party."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties8#mmOtherParty
	 * AccountParties8.mmOtherParty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherParty = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties7.mmObject();
			isDerived = false;
			xmlTag = "OthrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParty";
			definition = "An other type of party.";
			nextVersions_lazy = () -> Arrays.asList(AccountParties8.mmOtherParty);
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExtendedParty4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties7.mmModificationScopeIndication, com.tools20022.repository.msg.AccountParties7.mmPrincipalAccountParty,
						com.tools20022.repository.msg.AccountParties7.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties7.mmBeneficiary, com.tools20022.repository.msg.AccountParties7.mmPowerOfAttorney,
						com.tools20022.repository.msg.AccountParties7.mmLegalGuardian, com.tools20022.repository.msg.AccountParties7.mmSuccessorOnDeath, com.tools20022.repository.msg.AccountParties7.mmAdministrator,
						com.tools20022.repository.msg.AccountParties7.mmGranter, com.tools20022.repository.msg.AccountParties7.mmSettler, com.tools20022.repository.msg.AccountParties7.mmOtherParty);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountModificationInstructionV03.mmModifiedAccountParties);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule.forAccountParties7,
						com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties7, com.tools20022.repository.constraints.ConstraintAddressRule.forAccountParties7);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountParties7";
				definition = "Party related to an investment account.";
				nextVersions_lazy = () -> Arrays.asList(AccountParties8.mmObject());
				previousVersion_lazy = () -> AccountParties4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DataModification1Code getModificationScopeIndication() {
		return modificationScopeIndication;
	}

	public AccountParties7 setModificationScopeIndication(DataModification1Code modificationScopeIndication) {
		this.modificationScopeIndication = Objects.requireNonNull(modificationScopeIndication);
		return this;
	}

	public Optional<AccountParties2Choice> getPrincipalAccountParty() {
		return principalAccountParty == null ? Optional.empty() : Optional.of(principalAccountParty);
	}

	public AccountParties7 setPrincipalAccountParty(AccountParties2Choice principalAccountParty) {
		this.principalAccountParty = principalAccountParty;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation7> getSecondaryOwner() {
		return secondaryOwner == null ? Optional.empty() : Optional.of(secondaryOwner);
	}

	public AccountParties7 setSecondaryOwner(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7 secondaryOwner) {
		this.secondaryOwner = secondaryOwner;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation7> getBeneficiary() {
		return beneficiary == null ? Optional.empty() : Optional.of(beneficiary);
	}

	public AccountParties7 setBeneficiary(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7 beneficiary) {
		this.beneficiary = beneficiary;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation7> getPowerOfAttorney() {
		return powerOfAttorney == null ? Optional.empty() : Optional.of(powerOfAttorney);
	}

	public AccountParties7 setPowerOfAttorney(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7 powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation7> getLegalGuardian() {
		return legalGuardian == null ? Optional.empty() : Optional.of(legalGuardian);
	}

	public AccountParties7 setLegalGuardian(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7 legalGuardian) {
		this.legalGuardian = legalGuardian;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation7> getSuccessorOnDeath() {
		return successorOnDeath == null ? Optional.empty() : Optional.of(successorOnDeath);
	}

	public AccountParties7 setSuccessorOnDeath(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7 successorOnDeath) {
		this.successorOnDeath = successorOnDeath;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation7> getAdministrator() {
		return administrator == null ? Optional.empty() : Optional.of(administrator);
	}

	public AccountParties7 setAdministrator(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7 administrator) {
		this.administrator = administrator;
		return this;
	}

	public List<InvestmentAccountOwnershipInformation7> getGranter() {
		return granter == null ? granter = new ArrayList<>() : granter;
	}

	public AccountParties7 setGranter(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7> granter) {
		this.granter = Objects.requireNonNull(granter);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation7> getSettler() {
		return settler == null ? settler = new ArrayList<>() : settler;
	}

	public AccountParties7 setSettler(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation7> settler) {
		this.settler = Objects.requireNonNull(settler);
		return this;
	}

	public List<ExtendedParty4> getOtherParty() {
		return otherParty == null ? otherParty = new ArrayList<>() : otherParty;
	}

	public AccountParties7 setOtherParty(List<com.tools20022.repository.msg.ExtendedParty4> otherParty) {
		this.otherParty = Objects.requireNonNull(otherParty);
		return this;
	}
}