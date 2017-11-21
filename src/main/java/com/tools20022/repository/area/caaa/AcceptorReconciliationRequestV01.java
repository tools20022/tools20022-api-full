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
import com.tools20022.repository.msg.AcceptorReconciliationRequest1;
import com.tools20022.repository.msg.ContentInformationType3;
import com.tools20022.repository.msg.Header1;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The AcceptorReconciliationRequest message is sent by the card acceptor to the
 * acquirer or an agent to communicate the totals of the card payment
 * transaction for a reconciliation period. An agent never forwards the message.<br>
 * <b>Usage</b><br>
 * The AcceptorReconciliationRequest message is used to ensure that the debits
 * and credits correspond to the balances computed by the acquirer or its agent
 * for the same reconciliation period.<br>
 * The AcceptorReconciliationRequest message is also used to close a
 * reconciliation period.
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
 * xmlTag} = "AccptrRcncltnReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV01#mmHeader
 * AcceptorReconciliationRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV01#mmReconciliationRequest
 * AcceptorReconciliationRequestV01.mmReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV01#mmSecurityTrailer
 * AcceptorReconciliationRequestV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.009.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorReconciliationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AcceptorReconciliationRequest message is sent by the card acceptor to the acquirer or an agent to communicate the totals of the card payment transaction for a reconciliation period. An agent never forwards the message.\r\nUsage\r\nThe AcceptorReconciliationRequest message is used to ensure that the debits and credits correspond to the balances computed by the acquirer or its agent for the same reconciliation period.\r\nThe AcceptorReconciliationRequest message is also used to close a reconciliation period."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV02
 * AcceptorReconciliationRequestV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AcceptorReconciliationRequestV01", propOrder = {"header", "reconciliationRequest", "securityTrailer"})
public class AcceptorReconciliationRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Header1 header;
	/**
	 * Reconciliation request message management information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header1 Header1}
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
	 * definition} = "Reconciliation request message management information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Reconciliation request message management information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorReconciliationRequestV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AcceptorReconciliationRequest1 reconciliationRequest;
	/**
	 * Information related to the reconcilliation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorReconciliationRequest1
	 * AcceptorReconciliationRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the reconcilliation request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReconciliationRequest = new MMMessageBuildingBlock() {
		{
			xmlTag = "RcncltnReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationRequest";
			definition = "Information related to the reconcilliation request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorReconciliationRequest1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorReconciliationRequestV01.class.getMethod("getReconciliationRequest", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ContentInformationType3 securityTrailer;
	/**
	 * Trailer of the message containing a MAC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType3
	 * ContentInformationType3}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurityTrailer = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorReconciliationRequestV01.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorReconciliationRequestV01";
				definition = "Scope\r\nThe AcceptorReconciliationRequest message is sent by the card acceptor to the acquirer or an agent to communicate the totals of the card payment transaction for a reconciliation period. An agent never forwards the message.\r\nUsage\r\nThe AcceptorReconciliationRequest message is used to ensure that the debits and credits correspond to the balances computed by the acquirer or its agent for the same reconciliation period.\r\nThe AcceptorReconciliationRequest message is also used to close a reconciliation period.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorReconciliationRequestV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrRcncltnReq";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV01.mmHeader, com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV01.mmReconciliationRequest,
						com.tools20022.repository.area.caaa.AcceptorReconciliationRequestV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "009";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorReconciliationRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public Header1 getHeader() {
		return header;
	}

	public void setHeader(Header1 header) {
		this.header = header;
	}

	@XmlElement(name = "RcncltnReq", required = true)
	public AcceptorReconciliationRequest1 getReconciliationRequest() {
		return reconciliationRequest;
	}

	public void setReconciliationRequest(AcceptorReconciliationRequest1 reconciliationRequest) {
		this.reconciliationRequest = reconciliationRequest;
	}

	@XmlElement(name = "SctyTrlr", required = true)
	public ContentInformationType3 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.009.01.01")
	static public class Document {
		@XmlElement(name = "AccptrRcncltnReq", required = true)
		public AcceptorReconciliationRequestV01 messageBody;
	}
}