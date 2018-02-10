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
import com.tools20022.repository.codeset.AccountOpeningTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of account to which an account opening request is related,
 * for instance a new account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOpeningTypeCode#NewAccountOpening
 * AccountOpeningTypeCode.NewAccountOpening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOpeningTypeCode#SupplementaryAccountOpening
 * AccountOpeningTypeCode.SupplementaryAccountOpening}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountOpeningType1Code
 * AccountOpeningType1Code}</li>
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
 * <li>"NEWA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountOpeningTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of account to which an account opening request is related, for instance a new account."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountOpeningTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Account request is to open a new account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOpeningTypeCode
	 * AccountOpeningTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NEWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewAccountOpening"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account request is to open a new account."</li>
	 * </ul>
	 */
	public static final AccountOpeningTypeCode NewAccountOpening = new AccountOpeningTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAccountOpening";
			definition = "Account request is to open a new account.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOpeningTypeCode.mmObject();
			codeName = "NEWA";
		}
	};
	/**
	 * Account request is to open a supplementary account, that is, based on an
	 * existing account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOpeningTypeCode
	 * AccountOpeningTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryAccountOpening"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account request is to open a supplementary account, that is, based on an existing account."
	 * </li>
	 * </ul>
	 */
	public static final AccountOpeningTypeCode SupplementaryAccountOpening = new AccountOpeningTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryAccountOpening";
			definition = "Account request is to open a supplementary account, that is, based on an existing account.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOpeningTypeCode.mmObject();
			codeName = "SUPA";
		}
	};
	final static private LinkedHashMap<String, AccountOpeningTypeCode> codesByName = new LinkedHashMap<>();

	protected AccountOpeningTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NEWA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountOpeningTypeCode";
				definition = "Specifies the type of account to which an account opening request is related, for instance a new account.";
				derivation_lazy = () -> Arrays.asList(AccountOpeningType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountOpeningTypeCode.NewAccountOpening, com.tools20022.repository.codeset.AccountOpeningTypeCode.SupplementaryAccountOpening);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NewAccountOpening.getCodeName().get(), NewAccountOpening);
		codesByName.put(SupplementaryAccountOpening.getCodeName().get(), SupplementaryAccountOpening);
	}

	public static AccountOpeningTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountOpeningTypeCode[] values() {
		AccountOpeningTypeCode[] values = new AccountOpeningTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountOpeningTypeCode> {
		@Override
		public AccountOpeningTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountOpeningTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}