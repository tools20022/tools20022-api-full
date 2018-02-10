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
import com.tools20022.repository.codeset.InitialPhysicalForm1Code.InternalXmlAdapter;
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
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InitialPhysicalForm1Code#GT
 * InitialPhysicalForm1Code.GT}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InitialPhysicalForm1Code#GP
 * InitialPhysicalForm1Code.GP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InitialPhysicalForm1Code#Definitive
 * InitialPhysicalForm1Code.Definitive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InitialPhysicalFormCode
 * InitialPhysicalFormCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InitialPhysicalForm1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the physical form of the securities."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InitialPhysicalForm1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InitialPhysicalForm1Code
	 * InitialPhysicalForm1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GT"</li>
	 * </ul>
	 */
	public static final InitialPhysicalForm1Code GT = new InitialPhysicalForm1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GT";
			owner_lazy = () -> com.tools20022.repository.codeset.InitialPhysicalForm1Code.mmObject();
			codeName = InitialPhysicalFormCode.GT.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InitialPhysicalForm1Code
	 * InitialPhysicalForm1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GP"</li>
	 * </ul>
	 */
	public static final InitialPhysicalForm1Code GP = new InitialPhysicalForm1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GP";
			owner_lazy = () -> com.tools20022.repository.codeset.InitialPhysicalForm1Code.mmObject();
			codeName = InitialPhysicalFormCode.GP.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InitialPhysicalForm1Code
	 * InitialPhysicalForm1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Definitive"</li>
	 * </ul>
	 */
	public static final InitialPhysicalForm1Code Definitive = new InitialPhysicalForm1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Definitive";
			owner_lazy = () -> com.tools20022.repository.codeset.InitialPhysicalForm1Code.mmObject();
			codeName = InitialPhysicalFormCode.Definitive.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InitialPhysicalForm1Code> codesByName = new LinkedHashMap<>();

	protected InitialPhysicalForm1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GTGT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InitialPhysicalForm1Code";
				definition = "Indicates the physical form of the securities.";
				trace_lazy = () -> InitialPhysicalFormCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InitialPhysicalForm1Code.GT, com.tools20022.repository.codeset.InitialPhysicalForm1Code.GP,
						com.tools20022.repository.codeset.InitialPhysicalForm1Code.Definitive);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(GT.getCodeName().get(), GT);
		codesByName.put(GP.getCodeName().get(), GP);
		codesByName.put(Definitive.getCodeName().get(), Definitive);
	}

	public static InitialPhysicalForm1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InitialPhysicalForm1Code[] values() {
		InitialPhysicalForm1Code[] values = new InitialPhysicalForm1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InitialPhysicalForm1Code> {
		@Override
		public InitialPhysicalForm1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InitialPhysicalForm1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}