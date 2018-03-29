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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Account;
import com.tools20022.repository.entity.Role;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Role played by a party in the context of account operations.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountPartyRole" src="doc-files/AccountPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Role Role}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountPartyRole#mmAccount
 * AccountPartyRole.mmAccount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmPartyRole
 * Account.mmPartyRole}</li>
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
	protected List<com.tools20022.repository.entity.Account> account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmPartyRole
	 * Account.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary5#mmAccount
	 * Intermediary5.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary12#mmAccount
	 * Intermediary12.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary1#mmAccount
	 * Intermediary1.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary7#mmAccount
	 * Intermediary7.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary6#mmAccount
	 * Intermediary6.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary13#mmAccount
	 * Intermediary13.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary11#mmAccount
	 * Intermediary11.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary2#mmAccount
	 * Intermediary2.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary3#mmAccount
	 * Intermediary3.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary21#mmAccount
	 * Intermediary21.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary23#mmAccount
	 * Intermediary23.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary22#mmAccount
	 * Intermediary22.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification59#mmAccountNumber
	 * PartyIdentification59.mmAccountNumber}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary17#mmAccount
	 * Intermediary17.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary18#mmAccount
	 * Intermediary18.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary24#mmAccount
	 * Intermediary24.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary26#mmAccount
	 * Intermediary26.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary25#mmAccount
	 * Intermediary25.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary27#mmAccount
	 * Intermediary27.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary32#mmAccount
	 * Intermediary32.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary36#mmAccount
	 * Intermediary36.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary34#mmAccount
	 * Intermediary34.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary33#mmAccount
	 * Intermediary33.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary35#mmAccount
	 * Intermediary35.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary37#mmAccount
	 * Intermediary37.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SettlementAgent1#mmAccount
	 * SettlementAgent1.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary41#mmAccount
	 * Intermediary41.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Intermediary42#mmAccount
	 * Intermediary42.mmAccount}</li>
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
	public static final MMBusinessAssociationEnd<AccountPartyRole, List<Account>> mmAccount = new MMBusinessAssociationEnd<AccountPartyRole, List<Account>>() {
		{
			derivation_lazy = () -> Arrays.asList(Intermediary5.mmAccount, Intermediary12.mmAccount, Intermediary1.mmAccount, Intermediary7.mmAccount, Intermediary6.mmAccount, Intermediary13.mmAccount, Intermediary11.mmAccount,
					Intermediary2.mmAccount, Intermediary3.mmAccount, Intermediary21.mmAccount, Intermediary23.mmAccount, Intermediary22.mmAccount, PartyIdentification59.mmAccountNumber, Intermediary17.mmAccount, Intermediary18.mmAccount,
					Intermediary24.mmAccount, Intermediary26.mmAccount, Intermediary25.mmAccount, Intermediary27.mmAccount, Intermediary32.mmAccount, Intermediary36.mmAccount, Intermediary34.mmAccount, Intermediary33.mmAccount,
					Intermediary35.mmAccount, Intermediary37.mmAccount, SettlementAgent1.mmAccount, Intermediary41.mmAccount, Intermediary42.mmAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.AccountPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Identifies the account for which a party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}

		@Override
		public List<Account> getValue(AccountPartyRole obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(AccountPartyRole obj, List<Account> value) {
			obj.setAccount(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountPartyRole";
				definition = "Role played by a party in the context of account operations.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmPartyRole);
				subType_lazy = () -> Arrays.asList(AccountOwnerRole.mmObject(), InvestmentAccountPartyRole.mmObject(), IntermediaryRole.mmObject(), AccountServicerRole.mmObject(), AccountResponsiblePartyRole.mmObject(),
						TreasuryManager.mmObject(), AccountInformationRecipientRole.mmObject(), AuthorisedAccountModifier.mmObject(), RepresentativeOfficer.mmObject());
				superType_lazy = () -> Role.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountPartyRole.mmAccount);
				derivationComponent_lazy = () -> Arrays.asList(AccountAndParties2.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Account> getAccount() {
		return account == null ? account = new ArrayList<>() : account;
	}

	public AccountPartyRole setAccount(List<com.tools20022.repository.entity.Account> account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}
}