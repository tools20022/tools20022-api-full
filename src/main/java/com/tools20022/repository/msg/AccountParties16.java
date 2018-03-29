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
import com.tools20022.repository.area.acmt.AccountModificationInstructionV07;
import com.tools20022.repository.choice.AccountParties11Choice;
import com.tools20022.repository.choice.RegisteredShareholderName1Choice;
import com.tools20022.repository.codeset.DataModification1Code;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ExtendedParty12;
import com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about a party's account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmModificationScopeIndication
 * AccountParties16.mmModificationScopeIndication}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmPrincipalAccountParty
 * AccountParties16.mmPrincipalAccountParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmSecondaryOwner
 * AccountParties16.mmSecondaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#mmBeneficiary
 * AccountParties16.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmPowerOfAttorney
 * AccountParties16.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmLegalGuardian
 * AccountParties16.mmLegalGuardian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmCustodianForMinor
 * AccountParties16.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmSuccessorOnDeath
 * AccountParties16.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmAdministrator
 * AccountParties16.mmAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#mmOtherParty
 * AccountParties16.mmOtherParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#mmGranter
 * AccountParties16.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#mmSettlor
 * AccountParties16.mmSettlor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmSeniorManagingOfficial
 * AccountParties16.mmSeniorManagingOfficial}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties16#mmProtector
 * AccountParties16.mmProtector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties16#mmRegisteredShareholderName
 * AccountParties16.mmRegisteredShareholderName}</li>
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
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmModifiedAccountParties
 * AccountModificationInstructionV07.mmModifiedAccountParties}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintAddressRule#forAccountParties16
 * ConstraintAddressRule.forAccountParties16}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountParties16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a party's account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountParties14 AccountParties14}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountParties16", propOrder = {"modificationScopeIndication", "principalAccountParty", "secondaryOwner", "beneficiary", "powerOfAttorney", "legalGuardian", "custodianForMinor", "successorOnDeath", "administrator",
		"otherParty", "granter", "settlor", "seniorManagingOfficial", "protector", "registeredShareholderName"})
