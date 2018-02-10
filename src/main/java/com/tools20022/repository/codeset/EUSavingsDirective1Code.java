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
import com.tools20022.repository.codeset.EUSavingsDirective1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * ndicate whether or not the fund is subject to reporting under the EU Savings
 * Directive. Enter "Variable" if the status of the fund is likely to change
 * from time to time.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code#EUSavingsInScope
 * EUSavingsDirective1Code.EUSavingsInScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code#EUSavingsOutScope
 * EUSavingsDirective1Code.EUSavingsOutScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code#EUSavingsVariable
 * EUSavingsDirective1Code.EUSavingsVariable}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirectiveCode
 * EUSavingsDirectiveCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"EUSI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EUSavingsDirective1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "ndicate whether or not the fund is subject to reporting under the EU Savings Directive. Enter \"Variable\" if the status of the fund is likely to change from time to time."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EUSavingsDirective1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code
	 * EUSavingsDirective1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsInScope"</li>
	 * </ul>
	 */
	public static final EUSavingsDirective1Code EUSavingsInScope = new EUSavingsDirective1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUSavingsInScope";
			owner_lazy = () -> com.tools20022.repository.codeset.EUSavingsDirective1Code.mmObject();
			codeName = EUSavingsDirectiveCode.EUSavingsInScope.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code
	 * EUSavingsDirective1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsOutScope"</li>
	 * </ul>
	 */
	public static final EUSavingsDirective1Code EUSavingsOutScope = new EUSavingsDirective1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUSavingsOutScope";
			owner_lazy = () -> com.tools20022.repository.codeset.EUSavingsDirective1Code.mmObject();
			codeName = EUSavingsDirectiveCode.EUSavingsOutScope.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUSavingsDirective1Code
	 * EUSavingsDirective1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUSavingsVariable"</li>
	 * </ul>
	 */
	public static final EUSavingsDirective1Code EUSavingsVariable = new EUSavingsDirective1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUSavingsVariable";
			owner_lazy = () -> com.tools20022.repository.codeset.EUSavingsDirective1Code.mmObject();
			codeName = EUSavingsDirectiveCode.EUSavingsVariable.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EUSavingsDirective1Code> codesByName = new LinkedHashMap<>();

	protected EUSavingsDirective1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("EUSI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EUSavingsDirective1Code";
				definition = "ndicate whether or not the fund is subject to reporting under the EU Savings Directive. Enter \"Variable\" if the status of the fund is likely to change from time to time.";
				trace_lazy = () -> EUSavingsDirectiveCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EUSavingsDirective1Code.EUSavingsInScope, com.tools20022.repository.codeset.EUSavingsDirective1Code.EUSavingsOutScope,
						com.tools20022.repository.codeset.EUSavingsDirective1Code.EUSavingsVariable);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EUSavingsInScope.getCodeName().get(), EUSavingsInScope);
		codesByName.put(EUSavingsOutScope.getCodeName().get(), EUSavingsOutScope);
		codesByName.put(EUSavingsVariable.getCodeName().get(), EUSavingsVariable);
	}

	public static EUSavingsDirective1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EUSavingsDirective1Code[] values() {
		EUSavingsDirective1Code[] values = new EUSavingsDirective1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EUSavingsDirective1Code> {
		@Override
		public EUSavingsDirective1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EUSavingsDirective1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}