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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMXor;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Any party who is related to an investment account.
 * 
 * .
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#AccountOwnerRule
 * AccountParties2.AccountOwnerRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmPrimaryOwner
 * AccountParties2.mmPrimaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmTrustee
 * AccountParties2.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmCustodianForMinor
 * AccountParties2.mmCustodianForMinor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmNominee
 * AccountParties2.mmNominee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmJointOwner
 * AccountParties2.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmSecondaryOwner
 * AccountParties2.mmSecondaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmBeneficiary
 * AccountParties2.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmPowerOfAttorney
 * AccountParties2.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmLegalGuardian
 * AccountParties2.mmLegalGuardian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmSuccessorOnDeath
 * AccountParties2.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmAdministrator
 * AccountParties2.mmAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmOtherParty
 * AccountParties2.mmOtherParty}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintBeneficiaryRule#forAccountParties2
 * ConstraintBeneficiaryRule.forAccountParties2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule#forAccountParties2
 * ConstraintRegistrationAddressIndicator1Rule.forAccountParties2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties2
 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintExtendedPartyRoleRule#forAccountParties2
 * ConstraintExtendedPartyRoleRule.forAccountParties2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintExtendedPartyRole2Rule#forAccountParties2
 * ConstraintExtendedPartyRole2Rule.forAccountParties2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountParties2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Any party who is related to an investment account.\n\n."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountParties2", propOrder = {"primaryOwner", "trustee", "custodianForMinor", "nominee", "jointOwner", "secondaryOwner", "beneficiary", "powerOfAttorney", "legalGuardian", "successorOnDeath", "administrator", "otherParty"})
