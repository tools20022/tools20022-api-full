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
import com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV03;
import com.tools20022.repository.area.caaa.AcceptorBatchTransferV03;
import com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03;
import com.tools20022.repository.area.catm.ManagementPlanReplacementV03;
import com.tools20022.repository.area.catm.StatusReportV03;
import com.tools20022.repository.codeset.ContentType1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmContentType
 * ContentInformationType9.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmEnvelopedData
 * ContentInformationType9.mmEnvelopedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmAuthenticatedData
 * ContentInformationType9.mmAuthenticatedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmSignedData
 * ContentInformationType9.mmSignedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmDigestedData
 * ContentInformationType9.mmDigestedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV03#mmSecurityTrailer
 * AcceptorBatchTransferResponseV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV03#mmSecurityTrailer
 * AcceptorBatchTransferV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV03#mmSecurityTrailer
 * AcceptorConfigurationUpdateV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV03#mmSecurityTrailer
 * ManagementPlanReplacementV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV03#mmSecurityTrailer
 * StatusReportV03.mmSecurityTrailer}</li>
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
 * "ContentInformationType9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing protected data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContentInformationType12
 * ContentInformationType12}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ContentInformationType4
 * ContentInformationType4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ContentInformationType9", propOrder = {"contentType", "envelopedData", "authenticatedData", "signedData", "digestedData"})
public class ContentInformationType9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ContentType1Code contentType;
	/**
	 * Type of data protection.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9
	 * ContentInformationType9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmContentType
	 * ContentInformationType12.mmContentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType4#mmContentType
	 * ContentInformationType4.mmContentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContentInformationType9.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType12.mmContentType);
			previousVersion_lazy = () -> ContentInformationType4.mmContentType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType1Code.mmObject();
		}
	};
	protected EnvelopedData3 envelopedData;
	/**
	 * Data protection by encryption, with a session key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EnvelopedData3
	 * EnvelopedData3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9
	 * ContentInformationType9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmEnvelopedData
	 * ContentInformationType12.mmEnvelopedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType4#mmEnvelopedData
	 * ContentInformationType4.mmEnvelopedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnvelopedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType9.mmObject();
			isDerived = false;
			xmlTag = "EnvlpdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvelopedData";
			definition = "Data protection by encryption, with a session key.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType12.mmEnvelopedData);
			previousVersion_lazy = () -> ContentInformationType4.mmEnvelopedData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EnvelopedData3.mmObject();
		}
	};
	protected AuthenticatedData3 authenticatedData;
	/**
	 * Data protection by a message authentication code (MAC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthenticatedData3
	 * AuthenticatedData3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9
	 * ContentInformationType9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmAuthenticatedData
	 * ContentInformationType12.mmAuthenticatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType4#mmAuthenticatedData
	 * ContentInformationType4.mmAuthenticatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthenticatedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType9.mmObject();
			isDerived = false;
			xmlTag = "AuthntcdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			definition = "Data protection by a message authentication code (MAC).";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType12.mmAuthenticatedData);
			previousVersion_lazy = () -> ContentInformationType4.mmAuthenticatedData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AuthenticatedData3.mmObject();
		}
	};
	protected SignedData3 signedData;
	/**
	 * Data protected by digital signatures.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedData3
	 * SignedData3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9
	 * ContentInformationType9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmSignedData
	 * ContentInformationType12.mmSignedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType4#mmSignedData
	 * ContentInformationType4.mmSignedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSignedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType9.mmObject();
			isDerived = false;
			xmlTag = "SgndData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedData";
			definition = "Data protected by digital signatures.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType12.mmSignedData);
			previousVersion_lazy = () -> ContentInformationType4.mmSignedData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedData3.mmObject();
		}
	};
	protected DigestedData3 digestedData;
	/**
	 * Data protected by a digest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DigestedData3
	 * DigestedData3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9
	 * ContentInformationType9}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmDigestedData
	 * ContentInformationType12.mmDigestedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType4#mmDigestedData
	 * ContentInformationType4.mmDigestedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDigestedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType9.mmObject();
			isDerived = false;
			xmlTag = "DgstdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestedData";
			definition = "Data protected by a digest.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType12.mmDigestedData);
			previousVersion_lazy = () -> ContentInformationType4.mmDigestedData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DigestedData3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ContentInformationType9.mmContentType, ContentInformationType9.mmEnvelopedData, ContentInformationType9.mmAuthenticatedData, ContentInformationType9.mmSignedData,
						ContentInformationType9.mmDigestedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorBatchTransferResponseV03.mmSecurityTrailer, AcceptorBatchTransferV03.mmSecurityTrailer, AcceptorConfigurationUpdateV03.mmSecurityTrailer,
						ManagementPlanReplacementV03.mmSecurityTrailer, StatusReportV03.mmSecurityTrailer);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType9";
				definition = "General cryptographic message syntax (CMS) containing protected data.";
				nextVersions_lazy = () -> Arrays.asList(ContentInformationType12.mmObject());
				previousVersion_lazy = () -> ContentInformationType4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CnttTp", required = true)
	public ContentType1Code getContentType() {
		return contentType;
	}

	public void setContentType(ContentType1Code contentType) {
		this.contentType = contentType;
	}

	@XmlElement(name = "EnvlpdData")
	public EnvelopedData3 getEnvelopedData() {
		return envelopedData;
	}

	public void setEnvelopedData(com.tools20022.repository.msg.EnvelopedData3 envelopedData) {
		this.envelopedData = envelopedData;
	}

	@XmlElement(name = "AuthntcdData")
	public AuthenticatedData3 getAuthenticatedData() {
		return authenticatedData;
	}

	public void setAuthenticatedData(com.tools20022.repository.msg.AuthenticatedData3 authenticatedData) {
		this.authenticatedData = authenticatedData;
	}

	@XmlElement(name = "SgndData")
	public SignedData3 getSignedData() {
		return signedData;
	}

	public void setSignedData(com.tools20022.repository.msg.SignedData3 signedData) {
		this.signedData = signedData;
	}

	@XmlElement(name = "DgstdData")
	public DigestedData3 getDigestedData() {
		return digestedData;
	}

	public void setDigestedData(com.tools20022.repository.msg.DigestedData3 digestedData) {
		this.digestedData = digestedData;
	}
}