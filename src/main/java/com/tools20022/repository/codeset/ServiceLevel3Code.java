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
import com.tools20022.repository.codeset.ServiceLevel3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the pre-agreed level of service between the parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ServiceLevel3Code#SingleEuroPaymentsArea
 * ServiceLevel3Code.SingleEuroPaymentsArea}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ServiceLevelCode
 * ServiceLevelCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SEPA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ServiceLevel3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the pre-agreed level of service between the parties."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ServiceLevel3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ServiceLevel3Code
	 * ServiceLevel3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleEuroPaymentsArea"</li>
	 * </ul>
	 */
	public static final ServiceLevel3Code SingleEuroPaymentsArea = new ServiceLevel3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleEuroPaymentsArea";
			owner_lazy = () -> com.tools20022.repository.codeset.ServiceLevel3Code.mmObject();
			codeName = ServiceLevelCode.SingleEuroPaymentsArea.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ServiceLevel3Code> codesByName = new LinkedHashMap<>();

	protected ServiceLevel3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SEPA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ServiceLevel3Code";
				definition = "Specifies the pre-agreed level of service between the parties.";
				trace_lazy = () -> ServiceLevelCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ServiceLevel3Code.SingleEuroPaymentsArea);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SingleEuroPaymentsArea.getCodeName().get(), SingleEuroPaymentsArea);
	}

	public static ServiceLevel3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ServiceLevel3Code[] values() {
		ServiceLevel3Code[] values = new ServiceLevel3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ServiceLevel3Code> {
		@Override
		public ServiceLevel3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ServiceLevel3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}