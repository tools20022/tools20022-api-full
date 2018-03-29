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
import com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV01;
import com.tools20022.repository.area.caaa.AcceptorBatchTransferV01;
import com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV01;
import com.tools20022.repository.area.catm.ManagementPlanReplacementV01;
import com.tools20022.repository.area.catm.StatusReportV01;
import com.tools20022.repository.codeset.ContentType1Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
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
 * {@linkplain com.tools20022.repository.msg.ContentInformationType1#mmContentType
 * ContentInformationType1.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType1#mmEnvelopedData
 * ContentInformationType1.mmEnvelopedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType1#mmAuthenticatedData
 * ContentInformationType1.mmAuthenticatedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType1#mmSignedData
 * ContentInformationType1.mmSignedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType1#mmDigestedData
 * ContentInformationType1.mmDigestedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType1#mmNamedKeyEncryptedData
 * ContentInformationType1.mmNamedKeyEncryptedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV01#mmSecurityTrailer
 * ManagementPlanReplacementV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV01#mmSecurityTrailer
 * StatusReportV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV01#mmSecurityTrailer
 * AcceptorConfigurationUpdateV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV01#mmSecurityTrailer
 * AcceptorBatchTransferV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV01#mmSecurityTrailer
 * AcceptorBatchTransferResponseV01.mmSecurityTrailer}</li>
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
 * "ContentInformationType1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing protected data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContentInformationType4
 * ContentInformationType4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContentInformationType1", propOrder = {"contentType", "envelopedData", "authenticatedData", "signedData", "digestedData", "namedKeyEncryptedData"})
