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

package com.tools20022.repository.area.cain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AcquirertoIssuerCardTransactionLatestVersion;
import com.tools20022.repository.msg.AcquirerReversalInitiation1;
import com.tools20022.repository.msg.ContentInformationType15;
import com.tools20022.repository.msg.Header18;
import com.tools20022.repository.msgset.AcquirertoIssuerCardMessagesISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The AcquirerReversalInitiation message is sent by an acquirer or an agent to
 * an issuer or an agent, to request, advice or notify the reversal of a card
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AcquirertoIssuerCardTransactionLatestVersion
 * AcquirertoIssuerCardTransactionLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.AcquirertoIssuerCardMessagesISOLatestversion
 * AcquirertoIssuerCardMessagesISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcqrrRvslInitn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerReversalInitiation#mmHeader
 * AcquirerReversalInitiation.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerReversalInitiation#mmReversalInitiation
 * AcquirerReversalInitiation.mmReversalInitiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerReversalInitiation#mmSecurityTrailer
 * AcquirerReversalInitiation.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code cain.005.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcquirerReversalInitiation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AcquirerReversalInitiation message is sent by an acquirer or an agent to an issuer or an agent, to request, advice or notify the reversal of a card transaction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AcquirerReversalInitiation", propOrder = {"header", "reversalInitiation", "securityTrailer"})
public class AcquirerReversalInitiation {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Header18 header;
	/**
	 * Information related to the protocol management
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header18
	 * Header18}</li>
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
	 * definition} = "Information related to the protocol management"</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Information related to the protocol management";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header18.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcquirerReversalInitiation.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AcquirerReversalInitiation1 reversalInitiation;
	/**
	 * Information related to the reversal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerReversalInitiation1
	 * AcquirerReversalInitiation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RvslInitn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalInitiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the reversal."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReversalInitiation = new MMMessageBuildingBlock() {
		{
			xmlTag = "RvslInitn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalInitiation";
			definition = "Information related to the reversal.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AcquirerReversalInitiation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AcquirerReversalInitiation.class.getMethod("getReversalInitiation", new Class[]{});
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
				return AcquirerReversalInitiation.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerReversalInitiation";
				definition = "The AcquirerReversalInitiation message is sent by an acquirer or an agent to an issuer or an agent, to request, advice or notify the reversal of a card transaction.";
				messageSet_lazy = () -> Arrays.asList(AcquirertoIssuerCardMessagesISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AcqrrRvslInitn";
				businessArea_lazy = () -> AcquirertoIssuerCardTransactionLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.cain.AcquirerReversalInitiation.mmHeader, com.tools20022.repository.area.cain.AcquirerReversalInitiation.mmReversalInitiation,
						com.tools20022.repository.area.cain.AcquirerReversalInitiation.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "cain";
						messageFunctionality = "005";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AcquirerReversalInitiation.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public Header18 getHeader() {
		return header;
	}

	public void setHeader(Header18 header) {
		this.header = header;
	}

	@XmlElement(name = "RvslInitn", required = true)
	public AcquirerReversalInitiation1 getReversalInitiation() {
		return reversalInitiation;
	}

	public void setReversalInitiation(AcquirerReversalInitiation1 reversalInitiation) {
		this.reversalInitiation = reversalInitiation;
	}

	@XmlElement(name = "SctyTrlr")
	public ContentInformationType15 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType15 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:cain.005.01.01")
	static public class Document {
		@XmlElement(name = "AcqrrRvslInitn", required = true)
		public AcquirerReversalInitiation messageBody;
	}
}