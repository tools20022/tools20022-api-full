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
import com.tools20022.repository.codeset.MessageFunction8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of process requested by the host to an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code#ATMBalance
 * MessageFunction8Code.ATMBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code#ATMGlobalStatus
 * MessageFunction8Code.ATMGlobalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code#SecurityDetails
 * MessageFunction8Code.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code#CountersInquiry
 * MessageFunction8Code.CountersInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code#KeyExchangeRequest
 * MessageFunction8Code.KeyExchangeRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code#SecurityKeyStatus
 * MessageFunction8Code.SecurityKeyStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
 * MessageFunctionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageFunction8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the type of process requested by the host to an ATM."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageFunction8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code
	 * MessageFunction8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalance"</li>
	 * </ul>
	 */
	public static final MessageFunction8Code ATMBalance = new MessageFunction8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction8Code.mmObject();
			codeName = MessageFunctionCode.ATMBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code
	 * MessageFunction8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMGlobalStatus"</li>
	 * </ul>
	 */
	public static final MessageFunction8Code ATMGlobalStatus = new MessageFunction8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMGlobalStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction8Code.mmObject();
			codeName = MessageFunctionCode.ATMGlobalStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code
	 * MessageFunction8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDetails"</li>
	 * </ul>
	 */
	public static final MessageFunction8Code SecurityDetails = new MessageFunction8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction8Code.mmObject();
			codeName = MessageFunctionCode.SecurityDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code
	 * MessageFunction8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountersInquiry"</li>
	 * </ul>
	 */
	public static final MessageFunction8Code CountersInquiry = new MessageFunction8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersInquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction8Code.mmObject();
			codeName = MessageFunctionCode.CountersInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code
	 * MessageFunction8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyExchangeRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction8Code KeyExchangeRequest = new MessageFunction8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExchangeRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction8Code.mmObject();
			codeName = MessageFunctionCode.KeyExchangeRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction8Code
	 * MessageFunction8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityKeyStatus"</li>
	 * </ul>
	 */
	public static final MessageFunction8Code SecurityKeyStatus = new MessageFunction8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityKeyStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction8Code.mmObject();
			codeName = MessageFunctionCode.SecurityKeyStatus.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MessageFunction8Code> codesByName = new LinkedHashMap<>();

	protected MessageFunction8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageFunction8Code";
				definition = "Identifies the type of process requested by the host to an ATM.";
				trace_lazy = () -> MessageFunctionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction8Code.ATMBalance, com.tools20022.repository.codeset.MessageFunction8Code.ATMGlobalStatus,
						com.tools20022.repository.codeset.MessageFunction8Code.SecurityDetails, com.tools20022.repository.codeset.MessageFunction8Code.CountersInquiry,
						com.tools20022.repository.codeset.MessageFunction8Code.KeyExchangeRequest, com.tools20022.repository.codeset.MessageFunction8Code.SecurityKeyStatus);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ATMBalance.getCodeName().get(), ATMBalance);
		codesByName.put(ATMGlobalStatus.getCodeName().get(), ATMGlobalStatus);
		codesByName.put(SecurityDetails.getCodeName().get(), SecurityDetails);
		codesByName.put(CountersInquiry.getCodeName().get(), CountersInquiry);
		codesByName.put(KeyExchangeRequest.getCodeName().get(), KeyExchangeRequest);
		codesByName.put(SecurityKeyStatus.getCodeName().get(), SecurityKeyStatus);
	}

	public static MessageFunction8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageFunction8Code[] values() {
		MessageFunction8Code[] values = new MessageFunction8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageFunction8Code> {
		@Override
		public MessageFunction8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageFunction8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}