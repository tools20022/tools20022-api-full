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
import com.tools20022.repository.codeset.PreConfirmation1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies if there is a pre-confirmation of cash or securities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreConfirmation1Code#PreConfirmCash
 * PreConfirmation1Code.PreConfirmCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PreConfirmation1Code#PreConfirmSecurities
 * PreConfirmation1Code.PreConfirmSecurities}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PreConfirmationCode
 * PreConfirmationCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PRCA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PreConfirmation1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies if there is a pre-confirmation of cash or securities."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PreConfirmation1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreConfirmation1Code
	 * PreConfirmation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreConfirmCash"</li>
	 * </ul>
	 */
	public static final PreConfirmation1Code PreConfirmCash = new PreConfirmation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreConfirmCash";
			owner_lazy = () -> com.tools20022.repository.codeset.PreConfirmation1Code.mmObject();
			codeName = PreConfirmationCode.PreConfirmCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PreConfirmation1Code
	 * PreConfirmation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreConfirmSecurities"</li>
	 * </ul>
	 */
	public static final PreConfirmation1Code PreConfirmSecurities = new PreConfirmation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreConfirmSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PreConfirmation1Code.mmObject();
			codeName = PreConfirmationCode.PreConfirmSecurities.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PreConfirmation1Code> codesByName = new LinkedHashMap<>();

	protected PreConfirmation1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PRCA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PreConfirmation1Code";
				definition = "Specifies if there is a pre-confirmation of cash or securities.";
				trace_lazy = () -> PreConfirmationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PreConfirmation1Code.PreConfirmCash, com.tools20022.repository.codeset.PreConfirmation1Code.PreConfirmSecurities);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PreConfirmCash.getCodeName().get(), PreConfirmCash);
		codesByName.put(PreConfirmSecurities.getCodeName().get(), PreConfirmSecurities);
	}

	public static PreConfirmation1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PreConfirmation1Code[] values() {
		PreConfirmation1Code[] values = new PreConfirmation1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PreConfirmation1Code> {
		@Override
		public PreConfirmation1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PreConfirmation1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}