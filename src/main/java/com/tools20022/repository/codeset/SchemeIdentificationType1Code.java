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
import com.tools20022.repository.codeset.SchemeIdentificationType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Domain of an identifier.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationType1Code#MarginAccount
 * SchemeIdentificationType1Code.MarginAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationType1Code#CollateralAccount
 * SchemeIdentificationType1Code.CollateralAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationType1Code#PositionAccount
 * SchemeIdentificationType1Code.PositionAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationType1Code#ClearingMemberAccount
 * SchemeIdentificationType1Code.ClearingMemberAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationTypeCode
 * SchemeIdentificationTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SchemeIdentificationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Domain of an identifier."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SchemeIdentificationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationType1Code
	 * SchemeIdentificationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SchemeIdentificationType1Code MarginAccount = new SchemeIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.SchemeIdentificationType1Code.mmObject();
			codeName = SchemeIdentificationTypeCode.MarginAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationType1Code
	 * SchemeIdentificationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SchemeIdentificationType1Code CollateralAccount = new SchemeIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.SchemeIdentificationType1Code.mmObject();
			codeName = SchemeIdentificationTypeCode.CollateralAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationType1Code
	 * SchemeIdentificationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SchemeIdentificationType1Code PositionAccount = new SchemeIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.SchemeIdentificationType1Code.mmObject();
			codeName = SchemeIdentificationTypeCode.PositionAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SchemeIdentificationType1Code
	 * SchemeIdentificationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMemberAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SchemeIdentificationType1Code ClearingMemberAccount = new SchemeIdentificationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMemberAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.SchemeIdentificationType1Code.mmObject();
			codeName = SchemeIdentificationTypeCode.ClearingMemberAccount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SchemeIdentificationType1Code> codesByName = new LinkedHashMap<>();

	protected SchemeIdentificationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SchemeIdentificationType1Code";
				definition = "Domain of an identifier.";
				trace_lazy = () -> SchemeIdentificationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SchemeIdentificationType1Code.MarginAccount, com.tools20022.repository.codeset.SchemeIdentificationType1Code.CollateralAccount,
						com.tools20022.repository.codeset.SchemeIdentificationType1Code.PositionAccount, com.tools20022.repository.codeset.SchemeIdentificationType1Code.ClearingMemberAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MarginAccount.getCodeName().get(), MarginAccount);
		codesByName.put(CollateralAccount.getCodeName().get(), CollateralAccount);
		codesByName.put(PositionAccount.getCodeName().get(), PositionAccount);
		codesByName.put(ClearingMemberAccount.getCodeName().get(), ClearingMemberAccount);
	}

	public static SchemeIdentificationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SchemeIdentificationType1Code[] values() {
		SchemeIdentificationType1Code[] values = new SchemeIdentificationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SchemeIdentificationType1Code> {
		@Override
		public SchemeIdentificationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SchemeIdentificationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}