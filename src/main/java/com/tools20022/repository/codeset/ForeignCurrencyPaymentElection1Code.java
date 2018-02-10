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
import com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the foreign currency payment is offered.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code#Offered
 * ForeignCurrencyPaymentElection1Code.Offered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code#NotOffered
 * ForeignCurrencyPaymentElection1Code.NotOffered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code#Mandatory
 * ForeignCurrencyPaymentElection1Code.Mandatory}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElectionCode
 * ForeignCurrencyPaymentElectionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OFFD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignCurrencyPaymentElection1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether the foreign currency payment is offered."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ForeignCurrencyPaymentElection1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code
	 * ForeignCurrencyPaymentElection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offered"</li>
	 * </ul>
	 */
	public static final ForeignCurrencyPaymentElection1Code Offered = new ForeignCurrencyPaymentElection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offered";
			owner_lazy = () -> com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code.mmObject();
			codeName = ForeignCurrencyPaymentElectionCode.Offered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code
	 * ForeignCurrencyPaymentElection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotOffered"</li>
	 * </ul>
	 */
	public static final ForeignCurrencyPaymentElection1Code NotOffered = new ForeignCurrencyPaymentElection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotOffered";
			owner_lazy = () -> com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code.mmObject();
			codeName = ForeignCurrencyPaymentElectionCode.NotOffered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code
	 * ForeignCurrencyPaymentElection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandatory"</li>
	 * </ul>
	 */
	public static final ForeignCurrencyPaymentElection1Code Mandatory = new ForeignCurrencyPaymentElection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandatory";
			owner_lazy = () -> com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code.mmObject();
			codeName = ForeignCurrencyPaymentElectionCode.Mandatory.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ForeignCurrencyPaymentElection1Code> codesByName = new LinkedHashMap<>();

	protected ForeignCurrencyPaymentElection1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OFFD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignCurrencyPaymentElection1Code";
				definition = "Specifies whether the foreign currency payment is offered.";
				trace_lazy = () -> ForeignCurrencyPaymentElectionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code.Offered, com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code.NotOffered,
						com.tools20022.repository.codeset.ForeignCurrencyPaymentElection1Code.Mandatory);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Offered.getCodeName().get(), Offered);
		codesByName.put(NotOffered.getCodeName().get(), NotOffered);
		codesByName.put(Mandatory.getCodeName().get(), Mandatory);
	}

	public static ForeignCurrencyPaymentElection1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ForeignCurrencyPaymentElection1Code[] values() {
		ForeignCurrencyPaymentElection1Code[] values = new ForeignCurrencyPaymentElection1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ForeignCurrencyPaymentElection1Code> {
		@Override
		public ForeignCurrencyPaymentElection1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ForeignCurrencyPaymentElection1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}