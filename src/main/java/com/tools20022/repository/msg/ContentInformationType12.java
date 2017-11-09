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
import com.tools20022.repository.area.caaa.*;
import com.tools20022.repository.area.cain.KeyExchangeInitiation;
import com.tools20022.repository.area.cain.KeyExchangeResponse;
import com.tools20022.repository.area.catm.*;
import com.tools20022.repository.codeset.ContentType2Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmContentType
 * ContentInformationType12.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmEnvelopedData
 * ContentInformationType12.mmEnvelopedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmAuthenticatedData
 * ContentInformationType12.mmAuthenticatedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmSignedData
 * ContentInformationType12.mmSignedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#mmDigestedData
 * ContentInformationType12.mmDigestedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04#mmSecurityTrailer
 * AcceptorConfigurationUpdateV04.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV04#mmSecurityTrailer
 * ManagementPlanReplacementV04.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV04#mmSecurityTrailer
 * StatusReportV04.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV01#mmSecurityTrailer
 * MaintenanceDelegationResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV01#mmSecurityTrailer
 * MaintenanceDelegationRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV04#mmSecurityTrailer
 * AcceptorBatchTransferResponseV04.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV04#mmSecurityTrailer
 * AcceptorBatchTransferV04.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.KeyExchangeResponse#mmSecurityTrailer
 * KeyExchangeResponse.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.KeyExchangeInitiation#mmSecurityTrailer
 * KeyExchangeInitiation.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV05#mmSecurityTrailer
 * AcceptorBatchTransferResponseV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV05#mmSecurityTrailer
 * AcceptorBatchTransferV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV02#mmSecurityTrailer
 * MaintenanceDelegationResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02#mmSecurityTrailer
 * MaintenanceDelegationRequestV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05#mmSecurityTrailer
 * AcceptorConfigurationUpdateV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV05#mmSecurityTrailer
 * StatusReportV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV05#mmSecurityTrailer
 * ManagementPlanReplacementV05.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV06#mmSecurityTrailer
 * StatusReportV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV06#mmSecurityTrailer
 * AcceptorConfigurationUpdateV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV03#mmSecurityTrailer
 * MaintenanceDelegationRequestV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV06#mmSecurityTrailer
 * ManagementPlanReplacementV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV06#mmSecurityTrailer
 * AcceptorBatchTransferResponseV06.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV06#mmSecurityTrailer
 * AcceptorBatchTransferV06.mmSecurityTrailer}</li>
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
 * "ContentInformationType12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing protected data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContentInformationType13
 * ContentInformationType13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContentInformationType14
 * ContentInformationType14}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ContentInformationType9
 * ContentInformationType9}</li>
 * </ul>
 */
