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
import com.tools20022.repository.msg.AcceptorDiagnosticResponse1;
import com.tools20022.repository.msg.ContentInformationType3;
import com.tools20022.repository.msg.Header1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The AcceptorDiagnosticResponse message is sent by the acquirer to the card
 * acceptor to confirm the availability of the acquirer. An agent never forwards
 * the message.<br>
 * <b>Usage</b><br>
 * The AcceptorDiagnosticResponse message is used to:<br>
 * - confirm the availability of the acquirer;<br>
 * - validate the security of the exchanges with the acquirer;<br>
 * - validate the version of the configuration parameters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.014.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionArchive
 * AcceptortoAcquirerCardTransactionArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV01#mmHeader
 * AcceptorDiagnosticResponseV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV01#mmDiagnosticResponse
 * AcceptorDiagnosticResponseV01.mmDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV01#mmSecurityTrailer
 * AcceptorDiagnosticResponseV01.mmSecurityTrailer}</li>
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
 * xmlTag} = "AccptrDgnstcRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorDiagnosticResponseV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AcceptorDiagnosticResponse message is sent by the acquirer to the card acceptor to confirm the availability of the acquirer. An agent never forwards the message.\r\nUsage\r\nThe AcceptorDiagnosticResponse message is used to:\r\n- confirm the availability of the acquirer;\r\n- validate the security of the exchanges with the acquirer;\r\n- validate the version of the configuration parameters."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV02
 * AcceptorDiagnosticResponseV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorDiagnosticResponseV01", propOrder = {"header", "diagnosticResponse", "securityTrailer"})
public class AcceptorDiagnosticResponseV01 {

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
	 * definition} = "Diagnostic response message management information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorDiagnosticResponseV01, Header1> mmHeader = new MMMessageBuildingBlock<AcceptorDiagnosticResponseV01, Header1>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Diagnostic response message management information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header1.mmObject();
		}

		@Override
		public Header1 getValue(AcceptorDiagnosticResponseV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(AcceptorDiagnosticResponseV01 obj, Header1 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "DgnstcRspn", required = true)
	protected AcceptorDiagnosticResponse1 diagnosticResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorDiagnosticResponse1
	 * AcceptorDiagnosticResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgnstcRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the diagnostic response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AcceptorDiagnosticResponseV01, AcceptorDiagnosticResponse1> mmDiagnosticResponse = new MMMessageBuildingBlock<AcceptorDiagnosticResponseV01, AcceptorDiagnosticResponse1>() {
		{
			xmlTag = "DgnstcRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiagnosticResponse";
			definition = "Information related to the diagnostic response.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorDiagnosticResponse1.mmObject();
		}

		@Override
		public AcceptorDiagnosticResponse1 getValue(AcceptorDiagnosticResponseV01 obj) {
			return obj.getDiagnosticResponse();
		}

		@Override
		public void setValue(AcceptorDiagnosticResponseV01 obj, AcceptorDiagnosticResponse1 value) {
			obj.setDiagnosticResponse(value);
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
	public static final MMMessageBuildingBlock<AcceptorDiagnosticResponseV01, ContentInformationType3> mmSecurityTrailer = new MMMessageBuildingBlock<AcceptorDiagnosticResponseV01, ContentInformationType3>() {
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
		public ContentInformationType3 getValue(AcceptorDiagnosticResponseV01 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(AcceptorDiagnosticResponseV01 obj, ContentInformationType3 value) {
			obj.setSecurityTrailer(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorDiagnosticResponseV01";
				definition = "Scope\r\nThe AcceptorDiagnosticResponse message is sent by the acquirer to the card acceptor to confirm the availability of the acquirer. An agent never forwards the message.\r\nUsage\r\nThe AcceptorDiagnosticResponse message is used to:\r\n- confirm the availability of the acquirer;\r\n- validate the security of the exchanges with the acquirer;\r\n- validate the version of the configuration parameters.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorDiagnosticResponseV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrDgnstcRspn";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV01.mmHeader, com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV01.mmDiagnosticResponse,
						com.tools20022.repository.area.caaa.AcceptorDiagnosticResponseV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "014";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorDiagnosticResponseV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header1 getHeader() {
		return header;
	}

	public AcceptorDiagnosticResponseV01 setHeader(Header1 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public AcceptorDiagnosticResponse1 getDiagnosticResponse() {
		return diagnosticResponse;
	}

	public AcceptorDiagnosticResponseV01 setDiagnosticResponse(AcceptorDiagnosticResponse1 diagnosticResponse) {
		this.diagnosticResponse = Objects.requireNonNull(diagnosticResponse);
		return this;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return securityTrailer;
	}

	public AcceptorDiagnosticResponseV01 setSecurityTrailer(ContentInformationType3 securityTrailer) {
		this.securityTrailer = Objects.requireNonNull(securityTrailer);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.014.001.01")
	static public class Document {
		@XmlElement(name = "AccptrDgnstcRspn", required = true)
		public AcceptorDiagnosticResponseV01 messageBody;
	}
}