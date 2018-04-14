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
import com.tools20022.repository.codeset.SubscriptionChargeApplicationType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SubscriptionChargeApplicationType1Code#Accumulated
 * SubscriptionChargeApplicationType1Code.Accumulated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SubscriptionChargeApplicationType1Code#Immediate
 * SubscriptionChargeApplicationType1Code.Immediate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SubscriptionChargeApplicationTypeCode
 * SubscriptionChargeApplicationTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionChargeApplicationType1Code"</li>
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
public class SubscriptionChargeApplicationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SubscriptionChargeApplicationType1Code
	 * SubscriptionChargeApplicationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accumulated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SubscriptionChargeApplicationType1Code Accumulated = new SubscriptionChargeApplicationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accumulated";
			owner_lazy = () -> com.tools20022.repository.codeset.SubscriptionChargeApplicationType1Code.mmObject();
			codeName = SubscriptionChargeApplicationTypeCode.Accumulated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SubscriptionChargeApplicationType1Code
	 * SubscriptionChargeApplicationType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Immediate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SubscriptionChargeApplicationType1Code Immediate = new SubscriptionChargeApplicationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Immediate";
			owner_lazy = () -> com.tools20022.repository.codeset.SubscriptionChargeApplicationType1Code.mmObject();
			codeName = SubscriptionChargeApplicationTypeCode.Immediate.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SubscriptionChargeApplicationType1Code> codesByName = new LinkedHashMap<>();

	protected SubscriptionChargeApplicationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubscriptionChargeApplicationType1Code";
				definition = "Indicates whether the cash debit for the subscription charge is made immediately or accumulated.";
				trace_lazy = () -> SubscriptionChargeApplicationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SubscriptionChargeApplicationType1Code.Accumulated, com.tools20022.repository.codeset.SubscriptionChargeApplicationType1Code.Immediate);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accumulated.getCodeName().get(), Accumulated);
		codesByName.put(Immediate.getCodeName().get(), Immediate);
	}

	public static SubscriptionChargeApplicationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SubscriptionChargeApplicationType1Code[] values() {
		SubscriptionChargeApplicationType1Code[] values = new SubscriptionChargeApplicationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SubscriptionChargeApplicationType1Code> {
		@Override
		public SubscriptionChargeApplicationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SubscriptionChargeApplicationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}