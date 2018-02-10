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
import com.tools20022.repository.codeset.SenderBusinessRoleCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether account owner or account servicer sends the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SenderBusinessRoleCode#AccountOwner
 * SenderBusinessRoleCode.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SenderBusinessRoleCode#AccountServicer
 * SenderBusinessRoleCode.AccountServicer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SenderBusinessRole1Code
 * SenderBusinessRole1Code}</li>
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
 * "SenderBusinessRoleCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether account owner or account servicer sends the message."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SenderBusinessRoleCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Sender is the owner of the safekeeping account. The sender is disclosing
	 * the breakdown of the underlying owners of sender’s holdings with the
	 * receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SenderBusinessRoleCode
	 * SenderBusinessRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AOWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sender is the owner of the safekeeping account. The sender is disclosing the breakdown of the underlying owners of sender’s holdings with the receiver."
	 * </li>
	 * </ul>
	 */
	public static final SenderBusinessRoleCode AccountOwner = new SenderBusinessRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Sender is the owner of the safekeeping account. The sender is disclosing the breakdown of the underlying owners of sender’s holdings with the receiver.";
			owner_lazy = () -> com.tools20022.repository.codeset.SenderBusinessRoleCode.mmObject();
			codeName = "AOWN";
		}
	};
	/**
	 * Sender is the account servicer of an account owned by the receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SenderBusinessRoleCode
	 * SenderBusinessRoleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sender is the account servicer of an account owned by the receiver."</li>
	 * </ul>
	 */
	public static final SenderBusinessRoleCode AccountServicer = new SenderBusinessRoleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			definition = "Sender is the account servicer of an account owned by the receiver.";
			owner_lazy = () -> com.tools20022.repository.codeset.SenderBusinessRoleCode.mmObject();
			codeName = "ASER";
		}
	};
	final static private LinkedHashMap<String, SenderBusinessRoleCode> codesByName = new LinkedHashMap<>();

	protected SenderBusinessRoleCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SenderBusinessRoleCode";
				definition = "Specifies whether account owner or account servicer sends the message.";
				derivation_lazy = () -> Arrays.asList(SenderBusinessRole1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SenderBusinessRoleCode.AccountOwner, com.tools20022.repository.codeset.SenderBusinessRoleCode.AccountServicer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountOwner.getCodeName().get(), AccountOwner);
		codesByName.put(AccountServicer.getCodeName().get(), AccountServicer);
	}

	public static SenderBusinessRoleCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SenderBusinessRoleCode[] values() {
		SenderBusinessRoleCode[] values = new SenderBusinessRoleCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SenderBusinessRoleCode> {
		@Override
		public SenderBusinessRoleCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SenderBusinessRoleCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}