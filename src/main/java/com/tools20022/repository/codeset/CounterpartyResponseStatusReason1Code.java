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
import com.tools20022.repository.codeset.CounterpartyResponseStatusReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of counterparty's action the response is related to.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReason1Code#CounterpartyTransaction
 * CounterpartyResponseStatusReason1Code.CounterpartyTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReason1Code#CounterpartyCancellation
 * CounterpartyResponseStatusReason1Code.CounterpartyCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReason1Code#CounterpartyModification
 * CounterpartyResponseStatusReason1Code.CounterpartyModification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReasonCode
 * CounterpartyResponseStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CPTR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CounterpartyResponseStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of counterparty's action the response is related to."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CounterpartyResponseStatusReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReason1Code
	 * CounterpartyResponseStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTransaction"</li>
	 * </ul>
	 */
	public static final CounterpartyResponseStatusReason1Code CounterpartyTransaction = new CounterpartyResponseStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.CounterpartyResponseStatusReason1Code.mmObject();
			codeName = CounterpartyResponseStatusReasonCode.CounterpartyTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReason1Code
	 * CounterpartyResponseStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyCancellation"</li>
	 * </ul>
	 */
	public static final CounterpartyResponseStatusReason1Code CounterpartyCancellation = new CounterpartyResponseStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.CounterpartyResponseStatusReason1Code.mmObject();
			codeName = CounterpartyResponseStatusReasonCode.CounterpartyCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CounterpartyResponseStatusReason1Code
	 * CounterpartyResponseStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyModification"</li>
	 * </ul>
	 */
	public static final CounterpartyResponseStatusReason1Code CounterpartyModification = new CounterpartyResponseStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyModification";
			owner_lazy = () -> com.tools20022.repository.codeset.CounterpartyResponseStatusReason1Code.mmObject();
			codeName = CounterpartyResponseStatusReasonCode.CounterpartyModification.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CounterpartyResponseStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected CounterpartyResponseStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CPTR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CounterpartyResponseStatusReason1Code";
				definition = "Specifies the type of counterparty's action the response is related to.";
				trace_lazy = () -> CounterpartyResponseStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CounterpartyResponseStatusReason1Code.CounterpartyTransaction,
						com.tools20022.repository.codeset.CounterpartyResponseStatusReason1Code.CounterpartyCancellation, com.tools20022.repository.codeset.CounterpartyResponseStatusReason1Code.CounterpartyModification);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CounterpartyTransaction.getCodeName().get(), CounterpartyTransaction);
		codesByName.put(CounterpartyCancellation.getCodeName().get(), CounterpartyCancellation);
		codesByName.put(CounterpartyModification.getCodeName().get(), CounterpartyModification);
	}

	public static CounterpartyResponseStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CounterpartyResponseStatusReason1Code[] values() {
		CounterpartyResponseStatusReason1Code[] values = new CounterpartyResponseStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CounterpartyResponseStatusReason1Code> {
		@Override
		public CounterpartyResponseStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CounterpartyResponseStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}