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

package com.tools20022.repository.area.caam;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ATMManagementLatestVersion;
import com.tools20022.repository.msg.ATMDiagnosticResponse2;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header31;
import com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The ATMDiagnosticResponse message is sent by an acquirer to an ATM in
 * response to an ATMDiagnosticRequest message ensuring the availability and the
 * validity of the parameters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ATMManagementLatestVersion
 * ATMManagementLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion
 * ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ATMDgnstcRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV02#mmHeader
 * ATMDiagnosticResponseV02.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV02#mmProtectedATMDiagnosticResponse
 * ATMDiagnosticResponseV02.mmProtectedATMDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV02#mmATMDiagnosticResponse
 * ATMDiagnosticResponseV02.mmATMDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV02#mmSecurityTrailer
 * ATMDiagnosticResponseV02.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caam.006.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMDiagnosticResponseV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ATMDiagnosticResponse message is sent by an acquirer to an ATM in response to an ATMDiagnosticRequest message ensuring the availability and the validity of the parameters."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV01
 * ATMDiagnosticResponseV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMDiagnosticResponseV02", propOrder = {"header", "protectedATMDiagnosticResponse", "ATMDiagnosticResponse", "securityTrailer"})
public class ATMDiagnosticResponseV02 {

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
				return ATMDiagnosticResponseV02.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ContentInformationType10 protectedATMDiagnosticResponse;
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
	 * xmlTag} = "PrtctdATMDgnstcRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedATMDiagnosticResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted body of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProtectedATMDiagnosticResponse = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrtctdATMDgnstcRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedATMDiagnosticResponse";
			definition = "Encrypted body of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMDiagnosticResponseV02.class.getMethod("getProtectedATMDiagnosticResponse", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ATMDiagnosticResponse2 aTMDiagnosticResponse;
	/**
	 * Information related to the response of a diagnostic from an ATM manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMDiagnosticResponse2
	 * ATMDiagnosticResponse2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMDgnstcRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDiagnosticResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the response of a diagnostic from an ATM manager."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmATMDiagnosticResponse = new MMMessageBuildingBlock() {
		{
			xmlTag = "ATMDgnstcRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDiagnosticResponse";
			definition = "Information related to the response of a diagnostic from an ATM manager.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ATMDiagnosticResponse2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMDiagnosticResponseV02.class.getMethod("getATMDiagnosticResponse", new Class[]{});
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
				return ATMDiagnosticResponseV02.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDiagnosticResponseV02";
				definition = "The ATMDiagnosticResponse message is sent by an acquirer to an ATM in response to an ATMDiagnosticRequest message ensuring the availability and the validity of the parameters.";
				previousVersion_lazy = () -> ATMDiagnosticResponseV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "ATMDgnstcRspn";
				businessArea_lazy = () -> ATMManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caam.ATMDiagnosticResponseV02.mmHeader, com.tools20022.repository.area.caam.ATMDiagnosticResponseV02.mmProtectedATMDiagnosticResponse,
						com.tools20022.repository.area.caam.ATMDiagnosticResponseV02.mmATMDiagnosticResponse, com.tools20022.repository.area.caam.ATMDiagnosticResponseV02.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caam";
						messageFunctionality = "006";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ATMDiagnosticResponseV02.class;
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

	@XmlElement(name = "PrtctdATMDgnstcRspn")
	public ContentInformationType10 getProtectedATMDiagnosticResponse() {
		return protectedATMDiagnosticResponse;
	}

	public void setProtectedATMDiagnosticResponse(ContentInformationType10 protectedATMDiagnosticResponse) {
		this.protectedATMDiagnosticResponse = protectedATMDiagnosticResponse;
	}

	@XmlElement(name = "ATMDgnstcRspn")
	public ATMDiagnosticResponse2 getATMDiagnosticResponse() {
		return aTMDiagnosticResponse;
	}

	public void setATMDiagnosticResponse(ATMDiagnosticResponse2 aTMDiagnosticResponse) {
		this.aTMDiagnosticResponse = aTMDiagnosticResponse;
	}

	@XmlElement(name = "SctyTrlr")
	public ContentInformationType15 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:caam.006.02.02")
	static public class Document {
		@XmlElement(name = "ATMDgnstcRspn", required = true)
		public ATMDiagnosticResponseV02 messageBody;
	}
}