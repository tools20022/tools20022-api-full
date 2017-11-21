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

package com.tools20022.repository.area.catp;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ATMCardTransactionLatestVersion;
import com.tools20022.repository.msg.ATMTransferRequest1;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header31;
import com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The ATMTransferRequest message is sent by an ATM to an ATM manager to request
 * the approval of a fund transfer at the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ATMCardTransactionLatestVersion
 * ATMCardTransactionLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion
 * ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ATMTrfReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#mmHeader
 * ATMTransferRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#mmProtectedATMTransferRequest
 * ATMTransferRequestV01.mmProtectedATMTransferRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#mmATMTransferRequest
 * ATMTransferRequestV01.mmATMTransferRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMTransferRequestV01#mmSecurityTrailer
 * ATMTransferRequestV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catp.016.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMTransferRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ATMTransferRequest message is sent by an ATM to an ATM manager to request the approval of a fund transfer at the ATM."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMTransferRequestV01", propOrder = {"header", "protectedATMTransferRequest", "ATMTransferRequest", "securityTrailer"})
public class ATMTransferRequestV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Header31 header;
	/**
	 * Information related to the protocol management on a segment of the path
	 * from the ATM to the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header31
	 * Header31}</li>
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
	 * "Information related to the protocol management on a segment of the path from the ATM to the acquirer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management on a segment of the path from the ATM to the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header31.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMTransferRequestV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ContentInformationType10 protectedATMTransferRequest;
	/**
	 * Encrypted body of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdATMTrfReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedATMTransferRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted body of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProtectedATMTransferRequest = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrtctdATMTrfReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedATMTransferRequest";
			definition = "Encrypted body of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMTransferRequestV01.class.getMethod("getProtectedATMTransferRequest", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ATMTransferRequest1 aTMTransferRequest;
	/**
	 * Information related to the request of a fund transfer from an ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransferRequest1
	 * ATMTransferRequest1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMTrfReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMTransferRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the request of a fund transfer from an ATM."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmATMTransferRequest = new MMMessageBuildingBlock() {
		{
			xmlTag = "ATMTrfReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTransferRequest";
			definition = "Information related to the request of a fund transfer from an ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ATMTransferRequest1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMTransferRequestV01.class.getMethod("getATMTransferRequest", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ContentInformationType15 securityTrailer;
	/**
	 * Trailer of the message containing a MAC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType15
	 * ContentInformationType15}</li>
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
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType15.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMTransferRequestV01.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransferRequestV01";
				definition = "The ATMTransferRequest message is sent by an ATM to an ATM manager to request the approval of a fund transfer at the ATM.";
				messageSet_lazy = () -> Arrays.asList(ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "ATMTrfReq";
				businessArea_lazy = () -> ATMCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catp.ATMTransferRequestV01.mmHeader, com.tools20022.repository.area.catp.ATMTransferRequestV01.mmProtectedATMTransferRequest,
						com.tools20022.repository.area.catp.ATMTransferRequestV01.mmATMTransferRequest, com.tools20022.repository.area.catp.ATMTransferRequestV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catp";
						messageFunctionality = "016";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ATMTransferRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public Header31 getHeader() {
		return header;
	}

	public void setHeader(Header31 header) {
		this.header = header;
	}

	@XmlElement(name = "PrtctdATMTrfReq")
	public ContentInformationType10 getProtectedATMTransferRequest() {
		return protectedATMTransferRequest;
	}

	public void setProtectedATMTransferRequest(ContentInformationType10 protectedATMTransferRequest) {
		this.protectedATMTransferRequest = protectedATMTransferRequest;
	}

	@XmlElement(name = "ATMTrfReq")
	public ATMTransferRequest1 getATMTransferRequest() {
		return aTMTransferRequest;
	}

	public void setATMTransferRequest(ATMTransferRequest1 aTMTransferRequest) {
		this.aTMTransferRequest = aTMTransferRequest;
	}

	@XmlElement(name = "SctyTrlr")
	public ContentInformationType15 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:catp.016.01.01")
	static public class Document {
		@XmlElement(name = "ATMTrfReq", required = true)
		public ATMTransferRequestV01 messageBody;
	}
}