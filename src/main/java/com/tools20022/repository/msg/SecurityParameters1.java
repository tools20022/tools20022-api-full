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
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Point of interaction parameters related to the security of software
 * application and application protocol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters1#mmPOIChallenge
 * SecurityParameters1.mmPOIChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters1#mmTMChallenge
 * SecurityParameters1.mmTMChallenge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityParameters1#mmSymmetricKey
 * SecurityParameters1.mmSymmetricKey}</li>
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
 * "SecurityParameters1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Point of interaction parameters related to the security of software application and application protocol."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecurityParameters2
 * SecurityParameters2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecurityParameters1", propOrder = {"POIChallenge", "TMChallenge", "symmetricKey"})
public class SecurityParameters1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Binary pOIChallenge;
	/**
	 * Point of interaction challenge for cryptographic key injection.
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
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters1
	 * SecurityParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIChllng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point of interaction challenge for cryptographic key injection."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters2#mmPOIChallenge
	 * SecurityParameters2.mmPOIChallenge}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPOIChallenge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityParameters1.mmObject();
			isDerived = false;
			xmlTag = "POIChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIChallenge";
			definition = "Point of interaction challenge for cryptographic key injection.";
			nextVersions_lazy = () -> Arrays.asList(SecurityParameters2.mmPOIChallenge);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	protected Max140Binary tMChallenge;
	/**
	 * Terminal manager challenge for cryptographic key injection.
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
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters1
	 * SecurityParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMChllng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMChallenge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Terminal manager challenge for cryptographic key injection."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters2#mmTMChallenge
	 * SecurityParameters2.mmTMChallenge}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTMChallenge = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityParameters1.mmObject();
			isDerived = false;
			xmlTag = "TMChllng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMChallenge";
			definition = "Terminal manager challenge for cryptographic key injection.";
			nextVersions_lazy = () -> Arrays.asList(SecurityParameters2.mmTMChallenge);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CryptographicKey2> symmetricKey;
	/**
	 * Key to inject in the point of interaction, protected by the temporary key
	 * previously sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CryptographicKey2
	 * CryptographicKey2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters1
	 * SecurityParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SmmtrcKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SymmetricKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Key to inject in the point of interaction, protected by the temporary key previously sent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityParameters2#mmSymmetricKey
	 * SecurityParameters2.mmSymmetricKey}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSymmetricKey = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SecurityParameters1.mmObject();
			isDerived = false;
			xmlTag = "SmmtrcKey";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SymmetricKey";
			definition = "Key to inject in the point of interaction, protected by the temporary key previously sent.";
			nextVersions_lazy = () -> Arrays.asList(SecurityParameters2.mmSymmetricKey);
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.CryptographicKey2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecurityParameters1.mmPOIChallenge, SecurityParameters1.mmTMChallenge, SecurityParameters1.mmSymmetricKey);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityParameters1";
				definition = "Point of interaction parameters related to the security of software application and application protocol.";
				nextVersions_lazy = () -> Arrays.asList(SecurityParameters2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "POIChllng")
	public Max140Binary getPOIChallenge() {
		return pOIChallenge;
	}

	public void setPOIChallenge(Max140Binary pOIChallenge) {
		this.pOIChallenge = pOIChallenge;
	}

	@XmlElement(name = "TMChllng")
	public Max140Binary getTMChallenge() {
		return tMChallenge;
	}

	public void setTMChallenge(Max140Binary tMChallenge) {
		this.tMChallenge = tMChallenge;
	}

	@XmlElement(name = "SmmtrcKey")
	public List<CryptographicKey2> getSymmetricKey() {
		return symmetricKey;
	}

	public void setSymmetricKey(List<com.tools20022.repository.msg.CryptographicKey2> symmetricKey) {
		this.symmetricKey = symmetricKey;
	}
}