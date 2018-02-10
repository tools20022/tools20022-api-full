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
import com.tools20022.repository.codeset.MessageProtection1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Mechanism used to protect the message of the ATM protocol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageProtection1Code#EnvelopedMessage
 * MessageProtection1Code.EnvelopedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageProtection1Code#MACBody
 * MessageProtection1Code.MACBody}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageProtection1Code#MACMessage
 * MessageProtection1Code.MACMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageProtection1Code#NoProtection
 * MessageProtection1Code.NoProtection}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MessageProtectionCode
 * MessageProtectionCode}</li>
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
 * "MessageProtection1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Mechanism used to protect the message of the ATM protocol."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageProtection1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageProtection1Code
	 * MessageProtection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvelopedMessage"</li>
	 * </ul>
	 */
	public static final MessageProtection1Code EnvelopedMessage = new MessageProtection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvelopedMessage";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageProtection1Code.mmObject();
			codeName = MessageProtectionCode.EnvelopedMessage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageProtection1Code
	 * MessageProtection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACBody"</li>
	 * </ul>
	 */
	public static final MessageProtection1Code MACBody = new MessageProtection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACBody";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageProtection1Code.mmObject();
			codeName = MessageProtectionCode.MACBody.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageProtection1Code
	 * MessageProtection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACMessage"</li>
	 * </ul>
	 */
	public static final MessageProtection1Code MACMessage = new MessageProtection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACMessage";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageProtection1Code.mmObject();
			codeName = MessageProtectionCode.MACMessage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageProtection1Code
	 * MessageProtection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoProtection"</li>
	 * </ul>
	 */
	public static final MessageProtection1Code NoProtection = new MessageProtection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoProtection";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageProtection1Code.mmObject();
			codeName = MessageProtectionCode.NoProtection.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MessageProtection1Code> codesByName = new LinkedHashMap<>();

	protected MessageProtection1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageProtection1Code";
				definition = "Mechanism used to protect the message of the ATM protocol.";
				trace_lazy = () -> MessageProtectionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageProtection1Code.EnvelopedMessage, com.tools20022.repository.codeset.MessageProtection1Code.MACBody,
						com.tools20022.repository.codeset.MessageProtection1Code.MACMessage, com.tools20022.repository.codeset.MessageProtection1Code.NoProtection);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EnvelopedMessage.getCodeName().get(), EnvelopedMessage);
		codesByName.put(MACBody.getCodeName().get(), MACBody);
		codesByName.put(MACMessage.getCodeName().get(), MACMessage);
		codesByName.put(NoProtection.getCodeName().get(), NoProtection);
	}

	public static MessageProtection1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageProtection1Code[] values() {
		MessageProtection1Code[] values = new MessageProtection1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageProtection1Code> {
		@Override
		public MessageProtection1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageProtection1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}