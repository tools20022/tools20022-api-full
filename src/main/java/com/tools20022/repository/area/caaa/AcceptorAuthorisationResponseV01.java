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
import com.tools20022.repository.msg.AcceptorAuthorisationResponse1;
import com.tools20022.repository.msg.ContentInformationType3;
import com.tools20022.repository.msg.Header1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The AcceptorAuthorisationResponse message is sent by the acquirer to inform
 * the card acceptor of the outcome of the authorisation process. The message
 * can be sent directly to the acceptor or through an agent.<br>
 * <b>Usage</b><br>
 * The AcceptorAuthorisationResponse message is used to indicate one of the
 * possible outcomes of an authorisation process:<br>
 * - a successful authorisation;<br>
 * - a decline from the acquirer for financial reasons;<br>
 * - a decline from the acquirer for technical reasons (for instance, a
 * timeout).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.002.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionArchive
 * AcceptortoAcquirerCardTransactionArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV01#mmHeader
 * AcceptorAuthorisationResponseV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV01#mmAuthorisationResponse
 * AcceptorAuthorisationResponseV01.mmAuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV01#mmSecurityTrailer
 * AcceptorAuthorisationResponseV01.mmSecurityTrailer}</li>
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
 * xmlTag} = "AccptrAuthstnRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorAuthorisationResponseV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AcceptorAuthorisationResponse message is sent by the acquirer to inform the card acceptor of the outcome of the authorisation process. The message can be sent directly to the acceptor or through an agent.\r\nUsage\r\nThe AcceptorAuthorisationResponse message is used to indicate one of the possible outcomes of an authorisation process:\r\n- a successful authorisation;\r\n- a decline from the acquirer for financial reasons;\r\n- a decline from the acquirer for technical reasons (for instance, a timeout)."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV02
 * AcceptorAuthorisationResponseV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorAuthorisationResponseV01", propOrder = {"header", "authorisationResponse", "securityTrailer"})
public class AcceptorAuthorisationResponseV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header1 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header1 Header1}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Authorisation response message management information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorAuthorisationResponseV01, Header1> mmHeader = new MMMessageBuildingBlock<AcceptorAuthorisationResponseV01, Header1>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Authorisation response message management information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header1.mmObject();
		}

		@Override
		public Header1 getValue(AcceptorAuthorisationResponseV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcceptorAuthorisationResponseV01 obj, Header1 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "AuthstnRspn", required = true)
	protected AcceptorAuthorisationResponse1 authorisationResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorAuthorisationResponse1
	 * AcceptorAuthorisationResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the response of the authorisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorAuthorisationResponseV01, AcceptorAuthorisationResponse1> mmAuthorisationResponse = new MMMessageBuildingBlock<AcceptorAuthorisationResponseV01, AcceptorAuthorisationResponse1>() {
		{
			xmlTag = "AuthstnRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResponse";
			definition = "Information related to the response of the authorisation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorAuthorisationResponse1.mmObject();
		}

		@Override
		public AcceptorAuthorisationResponse1 getValue(AcceptorAuthorisationResponseV01 obj) {
			return obj.getAuthorisationResponse();
		}

		@Override
		public void setValue(AcceptorAuthorisationResponseV01 obj, AcceptorAuthorisationResponse1 value) {
			obj.setAuthorisationResponse(value);
		}
	};
	@XmlElement(name = "SctyTrlr", required = true)
	protected ContentInformationType3 securityTrailer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType3
	 * ContentInformationType3}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorAuthorisationResponseV01, ContentInformationType3> mmSecurityTrailer = new MMMessageBuildingBlock<AcceptorAuthorisationResponseV01, ContentInformationType3>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType3.mmObject();
		}

		@Override
		public ContentInformationType3 getValue(AcceptorAuthorisationResponseV01 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(AcceptorAuthorisationResponseV01 obj, ContentInformationType3 value) {
			obj.setSecurityTrailer(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorAuthorisationResponseV01";
				definition = "Scope\r\nThe AcceptorAuthorisationResponse message is sent by the acquirer to inform the card acceptor of the outcome of the authorisation process. The message can be sent directly to the acceptor or through an agent.\r\nUsage\r\nThe AcceptorAuthorisationResponse message is used to indicate one of the possible outcomes of an authorisation process:\r\n- a successful authorisation;\r\n- a decline from the acquirer for financial reasons;\r\n- a decline from the acquirer for technical reasons (for instance, a timeout).";
				nextVersions_lazy = () -> Arrays.asList(AcceptorAuthorisationResponseV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrAuthstnRspn";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV01.mmHeader, com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV01.mmAuthorisationResponse,
						com.tools20022.repository.area.caaa.AcceptorAuthorisationResponseV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "002";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorAuthorisationResponseV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header1 getHeader() {
		return header;
	}

	public AcceptorAuthorisationResponseV01 setHeader(Header1 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorAuthorisationResponse1 getAuthorisationResponse() {
		return authorisationResponse;
	}

	public AcceptorAuthorisationResponseV01 setAuthorisationResponse(AcceptorAuthorisationResponse1 authorisationResponse) {
		this.authorisationResponse = Objects.requireNonNull(authorisationResponse);
		return this;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return securityTrailer;
	}

	public AcceptorAuthorisationResponseV01 setSecurityTrailer(ContentInformationType3 securityTrailer) {
		this.securityTrailer = Objects.requireNonNull(securityTrailer);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.002.001.01")
	static public class Document {
		@XmlElement(name = "AccptrAuthstnRspn", required = true)
		public AcceptorAuthorisationResponseV01 messageBody;
	}
}