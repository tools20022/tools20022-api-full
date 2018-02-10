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
import com.tools20022.repository.codeset.AccountRelationship1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the role of a party with respect to an account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountRelationship1Code#Beneficiary
 * AccountRelationship1Code.Beneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountRelationship1Code#PowerOfAttorney
 * AccountRelationship1Code.PowerOfAttorney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountRelationship1Code#LegalGuardian
 * AccountRelationship1Code.LegalGuardian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountRelationship1Code#SuccessorOnDeath
 * AccountRelationship1Code.SuccessorOnDeath}</li>
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
 * <li>"BENF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountRelationship1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the role of a party with respect to an account."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountRelationship1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Ultimate party that is entitled to either receive the benefits of the
	 * ownership of a financial instrument, or to be paid/credited as a result
	 * of a transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountRelationship1Code
	 * AccountRelationship1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BENF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer."
	 * </li>
	 * </ul>
	 */
	public static final AccountRelationship1Code Beneficiary = new AccountRelationship1Code() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "Beneficiary";
			definition = "Ultimate party that is entitled to either receive the benefits of the ownership of a financial instrument, or to be paid/credited as a result of a transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountRelationship1Code.mmObject();
			codeName = "BENF";
		}
	};
	/**
	 * Entity that was given the authority by another entity to act on its
	 * behalf.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountRelationship1Code
	 * AccountRelationship1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POFA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PowerOfAttorney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that was given the authority by another entity to act on its behalf."
	 * </li>
	 * </ul>
	 */
	public static final AccountRelationship1Code PowerOfAttorney = new AccountRelationship1Code() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "PowerOfAttorney";
			definition = "Entity that was given the authority by another entity to act on its behalf.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountRelationship1Code.mmObject();
			codeName = "POFA";
		}
	};
	/**
	 * Entity that has been appointed by a legal authority to act on behalf of a
	 * person judged to be incapacitated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountRelationship1Code
	 * AccountRelationship1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEGA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalGuardian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated."
	 * </li>
	 * </ul>
	 */
	public static final AccountRelationship1Code LegalGuardian = new AccountRelationship1Code() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "LegalGuardian";
			definition = "Entity that has been appointed by a legal authority to act on behalf of a person judged to be incapacitated.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountRelationship1Code.mmObject();
			codeName = "LEGA";
		}
	};
	/**
	 * Deceased's estate, or successor, to whom the respective percentage of
	 * ownership will be transferred upon the death of one of the owners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountRelationship1Code
	 * AccountRelationship1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuccessorOnDeath"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners."
	 * </li>
	 * </ul>
	 */
	public static final AccountRelationship1Code SuccessorOnDeath = new AccountRelationship1Code() {
		{
			registrationStatus = MMRegistrationStatus.OBSOLETE;
			name = "SuccessorOnDeath";
			definition = "Deceased's estate, or successor, to whom the respective percentage of ownership will be transferred upon the death of one of the owners.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountRelationship1Code.mmObject();
			codeName = "SUCC";
		}
	};
	final static private LinkedHashMap<String, AccountRelationship1Code> codesByName = new LinkedHashMap<>();

	protected AccountRelationship1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BENF");
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				name = "AccountRelationship1Code";
				definition = "Specifies the role of a party with respect to an account.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountRelationship1Code.Beneficiary, com.tools20022.repository.codeset.AccountRelationship1Code.PowerOfAttorney,
						com.tools20022.repository.codeset.AccountRelationship1Code.LegalGuardian, com.tools20022.repository.codeset.AccountRelationship1Code.SuccessorOnDeath);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Beneficiary.getCodeName().get(), Beneficiary);
		codesByName.put(PowerOfAttorney.getCodeName().get(), PowerOfAttorney);
		codesByName.put(LegalGuardian.getCodeName().get(), LegalGuardian);
		codesByName.put(SuccessorOnDeath.getCodeName().get(), SuccessorOnDeath);
	}

	public static AccountRelationship1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountRelationship1Code[] values() {
		AccountRelationship1Code[] values = new AccountRelationship1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountRelationship1Code> {
		@Override
		public AccountRelationship1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountRelationship1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}