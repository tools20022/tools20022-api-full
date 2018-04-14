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
import com.tools20022.repository.codeset.OperationV2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the relationship between two variables.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OperationV2Code#And
 * OperationV2Code.And}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OperationV2Code#Or
 * OperationV2Code.Or}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OperationV2Code#ExclusiveOr
 * OperationV2Code.ExclusiveOr}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OperationV2Code#Till
 * OperationV2Code.Till}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Operation3Code
 * Operation3Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OperationV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the relationship between two variables."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OperationV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that only when all if all of its elements are valid, the whole
	 * expression is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OperationV2Code
	 * OperationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ANDD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "And"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that only when all if all of its elements are valid, the whole expression is valid."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OperationV2Code And = new OperationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "And";
			definition = "Indicates that only when all if all of its elements are valid, the whole expression is valid.";
			owner_lazy = () -> com.tools20022.repository.codeset.OperationV2Code.mmObject();
			codeName = "ANDD";
		}
	};
	/**
	 * Indicates that when at least one of its elements is valid, the whole
	 * expression is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OperationV2Code
	 * OperationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORRR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Or"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that when at least one of its elements is valid, the whole expression is valid."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OperationV2Code Or = new OperationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Or";
			definition = "Indicates that when at least one of its elements is valid, the whole expression is valid.";
			owner_lazy = () -> com.tools20022.repository.codeset.OperationV2Code.mmObject();
			codeName = "ORRR";
		}
	};
	/**
	 * Indicates that only when both elements differ (one is valid, one is
	 * invalid), the whole expression is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OperationV2Code
	 * OperationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XORR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExclusiveOr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that only when both elements differ (one is valid, one is invalid), the whole expression is valid."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OperationV2Code ExclusiveOr = new OperationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExclusiveOr";
			definition = "Indicates that only when both elements differ (one is valid, one is invalid), the whole expression is valid.";
			owner_lazy = () -> com.tools20022.repository.codeset.OperationV2Code.mmObject();
			codeName = "XORR";
		}
	};
	/**
	 * Indicates a range delimited by two variables.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OperationV2Code
	 * OperationV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TILL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Till"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates a range delimited by two variables."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final OperationV2Code Till = new OperationV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Till";
			definition = "Indicates a range delimited by two variables.";
			owner_lazy = () -> com.tools20022.repository.codeset.OperationV2Code.mmObject();
			codeName = "TILL";
		}
	};
	final static private LinkedHashMap<String, OperationV2Code> codesByName = new LinkedHashMap<>();

	protected OperationV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "OperationV2Code";
				definition = "Indicates the relationship between two variables.";
				derivation_lazy = () -> Arrays.asList(Operation3Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OperationV2Code.And, com.tools20022.repository.codeset.OperationV2Code.Or, com.tools20022.repository.codeset.OperationV2Code.ExclusiveOr,
						com.tools20022.repository.codeset.OperationV2Code.Till);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(And.getCodeName().get(), And);
		codesByName.put(Or.getCodeName().get(), Or);
		codesByName.put(ExclusiveOr.getCodeName().get(), ExclusiveOr);
		codesByName.put(Till.getCodeName().get(), Till);
	}

	public static OperationV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OperationV2Code[] values() {
		OperationV2Code[] values = new OperationV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OperationV2Code> {
		@Override
		public OperationV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OperationV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}