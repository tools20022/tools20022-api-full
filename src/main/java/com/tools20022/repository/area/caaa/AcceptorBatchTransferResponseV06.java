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
import com.tools20022.repository.area.AcceptortoAcquirerCardTransactionLatestVersion;
import com.tools20022.repository.msg.CardPaymentBatchTransferResponse5;
import com.tools20022.repository.msg.ContentInformationType12;
import com.tools20022.repository.msg.Header25;
import com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20162017;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The AcceptorBatchTransferResponse is sent by the acquirer (or its agent) to
 * inform the acceptor (or its agent) of the transfer in a previous
 * AcceptorBatchTransfer of a collection of transactions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.012.001.06}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcceptortoAcquirerCardTransactionLatestVersion
 * AcceptortoAcquirerCardTransactionLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CAPEAcceptortoAcquirerMaintenance20162017
 * CAPEAcceptortoAcquirerMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AccptrBtchTrfRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV06#mmHeader
 * AcceptorBatchTransferResponseV06.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV06#mmBatchTransferResponse
 * AcceptorBatchTransferResponseV06.mmBatchTransferResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV06#mmSecurityTrailer
 * AcceptorBatchTransferResponseV06.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorBatchTransferResponseV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcceptorBatchTransferResponse is sent by the acquirer (or its agent) to inform the acceptor (or its agent) of the transfer in a previous AcceptorBatchTransfer of a collection of transactions."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV05
 * AcceptorBatchTransferResponseV05}</li>
 * </ul>
 */
public class AcceptorBatchTransferResponseV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Header25 header;
	/**
	 * Capture advice response message management information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header25
	 * Header25}</li>
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
	 * definition} = "Capture advice response message management information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV05#mmHeader
	 * AcceptorBatchTransferResponseV05.mmHeader}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Capture advice response message management information.";
			previousVersion_lazy = () -> AcceptorBatchTransferResponseV05.mmHeader;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header25.mmObject();
		}
	};
	protected CardPaymentBatchTransferResponse5 batchTransferResponse;
	/**
	 * Information related to the previously sent set of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentBatchTransferResponse5
	 * CardPaymentBatchTransferResponse5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchTrfRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransferResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the previously sent set of transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV05#mmBatchTransferResponse
	 * AcceptorBatchTransferResponseV05.mmBatchTransferResponse}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBatchTransferResponse = new MMMessageBuildingBlock() {
		{
			xmlTag = "BtchTrfRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransferResponse";
			definition = "Information related to the previously sent set of transaction.";
			previousVersion_lazy = () -> AcceptorBatchTransferResponseV05.mmBatchTransferResponse;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentBatchTransferResponse5.mmObject();
		}
	};
	protected ContentInformationType12 securityTrailer;
	/**
	 * Trailer of the message containing a MAC or a digital signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType12
	 * ContentInformationType12}</li>
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
	 * definition} =
	 * "Trailer of the message containing a MAC or a digital signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV05#mmSecurityTrailer
	 * AcceptorBatchTransferResponseV05.mmSecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurityTrailer = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			previousVersion_lazy = () -> AcceptorBatchTransferResponseV05.mmSecurityTrailer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType12.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorBatchTransferResponseV06";
				definition = "The AcceptorBatchTransferResponse is sent by the acquirer (or its agent) to inform the acceptor (or its agent) of the transfer in a previous AcceptorBatchTransfer of a collection of transactions.";
				previousVersion_lazy = () -> AcceptorBatchTransferResponseV05.mmObject();
				messageSet_lazy = () -> Arrays.asList(CAPEAcceptortoAcquirerMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrBtchTrfRspn";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorBatchTransferResponseV06.mmHeader, AcceptorBatchTransferResponseV06.mmBatchTransferResponse, AcceptorBatchTransferResponseV06.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "012";
						version = "06";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public Header25 getHeader() {
		return header;
	}

	public void setHeader(Header25 header) {
		this.header = header;
	}

	public CardPaymentBatchTransferResponse5 getBatchTransferResponse() {
		return batchTransferResponse;
	}

	public void setBatchTransferResponse(CardPaymentBatchTransferResponse5 batchTransferResponse) {
		this.batchTransferResponse = batchTransferResponse;
	}

	public ContentInformationType12 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType12 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}
}