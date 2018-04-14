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
import com.tools20022.repository.codeset.InitialPhysicalFormCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the physical form of the securities.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InitialPhysicalFormCode#GT
 * InitialPhysicalFormCode.GT}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InitialPhysicalFormCode#GP
 * InitialPhysicalFormCode.GP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InitialPhysicalFormCode#Definitive
 * InitialPhysicalFormCode.Definitive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InitialPhysicalForm1Code
 * InitialPhysicalForm1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.InitialPhysicalForm2Code
 * InitialPhysicalForm2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InitialPhysicalFormCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the physical form of the securities."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"GTGT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InitialPhysicalFormCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Initial Physical Form is GT.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InitialPhysicalFormCode
	 * InitialPhysicalFormCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GTGT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial Physical Form is GT."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InitialPhysicalFormCode GT = new InitialPhysicalFormCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GT";
			definition = "Initial Physical Form is GT.";
			owner_lazy = () -> com.tools20022.repository.codeset.InitialPhysicalFormCode.mmObject();
			codeName = "GTGT";
		}
	};
	/**
	 * Initial Physical Form is GP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InitialPhysicalFormCode
	 * InitialPhysicalFormCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GPGP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial Physical Form is GP."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InitialPhysicalFormCode GP = new InitialPhysicalFormCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GP";
			definition = "Initial Physical Form is GP.";
			owner_lazy = () -> com.tools20022.repository.codeset.InitialPhysicalFormCode.mmObject();
			codeName = "GPGP";
		}
	};
	/**
	 * Initial Physical Form is definitive.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InitialPhysicalFormCode
	 * InitialPhysicalFormCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DERN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Definitive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initial Physical Form is definitive."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InitialPhysicalFormCode Definitive = new InitialPhysicalFormCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Definitive";
			definition = "Initial Physical Form is definitive.";
			owner_lazy = () -> com.tools20022.repository.codeset.InitialPhysicalFormCode.mmObject();
			codeName = "DERN";
		}
	};
	final static private LinkedHashMap<String, InitialPhysicalFormCode> codesByName = new LinkedHashMap<>();

	protected InitialPhysicalFormCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GTGT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InitialPhysicalFormCode";
				definition = "Indicates the physical form of the securities.";
				derivation_lazy = () -> Arrays.asList(InitialPhysicalForm1Code.mmObject(), InitialPhysicalForm2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InitialPhysicalFormCode.GT, com.tools20022.repository.codeset.InitialPhysicalFormCode.GP,
						com.tools20022.repository.codeset.InitialPhysicalFormCode.Definitive);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(GT.getCodeName().get(), GT);
		codesByName.put(GP.getCodeName().get(), GP);
		codesByName.put(Definitive.getCodeName().get(), Definitive);
	}

	public static InitialPhysicalFormCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InitialPhysicalFormCode[] values() {
		InitialPhysicalFormCode[] values = new InitialPhysicalFormCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InitialPhysicalFormCode> {
		@Override
		public InitialPhysicalFormCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InitialPhysicalFormCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}