public class ContentInformationType1 {

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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType1
	 * ContentInformationType1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute<ContentInformationType1, ContentType1Code> mmContentType = new MMMessageAttribute<ContentInformationType1, ContentType1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType1.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType1Code.mmObject();
		}

		@Override
		public ContentType1Code getValue(ContentInformationType1 obj) {
			return obj.getContentType();
		}

		@Override
		public void setValue(ContentInformationType1 obj, ContentType1Code value) {
			obj.setContentType(value);
		}
	};
	@XmlElement(name = "EnvlpdData")
	protected EnvelopedData1 envelopedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EnvelopedData1
	 * EnvelopedData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType1
	 * ContentInformationType1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContentInformationType1, Optional<EnvelopedData1>> mmEnvelopedData = new MMMessageAssociationEnd<ContentInformationType1, Optional<EnvelopedData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType1.mmObject();
			isDerived = false;
			xmlTag = "EnvlpdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvelopedData";
			definition = "Data protection by encryption, with a session key.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> EnvelopedData1.mmObject();
		}

		@Override
		public Optional<EnvelopedData1> getValue(ContentInformationType1 obj) {
			return obj.getEnvelopedData();
		}

		@Override
		public void setValue(ContentInformationType1 obj, Optional<EnvelopedData1> value) {
			obj.setEnvelopedData(value.orElse(null));
		}
	};
	@XmlElement(name = "AuthntcdData")
	protected AuthenticatedData1 authenticatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthenticatedData1
	 * AuthenticatedData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType1
	 * ContentInformationType1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContentInformationType1, Optional<AuthenticatedData1>> mmAuthenticatedData = new MMMessageAssociationEnd<ContentInformationType1, Optional<AuthenticatedData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType1.mmObject();
			isDerived = false;
			xmlTag = "AuthntcdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			definition = "Data protection by a message authentication code (MAC).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AuthenticatedData1.mmObject();
		}

		@Override
		public Optional<AuthenticatedData1> getValue(ContentInformationType1 obj) {
			return obj.getAuthenticatedData();
		}

		@Override
		public void setValue(ContentInformationType1 obj, Optional<AuthenticatedData1> value) {
			obj.setAuthenticatedData(value.orElse(null));
		}
	};
	@XmlElement(name = "SgndData")
	protected SignedData1 signedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedData1
	 * SignedData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType1
	 * ContentInformationType1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContentInformationType1, Optional<SignedData1>> mmSignedData = new MMMessageAssociationEnd<ContentInformationType1, Optional<SignedData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType1.mmObject();
			isDerived = false;
			xmlTag = "SgndData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedData";
			definition = "Data protected by digital signatures.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SignedData1.mmObject();
		}

		@Override
		public Optional<SignedData1> getValue(ContentInformationType1 obj) {
			return obj.getSignedData();
		}

		@Override
		public void setValue(ContentInformationType1 obj, Optional<SignedData1> value) {
			obj.setSignedData(value.orElse(null));
		}
	};
	@XmlElement(name = "DgstdData")
	protected DigestedData1 digestedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DigestedData1
	 * DigestedData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType1
	 * ContentInformationType1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ContentInformationType1, Optional<DigestedData1>> mmDigestedData = new MMMessageAssociationEnd<ContentInformationType1, Optional<DigestedData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType1.mmObject();
			isDerived = false;
			xmlTag = "DgstdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestedData";
			definition = "Data protected by a digest.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DigestedData1.mmObject();
		}

		@Override
		public Optional<DigestedData1> getValue(ContentInformationType1 obj) {
			return obj.getDigestedData();
		}

		@Override
		public void setValue(ContentInformationType1 obj, Optional<DigestedData1> value) {
			obj.setDigestedData(value.orElse(null));
		}
	};
	@XmlElement(name = "NmdKeyNcrptdData")
	protected NamedKeyEncryptedData1 namedKeyEncryptedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NamedKeyEncryptedData1
	 * NamedKeyEncryptedData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType1
	 * ContentInformationType1}</li>
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
	public static final MMMessageAssociationEnd<ContentInformationType1, Optional<NamedKeyEncryptedData1>> mmNamedKeyEncryptedData = new MMMessageAssociationEnd<ContentInformationType1, Optional<NamedKeyEncryptedData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType1.mmObject();
			isDerived = false;
			xmlTag = "NmdKeyNcrptdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamedKeyEncryptedData";
			definition = "Data protection by encryption with a previously exchanged key identified by a name.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> NamedKeyEncryptedData1.mmObject();
		}

		@Override
		public Optional<NamedKeyEncryptedData1> getValue(ContentInformationType1 obj) {
			return obj.getNamedKeyEncryptedData();
		}

		@Override
		public void setValue(ContentInformationType1 obj, Optional<NamedKeyEncryptedData1> value) {
			obj.setNamedKeyEncryptedData(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType1.mmContentType, com.tools20022.repository.msg.ContentInformationType1.mmEnvelopedData,
						com.tools20022.repository.msg.ContentInformationType1.mmAuthenticatedData, com.tools20022.repository.msg.ContentInformationType1.mmSignedData, com.tools20022.repository.msg.ContentInformationType1.mmDigestedData,
						com.tools20022.repository.msg.ContentInformationType1.mmNamedKeyEncryptedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(ManagementPlanReplacementV01.mmSecurityTrailer, StatusReportV01.mmSecurityTrailer, AcceptorConfigurationUpdateV01.mmSecurityTrailer,
						AcceptorBatchTransferV01.mmSecurityTrailer, AcceptorBatchTransferResponseV01.mmSecurityTrailer);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType1";
				definition = "General cryptographic message syntax (CMS) containing protected data.";
				nextVersions_lazy = () -> Arrays.asList(ContentInformationType4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public ContentType1Code getContentType() {
		return contentType;
	}

	public ContentInformationType1 setContentType(ContentType1Code contentType) {
		this.contentType = Objects.requireNonNull(contentType);
		return this;
	}

	public Optional<EnvelopedData1> getEnvelopedData() {
		return envelopedData == null ? Optional.empty() : Optional.of(envelopedData);
	}

	public ContentInformationType1 setEnvelopedData(EnvelopedData1 envelopedData) {
		this.envelopedData = envelopedData;
		return this;
	}

	public Optional<AuthenticatedData1> getAuthenticatedData() {
		return authenticatedData == null ? Optional.empty() : Optional.of(authenticatedData);
	}

	public ContentInformationType1 setAuthenticatedData(AuthenticatedData1 authenticatedData) {
		this.authenticatedData = authenticatedData;
		return this;
	}

	public Optional<SignedData1> getSignedData() {
		return signedData == null ? Optional.empty() : Optional.of(signedData);
	}

	public ContentInformationType1 setSignedData(SignedData1 signedData) {
		this.signedData = signedData;
		return this;
	}

	public Optional<DigestedData1> getDigestedData() {
		return digestedData == null ? Optional.empty() : Optional.of(digestedData);
	}

	public ContentInformationType1 setDigestedData(DigestedData1 digestedData) {
		this.digestedData = digestedData;
		return this;
	}

	public Optional<NamedKeyEncryptedData1> getNamedKeyEncryptedData() {
		return namedKeyEncryptedData == null ? Optional.empty() : Optional.of(namedKeyEncryptedData);
	}

	public ContentInformationType1 setNamedKeyEncryptedData(NamedKeyEncryptedData1 namedKeyEncryptedData) {
		this.namedKeyEncryptedData = namedKeyEncryptedData;
		return this;
	}
}