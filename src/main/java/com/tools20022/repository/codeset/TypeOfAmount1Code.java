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
import com.tools20022.repository.codeset.TypeOfAmount1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Qualifies the amount associated with the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code#Actual
 * TypeOfAmount1Code.Actual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code#Estimated
 * TypeOfAmount1Code.Estimated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code#Maximum
 * TypeOfAmount1Code.Maximum}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code#Default
 * TypeOfAmount1Code.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code#Replacement
 * TypeOfAmount1Code.Replacement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmountCode
 * TypeOfAmountCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TypeOfAmount1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Qualifies the amount associated with the transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACTL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code
 * TypeOfAmount8Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfAmount1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code
	 * TypeOfAmount1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code#Actual
	 * TypeOfAmount8Code.Actual}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TypeOfAmount1Code Actual = new TypeOfAmount1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual";
			nextVersions_lazy = () -> Arrays.asList(TypeOfAmount8Code.Actual);
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount1Code.mmObject();
			codeName = TypeOfAmountCode.Actual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code
	 * TypeOfAmount1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Estimated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code#Estimated
	 * TypeOfAmount8Code.Estimated}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TypeOfAmount1Code Estimated = new TypeOfAmount1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Estimated";
			nextVersions_lazy = () -> Arrays.asList(TypeOfAmount8Code.Estimated);
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount1Code.mmObject();
			codeName = TypeOfAmountCode.Estimated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code
	 * TypeOfAmount1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Maximum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code#Maximum
	 * TypeOfAmount8Code.Maximum}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TypeOfAmount1Code Maximum = new TypeOfAmount1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Maximum";
			nextVersions_lazy = () -> Arrays.asList(TypeOfAmount8Code.Maximum);
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount1Code.mmObject();
			codeName = TypeOfAmountCode.Maximum.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code
	 * TypeOfAmount1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code#Default
	 * TypeOfAmount8Code.Default}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TypeOfAmount1Code Default = new TypeOfAmount1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			nextVersions_lazy = () -> Arrays.asList(TypeOfAmount8Code.Default);
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount1Code.mmObject();
			codeName = TypeOfAmountCode.Default.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code
	 * TypeOfAmount1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code#Replacement
	 * TypeOfAmount8Code.Replacement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TypeOfAmount1Code Replacement = new TypeOfAmount1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Replacement";
			nextVersions_lazy = () -> Arrays.asList(TypeOfAmount8Code.Replacement);
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount1Code.mmObject();
			codeName = TypeOfAmountCode.Replacement.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeOfAmount1Code> codesByName = new LinkedHashMap<>();

	protected TypeOfAmount1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfAmount1Code";
				definition = "Qualifies the amount associated with the transaction.";
				nextVersions_lazy = () -> Arrays.asList(TypeOfAmount8Code.mmObject());
				trace_lazy = () -> TypeOfAmountCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfAmount1Code.Actual, com.tools20022.repository.codeset.TypeOfAmount1Code.Estimated, com.tools20022.repository.codeset.TypeOfAmount1Code.Maximum,
						com.tools20022.repository.codeset.TypeOfAmount1Code.Default, com.tools20022.repository.codeset.TypeOfAmount1Code.Replacement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Actual.getCodeName().get(), Actual);
		codesByName.put(Estimated.getCodeName().get(), Estimated);
		codesByName.put(Maximum.getCodeName().get(), Maximum);
		codesByName.put(Default.getCodeName().get(), Default);
		codesByName.put(Replacement.getCodeName().get(), Replacement);
	}

	public static TypeOfAmount1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfAmount1Code[] values() {
		TypeOfAmount1Code[] values = new TypeOfAmount1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfAmount1Code> {
		@Override
		public TypeOfAmount1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfAmount1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}