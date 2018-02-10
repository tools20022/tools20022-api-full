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
import com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07;
import com.tools20022.repository.area.acmt.AccountOpeningInstructionV07;
import com.tools20022.repository.choice.AccountParties10Choice;
import com.tools20022.repository.choice.RegisteredShareholderName1Choice;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmPrincipalAccountParty
 * AccountParties15.mmPrincipalAccountParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmSecondaryOwner
 * AccountParties15.mmSecondaryOwner}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#mmBeneficiary
 * AccountParties15.mmBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmPowerOfAttorney
 * AccountParties15.mmPowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmLegalGuardian
 * AccountParties15.mmLegalGuardian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmCustodianForMinor
 * AccountParties15.mmCustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmSuccessorOnDeath
 * AccountParties15.mmSuccessorOnDeath}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmAdministrator
 * AccountParties15.mmAdministrator}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#mmOtherParty
 * AccountParties15.mmOtherParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#mmGranter
 * AccountParties15.mmGranter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#mmSettlor
 * AccountParties15.mmSettlor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmSeniorManagingOfficial
 * AccountParties15.mmSeniorManagingOfficial}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountParties15#mmProtector
 * AccountParties15.mmProtector}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountParties15#mmRegisteredShareholderName
 * AccountParties15.mmRegisteredShareholderName}</li>
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
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmAccountParties
 * AccountDetailsConfirmationV07.mmAccountParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmAccountParties
 * AccountOpeningInstructionV07.mmAccountParties}</li>
 * </ul>
 * </li>
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
 * "AccountParties15"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about a party's account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AccountParties13 AccountParties13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountParties15", propOrder = {"principalAccountParty", "secondaryOwner", "beneficiary", "powerOfAttorney", "legalGuardian", "custodianForMinor", "successorOnDeath", "administrator", "otherParty", "granter", "settlor",
		"seniorManagingOfficial", "protector", "registeredShareholderName"})
