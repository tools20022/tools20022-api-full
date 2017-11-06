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
import com.tools20022.repository.codeset.CryptographicKeyType4Code;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Max5000Binary;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Parameters to be used by the various cryptographic key commands.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMConfigurationParameter2#mmKeyCategory
 * ATMConfigurationParameter2.mmKeyCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMConfigurationParameter2#mmHostChallenge
 * ATMConfigurationParameter2.mmHostChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMConfigurationParameter2#mmCertificate
 * ATMConfigurationParameter2.mmCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMConfigurationParameter2#mmKeyProperties
 * ATMConfigurationParameter2.mmKeyProperties}</li>
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
 * "ATMConfigurationParameter2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters to be used by the various cryptographic key commands."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMConfigurationParameter1
 * ATMConfigurationParameter1}</li>
 * </ul>
 */
public class ATMConfigurationParameter2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CryptographicKeyType4Code keyCategory;
	/**
	 * Category of the cryptographic key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CryptographicKeyType4Code
	 * CryptographicKeyType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMConfigurationParameter2
	 * ATMConfigurationParameter2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of the cryptographic key."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmKeyCategory = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMConfigurationParameter2.mmObject();
			isDerived = false;
			xmlTag = "KeyCtgy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyCategory";
			definition = "Category of the cryptographic key.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CryptographicKeyType4Code.mmObject();
		}
	};
	protected Max140Binary hostChallenge;
	/**
	 * Random value from the host provided during a previous exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMConfigurationParameter2
	 * ATMConfigurationParameter2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstChllng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Random value from the host provided during a previous exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHostChallenge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMConfigurationParameter2.mmObject();
			isDerived = false;
			xmlTag = "HstChllng";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostChallenge";
			definition = "Random value from the host provided during a previous exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	protected List<Max5000Binary> certificate;
	/**
	 * Ordered certificate chain of the asymmetric key encryption key, starting
	 * with the host certificate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMConfigurationParameter2
	 * ATMConfigurationParameter2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cert"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ordered certificate chain of the asymmetric key encryption key, starting with the host certificate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMConfigurationParameter2.mmObject();
			isDerived = false;
			xmlTag = "Cert";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "Ordered certificate chain of the asymmetric key encryption key, starting with the host certificate.";
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.KEKIdentifier4> keyProperties;
	/**
	 * Cryptographic key involved in the security command.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.KEKIdentifier4
	 * KEKIdentifier4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMConfigurationParameter2
	 * ATMConfigurationParameter2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "KeyProps"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyProperties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cryptographic key involved in the security command."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmKeyProperties = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMConfigurationParameter2.mmObject();
			isDerived = false;
			xmlTag = "KeyProps";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyProperties";
			definition = "Cryptographic key involved in the security command.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.KEKIdentifier4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMConfigurationParameter2.mmKeyCategory, com.tools20022.repository.msg.ATMConfigurationParameter2.mmHostChallenge,
						com.tools20022.repository.msg.ATMConfigurationParameter2.mmCertificate, com.tools20022.repository.msg.ATMConfigurationParameter2.mmKeyProperties);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ATMConfigurationParameter2";
				definition = "Parameters to be used by the various cryptographic key commands.";
				previousVersion_lazy = () -> ATMConfigurationParameter1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CryptographicKeyType4Code getKeyCategory() {
		return keyCategory;
	}

	public void setKeyCategory(CryptographicKeyType4Code keyCategory) {
		this.keyCategory = keyCategory;
	}

	public Max140Binary getHostChallenge() {
		return hostChallenge;
	}

	public void setHostChallenge(Max140Binary hostChallenge) {
		this.hostChallenge = hostChallenge;
	}

	public List<Max5000Binary> getCertificate() {
		return certificate;
	}

	public void setCertificate(List<Max5000Binary> certificate) {
		this.certificate = certificate;
	}

	public List<KEKIdentifier4> getKeyProperties() {
		return keyProperties;
	}

	public void setKeyProperties(List<com.tools20022.repository.msg.KEKIdentifier4> keyProperties) {
		this.keyProperties = keyProperties;
	}
}