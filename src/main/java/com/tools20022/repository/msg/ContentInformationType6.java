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
import com.tools20022.repository.codeset.ContentType1Code;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * General cryptographic message syntax (CMS) containing authenticated data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType6#mmContentType
 * ContentInformationType6.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType6#mmAuthenticatedData
 * ContentInformationType6.mmAuthenticatedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV02#mmSecurityTrailer
 * AcceptorDiagnosticResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV02#mmSecurityTrailer
 * AcceptorCancellationAdviceResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV02#mmSecurityTrailer
 * AcceptorAuthorisationRequestV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV02#mmSecurityTrailer
 * AcceptorCompletionAdviceResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV02#mmSecurityTrailer
 * AcceptorReconciliationRequestV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV02#mmSecurityTrailer
 * AcceptorReconciliationResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV02#mmSecurityTrailer
 * AcceptorCancellationRequestV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV02#mmSecurityTrailer
 * AcceptorCancellationResponseV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV02#mmSecurityTrailer
 * AcceptorDiagnosticRequestV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV02#mmSecurityTrailer
 * AcceptorCompletionAdviceV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV02#mmSecurityTrailer
 * AcceptorCancellationAdviceV02.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV02#mmSecurityTrailer
 * AcceptorAuthorisationResponseV02.mmSecurityTrailer}</li>
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
 * "ContentInformationType6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing authenticated data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContentInformationType8
 * ContentInformationType8}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ContentInformationType3
 * ContentInformationType3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ContentInformationType6", propOrder = {"contentType", "authenticatedData"})
public class ContentInformationType6 {

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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType6
	 * ContentInformationType6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType8#mmContentType
	 * ContentInformationType8.mmContentType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ContentInformationType6.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType8.mmContentType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AuthenticatedData2> authenticatedData;
	/**
	 * Data protection by a message authentication code (MAC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthenticatedData2
	 * AuthenticatedData2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType6
	 * ContentInformationType6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType8#mmAuthenticatedData
	 * ContentInformationType8.mmAuthenticatedData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthenticatedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ContentInformationType6.mmObject();
			isDerived = false;
			xmlTag = "AuthntcdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			definition = "Data protection by a message authentication code (MAC).";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType8.mmAuthenticatedData);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AuthenticatedData2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ContentInformationType6.mmContentType, ContentInformationType6.mmAuthenticatedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorDiagnosticResponseV02.mmSecurityTrailer, AcceptorCancellationAdviceResponseV02.mmSecurityTrailer, AcceptorAuthorisationRequestV02.mmSecurityTrailer,
						AcceptorCompletionAdviceResponseV02.mmSecurityTrailer, AcceptorReconciliationRequestV02.mmSecurityTrailer, AcceptorReconciliationResponseV02.mmSecurityTrailer, AcceptorCancellationRequestV02.mmSecurityTrailer,
						AcceptorCancellationResponseV02.mmSecurityTrailer, AcceptorDiagnosticRequestV02.mmSecurityTrailer, AcceptorCompletionAdviceV02.mmSecurityTrailer, AcceptorCancellationAdviceV02.mmSecurityTrailer,
						AcceptorAuthorisationResponseV02.mmSecurityTrailer);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType6";
				definition = "General cryptographic message syntax (CMS) containing authenticated data.";
				nextVersions_lazy = () -> Arrays.asList(ContentInformationType8.mmObject());
				previousVersion_lazy = () -> ContentInformationType3.mmObject();
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

	@XmlElement(name = "AuthntcdData")
	public List<AuthenticatedData2> getAuthenticatedData() {
		return authenticatedData;
	}

	public void setAuthenticatedData(List<com.tools20022.repository.msg.AuthenticatedData2> authenticatedData) {
		this.authenticatedData = authenticatedData;
	}
}