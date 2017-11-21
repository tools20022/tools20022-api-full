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
import com.tools20022.repository.msg.ATMWithdrawalResponse1;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header20;
import com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The ATMWithdrawalResponse message is sent by an acquirer or its agent to an
 * ATM in response to the ATMWithdrawalRequest to inform the ATM of the approval
 * or decline of the withdrawal transaction.
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
 * {@linkplain com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion
 * ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ATMWdrwlRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV01#mmHeader
 * ATMWithdrawalResponseV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV01#mmProtectedATMWithdrawalResponse
 * ATMWithdrawalResponseV01.mmProtectedATMWithdrawalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV01#mmATMWithdrawalResponse
 * ATMWithdrawalResponseV01.mmATMWithdrawalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV01#mmSecurityTrailer
 * ATMWithdrawalResponseV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catp.002.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMWithdrawalResponseV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ATMWithdrawalResponse message is sent by an acquirer or its agent to an ATM in response to the ATMWithdrawalRequest to inform the ATM of the approval or decline of the withdrawal transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV02
 * ATMWithdrawalResponseV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMWithdrawalResponseV01", propOrder = {"header", "protectedATMWithdrawalResponse", "ATMWithdrawalResponse", "securityTrailer"})
public class ATMWithdrawalResponseV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Header20 header;
	/**
	 * Information related to the protocol management on a segment of the path
	 * from the ATM to the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header20
	 * Header20}</li>
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
			complexType_lazy = () -> Header20.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMWithdrawalResponseV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ContentInformationType10 protectedATMWithdrawalResponse;
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
	 * xmlTag} = "PrtctdATMWdrwlRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedATMWithdrawalResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted body of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProtectedATMWithdrawalResponse = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrtctdATMWdrwlRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedATMWithdrawalResponse";
			definition = "Encrypted body of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMWithdrawalResponseV01.class.getMethod("getProtectedATMWithdrawalResponse", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ATMWithdrawalResponse1 aTMWithdrawalResponse;
	/**
	 * Information related to the response of an ATM withdrawal transaction from
	 * an ATM manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalResponse1
	 * ATMWithdrawalResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMWdrwlRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the response of an ATM withdrawal transaction from an ATM manager."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmATMWithdrawalResponse = new MMMessageBuildingBlock() {
		{
			xmlTag = "ATMWdrwlRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalResponse";
			definition = "Information related to the response of an ATM withdrawal transaction from an ATM manager.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ATMWithdrawalResponse1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMWithdrawalResponseV01.class.getMethod("getATMWithdrawalResponse", new Class[]{});
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
				return ATMWithdrawalResponseV01.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMWithdrawalResponseV01";
				definition = "The ATMWithdrawalResponse message is sent by an acquirer or its agent to an ATM in response to the ATMWithdrawalRequest to inform the ATM of the approval or decline of the withdrawal transaction.";
				nextVersions_lazy = () -> Arrays.asList(ATMWithdrawalResponseV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "ATMWdrwlRspn";
				businessArea_lazy = () -> ATMCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catp.ATMWithdrawalResponseV01.mmHeader, com.tools20022.repository.area.catp.ATMWithdrawalResponseV01.mmProtectedATMWithdrawalResponse,
						com.tools20022.repository.area.catp.ATMWithdrawalResponseV01.mmATMWithdrawalResponse, com.tools20022.repository.area.catp.ATMWithdrawalResponseV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catp";
						messageFunctionality = "002";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ATMWithdrawalResponseV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public Header20 getHeader() {
		return header;
	}

	public void setHeader(Header20 header) {
		this.header = header;
	}

	@XmlElement(name = "PrtctdATMWdrwlRspn")
	public ContentInformationType10 getProtectedATMWithdrawalResponse() {
		return protectedATMWithdrawalResponse;
	}

	public void setProtectedATMWithdrawalResponse(ContentInformationType10 protectedATMWithdrawalResponse) {
		this.protectedATMWithdrawalResponse = protectedATMWithdrawalResponse;
	}

	@XmlElement(name = "ATMWdrwlRspn")
	public ATMWithdrawalResponse1 getATMWithdrawalResponse() {
		return aTMWithdrawalResponse;
	}

	public void setATMWithdrawalResponse(ATMWithdrawalResponse1 aTMWithdrawalResponse) {
		this.aTMWithdrawalResponse = aTMWithdrawalResponse;
	}

	@XmlElement(name = "SctyTrlr")
	public ContentInformationType15 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:catp.002.01.01")
	static public class Document {
		@XmlElement(name = "ATMWdrwlRspn", required = true)
		public ATMWithdrawalResponseV01 messageBody;
	}
}