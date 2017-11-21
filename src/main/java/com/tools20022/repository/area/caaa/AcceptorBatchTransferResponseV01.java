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
import com.tools20022.repository.msg.CardPaymentDataSet2;
import com.tools20022.repository.msg.ContentInformationType1;
import com.tools20022.repository.msg.Header3;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The AcceptorBatchTransferResponse message is sent by the acquirer to the card
 * acceptor to acknowledge the proper reception of the AcceptorBatchTransfer.<br>
 * <b>Usage</b><br>
 * The AcceptorBatchTransferResponse message is used by an acquirer to inform
 * the card acceptor of the card payment transactions that could not be captured
 * in the AcceptorBatchTransfer.
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
 * xmlTag} = "AccptrBtchTrfRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV01#mmHeader
 * AcceptorBatchTransferResponseV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV01#mmDataSet
 * AcceptorBatchTransferResponseV01.mmDataSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV01#mmSecurityTrailer
 * AcceptorBatchTransferResponseV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caaa.012.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptorBatchTransferResponseV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AcceptorBatchTransferResponse message is sent by the acquirer to the card acceptor to acknowledge the proper reception of the AcceptorBatchTransfer.\r\nUsage\r\nThe AcceptorBatchTransferResponse message is used by an acquirer to inform the card acceptor of the card payment transactions that could not be captured in the AcceptorBatchTransfer."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV02
 * AcceptorBatchTransferResponseV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AcceptorBatchTransferResponseV01", propOrder = {"header", "dataSet", "securityTrailer"})
public class AcceptorBatchTransferResponseV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Header3 header;
	/**
	 * Capture advice response message management information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header3 Header3}
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
	 * definition} = "Capture advice response message management information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Capture advice response message management information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorBatchTransferResponseV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<CardPaymentDataSet2> dataSet;
	/**
	 * Information related to the previously sent set of transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentDataSet2
	 * CardPaymentDataSet2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the previously sent set of transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmDataSet = new MMMessageBuildingBlock() {
		{
			xmlTag = "DataSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSet";
			definition = "Information related to the previously sent set of transaction.";
			minOccurs = 1;
			complexType_lazy = () -> CardPaymentDataSet2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorBatchTransferResponseV01.class.getMethod("getDataSet", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ContentInformationType1 securityTrailer;
	/**
	 * Trailer of the message containing a MAC or a digital signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType1
	 * ContentInformationType1}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurityTrailer = new MMMessageBuildingBlock() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC or a digital signature.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ContentInformationType1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcceptorBatchTransferResponseV01.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorBatchTransferResponseV01";
				definition = "Scope\r\nThe AcceptorBatchTransferResponse message is sent by the acquirer to the card acceptor to acknowledge the proper reception of the AcceptorBatchTransfer.\r\nUsage\r\nThe AcceptorBatchTransferResponse message is used by an acquirer to inform the card acceptor of the card payment transactions that could not be captured in the AcceptorBatchTransfer.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorBatchTransferResponseV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AccptrBtchTrfRspn";
				businessArea_lazy = () -> AcceptortoAcquirerCardTransactionArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV01.mmHeader, com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV01.mmDataSet,
						com.tools20022.repository.area.caaa.AcceptorBatchTransferResponseV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caaa";
						messageFunctionality = "012";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcceptorBatchTransferResponseV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public Header3 getHeader() {
		return header;
	}

	public void setHeader(Header3 header) {
		this.header = header;
	}

	@XmlElement(name = "DataSet", required = true)
	public List<CardPaymentDataSet2> getDataSet() {
		return dataSet;
	}

	public void setDataSet(List<CardPaymentDataSet2> dataSet) {
		this.dataSet = dataSet;
	}

	@XmlElement(name = "SctyTrlr", required = true)
	public ContentInformationType1 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType1 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:caaa.012.01.01")
	static public class Document {
		@XmlElement(name = "AccptrBtchTrfRspn", required = true)
		public AcceptorBatchTransferResponseV01 messageBody;
	}
}