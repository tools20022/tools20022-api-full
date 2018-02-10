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
import com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header21;
import com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The ATMWithdrawalCompletionAcknowledgement message is sent by an acquirer or
 * its agent to an ATM to acknowledge the receipt of an
 * ATMWithdrawalCompletionAdvice message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01#mmHeader
 * ATMWithdrawalCompletionAcknowledgementV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01#mmProtectedATMWithdrawalCompletionAcknowledgement
 * ATMWithdrawalCompletionAcknowledgementV01.
 * mmProtectedATMWithdrawalCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01#mmATMWithdrawalCompletionAcknowledgement
 * ATMWithdrawalCompletionAcknowledgementV01.
 * mmATMWithdrawalCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01#mmSecurityTrailer
 * ATMWithdrawalCompletionAcknowledgementV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion
 * ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ATMWdrwlCmpltnAck"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ATMCardTransactionLatestVersion
 * ATMCardTransactionLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catp.004.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMWithdrawalCompletionAcknowledgementV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ATMWithdrawalCompletionAcknowledgement message is sent by an acquirer or its agent to an ATM to acknowledge the receipt of an ATMWithdrawalCompletionAdvice message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV02
 * ATMWithdrawalCompletionAcknowledgementV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMWithdrawalCompletionAcknowledgementV01", propOrder = {"header", "protectedATMWithdrawalCompletionAcknowledgement", "aTMWithdrawalCompletionAcknowledgement", "securityTrailer"})
public class ATMWithdrawalCompletionAcknowledgementV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header21 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header21
	 * Header21}</li>
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
			complexType_lazy = () -> Header21.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMWithdrawalCompletionAcknowledgementV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PrtctdATMWdrwlCmpltnAck")
	protected ContentInformationType10 protectedATMWithdrawalCompletionAcknowledgement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType10
	 * ContentInformationType10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdATMWdrwlCmpltnAck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedATMWithdrawalCompletionAcknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted body of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProtectedATMWithdrawalCompletionAcknowledgement = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrtctdATMWdrwlCmpltnAck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedATMWithdrawalCompletionAcknowledgement";
			definition = "Encrypted body of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMWithdrawalCompletionAcknowledgementV01.class.getMethod("getProtectedATMWithdrawalCompletionAcknowledgement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ATMWdrwlCmpltnAck")
	protected ATMWithdrawalCompletionAcknowledgement1 aTMWithdrawalCompletionAcknowledgement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAcknowledgement1
	 * ATMWithdrawalCompletionAcknowledgement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMWdrwlCmpltnAck"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalCompletionAcknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the acknowledgement  of an ATM withdrawal transaction from the ATM manager."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmATMWithdrawalCompletionAcknowledgement = new MMMessageBuildingBlock() {
		{
			xmlTag = "ATMWdrwlCmpltnAck";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalCompletionAcknowledgement";
			definition = "Information related to the acknowledgement  of an ATM withdrawal transaction from the ATM manager.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ATMWithdrawalCompletionAcknowledgement1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMWithdrawalCompletionAcknowledgementV01.class.getMethod("getATMWithdrawalCompletionAcknowledgement", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SctyTrlr")
	protected ContentInformationType15 securityTrailer;
	/**
	 * 
	 <p>
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
				return ATMWithdrawalCompletionAcknowledgementV01.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMWithdrawalCompletionAcknowledgementV01";
				definition = "The ATMWithdrawalCompletionAcknowledgement message is sent by an acquirer or its agent to an ATM to acknowledge the receipt of an ATMWithdrawalCompletionAdvice message.";
				nextVersions_lazy = () -> Arrays.asList(ATMWithdrawalCompletionAcknowledgementV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ATMInterfaceforTransactionProcessingandATMManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "ATMWdrwlCmpltnAck";
				businessArea_lazy = () -> ATMCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays
						.asList(com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01.mmHeader,
								com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01.mmProtectedATMWithdrawalCompletionAcknowledgement,
								com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01.mmATMWithdrawalCompletionAcknowledgement,
								com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catp";
						messageFunctionality = "004";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ATMWithdrawalCompletionAcknowledgementV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header21 getHeader() {
		return header;
	}

	public ATMWithdrawalCompletionAcknowledgementV01 setHeader(Header21 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public Optional<ContentInformationType10> getProtectedATMWithdrawalCompletionAcknowledgement() {
		return protectedATMWithdrawalCompletionAcknowledgement == null ? Optional.empty() : Optional.of(protectedATMWithdrawalCompletionAcknowledgement);
	}

	public ATMWithdrawalCompletionAcknowledgementV01 setProtectedATMWithdrawalCompletionAcknowledgement(ContentInformationType10 protectedATMWithdrawalCompletionAcknowledgement) {
		this.protectedATMWithdrawalCompletionAcknowledgement = protectedATMWithdrawalCompletionAcknowledgement;
		return this;
	}

	public Optional<ATMWithdrawalCompletionAcknowledgement1> getATMWithdrawalCompletionAcknowledgement() {
		return aTMWithdrawalCompletionAcknowledgement == null ? Optional.empty() : Optional.of(aTMWithdrawalCompletionAcknowledgement);
	}

	public ATMWithdrawalCompletionAcknowledgementV01 setATMWithdrawalCompletionAcknowledgement(ATMWithdrawalCompletionAcknowledgement1 aTMWithdrawalCompletionAcknowledgement) {
		this.aTMWithdrawalCompletionAcknowledgement = aTMWithdrawalCompletionAcknowledgement;
		return this;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public ATMWithdrawalCompletionAcknowledgementV01 setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.004.001.01")
	static public class Document {
		@XmlElement(name = "ATMWdrwlCmpltnAck", required = true)
		public ATMWithdrawalCompletionAcknowledgementV01 messageBody;
	}
}