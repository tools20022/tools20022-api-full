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
import com.tools20022.repository.codeset.AccountOwnershipType4Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#Unincorporated
 * AccountOwnershipType4Code.Unincorporated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#LimitedPartnership
 * AccountOwnershipType4Code.LimitedPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#Entrepreneurial
 * AccountOwnershipType4Code.Entrepreneurial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#Corporation
 * AccountOwnershipType4Code.Corporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#CustodialAccount
 * AccountOwnershipType4Code.CustodialAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#EUResidualEntity
 * AccountOwnershipType4Code.EUResidualEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#FormalPartnership
 * AccountOwnershipType4Code.FormalPartnership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#FormalTrust
 * AccountOwnershipType4Code.FormalTrust}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#GovernmentOrganisation
 * AccountOwnershipType4Code.GovernmentOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#JointAccount
 * AccountOwnershipType4Code.JointAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#JointAccountInCommon
 * AccountOwnershipType4Code.JointAccountInCommon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#JointAccountWithSurvivorshipRights
 * AccountOwnershipType4Code.JointAccountWithSurvivorshipRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#LimitedLiabilityCompany
 * AccountOwnershipType4Code.LimitedLiabilityCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#Nominee
 * AccountOwnershipType4Code.Nominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#NonProfitOrganisation
 * AccountOwnershipType4Code.NonProfitOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#OtherNonIndividual
 * AccountOwnershipType4Code.OtherNonIndividual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#RegisteredInvestmentCompany
 * AccountOwnershipType4Code.RegisteredInvestmentCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code#SingleOwnerAccount
 * AccountOwnershipType4Code.SingleOwnerAccount}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountOwnershipType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of account ownership."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountOwnershipType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unincorporated"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code Unincorporated = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unincorporated";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.Unincorporated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedPartnership"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code LimitedPartnership = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedPartnership";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.LimitedPartnership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entrepreneurial"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code Entrepreneurial = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entrepreneurial";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.Entrepreneurial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Corporation"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code Corporation = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Corporation";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.Corporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodialAccount"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code CustodialAccount = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodialAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.CustodialAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUResidualEntity"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code EUResidualEntity = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUResidualEntity";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.EUResidualEntity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormalPartnership"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code FormalPartnership = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormalPartnership";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.FormalPartnership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormalTrust"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code FormalTrust = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormalTrust";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.FormalTrust.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GovernmentOrganisation"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code GovernmentOrganisation = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GovernmentOrganisation";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.GovernmentOrganisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointAccount"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code JointAccount = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.JointAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointAccountInCommon"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code JointAccountInCommon = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointAccountInCommon";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.JointAccountInCommon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JointAccountWithSurvivorshipRights"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code JointAccountWithSurvivorshipRights = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JointAccountWithSurvivorshipRights";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.JointAccountWithSurvivorshipRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitedLiabilityCompany"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code LimitedLiabilityCompany = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitedLiabilityCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.LimitedLiabilityCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nominee"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code Nominee = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nominee";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.Nominee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonProfitOrganisation"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code NonProfitOrganisation = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonProfitOrganisation";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.NonProfitOrganisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherNonIndividual"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code OtherNonIndividual = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherNonIndividual";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.OtherNonIndividual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredInvestmentCompany"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code RegisteredInvestmentCompany = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredInvestmentCompany";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.RegisteredInvestmentCompany.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOwnershipType4Code
	 * AccountOwnershipType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleOwnerAccount"</li>
	 * </ul>
	 */
	public static final AccountOwnershipType4Code SingleOwnerAccount = new AccountOwnershipType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleOwnerAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOwnershipType4Code.mmObject();
			codeName = AccountOwnershipTypeCode.SingleOwnerAccount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AccountOwnershipType4Code> codesByName = new LinkedHashMap<>();

	protected AccountOwnershipType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountOwnershipType4Code";
				definition = "Specifies the type of account ownership.";
				trace_lazy = () -> AccountOwnershipTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountOwnershipType4Code.Unincorporated, com.tools20022.repository.codeset.AccountOwnershipType4Code.LimitedPartnership,
						com.tools20022.repository.codeset.AccountOwnershipType4Code.Entrepreneurial, com.tools20022.repository.codeset.AccountOwnershipType4Code.Corporation,
						com.tools20022.repository.codeset.AccountOwnershipType4Code.CustodialAccount, com.tools20022.repository.codeset.AccountOwnershipType4Code.EUResidualEntity,
						com.tools20022.repository.codeset.AccountOwnershipType4Code.FormalPartnership, com.tools20022.repository.codeset.AccountOwnershipType4Code.FormalTrust,
						com.tools20022.repository.codeset.AccountOwnershipType4Code.GovernmentOrganisation, com.tools20022.repository.codeset.AccountOwnershipType4Code.JointAccount,
						com.tools20022.repository.codeset.AccountOwnershipType4Code.JointAccountInCommon, com.tools20022.repository.codeset.AccountOwnershipType4Code.JointAccountWithSurvivorshipRights,
						com.tools20022.repository.codeset.AccountOwnershipType4Code.LimitedLiabilityCompany, com.tools20022.repository.codeset.AccountOwnershipType4Code.Nominee,
						com.tools20022.repository.codeset.AccountOwnershipType4Code.NonProfitOrganisation, com.tools20022.repository.codeset.AccountOwnershipType4Code.OtherNonIndividual,
						com.tools20022.repository.codeset.AccountOwnershipType4Code.RegisteredInvestmentCompany, com.tools20022.repository.codeset.AccountOwnershipType4Code.SingleOwnerAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Unincorporated.getCodeName().get(), Unincorporated);
		codesByName.put(LimitedPartnership.getCodeName().get(), LimitedPartnership);
		codesByName.put(Entrepreneurial.getCodeName().get(), Entrepreneurial);
		codesByName.put(Corporation.getCodeName().get(), Corporation);
		codesByName.put(CustodialAccount.getCodeName().get(), CustodialAccount);
		codesByName.put(EUResidualEntity.getCodeName().get(), EUResidualEntity);
		codesByName.put(FormalPartnership.getCodeName().get(), FormalPartnership);
		codesByName.put(FormalTrust.getCodeName().get(), FormalTrust);
		codesByName.put(GovernmentOrganisation.getCodeName().get(), GovernmentOrganisation);
		codesByName.put(JointAccount.getCodeName().get(), JointAccount);
		codesByName.put(JointAccountInCommon.getCodeName().get(), JointAccountInCommon);
		codesByName.put(JointAccountWithSurvivorshipRights.getCodeName().get(), JointAccountWithSurvivorshipRights);
		codesByName.put(LimitedLiabilityCompany.getCodeName().get(), LimitedLiabilityCompany);
		codesByName.put(Nominee.getCodeName().get(), Nominee);
		codesByName.put(NonProfitOrganisation.getCodeName().get(), NonProfitOrganisation);
		codesByName.put(OtherNonIndividual.getCodeName().get(), OtherNonIndividual);
		codesByName.put(RegisteredInvestmentCompany.getCodeName().get(), RegisteredInvestmentCompany);
		codesByName.put(SingleOwnerAccount.getCodeName().get(), SingleOwnerAccount);
	}

	public static AccountOwnershipType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountOwnershipType4Code[] values() {
		AccountOwnershipType4Code[] values = new AccountOwnershipType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountOwnershipType4Code> {
		@Override
		public AccountOwnershipType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountOwnershipType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}