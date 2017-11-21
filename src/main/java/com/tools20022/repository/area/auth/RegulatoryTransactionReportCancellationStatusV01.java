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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.choice.PartyIdentification23Choice;
import com.tools20022.repository.msg.DocumentIdentification8;
import com.tools20022.repository.msg.ReportStatusAndReason2;
import com.tools20022.repository.msg.TradeTransactionStatusAndReason2;
import com.tools20022.repository.msgset.TransactionRegulatoryReportingISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * A regulator or an intermediary sends the
 * RegulatoryTransactionReportCancellationStatus to a reporting institution to
 * provide the status of a RegulatoryTransactionReportCancellationRequest
 * previously sent by the reporting institution.<br>
 * <b>Usage</b><br>
 * The message definition may be used to provide a status for the entire report
 * or to provide a status at the level of individual transactions within the
 * report. One of the following statuses can be reported:<br>
 * - Completed, or,<br>
 * - Pending, or,<br>
 * - Rejected.<br>
 * If the status is rejected, then reason for the rejection must be specified.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TransactionRegulatoryReportingISOArchive
 * TransactionRegulatoryReportingISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "RgltryTxRptCxlStsV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmReportCancellationStatusOrIndividualTransactionCancellationStatusRule
 * RegulatoryTransactionReportCancellationStatusV01.
 * mmReportCancellationStatusOrIndividualTransactionCancellationStatusRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmIdentification
 * RegulatoryTransactionReportCancellationStatusV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmReportingInstitution
 * RegulatoryTransactionReportCancellationStatusV01.mmReportingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmReportCancellationStatus
 * RegulatoryTransactionReportCancellationStatusV01.mmReportCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmIndividualTransactionCancellationStatus
 * RegulatoryTransactionReportCancellationStatusV01.
 * mmIndividualTransactionCancellationStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.011.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegulatoryTransactionReportCancellationStatusV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA regulator or an intermediary sends the RegulatoryTransactionReportCancellationStatus to a reporting institution to provide the status of a RegulatoryTransactionReportCancellationRequest previously sent by the reporting institution.\r\nUsage\r\nThe message definition may be used to provide a status for the entire report or to provide a status at the level of individual transactions within the report. One of the following statuses can be reported:\r\n- Completed, or,\r\n- Pending, or,\r\n- Rejected.\r\nIf the status is rejected, then reason for the rejection must be specified."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RegulatoryTransactionReportCancellationStatusV01", propOrder = {"identification", "reportingInstitution", "reportCancellationStatus", "individualTransactionCancellationStatus"})
