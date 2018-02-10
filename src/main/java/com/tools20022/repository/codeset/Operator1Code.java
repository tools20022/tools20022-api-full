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
import com.tools20022.repository.codeset.Operator1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Code containing the operator used to indicate the relationship between a
 * variable and a fixed value.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Operator1Code#SmallerThan
 * Operator1Code.SmallerThan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Operator1Code#SmallerOrEqualTo
 * Operator1Code.SmallerOrEqualTo}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Operator1Code#GreaterThan
 * Operator1Code.GreaterThan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Operator1Code#GreaterOrEqualTo
 * Operator1Code.GreaterOrEqualTo}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Operator1Code#EqualTo
 * Operator1Code.EqualTo}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OperatorCode OperatorCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SMAL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Operator1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Code containing the operator used to indicate the relationship between a variable and a fixed value."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Operator1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Operator1Code
	 * Operator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallerThan"</li>
	 * </ul>
	 */
	public static final Operator1Code SmallerThan = new Operator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallerThan";
			owner_lazy = () -> com.tools20022.repository.codeset.Operator1Code.mmObject();
			codeName = OperatorCode.SmallerThan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Operator1Code
	 * Operator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallerOrEqualTo"</li>
	 * </ul>
	 */
	public static final Operator1Code SmallerOrEqualTo = new Operator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallerOrEqualTo";
			owner_lazy = () -> com.tools20022.repository.codeset.Operator1Code.mmObject();
			codeName = OperatorCode.SmallerOrEqualTo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Operator1Code
	 * Operator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GreaterThan"</li>
	 * </ul>
	 */
	public static final Operator1Code GreaterThan = new Operator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GreaterThan";
			owner_lazy = () -> com.tools20022.repository.codeset.Operator1Code.mmObject();
			codeName = OperatorCode.GreaterThan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Operator1Code
	 * Operator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GreaterOrEqualTo"</li>
	 * </ul>
	 */
	public static final Operator1Code GreaterOrEqualTo = new Operator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GreaterOrEqualTo";
			owner_lazy = () -> com.tools20022.repository.codeset.Operator1Code.mmObject();
			codeName = OperatorCode.GreaterOrEqualTo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Operator1Code
	 * Operator1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EqualTo"</li>
	 * </ul>
	 */
	public static final Operator1Code EqualTo = new Operator1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EqualTo";
			owner_lazy = () -> com.tools20022.repository.codeset.Operator1Code.mmObject();
			codeName = OperatorCode.EqualTo.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Operator1Code> codesByName = new LinkedHashMap<>();

	protected Operator1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SMAL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Operator1Code";
				definition = "Code containing the operator used to indicate the relationship between a variable and a fixed value.";
				trace_lazy = () -> OperatorCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Operator1Code.SmallerThan, com.tools20022.repository.codeset.Operator1Code.SmallerOrEqualTo, com.tools20022.repository.codeset.Operator1Code.GreaterThan,
						com.tools20022.repository.codeset.Operator1Code.GreaterOrEqualTo, com.tools20022.repository.codeset.Operator1Code.EqualTo);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SmallerThan.getCodeName().get(), SmallerThan);
		codesByName.put(SmallerOrEqualTo.getCodeName().get(), SmallerOrEqualTo);
		codesByName.put(GreaterThan.getCodeName().get(), GreaterThan);
		codesByName.put(GreaterOrEqualTo.getCodeName().get(), GreaterOrEqualTo);
		codesByName.put(EqualTo.getCodeName().get(), EqualTo);
	}

	public static Operator1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Operator1Code[] values() {
		Operator1Code[] values = new Operator1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Operator1Code> {
		@Override
		public Operator1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Operator1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}