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
import com.tools20022.repository.codeset.OptionRightCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.OptionRightCode#Exercise
 * OptionRightCode.Exercise}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionRightCode#Assignment
 * OptionRightCode.Assignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionRightCode#Renouncement
 * OptionRightCode.Renouncement}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionRightCode#Expiration
 * OptionRightCode.Expiration}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionRight1Code
 * OptionRight1Code}</li>
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
 * <li>"EXER"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionRightCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the option rights."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionRightCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Exercise option right.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionRightCode
	 * OptionRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exercise"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exercise option right."</li>
	 * </ul>
	 */
	public static final OptionRightCode Exercise = new OptionRightCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exercise";
			definition = "Exercise option right.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionRightCode.mmObject();
			codeName = "EXER";
		}
	};
	/**
	 * Option right assignment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionRightCode
	 * OptionRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option right assignment."</li>
	 * </ul>
	 */
	public static final OptionRightCode Assignment = new OptionRightCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Option right assignment.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionRightCode.mmObject();
			codeName = "ASGN";
		}
	};
	/**
	 * The option right is renounced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionRightCode
	 * OptionRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RENO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Renouncement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The option right is renounced."</li>
	 * </ul>
	 */
	public static final OptionRightCode Renouncement = new OptionRightCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Renouncement";
			definition = "The option right is renounced.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionRightCode.mmObject();
			codeName = "RENO";
		}
	};
	/**
	 * Option right expires.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionRightCode
	 * OptionRightCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expiration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option right expires."</li>
	 * </ul>
	 */
	public static final OptionRightCode Expiration = new OptionRightCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expiration";
			definition = "Option right expires.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionRightCode.mmObject();
			codeName = "EXPI";
		}
	};
	final static private LinkedHashMap<String, OptionRightCode> codesByName = new LinkedHashMap<>();

	protected OptionRightCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EXER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionRightCode";
				definition = "Specifies the option rights.";
				derivation_lazy = () -> Arrays.asList(OptionRight1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionRightCode.Exercise, com.tools20022.repository.codeset.OptionRightCode.Assignment, com.tools20022.repository.codeset.OptionRightCode.Renouncement,
						com.tools20022.repository.codeset.OptionRightCode.Expiration);
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

	public static OptionRightCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionRightCode[] values() {
		OptionRightCode[] values = new OptionRightCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionRightCode> {
		@Override
		public OptionRightCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionRightCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}