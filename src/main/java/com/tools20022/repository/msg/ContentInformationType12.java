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
import com.tools20022.repository.codeset.ContentType2Code;
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
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#ContentType
 * ContentInformationType12.ContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#EnvelopedData
 * ContentInformationType12.EnvelopedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#AuthenticatedData
 * ContentInformationType12.AuthenticatedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#SignedData
 * ContentInformationType12.SignedData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType12#DigestedData
 * ContentInformationType12.DigestedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04#SecurityTrailer
 * AcceptorConfigurationUpdateV04.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV04#SecurityTrailer
 * ManagementPlanReplacementV04.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV04#SecurityTrailer
 * StatusReportV04.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV01#SecurityTrailer
 * MaintenanceDelegationResponseV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV01#SecurityTrailer
 * MaintenanceDelegationRequestV01.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV04#SecurityTrailer
 * AcceptorBatchTransferResponseV04.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV04#SecurityTrailer
 * AcceptorBatchTransferV04.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.KeyExchangeResponse#SecurityTrailer
 * KeyExchangeResponse.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.KeyExchangeInitiation#SecurityTrailer
 * KeyExchangeInitiation.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV05#SecurityTrailer
 * AcceptorBatchTransferResponseV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV05#SecurityTrailer
 * AcceptorBatchTransferV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationResponseV02#SecurityTrailer
 * MaintenanceDelegationResponseV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02#SecurityTrailer
 * MaintenanceDelegationRequestV02.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05#SecurityTrailer
 * AcceptorConfigurationUpdateV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV05#SecurityTrailer
 * StatusReportV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV05#SecurityTrailer
 * ManagementPlanReplacementV05.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV06#SecurityTrailer
 * StatusReportV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV06#SecurityTrailer
 * AcceptorConfigurationUpdateV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.MaintenanceDelegationRequestV03#SecurityTrailer
 * MaintenanceDelegationRequestV03.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.ManagementPlanReplacementV06#SecurityTrailer
 * ManagementPlanReplacementV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV06#SecurityTrailer
 * AcceptorBatchTransferResponseV06.SecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferV06#SecurityTrailer
 * AcceptorBatchTransferV06.SecurityTrailer}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType13#ContentType
	 * ContentInformationType13.ContentType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType14#ContentType
	 * ContentInformationType14.ContentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#ContentType
	 * ContentInformationType9.ContentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ContentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ContentInformationType9.ContentType;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType13.ContentType, com.tools20022.repository.msg.ContentInformationType14.ContentType);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ContentType2Code.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#EnvelopedData
	 * ContentInformationType9.EnvelopedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd EnvelopedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "EnvlpdData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnvelopedData";
			definition = "Data protection by encryption, with a session key.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ContentInformationType9.EnvelopedData;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> EnvelopedData4.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType13#AuthenticatedData
	 * ContentInformationType13.AuthenticatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#AuthenticatedData
	 * ContentInformationType9.AuthenticatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AuthenticatedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "AuthntcdData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			definition = "Data protection by a message authentication code (MAC).";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ContentInformationType9.AuthenticatedData;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType13.AuthenticatedData);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> AuthenticatedData4.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType13#SignedData
	 * ContentInformationType13.SignedData}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType14#SignedData
	 * ContentInformationType14.SignedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#SignedData
	 * ContentInformationType9.SignedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SignedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "SgndData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignedData";
			definition = "Data protected by a digital signatures.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ContentInformationType9.SignedData;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType13.SignedData, com.tools20022.repository.msg.ContentInformationType14.SignedData);
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> SignedData4.mmObject();
			isComposite = true;
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType9#DigestedData
	 * ContentInformationType9.DigestedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DigestedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType12.mmObject();
			isDerived = false;
			xmlTag = "DgstdData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigestedData";
			definition = "Data protected by a digest.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.ContentInformationType9.DigestedData;
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> DigestedData4.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType12.ContentType, com.tools20022.repository.msg.ContentInformationType12.EnvelopedData,
						com.tools20022.repository.msg.ContentInformationType12.AuthenticatedData, com.tools20022.repository.msg.ContentInformationType12.SignedData, com.tools20022.repository.msg.ContentInformationType12.DigestedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV04.SecurityTrailer, com.tools20022.repository.area.catm.ManagementPlanReplacementV04.SecurityTrailer,
						com.tools20022.repository.area.catm.StatusReportV04.SecurityTrailer, com.tools20022.repository.area.catm.MaintenanceDelegationResponseV01.SecurityTrailer,
						com.tools20022.repository.area.catm.MaintenanceDelegationRequestV01.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV04.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorBatchTransferV04.SecurityTrailer, com.tools20022.repository.area.cain.KeyExchangeResponse.SecurityTrailer,
						com.tools20022.repository.area.cain.KeyExchangeInitiation.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV05.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorBatchTransferV05.SecurityTrailer, com.tools20022.repository.area.catm.MaintenanceDelegationResponseV02.SecurityTrailer,
						com.tools20022.repository.area.catm.MaintenanceDelegationRequestV02.SecurityTrailer, com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV05.SecurityTrailer,
						com.tools20022.repository.area.catm.StatusReportV05.SecurityTrailer, com.tools20022.repository.area.catm.ManagementPlanReplacementV05.SecurityTrailer,
						com.tools20022.repository.area.catm.StatusReportV06.SecurityTrailer, com.tools20022.repository.area.catm.AcceptorConfigurationUpdateV06.SecurityTrailer,
						com.tools20022.repository.area.catm.MaintenanceDelegationRequestV03.SecurityTrailer, com.tools20022.repository.area.catm.ManagementPlanReplacementV06.SecurityTrailer,
						com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV06.SecurityTrailer, com.tools20022.repository.area.caaa.AcceptorBatchTransferV06.SecurityTrailer);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType12";
				definition = "General cryptographic message syntax (CMS) containing protected data.";
				previousVersion_lazy = () -> ContentInformationType9.mmObject();
				nextVersions_lazy = () -> Arrays.asList(ContentInformationType13.mmObject(), ContentInformationType14.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}