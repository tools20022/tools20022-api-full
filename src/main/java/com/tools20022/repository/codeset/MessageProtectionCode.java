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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Mechanism used to protect the message of the ATM protocol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageProtectionCode#EnvelopedMessage
 * MessageProtectionCode.EnvelopedMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageProtectionCode#MACBody
 * MessageProtectionCode.MACBody}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageProtectionCode#MACMessage
 * MessageProtectionCode.MACMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageProtectionCode#NoProtection
 * MessageProtectionCode.NoProtection}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageProtection1Code
 * MessageProtection1Code}</li>
 * </ul>
 * </li>
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
 * "MessageProtectionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Mechanism used to protect the message of the ATM protocol."</li>
 * </ul>
 */
public class MessageProtectionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Messages contain an encrypted body and a MAC or a digital signature
	 * computed on the complete message (header plus body after encryption).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageProtectionCode
	 * MessageProtectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EVLP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvelopedMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Messages contain an encrypted body and a MAC or a digital signature computed on the complete message (header plus body after encryption)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode EnvelopedMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvelopedMessage";
			definition = "Messages contain an encrypted body and a MAC or a digital signature computed on the complete message (header plus body after encryption).";
			owner_lazy = () -> MessageProtectionCode.mmObject();
			codeName = "EVLP";
		}
	};
	/**
	 * Messages contain a MAC or a digital signature computed on the body only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageProtectionCode
	 * MessageProtectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MACB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACBody"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Messages contain a MAC or a digital signature computed on the body only."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MACBody = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACBody";
			definition = "Messages contain a MAC or a digital signature computed on the body only.";
			owner_lazy = () -> MessageProtectionCode.mmObject();
			codeName = "MACB";
		}
	};
	/**
	 * Messages contain a MAC or a digital signature computed on the complete
	 * message (header plus body).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageProtectionCode
	 * MessageProtectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MACM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Messages contain a MAC or a digital signature computed on the complete message (header plus body)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode MACMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACMessage";
			definition = "Messages contain a MAC or a digital signature computed on the complete message (header plus body).";
			owner_lazy = () -> MessageProtectionCode.mmObject();
			codeName = "MACM";
		}
	};
	/**
	 * Messages are not protected, no encryption and no MAC or digital
	 * signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageProtectionCode
	 * MessageProtectionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoProtection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Messages are not protected, no encryption and no MAC or digital signature."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NoProtection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoProtection";
			definition = "Messages are not protected, no encryption and no MAC or digital signature.";
			owner_lazy = () -> MessageProtectionCode.mmObject();
			codeName = "UNPR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MessageProtectionCode";
				definition = "Mechanism used to protect the message of the ATM protocol.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageProtectionCode.EnvelopedMessage, com.tools20022.repository.codeset.MessageProtectionCode.MACBody,
						com.tools20022.repository.codeset.MessageProtectionCode.MACMessage, com.tools20022.repository.codeset.MessageProtectionCode.NoProtection);
				derivation_lazy = () -> Arrays.asList(MessageProtection1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}