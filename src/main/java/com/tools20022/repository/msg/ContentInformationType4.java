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
import com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV02;
import com.tools20022.repository.area.caaa.AcceptorBatchTransferV02;
import com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV02;
import com.tools20022.repository.area.catm.ManagementPlanReplacementV02;
import com.tools20022.repository.area.catm.StatusReportV02;
import com.tools20022.repository.codeset.ContentType1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General cryptographic message syntax (CMS) containing protected data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType4#mmContentType
 * ContentInformationType4.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType4#mmEnvelopedData
 * ContentInformationType4.mmEnvelopedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType4#mmAuthenticatedData
 * ContentInformationType4.mmAuthenticatedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType4#mmSignedData
 * ContentInformationType4.mmSignedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType4#mmDigestedData
 * ContentInformationType4.mmDigestedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType4#mmNamedKeyEncryptedData
 * ContentInformationType4.mmNamedKeyEncryptedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV02#mmSecurityTrailer
 * ManagementPlanReplacementV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV02#mmSecurityTrailer
 * StatusReportV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV02#mmSecurityTrailer
 * AcceptorConfigurationUpdateV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV02#mmSecurityTrailer
 * AcceptorBatchTransferV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV02#mmSecurityTrailer
 * AcceptorBatchTransferResponseV02.mmSecurityTrailer}</li>
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
 * "ContentInformationType4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing protected data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContentInformationType9
 * ContentInformationType9}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ContentInformationType1
 * ContentInformationType1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContentInformationType4", propOrder = {"contentType", "envelopedData", "authenticatedData", "signedData", "digestedData", "namedKeyEncryptedData"})
public class ContentInformationType4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CnttTp", required = true)
	protected ContentType1Code contentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType1Code
	 * ContentType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType4
	 * ContentInformationType4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CnttTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of data protection."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmContentType
	 * ContentInformationType9.mmContentType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType4.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType9.mmContentType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType1Code.mmObject();
		}
	};
	@XmlElement(name = "EnvlpdData")
	protected EnvelopedData2 envelopedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EnvelopedData2
	 * EnvelopedData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType4
	 * ContentInformationType4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EnvlpdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnvelopedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protection by encryption, with a session key."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmEnvelopedData
	 * ContentInformationType9.mmEnvelopedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnvelopedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType4.mmObject();
			isDerived = false;
			xmlTag = "EnvlpdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvelopedData";
			definition = "Data protection by encryption, with a session key.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType9.mmEnvelopedData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EnvelopedData2.mmObject();
		}
	};
	@XmlElement(name = "AuthntcdData")
	protected AuthenticatedData2 authenticatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthenticatedData2
	 * AuthenticatedData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType4
	 * ContentInformationType4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthntcdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protection by a message authentication code (MAC)."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmAuthenticatedData
	 * ContentInformationType9.mmAuthenticatedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthenticatedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType4.mmObject();
			isDerived = false;
			xmlTag = "AuthntcdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			definition = "Data protection by a message authentication code (MAC).";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType9.mmAuthenticatedData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AuthenticatedData2.mmObject();
		}
	};
	@XmlElement(name = "SgndData")
	protected SignedData2 signedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedData2
	 * SignedData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType4
	 * ContentInformationType4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SgndData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protected by digital signatures."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmSignedData
	 * ContentInformationType9.mmSignedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSignedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType4.mmObject();
			isDerived = false;
			xmlTag = "SgndData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedData";
			definition = "Data protected by digital signatures.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType9.mmSignedData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedData2.mmObject();
		}
	};
	@XmlElement(name = "DgstdData")
	protected DigestedData2 digestedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DigestedData2
	 * DigestedData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType4
	 * ContentInformationType4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgstdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigestedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Data protected by a digest."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmDigestedData
	 * ContentInformationType9.mmDigestedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDigestedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType4.mmObject();
			isDerived = false;
			xmlTag = "DgstdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestedData";
			definition = "Data protected by a digest.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType9.mmDigestedData);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DigestedData2.mmObject();
		}
	};
	@XmlElement(name = "NmdKeyNcrptdData")
	protected NamedKeyEncryptedData2 namedKeyEncryptedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData2
	 * NamedKeyEncryptedData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType4
	 * ContentInformationType4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmdKeyNcrptdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NamedKeyEncryptedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data protection by encryption with a previously exchanged key identified by a name."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNamedKeyEncryptedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType4.mmObject();
			isDerived = false;
			xmlTag = "NmdKeyNcrptdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamedKeyEncryptedData";
			definition = "Data protection by encryption with a previously exchanged key identified by a name.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NamedKeyEncryptedData2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType4.mmContentType, com.tools20022.repository.msg.ContentInformationType4.mmEnvelopedData,
						com.tools20022.repository.msg.ContentInformationType4.mmAuthenticatedData, com.tools20022.repository.msg.ContentInformationType4.mmSignedData, com.tools20022.repository.msg.ContentInformationType4.mmDigestedData,
						com.tools20022.repository.msg.ContentInformationType4.mmNamedKeyEncryptedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(ManagementPlanReplacementV02.mmSecurityTrailer, StatusReportV02.mmSecurityTrailer, AcceptorConfigurationUpdateV02.mmSecurityTrailer,
						AcceptorBatchTransferV02.mmSecurityTrailer, AcceptorBatchTransferResponseV02.mmSecurityTrailer);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType4";
				definition = "General cryptographic message syntax (CMS) containing protected data.";
				nextVersions_lazy = () -> Arrays.asList(ContentInformationType9.mmObject());
				previousVersion_lazy = () -> ContentInformationType1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ContentType1Code getContentType() {
		return contentType;
	}

	public ContentInformationType4 setContentType(ContentType1Code contentType) {
		this.contentType = Objects.requireNonNull(contentType);
		return this;
	}

	public Optional<EnvelopedData2> getEnvelopedData() {
		return envelopedData == null ? Optional.empty() : Optional.of(envelopedData);
	}

	public ContentInformationType4 setEnvelopedData(com.tools20022.repository.msg.EnvelopedData2 envelopedData) {
		this.envelopedData = envelopedData;
		return this;
	}

	public Optional<AuthenticatedData2> getAuthenticatedData() {
		return authenticatedData == null ? Optional.empty() : Optional.of(authenticatedData);
	}

	public ContentInformationType4 setAuthenticatedData(com.tools20022.repository.msg.AuthenticatedData2 authenticatedData) {
		this.authenticatedData = authenticatedData;
		return this;
	}

	public Optional<SignedData2> getSignedData() {
		return signedData == null ? Optional.empty() : Optional.of(signedData);
	}

	public ContentInformationType4 setSignedData(com.tools20022.repository.msg.SignedData2 signedData) {
		this.signedData = signedData;
		return this;
	}

	public Optional<DigestedData2> getDigestedData() {
		return digestedData == null ? Optional.empty() : Optional.of(digestedData);
	}

	public ContentInformationType4 setDigestedData(com.tools20022.repository.msg.DigestedData2 digestedData) {
		this.digestedData = digestedData;
		return this;
	}

	public Optional<NamedKeyEncryptedData2> getNamedKeyEncryptedData() {
		return namedKeyEncryptedData == null ? Optional.empty() : Optional.of(namedKeyEncryptedData);
	}

	public ContentInformationType4 setNamedKeyEncryptedData(com.tools20022.repository.msg.NamedKeyEncryptedData2 namedKeyEncryptedData) {
		this.namedKeyEncryptedData = namedKeyEncryptedData;
		return this;
	}
}