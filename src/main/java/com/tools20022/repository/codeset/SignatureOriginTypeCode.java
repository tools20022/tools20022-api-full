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
import com.tools20022.repository.codeset.SignatureOriginTypeCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SignatureOriginTypeCode#Contract
 * SignatureOriginTypeCode.Contract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SignatureOriginTypeCode#Technical
 * SignatureOriginTypeCode.Technical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SignatureOriginTypeCode#Value
 * SignatureOriginTypeCode.Value}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SignatureOriginTypeCode#Bank
 * SignatureOriginTypeCode.Bank}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SignatureOriginType1Code
 * SignatureOriginType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SignatureOriginTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the origin of the signature."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SignatureOriginTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Signature is provided for the contract validation of the file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureOriginTypeCode
	 * SignatureOriginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTRC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Contract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Signature is provided for the contract validation of the file."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SignatureOriginTypeCode Contract = new SignatureOriginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contract";
			definition = "Signature is provided for the contract validation of the file.";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureOriginTypeCode.mmObject();
			codeName = "CTRC";
		}
	};
	/**
	 * Signature is provided for the technical validation of the file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureOriginTypeCode
	 * SignatureOriginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TECH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Technical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Signature is provided for the technical validation of the file."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SignatureOriginTypeCode Technical = new SignatureOriginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Technical";
			definition = "Signature is provided for the technical validation of the file.";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureOriginTypeCode.mmObject();
			codeName = "TECH";
		}
	};
	/**
	 * Signature is provided for the value validation of the file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureOriginTypeCode
	 * SignatureOriginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VLUE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Signature is provided for the value validation of the file."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SignatureOriginTypeCode Value = new SignatureOriginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Signature is provided for the value validation of the file.";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureOriginTypeCode.mmObject();
			codeName = "VLUE";
		}
	};
	/**
	 * Signature is provided for the bank validation of the file.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SignatureOriginTypeCode
	 * SignatureOriginTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BANK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Signature is provided for the bank validation of the file."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SignatureOriginTypeCode Bank = new SignatureOriginTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bank";
			definition = "Signature is provided for the bank validation of the file.";
			owner_lazy = () -> com.tools20022.repository.codeset.SignatureOriginTypeCode.mmObject();
			codeName = "BANK";
		}
	};
	final static private LinkedHashMap<String, SignatureOriginTypeCode> codesByName = new LinkedHashMap<>();

	protected SignatureOriginTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SignatureOriginTypeCode";
				definition = "Specifies the origin of the signature.";
				derivation_lazy = () -> Arrays.asList(SignatureOriginType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SignatureOriginTypeCode.Contract, com.tools20022.repository.codeset.SignatureOriginTypeCode.Technical,
						com.tools20022.repository.codeset.SignatureOriginTypeCode.Value, com.tools20022.repository.codeset.SignatureOriginTypeCode.Bank);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Contract.getCodeName().get(), Contract);
		codesByName.put(Technical.getCodeName().get(), Technical);
		codesByName.put(Value.getCodeName().get(), Value);
		codesByName.put(Bank.getCodeName().get(), Bank);
	}

	public static SignatureOriginTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SignatureOriginTypeCode[] values() {
		SignatureOriginTypeCode[] values = new SignatureOriginTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SignatureOriginTypeCode> {
		@Override
		public SignatureOriginTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SignatureOriginTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}