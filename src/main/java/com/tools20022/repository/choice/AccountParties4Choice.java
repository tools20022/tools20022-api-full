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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.repository.entity.InvestmentAccountPartyRole;
import com.tools20022.repository.entity.TrusteeRole;
import com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Party associated with the account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#PrimaryOwner
 * AccountParties4Choice.PrimaryOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#Trustee
 * AccountParties4Choice.Trustee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#CustodianForMinor
 * AccountParties4Choice.CustodianForMinor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#Nominee
 * AccountParties4Choice.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice#JointOwner
 * AccountParties4Choice.JointOwner}</li>
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
 * "AccountParties4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Party associated with the account."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties7Choice
 * AccountParties7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.AccountParties5Choice
 * AccountParties5Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice
 * AccountParties1Choice}</li>
 * </ul>
 */
public class AccountParties4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Single owner of the investment account or, when the ownership is split
	 * among several owners, the primary owner is the one giving its address and
	 * account details for the registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9
	 * InvestmentAccountOwnershipInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PrimaryOwner PrimaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice
	 * AccountParties4Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#PrimaryOwner
	 * AccountParties7Choice.PrimaryOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#PrimaryOwner
	 * AccountParties5Choice.PrimaryOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#PrimaryOwner
	 * AccountParties1Choice.PrimaryOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PrimaryOwner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountParties4Choice.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.PrimaryOwner.mmObject();
			isDerived = false;
			xmlTag = "PmryOwnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryOwner";
			definition = "Single owner of the investment account or, when the ownership is split among several owners, the primary owner is the one giving its address and account details for the registration.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties1Choice.PrimaryOwner;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties7Choice.PrimaryOwner, com.tools20022.repository.choice.AccountParties5Choice.PrimaryOwner);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccountOwnershipInformation9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Legal owners of the property. However, the beneficiary has the equitable
	 * or beneficial ownership.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9
	 * InvestmentAccountOwnershipInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TrusteeRole TrusteeRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice
	 * AccountParties4Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#Trustee
	 * AccountParties7Choice.Trustee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#Trustee
	 * AccountParties5Choice.Trustee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#Trustee
	 * AccountParties1Choice.Trustee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Trustee = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountParties4Choice.mmObject();
			businessComponentTrace_lazy = () -> TrusteeRole.mmObject();
			isDerived = false;
			xmlTag = "Trstee";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trustee";
			definition = "Legal owners of the property. However, the beneficiary has the equitable or beneficial ownership.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties1Choice.Trustee;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties7Choice.Trustee, com.tools20022.repository.choice.AccountParties5Choice.Trustee);
			minOccurs = 1;
			maxOccurs = 5;
			type_lazy = () -> InvestmentAccountOwnershipInformation9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Entity that holds shares/units on behalf of a legal minor. Although the
	 * account is registered under the name of the minor, the custodian retains
	 * control of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9
	 * InvestmentAccountOwnershipInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CustodianForMinor
	 * CustodianForMinor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice
	 * AccountParties4Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#CustodianForMinor
	 * AccountParties7Choice.CustodianForMinor}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#CustodianForMinor
	 * AccountParties5Choice.CustodianForMinor}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#CustodianForMinor
	 * AccountParties1Choice.CustodianForMinor}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CustodianForMinor = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountParties4Choice.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.CustodianForMinor.mmObject();
			isDerived = false;
			xmlTag = "CtdnForMnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianForMinor";
			definition = "Entity that holds shares/units on behalf of a legal minor. Although the account is registered under the name of the minor, the custodian retains control of the account.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties1Choice.CustodianForMinor;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties7Choice.CustodianForMinor, com.tools20022.repository.choice.AccountParties5Choice.CustodianForMinor);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccountOwnershipInformation9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Entity named by the beneficial owner to act on its behalf, often to
	 * facilitate dealing, or to conceal the identity of the beneficiary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9
	 * InvestmentAccountOwnershipInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Nominee Nominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice
	 * AccountParties4Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#Nominee
	 * AccountParties7Choice.Nominee}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#Nominee
	 * AccountParties5Choice.Nominee}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#Nominee
	 * AccountParties1Choice.Nominee}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Nominee = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountParties4Choice.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.Nominee.mmObject();
			isDerived = false;
			xmlTag = "Nmnee";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nominee";
			definition = "Entity named by the beneficial owner to act on its behalf, often to facilitate dealing, or to conceal the identity of the beneficiary.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties1Choice.Nominee;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties7Choice.Nominee, com.tools20022.repository.choice.AccountParties5Choice.Nominee);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccountOwnershipInformation9.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Co-owner of the investment account when the ownership is assigned to more
	 * than one party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccountOwnershipInformation9
	 * InvestmentAccountOwnershipInformation9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.JointOwner JointOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties4Choice
	 * AccountParties4Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties7Choice#JointOwner
	 * AccountParties7Choice.JointOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AccountParties5Choice#JointOwner
	 * AccountParties5Choice.JointOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.AccountParties1Choice#JointOwner
	 * AccountParties1Choice.JointOwner}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd JointOwner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountParties4Choice.mmObject();
			businessComponentTrace_lazy = () -> com.tools20022.repository.entity.JointOwner.mmObject();
			isDerived = false;
			xmlTag = "JntOwnr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointOwner";
			definition = "Co-owner of the investment account when the ownership is assigned to more than one party.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.AccountParties1Choice.JointOwner;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties7Choice.JointOwner, com.tools20022.repository.choice.AccountParties5Choice.JointOwner);
			minOccurs = 1;
			maxOccurs = 5;
			type_lazy = () -> InvestmentAccountOwnershipInformation9.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AccountParties4Choice.PrimaryOwner, com.tools20022.repository.choice.AccountParties4Choice.Trustee,
						com.tools20022.repository.choice.AccountParties4Choice.CustodianForMinor, com.tools20022.repository.choice.AccountParties4Choice.Nominee, com.tools20022.repository.choice.AccountParties4Choice.JointOwner);
				trace_lazy = () -> InvestmentAccountPartyRole.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountParties4Choice";
				definition = "Party associated with the account.";
				previousVersion_lazy = () -> AccountParties1Choice.mmObject();
				nextVersions_lazy = () -> Arrays.asList(AccountParties7Choice.mmObject(), AccountParties5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}