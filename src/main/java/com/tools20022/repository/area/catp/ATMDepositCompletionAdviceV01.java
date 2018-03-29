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
import com.tools20022.repository.msg.ATMDepositCompletionAdvice1;
import com.tools20022.repository.msg.ContentInformationType10;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header32;
import com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * The ATMDepositCompletionAdvice message is sent by an ATM to an acquirer or
 * its agent to inform of the result of a deposit transaction at an ATM.<br>
 * If the ATM is configured to only send negative completion, a generic
 * completion message should be used instead of ATMCompletionAdvice.<br>
 * This message can be used each time a bundle is put in the ATM safe and/or at
 * the end of a multi bundle deposit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01#mmHeader
 * ATMDepositCompletionAdviceV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01#mmProtectedATMDepositCompletionAdvice
 * ATMDepositCompletionAdviceV01.mmProtectedATMDepositCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01#mmATMDepositCompletionAdvice
 * ATMDepositCompletionAdviceV01.mmATMDepositCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01#mmSecurityTrailer
 * ATMDepositCompletionAdviceV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion
 * ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ATMDpstCmpltnAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ATMCardTransactionLatestVersion
 * ATMCardTransactionLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catp.014.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMDepositCompletionAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The ATMDepositCompletionAdvice message is sent by an ATM to an acquirer or its agent to inform of the result of a deposit transaction at an ATM.\r\nIf the ATM is configured to only send negative completion, a generic completion message should be used instead of ATMCompletionAdvice.\r\nThis message can be used each time a bundle is put in the ATM safe and/or at the end of a multi bundle deposit."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMDepositCompletionAdviceV01", propOrder = {"header", "protectedATMDepositCompletionAdvice", "aTMDepositCompletionAdvice", "securityTrailer"})
public class ATMDepositCompletionAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header32 header;
	/**
	 * 
	 <p>
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
	public static final MMMessageBuildingBlock<ATMDepositCompletionAdviceV01, Header32> mmHeader = new MMMessageBuildingBlock<ATMDepositCompletionAdviceV01, Header32>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management on a segment of the path from the ATM to the acquirer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header32.mmObject();
		}

		@Override
		public Header32 getValue(ATMDepositCompletionAdviceV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(ATMDepositCompletionAdviceV01 obj, Header32 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "PrtctdATMDpstCmpltnAdvc")
	protected ContentInformationType10 protectedATMDepositCompletionAdvice;
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
	 * xmlTag} = "PrtctdATMDpstCmpltnAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedATMDepositCompletionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted body of the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDepositCompletionAdviceV01, Optional<ContentInformationType10>> mmProtectedATMDepositCompletionAdvice = new MMMessageBuildingBlock<ATMDepositCompletionAdviceV01, Optional<ContentInformationType10>>() {
		{
			xmlTag = "PrtctdATMDpstCmpltnAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedATMDepositCompletionAdvice";
			definition = "Encrypted body of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType10.mmObject();
		}

		@Override
		public Optional<ContentInformationType10> getValue(ATMDepositCompletionAdviceV01 obj) {
			return obj.getProtectedATMDepositCompletionAdvice();
		}

		@Override
		public void setValue(ATMDepositCompletionAdviceV01 obj, Optional<ContentInformationType10> value) {
			obj.setProtectedATMDepositCompletionAdvice(value.orElse(null));
		}
	};
	@XmlElement(name = "ATMDpstCmpltnAdvc")
	protected ATMDepositCompletionAdvice1 aTMDepositCompletionAdvice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMDepositCompletionAdvice1
	 * ATMDepositCompletionAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ATMDpstCmpltnAdvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDepositCompletionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the completion of a deposit transaction on the ATM."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ATMDepositCompletionAdviceV01, Optional<ATMDepositCompletionAdvice1>> mmATMDepositCompletionAdvice = new MMMessageBuildingBlock<ATMDepositCompletionAdviceV01, Optional<ATMDepositCompletionAdvice1>>() {
		{
			xmlTag = "ATMDpstCmpltnAdvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositCompletionAdvice";
			definition = "Information related to the completion of a deposit transaction on the ATM.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ATMDepositCompletionAdvice1.mmObject();
		}

		@Override
		public Optional<ATMDepositCompletionAdvice1> getValue(ATMDepositCompletionAdviceV01 obj) {
			return obj.getATMDepositCompletionAdvice();
		}

		@Override
		public void setValue(ATMDepositCompletionAdviceV01 obj, Optional<ATMDepositCompletionAdvice1> value) {
			obj.setATMDepositCompletionAdvice(value.orElse(null));
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
	public static final MMMessageBuildingBlock<ATMDepositCompletionAdviceV01, Optional<ContentInformationType15>> mmSecurityTrailer = new MMMessageBuildingBlock<ATMDepositCompletionAdviceV01, Optional<ContentInformationType15>>() {
		{
			xmlTag = "SctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityTrailer";
			definition = "Trailer of the message containing a MAC.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContentInformationType15.mmObject();
		}

		@Override
		public Optional<ContentInformationType15> getValue(ATMDepositCompletionAdviceV01 obj) {
			return obj.getSecurityTrailer();
		}

		@Override
		public void setValue(ATMDepositCompletionAdviceV01 obj, Optional<ContentInformationType15> value) {
			obj.setSecurityTrailer(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMDepositCompletionAdviceV01";
				definition = "The ATMDepositCompletionAdvice message is sent by an ATM to an acquirer or its agent to inform of the result of a deposit transaction at an ATM.\r\nIf the ATM is configured to only send negative completion, a generic completion message should be used instead of ATMCompletionAdvice.\r\nThis message can be used each time a bundle is put in the ATM safe and/or at the end of a multi bundle deposit.";
				messageSet_lazy = () -> Arrays.asList(ATMInterfaceforTransactionProcessingandATMManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "ATMDpstCmpltnAdvc";
				businessArea_lazy = () -> ATMCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01.mmHeader,
						com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01.mmProtectedATMDepositCompletionAdvice, com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01.mmATMDepositCompletionAdvice,
						com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catp";
						messageFunctionality = "014";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ATMDepositCompletionAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header32 getHeader() {
		return header;
	}

	public ATMDepositCompletionAdviceV01 setHeader(Header32 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public Optional<ContentInformationType10> getProtectedATMDepositCompletionAdvice() {
		return protectedATMDepositCompletionAdvice == null ? Optional.empty() : Optional.of(protectedATMDepositCompletionAdvice);
	}

	public ATMDepositCompletionAdviceV01 setProtectedATMDepositCompletionAdvice(ContentInformationType10 protectedATMDepositCompletionAdvice) {
		this.protectedATMDepositCompletionAdvice = protectedATMDepositCompletionAdvice;
		return this;
	}

	public Optional<ATMDepositCompletionAdvice1> getATMDepositCompletionAdvice() {
		return aTMDepositCompletionAdvice == null ? Optional.empty() : Optional.of(aTMDepositCompletionAdvice);
	}

	public ATMDepositCompletionAdviceV01 setATMDepositCompletionAdvice(ATMDepositCompletionAdvice1 aTMDepositCompletionAdvice) {
		this.aTMDepositCompletionAdvice = aTMDepositCompletionAdvice;
		return this;
	}

	public Optional<ContentInformationType15> getSecurityTrailer() {
		return securityTrailer == null ? Optional.empty() : Optional.of(securityTrailer);
	}

	public ATMDepositCompletionAdviceV01 setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catp.014.001.01")
	static public class Document {
		@XmlElement(name = "ATMDpstCmpltnAdvc", required = true)
		public ATMDepositCompletionAdviceV01 messageBody;
	}
}