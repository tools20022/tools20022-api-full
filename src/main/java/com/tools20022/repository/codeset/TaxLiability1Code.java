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
import com.tools20022.repository.codeset.TaxLiability1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the tax role capacity of the instructing party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TaxLiability1Code#TaxPrincipal
 * TaxLiability1Code.TaxPrincipal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TaxLiability1Code#TaxAgent
 * TaxLiability1Code.TaxAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TaxLiabilityCode
 * TaxLiabilityCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PRIN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxLiability1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the tax role capacity of the instructing party."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TaxLiability1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxLiability1Code
	 * TaxLiability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPrincipal"</li>
	 * </ul>
	 */
	public static final TaxLiability1Code TaxPrincipal = new TaxLiability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxLiability1Code.mmObject();
			codeName = TaxLiabilityCode.TaxPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TaxLiability1Code
	 * TaxLiability1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAgent"</li>
	 * </ul>
	 */
	public static final TaxLiability1Code TaxAgent = new TaxLiability1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.TaxLiability1Code.mmObject();
			codeName = TaxLiabilityCode.TaxAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TaxLiability1Code> codesByName = new LinkedHashMap<>();

	protected TaxLiability1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PRIN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxLiability1Code";
				definition = "Specifies the tax role capacity of the instructing party.";
				trace_lazy = () -> TaxLiabilityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TaxLiability1Code.TaxPrincipal, com.tools20022.repository.codeset.TaxLiability1Code.TaxAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(TaxPrincipal.getCodeName().get(), TaxPrincipal);
		codesByName.put(TaxAgent.getCodeName().get(), TaxAgent);
	}

	public static TaxLiability1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TaxLiability1Code[] values() {
		TaxLiability1Code[] values = new TaxLiability1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TaxLiability1Code> {
		@Override
		public TaxLiability1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TaxLiability1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}