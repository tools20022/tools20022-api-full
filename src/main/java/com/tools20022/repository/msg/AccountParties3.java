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
 * Any party who is related to an investment account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#AccountOwnerRule
 * AccountParties3.AccountOwnerRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmModificationScopeIndication
 * AccountParties3.mmModificationScopeIndication}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmPrimaryOwner
 * AccountParties3.mmPrimaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmTrustee
 * AccountParties3.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmCustodianForMinor
 * AccountParties3.mmCustodianForMinor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmNominee
 * AccountParties3.mmNominee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmJointOwner
 * AccountParties3.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmSecondaryOwner
 * AccountParties3.mmSecondaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmBeneficiary
 * AccountParties3.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmPowerOfAttorney
 * AccountParties3.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmLegalGuardian
 * AccountParties3.mmLegalGuardian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmSuccessorOnDeath
 * AccountParties3.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmAdministrator
 * AccountParties3.mmAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmOtherParty
 * AccountParties3.mmOtherParty}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule#forAccountParties3
 * ConstraintRegistrationAddressIndicator1Rule.forAccountParties3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties3
 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintExtendedPartyRoleRule#forAccountParties3
 * ConstraintExtendedPartyRoleRule.forAccountParties3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintExtendedPartyRole2Rule#forAccountParties3
 * ConstraintExtendedPartyRole2Rule.forAccountParties3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAddressRule#forAccountParties3
 * ConstraintAddressRule.forAccountParties3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountParties3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Any party who is related to an investment account.\n\n"</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountParties3", propOrder = {"modificationScopeIndication", "primaryOwner", "trustee", "custodianForMinor", "nominee", "jointOwner", "secondaryOwner", "beneficiary", "powerOfAttorney", "legalGuardian",
		"successorOnDeath", "administrator", "otherParty"})
