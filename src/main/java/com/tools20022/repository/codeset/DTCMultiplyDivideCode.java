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
import com.tools20022.repository.codeset.DTCMultiplyDivideCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCMultiplyDivideCode#Multiply
 * DTCMultiplyDivideCode.Multiply}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCMultiplyDivideCode#Divide
 * DTCMultiplyDivideCode.Divide}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCMultiplyDivide1Code
 * DTCMultiplyDivide1Code}</li>
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
 * <li>"MULT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCMultiplyDivideCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTC (The Depository Trust Company) entitlement calculation logic."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCMultiplyDivideCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Positions multiplied by rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCMultiplyDivideCode
	 * DTCMultiplyDivideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MULT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Multiply"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Positions multiplied by rate. "</li>
	 * </ul>
	 */
	public static final DTCMultiplyDivideCode Multiply = new DTCMultiplyDivideCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Multiply";
			definition = "Positions multiplied by rate. ";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCMultiplyDivideCode.mmObject();
			codeName = "MULT";
		}
	};
	/**
	 * Positions divided by rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCMultiplyDivideCode
	 * DTCMultiplyDivideCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Divide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Positions divided by rate."</li>
	 * </ul>
	 */
	public static final DTCMultiplyDivideCode Divide = new DTCMultiplyDivideCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Divide";
			definition = "Positions divided by rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCMultiplyDivideCode.mmObject();
			codeName = "DVDE";
		}
	};
	final static private LinkedHashMap<String, DTCMultiplyDivideCode> codesByName = new LinkedHashMap<>();

	protected DTCMultiplyDivideCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MULT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCMultiplyDivideCode";
				definition = "Specifies DTC (The Depository Trust Company) entitlement calculation logic.";
				derivation_lazy = () -> Arrays.asList(DTCMultiplyDivide1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCMultiplyDivideCode.Multiply, com.tools20022.repository.codeset.DTCMultiplyDivideCode.Divide);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Multiply.getCodeName().get(), Multiply);
		codesByName.put(Divide.getCodeName().get(), Divide);
	}

	public static DTCMultiplyDivideCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCMultiplyDivideCode[] values() {
		DTCMultiplyDivideCode[] values = new DTCMultiplyDivideCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCMultiplyDivideCode> {
		@Override
		public DTCMultiplyDivideCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCMultiplyDivideCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}