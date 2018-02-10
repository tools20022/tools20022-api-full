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
import com.tools20022.repository.codeset.CivilStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the civil status of a person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CivilStatus1Code#Divorced
 * CivilStatus1Code.Divorced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CivilStatus1Code#LegallyDivorced
 * CivilStatus1Code.LegallyDivorced}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CivilStatus1Code#Married
 * CivilStatus1Code.Married}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CivilStatus1Code#Separated
 * CivilStatus1Code.Separated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CivilStatus1Code#Single
 * CivilStatus1Code.Single}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CivilStatus1Code#StableUnion
 * CivilStatus1Code.StableUnion}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CivilStatus1Code#Widow
 * CivilStatus1Code.Widow}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CivilStatusCode
 * CivilStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CivilStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the civil status of a person."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CivilStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatus1Code
	 * CivilStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Divorced"</li>
	 * </ul>
	 */
	public static final CivilStatus1Code Divorced = new CivilStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Divorced";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatus1Code.mmObject();
			codeName = CivilStatusCode.Divorced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatus1Code
	 * CivilStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegallyDivorced"</li>
	 * </ul>
	 */
	public static final CivilStatus1Code LegallyDivorced = new CivilStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegallyDivorced";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatus1Code.mmObject();
			codeName = CivilStatusCode.LegallyDivorced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatus1Code
	 * CivilStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Married"</li>
	 * </ul>
	 */
	public static final CivilStatus1Code Married = new CivilStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Married";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatus1Code.mmObject();
			codeName = CivilStatusCode.Married.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatus1Code
	 * CivilStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Separated"</li>
	 * </ul>
	 */
	public static final CivilStatus1Code Separated = new CivilStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Separated";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatus1Code.mmObject();
			codeName = CivilStatusCode.Separated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatus1Code
	 * CivilStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Single"</li>
	 * </ul>
	 */
	public static final CivilStatus1Code Single = new CivilStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Single";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatus1Code.mmObject();
			codeName = CivilStatusCode.Single.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatus1Code
	 * CivilStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StableUnion"</li>
	 * </ul>
	 */
	public static final CivilStatus1Code StableUnion = new CivilStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StableUnion";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatus1Code.mmObject();
			codeName = CivilStatusCode.StableUnion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CivilStatus1Code
	 * CivilStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Widow"</li>
	 * </ul>
	 */
	public static final CivilStatus1Code Widow = new CivilStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Widow";
			owner_lazy = () -> com.tools20022.repository.codeset.CivilStatus1Code.mmObject();
			codeName = CivilStatusCode.Widow.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CivilStatus1Code> codesByName = new LinkedHashMap<>();

	protected CivilStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CivilStatus1Code";
				definition = "Specifies the civil status of a person.";
				trace_lazy = () -> CivilStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CivilStatus1Code.Divorced, com.tools20022.repository.codeset.CivilStatus1Code.LegallyDivorced, com.tools20022.repository.codeset.CivilStatus1Code.Married,
						com.tools20022.repository.codeset.CivilStatus1Code.Separated, com.tools20022.repository.codeset.CivilStatus1Code.Single, com.tools20022.repository.codeset.CivilStatus1Code.StableUnion,
						com.tools20022.repository.codeset.CivilStatus1Code.Widow);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Divorced.getCodeName().get(), Divorced);
		codesByName.put(LegallyDivorced.getCodeName().get(), LegallyDivorced);
		codesByName.put(Married.getCodeName().get(), Married);
		codesByName.put(Separated.getCodeName().get(), Separated);
		codesByName.put(Single.getCodeName().get(), Single);
		codesByName.put(StableUnion.getCodeName().get(), StableUnion);
		codesByName.put(Widow.getCodeName().get(), Widow);
	}

	public static CivilStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CivilStatus1Code[] values() {
		CivilStatus1Code[] values = new CivilStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CivilStatus1Code> {
		@Override
		public CivilStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CivilStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}