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
import com.tools20022.repository.area.acmt.AccountModificationInstructionV02;
import com.tools20022.repository.codeset.DataModification1Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ExtendedParty1;
import com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.msg.AccountParties4#AccountOwnerRule
 * AccountParties4.AccountOwnerRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmModificationScopeIndication
 * AccountParties4.mmModificationScopeIndication}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmPrimaryOwner
 * AccountParties4.mmPrimaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmTrustee
 * AccountParties4.mmTrustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmCustodianForMinor
 * AccountParties4.mmCustodianForMinor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmNominee
 * AccountParties4.mmNominee}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmJointOwner
 * AccountParties4.mmJointOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmSecondaryOwner
 * AccountParties4.mmSecondaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmBeneficiary
 * AccountParties4.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmPowerOfAttorney
 * AccountParties4.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmLegalGuardian
 * AccountParties4.mmLegalGuardian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmSuccessorOnDeath
 * AccountParties4.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmAdministrator
 * AccountParties4.mmAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmGranter
 * AccountParties4.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmSettler
 * AccountParties4.mmSettler}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmOtherParty
 * AccountParties4.mmOtherParty}</li>
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
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV02#mmModifiedAccountParties
 * AccountModificationInstructionV02.mmModifiedAccountParties}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule#forAccountParties4
 * ConstraintRegistrationAddressIndicator1Rule.forAccountParties4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule#forAccountParties4
 * ConstraintRegistrationAddressIndicator2Rule.forAccountParties4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAddressRule#forAccountParties4
 * ConstraintAddressRule.forAccountParties4}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountParties4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Any party who is related to an investment account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties7
 * AccountParties7}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountParties4", propOrder = {"modificationScopeIndication", "primaryOwner", "trustee", "custodianForMinor", "nominee", "jointOwner", "secondaryOwner", "beneficiary", "powerOfAttorney", "legalGuardian",
		"successorOnDeath", "administrator", "granter", "settler", "otherParty"})
