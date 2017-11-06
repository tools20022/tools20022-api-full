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
import com.tools20022.repository.datatype.Number;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Information of the certificate to create.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificationRequest2#mmVersion
 * CertificationRequest2.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificationRequest2#mmSubjectName
 * CertificationRequest2.mmSubjectName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificationRequest2#mmSubjectPublicKeyInformation
 * CertificationRequest2.mmSubjectPublicKeyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CertificationRequest2#mmAttribute
 * CertificationRequest2.mmAttribute}</li>
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
 * "CertificationRequest2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information of the certificate to create."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CertificationRequest1
 * CertificationRequest1}</li>
 * </ul>
 */
public class CertificationRequest2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number version;
	/**
	 * Version of the certificate request information data structure.
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
	 * {@linkplain com.tools20022.repository.msg.CertificationRequest2
	 * CertificationRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Version of the certificate request information data structure."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CertificationRequest1#mmKeyIdentification
	 * CertificationRequest1.mmKeyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CertificationRequest2.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the certificate request information data structure.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CertificationRequest1.mmKeyIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected CertificateIssuer1 subjectName;
	/**
	 * Distinguished name of the certificate subject, the entity whose public
	 * key is to be certified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CertificateIssuer1
	 * CertificateIssuer1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificationRequest2
	 * CertificationRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbjtNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distinguished name of the certificate subject, the entity whose public key is to be certified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubjectName = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CertificationRequest2.mmObject();
			isDerived = false;
			xmlTag = "SbjtNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectName";
			definition = "Distinguished name of the certificate subject, the entity whose public key is to be certified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CertificateIssuer1.mmObject();
		}
	};
	protected PublicRSAKey2 subjectPublicKeyInformation;
	/**
	 * Information about the public key being certified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PublicRSAKey2
	 * PublicRSAKey2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificationRequest2
	 * CertificationRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbjtPblcKeyInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubjectPublicKeyInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the public key being certified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSubjectPublicKeyInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CertificationRequest2.mmObject();
			isDerived = false;
			xmlTag = "SbjtPblcKeyInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubjectPublicKeyInformation";
			definition = "Information about the public key being certified.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PublicRSAKey2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.RelativeDistinguishedName2> attribute;
	/**
	 * Attribute of the certificate service to be put in the certificate
	 * extensions, or to be used for the request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RelativeDistinguishedName2
	 * RelativeDistinguishedName2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CertificationRequest2
	 * CertificationRequest2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Attr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attribute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Attribute of the certificate service to be put in the certificate extensions, or to be used for the request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAttribute = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CertificationRequest2.mmObject();
			isDerived = false;
			xmlTag = "Attr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attribute";
			definition = "Attribute of the certificate service to be put in the certificate extensions, or to be used for the request.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RelativeDistinguishedName2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CertificationRequest2.mmVersion, com.tools20022.repository.msg.CertificationRequest2.mmSubjectName,
						com.tools20022.repository.msg.CertificationRequest2.mmSubjectPublicKeyInformation, com.tools20022.repository.msg.CertificationRequest2.mmAttribute);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CertificationRequest2";
				definition = "Information of the certificate to create.";
				previousVersion_lazy = () -> CertificationRequest1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Number getVersion() {
		return version;
	}

	public void setVersion(Number version) {
		this.version = version;
	}

	public CertificateIssuer1 getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(com.tools20022.repository.msg.CertificateIssuer1 subjectName) {
		this.subjectName = subjectName;
	}

	public PublicRSAKey2 getSubjectPublicKeyInformation() {
		return subjectPublicKeyInformation;
	}

	public void setSubjectPublicKeyInformation(com.tools20022.repository.msg.PublicRSAKey2 subjectPublicKeyInformation) {
		this.subjectPublicKeyInformation = subjectPublicKeyInformation;
	}

	public List<RelativeDistinguishedName2> getAttribute() {
		return attribute;
	}

	public void setAttribute(List<com.tools20022.repository.msg.RelativeDistinguishedName2> attribute) {
		this.attribute = attribute;
	}
}