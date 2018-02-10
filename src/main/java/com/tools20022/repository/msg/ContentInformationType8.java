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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.msg.ContentInformationType8#mmContentType
 * ContentInformationType8.mmContentType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ContentInformationType8#mmAuthenticatedData
 * ContentInformationType8.mmAuthenticatedData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV03#mmSecurityTrailer
 * AcceptorCancellationAdviceResponseV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV03#mmSecurityTrailer
 * AcceptorDiagnosticResponseV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV01#mmSecurityTrailer
 * AcceptorCurrencyConversionResponseV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationResponseV03#mmSecurityTrailer
 * AcceptorCancellationResponseV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV03#mmSecurityTrailer
 * AcceptorCancellationRequestV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionRequestV01#mmSecurityTrailer
 * AcceptorCurrencyConversionRequestV01.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationResponseV03#mmSecurityTrailer
 * AcceptorReconciliationResponseV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceResponseV03#mmSecurityTrailer
 * AcceptorCompletionAdviceResponseV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticRequestV03#mmSecurityTrailer
 * AcceptorDiagnosticRequestV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationRequestV03#mmSecurityTrailer
 * AcceptorAuthorisationRequestV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV03#mmSecurityTrailer
 * AcceptorCompletionAdviceV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceV03#mmSecurityTrailer
 * AcceptorCancellationAdviceV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV03#mmSecurityTrailer
 * AcceptorReconciliationRequestV03.mmSecurityTrailer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV03#mmSecurityTrailer
 * AcceptorAuthorisationResponseV03.mmSecurityTrailer}</li>
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
 * "ContentInformationType8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "General cryptographic message syntax (CMS) containing authenticated data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ContentInformationType11
 * ContentInformationType11}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ContentInformationType6
 * ContentInformationType6}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ContentInformationType8", propOrder = {"contentType", "authenticatedData"})
public class ContentInformationType8 {

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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType8
	 * ContentInformationType8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType11#mmContentType
	 * ContentInformationType11.mmContentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType6#mmContentType
	 * ContentInformationType6.mmContentType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmContentType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType8.mmObject();
			isDerived = false;
			xmlTag = "CnttTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContentType";
			definition = "Type of data protection.";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType11.mmContentType);
			previousVersion_lazy = () -> ContentInformationType6.mmContentType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ContentType1Code.mmObject();
		}
	};
	@XmlElement(name = "AuthntcdData")
	protected List<com.tools20022.repository.msg.AuthenticatedData3> authenticatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthenticatedData3
	 * AuthenticatedData3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType8
	 * ContentInformationType8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType11#mmAuthenticatedData
	 * ContentInformationType11.mmAuthenticatedData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType6#mmAuthenticatedData
	 * ContentInformationType6.mmAuthenticatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthenticatedData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ContentInformationType8.mmObject();
			isDerived = false;
			xmlTag = "AuthntcdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticatedData";
			definition = "Data protection by a message authentication code (MAC).";
			nextVersions_lazy = () -> Arrays.asList(ContentInformationType11.mmAuthenticatedData);
			previousVersion_lazy = () -> ContentInformationType6.mmAuthenticatedData;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AuthenticatedData3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ContentInformationType8.mmContentType, com.tools20022.repository.msg.ContentInformationType8.mmAuthenticatedData);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorCancellationAdviceResponseV03.mmSecurityTrailer, AcceptorDiagnosticResponseV03.mmSecurityTrailer, AcceptorCurrencyConversionResponseV01.mmSecurityTrailer,
						AcceptorCancellationResponseV03.mmSecurityTrailer, AcceptorCancellationRequestV03.mmSecurityTrailer, AcceptorCurrencyConversionRequestV01.mmSecurityTrailer, AcceptorReconciliationResponseV03.mmSecurityTrailer,
						AcceptorCompletionAdviceResponseV03.mmSecurityTrailer, AcceptorDiagnosticRequestV03.mmSecurityTrailer, AcceptorAuthorisationRequestV03.mmSecurityTrailer, AcceptorCompletionAdviceV03.mmSecurityTrailer,
						AcceptorCancellationAdviceV03.mmSecurityTrailer, AcceptorReconciliationRequestV03.mmSecurityTrailer, AcceptorAuthorisationResponseV03.mmSecurityTrailer);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ContentInformationType8";
				definition = "General cryptographic message syntax (CMS) containing authenticated data.";
				nextVersions_lazy = () -> Arrays.asList(ContentInformationType11.mmObject());
				previousVersion_lazy = () -> ContentInformationType6.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ContentType1Code getContentType() {
		return contentType;
	}

	public ContentInformationType8 setContentType(ContentType1Code contentType) {
		this.contentType = Objects.requireNonNull(contentType);
		return this;
	}

	public List<AuthenticatedData3> getAuthenticatedData() {
		return authenticatedData == null ? authenticatedData = new ArrayList<>() : authenticatedData;
	}

	public ContentInformationType8 setAuthenticatedData(List<com.tools20022.repository.msg.AuthenticatedData3> authenticatedData) {
		this.authenticatedData = Objects.requireNonNull(authenticatedData);
		return this;
	}
}