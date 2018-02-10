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

package com.tools20022.repository.area.secl;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesClearingLatestVersion;
import com.tools20022.repository.choice.PartyIdentification35Choice;
import com.tools20022.repository.msg.NetPosition3;
import com.tools20022.repository.msg.Pagination;
import com.tools20022.repository.msg.ReportParameters1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Net Position Report message is sent by the central counterparty (CCP) to
 * a clearing member to confirm the net position of all trade legs reported
 * during the day.<br>
 * <br>
 * The message definition is intended for use with the ISO 20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * The central counterparty (CCP) nets all the positions per clearing account
 * and sends the Net Position report message to the Clearing member.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.NetPositionV03#mmReportParameters
 * NetPositionV03.mmReportParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.NetPositionV03#mmPagination
 * NetPositionV03.mmPagination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.NetPositionV03#mmClearingMember
 * NetPositionV03.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.NetPositionV03#mmClearingSegment
 * NetPositionV03.mmClearingSegment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.NetPositionV03#mmNetPositionReport
 * NetPositionV03.mmNetPositionReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.NetPositionV03#mmSupplementaryData
 * NetPositionV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion
 * CentralCounterPartyCCPSecuritiesClearingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "NetPos"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesClearingLatestVersion
 * SecuritiesClearingLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code secl.004.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NetPositionV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Net Position Report message is sent by the central counterparty (CCP) to a clearing member to confirm the net position of all trade legs reported during the day.\r\n\r\nThe message definition is intended for use with the ISO 20022 Business Application Header.\r\n\r\nUsage\r\nThe central counterparty (CCP) nets all the positions per clearing account and sends the Net Position report message to the Clearing member."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NetPositionV03", propOrder = {"reportParameters", "pagination", "clearingMember", "clearingSegment", "netPositionReport", "supplementaryData"})
public class NetPositionV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RptParams", required = true)
	protected ReportParameters1 reportParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReportParameters1
	 * ReportParameters1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides parameters of the margin report such as the creation date and time, the report currency or the calculation date and time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportParameters = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportParameters";
			definition = "Provides parameters of the margin report such as the creation date and time, the report currency or the calculation date and time.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportParameters1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetPositionV03.class.getMethod("getReportParameters", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Pgntn", required = true)
	protected Pagination pagination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Pagination
	 * Pagination}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pgntn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pagination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about the number of used pages."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmPagination = new MMMessageBuildingBlock() {
		{
			xmlTag = "Pgntn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pagination";
			definition = "Provides information about the number of used pages.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Pagination.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetPositionV03.class.getMethod("getPagination", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ClrMmb", required = true)
	protected PartyIdentification35Choice clearingMember;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the identification of the account owner, that is the clearing member (individual clearing member or general clearing member)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmClearingMember = new MMMessageBuildingBlock() {
		{
			xmlTag = "ClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMember";
			definition = "Provides the identification of the account owner, that is the clearing member (individual clearing member or general clearing member).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetPositionV03.class.getMethod("getClearingMember", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ClrSgmt")
	protected PartyIdentification35Choice clearingSegment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrSgmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSegment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Clearing organisation that will clear the trade.\r\n\r\nNote: This field allows Clearing Member Firm to segregate flows coming from clearing counterparty's clearing system. Indeed, Clearing Member Firms receive messages from the same system (same sender) and this field allows them to know if the message is related to equities or derivatives."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmClearingSegment = new MMMessageBuildingBlock() {
		{
			xmlTag = "ClrSgmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSegment";
			definition = "Clearing organisation that will clear the trade.\r\n\r\nNote: This field allows Clearing Member Firm to segregate flows coming from clearing counterparty's clearing system. Indeed, Clearing Member Firms receive messages from the same system (same sender) and this field allows them to know if the message is related to equities or derivatives.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetPositionV03.class.getMethod("getClearingSegment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "NetPosRpt", required = true)
	protected List<NetPosition3> netPositionReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.NetPosition3
	 * NetPosition3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetPosRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetPositionReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the net position details such as the average deal price and net quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmNetPositionReport = new MMMessageBuildingBlock() {
		{
			xmlTag = "NetPosRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetPositionReport";
			definition = "Provides the net position details such as the average deal price and net quantity.";
			minOccurs = 1;
			complexType_lazy = () -> NetPosition3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetPositionV03.class.getMethod("getNetPositionReport", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetPositionV03.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetPositionV03";
				definition = "Scope\r\nThe Net Position Report message is sent by the central counterparty (CCP) to a clearing member to confirm the net position of all trade legs reported during the day.\r\n\r\nThe message definition is intended for use with the ISO 20022 Business Application Header.\r\n\r\nUsage\r\nThe central counterparty (CCP) nets all the positions per clearing account and sends the Net Position report message to the Clearing member.";
				messageSet_lazy = () -> Arrays.asList(CentralCounterPartyCCPSecuritiesClearingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "NetPos";
				businessArea_lazy = () -> SecuritiesClearingLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.secl.NetPositionV03.mmReportParameters, com.tools20022.repository.area.secl.NetPositionV03.mmPagination,
						com.tools20022.repository.area.secl.NetPositionV03.mmClearingMember, com.tools20022.repository.area.secl.NetPositionV03.mmClearingSegment, com.tools20022.repository.area.secl.NetPositionV03.mmNetPositionReport,
						com.tools20022.repository.area.secl.NetPositionV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "secl";
						messageFunctionality = "004";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return NetPositionV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public ReportParameters1 getReportParameters() {
		return reportParameters;
	}

	public NetPositionV03 setReportParameters(ReportParameters1 reportParameters) {
		this.reportParameters = Objects.requireNonNull(reportParameters);
		return this;
	}

	public Pagination getPagination() {
		return pagination;
	}

	public NetPositionV03 setPagination(Pagination pagination) {
		this.pagination = Objects.requireNonNull(pagination);
		return this;
	}

	public PartyIdentification35Choice getClearingMember() {
		return clearingMember;
	}

	public NetPositionV03 setClearingMember(PartyIdentification35Choice clearingMember) {
		this.clearingMember = Objects.requireNonNull(clearingMember);
		return this;
	}

	public Optional<PartyIdentification35Choice> getClearingSegment() {
		return clearingSegment == null ? Optional.empty() : Optional.of(clearingSegment);
	}

	public NetPositionV03 setClearingSegment(PartyIdentification35Choice clearingSegment) {
		this.clearingSegment = clearingSegment;
		return this;
	}

	public List<NetPosition3> getNetPositionReport() {
		return netPositionReport == null ? netPositionReport = new ArrayList<>() : netPositionReport;
	}

	public NetPositionV03 setNetPositionReport(List<NetPosition3> netPositionReport) {
		this.netPositionReport = Objects.requireNonNull(netPositionReport);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public NetPositionV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:secl.004.001.03")
	static public class Document {
		@XmlElement(name = "NetPos", required = true)
		public NetPositionV03 messageBody;
	}
}