public class ContentInformationType12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ContentType2Code contentType;
	/**
	 * Type of data protection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ContentType2Code
	 * ContentType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType13#mmContentType
	 * ContentInformationType13.mmContentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType14#mmContentType
	 * ContentInformationType14.mmContentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmContentType
	 * ContentInformationType9.mmContentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType13.mmContentType, ContentInformationType14.mmContentType);
			previousVersion_lazy = () -> ContentInformationType9.mmContentType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType2Code.mmObject();
		}
	};
	protected EnvelopedData4 envelopedData;
	/**
	 * Data protection by encryption, with a session key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.EnvelopedData4
	 * EnvelopedData4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmEnvelopedData
	 * ContentInformationType9.mmEnvelopedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnvelopedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "EnvlpdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvelopedData";
			definition = "Data protection by encryption, with a session key.";
			previousVersion_lazy = () -> ContentInformationType9.mmEnvelopedData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.EnvelopedData4.mmObject();
		}
	};
	protected AuthenticatedData4 authenticatedData;
	/**
	 * Data protection by a message authentication code (MAC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthenticatedData4
	 * AuthenticatedData4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType13#mmAuthenticatedData
	 * ContentInformationType13.mmAuthenticatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmAuthenticatedData
	 * ContentInformationType9.mmAuthenticatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthenticatedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "AuthntcdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			definition = "Data protection by a message authentication code (MAC).";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType13.mmAuthenticatedData);
			previousVersion_lazy = () -> ContentInformationType9.mmAuthenticatedData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AuthenticatedData4.mmObject();
		}
	};
	protected SignedData4 signedData;
	/**
	 * Data protected by a digital signatures.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SignedData4
	 * SignedData4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
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
	 * definition} = "Data protected by a digital signatures."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType13#mmSignedData
	 * ContentInformationType13.mmSignedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType14#mmSignedData
	 * ContentInformationType14.mmSignedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmSignedData
	 * ContentInformationType9.mmSignedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSignedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "SgndData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedData";
			definition = "Data protected by a digital signatures.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType13.mmSignedData, ContentInformationType14.mmSignedData);
			previousVersion_lazy = () -> ContentInformationType9.mmSignedData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SignedData4.mmObject();
		}
	};
	protected DigestedData4 digestedData;
	/**
	 * Data protected by a digest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DigestedData4
	 * DigestedData4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#mmDigestedData
	 * ContentInformationType9.mmDigestedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDigestedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "DgstdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestedData";
			definition = "Data protected by a digest.";
			previousVersion_lazy = () -> ContentInformationType9.mmDigestedData;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DigestedData4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ContentInformationType12.mmContentType, ContentInformationType12.mmEnvelopedData, ContentInformationType12.mmAuthenticatedData, ContentInformationType12.mmSignedData,
						ContentInformationType12.mmDigestedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorConfigurationUpdateV04.mmSecurityTrailer, ManagementPlanReplacementV04.mmSecurityTrailer, StatusReportV04.mmSecurityTrailer,
						MaintenanceDelegationResponseV01.mmSecurityTrailer, MaintenanceDelegationRequestV01.mmSecurityTrailer, AcceptorBatchTransferResponseV04.mmSecurityTrailer, AcceptorBatchTransferV04.mmSecurityTrailer,
						KeyExchangeResponse.mmSecurityTrailer, KeyExchangeInitiation.mmSecurityTrailer, AcceptorBatchTransferResponseV05.mmSecurityTrailer, AcceptorBatchTransferV05.mmSecurityTrailer,
						MaintenanceDelegationResponseV02.mmSecurityTrailer, MaintenanceDelegationRequestV02.mmSecurityTrailer, AcceptorConfigurationUpdateV05.mmSecurityTrailer, StatusReportV05.mmSecurityTrailer,
						ManagementPlanReplacementV05.mmSecurityTrailer, StatusReportV06.mmSecurityTrailer, AcceptorConfigurationUpdateV06.mmSecurityTrailer, MaintenanceDelegationRequestV03.mmSecurityTrailer,
						ManagementPlanReplacementV06.mmSecurityTrailer, AcceptorBatchTransferResponseV06.mmSecurityTrailer, AcceptorBatchTransferV06.mmSecurityTrailer);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType12";
				definition = "General cryptographic message syntax (CMS) containing protected data.";
				nextVersions_lazy = () -> Arrays.asList(ContentInformationType13.mmObject(), ContentInformationType14.mmObject());
				previousVersion_lazy = () -> ContentInformationType9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ContentType2Code getContentType() {
		return contentType;
	}

	public void setContentType(ContentType2Code contentType) {
		this.contentType = contentType;
	}

	public EnvelopedData4 getEnvelopedData() {
		return envelopedData;
	}

	public void setEnvelopedData(com.tools20022.repository.msg.EnvelopedData4 envelopedData) {
		this.envelopedData = envelopedData;
	}

	public AuthenticatedData4 getAuthenticatedData() {
		return authenticatedData;
	}

	public void setAuthenticatedData(com.tools20022.repository.msg.AuthenticatedData4 authenticatedData) {
		this.authenticatedData = authenticatedData;
	}

	public SignedData4 getSignedData() {
		return signedData;
	}

	public void setSignedData(com.tools20022.repository.msg.SignedData4 signedData) {
		this.signedData = signedData;
	}

	public DigestedData4 getDigestedData() {
		return digestedData;
	}

	public void setDigestedData(com.tools20022.repository.msg.DigestedData4 digestedData) {
		this.digestedData = digestedData;
	}
}