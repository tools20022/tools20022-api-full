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
import com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice2;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header32;
import com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The ATMWithdrawalCompletionAdvice message is sent by an ATM to an acquirer or
 * its agent to inform of the result of a withdrawal transaction at an ATM.<br>
 * If the ATM is configured to only send negative completion, a generic
 * completion message should be used instead of ATMCompletionAdvice.
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
 * xmlTag} = "ATMWdrwlCmpltnAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02#mmHeader
 * ATMWithdrawalCompletionAdviceV02.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02#mmProtectedATMWithdrawalCompletionAdvice
 * ATMWithdrawalCompletionAdviceV02.mmProtectedATMWithdrawalCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02#mmATMWithdrawalCompletionAdvice
 * ATMWithdrawalCompletionAdviceV02.mmATMWithdrawalCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02#mmSecurityTrailer
 * ATMWithdrawalCompletionAdviceV02.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catp.003.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMWithdrawalCompletionAdviceV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ATMWithdrawalCompletionAdvice message is sent by an ATM to an acquirer or its agent to inform of the result of a withdrawal transaction at an ATM.\r\nIf the ATM is configured to only send negative completion, a generic completion message should be used instead of ATMCompletionAdvice."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV01
 * ATMWithdrawalCompletionAdviceV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMWithdrawalCompletionAdviceV02", propOrder = {"header", "protectedATMWithdrawalCompletionAdvice", "ATMWithdrawalCompletionAdvice", "securityTrailer"})
public class ATMWithdrawalCompletionAdviceV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Header32 header;
	/**
	 * Information related to the protocol management on a segment of the path
	 * from the ATM to the acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header32
	 * Header32}</li>
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
			complexType_lazy = () -> Header32.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMWithdrawalCompletionAdviceV02.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ContentInformationType10 protectedATMWithdrawalCompletionAdvice;
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
	 * xmlTag} = "PrtctdATMWdrwlCmpltnAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedATMWithdrawalCompletionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted body of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProtectedATMWithdrawalCompletionAdvice = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrtctdATMWdrwlCmpltnAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedATMWithdrawalCompletionAdvice";
			definition = "Encrypted body of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType10.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMWithdrawalCompletionAdviceV02.class.getMethod("getProtectedATMWithdrawalCompletionAdvice", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ATMWithdrawalCompletionAdvice2 aTMWithdrawalCompletionAdvice;
	/**
	 * Information related to the completion of a withdrawal transaction on the
	 * ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMWithdrawalCompletionAdvice2
	 * ATMWithdrawalCompletionAdvice2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMWdrwlCmpltnAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalCompletionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the completion of a withdrawal transaction on the ATM."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmATMWithdrawalCompletionAdvice = new MMMessageBuildingBlock() {
		{
			xmlTag = "ATMWdrwlCmpltnAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalCompletionAdvice";
			definition = "Information related to the completion of a withdrawal transaction on the ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ATMWithdrawalCompletionAdvice2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ATMWithdrawalCompletionAdviceV02.class.getMethod("getATMWithdrawalCompletionAdvice", new Class[]{});
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
				return ATMWithdrawalCompletionAdviceV02.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMWithdrawalCompletionAdviceV02";
				definition = "The ATMWithdrawalCompletionAdvice message is sent by an ATM to an acquirer or its agent to inform of the result of a withdrawal transaction at an ATM.\r\nIf the ATM is configured to only send negative completion, a generic completion message should be used instead of ATMCompletionAdvice.";
				previousVersion_lazy = () -> ATMWithdrawalCompletionAdviceV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "ATMWdrwlCmpltnAdvc";
				businessArea_lazy = () -> ATMCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02.mmHeader,
						com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02.mmProtectedATMWithdrawalCompletionAdvice, com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02.mmATMWithdrawalCompletionAdvice,
						com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catp";
						messageFunctionality = "003";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ATMWithdrawalCompletionAdviceV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public Header32 getHeader() {
		return header;
	}

	public void setHeader(Header32 header) {
		this.header = header;
	}

	@XmlElement(name = "PrtctdATMWdrwlCmpltnAdvc")
	public ContentInformationType10 getProtectedATMWithdrawalCompletionAdvice() {
		return protectedATMWithdrawalCompletionAdvice;
	}

	public void setProtectedATMWithdrawalCompletionAdvice(ContentInformationType10 protectedATMWithdrawalCompletionAdvice) {
		this.protectedATMWithdrawalCompletionAdvice = protectedATMWithdrawalCompletionAdvice;
	}

	@XmlElement(name = "ATMWdrwlCmpltnAdvc")
	public ATMWithdrawalCompletionAdvice2 getATMWithdrawalCompletionAdvice() {
		return aTMWithdrawalCompletionAdvice;
	}

	public void setATMWithdrawalCompletionAdvice(ATMWithdrawalCompletionAdvice2 aTMWithdrawalCompletionAdvice) {
		this.aTMWithdrawalCompletionAdvice = aTMWithdrawalCompletionAdvice;
	}

	@XmlElement(name = "SctyTrlr")
	public ContentInformationType15 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:catp.003.02.02")
	static public class Document {
		@XmlElement(name = "ATMWdrwlCmpltnAdvc", required = true)
		public ATMWithdrawalCompletionAdviceV02 messageBody;
	}
}