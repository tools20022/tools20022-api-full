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
import com.tools20022.repository.codeset.TypeOfAmount8Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code#Actual
 * TypeOfAmount8Code.Actual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code#Estimated
 * TypeOfAmount8Code.Estimated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code#Maximum
 * TypeOfAmount8Code.Maximum}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code#Default
 * TypeOfAmount8Code.Default}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code#Replacement
 * TypeOfAmount8Code.Replacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code#Incremental
 * TypeOfAmount8Code.Incremental}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code#Decremental
 * TypeOfAmount8Code.Decremental}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code#Reserved
 * TypeOfAmount8Code.Reserved}</li>
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
 * "TypeOfAmount8Code"</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code
 * TypeOfAmount1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TypeOfAmount8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code
	 * TypeOfAmount8Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code#Actual
	 * TypeOfAmount1Code.Actual}</li>
	 * </ul>
	 */
	public static final TypeOfAmount8Code Actual = new TypeOfAmount8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual";
			previousVersion_lazy = () -> TypeOfAmount1Code.Actual;
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount8Code.mmObject();
			codeName = TypeOfAmountCode.Actual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code
	 * TypeOfAmount8Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Estimated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code#Estimated
	 * TypeOfAmount1Code.Estimated}</li>
	 * </ul>
	 */
	public static final TypeOfAmount8Code Estimated = new TypeOfAmount8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Estimated";
			previousVersion_lazy = () -> TypeOfAmount1Code.Estimated;
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount8Code.mmObject();
			codeName = TypeOfAmountCode.Estimated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code
	 * TypeOfAmount8Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Maximum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code#Maximum
	 * TypeOfAmount1Code.Maximum}</li>
	 * </ul>
	 */
	public static final TypeOfAmount8Code Maximum = new TypeOfAmount8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Maximum";
			previousVersion_lazy = () -> TypeOfAmount1Code.Maximum;
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount8Code.mmObject();
			codeName = TypeOfAmountCode.Maximum.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code
	 * TypeOfAmount8Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Default"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code#Default
	 * TypeOfAmount1Code.Default}</li>
	 * </ul>
	 */
	public static final TypeOfAmount8Code Default = new TypeOfAmount8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Default";
			previousVersion_lazy = () -> TypeOfAmount1Code.Default;
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount8Code.mmObject();
			codeName = TypeOfAmountCode.Default.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code
	 * TypeOfAmount8Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replacement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount1Code#Replacement
	 * TypeOfAmount1Code.Replacement}</li>
	 * </ul>
	 */
	public static final TypeOfAmount8Code Replacement = new TypeOfAmount8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Replacement";
			previousVersion_lazy = () -> TypeOfAmount1Code.Replacement;
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount8Code.mmObject();
			codeName = TypeOfAmountCode.Replacement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code
	 * TypeOfAmount8Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incremental"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfAmount8Code Incremental = new TypeOfAmount8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incremental";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount8Code.mmObject();
			codeName = TypeOfAmountCode.Incremental.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code
	 * TypeOfAmount8Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Decremental"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfAmount8Code Decremental = new TypeOfAmount8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Decremental";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount8Code.mmObject();
			codeName = TypeOfAmountCode.Decremental.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfAmount8Code
	 * TypeOfAmount8Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reserved"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TypeOfAmount8Code Reserved = new TypeOfAmount8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reserved";
			owner_lazy = () -> com.tools20022.repository.codeset.TypeOfAmount8Code.mmObject();
			codeName = TypeOfAmountCode.Reserved.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TypeOfAmount8Code> codesByName = new LinkedHashMap<>();

	protected TypeOfAmount8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TypeOfAmount8Code";
				definition = "Qualifies the amount associated with the transaction.";
				previousVersion_lazy = () -> TypeOfAmount1Code.mmObject();
				trace_lazy = () -> TypeOfAmountCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TypeOfAmount8Code.Actual, com.tools20022.repository.codeset.TypeOfAmount8Code.Estimated, com.tools20022.repository.codeset.TypeOfAmount8Code.Maximum,
						com.tools20022.repository.codeset.TypeOfAmount8Code.Default, com.tools20022.repository.codeset.TypeOfAmount8Code.Replacement, com.tools20022.repository.codeset.TypeOfAmount8Code.Incremental,
						com.tools20022.repository.codeset.TypeOfAmount8Code.Decremental, com.tools20022.repository.codeset.TypeOfAmount8Code.Reserved);
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
		codesByName.put(Incremental.getCodeName().get(), Incremental);
		codesByName.put(Decremental.getCodeName().get(), Decremental);
		codesByName.put(Reserved.getCodeName().get(), Reserved);
	}

	public static TypeOfAmount8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TypeOfAmount8Code[] values() {
		TypeOfAmount8Code[] values = new TypeOfAmount8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TypeOfAmount8Code> {
		@Override
		public TypeOfAmount8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TypeOfAmount8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}