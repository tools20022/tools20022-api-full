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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Algorithm13Code;
import com.tools20022.repository.codeset.Algorithm15Code;
import com.tools20022.repository.codeset.Algorithm7Code;
import com.tools20022.repository.codeset.EncryptionFormat1Code;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Configuration of the encryption or digital envelope, if the security module
 * is able to perform encryption.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3#mmAsymmetricEncryption
 * ATMSecurityConfiguration3.mmAsymmetricEncryption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3#mmAsymmetricKeyStandardIdentification
 * ATMSecurityConfiguration3.mmAsymmetricKeyStandardIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3#mmAsymmetricEncryptionAlgorithm
 * ATMSecurityConfiguration3.mmAsymmetricEncryptionAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3#mmSymmetricTransportKey
 * ATMSecurityConfiguration3.mmSymmetricTransportKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3#mmSymmetricTransportKeyAlgorithm
 * ATMSecurityConfiguration3.mmSymmetricTransportKeyAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3#mmSymmetricEncryptionAlgorithm
 * ATMSecurityConfiguration3.mmSymmetricEncryptionAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3#mmEncryptionFormat
 * ATMSecurityConfiguration3.mmEncryptionFormat}</li>
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
 * "ATMSecurityConfiguration3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Configuration of the encryption or digital envelope, if the security module is able to perform encryption."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration4
 * ATMSecurityConfiguration4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration2
 * ATMSecurityConfiguration2}</li>
 * </ul>
 */
