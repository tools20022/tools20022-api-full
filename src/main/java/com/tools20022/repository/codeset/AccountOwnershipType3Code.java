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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.repository.codeset.AccountOwnershipTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of account ownership.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
 * AccountOwnershipTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#JointAccountWithSurvivorshipRights
 * AccountOwnershipType3Code.JointAccountWithSurvivorshipRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#JointAccountInCommon
 * AccountOwnershipType3Code.JointAccountInCommon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#CustodialAccount
 * AccountOwnershipType3Code.CustodialAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#SingleOwnerAccount
 * AccountOwnershipType3Code.SingleOwnerAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#JointAccount
 * AccountOwnershipType3Code.JointAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#Corporation
 * AccountOwnershipType3Code.Corporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#FormalPartnership
 * AccountOwnershipType3Code.FormalPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#FormalTrust
 * AccountOwnershipType3Code.FormalTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#Nominee
 * AccountOwnershipType3Code.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#NonProfitOrganisation
 * AccountOwnershipType3Code.NonProfitOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#OtherNonIndividual
 * AccountOwnershipType3Code.OtherNonIndividual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#EUResidualEntity
 * AccountOwnershipType3Code.EUResidualEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#GovernmentOrganisation
 * AccountOwnershipType3Code.GovernmentOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#LimitedLiabilityCompany
 * AccountOwnershipType3Code.LimitedLiabilityCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code#RegisteredInvestmentCompany
 * AccountOwnershipType3Code.RegisteredInvestmentCompany}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"JOIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountOwnershipType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of account ownership."</li>
 * </ul>
 */
public class AccountOwnershipType3Code extends AccountOwnershipTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointAccountWithSurvivorshipRights"</li>
	 * </ul>
	 */
	public static final MMCode JointAccountWithSurvivorshipRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointAccountWithSurvivorshipRights";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointAccountInCommon"</li>
	 * </ul>
	 */
	public static final MMCode JointAccountInCommon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointAccountInCommon";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodialAccount"</li>
	 * </ul>
	 */
	public static final MMCode CustodialAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodialAccount";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleOwnerAccount"</li>
	 * </ul>
	 */
	public static final MMCode SingleOwnerAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleOwnerAccount";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointAccount"</li>
	 * </ul>
	 */
	public static final MMCode JointAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointAccount";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporation"</li>
	 * </ul>
	 */
	public static final MMCode Corporation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporation";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormalPartnership"</li>
	 * </ul>
	 */
	public static final MMCode FormalPartnership = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormalPartnership";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormalTrust"</li>
	 * </ul>
	 */
	public static final MMCode FormalTrust = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormalTrust";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nominee"</li>
	 * </ul>
	 */
	public static final MMCode Nominee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nominee";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonProfitOrganisation"</li>
	 * </ul>
	 */
	public static final MMCode NonProfitOrganisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonProfitOrganisation";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNonIndividual"</li>
	 * </ul>
	 */
	public static final MMCode OtherNonIndividual = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherNonIndividual";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUResidualEntity"</li>
	 * </ul>
	 */
	public static final MMCode EUResidualEntity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUResidualEntity";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentOrganisation"</li>
	 * </ul>
	 */
	public static final MMCode GovernmentOrganisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentOrganisation";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedLiabilityCompany"</li>
	 * </ul>
	 */
	public static final MMCode LimitedLiabilityCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedLiabilityCompany";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType3Code
	 * AccountOwnershipType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredInvestmentCompany"</li>
	 * </ul>
	 */
	public static final MMCode RegisteredInvestmentCompany = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredInvestmentCompany";
			owner_lazy = () -> AccountOwnershipType3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("JOIN");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountOwnershipType3Code";
				definition = "Specifies the type of account ownership.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountOwnershipType3Code.JointAccountWithSurvivorshipRights, com.tools20022.repository.codeset.AccountOwnershipType3Code.JointAccountInCommon,
						com.tools20022.repository.codeset.AccountOwnershipType3Code.CustodialAccount, com.tools20022.repository.codeset.AccountOwnershipType3Code.SingleOwnerAccount,
						com.tools20022.repository.codeset.AccountOwnershipType3Code.JointAccount, com.tools20022.repository.codeset.AccountOwnershipType3Code.Corporation,
						com.tools20022.repository.codeset.AccountOwnershipType3Code.FormalPartnership, com.tools20022.repository.codeset.AccountOwnershipType3Code.FormalTrust,
						com.tools20022.repository.codeset.AccountOwnershipType3Code.Nominee, com.tools20022.repository.codeset.AccountOwnershipType3Code.NonProfitOrganisation,
						com.tools20022.repository.codeset.AccountOwnershipType3Code.OtherNonIndividual, com.tools20022.repository.codeset.AccountOwnershipType3Code.EUResidualEntity,
						com.tools20022.repository.codeset.AccountOwnershipType3Code.GovernmentOrganisation, com.tools20022.repository.codeset.AccountOwnershipType3Code.LimitedLiabilityCompany,
						com.tools20022.repository.codeset.AccountOwnershipType3Code.RegisteredInvestmentCompany);
				trace_lazy = () -> AccountOwnershipTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}