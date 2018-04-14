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
import com.tools20022.repository.codeset.SubscriptionChargeApplicationTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether the cash debit for the subscription charge is made
 * immediately or accumulated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SubscriptionChargeApplicationTypeCode#Accumulated
 * SubscriptionChargeApplicationTypeCode.Accumulated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SubscriptionChargeApplicationTypeCode#Immediate
 * SubscriptionChargeApplicationTypeCode.Immediate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SubscriptionChargeApplicationType1Code
 * SubscriptionChargeApplicationType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionChargeApplicationTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the cash debit for the subscription charge is made immediately or accumulated."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACCU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SubscriptionChargeApplicationTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Charges are accumulated and charged later.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SubscriptionChargeApplicationTypeCode
	 * SubscriptionChargeApplicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accumulated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges are accumulated and charged later."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SubscriptionChargeApplicationTypeCode Accumulated = new SubscriptionChargeApplicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accumulated";
			definition = "Charges are accumulated and charged later.";
			owner_lazy = () -> com.tools20022.repository.codeset.SubscriptionChargeApplicationTypeCode.mmObject();
			codeName = "ACCU";
		}
	};
	/**
	 * Charges are charged when instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SubscriptionChargeApplicationTypeCode
	 * SubscriptionChargeApplicationTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IMDT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Immediate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charges are charged when instructed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SubscriptionChargeApplicationTypeCode Immediate = new SubscriptionChargeApplicationTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Immediate";
			definition = "Charges are charged when instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SubscriptionChargeApplicationTypeCode.mmObject();
			codeName = "IMDT";
		}
	};
	final static private LinkedHashMap<String, SubscriptionChargeApplicationTypeCode> codesByName = new LinkedHashMap<>();

	protected SubscriptionChargeApplicationTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionChargeApplicationTypeCode";
				definition = "Indicates whether the cash debit for the subscription charge is made immediately or accumulated.";
				derivation_lazy = () -> Arrays.asList(SubscriptionChargeApplicationType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SubscriptionChargeApplicationTypeCode.Accumulated, com.tools20022.repository.codeset.SubscriptionChargeApplicationTypeCode.Immediate);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accumulated.getCodeName().get(), Accumulated);
		codesByName.put(Immediate.getCodeName().get(), Immediate);
	}

	public static SubscriptionChargeApplicationTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SubscriptionChargeApplicationTypeCode[] values() {
		SubscriptionChargeApplicationTypeCode[] values = new SubscriptionChargeApplicationTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SubscriptionChargeApplicationTypeCode> {
		@Override
		public SubscriptionChargeApplicationTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SubscriptionChargeApplicationTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}