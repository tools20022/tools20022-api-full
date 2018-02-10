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
import com.tools20022.repository.codeset.SenderBusinessRole1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether an account owner or account servicer sends the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SenderBusinessRole1Code#AccountOwner
 * SenderBusinessRole1Code.AccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SenderBusinessRole1Code#AccountServicer
 * SenderBusinessRole1Code.AccountServicer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SenderBusinessRoleCode
 * SenderBusinessRoleCode}</li>
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
 * "SenderBusinessRole1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether an account owner or account servicer sends the message."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SenderBusinessRole1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SenderBusinessRole1Code
	 * SenderBusinessRole1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * </ul>
	 */
	public static final SenderBusinessRole1Code AccountOwner = new SenderBusinessRole1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			owner_lazy = () -> com.tools20022.repository.codeset.SenderBusinessRole1Code.mmObject();
			codeName = SenderBusinessRoleCode.AccountOwner.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SenderBusinessRole1Code
	 * SenderBusinessRole1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicer"</li>
	 * </ul>
	 */
	public static final SenderBusinessRole1Code AccountServicer = new SenderBusinessRole1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicer";
			owner_lazy = () -> com.tools20022.repository.codeset.SenderBusinessRole1Code.mmObject();
			codeName = SenderBusinessRoleCode.AccountServicer.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SenderBusinessRole1Code> codesByName = new LinkedHashMap<>();

	protected SenderBusinessRole1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SenderBusinessRole1Code";
				definition = "Specifies whether an account owner or account servicer sends the message.";
				trace_lazy = () -> SenderBusinessRoleCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SenderBusinessRole1Code.AccountOwner, com.tools20022.repository.codeset.SenderBusinessRole1Code.AccountServicer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountOwner.getCodeName().get(), AccountOwner);
		codesByName.put(AccountServicer.getCodeName().get(), AccountServicer);
	}

	public static SenderBusinessRole1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SenderBusinessRole1Code[] values() {
		SenderBusinessRole1Code[] values = new SenderBusinessRole1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SenderBusinessRole1Code> {
		@Override
		public SenderBusinessRole1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SenderBusinessRole1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}