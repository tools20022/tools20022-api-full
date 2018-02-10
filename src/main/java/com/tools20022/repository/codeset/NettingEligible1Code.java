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
import com.tools20022.repository.codeset.NettingEligible1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the trade is eligible for netting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NettingEligible1Code#Gross
 * NettingEligible1Code.Gross}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NettingEligible1Code#Nett
 * NettingEligible1Code.Nett}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.NettingEligible1Code#AggregationForSettlement
 * NettingEligible1Code.AggregationForSettlement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.NettingEligibleCode
 * NettingEligibleCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"GROS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NettingEligible1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether the trade is eligible for netting."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NettingEligible1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NettingEligible1Code
	 * NettingEligible1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gross"</li>
	 * </ul>
	 */
	public static final NettingEligible1Code Gross = new NettingEligible1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gross";
			owner_lazy = () -> com.tools20022.repository.codeset.NettingEligible1Code.mmObject();
			codeName = NettingEligibleCode.Gross.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NettingEligible1Code
	 * NettingEligible1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Nett"</li>
	 * </ul>
	 */
	public static final NettingEligible1Code Nett = new NettingEligible1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Nett";
			owner_lazy = () -> com.tools20022.repository.codeset.NettingEligible1Code.mmObject();
			codeName = NettingEligibleCode.Nett.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NettingEligible1Code
	 * NettingEligible1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AggregationForSettlement"</li>
	 * </ul>
	 */
	public static final NettingEligible1Code AggregationForSettlement = new NettingEligible1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AggregationForSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.NettingEligible1Code.mmObject();
			codeName = NettingEligibleCode.AggregationForSettlement.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, NettingEligible1Code> codesByName = new LinkedHashMap<>();

	protected NettingEligible1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GROS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NettingEligible1Code";
				definition = "Specifies whether the trade is eligible for netting.";
				trace_lazy = () -> NettingEligibleCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NettingEligible1Code.Gross, com.tools20022.repository.codeset.NettingEligible1Code.Nett,
						com.tools20022.repository.codeset.NettingEligible1Code.AggregationForSettlement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Gross.getCodeName().get(), Gross);
		codesByName.put(Nett.getCodeName().get(), Nett);
		codesByName.put(AggregationForSettlement.getCodeName().get(), AggregationForSettlement);
	}

	public static NettingEligible1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NettingEligible1Code[] values() {
		NettingEligible1Code[] values = new NettingEligible1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NettingEligible1Code> {
		@Override
		public NettingEligible1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NettingEligible1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}