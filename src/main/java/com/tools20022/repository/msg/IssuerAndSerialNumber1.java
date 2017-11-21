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
import com.tools20022.repository.datatype.Max35Binary;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Certificate issuer name and serial number (see X.509).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerAndSerialNumber1#mmIssuer
 * IssuerAndSerialNumber1.mmIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IssuerAndSerialNumber1#mmSerialNumber
 * IssuerAndSerialNumber1.mmSerialNumber}</li>
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
 * "IssuerAndSerialNumber1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Certificate issuer name and serial number  (see X.509)."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IssuerAndSerialNumber1", propOrder = {"issuer", "serialNumber"})
public class IssuerAndSerialNumber1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CertificateIssuer1 issuer;
	/**
	 * Certificate issuer name (see X.509).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CertificateIssuer1
	 * CertificateIssuer1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IssuerAndSerialNumber1
	 * IssuerAndSerialNumber1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Issr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate issuer name (see X.509)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmIssuer = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IssuerAndSerialNumber1.mmObject();
			isDerived = false;
			xmlTag = "Issr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuer";
			definition = "Certificate issuer name (see X.509).";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CertificateIssuer1.mmObject();
		}
	};
	protected Max35Binary serialNumber;
	/**
	 * Certificate serial number (see X.509).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Binary
	 * Max35Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IssuerAndSerialNumber1
	 * IssuerAndSerialNumber1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrlNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SerialNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate serial number (see X.509)."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSerialNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IssuerAndSerialNumber1.mmObject();
			isDerived = false;
			xmlTag = "SrlNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SerialNumber";
			definition = "Certificate serial number (see X.509).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IssuerAndSerialNumber1.mmIssuer, IssuerAndSerialNumber1.mmSerialNumber);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IssuerAndSerialNumber1";
				definition = "Certificate issuer name and serial number  (see X.509).";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Issr", required = true)
	public CertificateIssuer1 getIssuer() {
		return issuer;
	}

	public void setIssuer(com.tools20022.repository.msg.CertificateIssuer1 issuer) {
		this.issuer = issuer;
	}

	@XmlElement(name = "SrlNb", required = true)
	public Max35Binary getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Max35Binary serialNumber) {
		this.serialNumber = serialNumber;
	}
}