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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.msg.AccountAndParties2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Role played by a party in the context of account operations.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountPartyRole" src="doc-files/AccountPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountPartyRole#Account
 * AccountPartyRole.Account}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#PartyRole
 * Account.PartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountOwnerRole
 * AccountOwnerRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.InvestmentAccountPartyRole
 * InvestmentAccountPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.IntermediaryRole
 * IntermediaryRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountServicerRole
 * AccountServicerRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountResponsiblePartyRole
 * AccountResponsiblePartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TreasuryManager
 * TreasuryManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountInformationRecipientRole
 * AccountInformationRecipientRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AuthorisedAccountModifier
 * AuthorisedAccountModifier}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RepresentativeOfficer
 * RepresentativeOfficer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountAndParties2
 * AccountAndParties2}</li>
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
 * "AccountPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Role played by a party in the context of account operations."</li>
 * </ul>
 */
public class AccountPartyRole extends Role {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the account for which a party plays a role.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#PartyRole
	 * Account.PartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary5#Account
	 * Intermediary5.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary12#Account
	 * Intermediary12.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary1#Account
	 * Intermediary1.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary7#Account
	 * Intermediary7.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary6#Account
	 * Intermediary6.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary13#Account
	 * Intermediary13.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11#Account
	 * Intermediary11.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary2#Account
	 * Intermediary2.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary3#Account
	 * Intermediary3.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary21#Account
	 * Intermediary21.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary23#Account
	 * Intermediary23.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary22#Account
	 * Intermediary22.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#AccountNumber
	 * PartyIdentification59.AccountNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary17#Account
	 * Intermediary17.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary18#Account
	 * Intermediary18.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary24#Account
	 * Intermediary24.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary26#Account
	 * Intermediary26.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary25#Account
	 * Intermediary25.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary27#Account
	 * Intermediary27.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary32#Account
	 * Intermediary32.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary36#Account
	 * Intermediary36.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary34#Account
	 * Intermediary34.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary33#Account
	 * Intermediary33.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary35#Account
	 * Intermediary35.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary37#Account
	 * Intermediary37.Account}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountPartyRole
	 * AccountPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the account for which a party plays a role."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Intermediary5.Account, com.tools20022.repository.msg.Intermediary12.Account, com.tools20022.repository.msg.Intermediary1.Account,
					com.tools20022.repository.msg.Intermediary7.Account, com.tools20022.repository.msg.Intermediary6.Account, com.tools20022.repository.msg.Intermediary13.Account, com.tools20022.repository.msg.Intermediary11.Account,
					com.tools20022.repository.msg.Intermediary2.Account, com.tools20022.repository.msg.Intermediary3.Account, com.tools20022.repository.msg.Intermediary21.Account, com.tools20022.repository.msg.Intermediary23.Account,
					com.tools20022.repository.msg.Intermediary22.Account, com.tools20022.repository.msg.PartyIdentification59.AccountNumber, com.tools20022.repository.msg.Intermediary17.Account,
					com.tools20022.repository.msg.Intermediary18.Account, com.tools20022.repository.msg.Intermediary24.Account, com.tools20022.repository.msg.Intermediary26.Account, com.tools20022.repository.msg.Intermediary25.Account,
					com.tools20022.repository.msg.Intermediary27.Account, com.tools20022.repository.msg.Intermediary32.Account, com.tools20022.repository.msg.Intermediary36.Account, com.tools20022.repository.msg.Intermediary34.Account,
					com.tools20022.repository.msg.Intermediary33.Account, com.tools20022.repository.msg.Intermediary35.Account, com.tools20022.repository.msg.Intermediary37.Account);
			elementContext_lazy = () -> AccountPartyRole.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Identifies the account for which a party plays a role.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.PartyRole;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountPartyRole";
				definition = "Role played by a party in the context of account operations.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.PartyRole);
				subType_lazy = () -> Arrays.asList(AccountOwnerRole.mmObject(), InvestmentAccountPartyRole.mmObject(), IntermediaryRole.mmObject(), AccountServicerRole.mmObject(), AccountResponsiblePartyRole.mmObject(),
						TreasuryManager.mmObject(), AccountInformationRecipientRole.mmObject(), AuthorisedAccountModifier.mmObject(), RepresentativeOfficer.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountPartyRole.Account);
				derivationComponent_lazy = () -> Arrays.asList(AccountAndParties2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}