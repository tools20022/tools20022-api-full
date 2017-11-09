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
import com.tools20022.repository.msg.AcceptorCompletionAdvice1;
import com.tools20022.repository.msg.ContentInformationType3;
import com.tools20022.repository.msg.Header2;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * <b>Scope</b><br>
 * The AcceptorCompletionAdvice message is sent by a card acceptor to notify an
 * acquirer about the completion and final outcome of a card payment
 * transaction. The message can be sent directly to the acquirer or through an
 * agent.<br>
 * <b>Usage</b><br>
 * The AcceptorCompletionAdvice message is used either to:<br>
 * - inform the acquirer about the successful end of a transaction;<br>
 * - reverse a transaction which was not successfully completed (for example,
 * cancellation of transaction by the cardholder), but where an authorisation
 * had been previously given.<br>
 * The AcceptorCompletionAdvice message may also embed the information required
 * for transferring to the acquirer all data needed to perform the financial
 * settlement of the transaction (capture). Should the acquirer not receive a
 * correct response to an AcceptorCompletionAdvice message; the card acceptor
 * sends back an AcceptorCompletionAdvice message to the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.003.001.01}</li>
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
 * xmlTag} = "AccptrCmpltnAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV01#mmHeader
 * AcceptorCompletionAdviceV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV01#mmCompletionAdvice
 * AcceptorCompletionAdviceV01.mmCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV01#mmSecurityTrailer
 * AcceptorCompletionAdviceV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorCompletionAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AcceptorCompletionAdvice message is sent by a card acceptor to notify an acquirer about the completion and final outcome of a card payment transaction. The message can be sent directly to the acquirer or through an agent.\r\nUsage\r\nThe AcceptorCompletionAdvice message is used either to:\r\n- inform the acquirer about the successful end of a transaction;\r\n- reverse a transaction which was not successfully completed (for example, cancellation of transaction by the cardholder), but where an authorisation had been previously given.\r\nThe AcceptorCompletionAdvice message may also embed the information required for transferring to the acquirer all data needed to perform the financial settlement of the transaction (capture). Should the acquirer not receive a correct response to an AcceptorCompletionAdvice message; the card acceptor sends back an AcceptorCompletionAdvice message to the acquirer."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCompletionAdviceV02
 * AcceptorCompletionAdviceV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class AcceptorCompletionAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Header2 header;
	/**
	 * Completion advice message management information.
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
	 * definition} = "Completion advice message management information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Completion advice message management information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header2.mmObject();
		}
	};
	protected AcceptorCompletionAdvice1 completionAdvice;
	/**
	 * Information related to the completion advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCompletionAdvice1
	 * AcceptorCompletionAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmpltnAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the completion advice."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCompletionAdvice = new MMMessageBuildingBlock() {
		{
			xmlTag = "CmpltnAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionAdvice";
			definition = "Information related to the completion advice.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcceptorCompletionAdvice1.mmObject();
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
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCompletionAdviceV01";
				definition = "Scope\r\nThe AcceptorCompletionAdvice message is sent by a card acceptor to notify an acquirer about the completion and final outcome of a card payment transaction. The message can be sent directly to the acquirer or through an agent.\r\nUsage\r\nThe AcceptorCompletionAdvice message is used either to:\r\n- inform the acquirer about the successful end of a transaction;\r\n- reverse a transaction which was not successfully completed (for example, cancellation of transaction by the cardholder), but where an authorisation had been previously given.\r\nThe AcceptorCompletionAdvice message may also embed the information required for transferring to the acquirer all data needed to perform the financial settlement of the transaction (capture). Should the acquirer not receive a correct response to an AcceptorCompletionAdvice message; the card acceptor sends back an AcceptorCompletionAdvice message to the acquirer.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorCompletionAdviceV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrCmpltnAdvc";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorCompletionAdviceV01.mmHeader, AcceptorCompletionAdviceV01.mmCompletionAdvice, AcceptorCompletionAdviceV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "003";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public Header2 getHeader() {
		return header;
	}

	public void setHeader(Header2 header) {
		this.header = header;
	}

	public AcceptorCompletionAdvice1 getCompletionAdvice() {
		return completionAdvice;
	}

	public void setCompletionAdvice(AcceptorCompletionAdvice1 completionAdvice) {
		this.completionAdvice = completionAdvice;
	}

	public ContentInformationType3 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType3 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}
}