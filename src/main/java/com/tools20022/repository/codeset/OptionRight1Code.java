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
import com.tools20022.repository.codeset.OptionRight1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the option rights.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionRight1Code#Exercise
 * OptionRight1Code.Exercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionRight1Code#Assignment
 * OptionRight1Code.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionRight1Code#Renouncement
 * OptionRight1Code.Renouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionRight1Code#Expiration
 * OptionRight1Code.Expiration}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OptionRightCode
 * OptionRightCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EXER"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionRight1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the option rights."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionRight1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionRight1Code
	 * OptionRight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercise"</li>
	 * </ul>
	 */
	public static final OptionRight1Code Exercise = new OptionRight1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exercise";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionRight1Code.mmObject();
			codeName = OptionRightCode.Exercise.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionRight1Code
	 * OptionRight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * </ul>
	 */
	public static final OptionRight1Code Assignment = new OptionRight1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionRight1Code.mmObject();
			codeName = OptionRightCode.Assignment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionRight1Code
	 * OptionRight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Renouncement"</li>
	 * </ul>
	 */
	public static final OptionRight1Code Renouncement = new OptionRight1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Renouncement";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionRight1Code.mmObject();
			codeName = OptionRightCode.Renouncement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionRight1Code
	 * OptionRight1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expiration"</li>
	 * </ul>
	 */
	public static final OptionRight1Code Expiration = new OptionRight1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expiration";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionRight1Code.mmObject();
			codeName = OptionRightCode.Expiration.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OptionRight1Code> codesByName = new LinkedHashMap<>();

	protected OptionRight1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EXER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionRight1Code";
				definition = "Specifies the option rights.";
				trace_lazy = () -> OptionRightCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionRight1Code.Exercise, com.tools20022.repository.codeset.OptionRight1Code.Assignment, com.tools20022.repository.codeset.OptionRight1Code.Renouncement,
						com.tools20022.repository.codeset.OptionRight1Code.Expiration);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Exercise.getCodeName().get(), Exercise);
		codesByName.put(Assignment.getCodeName().get(), Assignment);
		codesByName.put(Renouncement.getCodeName().get(), Renouncement);
		codesByName.put(Expiration.getCodeName().get(), Expiration);
	}

	public static OptionRight1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionRight1Code[] values() {
		OptionRight1Code[] values = new OptionRight1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionRight1Code> {
		@Override
		public OptionRight1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionRight1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}