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
import com.tools20022.repository.codeset.AccountPermissionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies different levels of permission.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountPermissionTypeCode#NoRight
 * AccountPermissionTypeCode.NoRight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountPermissionTypeCode#RightToUseAlone
 * AccountPermissionTypeCode.RightToUseAlone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccountPermissionTypeCode#RightToUseWithOther
 * AccountPermissionTypeCode.RightToUseWithOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AccountPermissionType1Code
 * AccountPermissionType1Code}</li>
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
 * "AccountPermissionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies different levels of permission."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccountPermissionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * No right to use the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountPermissionTypeCode
	 * AccountPermissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NORI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No right to use the account."</li>
	 * </ul>
	 */
	public static final AccountPermissionTypeCode NoRight = new AccountPermissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoRight";
			definition = "No right to use the account.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountPermissionTypeCode.mmObject();
			codeName = "NORI";
		}
	};
	/**
	 * Right to use the account alone.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountPermissionTypeCode
	 * AccountPermissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RIAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightToUseAlone"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Right to use the account alone."</li>
	 * </ul>
	 */
	public static final AccountPermissionTypeCode RightToUseAlone = new AccountPermissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightToUseAlone";
			definition = "Right to use the account alone.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountPermissionTypeCode.mmObject();
			codeName = "RIAL";
		}
	};
	/**
	 * Right to use the account together with another person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccountPermissionTypeCode
	 * AccountPermissionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RIWI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightToUseWithOther"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Right to use the account together with another person."</li>
	 * </ul>
	 */
	public static final AccountPermissionTypeCode RightToUseWithOther = new AccountPermissionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightToUseWithOther";
			definition = "Right to use the account together with another person.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccountPermissionTypeCode.mmObject();
			codeName = "RIWI";
		}
	};
	final static private LinkedHashMap<String, AccountPermissionTypeCode> codesByName = new LinkedHashMap<>();

	protected AccountPermissionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountPermissionTypeCode";
				definition = "Specifies different levels of permission.";
				derivation_lazy = () -> Arrays.asList(AccountPermissionType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccountPermissionTypeCode.NoRight, com.tools20022.repository.codeset.AccountPermissionTypeCode.RightToUseAlone,
						com.tools20022.repository.codeset.AccountPermissionTypeCode.RightToUseWithOther);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoRight.getCodeName().get(), NoRight);
		codesByName.put(RightToUseAlone.getCodeName().get(), RightToUseAlone);
		codesByName.put(RightToUseWithOther.getCodeName().get(), RightToUseWithOther);
	}

	public static AccountPermissionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccountPermissionTypeCode[] values() {
		AccountPermissionTypeCode[] values = new AccountPermissionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccountPermissionTypeCode> {
		@Override
		public AccountPermissionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccountPermissionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}