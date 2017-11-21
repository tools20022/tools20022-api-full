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
import com.tools20022.repository.codeset.Algorithm14Code;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Configuration of the digital signatures if the security module is able to
 * perform digital signatures with an asymmetric key.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration4#mmMaximumCertificates
 * ATMSecurityConfiguration4.mmMaximumCertificates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration4#mmMaximumSignatures
 * ATMSecurityConfiguration4.mmMaximumSignatures}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration4#mmDigitalSignatureAlgorithm
 * ATMSecurityConfiguration4.mmDigitalSignatureAlgorithm}</li>
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
 * "ATMSecurityConfiguration4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Configuration of the digital signatures if the security module is able to perform digital signatures with an asymmetric key."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration5
 * ATMSecurityConfiguration5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3
 * ATMSecurityConfiguration3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMSecurityConfiguration4", propOrder = {"maximumCertificates", "maximumSignatures", "digitalSignatureAlgorithm"})
public class ATMSecurityConfiguration4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number maximumCertificates;
	/**
	 * Maximum number of certificates in a certificate path, the security module
	 * is able to manage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration4
	 * ATMSecurityConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxCerts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumCertificates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of certificates in a certificate path, the security module is able to manage."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumCertificates = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "MaxCerts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumCertificates";
			definition = "Maximum number of certificates in a certificate path, the security module is able to manage.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected Number maximumSignatures;
	/**
	 * Maximum number of cosigners, the security module is able to manage in a
	 * digital signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration4
	 * ATMSecurityConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxSgntrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumSignatures"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Maximum number of cosigners, the security module is able to manage in a digital signature."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumSignatures = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "MaxSgntrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumSignatures";
			definition = "Maximum number of cosigners, the security module is able to manage in a digital signature.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected List<Algorithm14Code> digitalSignatureAlgorithm;
	/**
	 * Digital signature algorithm the security module is able to manage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm14Code
	 * Algorithm14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration4
	 * ATMSecurityConfiguration4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntrAlgo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignatureAlgorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Digital signature algorithm the security module is able to manage."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ATMSecurityConfiguration3#mmSymmetricTransportKeyAlgorithm
	 * ATMSecurityConfiguration3.mmSymmetricTransportKeyAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDigitalSignatureAlgorithm = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMSecurityConfiguration4.mmObject();
			isDerived = false;
			xmlTag = "DgtlSgntrAlgo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignatureAlgorithm";
			definition = "Digital signature algorithm the security module is able to manage.";
			previousVersion_lazy = () -> ATMSecurityConfiguration3.mmSymmetricTransportKeyAlgorithm;
			minOccurs = 0;
			simpleType_lazy = () -> Algorithm14Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMSecurityConfiguration4.mmMaximumCertificates, ATMSecurityConfiguration4.mmMaximumSignatures, ATMSecurityConfiguration4.mmDigitalSignatureAlgorithm);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMSecurityConfiguration4";
				definition = "Configuration of the digital signatures if the security module is able to perform digital signatures with an asymmetric key.";
				nextVersions_lazy = () -> Arrays.asList(ATMSecurityConfiguration5.mmObject());
				previousVersion_lazy = () -> ATMSecurityConfiguration3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MaxCerts")
	public Number getMaximumCertificates() {
		return maximumCertificates;
	}

	public void setMaximumCertificates(Number maximumCertificates) {
		this.maximumCertificates = maximumCertificates;
	}

	@XmlElement(name = "MaxSgntrs")
	public Number getMaximumSignatures() {
		return maximumSignatures;
	}

	public void setMaximumSignatures(Number maximumSignatures) {
		this.maximumSignatures = maximumSignatures;
	}

	@XmlElement(name = "DgtlSgntrAlgo")
	public List<Algorithm14Code> getDigitalSignatureAlgorithm() {
		return digitalSignatureAlgorithm;
	}

	public void setDigitalSignatureAlgorithm(List<Algorithm14Code> digitalSignatureAlgorithm) {
		this.digitalSignatureAlgorithm = digitalSignatureAlgorithm;
	}
}