public class AccountParties3 {

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
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmModificationScopeIndication = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			isDerived = false;
			xmlTag = "ModScpIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationScopeIndication";
			definition = "Specifies the type of modification to be applied on a set of information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataModification1Code.mmObject();
		}
	};
	@XmlElement(name = "PmryOwnr")
	protected InvestmentAccountOwnershipInformation3 primaryOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrimaryOwner PrimaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPrimaryOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PrimaryOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			isDerived = false;
			xmlTag = "PmryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryOwner";
			definition = "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
		}
	};
	@XmlElement(name = "Trstee")
	protected InvestmentAccountOwnershipInformation3 trustee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TrusteeRole TrusteeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trstee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trustee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTrustee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TrusteeRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			isDerived = false;
			xmlTag = "Trstee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trustee";
			definition = "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
		}
	};
	@XmlElement(name = "CtdnForMnr")
	protected InvestmentAccountOwnershipInformation3 custodianForMinor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CustodianForMinor
	 * CustodianForMinor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdnForMnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianForMinor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCustodianForMinor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CustodianForMinor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			isDerived = false;
			xmlTag = "CtdnForMnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianForMinor";
			definition = "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
		}
	};
	@XmlElement(name = "Nmnee")
	protected InvestmentAccountOwnershipInformation3 nominee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Nominee Nominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nmnee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNominee = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Nominee.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			isDerived = false;
			xmlTag = "Nmnee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nominee";
			definition = "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
		}
	};
	@XmlElement(name = "JntOwnr")
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3> jointOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.JointOwner JointOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "JntOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Co-owner of the investment account when the ownership is assigned to more than one party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmJointOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> JointOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			isDerived = false;
			xmlTag = "JntOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointOwner";
			definition = "Co-owner of the investment account when the ownership is assigned to more than one party.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
		}
	};
	@XmlElement(name = "ScndryOwnr")
	protected InvestmentAccountOwnershipInformation3 secondaryOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecondaryOwner
	 * SecondaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
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
	 * "Entity that is not the primary owner when the ownership of the investment account is split among several owners. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondaryOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecondaryOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			isDerived = false;
			xmlTag = "ScndryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryOwner";
			definition = "Entity that is not the primary owner when the ownership of the investment account is split among several owners. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
		}
	};
	@XmlElement(name = "Bnfcry")
	protected InvestmentAccountOwnershipInformation3 beneficiary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficiary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
		}
	};
	@XmlElement(name = "PwrOfAttny")
	protected InvestmentAccountOwnershipInformation3 powerOfAttorney;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MandateHolder MandateHolder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPowerOfAttorney = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MandateHolder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			isDerived = false;
			xmlTag = "PwrOfAttny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorney";
			definition = "Entity that was given the authority by another entity to act on its behalf.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
		}
	};
	@XmlElement(name = "LglGuardn")
	protected InvestmentAccountOwnershipInformation3 legalGuardian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.LegalGuardianRole
	 * LegalGuardianRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
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
	 * "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegalGuardian = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> LegalGuardianRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			isDerived = false;
			xmlTag = "LglGuardn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalGuardian";
			definition = "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated. ";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
		}
	};
	@XmlElement(name = "SucssrOnDth")
	protected InvestmentAccountOwnershipInformation3 successorOnDeath;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuccessorOnDeath
	 * SuccessorOnDeath}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSuccessorOnDeath = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SuccessorOnDeath.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			isDerived = false;
			xmlTag = "SucssrOnDth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuccessorOnDeath";
			definition = "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
		}
	};
	@XmlElement(name = "Admstr")
	protected InvestmentAccountOwnershipInformation3 administrator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdministratorRole
	 * AdministratorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdministrator = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AdministratorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			isDerived = false;
			xmlTag = "Admstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Administrator";
			definition = "Entity that has been appointed by a legal authorithy to act on behalf of a person or organisation that has gone bankrupt.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
		}
	};
	@XmlElement(name = "OthrPty")
	protected InvestmentAccountOwnershipInformation3 otherParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3
	 * InvestmentAccountOwnershipInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherParty = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			isDerived = false;
			xmlTag = "OthrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParty";
			definition = "An other type of party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3.mmObject();
		}
	};
	/**
	 * Any occurrence of one and only one message element in the list
	 * (PrimaryOwner, Trustee, CustodianForMinor, Nominee, JointOwner) may be
	 * present. The chosen message element may be repeated if repetitive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties3
	 * AccountParties3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmPrimaryOwner
	 * AccountParties3.mmPrimaryOwner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmTrustee
	 * AccountParties3.mmTrustee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmCustodianForMinor
	 * AccountParties3.mmCustodianForMinor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties3#mmNominee
	 * AccountParties3.mmNominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties3#mmJointOwner
	 * AccountParties3.mmJointOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Any occurrence of one and only one message element in the list (PrimaryOwner, Trustee, CustodianForMinor, Nominee, JointOwner) may be present. The chosen message element may be repeated if repetitive."
	 * </li>
	 * </ul>
	 */
	public static final MMXor AccountOwnerRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "Any occurrence of one and only one message element in the list (PrimaryOwner, Trustee, CustodianForMinor, Nominee, JointOwner) may be present. The chosen message element may be repeated if repetitive.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.AccountParties3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties3.mmPrimaryOwner, com.tools20022.repository.msg.AccountParties3.mmTrustee,
					com.tools20022.repository.msg.AccountParties3.mmCustodianForMinor, com.tools20022.repository.msg.AccountParties3.mmNominee, com.tools20022.repository.msg.AccountParties3.mmJointOwner);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties3.mmModificationScopeIndication, com.tools20022.repository.msg.AccountParties3.mmPrimaryOwner,
						com.tools20022.repository.msg.AccountParties3.mmTrustee, com.tools20022.repository.msg.AccountParties3.mmCustodianForMinor, com.tools20022.repository.msg.AccountParties3.mmNominee,
						com.tools20022.repository.msg.AccountParties3.mmJointOwner, com.tools20022.repository.msg.AccountParties3.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties3.mmBeneficiary,
						com.tools20022.repository.msg.AccountParties3.mmPowerOfAttorney, com.tools20022.repository.msg.AccountParties3.mmLegalGuardian, com.tools20022.repository.msg.AccountParties3.mmSuccessorOnDeath,
						com.tools20022.repository.msg.AccountParties3.mmAdministrator, com.tools20022.repository.msg.AccountParties3.mmOtherParty);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule.forAccountParties3,
						com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties3, com.tools20022.repository.constraints.ConstraintExtendedPartyRoleRule.forAccountParties3,
						com.tools20022.repository.constraints.ConstraintExtendedPartyRole2Rule.forAccountParties3, com.tools20022.repository.constraints.ConstraintAddressRule.forAccountParties3);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountParties3";
				definition = "Any party who is related to an investment account.\n\n";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties3.AccountOwnerRule);
			}
		});
		return mmObject_lazy.get();
	}

	public DataModification1Code getModificationScopeIndication() {
		return modificationScopeIndication;
	}

	public AccountParties3 setModificationScopeIndication(DataModification1Code modificationScopeIndication) {
		this.modificationScopeIndication = Objects.requireNonNull(modificationScopeIndication);
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation3> getPrimaryOwner() {
		return primaryOwner == null ? Optional.empty() : Optional.of(primaryOwner);
	}

	public AccountParties3 setPrimaryOwner(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3 primaryOwner) {
		this.primaryOwner = primaryOwner;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation3> getTrustee() {
		return trustee == null ? Optional.empty() : Optional.of(trustee);
	}

	public AccountParties3 setTrustee(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3 trustee) {
		this.trustee = trustee;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation3> getCustodianForMinor() {
		return custodianForMinor == null ? Optional.empty() : Optional.of(custodianForMinor);
	}

	public AccountParties3 setCustodianForMinor(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3 custodianForMinor) {
		this.custodianForMinor = custodianForMinor;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation3> getNominee() {
		return nominee == null ? Optional.empty() : Optional.of(nominee);
	}

	public AccountParties3 setNominee(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3 nominee) {
		this.nominee = nominee;
		return this;
	}

	public List<InvestmentAccountOwnershipInformation3> getJointOwner() {
		return jointOwner == null ? jointOwner = new ArrayList<>() : jointOwner;
	}

	public AccountParties3 setJointOwner(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3> jointOwner) {
		this.jointOwner = Objects.requireNonNull(jointOwner);
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation3> getSecondaryOwner() {
		return secondaryOwner == null ? Optional.empty() : Optional.of(secondaryOwner);
	}

	public AccountParties3 setSecondaryOwner(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3 secondaryOwner) {
		this.secondaryOwner = secondaryOwner;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation3> getBeneficiary() {
		return beneficiary == null ? Optional.empty() : Optional.of(beneficiary);
	}

	public AccountParties3 setBeneficiary(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3 beneficiary) {
		this.beneficiary = beneficiary;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation3> getPowerOfAttorney() {
		return powerOfAttorney == null ? Optional.empty() : Optional.of(powerOfAttorney);
	}

	public AccountParties3 setPowerOfAttorney(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3 powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation3> getLegalGuardian() {
		return legalGuardian == null ? Optional.empty() : Optional.of(legalGuardian);
	}

	public AccountParties3 setLegalGuardian(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3 legalGuardian) {
		this.legalGuardian = legalGuardian;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation3> getSuccessorOnDeath() {
		return successorOnDeath == null ? Optional.empty() : Optional.of(successorOnDeath);
	}

	public AccountParties3 setSuccessorOnDeath(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3 successorOnDeath) {
		this.successorOnDeath = successorOnDeath;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation3> getAdministrator() {
		return administrator == null ? Optional.empty() : Optional.of(administrator);
	}

	public AccountParties3 setAdministrator(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3 administrator) {
		this.administrator = administrator;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation3> getOtherParty() {
		return otherParty == null ? Optional.empty() : Optional.of(otherParty);
	}

	public AccountParties3 setOtherParty(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation3 otherParty) {
		this.otherParty = otherParty;
		return this;
	}
}