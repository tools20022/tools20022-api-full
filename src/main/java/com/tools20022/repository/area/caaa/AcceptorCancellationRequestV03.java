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
import com.tools20022.repository.msg.AcceptorCancellationRequest3;
import com.tools20022.repository.msg.ContentInformationType8;
import com.tools20022.repository.msg.Header7;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The AcceptorCancellationRequest message is sent by an acceptor (or its agent)
 * to the acquirer (or its agent), to request the cancellation of a successfully
 * completed transaction. Cancellation should only occur before the transaction
 * has been cleared.<br>
 * <br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.005.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionArchive
 * AcceptortoAcquirerCardTransactionArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV03#mmHeader
 * AcceptorCancellationRequestV03.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV03#mmCancellationRequest
 * AcceptorCancellationRequestV03.mmCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV03#mmSecurityTrailer
 * AcceptorCancellationRequestV03.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorCancellationRequestV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorCancellationRequest message is sent by an acceptor (or its agent) to the acquirer (or its agent), to request the cancellation of a successfully completed transaction. Cancellation should only occur before the transaction has been cleared.\r\n\r\n"
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV04
 * AcceptorCancellationRequestV04}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV02
 * AcceptorCancellationRequestV02}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorCancellationRequestV03", propOrder = {"header", "cancellationRequest", "securityTrailer"})
public class AcceptorCancellationRequestV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header7 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header7 Header7}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation request message management information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV04#mmHeader
	 * AcceptorCancellationRequestV04.mmHeader}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV02#mmHeader
	 * AcceptorCancellationRequestV02.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorCancellationRequestV03, Header7> mmHeader = new MMMessageBuildingBlock<AcceptorCancellationRequestV03, Header7>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Cancellation request message management information.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationRequestV04.mmHeader);
			previousVersion_lazy = () -> AcceptorCancellationRequestV02.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header7.mmObject();
		}

		@Override
		public Header7 getValue(AcceptorCancellationRequestV03 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcceptorCancellationRequestV03 obj, Header7 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "CxlReq", required = true)
	protected AcceptorCancellationRequest3 cancellationRequest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationRequest3
	 * AcceptorCancellationRequest3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlReq"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the cancellation request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV04#mmCancellationRequest
	 * AcceptorCancellationRequestV04.mmCancellationRequest}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV02#mmCancellationRequest
	 * AcceptorCancellationRequestV02.mmCancellationRequest}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorCancellationRequestV03, AcceptorCancellationRequest3> mmCancellationRequest = new MMMessageBuildingBlock<AcceptorCancellationRequestV03, AcceptorCancellationRequest3>() {
		{
			xmlTag = "CxlReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequest";
			definition = "Information related to the cancellation request.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationRequestV04.mmCancellationRequest);
			previousVersion_lazy = () -> AcceptorCancellationRequestV02.mmCancellationRequest;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorCancellationRequest3.mmObject();
		}

		@Override
		public AcceptorCancellationRequest3 getValue(AcceptorCancellationRequestV03 obj) {
			return obj.getCancellationRequest();
		}

		@Override
		public void setValue(AcceptorCancellationRequestV03 obj, AcceptorCancellationRequest3 value) {
			obj.setCancellationRequest(value);
		}
	};
	@XmlElement(name = "SctyTrlr", required = true)
	protected ContentInformationType8 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType8
	 * ContentInformationType8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyTrlr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trailer of the message containing a MAC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV04#mmSecurityTrailer
	 * AcceptorCancellationRequestV04.mmSecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationRequestV02#mmSecurityTrailer
	 * AcceptorCancellationRequestV02.mmSecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorCancellationRequestV03, ContentInformationType8> mmSecurityTrailer = new MMMessageBuildingBlock<AcceptorCancellationRequestV03, ContentInformationType8>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationRequestV04.mmSecurityTrailer);
			previousVersion_lazy = () -> AcceptorCancellationRequestV02.mmSecurityTrailer;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType8.mmObject();
		}

		@Override
		public ContentInformationType8 getValue(AcceptorCancellationRequestV03 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(AcceptorCancellationRequestV03 obj, ContentInformationType8 value) {
			obj.setSecurityTrailer(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCancellationRequestV03";
				definition = "The AcceptorCancellationRequest message is sent by an acceptor (or its agent) to the acquirer (or its agent), to request the cancellation of a successfully completed transaction. Cancellation should only occur before the transaction has been cleared.\r\n\r\n";
				nextVersions_lazy = () -> Arrays.asList(AcceptorCancellationRequestV04.mmObject());
				previousVersion_lazy = () -> AcceptorCancellationRequestV02.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrCxlReq";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorCancellationRequestV03.mmHeader, com.tools20022.repository.area.caaa.AcceptorCancellationRequestV03.mmCancellationRequest,
						com.tools20022.repository.area.caaa.AcceptorCancellationRequestV03.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "005";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorCancellationRequestV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header7 getHeader() {
		return header;
	}

	public AcceptorCancellationRequestV03 setHeader(Header7 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorCancellationRequest3 getCancellationRequest() {
		return cancellationRequest;
	}

	public AcceptorCancellationRequestV03 setCancellationRequest(AcceptorCancellationRequest3 cancellationRequest) {
		this.cancellationRequest = Objects.requireNonNull(cancellationRequest);
		return this;
	}

	public ContentInformationType8 getSecurityTrailer() {
		return securityTrailer;
	}

	public AcceptorCancellationRequestV03 setSecurityTrailer(ContentInformationType8 securityTrailer) {
		this.securityTrailer = Objects.requireNonNull(securityTrailer);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.005.001.03")
	static public class Document {
		@XmlElement(name = "AccptrCxlReq", required = true)
		public AcceptorCancellationRequestV03 messageBody;
	}
}