public class AccountParties2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PmryOwnr", required = true)
	protected InvestmentAccountOwnershipInformation2 primaryOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2
	 * InvestmentAccountOwnershipInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrimaryOwner PrimaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
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
	public static final MMMessageAssociationEnd<AccountParties2, InvestmentAccountOwnershipInformation2> mmPrimaryOwner = new MMMessageAssociationEnd<AccountParties2, InvestmentAccountOwnershipInformation2>() {
		{
			businessComponentTrace_lazy = () -> PrimaryOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties2.mmObject();
			isDerived = false;
			xmlTag = "PmryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryOwner";
			definition = "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation2.mmObject();
		}

		@Override
		public InvestmentAccountOwnershipInformation2 getValue(AccountParties2 obj) {
			return obj.getPrimaryOwner();
		}

		@Override
		public void setValue(AccountParties2 obj, InvestmentAccountOwnershipInformation2 value) {
			obj.setPrimaryOwner(value);
		}
	};
	@XmlElement(name = "Trstee", required = true)
	protected InvestmentAccountOwnershipInformation2 trustee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2
	 * InvestmentAccountOwnershipInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TrusteeRole TrusteeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
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
	public static final MMMessageAssociationEnd<AccountParties2, InvestmentAccountOwnershipInformation2> mmTrustee = new MMMessageAssociationEnd<AccountParties2, InvestmentAccountOwnershipInformation2>() {
		{
			businessComponentTrace_lazy = () -> TrusteeRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties2.mmObject();
			isDerived = false;
			xmlTag = "Trstee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trustee";
			definition = "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation2.mmObject();
		}

		@Override
		public InvestmentAccountOwnershipInformation2 getValue(AccountParties2 obj) {
			return obj.getTrustee();
		}

		@Override
		public void setValue(AccountParties2 obj, InvestmentAccountOwnershipInformation2 value) {
			obj.setTrustee(value);
		}
	};
	@XmlElement(name = "CtdnForMnr", required = true)
	protected InvestmentAccountOwnershipInformation2 custodianForMinor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2
	 * InvestmentAccountOwnershipInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CustodianForMinor
	 * CustodianForMinor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
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
	public static final MMMessageAssociationEnd<AccountParties2, InvestmentAccountOwnershipInformation2> mmCustodianForMinor = new MMMessageAssociationEnd<AccountParties2, InvestmentAccountOwnershipInformation2>() {
		{
			businessComponentTrace_lazy = () -> CustodianForMinor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties2.mmObject();
			isDerived = false;
			xmlTag = "CtdnForMnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianForMinor";
			definition = "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation2.mmObject();
		}

		@Override
		public InvestmentAccountOwnershipInformation2 getValue(AccountParties2 obj) {
			return obj.getCustodianForMinor();
		}

		@Override
		public void setValue(AccountParties2 obj, InvestmentAccountOwnershipInformation2 value) {
			obj.setCustodianForMinor(value);
		}
	};
	@XmlElement(name = "Nmnee", required = true)
	protected InvestmentAccountOwnershipInformation2 nominee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2
	 * InvestmentAccountOwnershipInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Nominee Nominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
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
	public static final MMMessageAssociationEnd<AccountParties2, InvestmentAccountOwnershipInformation2> mmNominee = new MMMessageAssociationEnd<AccountParties2, InvestmentAccountOwnershipInformation2>() {
		{
			businessComponentTrace_lazy = () -> Nominee.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties2.mmObject();
			isDerived = false;
			xmlTag = "Nmnee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nominee";
			definition = "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation2.mmObject();
		}

		@Override
		public InvestmentAccountOwnershipInformation2 getValue(AccountParties2 obj) {
			return obj.getNominee();
		}

		@Override
		public void setValue(AccountParties2 obj, InvestmentAccountOwnershipInformation2 value) {
			obj.setNominee(value);
		}
	};
	@XmlElement(name = "JntOwnr", required = true)
	protected List<InvestmentAccountOwnershipInformation2> jointOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2
	 * InvestmentAccountOwnershipInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.JointOwner JointOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
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
	public static final MMMessageAssociationEnd<AccountParties2, List<InvestmentAccountOwnershipInformation2>> mmJointOwner = new MMMessageAssociationEnd<AccountParties2, List<InvestmentAccountOwnershipInformation2>>() {
		{
			businessComponentTrace_lazy = () -> JointOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties2.mmObject();
			isDerived = false;
			xmlTag = "JntOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointOwner";
			definition = "Co-owner of the investment account when the ownership is assigned to more than one party.";
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation2.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation2> getValue(AccountParties2 obj) {
			return obj.getJointOwner();
		}

		@Override
		public void setValue(AccountParties2 obj, List<InvestmentAccountOwnershipInformation2> value) {
			obj.setJointOwner(value);
		}
	};
	@XmlElement(name = "ScndryOwnr")
	protected List<InvestmentAccountOwnershipInformation2> secondaryOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2
	 * InvestmentAccountOwnershipInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecondaryOwner
	 * SecondaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties2, List<InvestmentAccountOwnershipInformation2>> mmSecondaryOwner = new MMMessageAssociationEnd<AccountParties2, List<InvestmentAccountOwnershipInformation2>>() {
		{
			businessComponentTrace_lazy = () -> SecondaryOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties2.mmObject();
			isDerived = false;
			xmlTag = "ScndryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryOwner";
			definition = "Entity that is not the primary owner when the ownership of the investment account is split among several owners.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation2.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation2> getValue(AccountParties2 obj) {
			return obj.getSecondaryOwner();
		}

		@Override
		public void setValue(AccountParties2 obj, List<InvestmentAccountOwnershipInformation2> value) {
			obj.setSecondaryOwner(value);
		}
	};
	@XmlElement(name = "Bnfcry")
	protected List<InvestmentAccountOwnershipInformation2> beneficiary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2
	 * InvestmentAccountOwnershipInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
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
	public static final MMMessageAssociationEnd<AccountParties2, List<InvestmentAccountOwnershipInformation2>> mmBeneficiary = new MMMessageAssociationEnd<AccountParties2, List<InvestmentAccountOwnershipInformation2>>() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties2.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer.";
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation2.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation2> getValue(AccountParties2 obj) {
			return obj.getBeneficiary();
		}

		@Override
		public void setValue(AccountParties2 obj, List<InvestmentAccountOwnershipInformation2> value) {
			obj.setBeneficiary(value);
		}
	};
	@XmlElement(name = "PwrOfAttny")
	protected List<InvestmentAccountOwnershipInformation2> powerOfAttorney;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2
	 * InvestmentAccountOwnershipInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MandateHolder MandateHolder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
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
	public static final MMMessageAssociationEnd<AccountParties2, List<InvestmentAccountOwnershipInformation2>> mmPowerOfAttorney = new MMMessageAssociationEnd<AccountParties2, List<InvestmentAccountOwnershipInformation2>>() {
		{
			businessComponentTrace_lazy = () -> MandateHolder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties2.mmObject();
			isDerived = false;
			xmlTag = "PwrOfAttny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorney";
			definition = "Entity that was given the authority by another entity to act on its behalf.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation2.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation2> getValue(AccountParties2 obj) {
			return obj.getPowerOfAttorney();
		}

		@Override
		public void setValue(AccountParties2 obj, List<InvestmentAccountOwnershipInformation2> value) {
			obj.setPowerOfAttorney(value);
		}
	};
	@XmlElement(name = "LglGuardn")
	protected List<InvestmentAccountOwnershipInformation2> legalGuardian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2
	 * InvestmentAccountOwnershipInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.LegalGuardianRole
	 * LegalGuardianRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties2, List<InvestmentAccountOwnershipInformation2>> mmLegalGuardian = new MMMessageAssociationEnd<AccountParties2, List<InvestmentAccountOwnershipInformation2>>() {
		{
			businessComponentTrace_lazy = () -> LegalGuardianRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties2.mmObject();
			isDerived = false;
			xmlTag = "LglGuardn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalGuardian";
			definition = "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation2.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation2> getValue(AccountParties2 obj) {
			return obj.getLegalGuardian();
		}

		@Override
		public void setValue(AccountParties2 obj, List<InvestmentAccountOwnershipInformation2> value) {
			obj.setLegalGuardian(value);
		}
	};
	@XmlElement(name = "SucssrOnDth")
	protected List<InvestmentAccountOwnershipInformation2> successorOnDeath;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2
	 * InvestmentAccountOwnershipInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuccessorOnDeath
	 * SuccessorOnDeath}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
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
	public static final MMMessageAssociationEnd<AccountParties2, List<InvestmentAccountOwnershipInformation2>> mmSuccessorOnDeath = new MMMessageAssociationEnd<AccountParties2, List<InvestmentAccountOwnershipInformation2>>() {
		{
			businessComponentTrace_lazy = () -> SuccessorOnDeath.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties2.mmObject();
			isDerived = false;
			xmlTag = "SucssrOnDth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuccessorOnDeath";
			definition = "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation2.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation2> getValue(AccountParties2 obj) {
			return obj.getSuccessorOnDeath();
		}

		@Override
		public void setValue(AccountParties2 obj, List<InvestmentAccountOwnershipInformation2> value) {
			obj.setSuccessorOnDeath(value);
		}
	};
	@XmlElement(name = "Admstr")
	protected InvestmentAccountOwnershipInformation2 administrator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2
	 * InvestmentAccountOwnershipInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdministratorRole
	 * AdministratorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
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
	public static final MMMessageAssociationEnd<AccountParties2, Optional<InvestmentAccountOwnershipInformation2>> mmAdministrator = new MMMessageAssociationEnd<AccountParties2, Optional<InvestmentAccountOwnershipInformation2>>() {
		{
			businessComponentTrace_lazy = () -> AdministratorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties2.mmObject();
			isDerived = false;
			xmlTag = "Admstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Administrator";
			definition = "Entity that has been appointed by a legal authorithy to act on behalf of a person or organisation that has gone bankrupt.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation2.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation2> getValue(AccountParties2 obj) {
			return obj.getAdministrator();
		}

		@Override
		public void setValue(AccountParties2 obj, Optional<InvestmentAccountOwnershipInformation2> value) {
			obj.setAdministrator(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrPty")
	protected InvestmentAccountOwnershipInformation2 otherParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation2
	 * InvestmentAccountOwnershipInformation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
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
	public static final MMMessageAssociationEnd<AccountParties2, Optional<InvestmentAccountOwnershipInformation2>> mmOtherParty = new MMMessageAssociationEnd<AccountParties2, Optional<InvestmentAccountOwnershipInformation2>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties2.mmObject();
			isDerived = false;
			xmlTag = "OthrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParty";
			definition = "An other type of party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation2.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation2> getValue(AccountParties2 obj) {
			return obj.getOtherParty();
		}

		@Override
		public void setValue(AccountParties2 obj, Optional<InvestmentAccountOwnershipInformation2> value) {
			obj.setOtherParty(value.orElse(null));
		}
	};
	/**
	 * At least one occurrence of one and only one message element in the list
	 * (PrimaryOwner, Trustee, CustodianForMinor, Nominee, JointOwner) must be
	 * present. The chosen message element may be repeated, if repetitive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties2
	 * AccountParties2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmPrimaryOwner
	 * AccountParties2.mmPrimaryOwner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmTrustee
	 * AccountParties2.mmTrustee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmCustodianForMinor
	 * AccountParties2.mmCustodianForMinor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties2#mmNominee
	 * AccountParties2.mmNominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties2#mmJointOwner
	 * AccountParties2.mmJointOwner}</li>
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
	 * "At least one occurrence of one and only one message element in the list (PrimaryOwner, Trustee, CustodianForMinor, Nominee, JointOwner) must be present. The chosen message element may be repeated, if repetitive."
	 * </li>
	 * </ul>
	 */
	public static final MMXor AccountOwnerRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerRule";
			definition = "At least one occurrence of one and only one message element in the list (PrimaryOwner, Trustee, CustodianForMinor, Nominee, JointOwner) must be present. The chosen message element may be repeated, if repetitive.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.AccountParties2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.mmPrimaryOwner, com.tools20022.repository.msg.AccountParties2.mmTrustee,
					com.tools20022.repository.msg.AccountParties2.mmCustodianForMinor, com.tools20022.repository.msg.AccountParties2.mmNominee, com.tools20022.repository.msg.AccountParties2.mmJointOwner);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.mmPrimaryOwner, com.tools20022.repository.msg.AccountParties2.mmTrustee,
						com.tools20022.repository.msg.AccountParties2.mmCustodianForMinor, com.tools20022.repository.msg.AccountParties2.mmNominee, com.tools20022.repository.msg.AccountParties2.mmJointOwner,
						com.tools20022.repository.msg.AccountParties2.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties2.mmBeneficiary, com.tools20022.repository.msg.AccountParties2.mmPowerOfAttorney,
						com.tools20022.repository.msg.AccountParties2.mmLegalGuardian, com.tools20022.repository.msg.AccountParties2.mmSuccessorOnDeath, com.tools20022.repository.msg.AccountParties2.mmAdministrator,
						com.tools20022.repository.msg.AccountParties2.mmOtherParty);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintBeneficiaryRule.forAccountParties2, com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule.forAccountParties2,
						com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties2, com.tools20022.repository.constraints.ConstraintExtendedPartyRoleRule.forAccountParties2,
						com.tools20022.repository.constraints.ConstraintExtendedPartyRole2Rule.forAccountParties2);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountParties2";
				definition = "Any party who is related to an investment account.\n\n.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties2.AccountOwnerRule);
			}
		});
		return mmObject_lazy.get();
	}

	public InvestmentAccountOwnershipInformation2 getPrimaryOwner() {
		return primaryOwner;
	}

	public AccountParties2 setPrimaryOwner(InvestmentAccountOwnershipInformation2 primaryOwner) {
		this.primaryOwner = Objects.requireNonNull(primaryOwner);
		return this;
	}

	public InvestmentAccountOwnershipInformation2 getTrustee() {
		return trustee;
	}

	public AccountParties2 setTrustee(InvestmentAccountOwnershipInformation2 trustee) {
		this.trustee = Objects.requireNonNull(trustee);
		return this;
	}

	public InvestmentAccountOwnershipInformation2 getCustodianForMinor() {
		return custodianForMinor;
	}

	public AccountParties2 setCustodianForMinor(InvestmentAccountOwnershipInformation2 custodianForMinor) {
		this.custodianForMinor = Objects.requireNonNull(custodianForMinor);
		return this;
	}

	public InvestmentAccountOwnershipInformation2 getNominee() {
		return nominee;
	}

	public AccountParties2 setNominee(InvestmentAccountOwnershipInformation2 nominee) {
		this.nominee = Objects.requireNonNull(nominee);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation2> getJointOwner() {
		return jointOwner == null ? jointOwner = new ArrayList<>() : jointOwner;
	}

	public AccountParties2 setJointOwner(List<InvestmentAccountOwnershipInformation2> jointOwner) {
		this.jointOwner = Objects.requireNonNull(jointOwner);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation2> getSecondaryOwner() {
		return secondaryOwner == null ? secondaryOwner = new ArrayList<>() : secondaryOwner;
	}

	public AccountParties2 setSecondaryOwner(List<InvestmentAccountOwnershipInformation2> secondaryOwner) {
		this.secondaryOwner = Objects.requireNonNull(secondaryOwner);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation2> getBeneficiary() {
		return beneficiary == null ? beneficiary = new ArrayList<>() : beneficiary;
	}

	public AccountParties2 setBeneficiary(List<InvestmentAccountOwnershipInformation2> beneficiary) {
		this.beneficiary = Objects.requireNonNull(beneficiary);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation2> getPowerOfAttorney() {
		return powerOfAttorney == null ? powerOfAttorney = new ArrayList<>() : powerOfAttorney;
	}

	public AccountParties2 setPowerOfAttorney(List<InvestmentAccountOwnershipInformation2> powerOfAttorney) {
		this.powerOfAttorney = Objects.requireNonNull(powerOfAttorney);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation2> getLegalGuardian() {
		return legalGuardian == null ? legalGuardian = new ArrayList<>() : legalGuardian;
	}

	public AccountParties2 setLegalGuardian(List<InvestmentAccountOwnershipInformation2> legalGuardian) {
		this.legalGuardian = Objects.requireNonNull(legalGuardian);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation2> getSuccessorOnDeath() {
		return successorOnDeath == null ? successorOnDeath = new ArrayList<>() : successorOnDeath;
	}

	public AccountParties2 setSuccessorOnDeath(List<InvestmentAccountOwnershipInformation2> successorOnDeath) {
		this.successorOnDeath = Objects.requireNonNull(successorOnDeath);
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation2> getAdministrator() {
		return administrator == null ? Optional.empty() : Optional.of(administrator);
	}

	public AccountParties2 setAdministrator(InvestmentAccountOwnershipInformation2 administrator) {
		this.administrator = administrator;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation2> getOtherParty() {
		return otherParty == null ? Optional.empty() : Optional.of(otherParty);
	}

	public AccountParties2 setOtherParty(InvestmentAccountOwnershipInformation2 otherParty) {
		this.otherParty = otherParty;
		return this;
	}
}