public class AccountParties4 {

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
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	public static final MMMessageAttribute<AccountParties4, DataModification1Code> mmModificationScopeIndication = new MMMessageAttribute<AccountParties4, DataModification1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "ModScpIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationScopeIndication";
			definition = "Specifies the type of modification to be applied on a set of information.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataModification1Code.mmObject();
		}

		@Override
		public DataModification1Code getValue(AccountParties4 obj) {
			return obj.getModificationScopeIndication();
		}

		@Override
		public void setValue(AccountParties4 obj, DataModification1Code value) {
			obj.setModificationScopeIndication(value);
		}
	};
	@XmlElement(name = "PmryOwnr")
	protected InvestmentAccountOwnershipInformation4 primaryOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrimaryOwner PrimaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	public static final MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>> mmPrimaryOwner = new MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>>() {
		{
			businessComponentTrace_lazy = () -> PrimaryOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "PmryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryOwner";
			definition = "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation4> getValue(AccountParties4 obj) {
			return obj.getPrimaryOwner();
		}

		@Override
		public void setValue(AccountParties4 obj, Optional<InvestmentAccountOwnershipInformation4> value) {
			obj.setPrimaryOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "Trstee")
	protected List<InvestmentAccountOwnershipInformation4> trustee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TrusteeRole TrusteeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	public static final MMMessageAssociationEnd<AccountParties4, List<InvestmentAccountOwnershipInformation4>> mmTrustee = new MMMessageAssociationEnd<AccountParties4, List<InvestmentAccountOwnershipInformation4>>() {
		{
			businessComponentTrace_lazy = () -> TrusteeRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "Trstee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trustee";
			definition = "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation4> getValue(AccountParties4 obj) {
			return obj.getTrustee();
		}

		@Override
		public void setValue(AccountParties4 obj, List<InvestmentAccountOwnershipInformation4> value) {
			obj.setTrustee(value);
		}
	};
	@XmlElement(name = "CtdnForMnr")
	protected InvestmentAccountOwnershipInformation4 custodianForMinor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CustodianForMinor
	 * CustodianForMinor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	public static final MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>> mmCustodianForMinor = new MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>>() {
		{
			businessComponentTrace_lazy = () -> CustodianForMinor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "CtdnForMnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianForMinor";
			definition = "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation4> getValue(AccountParties4 obj) {
			return obj.getCustodianForMinor();
		}

		@Override
		public void setValue(AccountParties4 obj, Optional<InvestmentAccountOwnershipInformation4> value) {
			obj.setCustodianForMinor(value.orElse(null));
		}
	};
	@XmlElement(name = "Nmnee")
	protected InvestmentAccountOwnershipInformation4 nominee;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Nominee Nominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	public static final MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>> mmNominee = new MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>>() {
		{
			businessComponentTrace_lazy = () -> Nominee.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "Nmnee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nominee";
			definition = "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation4> getValue(AccountParties4 obj) {
			return obj.getNominee();
		}

		@Override
		public void setValue(AccountParties4 obj, Optional<InvestmentAccountOwnershipInformation4> value) {
			obj.setNominee(value.orElse(null));
		}
	};
	@XmlElement(name = "JntOwnr")
	protected List<InvestmentAccountOwnershipInformation4> jointOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.JointOwner JointOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	public static final MMMessageAssociationEnd<AccountParties4, List<InvestmentAccountOwnershipInformation4>> mmJointOwner = new MMMessageAssociationEnd<AccountParties4, List<InvestmentAccountOwnershipInformation4>>() {
		{
			businessComponentTrace_lazy = () -> JointOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "JntOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointOwner";
			definition = "Co-owner of the investment account when the ownership is assigned to more than one party.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation4> getValue(AccountParties4 obj) {
			return obj.getJointOwner();
		}

		@Override
		public void setValue(AccountParties4 obj, List<InvestmentAccountOwnershipInformation4> value) {
			obj.setJointOwner(value);
		}
	};
	@XmlElement(name = "ScndryOwnr")
	protected InvestmentAccountOwnershipInformation4 secondaryOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecondaryOwner
	 * SecondaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	public static final MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>> mmSecondaryOwner = new MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>>() {
		{
			businessComponentTrace_lazy = () -> SecondaryOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "ScndryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryOwner";
			definition = "Entity that is not the primary owner when the ownership of the investment account is split among several owners.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation4> getValue(AccountParties4 obj) {
			return obj.getSecondaryOwner();
		}

		@Override
		public void setValue(AccountParties4 obj, Optional<InvestmentAccountOwnershipInformation4> value) {
			obj.setSecondaryOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "Bnfcry")
	protected InvestmentAccountOwnershipInformation4 beneficiary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	public static final MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>> mmBeneficiary = new MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>>() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation4> getValue(AccountParties4 obj) {
			return obj.getBeneficiary();
		}

		@Override
		public void setValue(AccountParties4 obj, Optional<InvestmentAccountOwnershipInformation4> value) {
			obj.setBeneficiary(value.orElse(null));
		}
	};
	@XmlElement(name = "PwrOfAttny")
	protected InvestmentAccountOwnershipInformation4 powerOfAttorney;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MandateHolder MandateHolder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	public static final MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>> mmPowerOfAttorney = new MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>>() {
		{
			businessComponentTrace_lazy = () -> MandateHolder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "PwrOfAttny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorney";
			definition = "Entity that was given the authority by another entity to act on its behalf.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation4> getValue(AccountParties4 obj) {
			return obj.getPowerOfAttorney();
		}

		@Override
		public void setValue(AccountParties4 obj, Optional<InvestmentAccountOwnershipInformation4> value) {
			obj.setPowerOfAttorney(value.orElse(null));
		}
	};
	@XmlElement(name = "LglGuardn")
	protected InvestmentAccountOwnershipInformation4 legalGuardian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.LegalGuardianRole
	 * LegalGuardianRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	public static final MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>> mmLegalGuardian = new MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>>() {
		{
			businessComponentTrace_lazy = () -> LegalGuardianRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "LglGuardn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalGuardian";
			definition = "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation4> getValue(AccountParties4 obj) {
			return obj.getLegalGuardian();
		}

		@Override
		public void setValue(AccountParties4 obj, Optional<InvestmentAccountOwnershipInformation4> value) {
			obj.setLegalGuardian(value.orElse(null));
		}
	};
	@XmlElement(name = "SucssrOnDth")
	protected InvestmentAccountOwnershipInformation4 successorOnDeath;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuccessorOnDeath
	 * SuccessorOnDeath}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	public static final MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>> mmSuccessorOnDeath = new MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>>() {
		{
			businessComponentTrace_lazy = () -> SuccessorOnDeath.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "SucssrOnDth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuccessorOnDeath";
			definition = "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation4> getValue(AccountParties4 obj) {
			return obj.getSuccessorOnDeath();
		}

		@Override
		public void setValue(AccountParties4 obj, Optional<InvestmentAccountOwnershipInformation4> value) {
			obj.setSuccessorOnDeath(value.orElse(null));
		}
	};
	@XmlElement(name = "Admstr")
	protected InvestmentAccountOwnershipInformation4 administrator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdministratorRole
	 * AdministratorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	public static final MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>> mmAdministrator = new MMMessageAssociationEnd<AccountParties4, Optional<InvestmentAccountOwnershipInformation4>>() {
		{
			businessComponentTrace_lazy = () -> AdministratorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "Admstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Administrator";
			definition = "Entity that has been appointed by a legal authorithy to act on behalf of a person or organisation that has gone bankrupt.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation4> getValue(AccountParties4 obj) {
			return obj.getAdministrator();
		}

		@Override
		public void setValue(AccountParties4 obj, Optional<InvestmentAccountOwnershipInformation4> value) {
			obj.setAdministrator(value.orElse(null));
		}
	};
	@XmlElement(name = "Grntr")
	protected List<InvestmentAccountOwnershipInformation4> granter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Grantor Grantor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties4, List<InvestmentAccountOwnershipInformation4>> mmGranter = new MMMessageAssociationEnd<AccountParties4, List<InvestmentAccountOwnershipInformation4>>() {
		{
			businessComponentTrace_lazy = () -> Grantor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "Grntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Granter";
			definition = "Granter role in the hedge funds industry.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation4> getValue(AccountParties4 obj) {
			return obj.getGranter();
		}

		@Override
		public void setValue(AccountParties4 obj, List<InvestmentAccountOwnershipInformation4> value) {
			obj.setGranter(value);
		}
	};
	@XmlElement(name = "Sttlr")
	protected List<InvestmentAccountOwnershipInformation4> settler;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation4
	 * InvestmentAccountOwnershipInformation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlor Settlor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties4, List<InvestmentAccountOwnershipInformation4>> mmSettler = new MMMessageAssociationEnd<AccountParties4, List<InvestmentAccountOwnershipInformation4>>() {
		{
			businessComponentTrace_lazy = () -> Settlor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "Sttlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settler";
			definition = "Settler role in the hedge funds industry.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation4.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation4> getValue(AccountParties4 obj) {
			return obj.getSettler();
		}

		@Override
		public void setValue(AccountParties4 obj, List<InvestmentAccountOwnershipInformation4> value) {
			obj.setSettler(value);
		}
	};
	@XmlElement(name = "OthrPty")
	protected List<ExtendedParty1> otherParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExtendedParty1
	 * ExtendedParty1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
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
	public static final MMMessageAssociationEnd<AccountParties4, List<ExtendedParty1>> mmOtherParty = new MMMessageAssociationEnd<AccountParties4, List<ExtendedParty1>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			isDerived = false;
			xmlTag = "OthrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParty";
			definition = "An other type of party.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExtendedParty1.mmObject();
		}

		@Override
		public List<ExtendedParty1> getValue(AccountParties4 obj) {
			return obj.getOtherParty();
		}

		@Override
		public void setValue(AccountParties4 obj, List<ExtendedParty1> value) {
			obj.setOtherParty(value);
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties4
	 * AccountParties4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmPrimaryOwner
	 * AccountParties4.mmPrimaryOwner}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmTrustee
	 * AccountParties4.mmTrustee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmCustodianForMinor
	 * AccountParties4.mmCustodianForMinor}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountParties4#mmNominee
	 * AccountParties4.mmNominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountParties4#mmJointOwner
	 * AccountParties4.mmJointOwner}</li>
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
			messageComponent_lazy = () -> com.tools20022.repository.msg.AccountParties4.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties4.mmPrimaryOwner, com.tools20022.repository.msg.AccountParties4.mmTrustee,
					com.tools20022.repository.msg.AccountParties4.mmCustodianForMinor, com.tools20022.repository.msg.AccountParties4.mmNominee, com.tools20022.repository.msg.AccountParties4.mmJointOwner);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties4.mmModificationScopeIndication, com.tools20022.repository.msg.AccountParties4.mmPrimaryOwner,
						com.tools20022.repository.msg.AccountParties4.mmTrustee, com.tools20022.repository.msg.AccountParties4.mmCustodianForMinor, com.tools20022.repository.msg.AccountParties4.mmNominee,
						com.tools20022.repository.msg.AccountParties4.mmJointOwner, com.tools20022.repository.msg.AccountParties4.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties4.mmBeneficiary,
						com.tools20022.repository.msg.AccountParties4.mmPowerOfAttorney, com.tools20022.repository.msg.AccountParties4.mmLegalGuardian, com.tools20022.repository.msg.AccountParties4.mmSuccessorOnDeath,
						com.tools20022.repository.msg.AccountParties4.mmAdministrator, com.tools20022.repository.msg.AccountParties4.mmGranter, com.tools20022.repository.msg.AccountParties4.mmSettler,
						com.tools20022.repository.msg.AccountParties4.mmOtherParty);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountModificationInstructionV02.mmModifiedAccountParties);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator1Rule.forAccountParties4,
						com.tools20022.repository.constraints.ConstraintRegistrationAddressIndicator2Rule.forAccountParties4, com.tools20022.repository.constraints.ConstraintAddressRule.forAccountParties4);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "AccountParties4";
				definition = "Any party who is related to an investment account.";
				nextVersions_lazy = () -> Arrays.asList(AccountParties7.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties4.AccountOwnerRule);
			}
		});
		return mmObject_lazy.get();
	}

	public DataModification1Code getModificationScopeIndication() {
		return modificationScopeIndication;
	}

	public AccountParties4 setModificationScopeIndication(DataModification1Code modificationScopeIndication) {
		this.modificationScopeIndication = Objects.requireNonNull(modificationScopeIndication);
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation4> getPrimaryOwner() {
		return primaryOwner == null ? Optional.empty() : Optional.of(primaryOwner);
	}

	public AccountParties4 setPrimaryOwner(InvestmentAccountOwnershipInformation4 primaryOwner) {
		this.primaryOwner = primaryOwner;
		return this;
	}

	public List<InvestmentAccountOwnershipInformation4> getTrustee() {
		return trustee == null ? trustee = new ArrayList<>() : trustee;
	}

	public AccountParties4 setTrustee(List<InvestmentAccountOwnershipInformation4> trustee) {
		this.trustee = Objects.requireNonNull(trustee);
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation4> getCustodianForMinor() {
		return custodianForMinor == null ? Optional.empty() : Optional.of(custodianForMinor);
	}

	public AccountParties4 setCustodianForMinor(InvestmentAccountOwnershipInformation4 custodianForMinor) {
		this.custodianForMinor = custodianForMinor;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation4> getNominee() {
		return nominee == null ? Optional.empty() : Optional.of(nominee);
	}

	public AccountParties4 setNominee(InvestmentAccountOwnershipInformation4 nominee) {
		this.nominee = nominee;
		return this;
	}

	public List<InvestmentAccountOwnershipInformation4> getJointOwner() {
		return jointOwner == null ? jointOwner = new ArrayList<>() : jointOwner;
	}

	public AccountParties4 setJointOwner(List<InvestmentAccountOwnershipInformation4> jointOwner) {
		this.jointOwner = Objects.requireNonNull(jointOwner);
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation4> getSecondaryOwner() {
		return secondaryOwner == null ? Optional.empty() : Optional.of(secondaryOwner);
	}

	public AccountParties4 setSecondaryOwner(InvestmentAccountOwnershipInformation4 secondaryOwner) {
		this.secondaryOwner = secondaryOwner;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation4> getBeneficiary() {
		return beneficiary == null ? Optional.empty() : Optional.of(beneficiary);
	}

	public AccountParties4 setBeneficiary(InvestmentAccountOwnershipInformation4 beneficiary) {
		this.beneficiary = beneficiary;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation4> getPowerOfAttorney() {
		return powerOfAttorney == null ? Optional.empty() : Optional.of(powerOfAttorney);
	}

	public AccountParties4 setPowerOfAttorney(InvestmentAccountOwnershipInformation4 powerOfAttorney) {
		this.powerOfAttorney = powerOfAttorney;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation4> getLegalGuardian() {
		return legalGuardian == null ? Optional.empty() : Optional.of(legalGuardian);
	}

	public AccountParties4 setLegalGuardian(InvestmentAccountOwnershipInformation4 legalGuardian) {
		this.legalGuardian = legalGuardian;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation4> getSuccessorOnDeath() {
		return successorOnDeath == null ? Optional.empty() : Optional.of(successorOnDeath);
	}

	public AccountParties4 setSuccessorOnDeath(InvestmentAccountOwnershipInformation4 successorOnDeath) {
		this.successorOnDeath = successorOnDeath;
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation4> getAdministrator() {
		return administrator == null ? Optional.empty() : Optional.of(administrator);
	}

	public AccountParties4 setAdministrator(InvestmentAccountOwnershipInformation4 administrator) {
		this.administrator = administrator;
		return this;
	}

	public List<InvestmentAccountOwnershipInformation4> getGranter() {
		return granter == null ? granter = new ArrayList<>() : granter;
	}

	public AccountParties4 setGranter(List<InvestmentAccountOwnershipInformation4> granter) {
		this.granter = Objects.requireNonNull(granter);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation4> getSettler() {
		return settler == null ? settler = new ArrayList<>() : settler;
	}

	public AccountParties4 setSettler(List<InvestmentAccountOwnershipInformation4> settler) {
		this.settler = Objects.requireNonNull(settler);
		return this;
	}

	public List<ExtendedParty1> getOtherParty() {
		return otherParty == null ? otherParty = new ArrayList<>() : otherParty;
	}

	public AccountParties4 setOtherParty(List<ExtendedParty1> otherParty) {
		this.otherParty = Objects.requireNonNull(otherParty);
		return this;
	}
}