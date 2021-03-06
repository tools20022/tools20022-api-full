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
import com.tools20022.repository.entity.AssetPartyRole;
import com.tools20022.repository.entity.CashAccount;
import com.tools20022.repository.entity.SecuritiesAccount;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RegistrationParameters3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

/**
 * Specifies roles played by a party that are linked to the handling of
 * securities but not related to a specific process.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesPartyRole" src="doc-files/SecuritiesPartyRole.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AssetPartyRole
 * AssetPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecuritiesAccount
 * SecuritiesPartyRole.mmSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmCashAccount
 * SecuritiesPartyRole.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole#mmSecurity
 * SecuritiesPartyRole.mmSecurity}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPartyRole
 * Security.mmPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAccount#mmSecuritiesPartyRole
 * CashAccount.mmSecuritiesPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesPartyRole
 * SecuritiesAccount.mmSecuritiesPartyRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.SafekeepingPlace
 * SafekeepingPlace}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RegistrarRole RegistrarRole}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.BeneficialOwner
 * BeneficialOwner}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Sponsor Sponsor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BondCounsel BondCounsel}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CollectionAgent
 * CollectionAgent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CustodianRole CustodianRole}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.DeterminationAgent
 * DeterminationAgent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LeadUnderwriter
 * LeadUnderwriter}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LegalAdvisor LegalAdvisor}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PlaceOfRegistry
 * PlaceOfRegistry}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PrimaryPlaceOfDeposit
 * PrimaryPlaceOfDeposit}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PrincipalCollectionAgent
 * PrincipalCollectionAgent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PrincipalPayingAgent
 * PrincipalPayingAgent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RemarketingAgent
 * RemarketingAgent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.UnderwriterRole
 * UnderwriterRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DepositoryRole
 * DepositoryRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Pledgee Pledgee}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesPartyRole"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies roles played by a party that are linked to the handling of securities but not related to a specific process."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
public class SecuritiesPartyRole extends AssetPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.SecuritiesAccount> securitiesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSecuritiesPartyRole
	 * SecuritiesAccount.mmSecuritiesPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters3#mmRegistrarAccount
	 * RegistrationParameters3.mmRegistrarAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
	 * SecuritiesPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the securities account used in the context of the securities party role (such as investor securities account used for a corporate action securities distribution)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPartyRole, List<SecuritiesAccount>> mmSecuritiesAccount = new MMBusinessAssociationEnd<SecuritiesPartyRole, List<SecuritiesAccount>>() {
		{
			derivation_lazy = () -> Arrays.asList(RegistrationParameters3.mmRegistrarAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesAccount";
			definition = "Unambiguous identification of the securities account used in the context of the securities party role (such as investor securities account used for a corporate action securities distribution)";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}

		@Override
		public List<SecuritiesAccount> getValue(SecuritiesPartyRole obj) {
			return obj.getSecuritiesAccount();
		}

		@Override
		public void setValue(SecuritiesPartyRole obj, List<SecuritiesAccount> value) {
			obj.setSecuritiesAccount(value);
		}
	};
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmSecuritiesPartyRole
	 * CashAccount.mmSecuritiesPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
	 * SecuritiesPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the cash account used in the context of the securities party role (such as investor cash account used for a corporate action cash distribution)"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPartyRole, List<CashAccount>> mmCashAccount = new MMBusinessAssociationEnd<SecuritiesPartyRole, List<CashAccount>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Unambiguous identification of the cash account used in the context of the securities party role (such as investor cash account used for a corporate action cash distribution)";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmSecuritiesPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}

		@Override
		public List<CashAccount> getValue(SecuritiesPartyRole obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(SecuritiesPartyRole obj, List<CashAccount> value) {
			obj.setCashAccount(value);
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPartyRole
	 * Security.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
	 * SecuritiesPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the security for which the party plays a role."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<SecuritiesPartyRole, List<Security>> mmSecurity = new MMBusinessAssociationEnd<SecuritiesPartyRole, List<Security>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPartyRole.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Specifies the security for which the party plays a role.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmPartyRole;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}

		@Override
		public List<Security> getValue(SecuritiesPartyRole obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(SecuritiesPartyRole obj, List<Security> value) {
			obj.setSecurity(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPartyRole";
				definition = "Specifies roles played by a party that are linked to the handling of securities but not related to a specific process.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmPartyRole, com.tools20022.repository.entity.CashAccount.mmSecuritiesPartyRole,
						com.tools20022.repository.entity.SecuritiesAccount.mmSecuritiesPartyRole);
				subType_lazy = () -> Arrays.asList(SafekeepingPlace.mmObject(), RegistrarRole.mmObject(), BeneficialOwner.mmObject(), Sponsor.mmObject(), BondCounsel.mmObject(), CollectionAgent.mmObject(), CustodianRole.mmObject(),
						DeterminationAgent.mmObject(), LeadUnderwriter.mmObject(), LegalAdvisor.mmObject(), PlaceOfRegistry.mmObject(), PrimaryPlaceOfDeposit.mmObject(), PrincipalCollectionAgent.mmObject(), PrincipalPayingAgent.mmObject(),
						RemarketingAgent.mmObject(), UnderwriterRole.mmObject(), DepositoryRole.mmObject(), Pledgee.mmObject());
				superType_lazy = () -> AssetPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPartyRole.mmSecuritiesAccount, com.tools20022.repository.entity.SecuritiesPartyRole.mmCashAccount,
						com.tools20022.repository.entity.SecuritiesPartyRole.mmSecurity);
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesPartyRole.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecuritiesAccount> getSecuritiesAccount() {
		return securitiesAccount == null ? securitiesAccount = new ArrayList<>() : securitiesAccount;
	}

	public SecuritiesPartyRole setSecuritiesAccount(List<com.tools20022.repository.entity.SecuritiesAccount> securitiesAccount) {
		this.securitiesAccount = Objects.requireNonNull(securitiesAccount);
		return this;
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount == null ? cashAccount = new ArrayList<>() : cashAccount;
	}

	public SecuritiesPartyRole setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public List<Security> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public SecuritiesPartyRole setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}
}