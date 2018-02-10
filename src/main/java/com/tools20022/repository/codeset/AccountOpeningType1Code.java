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
import com.tools20022.repository.codeset.AccountOpeningType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of account to which an account opening request is related,
 * eg, a new account.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOpeningType1Code#NewAccountOpening
 * AccountOpeningType1Code.NewAccountOpening}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountOpeningType1Code#SupplementaryAccountOpening
 * AccountOpeningType1Code.SupplementaryAccountOpening}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AccountOpeningTypeCode
 * AccountOpeningTypeCode}</li>
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
 * "AccountOpeningType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of account to which an account opening request is related, eg, a new account."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountOpeningType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOpeningType1Code
	 * AccountOpeningType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewAccountOpening"</li>
	 * </ul>
	 */
	public static final AccountOpeningType1Code NewAccountOpening = new AccountOpeningType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAccountOpening";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOpeningType1Code.mmObject();
			codeName = AccountOpeningTypeCode.NewAccountOpening.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountOpeningType1Code
	 * AccountOpeningType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryAccountOpening"</li>
	 * </ul>
	 */
	public static final AccountOpeningType1Code SupplementaryAccountOpening = new AccountOpeningType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryAccountOpening";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountOpeningType1Code.mmObject();
			codeName = AccountOpeningTypeCode.SupplementaryAccountOpening.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AccountOpeningType1Code> codesByName = new LinkedHashMap<>();

	protected AccountOpeningType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NEWA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountOpeningType1Code";
				definition = "Specifies the type of account to which an account opening request is related, eg, a new account.";
				trace_lazy = () -> AccountOpeningTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountOpeningType1Code.NewAccountOpening, com.tools20022.repository.codeset.AccountOpeningType1Code.SupplementaryAccountOpening);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NewAccountOpening.getCodeName().get(), NewAccountOpening);
		codesByName.put(SupplementaryAccountOpening.getCodeName().get(), SupplementaryAccountOpening);
	}

	public static AccountOpeningType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountOpeningType1Code[] values() {
		AccountOpeningType1Code[] values = new AccountOpeningType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountOpeningType1Code> {
		@Override
		public AccountOpeningType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountOpeningType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}