public class ATMSecurityConfiguration3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TrueFalseIndicator asymmetricEncryption;
	/**
	 * True if the security module is able to perform encryption with an
	 * asymmetric key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3
	 * ATMSecurityConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsmmtrcNcrptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsymmetricEncryption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if the security module is able to perform encryption with an asymmetric key."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAsymmetricEncryption = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "AsmmtrcNcrptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AsymmetricEncryption";
			definition = "True if the security module is able to perform encryption with an asymmetric key.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator asymmetricKeyStandardIdentification;
	/**
	 * True if the security module is able to identify an asymmetric key with
	 * certificate issuer X.500 name and certificate serial number. False if a
	 * proprietary asymmetric key identifier is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3
	 * ATMSecurityConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsmmtrcKeyStdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsymmetricKeyStandardIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if the security module is able to identify an asymmetric key with certificate issuer X.500 name and certificate serial number. False if a proprietary asymmetric key identifier is required."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAsymmetricKeyStandardIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "AsmmtrcKeyStdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AsymmetricKeyStandardIdentification";
			definition = "True if the security module is able to identify an asymmetric key with certificate issuer X.500 name and certificate serial number. False if a proprietary asymmetric key identifier is required.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected List<Algorithm7Code> asymmetricEncryptionAlgorithm;
	/**
	 * Asymmetric encryption algorithm the security module is able to manage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm7Code
	 * Algorithm7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3
	 * ATMSecurityConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AsmmtrcNcrptnAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsymmetricEncryptionAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Asymmetric encryption algorithm the security module is able to manage."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAsymmetricEncryptionAlgorithm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "AsmmtrcNcrptnAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AsymmetricEncryptionAlgorithm";
			definition = "Asymmetric encryption algorithm the security module is able to manage.";
			minOccurs = 0;
			simpleType_lazy = () -> Algorithm7Code.mmObject();
		}
	};
	protected TrueFalseIndicator symmetricTransportKey;
	/**
	 * True if the security module is able to manage a symmetric transport
	 * session key to protect cryptographic keys and data. False if only a
	 * previously exchanged symmetric key must be used; a proprietary symmetric
	 * key identifier is then used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3
	 * ATMSecurityConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SmmtrcTrnsprtKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SymmetricTransportKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if the security module is able to manage a symmetric transport session key to protect cryptographic keys and data. False if only a previously exchanged symmetric key must be used; a proprietary symmetric key identifier is then used."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSymmetricTransportKey = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "SmmtrcTrnsprtKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SymmetricTransportKey";
			definition = "True if the security module is able to manage a symmetric transport session key to protect cryptographic keys and data. False if only a previously exchanged symmetric key must be used; a proprietary symmetric key identifier is then used.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected List<Algorithm13Code> symmetricTransportKeyAlgorithm;
	/**
	 * Symmetric transport session key algorithm the security module is able to
	 * manage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm13Code
	 * Algorithm13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3
	 * ATMSecurityConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SmmtrcTrnsprtKeyAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SymmetricTransportKeyAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Symmetric transport session key algorithm the security module is able to manage."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration4#mmDigitalSignatureAlgorithm
	 * ATMSecurityConfiguration4.mmDigitalSignatureAlgorithm}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSymmetricTransportKeyAlgorithm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "SmmtrcTrnsprtKeyAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SymmetricTransportKeyAlgorithm";
			definition = "Symmetric transport session key algorithm the security module is able to manage.";
			nextVersions_lazy = () -> Arrays.asList(ATMSecurityConfiguration4.mmDigitalSignatureAlgorithm);
			minOccurs = 0;
			simpleType_lazy = () -> Algorithm13Code.mmObject();
		}
	};
	protected List<Algorithm15Code> symmetricEncryptionAlgorithm;
	/**
	 * Symmetric encryption algorithm the security module is able to manage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm15Code
	 * Algorithm15Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3
	 * ATMSecurityConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SmmtrcNcrptnAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SymmetricEncryptionAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Symmetric encryption algorithm the security module is able to manage."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSymmetricEncryptionAlgorithm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "SmmtrcNcrptnAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SymmetricEncryptionAlgorithm";
			definition = "Symmetric encryption algorithm the security module is able to manage.";
			minOccurs = 0;
			simpleType_lazy = () -> Algorithm15Code.mmObject();
		}
	};
	protected List<EncryptionFormat1Code> encryptionFormat;
	/**
	 * Format of data before encryption, if the format is not plaintext or
	 * implicit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EncryptionFormat1Code
	 * EncryptionFormat1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3
	 * ATMSecurityConfiguration3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NcrptnFrmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EncryptionFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Format of data before encryption, if the format is not plaintext or implicit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEncryptionFormat = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration3.mmObject();
			isDerived = false;
			xmlTag = "NcrptnFrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EncryptionFormat";
			definition = "Format of data before encryption, if the format is not plaintext or implicit.";
			minOccurs = 0;
			simpleType_lazy = () -> EncryptionFormat1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMSecurityConfiguration3.mmAsymmetricEncryption, ATMSecurityConfiguration3.mmAsymmetricKeyStandardIdentification, ATMSecurityConfiguration3.mmAsymmetricEncryptionAlgorithm,
						ATMSecurityConfiguration3.mmSymmetricTransportKey, ATMSecurityConfiguration3.mmSymmetricTransportKeyAlgorithm, ATMSecurityConfiguration3.mmSymmetricEncryptionAlgorithm, ATMSecurityConfiguration3.mmEncryptionFormat);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityConfiguration3";
				definition = "Configuration of the encryption or digital envelope, if the security module is able to perform encryption.";
				nextVersions_lazy = () -> Arrays.asList(ATMSecurityConfiguration4.mmObject());
				previousVersion_lazy = () -> ATMSecurityConfiguration2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TrueFalseIndicator getAsymmetricEncryption() {
		return asymmetricEncryption;
	}

	public void setAsymmetricEncryption(TrueFalseIndicator asymmetricEncryption) {
		this.asymmetricEncryption = asymmetricEncryption;
	}

	public TrueFalseIndicator getAsymmetricKeyStandardIdentification() {
		return asymmetricKeyStandardIdentification;
	}

	public void setAsymmetricKeyStandardIdentification(TrueFalseIndicator asymmetricKeyStandardIdentification) {
		this.asymmetricKeyStandardIdentification = asymmetricKeyStandardIdentification;
	}

	public List<Algorithm7Code> getAsymmetricEncryptionAlgorithm() {
		return asymmetricEncryptionAlgorithm;
	}

	public void setAsymmetricEncryptionAlgorithm(List<Algorithm7Code> asymmetricEncryptionAlgorithm) {
		this.asymmetricEncryptionAlgorithm = asymmetricEncryptionAlgorithm;
	}

	public TrueFalseIndicator getSymmetricTransportKey() {
		return symmetricTransportKey;
	}

	public void setSymmetricTransportKey(TrueFalseIndicator symmetricTransportKey) {
		this.symmetricTransportKey = symmetricTransportKey;
	}

	public List<Algorithm13Code> getSymmetricTransportKeyAlgorithm() {
		return symmetricTransportKeyAlgorithm;
	}

	public void setSymmetricTransportKeyAlgorithm(List<Algorithm13Code> symmetricTransportKeyAlgorithm) {
		this.symmetricTransportKeyAlgorithm = symmetricTransportKeyAlgorithm;
	}

	public List<Algorithm15Code> getSymmetricEncryptionAlgorithm() {
		return symmetricEncryptionAlgorithm;
	}

	public void setSymmetricEncryptionAlgorithm(List<Algorithm15Code> symmetricEncryptionAlgorithm) {
		this.symmetricEncryptionAlgorithm = symmetricEncryptionAlgorithm;
	}

	public List<EncryptionFormat1Code> getEncryptionFormat() {
		return encryptionFormat;
	}

	public void setEncryptionFormat(List<EncryptionFormat1Code> encryptionFormat) {
		this.encryptionFormat = encryptionFormat;
	}
}