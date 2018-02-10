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
import com.tools20022.repository.codeset.DTCMultiplyDivide1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTC (The Depository Trust Company) entitlement calculation logic.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCMultiplyDivide1Code#Multiply
 * DTCMultiplyDivide1Code.Multiply}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCMultiplyDivide1Code#Divide
 * DTCMultiplyDivide1Code.Divide}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCMultiplyDivideCode
 * DTCMultiplyDivideCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MULT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCMultiplyDivide1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTC (The Depository Trust Company) entitlement calculation logic."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCMultiplyDivide1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCMultiplyDivide1Code
	 * DTCMultiplyDivide1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Multiply"</li>
	 * </ul>
	 */
	public static final DTCMultiplyDivide1Code Multiply = new DTCMultiplyDivide1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Multiply";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCMultiplyDivide1Code.mmObject();
			codeName = DTCMultiplyDivideCode.Multiply.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCMultiplyDivide1Code
	 * DTCMultiplyDivide1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Divide"</li>
	 * </ul>
	 */
	public static final DTCMultiplyDivide1Code Divide = new DTCMultiplyDivide1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Divide";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCMultiplyDivide1Code.mmObject();
			codeName = DTCMultiplyDivideCode.Divide.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCMultiplyDivide1Code> codesByName = new LinkedHashMap<>();

	protected DTCMultiplyDivide1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MULT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCMultiplyDivide1Code";
				definition = "Specifies DTC (The Depository Trust Company) entitlement calculation logic.";
				trace_lazy = () -> DTCMultiplyDivideCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCMultiplyDivide1Code.Multiply, com.tools20022.repository.codeset.DTCMultiplyDivide1Code.Divide);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Multiply.getCodeName().get(), Multiply);
		codesByName.put(Divide.getCodeName().get(), Divide);
	}

	public static DTCMultiplyDivide1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCMultiplyDivide1Code[] values() {
		DTCMultiplyDivide1Code[] values = new DTCMultiplyDivide1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCMultiplyDivide1Code> {
		@Override
		public DTCMultiplyDivide1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCMultiplyDivide1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}