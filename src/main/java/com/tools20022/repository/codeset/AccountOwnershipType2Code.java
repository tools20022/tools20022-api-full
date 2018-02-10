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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.AccountOwnershipType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of account ownership.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code#JointAccountWithSurvivorshipRights
 * AccountOwnershipType2Code.JointAccountWithSurvivorshipRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code#JointAccountInCommon
 * AccountOwnershipType2Code.JointAccountInCommon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code#CustodialAccount
 * AccountOwnershipType2Code.CustodialAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code#SingleOwnerAccount
 * AccountOwnershipType2Code.SingleOwnerAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code#JointAccount
 * AccountOwnershipType2Code.JointAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code#Corporation
 * AccountOwnershipType2Code.Corporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code#FormalPartnership
 * AccountOwnershipType2Code.FormalPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code#FormalTrust
 * AccountOwnershipType2Code.FormalTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code#Nominee
 * AccountOwnershipType2Code.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code#NonProfitOrganisation
 * AccountOwnershipType2Code.NonProfitOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code#OtherNonIndividual
 * AccountOwnershipType2Code.OtherNonIndividual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code#EUResidualEntity
 * AccountOwnershipType2Code.EUResidualEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code#GovernmentOrganisation
 * AccountOwnershipType2Code.GovernmentOrganisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipTypeCode
 * AccountOwnershipTypeCode}</li>
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
 * "AccountOwnershipType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of account ownership."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountOwnershipType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointAccountWithSurvivorshipRights"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType2Code JointAccountWithSurvivorshipRights = new AccountOwnershipType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointAccountWithSurvivorshipRights";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType2Code.mmObject();
			codeName = AccountOwnershipTypeCode.JointAccountWithSurvivorshipRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointAccountInCommon"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType2Code JointAccountInCommon = new AccountOwnershipType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointAccountInCommon";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType2Code.mmObject();
			codeName = AccountOwnershipTypeCode.JointAccountInCommon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodialAccount"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType2Code CustodialAccount = new AccountOwnershipType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodialAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType2Code.mmObject();
			codeName = AccountOwnershipTypeCode.CustodialAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleOwnerAccount"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType2Code SingleOwnerAccount = new AccountOwnershipType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleOwnerAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType2Code.mmObject();
			codeName = AccountOwnershipTypeCode.SingleOwnerAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointAccount"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType2Code JointAccount = new AccountOwnershipType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType2Code.mmObject();
			codeName = AccountOwnershipTypeCode.JointAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporation"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType2Code Corporation = new AccountOwnershipType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporation";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType2Code.mmObject();
			codeName = AccountOwnershipTypeCode.Corporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormalPartnership"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType2Code FormalPartnership = new AccountOwnershipType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormalPartnership";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType2Code.mmObject();
			codeName = AccountOwnershipTypeCode.FormalPartnership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormalTrust"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType2Code FormalTrust = new AccountOwnershipType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormalTrust";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType2Code.mmObject();
			codeName = AccountOwnershipTypeCode.FormalTrust.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nominee"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType2Code Nominee = new AccountOwnershipType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nominee";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType2Code.mmObject();
			codeName = AccountOwnershipTypeCode.Nominee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonProfitOrganisation"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType2Code NonProfitOrganisation = new AccountOwnershipType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonProfitOrganisation";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType2Code.mmObject();
			codeName = AccountOwnershipTypeCode.NonProfitOrganisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNonIndividual"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType2Code OtherNonIndividual = new AccountOwnershipType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherNonIndividual";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType2Code.mmObject();
			codeName = AccountOwnershipTypeCode.OtherNonIndividual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUResidualEntity"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType2Code EUResidualEntity = new AccountOwnershipType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUResidualEntity";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType2Code.mmObject();
			codeName = AccountOwnershipTypeCode.EUResidualEntity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType2Code
	 * AccountOwnershipType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentOrganisation"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType2Code GovernmentOrganisation = new AccountOwnershipType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentOrganisation";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType2Code.mmObject();
			codeName = AccountOwnershipTypeCode.GovernmentOrganisation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AccountOwnershipType2Code> codesByName = new LinkedHashMap<>();

	protected AccountOwnershipType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("JOIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountOwnershipType2Code";
				definition = "Specifies the type of account ownership.";
				trace_lazy = () -> AccountOwnershipTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountOwnershipType2Code.JointAccountWithSurvivorshipRights, com.tools20022.repository.codeset.AccountOwnershipType2Code.JointAccountInCommon,
						com.tools20022.repository.codeset.AccountOwnershipType2Code.CustodialAccount, com.tools20022.repository.codeset.AccountOwnershipType2Code.SingleOwnerAccount,
						com.tools20022.repository.codeset.AccountOwnershipType2Code.JointAccount, com.tools20022.repository.codeset.AccountOwnershipType2Code.Corporation,
						com.tools20022.repository.codeset.AccountOwnershipType2Code.FormalPartnership, com.tools20022.repository.codeset.AccountOwnershipType2Code.FormalTrust,
						com.tools20022.repository.codeset.AccountOwnershipType2Code.Nominee, com.tools20022.repository.codeset.AccountOwnershipType2Code.NonProfitOrganisation,
						com.tools20022.repository.codeset.AccountOwnershipType2Code.OtherNonIndividual, com.tools20022.repository.codeset.AccountOwnershipType2Code.EUResidualEntity,
						com.tools20022.repository.codeset.AccountOwnershipType2Code.GovernmentOrganisation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(JointAccountWithSurvivorshipRights.getCodeName().get(), JointAccountWithSurvivorshipRights);
		codesByName.put(JointAccountInCommon.getCodeName().get(), JointAccountInCommon);
		codesByName.put(CustodialAccount.getCodeName().get(), CustodialAccount);
		codesByName.put(SingleOwnerAccount.getCodeName().get(), SingleOwnerAccount);
		codesByName.put(JointAccount.getCodeName().get(), JointAccount);
		codesByName.put(Corporation.getCodeName().get(), Corporation);
		codesByName.put(FormalPartnership.getCodeName().get(), FormalPartnership);
		codesByName.put(FormalTrust.getCodeName().get(), FormalTrust);
		codesByName.put(Nominee.getCodeName().get(), Nominee);
		codesByName.put(NonProfitOrganisation.getCodeName().get(), NonProfitOrganisation);
		codesByName.put(OtherNonIndividual.getCodeName().get(), OtherNonIndividual);
		codesByName.put(EUResidualEntity.getCodeName().get(), EUResidualEntity);
		codesByName.put(GovernmentOrganisation.getCodeName().get(), GovernmentOrganisation);
	}

	public static AccountOwnershipType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountOwnershipType2Code[] values() {
		AccountOwnershipType2Code[] values = new AccountOwnershipType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountOwnershipType2Code> {
		@Override
		public AccountOwnershipType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountOwnershipType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}