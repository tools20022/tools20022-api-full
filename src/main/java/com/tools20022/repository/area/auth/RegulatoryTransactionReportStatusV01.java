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
import com.tools20022.repository.msg.ReportStatusAndReason1;
import com.tools20022.repository.msg.TradeTransactionStatusAndReason1;
import com.tools20022.repository.msgset.TransactionRegulatoryReportingISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * <b>Scope</b><br>
 * A regulator or an intermediary sends the RegulatoryTransactionReportStatus to
 * a reporting institution to provide the status of a
 * RegulatoryTransactionReport previously sent by the reporting institution.<br>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.010.001.01}</li>
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
 * xmlTag} = "RgltryTxRptStsV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportStatusV01#mmReportStatusOrIndividualTransactionStatusRule
 * RegulatoryTransactionReportStatusV01.
 * mmReportStatusOrIndividualTransactionStatusRule}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportStatusV01#mmIdentification
 * RegulatoryTransactionReportStatusV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportStatusV01#mmReportingInstitution
 * RegulatoryTransactionReportStatusV01.mmReportingInstitution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportStatusV01#mmReportStatus
 * RegulatoryTransactionReportStatusV01.mmReportStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportStatusV01#mmIndividualTransactionStatus
 * RegulatoryTransactionReportStatusV01.mmIndividualTransactionStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RegulatoryTransactionReportStatusV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nA regulator or an intermediary sends the RegulatoryTransactionReportStatus to a reporting institution to provide the status of a RegulatoryTransactionReport previously sent by the reporting institution.\r\nUsage\r\nThe message definition may be used to provide a status for the entire report or to provide a status at the level of individual transactions within the report. One of the following statuses can be reported:\r\n- Completed, or,\r\n- Pending, or,\r\n- Rejected.\r\nIf the status is rejected, then reason for the rejection must be specified."
 * </li>
 * </ul>
 */
public class RegulatoryTransactionReportStatusV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either ReportStatus or IndividualTransactionStatus must be present, but
	 * not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportStatusV01#mmReportStatus
	 * RegulatoryTransactionReportStatusV01.mmReportStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportStatusV01#mmIndividualTransactionStatus
	 * RegulatoryTransactionReportStatusV01.mmIndividualTransactionStatus}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.auth.RegulatoryTransactionReportStatusV01
	 * RegulatoryTransactionReportStatusV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportStatusOrIndividualTransactionStatusRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either ReportStatus or IndividualTransactionStatus must be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor mmReportStatusOrIndividualTransactionStatusRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportStatusOrIndividualTransactionStatusRule";
			definition = "Either ReportStatus or IndividualTransactionStatus must be present, but not both.";
			messageDefinition_lazy = () -> RegulatoryTransactionReportStatusV01.mmObject();
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(RegulatoryTransactionReportStatusV01.mmReportStatus, RegulatoryTransactionReportStatusV01.mmIndividualTransactionStatus);
		}
	};
	protected DocumentIdentification8 identification;
	/**
	 * Identification of the RegulatoryTransactionReportStatus document.
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
	 * "Identification of the RegulatoryTransactionReportStatus document."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification of the RegulatoryTransactionReportStatus document.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}
	};
	protected PartyIdentification23Choice reportingInstitution;
	/**
	 * Identification of the firm that is legally responsible for sending the
	 * transaction report.
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
	 * definition} =
	 * "Identification of the firm that is legally responsible for sending the transaction report."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportingInstitution = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptgInstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingInstitution";
			definition = "Identification of the firm that is legally responsible for sending the transaction report.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification23Choice.mmObject();
		}
	};
	protected ReportStatusAndReason1 reportStatus;
	/**
	 * Provides the status of the entire RegulatoryTransactionReport that was
	 * previously sent by the reporting institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReportStatusAndReason1
	 * ReportStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the entire RegulatoryTransactionReport that was previously sent by the reporting institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportStatus";
			definition = "Provides the status of the entire RegulatoryTransactionReport that was previously sent by the reporting institution.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportStatusAndReason1.mmObject();
		}
	};
	protected List<TradeTransactionStatusAndReason1> individualTransactionStatus;
	/**
	 * Provides the status of one or more transactions that were previously sent
	 * within a RegulatoryTransactionReport by the reporting institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradeTransactionStatusAndReason1
	 * TradeTransactionStatusAndReason1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvTxSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualTransactionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of one or more transactions that were previously sent within a RegulatoryTransactionReport by the reporting institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIndividualTransactionStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "IndvTxSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualTransactionStatus";
			definition = "Provides the status of one or more transactions that were previously sent within a RegulatoryTransactionReport by the reporting institution.";
			minOccurs = 1;
			complexType_lazy = () -> TradeTransactionStatusAndReason1.mmObject();
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RegulatoryTransactionReportStatusV01";
				definition = "Scope\r\nA regulator or an intermediary sends the RegulatoryTransactionReportStatus to a reporting institution to provide the status of a RegulatoryTransactionReport previously sent by the reporting institution.\r\nUsage\r\nThe message definition may be used to provide a status for the entire report or to provide a status at the level of individual transactions within the report. One of the following statuses can be reported:\r\n- Completed, or,\r\n- Pending, or,\r\n- Rejected.\r\nIf the status is rejected, then reason for the rejection must be specified.";
				messageSet_lazy = () -> Arrays.asList(TransactionRegulatoryReportingISOArchive.mmObject());
				xors_lazy = () -> Arrays.asList(RegulatoryTransactionReportStatusV01.mmReportStatusOrIndividualTransactionStatusRule);
				rootElement = "Document";
				xmlTag = "RgltryTxRptStsV01";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(RegulatoryTransactionReportStatusV01.mmIdentification, RegulatoryTransactionReportStatusV01.mmReportingInstitution, RegulatoryTransactionReportStatusV01.mmReportStatus,
						RegulatoryTransactionReportStatusV01.mmIndividualTransactionStatus);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "010";
						version = "01";
						flavour = "001";
					}
				};
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public void setIdentification(DocumentIdentification8 identification) {
		this.identification = identification;
	}

	public PartyIdentification23Choice getReportingInstitution() {
		return reportingInstitution;
	}

	public void setReportingInstitution(PartyIdentification23Choice reportingInstitution) {
		this.reportingInstitution = reportingInstitution;
	}

	public ReportStatusAndReason1 getReportStatus() {
		return reportStatus;
	}

	public void setReportStatus(ReportStatusAndReason1 reportStatus) {
		this.reportStatus = reportStatus;
	}

	public List<TradeTransactionStatusAndReason1> getIndividualTransactionStatus() {
		return individualTransactionStatus;
	}

	public void setIndividualTransactionStatus(List<TradeTransactionStatusAndReason1> individualTransactionStatus) {
		this.individualTransactionStatus = individualTransactionStatus;
	}
}