public class AccountParties15 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrncplAcctPty", required = true)
	protected AccountParties10Choice principalAccountParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties10Choice
	 * AccountParties10Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmPrincipalAccountParty
	 * AccountParties13.mmPrincipalAccountParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPrincipalAccountParty = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "PrncplAcctPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalAccountParty";
			definition = "Main party associated with the account.";
			previousVersion_lazy = () -> AccountParties13.mmPrincipalAccountParty;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountParties10Choice.mmObject();
		}
	};
	@XmlElement(name = "ScndryOwnr")
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> secondaryOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecondaryOwner
	 * SecondaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmSecondaryOwner
	 * AccountParties13.mmSecondaryOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecondaryOwner = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecondaryOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "ScndryOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryOwner";
			definition = "Entity that is not the primary owner when the ownership of the investment account is split among several owners.";
			previousVersion_lazy = () -> AccountParties13.mmSecondaryOwner;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
		}
	};
	@XmlElement(name = "Bnfcry")
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> beneficiary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmBeneficiary
	 * AccountParties13.mmBeneficiary}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficiary = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "Bnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Beneficiary";
			definition = "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer.";
			previousVersion_lazy = () -> AccountParties13.mmBeneficiary;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
		}
	};
	@XmlElement(name = "PwrOfAttny")
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> powerOfAttorney;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MandateHolder MandateHolder}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmPowerOfAttorney
	 * AccountParties13.mmPowerOfAttorney}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPowerOfAttorney = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MandateHolder.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "PwrOfAttny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PowerOfAttorney";
			definition = "Entity that was given the authority by another entity to act on its behalf.";
			previousVersion_lazy = () -> AccountParties13.mmPowerOfAttorney;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
		}
	};
	@XmlElement(name = "LglGuardn")
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> legalGuardian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.LegalGuardianRole
	 * LegalGuardianRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmLegalGuardian
	 * AccountParties13.mmLegalGuardian}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegalGuardian = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> LegalGuardianRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "LglGuardn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalGuardian";
			definition = "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated.";
			previousVersion_lazy = () -> AccountParties13.mmLegalGuardian;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
		}
	};
	@XmlElement(name = "CtdnForMnr")
	protected InvestmentAccountOwnershipInformation14 custodianForMinor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CustodianForMinor
	 * CustodianForMinor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmCustodianForMinor
	 * AccountParties13.mmCustodianForMinor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCustodianForMinor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CustodianForMinor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "CtdnForMnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianForMinor";
			definition = "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.";
			previousVersion_lazy = () -> AccountParties13.mmCustodianForMinor;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
		}
	};
	@XmlElement(name = "SucssrOnDth")
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> successorOnDeath;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SuccessorOnDeath
	 * SuccessorOnDeath}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmSuccessorOnDeath
	 * AccountParties13.mmSuccessorOnDeath}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSuccessorOnDeath = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SuccessorOnDeath.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "SucssrOnDth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuccessorOnDeath";
			definition = "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners.";
			previousVersion_lazy = () -> AccountParties13.mmSuccessorOnDeath;
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
		}
	};
	@XmlElement(name = "Admstr")
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> administrator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AdministratorRole
	 * AdministratorRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmAdministrator
	 * AccountParties13.mmAdministrator}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdministrator = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AdministratorRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "Admstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Administrator";
			definition = "Entity that has been appointed by a legal authority to act on behalf of a person or organisation that has gone bankrupt.";
			previousVersion_lazy = () -> AccountParties13.mmAdministrator;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
		}
	};
	@XmlElement(name = "OthrPty")
	protected List<com.tools20022.repository.msg.ExtendedParty11> otherParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExtendedParty11
	 * ExtendedParty11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
	 * InvestmentAccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmOtherParty
	 * AccountParties13.mmOtherParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherParty = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentAccountPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "OthrPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherParty";
			definition = "Other type of party.";
			previousVersion_lazy = () -> AccountParties13.mmOtherParty;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExtendedParty11.mmObject();
		}
	};
	@XmlElement(name = "Grntr")
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> granter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Grantor Grantor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmGranter
	 * AccountParties13.mmGranter}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmGranter = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Grantor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "Grntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Granter";
			definition = "Granter role in the hedge funds industry.";
			previousVersion_lazy = () -> AccountParties13.mmGranter;
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
		}
	};
	@XmlElement(name = "Sttlr")
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> settlor;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlor Settlor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmSettlor
	 * AccountParties13.mmSettlor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlor = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Settlor.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "Sttlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settlor";
			definition = "Entity that creates a trust or contributes assets to the trust.";
			previousVersion_lazy = () -> AccountParties13.mmSettlor;
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
		}
	};
	@XmlElement(name = "SnrMggOffcl")
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> seniorManagingOfficial;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	public static final MMMessageAssociationEnd mmSeniorManagingOfficial = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Role.mmContactPersonRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "SnrMggOffcl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SeniorManagingOfficial";
			definition = "Party that makes, or participates in the making of, decisions that affect the whole, or a substantial part, of the business of a customer of a reporting entity or that has the capacity to affect significantly the financial standing of a customer of a reporting entity. Typically, this is a controlling person of a corporate (ownership type CORP).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
		}
	};
	@XmlElement(name = "Prtctr")
	protected List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> protector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14
	 * InvestmentAccountOwnershipInformation14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Role#mmContactPersonRole
	 * Role.mmContactPersonRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	public static final MMMessageAssociationEnd mmProtector = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Role.mmContactPersonRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "Prtctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Protector";
			definition = "Person appointed under the trust instrument to direct or restrain the trustees in relation to their administration of the trust. Typically, this is a controlling person of a trust (ownership type TRUS) or other non-individual organisation (ownership type ONIS).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AccountParties15
	 * AccountParties15}</li>
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
	 * definition} =
	 * "Party that registers its name with the issuer and the name used for the registration."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AccountParties13#mmRegisteredShareholderName
	 * AccountParties13.mmRegisteredShareholderName}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRegisteredShareholderName = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> RolePlayer.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AccountParties15.mmObject();
			isDerived = false;
			xmlTag = "RegdShrhldrNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredShareholderName";
			definition = "Party that registers its name with the issuer and the name used for the registration.";
			previousVersion_lazy = () -> AccountParties13.mmRegisteredShareholderName;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RegisteredShareholderName1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountParties15.mmPrincipalAccountParty, com.tools20022.repository.msg.AccountParties15.mmSecondaryOwner,
						com.tools20022.repository.msg.AccountParties15.mmBeneficiary, com.tools20022.repository.msg.AccountParties15.mmPowerOfAttorney, com.tools20022.repository.msg.AccountParties15.mmLegalGuardian,
						com.tools20022.repository.msg.AccountParties15.mmCustodianForMinor, com.tools20022.repository.msg.AccountParties15.mmSuccessorOnDeath, com.tools20022.repository.msg.AccountParties15.mmAdministrator,
						com.tools20022.repository.msg.AccountParties15.mmOtherParty, com.tools20022.repository.msg.AccountParties15.mmGranter, com.tools20022.repository.msg.AccountParties15.mmSettlor,
						com.tools20022.repository.msg.AccountParties15.mmSeniorManagingOfficial, com.tools20022.repository.msg.AccountParties15.mmProtector, com.tools20022.repository.msg.AccountParties15.mmRegisteredShareholderName);
				messageBuildingBlock_lazy = () -> Arrays.asList(AccountDetailsConfirmationV07.mmAccountParties, AccountOpeningInstructionV07.mmAccountParties);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountParties15";
				definition = "Information about a party's account.";
				previousVersion_lazy = () -> AccountParties13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AccountParties10Choice getPrincipalAccountParty() {
		return principalAccountParty;
	}

	public AccountParties15 setPrincipalAccountParty(AccountParties10Choice principalAccountParty) {
		this.principalAccountParty = Objects.requireNonNull(principalAccountParty);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation14> getSecondaryOwner() {
		return secondaryOwner == null ? secondaryOwner = new ArrayList<>() : secondaryOwner;
	}

	public AccountParties15 setSecondaryOwner(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> secondaryOwner) {
		this.secondaryOwner = Objects.requireNonNull(secondaryOwner);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation14> getBeneficiary() {
		return beneficiary == null ? beneficiary = new ArrayList<>() : beneficiary;
	}

	public AccountParties15 setBeneficiary(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> beneficiary) {
		this.beneficiary = Objects.requireNonNull(beneficiary);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation14> getPowerOfAttorney() {
		return powerOfAttorney == null ? powerOfAttorney = new ArrayList<>() : powerOfAttorney;
	}

	public AccountParties15 setPowerOfAttorney(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> powerOfAttorney) {
		this.powerOfAttorney = Objects.requireNonNull(powerOfAttorney);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation14> getLegalGuardian() {
		return legalGuardian == null ? legalGuardian = new ArrayList<>() : legalGuardian;
	}

	public AccountParties15 setLegalGuardian(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> legalGuardian) {
		this.legalGuardian = Objects.requireNonNull(legalGuardian);
		return this;
	}

	public Optional<InvestmentAccountOwnershipInformation14> getCustodianForMinor() {
		return custodianForMinor == null ? Optional.empty() : Optional.of(custodianForMinor);
	}

	public AccountParties15 setCustodianForMinor(com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14 custodianForMinor) {
		this.custodianForMinor = custodianForMinor;
		return this;
	}

	public List<InvestmentAccountOwnershipInformation14> getSuccessorOnDeath() {
		return successorOnDeath == null ? successorOnDeath = new ArrayList<>() : successorOnDeath;
	}

	public AccountParties15 setSuccessorOnDeath(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> successorOnDeath) {
		this.successorOnDeath = Objects.requireNonNull(successorOnDeath);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation14> getAdministrator() {
		return administrator == null ? administrator = new ArrayList<>() : administrator;
	}

	public AccountParties15 setAdministrator(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> administrator) {
		this.administrator = Objects.requireNonNull(administrator);
		return this;
	}

	public List<ExtendedParty11> getOtherParty() {
		return otherParty == null ? otherParty = new ArrayList<>() : otherParty;
	}

	public AccountParties15 setOtherParty(List<com.tools20022.repository.msg.ExtendedParty11> otherParty) {
		this.otherParty = Objects.requireNonNull(otherParty);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation14> getGranter() {
		return granter == null ? granter = new ArrayList<>() : granter;
	}

	public AccountParties15 setGranter(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> granter) {
		this.granter = Objects.requireNonNull(granter);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation14> getSettlor() {
		return settlor == null ? settlor = new ArrayList<>() : settlor;
	}

	public AccountParties15 setSettlor(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> settlor) {
		this.settlor = Objects.requireNonNull(settlor);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation14> getSeniorManagingOfficial() {
		return seniorManagingOfficial == null ? seniorManagingOfficial = new ArrayList<>() : seniorManagingOfficial;
	}

	public AccountParties15 setSeniorManagingOfficial(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> seniorManagingOfficial) {
		this.seniorManagingOfficial = Objects.requireNonNull(seniorManagingOfficial);
		return this;
	}

	public List<InvestmentAccountOwnershipInformation14> getProtector() {
		return protector == null ? protector = new ArrayList<>() : protector;
	}

	public AccountParties15 setProtector(List<com.tools20022.repository.msg.InvestmentAccountOwnershipInformation14> protector) {
		this.protector = Objects.requireNonNull(protector);
		return this;
	}

	public Optional<RegisteredShareholderName1Choice> getRegisteredShareholderName() {
		return registeredShareholderName == null ? Optional.empty() : Optional.of(registeredShareholderName);
	}

	public AccountParties15 setRegisteredShareholderName(RegisteredShareholderName1Choice registeredShareholderName) {
		this.registeredShareholderName = registeredShareholderName;
		return this;
	}
}