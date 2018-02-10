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
import com.tools20022.repository.codeset.SignatureOriginType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the origin of the signature.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SignatureOriginType1Code#Value
 * SignatureOriginType1Code.Value}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SignatureOriginType1Code#Technical
 * SignatureOriginType1Code.Technical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SignatureOriginType1Code#Contract
 * SignatureOriginType1Code.Contract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SignatureOriginType1Code#Bank
 * SignatureOriginType1Code.Bank}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SignatureOriginTypeCode
 * SignatureOriginTypeCode}</li>
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
 * "SignatureOriginType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the origin of the signature."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SignatureOriginType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureOriginType1Code
	 * SignatureOriginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * </ul>
	 */
	public static final SignatureOriginType1Code Value = new SignatureOriginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureOriginType1Code.mmObject();
			codeName = SignatureOriginTypeCode.Value.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureOriginType1Code
	 * SignatureOriginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Technical"</li>
	 * </ul>
	 */
	public static final SignatureOriginType1Code Technical = new SignatureOriginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Technical";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureOriginType1Code.mmObject();
			codeName = SignatureOriginTypeCode.Technical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureOriginType1Code
	 * SignatureOriginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Contract"</li>
	 * </ul>
	 */
	public static final SignatureOriginType1Code Contract = new SignatureOriginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contract";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureOriginType1Code.mmObject();
			codeName = SignatureOriginTypeCode.Contract.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureOriginType1Code
	 * SignatureOriginType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bank"</li>
	 * </ul>
	 */
	public static final SignatureOriginType1Code Bank = new SignatureOriginType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bank";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureOriginType1Code.mmObject();
			codeName = SignatureOriginTypeCode.Bank.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SignatureOriginType1Code> codesByName = new LinkedHashMap<>();

	protected SignatureOriginType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SignatureOriginType1Code";
				definition = "Specifies the origin of the signature.";
				trace_lazy = () -> SignatureOriginTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SignatureOriginType1Code.Value, com.tools20022.repository.codeset.SignatureOriginType1Code.Technical,
						com.tools20022.repository.codeset.SignatureOriginType1Code.Contract, com.tools20022.repository.codeset.SignatureOriginType1Code.Bank);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Value.getCodeName().get(), Value);
		codesByName.put(Technical.getCodeName().get(), Technical);
		codesByName.put(Contract.getCodeName().get(), Contract);
		codesByName.put(Bank.getCodeName().get(), Bank);
	}

	public static SignatureOriginType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SignatureOriginType1Code[] values() {
		SignatureOriginType1Code[] values = new SignatureOriginType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SignatureOriginType1Code> {
		@Override
		public SignatureOriginType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SignatureOriginType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}