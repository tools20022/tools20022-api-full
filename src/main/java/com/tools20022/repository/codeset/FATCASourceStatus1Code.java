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
import com.tools20022.repository.codeset.FATCASourceStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the source of Foreign Account Tax Compliance Act (FATCA) status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCASourceStatus1Code#Calculated
 * FATCASourceStatus1Code.Calculated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FATCASourceStatus1Code#Declared
 * FATCASourceStatus1Code.Declared}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FATCASourceStatusCode
 * FATCASourceStatusCode}</li>
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
 * "FATCASourceStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the source of Foreign Account Tax Compliance Act (FATCA) status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FATCASourceStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCASourceStatus1Code
	 * FATCASourceStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Calculated"</li>
	 * </ul>
	 */
	public static final FATCASourceStatus1Code Calculated = new FATCASourceStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Calculated";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCASourceStatus1Code.mmObject();
			codeName = FATCASourceStatusCode.Calculated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FATCASourceStatus1Code
	 * FATCASourceStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Declared"</li>
	 * </ul>
	 */
	public static final FATCASourceStatus1Code Declared = new FATCASourceStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Declared";
			owner_lazy = () -> com.tools20022.repository.codeset.FATCASourceStatus1Code.mmObject();
			codeName = FATCASourceStatusCode.Declared.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FATCASourceStatus1Code> codesByName = new LinkedHashMap<>();

	protected FATCASourceStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FATCASourceStatus1Code";
				definition = "Specifies the source of Foreign Account Tax Compliance Act (FATCA) status.";
				trace_lazy = () -> FATCASourceStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FATCASourceStatus1Code.Calculated, com.tools20022.repository.codeset.FATCASourceStatus1Code.Declared);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Calculated.getCodeName().get(), Calculated);
		codesByName.put(Declared.getCodeName().get(), Declared);
	}

	public static FATCASourceStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FATCASourceStatus1Code[] values() {
		FATCASourceStatus1Code[] values = new FATCASourceStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FATCASourceStatus1Code> {
		@Override
		public FATCASourceStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FATCASourceStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}