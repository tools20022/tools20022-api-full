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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Algorithm11Code;
import com.tools20022.repository.codeset.Algorithm12Code;
import com.tools20022.repository.codeset.MessageProtection1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Configuration parameters in use by the security device.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1#mmKeys
 * ATMSecurityConfiguration1.mmKeys}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1#mmEncryption
 * ATMSecurityConfiguration1.mmEncryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1#mmMACAlgorithm
 * ATMSecurityConfiguration1.mmMACAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1#mmDigestAlgorithm
 * ATMSecurityConfiguration1.mmDigestAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1#mmDigitalSignature
 * ATMSecurityConfiguration1.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1#mmPIN
 * ATMSecurityConfiguration1.mmPIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1#mmMessageProtection
 * ATMSecurityConfiguration1.mmMessageProtection}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMSecurityConfiguration1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Configuration parameters in use by the security device."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration2
 * ATMSecurityConfiguration2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ATMSecurityConfiguration1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMSecurityConfiguration2 keys;
	/**
	 * Configuration of the cryptographic keys.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration2
	 * ATMSecurityConfiguration2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1
	 * ATMSecurityConfiguration1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Keys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Keys"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of the cryptographic keys."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKeys = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration1.mmObject();
			isDerived = false;
			xmlTag = "Keys";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Keys";
			definition = "Configuration of the cryptographic keys.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMSecurityConfiguration2.mmObject();
		}
	};
	protected ATMSecurityConfiguration3 encryption;
	/**
	 * Configuration of the encryption or digital envelope, if the security
	 * module is able to perform encryption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3
	 * ATMSecurityConfiguration3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1
	 * ATMSecurityConfiguration1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ncrptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Encryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration of the encryption or digital envelope, if the security module is able to perform encryption."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEncryption = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration1.mmObject();
			isDerived = false;
			xmlTag = "Ncrptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Encryption";
			definition = "Configuration of the encryption or digital envelope, if the security module is able to perform encryption.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMSecurityConfiguration3.mmObject();
		}
	};
	protected List<Algorithm12Code> mACAlgorithm;
	/**
	 * MAC (Message Authentication Code) algorithm the security module is able
	 * to manage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm12Code
	 * Algorithm12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1
	 * ATMSecurityConfiguration1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MACAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "MAC (Message Authentication Code) algorithm the security module is able to manage."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMACAlgorithm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration1.mmObject();
			isDerived = false;
			xmlTag = "MACAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACAlgorithm";
			definition = "MAC (Message Authentication Code) algorithm the security module is able to manage.";
			minOccurs = 0;
			simpleType_lazy = () -> Algorithm12Code.mmObject();
		}
	};
	protected List<Algorithm11Code> digestAlgorithm;
	/**
	 * Digest algorithm the security module is able to manage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm11Code
	 * Algorithm11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1
	 * ATMSecurityConfiguration1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgstAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigestAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Digest algorithm the security module is able to manage."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDigestAlgorithm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration1.mmObject();
			isDerived = false;
			xmlTag = "DgstAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestAlgorithm";
			definition = "Digest algorithm the security module is able to manage.";
			minOccurs = 0;
			simpleType_lazy = () -> Algorithm11Code.mmObject();
		}
	};
	protected ATMSecurityConfiguration4 digitalSignature;
	/**
	 * Configuration of the digital signatures if the security module is able to
	 * perform digital signatures with an asymmetric key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration4
	 * ATMSecurityConfiguration4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1
	 * ATMSecurityConfiguration1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Configuration of the digital signatures if the security module is able to perform digital signatures with an asymmetric key."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDigitalSignature = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration1.mmObject();
			isDerived = false;
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Configuration of the digital signatures if the security module is able to perform digital signatures with an asymmetric key.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMSecurityConfiguration4.mmObject();
		}
	};
	protected ATMSecurityConfiguration5 pIN;
	/**
	 * Configuration of the PIN online verification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration5
	 * ATMSecurityConfiguration5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1
	 * ATMSecurityConfiguration1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of the PIN online verification."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPIN = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration1.mmObject();
			isDerived = false;
			xmlTag = "PIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PIN";
			definition = "Configuration of the PIN online verification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMSecurityConfiguration5.mmObject();
		}
	};
	protected List<MessageProtection1Code> messageProtection;
	/**
	 * Mechanism used to protect the message of the ATM protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageProtection1Code
	 * MessageProtection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration1
	 * ATMSecurityConfiguration1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgPrtcn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageProtection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mechanism used to protect the message of the ATM protocol."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageProtection = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration1.mmObject();
			isDerived = false;
			xmlTag = "MsgPrtcn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageProtection";
			definition = "Mechanism used to protect the message of the ATM protocol.";
			minOccurs = 0;
			simpleType_lazy = () -> MessageProtection1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMSecurityConfiguration1.mmKeys, ATMSecurityConfiguration1.mmEncryption, ATMSecurityConfiguration1.mmMACAlgorithm, ATMSecurityConfiguration1.mmDigestAlgorithm,
						ATMSecurityConfiguration1.mmDigitalSignature, ATMSecurityConfiguration1.mmPIN, ATMSecurityConfiguration1.mmMessageProtection);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityConfiguration1";
				definition = "Configuration parameters in use by the security device.";
				nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMSecurityConfiguration2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ATMSecurityConfiguration2 getKeys() {
		return keys;
	}

	public void setKeys(com.tools20022.repository.msg.ATMSecurityConfiguration2 keys) {
		this.keys = keys;
	}

	public ATMSecurityConfiguration3 getEncryption() {
		return encryption;
	}

	public void setEncryption(com.tools20022.repository.msg.ATMSecurityConfiguration3 encryption) {
		this.encryption = encryption;
	}

	public List<Algorithm12Code> getMACAlgorithm() {
		return mACAlgorithm;
	}

	public void setMACAlgorithm(List<Algorithm12Code> mACAlgorithm) {
		this.mACAlgorithm = mACAlgorithm;
	}

	public List<Algorithm11Code> getDigestAlgorithm() {
		return digestAlgorithm;
	}

	public void setDigestAlgorithm(List<Algorithm11Code> digestAlgorithm) {
		this.digestAlgorithm = digestAlgorithm;
	}

	public ATMSecurityConfiguration4 getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(com.tools20022.repository.msg.ATMSecurityConfiguration4 digitalSignature) {
		this.digitalSignature = digitalSignature;
	}

	public ATMSecurityConfiguration5 getPIN() {
		return pIN;
	}

	public void setPIN(com.tools20022.repository.msg.ATMSecurityConfiguration5 pIN) {
		this.pIN = pIN;
	}

	public List<MessageProtection1Code> getMessageProtection() {
		return messageProtection;
	}

	public void setMessageProtection(List<MessageProtection1Code> messageProtection) {
		this.messageProtection = messageProtection;
	}
}