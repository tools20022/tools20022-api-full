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
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header20;
import com.tools20022.repository.msg.HostToATMAcknowledgement1;
import com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion;
import com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The HostToATMAcknowledgement message is sent by an ATM to a host to
 * acknowledge the receipt of a HostToATMRequest message.
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
 * {@linkplain com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion
 * ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion
 * ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "HstToATMAck"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01#mmHeader
 * HostToATMAcknowledgementV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01#mmProtectedHostToATMAcknowledgement
 * HostToATMAcknowledgementV01.mmProtectedHostToATMAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01#mmHostToATMAcknowledgement
 * HostToATMAcknowledgementV01.mmHostToATMAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01#mmSecurityTrailer
 * HostToATMAcknowledgementV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code caam.008.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "HostToATMAcknowledgementV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The HostToATMAcknowledgement message is sent by an ATM to a host to acknowledge the receipt of a HostToATMRequest message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "HostToATMAcknowledgementV01", propOrder = {"header", "protectedHostToATMAcknowledgement", "hostToATMAcknowledgement", "securityTrailer"})
public class HostToATMAcknowledgementV01 {

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
				return HostToATMAcknowledgementV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ContentInformationType10 protectedHostToATMAcknowledgement;
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
	 * xmlTag} = "PrtctdHstToATMAck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedHostToATMAcknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted body of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProtectedHostToATMAcknowledgement = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrtctdHstToATMAck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedHostToATMAcknowledgement";
			definition = "Encrypted body of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return HostToATMAcknowledgementV01.class.getMethod("getProtectedHostToATMAcknowledgement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected HostToATMAcknowledgement1 hostToATMAcknowledgement;
	/**
	 * Information related to the acknowledgement from an ATM to contact the ATM
	 * manager.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.HostToATMAcknowledgement1
	 * HostToATMAcknowledgement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HstToATMAck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostToATMAcknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the acknowledgement from an ATM to contact the ATM manager."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHostToATMAcknowledgement = new MMMessageBuildingBlock() {
		{
			xmlTag = "HstToATMAck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostToATMAcknowledgement";
			definition = "Information related to the acknowledgement from an ATM to contact the ATM manager.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> HostToATMAcknowledgement1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return HostToATMAcknowledgementV01.class.getMethod("getHostToATMAcknowledgement", new Class[]{});
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
				return HostToATMAcknowledgementV01.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "HostToATMAcknowledgementV01";
				definition = "The HostToATMAcknowledgement message is sent by an ATM to a host to acknowledge the receipt of a HostToATMRequest message.";
				messageSet_lazy = () -> Arrays.asList(ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion.mmObject(), ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "HstToATMAck";
				businessArea_lazy = () -> ATMManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.caam.HostToATMAcknowledgementV01.mmHeader, com.tools20022.repository.area.caam.HostToATMAcknowledgementV01.mmProtectedHostToATMAcknowledgement,
						com.tools20022.repository.area.caam.HostToATMAcknowledgementV01.mmHostToATMAcknowledgement, com.tools20022.repository.area.caam.HostToATMAcknowledgementV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "caam";
						messageFunctionality = "008";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return HostToATMAcknowledgementV01.class;
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

	@XmlElement(name = "PrtctdHstToATMAck")
	public ContentInformationType10 getProtectedHostToATMAcknowledgement() {
		return protectedHostToATMAcknowledgement;
	}

	public void setProtectedHostToATMAcknowledgement(ContentInformationType10 protectedHostToATMAcknowledgement) {
		this.protectedHostToATMAcknowledgement = protectedHostToATMAcknowledgement;
	}

	@XmlElement(name = "HstToATMAck")
	public HostToATMAcknowledgement1 getHostToATMAcknowledgement() {
		return hostToATMAcknowledgement;
	}

	public void setHostToATMAcknowledgement(HostToATMAcknowledgement1 hostToATMAcknowledgement) {
		this.hostToATMAcknowledgement = hostToATMAcknowledgement;
	}

	@XmlElement(name = "SctyTrlr")
	public ContentInformationType15 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:caam.008.01.01")
	static public class Document {
		@XmlElement(name = "HstToATMAck", required = true)
		public HostToATMAcknowledgementV01 messageBody;
	}
}