public class RegulatoryTransactionReportCancellationStatusV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either ReportCancellationStatus or
	 * IndividualTransactionCancellationStatus must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01
	 * RegulatoryTransactionReportCancellationStatusV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmReportCancellationStatus
	 * RegulatoryTransactionReportCancellationStatusV01.
	 * mmReportCancellationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01#mmIndividualTransactionCancellationStatus
	 * RegulatoryTransactionReportCancellationStatusV01.
	 * mmIndividualTransactionCancellationStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "ReportCancellationStatusOrIndividualTransactionCancellationStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either ReportCancellationStatus or IndividualTransactionCancellationStatus must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmReportCancellationStatusOrIndividualTransactionCancellationStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportCancellationStatusOrIndividualTransactionCancellationStatusRule";
			definition = "Either ReportCancellationStatus or IndividualTransactionCancellationStatus must be present, but not both.";
			messageDefinition_lazy = () -> com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmReportCancellationStatus,
					com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmIndividualTransactionCancellationStatus);
		}
	};
	protected DocumentIdentification8 identification;
	/**
	 * Identification of the RegulatoryTransactionReportCancellationStatus
	 * document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the RegulatoryTransactionReportCancellationStatus document."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the RegulatoryTransactionReportCancellationStatus document.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryTransactionReportCancellationStatusV01.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification23Choice reportingInstitution;
	/**
	 * Identification of the firm that executed the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification23Choice
	 * PartyIdentification23Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgInstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingInstitution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the firm that executed the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportingInstitution = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptgInstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingInstitution";
			definition = "Identification of the firm that executed the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification23Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryTransactionReportCancellationStatusV01.class.getMethod("getReportingInstitution", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ReportStatusAndReason2 reportCancellationStatus;
	/**
	 * Provides the status of the entire
	 * RegulatoryTransactionReportCancellationRequest document that was
	 * previously sent by a reporting institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReportStatusAndReason2
	 * ReportStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptCxlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the entire RegulatoryTransactionReportCancellationRequest document that was previously sent by a reporting institution.\n\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportCancellationStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptCxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportCancellationStatus";
			definition = "Provides the status of the entire RegulatoryTransactionReportCancellationRequest document that was previously sent by a reporting institution.\n\n";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportStatusAndReason2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryTransactionReportCancellationStatusV01.class.getMethod("getReportCancellationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<TradeTransactionStatusAndReason2> individualTransactionCancellationStatus;
	/**
	 * Provides the cancellation status of one or more transactions within a
	 * RegulatoryTransactionReportCancellationRequest that was previously sent
	 * by a reporting institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason2
	 * TradeTransactionStatusAndReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvTxCxlSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualTransactionCancellationStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the cancellation status of one or more transactions within a RegulatoryTransactionReportCancellationRequest that was previously sent by a reporting institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIndividualTransactionCancellationStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "IndvTxCxlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualTransactionCancellationStatus";
			definition = "Provides the cancellation status of one or more transactions within a RegulatoryTransactionReportCancellationRequest that was previously sent by a reporting institution.";
			minOccurs = 1;
			complexType_lazy = () -> TradeTransactionStatusAndReason2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return RegulatoryTransactionReportCancellationStatusV01.class.getMethod("getIndividualTransactionCancellationStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryTransactionReportCancellationStatusV01";
				definition = "Scope\r\nA regulator or an intermediary sends the RegulatoryTransactionReportCancellationStatus to a reporting institution to provide the status of a RegulatoryTransactionReportCancellationRequest previously sent by the reporting institution.\r\nUsage\r\nThe message definition may be used to provide a status for the entire report or to provide a status at the level of individual transactions within the report. One of the following statuses can be reported:\r\n- Completed, or,\r\n- Pending, or,\r\n- Rejected.\r\nIf the status is rejected, then reason for the rejection must be specified.";
				messageSet_lazy = () -> Arrays.asList(TransactionRegulatoryReportingISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmReportCancellationStatusOrIndividualTransactionCancellationStatusRule);
				rootElement = "Document";
				xmlTag = "RgltryTxRptCxlStsV01";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmIdentification,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmReportingInstitution,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmReportCancellationStatus,
						com.tools20022.repository.area.auth.RegulatoryTransactionReportCancellationStatusV01.mmIndividualTransactionCancellationStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "011";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return RegulatoryTransactionReportCancellationStatusV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public void setIdentification(DocumentIdentification8 identification) {
		this.identification = identification;
	}

	@XmlElement(name = "RptgInstn", required = true)
	public PartyIdentification23Choice getReportingInstitution() {
		return reportingInstitution;
	}

	public void setReportingInstitution(PartyIdentification23Choice reportingInstitution) {
		this.reportingInstitution = reportingInstitution;
	}

	@XmlElement(name = "RptCxlSts", required = true)
	public ReportStatusAndReason2 getReportCancellationStatus() {
		return reportCancellationStatus;
	}

	public void setReportCancellationStatus(ReportStatusAndReason2 reportCancellationStatus) {
		this.reportCancellationStatus = reportCancellationStatus;
	}

	@XmlElement(name = "IndvTxCxlSts", required = true)
	public List<TradeTransactionStatusAndReason2> getIndividualTransactionCancellationStatus() {
		return individualTransactionCancellationStatus;
	}

	public void setIndividualTransactionCancellationStatus(List<TradeTransactionStatusAndReason2> individualTransactionCancellationStatus) {
		this.individualTransactionCancellationStatus = individualTransactionCancellationStatus;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:auth.011.01.01")
	static public class Document {
		@XmlElement(name = "RgltryTxRptCxlStsV01", required = true)
		public RegulatoryTransactionReportCancellationStatusV01 messageBody;
	}
}