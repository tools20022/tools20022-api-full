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
import com.tools20022.repository.codeset.CalculationBasis2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the calculation basis.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationBasis2Code#Average
 * CalculationBasis2Code.Average}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationBasis2Code#Daily
 * CalculationBasis2Code.Daily}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationBasis2Code#Monthly
 * CalculationBasis2Code.Monthly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CalculationBasis2Code#Annual
 * CalculationBasis2Code.Annual}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CalculationBasisCode
 * CalculationBasisCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AVER"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CalculationBasis2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the calculation basis."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CalculationBasis2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationBasis2Code
	 * CalculationBasis2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Average"</li>
	 * </ul>
	 */
	public static final CalculationBasis2Code Average = new CalculationBasis2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Average";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationBasis2Code.mmObject();
			codeName = CalculationBasisCode.Average.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationBasis2Code
	 * CalculationBasis2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Daily"</li>
	 * </ul>
	 */
	public static final CalculationBasis2Code Daily = new CalculationBasis2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Daily";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationBasis2Code.mmObject();
			codeName = CalculationBasisCode.Daily.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationBasis2Code
	 * CalculationBasis2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monthly"</li>
	 * </ul>
	 */
	public static final CalculationBasis2Code Monthly = new CalculationBasis2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monthly";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationBasis2Code.mmObject();
			codeName = CalculationBasisCode.Monthly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationBasis2Code
	 * CalculationBasis2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Annual"</li>
	 * </ul>
	 */
	public static final CalculationBasis2Code Annual = new CalculationBasis2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Annual";
			owner_lazy = () -> com.tools20022.repository.codeset.CalculationBasis2Code.mmObject();
			codeName = CalculationBasisCode.Annual.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CalculationBasis2Code> codesByName = new LinkedHashMap<>();

	protected CalculationBasis2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AVER");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CalculationBasis2Code";
				definition = "Specifies the calculation basis.";
				trace_lazy = () -> CalculationBasisCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CalculationBasis2Code.Average, com.tools20022.repository.codeset.CalculationBasis2Code.Daily,
						com.tools20022.repository.codeset.CalculationBasis2Code.Monthly, com.tools20022.repository.codeset.CalculationBasis2Code.Annual);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Average.getCodeName().get(), Average);
		codesByName.put(Daily.getCodeName().get(), Daily);
		codesByName.put(Monthly.getCodeName().get(), Monthly);
		codesByName.put(Annual.getCodeName().get(), Annual);
	}

	public static CalculationBasis2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CalculationBasis2Code[] values() {
		CalculationBasis2Code[] values = new CalculationBasis2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CalculationBasis2Code> {
		@Override
		public CalculationBasis2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CalculationBasis2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}