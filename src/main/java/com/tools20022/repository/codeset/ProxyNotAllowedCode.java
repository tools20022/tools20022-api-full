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
import com.tools20022.repository.codeset.ProxyNotAllowedCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates that the assignment of a proxy is not allowed for the meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProxyNotAllowedCode#NotAllowed
 * ProxyNotAllowedCode.NotAllowed}</li>
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
 * <li>"NPRO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProxyNotAllowedCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates that the assignment of a proxy is not allowed for the meeting."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProxyNotAllowedCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Proxy not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyNotAllowedCode
	 * ProxyNotAllowedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPRO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proxy not allowed."</li>
	 * </ul>
	 */
	public static final ProxyNotAllowedCode NotAllowed = new ProxyNotAllowedCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NotAllowed";
			definition = "Proxy not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ProxyNotAllowedCode.mmObject();
			codeName = "NPRO";
		}
	};
	final static private LinkedHashMap<String, ProxyNotAllowedCode> codesByName = new LinkedHashMap<>();

	protected ProxyNotAllowedCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NPRO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProxyNotAllowedCode";
				definition = "Indicates that the assignment of a proxy is not allowed for the meeting.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProxyNotAllowedCode.NotAllowed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NotAllowed.getCodeName().get(), NotAllowed);
	}

	public static ProxyNotAllowedCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProxyNotAllowedCode[] values() {
		ProxyNotAllowedCode[] values = new ProxyNotAllowedCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProxyNotAllowedCode> {
		@Override
		public ProxyNotAllowedCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProxyNotAllowedCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}