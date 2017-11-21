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

package com.tools20022.repository.area.caaa;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AcceptortoAcquirerCardTransactionArchive;
import com.tools20022.repository.msg.AcceptorCancellationAdviceResponse2;
import com.tools20022.repository.msg.ContentInformationType6;
import com.tools20022.repository.msg.Header2;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The AcceptorCancellationAdviceResponse message is sent by the acquirer (or
 * its agent) to acknowledge the acceptor (or its agent) about the notification
 * of the payment cancellation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionArchive
 * AcceptortoAcquirerCardTransactionArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrCxlAdvcRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV02#mmHeader
 * AcceptorCancellationAdviceResponseV02.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV02#mmCancellationAdviceResponse
 * AcceptorCancellationAdviceResponseV02.mmCancellationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV02#mmSecurityTrailer
 * AcceptorCancellationAdviceResponseV02.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.008.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorCancellationAdviceResponseV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorCancellationAdviceResponse message is sent by the acquirer (or its agent) to acknowledge the acceptor (or its agent) about the notification of the payment cancellation."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV03
 * AcceptorCancellationAdviceResponseV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV01
 * AcceptorCancellationAdviceResponseV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AcceptorCancellationAdviceResponseV02", propOrder = {"header", "cancellationAdviceResponse", "securityTrailer"})
public class AcceptorCancellationAdviceResponseV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Header2 header;
	/**
	 * Cancellation advice response message management information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header2 Header2}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation advice response message management information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV03#mmHeader
	 * AcceptorCancellationAdviceResponseV03.mmHeader}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Cancellation advice response message management information.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationAdviceResponseV03.mmHeader);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorCancellationAdviceResponseV02.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AcceptorCancellationAdviceResponse2 cancellationAdviceResponse;
	/**
	 * Information related to the cancellation advice response.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse2
	 * AcceptorCancellationAdviceResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlAdvcRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the cancellation advice response."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV03#mmCancellationAdviceResponse
	 * AcceptorCancellationAdviceResponseV03.mmCancellationAdviceResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCancellationAdviceResponse = new MMMessageBuildingBlock() {
		{
			xmlTag = "CxlAdvcRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAdviceResponse";
			definition = "Information related to the cancellation advice response.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationAdviceResponseV03.mmCancellationAdviceResponse);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorCancellationAdviceResponse2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorCancellationAdviceResponseV02.class.getMethod("getCancellationAdviceResponse", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ContentInformationType6 securityTrailer;
	/**
	 * Trailer of the message containing a MAC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType6
	 * ContentInformationType6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trailer of the message containing a MAC."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV03#mmSecurityTrailer
	 * AcceptorCancellationAdviceResponseV03.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurityTrailer = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationAdviceResponseV03.mmSecurityTrailer);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorCancellationAdviceResponseV02.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCancellationAdviceResponseV02";
				definition = "The AcceptorCancellationAdviceResponse message is sent by the acquirer (or its agent) to acknowledge the acceptor (or its agent) about the notification of the payment cancellation.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationAdviceResponseV03.mmObject());
				previousVersion_lazy = () -> AcceptorCancellationAdviceResponseV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrCxlAdvcRspn";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV02.mmHeader,
						com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV02.mmCancellationAdviceResponse, com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV02.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "008";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorCancellationAdviceResponseV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public Header2 getHeader() {
		return header;
	}

	public void setHeader(Header2 header) {
		this.header = header;
	}

	@XmlElement(name = "CxlAdvcRspn", required = true)
	public AcceptorCancellationAdviceResponse2 getCancellationAdviceResponse() {
		return cancellationAdviceResponse;
	}

	public void setCancellationAdviceResponse(AcceptorCancellationAdviceResponse2 cancellationAdviceResponse) {
		this.cancellationAdviceResponse = cancellationAdviceResponse;
	}

	@XmlElement(name = "SctyTrlr", required = true)
	public ContentInformationType6 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType6 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.008.02.02")
	static public class Document {
		@XmlElement(name = "AccptrCxlAdvcRspn", required = true)
		public AcceptorCancellationAdviceResponseV02 messageBody;
	}
}