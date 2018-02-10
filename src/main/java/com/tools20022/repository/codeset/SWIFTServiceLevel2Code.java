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
import com.tools20022.repository.codeset.SWIFTServiceLevel2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Code identifying which SWIFT service level applies to the payment
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevel2Code#SWIFTPay
 * SWIFTServiceLevel2Code.SWIFTPay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevel2Code#Standard
 * SWIFTServiceLevel2Code.Standard}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevelCode
 * SWIFTServiceLevelCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SPAY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SWIFTServiceLevel2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Code identifying which SWIFT service level applies to the payment instruction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SWIFTServiceLevel2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevel2Code
	 * SWIFTServiceLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SWIFTPay"</li>
	 * </ul>
	 */
	public static final SWIFTServiceLevel2Code SWIFTPay = new SWIFTServiceLevel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SWIFTPay";
			owner_lazy = () -> com.tools20022.repository.codeset.SWIFTServiceLevel2Code.mmObject();
			codeName = SWIFTServiceLevelCode.SWIFTPay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SWIFTServiceLevel2Code
	 * SWIFTServiceLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standard"</li>
	 * </ul>
	 */
	public static final SWIFTServiceLevel2Code Standard = new SWIFTServiceLevel2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standard";
			owner_lazy = () -> com.tools20022.repository.codeset.SWIFTServiceLevel2Code.mmObject();
			codeName = SWIFTServiceLevelCode.Standard.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SWIFTServiceLevel2Code> codesByName = new LinkedHashMap<>();

	protected SWIFTServiceLevel2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SPAY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SWIFTServiceLevel2Code";
				definition = "Code identifying which SWIFT service level applies to the payment instruction.";
				trace_lazy = () -> SWIFTServiceLevelCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SWIFTServiceLevel2Code.SWIFTPay, com.tools20022.repository.codeset.SWIFTServiceLevel2Code.Standard);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SWIFTPay.getCodeName().get(), SWIFTPay);
		codesByName.put(Standard.getCodeName().get(), Standard);
	}

	public static SWIFTServiceLevel2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SWIFTServiceLevel2Code[] values() {
		SWIFTServiceLevel2Code[] values = new SWIFTServiceLevel2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SWIFTServiceLevel2Code> {
		@Override
		public SWIFTServiceLevel2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SWIFTServiceLevel2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}