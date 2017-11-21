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

package com.tools20022.repository.area.catm;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TerminalManagementArchive;
import com.tools20022.repository.msg.ContentInformationType1;
import com.tools20022.repository.msg.Header4;
import com.tools20022.repository.msg.StatusReport1;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The StatusReport message is sent by the card acceptor to the master terminal
 * manager or delegated terminal manager to inform these entities about the
 * status of the acceptor system.<br>
 * <b>Usage</b><br>
 * The StatusReport message may embed the information required by the master
 * terminal manager or delegated terminal manager for preparing the needed TMS
 * actions in the management plan to be replaced and the acceptor parameters to
 * be updated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TerminalManagementArchive
 * TerminalManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "StsRpt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.catm.StatusReportV01#mmHeader
 * StatusReportV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV01#mmStatusReport
 * StatusReportV01.mmStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catm.StatusReportV01#mmSecurityTrailer
 * StatusReportV01.mmSecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code catm.001.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatusReportV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe StatusReport message is sent by the card acceptor to the master terminal manager or delegated terminal manager to inform these entities about the status of the acceptor system.\r\nUsage\r\nThe StatusReport message may embed the information required by the master terminal manager or delegated terminal manager for preparing the needed TMS actions in the management plan to be replaced and the acceptor parameters to be updated."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.catm.StatusReportV02
 * StatusReportV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "StatusReportV01", propOrder = {"header", "statusReport", "securityTrailer"})
public class StatusReportV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Header4 header;
	/**
	 * Set of characteristics related to the transfer of the status report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header4 Header4}
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
	 * definition} =
	 * "Set of characteristics related to the transfer of the status report."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Set of characteristics related to the transfer of the status report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReportV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected StatusReport1 statusReport;
	/**
	 * Status of the point of interaction (POI), its components and their
	 * installed versions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.StatusReport1
	 * StatusReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status of the point of interaction (POI), its components and their installed versions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmStatusReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "StsRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReport";
			definition = "Status of the point of interaction (POI), its components and their installed versions.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StatusReport1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return StatusReportV01.class.getMethod("getStatusReport", new Class[]{});
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
				return StatusReportV01.class.getMethod("getSecurityTrailer", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatusReportV01";
				definition = "Scope\r\nThe StatusReport message is sent by the card acceptor to the master terminal manager or delegated terminal manager to inform these entities about the status of the acceptor system.\r\nUsage\r\nThe StatusReport message may embed the information required by the master terminal manager or delegated terminal manager for preparing the needed TMS actions in the management plan to be replaced and the acceptor parameters to be updated.";
				nextVersions_lazy = () -> Arrays.asList(StatusReportV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "StsRpt";
				businessArea_lazy = () -> TerminalManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.catm.StatusReportV01.mmHeader, com.tools20022.repository.area.catm.StatusReportV01.mmStatusReport,
						com.tools20022.repository.area.catm.StatusReportV01.mmSecurityTrailer);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "catm";
						messageFunctionality = "001";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return StatusReportV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Hdr", required = true)
	public Header4 getHeader() {
		return header;
	}

	public void setHeader(Header4 header) {
		this.header = header;
	}

	@XmlElement(name = "StsRpt", required = true)
	public StatusReport1 getStatusReport() {
		return statusReport;
	}

	public void setStatusReport(StatusReport1 statusReport) {
		this.statusReport = statusReport;
	}

	@XmlElement(name = "SctyTrlr", required = true)
	public ContentInformationType1 getSecurityTrailer() {
		return securityTrailer;
	}

	public void setSecurityTrailer(ContentInformationType1 securityTrailer) {
		this.securityTrailer = securityTrailer;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:catm.001.01.01")
	static public class Document {
		@XmlElement(name = "StsRpt", required = true)
		public StatusReportV01 messageBody;
	}
}