public class AccountParties16 {

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
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
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
	 * definition} = "Specifies the type of modification to be applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmModificationScopeIndication
	 * AccountParties14.mmModificationScopeIndication}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountParties16, DataModification1Code> mmModificationScopeIndication = new MMMessageAttribute<AccountParties16, DataModification1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "ModScpIndctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModificationScopeIndication";
			definition = "Specifies the type of modification to be applied.";
			previousVersion_lazy = () -> AccountParties14.mmModificationScopeIndication;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataModification1Code.mmObject();
		}

		@Override
		public DataModification1Code getValue(AccountParties16 obj) {
			return obj.getModificationScopeIndication();
		}

		@Override
		public void setValue(AccountParties16 obj, DataModification1Code value) {
			obj.setModificationScopeIndication(value);
		}
	};
	@XmlElement(name = "PrncplAcctPty")
	protected AccountParties11Choice principalAccountParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties11Choice
	 * AccountParties11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmPrincipalAccountParty
	 * AccountParties14.mmPrincipalAccountParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AccountParties16, Optional<AccountParties11Choice>> mmPrincipalAccountParty = new MMMessageAttribute<AccountParties16, Optional<AccountParties11Choice>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "PrncplAcctPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalAccountParty";
			definition = "Main party associated with the account.";
			previousVersion_lazy = () -> AccountParties14.mmPrincipalAccountParty;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountParties11Choice.mmObject();
		}

		@Override
		public Optional<AccountParties11Choice> getValue(AccountParties16 obj) {
			return obj.getPrincipalAccountParty();
		}

		@Override
		public void setValue(AccountParties16 obj, Optional<AccountParties11Choice> value) {
			obj.setPrincipalAccountParty(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryOwnr")
	protected List<InvestmentAccountOwnershipInformation15> secondaryOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecondaryOwner
	 * SecondaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmSecondaryOwner
	 * AccountParties14.mmSecondaryOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>> mmSecondaryOwner = new MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>>() {
		{
			businessComponentTrace_lazy = () -> SecondaryOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "ScndryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryOwner";
			definition = "Entity that is not the primary owner when the ownership of the investment account is split among several owners.";
			previousVersion_lazy = () -> AccountParties14.mmSecondaryOwner;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation15.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation15> getValue(AccountParties16 obj) {
			return obj.getSecondaryOwner();
		}

		@Override
		public void setValue(AccountParties16 obj, List<InvestmentAccountOwnershipInformation15> value) {
			obj.setSecondaryOwner(value);
		}
	};
	@XmlElement(name = "Bnfcry")
	protected List<InvestmentAccountOwnershipInformation15> beneficiary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmBeneficiary
	 * AccountParties14.mmBeneficiary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>> mmBeneficiary = new MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>>() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer.";
			previousVersion_lazy = () -> AccountParties14.mmBeneficiary;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation15.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation15> getValue(AccountParties16 obj) {
			return obj.getBeneficiary();
		}

		@Override
		public void setValue(AccountParties16 obj, List<InvestmentAccountOwnershipInformation15> value) {
			obj.setBeneficiary(value);
		}
	};
	@XmlElement(name = "PwrOfAttny")
	protected List<InvestmentAccountOwnershipInformation15> powerOfAttorney;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MandateHolder MandateHolder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmPowerOfAttorney
	 * AccountParties14.mmPowerOfAttorney}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>> mmPowerOfAttorney = new MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>>() {
		{
			businessComponentTrace_lazy = () -> MandateHolder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "PwrOfAttny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorney";
			definition = "Entity that was given the authority by another entity to act on its behalf.";
			previousVersion_lazy = () -> AccountParties14.mmPowerOfAttorney;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation15.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation15> getValue(AccountParties16 obj) {
			return obj.getPowerOfAttorney();
		}

		@Override
		public void setValue(AccountParties16 obj, List<InvestmentAccountOwnershipInformation15> value) {
			obj.setPowerOfAttorney(value);
		}
	};
	@XmlElement(name = "LglGuardn")
	protected List<InvestmentAccountOwnershipInformation15> legalGuardian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.LegalGuardianRole
	 * LegalGuardianRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmLegalGuardian
	 * AccountParties14.mmLegalGuardian}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>> mmLegalGuardian = new MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>>() {
		{
			businessComponentTrace_lazy = () -> LegalGuardianRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "LglGuardn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalGuardian";
			definition = "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated.";
			previousVersion_lazy = () -> AccountParties14.mmLegalGuardian;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation15.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation15> getValue(AccountParties16 obj) {
			return obj.getLegalGuardian();
		}

		@Override
		public void setValue(AccountParties16 obj, List<InvestmentAccountOwnershipInformation15> value) {
			obj.setLegalGuardian(value);
		}
	};
	@XmlElement(name = "CtdnForMnr")
	protected InvestmentAccountOwnershipInformation15 custodianForMinor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CustodianForMinor
	 * CustodianForMinor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmCustodianForMinor
	 * AccountParties14.mmCustodianForMinor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties16, Optional<InvestmentAccountOwnershipInformation15>> mmCustodianForMinor = new MMMessageAssociationEnd<AccountParties16, Optional<InvestmentAccountOwnershipInformation15>>() {
		{
			businessComponentTrace_lazy = () -> CustodianForMinor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "CtdnForMnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianForMinor";
			definition = "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.";
			previousVersion_lazy = () -> AccountParties14.mmCustodianForMinor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation15.mmObject();
		}

		@Override
		public Optional<InvestmentAccountOwnershipInformation15> getValue(AccountParties16 obj) {
			return obj.getCustodianForMinor();
		}

		@Override
		public void setValue(AccountParties16 obj, Optional<InvestmentAccountOwnershipInformation15> value) {
			obj.setCustodianForMinor(value.orElse(null));
		}
	};
	@XmlElement(name = "SucssrOnDth")
	protected List<InvestmentAccountOwnershipInformation15> successorOnDeath;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuccessorOnDeath
	 * SuccessorOnDeath}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmSuccessorOnDeath
	 * AccountParties14.mmSuccessorOnDeath}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>> mmSuccessorOnDeath = new MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>>() {
		{
			businessComponentTrace_lazy = () -> SuccessorOnDeath.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "SucssrOnDth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuccessorOnDeath";
			definition = "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners.";
			previousVersion_lazy = () -> AccountParties14.mmSuccessorOnDeath;
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation15.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation15> getValue(AccountParties16 obj) {
			return obj.getSuccessorOnDeath();
		}

		@Override
		public void setValue(AccountParties16 obj, List<InvestmentAccountOwnershipInformation15> value) {
			obj.setSuccessorOnDeath(value);
		}
	};
	@XmlElement(name = "Admstr")
	protected List<InvestmentAccountOwnershipInformation15> administrator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdministratorRole
	 * AdministratorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
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
	 * "Entity that has been appointed by a legal authority to act on behalf of a person or organisation that has gone bankrupt."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmAdministrator
	 * AccountParties14.mmAdministrator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>> mmAdministrator = new MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>>() {
		{
			businessComponentTrace_lazy = () -> AdministratorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "Admstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Administrator";
			definition = "Entity that has been appointed by a legal authority to act on behalf of a person or organisation that has gone bankrupt.";
			previousVersion_lazy = () -> AccountParties14.mmAdministrator;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation15.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation15> getValue(AccountParties16 obj) {
			return obj.getAdministrator();
		}

		@Override
		public void setValue(AccountParties16 obj, List<InvestmentAccountOwnershipInformation15> value) {
			obj.setAdministrator(value);
		}
	};
	@XmlElement(name = "OthrPty")
	protected List<ExtendedParty12> otherParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExtendedParty12
	 * ExtendedParty12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmOtherParty
	 * AccountParties14.mmOtherParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties16, List<ExtendedParty12>> mmOtherParty = new MMMessageAssociationEnd<AccountParties16, List<ExtendedParty12>>() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "OthrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParty";
			definition = "Other type of party.";
			previousVersion_lazy = () -> AccountParties14.mmOtherParty;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ExtendedParty12.mmObject();
		}

		@Override
		public List<ExtendedParty12> getValue(AccountParties16 obj) {
			return obj.getOtherParty();
		}

		@Override
		public void setValue(AccountParties16 obj, List<ExtendedParty12> value) {
			obj.setOtherParty(value);
		}
	};
	@XmlElement(name = "Grntr")
	protected List<InvestmentAccountOwnershipInformation15> granter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Grantor Grantor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmGranter
	 * AccountParties14.mmGranter}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>> mmGranter = new MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>>() {
		{
			businessComponentTrace_lazy = () -> Grantor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "Grntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Granter";
			definition = "Granter role in the hedge funds industry.";
			previousVersion_lazy = () -> AccountParties14.mmGranter;
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation15.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation15> getValue(AccountParties16 obj) {
			return obj.getGranter();
		}

		@Override
		public void setValue(AccountParties16 obj, List<InvestmentAccountOwnershipInformation15> value) {
			obj.setGranter(value);
		}
	};
	@XmlElement(name = "Sttlr")
	protected List<InvestmentAccountOwnershipInformation15> settlor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlor Settlor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sttlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settlor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that creates a trust or contributes assets to the trust."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmSettlor
	 * AccountParties14.mmSettlor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>> mmSettlor = new MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>>() {
		{
			businessComponentTrace_lazy = () -> Settlor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "Sttlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settlor";
			definition = "Entity that creates a trust or contributes assets to the trust.";
			previousVersion_lazy = () -> AccountParties14.mmSettlor;
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation15.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation15> getValue(AccountParties16 obj) {
			return obj.getSettlor();
		}

		@Override
		public void setValue(AccountParties16 obj, List<InvestmentAccountOwnershipInformation15> value) {
			obj.setSettlor(value);
		}
	};
	@XmlElement(name = "SnrMggOffcl")
	protected List<InvestmentAccountOwnershipInformation15> seniorManagingOfficial;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SnrMggOffcl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SeniorManagingOfficial"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that makes, or participates in the making of, decisions that affect the whole, or a substantial part, of the business of a customer of a reporting entity or that has the capacity to affect significantly the financial standing of a customer of a reporting entity. Typically, this is a controlling person of a corporate (ownership type CORP)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>> mmSeniorManagingOfficial = new MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>>() {
		{
			businessElementTrace_lazy = () -> Role.mmContactPersonRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "SnrMggOffcl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeniorManagingOfficial";
			definition = "Party that makes, or participates in the making of, decisions that affect the whole, or a substantial part, of the business of a customer of a reporting entity or that has the capacity to affect significantly the financial standing of a customer of a reporting entity. Typically, this is a controlling person of a corporate (ownership type CORP).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation15.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation15> getValue(AccountParties16 obj) {
			return obj.getSeniorManagingOfficial();
		}

		@Override
		public void setValue(AccountParties16 obj, List<InvestmentAccountOwnershipInformation15> value) {
			obj.setSeniorManagingOfficial(value);
		}
	};
	@XmlElement(name = "Prtctr")
	protected List<InvestmentAccountOwnershipInformation15> protector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation15
	 * InvestmentAccountOwnershipInformation15}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Protector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person appointed under the trust instrument to direct or restrain the trustees in relation to their administration of the trust. Typically, this is a controlling person of a trust (ownership type TRUS) or other non-individual organisation (ownership type ONIS)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>> mmProtector = new MMMessageAssociationEnd<AccountParties16, List<InvestmentAccountOwnershipInformation15>>() {
		{
			businessElementTrace_lazy = () -> Role.mmContactPersonRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "Prtctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Protector";
			definition = "Person appointed under the trust instrument to direct or restrain the trustees in relation to their administration of the trust. Typically, this is a controlling person of a trust (ownership type TRUS) or other non-individual organisation (ownership type ONIS).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InvestmentAccountOwnershipInformation15.mmObject();
		}

		@Override
		public List<InvestmentAccountOwnershipInformation15> getValue(AccountParties16 obj) {
			return obj.getProtector();
		}

		@Override
		public void setValue(AccountParties16 obj, List<InvestmentAccountOwnershipInformation15> value) {
			obj.setProtector(value);
		}
	};
	@XmlElement(name = "RegdShrhldrNm")
	protected RegisteredShareholderName1Choice registeredShareholderName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RegisteredShareholderName1Choice
	 * RegisteredShareholderName1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.RolePlayer RolePlayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties16
	 * AccountParties16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdShrhldrNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredShareholderName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party for which shares are to be registered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties14#mmRegisteredShareholderName
	 * AccountParties14.mmRegisteredShareholderName}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AccountParties16, Optional<RegisteredShareholderName1Choice>> mmRegisteredShareholderName = new MMMessageAssociationEnd<AccountParties16, Optional<RegisteredShareholderName1Choice>>() {
		{
			businessComponentTrace_lazy = () -> RolePlayer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties16.mmObject();
			isDerived = false;
			xmlTag = "RegdShrhldrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredShareholderName";
			definition = "Party for which shares are to be registered.";
			previousVersion_lazy = () -> AccountParties14.mmRegisteredShareholderName;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RegisteredShareholderName1Choice.mmObject();
		}

		@Override
		public Optional<RegisteredShareholderName1Choice> getValue(AccountParties16 obj) {
			return obj.getRegisteredShareholderName();
		}

		@Override
		public void setValue(AccountParties16 obj, Optional<RegisteredShareholderName1Choice> value) {
			obj.setRegisteredShareholderName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties16.mmModificationScopeIndication, com.tools20022.repository.msg.AccountParties16.mmPrincipalAccountParty,
						com.tools20022.repository.msg.AccountParties16.mmSecondaryOwner, com.tools20022.repository.msg.AccountParties16.mmBeneficiary, com.tools20022.repository.msg.AccountParties16.mmPowerOfAttorney,
						com.tools20022.repository.msg.AccountParties16.mmLegalGuardian, com.tools20022.repository.msg.AccountParties16.mmCustodianForMinor, com.tools20022.repository.msg.AccountParties16.mmSuccessorOnDeath,
						com.tools20022.repository.msg.AccountParties16.mmAdministrator, com.tools20022.repository.msg.AccountParties16.mmOtherParty, com.tools20022.repository.msg.AccountParties16.mmGranter,
						com.tools20022.repository.msg.AccountParties16.mmSettlor, com.tools20022.repository.msg.AccountParties16.mmSeniorManagingOfficial, com.tools20022.repository.msg.AccountParties16.mmProtector,
						com.tools20022.repository.msg.AccountParties16.mmRegisteredShareholderName);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountModificationInstructionV07.mmModifiedAccountParties);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAddressRule.forAccountParties16);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountParties16";
				definition = "Information about a party's account.";
				previousVersion_lazy = () -> AccountParties14.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public DataModification1Code getModificationScopeIndication() {
		return modificationScopeIndication;
	}

	public AccountParties16 setModificationScopeIndication(DataModification1Code modificationScopeIndication) {
		this.modificationScopeIndication = Objects.requireNonNull(modificationScopeIndication);
		return this;
	}

	public Optional<AccountParties11Choice> getPrincipalAccountParty() {
		return principalAccountParty == null ? Optional.empty() : Optional.of(principalAccountParty);
	}

	public AccountParties16 setPrincipalAccountParty(AccountParties11Choice principalAccountParty) {
		this.principalAccountParty = principalAccountParty;
		return this;
	}

	public List<InvestmentAccountOwnershipInformation15> getSecondaryOwner() {
		return secondaryOwner == null ? secondaryOwner = new ArrayList<>() : secondaryOwner;
	}

	public AccountParties16 setSecondaryOwner(List<InvestmentAccountOwnershipInformation15> secondaryOwner) {
		this.secondaryOwner = Objects.requireNonNull(secondaryOwner);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation15> getBeneficiary() {
		return beneficiary == null ? beneficiary = new ArrayList<>() : beneficiary;
	}

	public AccountParties16 setBeneficiary(List<InvestmentAccountOwnershipInformation15> beneficiary) {
		this.beneficiary = Objects.requireNonNull(beneficiary);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation15> getPowerOfAttorney() {
		return powerOfAttorney == null ? powerOfAttorney = new ArrayList<>() : powerOfAttorney;
	}

	public AccountParties16 setPowerOfAttorney(List<InvestmentAccountOwnershipInformation15> powerOfAttorney) {
		this.powerOfAttorney = Objects.requireNonNull(powerOfAttorney);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation15> getLegalGuardian() {
		return legalGuardian == null ? legalGuardian = new ArrayList<>() : legalGuardian;
	}

	public AccountParties16 setLegalGuardian(List<InvestmentAccountOwnershipInformation15> legalGuardian) {
		this.legalGuardian = Objects.requireNonNull(legalGuardian);
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation15> getCustodianForMinor() {
		return custodianForMinor == null ? Optional.empty() : Optional.of(custodianForMinor);
	}

	public AccountParties16 setCustodianForMinor(InvestmentAccountOwnershipInformation15 custodianForMinor) {
		this.custodianForMinor = custodianForMinor;
		return this;
	}

	public List<InvestmentAccountOwnershipInformation15> getSuccessorOnDeath() {
		return successorOnDeath == null ? successorOnDeath = new ArrayList<>() : successorOnDeath;
	}

	public AccountParties16 setSuccessorOnDeath(List<InvestmentAccountOwnershipInformation15> successorOnDeath) {
		this.successorOnDeath = Objects.requireNonNull(successorOnDeath);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation15> getAdministrator() {
		return administrator == null ? administrator = new ArrayList<>() : administrator;
	}

	public AccountParties16 setAdministrator(List<InvestmentAccountOwnershipInformation15> administrator) {
		this.administrator = Objects.requireNonNull(administrator);
		return this;
	}

	public List<ExtendedParty12> getOtherParty() {
		return otherParty == null ? otherParty = new ArrayList<>() : otherParty;
	}

	public AccountParties16 setOtherParty(List<ExtendedParty12> otherParty) {
		this.otherParty = Objects.requireNonNull(otherParty);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation15> getGranter() {
		return granter == null ? granter = new ArrayList<>() : granter;
	}

	public AccountParties16 setGranter(List<InvestmentAccountOwnershipInformation15> granter) {
		this.granter = Objects.requireNonNull(granter);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation15> getSettlor() {
		return settlor == null ? settlor = new ArrayList<>() : settlor;
	}

	public AccountParties16 setSettlor(List<InvestmentAccountOwnershipInformation15> settlor) {
		this.settlor = Objects.requireNonNull(settlor);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation15> getSeniorManagingOfficial() {
		return seniorManagingOfficial == null ? seniorManagingOfficial = new ArrayList<>() : seniorManagingOfficial;
	}

	public AccountParties16 setSeniorManagingOfficial(List<InvestmentAccountOwnershipInformation15> seniorManagingOfficial) {
		this.seniorManagingOfficial = Objects.requireNonNull(seniorManagingOfficial);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation15> getProtector() {
		return protector == null ? protector = new ArrayList<>() : protector;
	}

	public AccountParties16 setProtector(List<InvestmentAccountOwnershipInformation15> protector) {
		this.protector = Objects.requireNonNull(protector);
		return this;
	}

	public Optional<RegisteredShareholderName1Choice> getRegisteredShareholderName() {
		return registeredShareholderName == null ? Optional.empty() : Optional.of(registeredShareholderName);
	}

	public AccountParties16 setRegisteredShareholderName(RegisteredShareholderName1Choice registeredShareholderName) {
		this.registeredShareholderName = registeredShareholderName;
		return this;
	}
}