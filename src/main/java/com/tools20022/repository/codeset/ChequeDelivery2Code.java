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
import com.tools20022.repository.codeset.ChequeDelivery2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the method to be used in delivering a cheque to a party.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery2Code#MailToFinalAgent
 * ChequeDelivery2Code.MailToFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery2Code#CourierToFinalAgent
 * ChequeDelivery2Code.CourierToFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery2Code#PickUpByFinalAgent
 * ChequeDelivery2Code.PickUpByFinalAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery2Code#RegisteredMailToFinalAgent
 * ChequeDelivery2Code.RegisteredMailToFinalAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ChequeDeliveryCode
 * ChequeDeliveryCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MLFA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChequeDelivery2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method to be used in delivering a cheque to a party."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChequeDelivery2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery2Code
	 * ChequeDelivery2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MailToFinalAgent"</li>
	 * </ul>
	 */
	public static final ChequeDelivery2Code MailToFinalAgent = new ChequeDelivery2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MailToFinalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery2Code.mmObject();
			codeName = ChequeDeliveryCode.MailToFinalAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery2Code
	 * ChequeDelivery2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourierToFinalAgent"</li>
	 * </ul>
	 */
	public static final ChequeDelivery2Code CourierToFinalAgent = new ChequeDelivery2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourierToFinalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery2Code.mmObject();
			codeName = ChequeDeliveryCode.CourierToFinalAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery2Code
	 * ChequeDelivery2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PickUpByFinalAgent"</li>
	 * </ul>
	 */
	public static final ChequeDelivery2Code PickUpByFinalAgent = new ChequeDelivery2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PickUpByFinalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery2Code.mmObject();
			codeName = ChequeDeliveryCode.PickUpByFinalAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChequeDelivery2Code
	 * ChequeDelivery2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredMailToFinalAgent"</li>
	 * </ul>
	 */
	public static final ChequeDelivery2Code RegisteredMailToFinalAgent = new ChequeDelivery2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredMailToFinalAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.ChequeDelivery2Code.mmObject();
			codeName = ChequeDeliveryCode.RegisteredMailToFinalAgent.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChequeDelivery2Code> codesByName = new LinkedHashMap<>();

	protected ChequeDelivery2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MLFA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChequeDelivery2Code";
				definition = "Specifies the method to be used in delivering a cheque to a party.";
				trace_lazy = () -> ChequeDeliveryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChequeDelivery2Code.MailToFinalAgent, com.tools20022.repository.codeset.ChequeDelivery2Code.CourierToFinalAgent,
						com.tools20022.repository.codeset.ChequeDelivery2Code.PickUpByFinalAgent, com.tools20022.repository.codeset.ChequeDelivery2Code.RegisteredMailToFinalAgent);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MailToFinalAgent.getCodeName().get(), MailToFinalAgent);
		codesByName.put(CourierToFinalAgent.getCodeName().get(), CourierToFinalAgent);
		codesByName.put(PickUpByFinalAgent.getCodeName().get(), PickUpByFinalAgent);
		codesByName.put(RegisteredMailToFinalAgent.getCodeName().get(), RegisteredMailToFinalAgent);
	}

	public static ChequeDelivery2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChequeDelivery2Code[] values() {
		ChequeDelivery2Code[] values = new ChequeDelivery2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChequeDelivery2Code> {
		@Override
		public ChequeDelivery2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChequeDelivery2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}