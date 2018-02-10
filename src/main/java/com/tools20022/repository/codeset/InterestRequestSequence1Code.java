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
import com.tools20022.repository.codeset.InterestRequestSequence1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether the interest request is new or updated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestRequestSequence1Code#Initial
 * InterestRequestSequence1Code.Initial}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InterestRequestSequence1Code#Updated
 * InterestRequestSequence1Code.Updated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InterestRequestSequenceCode
 * InterestRequestSequenceCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"INIT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestRequestSequence1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates whether the interest request is new or updated."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InterestRequestSequence1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRequestSequence1Code
	 * InterestRequestSequence1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Initial"</li>
	 * </ul>
	 */
	public static final InterestRequestSequence1Code Initial = new InterestRequestSequence1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Initial";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestRequestSequence1Code.mmObject();
			codeName = InterestRequestSequenceCode.Initial.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRequestSequence1Code
	 * InterestRequestSequence1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Updated"</li>
	 * </ul>
	 */
	public static final InterestRequestSequence1Code Updated = new InterestRequestSequence1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Updated";
			owner_lazy = () -> com.tools20022.repository.codeset.InterestRequestSequence1Code.mmObject();
			codeName = InterestRequestSequenceCode.Updated.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InterestRequestSequence1Code> codesByName = new LinkedHashMap<>();

	protected InterestRequestSequence1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("INIT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestRequestSequence1Code";
				definition = "Indicates whether the interest request is new or updated.";
				trace_lazy = () -> InterestRequestSequenceCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InterestRequestSequence1Code.Initial, com.tools20022.repository.codeset.InterestRequestSequence1Code.Updated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Initial.getCodeName().get(), Initial);
		codesByName.put(Updated.getCodeName().get(), Updated);
	}

	public static InterestRequestSequence1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InterestRequestSequence1Code[] values() {
		InterestRequestSequence1Code[] values = new InterestRequestSequence1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InterestRequestSequence1Code> {
		@Override
		public InterestRequestSequence1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InterestRequestSequence1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}